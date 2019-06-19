import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'angular-app';

  constructor() {

  }


  ngOnInit() {
  }

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
