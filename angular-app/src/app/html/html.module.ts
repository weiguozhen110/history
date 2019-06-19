import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {HtmlRoutingModule} from './html-routing.module';
import {HomeComponent} from './home/home.component';
import { CssComponent } from './css/css.component';
import {HtmlComponent} from './html.component';
import {RegisterComponent} from './register/register.component';

@NgModule({
  declarations: [HtmlComponent, HomeComponent, CssComponent, RegisterComponent],
  imports: [
    CommonModule,
    HtmlRoutingModule
  ],
})
export class HtmlModule {
}
