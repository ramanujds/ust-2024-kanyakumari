import { Component, OnInit } from '@angular/core';
import { Todo } from '../model/Todo';
import { ActivatedRoute, RouterModule } from '@angular/router';

@Component({
  selector: 'app-todo-details',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './todo-details.component.html',
  styleUrl: './todo-details.component.css'
})
export class TodoDetailsComponent implements OnInit {

  todo?:Todo;
  id=0;

  constructor(private activatedRoute:ActivatedRoute){}

  ngOnInit(): void {
      
    this.activatedRoute.params.subscribe(
      param => {
        this.id = param['id']
      }
    )

  }



}
