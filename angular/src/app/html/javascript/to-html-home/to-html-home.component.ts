import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-to-html-home',
  templateUrl: './to-html-home.component.html',
  styleUrls: ['./to-html-home.component.scss']
})
export class ToHtmlHomeComponent implements OnInit {

  constructor() {
  }

  ngOnInit() {
    //获取倒计时秒数
    let time: any = document.getElementById('time');
    let second = 10;

    function showTime() {
      second--;
      if (second <= 0) {
        //时间到了，跳转首页
        location.href = '/home/html';
      }
        time.innerHTML = second;
    }

    setInterval(showTime, 1000);
  }

}
