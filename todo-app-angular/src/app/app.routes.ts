import { Routes } from '@angular/router';
import { AddTodosComponent } from './add-todos/add-todos.component';
import { ViewTodosComponent } from './view-todos/view-todos.component';
import { AddTodosReactiveComponent } from './add-todos-reactive/add-todos-reactive.component';
import { TodoDetailsComponent } from './todo-details/todo-details.component';

export const routes: Routes = [
    {path:'add', component:AddTodosReactiveComponent},
    {path:'view-all',component:ViewTodosComponent},
    {path:'view/:id', component:TodoDetailsComponent}

];
