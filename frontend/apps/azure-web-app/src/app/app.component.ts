import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'frontend-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent implements OnInit{
  tasks:any ;
  constructor(private http:HttpClient) {
  }

  ngOnInit() {
    this.http.get('/api/tasks').subscribe(x=>{
      this.tasks = x
    })
  }
}
