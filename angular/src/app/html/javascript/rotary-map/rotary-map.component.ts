import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-rotary-map',
  templateUrl: './rotary-map.component.html',
  styleUrls: ['./rotary-map.component.scss']
})
export class RotaryMapComponent implements OnInit {

  constructor() {
  }

  ngOnInit() {
    let number = 1;
    function changeImg() {
      number++;
      if (number > 3) {
        number = 1;
      }
      let dom: any = document.getElementById('banner');
      if(dom){
        dom.src = 'assets/rotary/banner_' + number + '.jpg';
      }
    }
    setInterval(changeImg, 3000);
  }

}
