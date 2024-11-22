import { Component, Input, OnInit } from '@angular/core';
import { Todo } from '../model/Todo';
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-update-todo',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './update-todo.component.html',
  styleUrl: './update-todo.component.css'
})


export class UpdateTodoComponent implements OnInit {

  @Input('todo')
  todo?:Todo

  constructor(private formBuilder:FormBuilder) { }

  toUpdateForm:FormGroup|any;

  ngOnInit(): void {
      this.toUpdateForm = this.formBuilder.group({
        id:[this.todo?.id],
        title:[this.todo?.title],
        status:[this.todo?.status]
      })
  }
  


}
