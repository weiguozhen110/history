import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {HtmlRoutingModule} from './html-routing.module';
import {HomeComponent} from './home/home.component';

@NgModule({
  declarations: [HomeComponent],
  imports: [
    CommonModule,
    HtmlRoutingModule
  ],
})
export class HtmlModule {
}
