import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'angular';

  aside() {
    const asideDom: any = document.getElementById('aside');
    const val =  asideDom.style.transform.substring(10).split(',')[0];
    if (val === '0px') {
      asideDom.style.transform = 'translate(100%,0)';
    } else {
      asideDom.style.transform = 'translate(0,0)';
    }
  }


}
