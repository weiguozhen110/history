import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-html',
  templateUrl: './html.component.html',
})
export class HtmlComponent implements OnInit {

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
