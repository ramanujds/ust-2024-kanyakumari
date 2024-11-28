import { Component, OnInit } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { UserCredentials } from '../model/UserCredentials';
import { CommonModule } from '@angular/common';
import { Router, RouterModule } from '@angular/router';
import { AuthApiService } from '../auth-api.service';

@Component({
  selector: 'app-login-page',
  standalone: true,
  imports: [FormsModule,CommonModule, RouterModule],
  templateUrl: './login-page.component.html',
  styleUrl: './login-page.component.css'
})
export class LoginPageComponent implements OnInit {

  ngOnInit(): void {
      this.logout()
  }

  constructor(private authApiService:AuthApiService, private router:Router){}

  logout(){
    sessionStorage.removeItem('ust.auth')
  }

  login(userCredentials:UserCredentials){
        this.authApiService.authenticate(userCredentials)
          .subscribe(
            response => {
              sessionStorage.setItem('ust.auth',response.jwt)
              this.router.navigate(['/user'])
            }
          )
  }

}
