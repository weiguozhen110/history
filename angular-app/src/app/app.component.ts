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

  showAside() {
    const asideDom: any = document.getElementById('aside');
    asideDom.style.transform = 'translate(0,0)';
  }

  hideAside() {
    const asideDom: any = document.getElementById('aside');
    asideDom.style.transform = 'translate(100%,0)';

  }
}
