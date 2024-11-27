import { Injectable } from '@angular/core';
import { ErrorResponse } from './model/ErrorResponse';

@Injectable({
  providedIn: 'root'
})
export class ErrorHandlerService {

  errorResponse : ErrorResponse = {
    status:404,
    message: "Oops! The page you're looking for is not here.",
    timestamp:new Date()
  };

  constructor() { }
}
