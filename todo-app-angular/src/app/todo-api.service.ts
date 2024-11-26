import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Todo } from './model/Todo';
import { Observable,catchError, throwError } from 'rxjs';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class TodoApiService {

  baseUrl = "http://localhost:8080/api/v1/todos";

  constructor(private todoClient:HttpClient,private router:Router) { }

  createTodo(todo:Todo):Observable<Todo>{
    return this.todoClient.post<Todo>(this.baseUrl,todo)
  }

  fetchTodos():Observable<Array<Todo>>{
    return this.todoClient.get<Array<Todo>>(this.baseUrl)
    .pipe(
      catchError(
        err => {
          console.error(err)
          this.router.navigate(['/error'])
          return throwError(()=>err)
        }
      )
    )
  }

}


