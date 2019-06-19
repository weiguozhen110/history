import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {RegisterComponent} from './register/register.component';
import {HtmlComponent} from './html.component';
import {HomeComponent} from './home/home.component';

const routes: Routes = [
  {path: '', component: HtmlComponent},
  {path: 'home', component: HomeComponent},
  {path: 'register', component: RegisterComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HtmlRoutingModule { }
