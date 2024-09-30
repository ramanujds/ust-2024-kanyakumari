import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PlayComponent } from "./play/play.component";

import { Game, Status } from './model/Game';
import { CommonModule, NgForOf } from '@angular/common';
import { AddTaskComponent } from "./add-task/add-task.component";


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, PlayComponent, AddTaskComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})



export class AppComponent implements OnInit {

  ngOnInit(): void {
    setTimeout(() => this.addGame(), 10000);
  }

  Status=Status;
  title = 'hello-ust';

  games:Array<Game>=[
    {
      name:'Cricket',
      totalPlayers:11,
      status:Status.Available
    },
    {
      name:'Football',
      totalPlayers:11,
      status:Status.Available
    },
    {
      name:'Basketball',
      totalPlayers:5,
      status:Status.Available
    },
    {
      name:'Volleyball',
      totalPlayers:6,
      status:Status.Available
    },
    {
      name:'Tennis',
      totalPlayers:2,
      status:Status.Available
    }
  ]

  addGame(){
    this.games.push({
      name:'New Game',
      totalPlayers:0,
      status:Status.Available
    });
  }

}
