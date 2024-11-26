import { Component } from '@angular/core';
import { ErrorHandlerService } from '../error-handler.service';

@Component({
  selector: 'app-error-page',
  standalone: true,
  imports: [],
  templateUrl: './error-page.component.html',
  styleUrl: './error-page.component.css'
})
export class ErrorPageComponent {

  constructor(public errorHandler:ErrorHandlerService){}

}
