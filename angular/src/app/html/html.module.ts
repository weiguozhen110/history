import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HtmlRoutingModule } from './html-routing.module';
import { HtmlComponent } from './html.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { JavascriptComponent } from './javascript/javascript.component';
import {FormsModule} from '@angular/forms';
import { RotaryMapComponent } from './javascript/rotary-map/rotary-map.component';
import { ToHtmlHomeComponent } from './javascript/to-html-home/to-html-home.component';
import { DynamicTableComponent } from './dynamic-table/dynamic-table.component';
import { CssComponent } from './css/css.component';

@NgModule({
  declarations: [HtmlComponent, RegisterComponent, HomeComponent, JavascriptComponent, RotaryMapComponent, ToHtmlHomeComponent, DynamicTableComponent, CssComponent],
  imports: [
    CommonModule,
    HtmlRoutingModule,
    FormsModule
  ]
})
export class HtmlModule { }
