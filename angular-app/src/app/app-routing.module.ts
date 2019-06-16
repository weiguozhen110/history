import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';

const routes: Routes = [
  {
    path: 'html', loadChildren: './html/html.module#HtmlModule'
  },
  {
    path: '**', redirectTo: 'html'
  }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule {
}
