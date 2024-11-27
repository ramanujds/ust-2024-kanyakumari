import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { UserCredentials } from './model/UserCredentials';
import { Observable } from 'rxjs';
import { JwtToken } from './model/JwtToken';
import { ApiResponseMessage } from './model/ApiResponseMessage';

@Injectable({
  providedIn: 'root'
})
export class AuthApiService {

  constructor(private authClient:HttpClient) {}

  baseUrl = "http://localhost:8000/api"
  
  authenticate(userCredentials:UserCredentials):Observable<JwtToken>{
    return this.authClient.post<JwtToken>(this.baseUrl+"/public/login",userCredentials)
  }

  acccessApi():Observable<ApiResponseMessage>{
    return this.authClient.get<ApiResponseMessage>(this.baseUrl+"/admin")
  }
  


}
