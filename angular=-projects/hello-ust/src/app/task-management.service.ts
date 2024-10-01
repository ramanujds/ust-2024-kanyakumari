import { Injectable } from '@angular/core';
import { Task } from './model/Task';

@Injectable({
  providedIn: 'root'
})
export class TaskManagementService {
  addTask(task: Task) {
    this.taskList.push(task);
  }

  taskList:Array<Task>=[{
    id: 1,
    name: 'Learn Java',
    description: 'Learn Java Description',
    dueDate: '2024-09-01',
    completed: true
  },
  {
    id: 2,
    name: 'Learn Angular',
    description: 'Learn Angular Description',
    dueDate: '2024-10-10',
    completed: false
  },
  {
    id: 3,
    name: 'Learn Python',
    description: 'Learn Python Description',
    dueDate: '2024-09-01',
    completed: false
  }];

  delteTask(id: number) {
    const index = this.taskList.findIndex(task => task.id == id);
    if(index !== -1){
      this.taskList.splice(index, 1);
    }
  }

  constructor() { }
}
