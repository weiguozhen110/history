import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HtmlRoutingModule } from './html-routing.module';
import { HtmlComponent } from './html.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { JavascriptComponent } from './javascript/javascript.component';

@NgModule({
  declarations: [HtmlComponent, RegisterComponent, HomeComponent, JavascriptComponent],
  imports: [
    CommonModule,
    HtmlRoutingModule
  ]
})
export class HtmlModule { }
