import { Component, OnInit } from '@angular/core';
import { AuthApiService } from '../auth-api.service';
import { CommonModule } from '@angular/common';
import { Router, RouterModule } from '@angular/router';

@Component({
  selector: 'app-user-page',
  standalone: true,
  imports: [CommonModule,RouterModule],
  templateUrl: './user-page.component.html',
  styleUrl: './user-page.component.css'
})
export class UserPageComponent implements OnInit {

  message?:string;

  constructor(private authApiService:AuthApiService, private router:Router){}

  ngOnInit(): void {
      this.authApiService.acccessApi()
        .subscribe(
          response => this.message=response.message,
          error => this.router.navigate(['/login'])
        )
  }



}
