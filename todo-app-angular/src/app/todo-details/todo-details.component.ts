import { Component, OnInit } from '@angular/core';
import { Todo } from '../model/Todo';
import { ActivatedRoute, RouterModule } from '@angular/router';
import { TodoApiService } from '../todo-api.service';

@Component({
  selector: 'app-todo-details',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './todo-details.component.html',
  styleUrl: './todo-details.component.css'
})
export class TodoDetailsComponent implements OnInit {

  todo?:Todo;

  constructor(private activatedRoute:ActivatedRoute, private todoClient:TodoApiService){}

  ngOnInit(): void {
      
    this.activatedRoute.params.subscribe(
      param => {
        const id = param['id']
        this.fetchTodoById(id)
      }
    )

    

  }


  fetchTodoById(id:number){
      this.todoClient.fetchTodoById(id)
          .subscribe(
            response=>this.todo=response
          )
  }

}
