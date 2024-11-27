import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { UserCredentials } from '../model/UserCredentials';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { AuthApiService } from '../auth-api.service';

@Component({
  selector: 'app-login-page',
  standalone: true,
  imports: [FormsModule,CommonModule, RouterModule],
  templateUrl: './login-page.component.html',
  styleUrl: './login-page.component.css'
})
export class LoginPageComponent {

  constructor(private authApiService:AuthApiService){}

  login(userCredentials:UserCredentials){
        this.authApiService.authenticate(userCredentials)
          .subscribe(
            response => {
              sessionStorage.setItem('ust.auth',response.jwt)
              alert("Login Successful")
            }
          )
  }

}
