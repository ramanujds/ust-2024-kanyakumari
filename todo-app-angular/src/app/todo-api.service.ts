import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Todo } from './model/Todo';
import { Observable,catchError, throwError } from 'rxjs';
import { Router } from '@angular/router';
import { ErrorHandlerService } from './error-handler.service';

@Injectable({
  providedIn: 'root'
})
export class TodoApiService {

  baseUrl = "http://localhost:8080/api/v1/todos";

  constructor(private todoClient:HttpClient,private router:Router,private errorHandler:ErrorHandlerService) { }

  createTodo(todo:Todo):Observable<Todo>{
    return this.todoClient.post<Todo>(this.baseUrl,todo)
  }

  fetchTodos():Observable<Array<Todo>>{
    return this.todoClient.get<Array<Todo>>(this.baseUrl)
    .pipe(
      catchError(
        err => {
          this.errorHandler.errorResponse={
            message:'Unable to Connect to the Server',
            status:503,
            timestamp:new Date()

          }
          this.router.navigate(['/error'])
          return throwError(()=>err)
        }
      )
    )
  }

  fetchTodoById(id:number):Observable<Todo>{
    return this.todoClient.get<Todo>(this.baseUrl+'/'+id)
    .pipe(
      catchError(
        err => {
          this.errorHandler.errorResponse=err.error
          this.router.navigate(['/error'])
          return throwError(()=>err)
        }
      )
    );
  }

}


