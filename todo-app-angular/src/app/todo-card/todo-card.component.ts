import { Component, Input } from '@angular/core';
import { Todo } from '../model/Todo';

@Component({
  selector: 'app-todo-card',
  standalone: true,
  imports: [],
  templateUrl: './todo-card.component.html',
  styleUrl: './todo-card.component.css'
})
export class TodoCardComponent {


  @Input('todo')
  todo?:Todo;

}
