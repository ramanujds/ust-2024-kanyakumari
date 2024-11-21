import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { TodoDataService } from '../todo-data.service';
import { TodoApiService } from '../todo-api.service';

@Component({
  selector: 'app-add-todos-reactive',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './add-todos-reactive.component.html',
  styleUrl: './add-todos-reactive.component.css'
})
export class AddTodosReactiveComponent implements OnInit {

  constructor(private formBuilder:FormBuilder, private todoApiService:TodoApiService, 
    private todoDataService:TodoDataService) { }

  todoForm:FormGroup|any;

  ngOnInit(): void {
   this.todoForm = this.formBuilder.group({
      title:['',[Validators.required,Validators.pattern('[a-zA-Z0-9 ]{3,20}')]],
      status:['',Validators.required],
      // subTasks:this.formBuilder.group(
      //   {
      //     name:[''],
      //     description:['']
      //   }
      // )
    }
    )
      
  }

  addTodos(todo:any){
    this.todoApiService.createTodo(todo)
        .subscribe(
          response => {
            console.log(response)
            this.todoDataService.fetchTodos()
          },
          error => console.error(error)
          )  
  
  }



}
