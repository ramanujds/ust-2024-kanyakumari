import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-play',
  standalone: true,
  imports: [],
  templateUrl: './play.component.html',
  styleUrl: './play.component.css'
})
export class PlayComponent {

  @Input('game')
  game:string='';

  @Input('available')
  available?:boolean;

  show(){
    alert("Let's Play "+this.game)
  }

}
