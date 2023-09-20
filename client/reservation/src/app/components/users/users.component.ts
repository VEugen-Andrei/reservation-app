import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { UserService } from 'src/app/services/user.service';

import { User } from 'src/app/types/user';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  users!: User[];

  // cache

  constructor(private userService: UserService) {}
  
  ngOnInit(): void {
    this.userService.getUsers().subscribe((data) => this.users = data.users);
  }
}
