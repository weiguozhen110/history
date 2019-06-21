import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {JavascriptComponent} from './javascript/javascript.component';
import {RegisterComponent} from './register/register.component';
import {HomeComponent} from './home/home.component';
import {HtmlComponent} from './html.component';

const routes: Routes = [
  {path: '', component: HtmlComponent},
  {path: 'home', component: HomeComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'javascript', component: JavascriptComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HtmlRoutingModule { }
