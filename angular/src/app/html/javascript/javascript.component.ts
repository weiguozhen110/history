import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-javascript',
  templateUrl: './javascript.component.html',
  styleUrls: ['./javascript.component.scss']
})
export class JavascriptComponent implements OnInit {

  //方法
  test: any;

  constructor() {
  }

  ngOnInit() {
    //document
    document.body.title = '欢迎来到JavaScript世界';
    let title = document.body.title;
    console.log(title);

    /**Function 对象*/
    //方法创建方式一
    this.test = function test(num) {
      return num;
    };

    console.log(this.test(3));
    console.log(this.test1(4));

    //内置对象 arguments 封装所有的实际参数
    let total = this.add(1, 2, 3, 4);
    console.log(total);

    /**Array 对象*/
    let array = new Array(1, 2);
    console.log(array);
    console.log(array.join(','));

    /**Date 对象*/
    let date = new Date();
    console.log(date);
    console.log(date.toLocaleString());
    console.log(date.getTime());

    /**Date 对象*/
    let math = Math.PI;
    console.log(math);
    //随机数【0,1)
    math = Math.random();
    console.log(math);

    /**RegExp：正则表达式对象*/
    let reg = /\w{6,12}$/;
    let flag = reg.test('1234567890');
    console.log(flag);
    flag = reg.test('1234');
    console.log(flag);

    /**Global  对象*/
    let str = '学习学习';
    //url编码
    console.log(encodeURI(str));
    //url解码
    console.log(decodeURI(encodeURI(str)));
    //url编码,编码的字符更多
    console.log(encodeURIComponent(str));
    //url解码
    console.log(decodeURIComponent(encodeURIComponent(str)));
    //将字符串转为数字
    console.log(parseInt(str));
    console.log(parseInt('12'));
    console.log(parseInt('1trtr2'));
    // 判断一个值是否是NaN
    console.log(isNaN(4));
    //将 JavaScript 字符串，并把它作为脚本代码来执行
    //eval('alert("eval")');


  }

  // Windows 窗口对象
  confirm() {
    let flag = confirm('确认吗？');
    if (flag) {
      alert('你点击了确认');
    } else {
      alert('你点击了取消');
    }
  }

  //windows.open() 返回的对象
  win: any;

  open() {
    this.win = open('https://baidu.com');
  }

  close() {
    if (this.win) {
      this.win.close();
    }
  }

  //一次定时器
  timeout(){
    setTimeout('alert("你好")',3000);
  }

  //循环定时器
  interval;
  setInterval(){
    let i=0;
    this.interval = setInterval(function() {
      alert(i++);
    },1000);
  }

  cancelInterval(){
    if(this.interval){
      clearInterval(this.interval);
    }
  }



  //灯泡
  flag = false;

  light() {
    let light: any = document.getElementById('light');
    if (this.flag) {
      light.src = 'assets/light/off.gif';
      this.flag = false;
    } else {
      light.src = 'assets/light/on.gif';
      this.flag = true;
    }
    //console.log(light.src);
  }

  //多参数函数
  add(...arg: any) {
    let sum = 0;
    //可以使用 内置对象
    for (let i = 0; i < arguments.length; i++) {
      sum += i;
    }

    for (let i = 0; i < arg.length; i++) {
      sum += i;
    }
    //相当于 乘以2
    return sum;
  }

  //方法创建方式二
  test1(num) {
    return num;
  }


}
