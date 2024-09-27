import { Component, Input, OnInit } from '@angular/core';
import { Game } from '../model/Game';

@Component({
  selector: 'app-play',
  standalone: true,
  imports: [],
  templateUrl: './play.component.html',
  styleUrl: './play.component.css'
})
export class PlayComponent {

  @Input('game')
  game?:Game;

  show(){
    alert("Let's Play "+this.game?.name)
  }

}
