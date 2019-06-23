import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {JavascriptComponent} from './javascript/javascript.component';
import {RegisterComponent} from './register/register.component';
import {HomeComponent} from './home/home.component';
import {HtmlComponent} from './html.component';
import {RotaryMapComponent} from './javascript/rotary-map/rotary-map.component';
import {DynamicTableComponent} from './dynamic-table/dynamic-table.component';

const routes: Routes = [
  {path: '', component: HtmlComponent},
  {path: 'home', component: HomeComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'javascript', component: JavascriptComponent},
  {path: 'javascript/rotary', component: RotaryMapComponent},
  {path: 'dynamic', component: DynamicTableComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HtmlRoutingModule { }
