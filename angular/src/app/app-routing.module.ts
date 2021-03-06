import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';

const routes: Routes = [
  {path: 'html', loadChildren: './html/html.module#HtmlModule'},
  {path: 'bootstrap', loadChildren: './bootstrap/bootstrap.module#BootstrapModule'},
  {path: '**', redirectTo: 'html'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
