import { Routes } from '@angular/router';
import { AddTodosComponent } from './add-todos/add-todos.component';
import { ViewTodosComponent } from './view-todos/view-todos.component';
import { AddTodosReactiveComponent } from './add-todos-reactive/add-todos-reactive.component';
import { TodoDetailsComponent } from './todo-details/todo-details.component';
import { myRouteGuard } from './my-route.guard';
import { ErrorPageComponent } from './error-page/error-page.component';

export const routes: Routes = [
    {path:'add', component:AddTodosReactiveComponent,canActivate:[myRouteGuard]},
    {path:'view-all',component:ViewTodosComponent, children:[
        {path:':id', component:TodoDetailsComponent}]
    },
    {path:'error',component:ErrorPageComponent},
    {path:'**',redirectTo:'error'}
    

];
