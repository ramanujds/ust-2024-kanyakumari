import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Todo } from './model/Todo';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TodoApiService {

  baseUrl = "http://localhost:8080/api/v1/todos";

  constructor(private todoClient:HttpClient) { }

  createTodo(todo:Todo):Observable<Todo>{
    return this.todoClient.post<Todo>(this.baseUrl,todo)
  }

  fetchTodos():Observable<Array<Todo>>{
    return this.todoClient.get<Array<Todo>>(this.baseUrl);
  }

}
