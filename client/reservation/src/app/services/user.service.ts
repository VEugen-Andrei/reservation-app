import { Injectable } from '@angular/core';
import { User } from '../types/user';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { UserResponse } from '../types/userResponse';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private url: string = "http://localhost:9090/api/v1/users";
  users!: User[];

  // cache

  constructor(private http: HttpClient) {}
  
  getUsers(): Observable<UserResponse> {
    return this.http.get<UserResponse>(this.url);
    
  }

}
