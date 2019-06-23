import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    let that = this;
      document.getElementById("form").onsubmit = function(){
        return that.checkUsername() && that.checkPassword();
      };

      document.getElementById("username").onblur = that.checkUsername;
      document.getElementById("password").onblur = that.checkPassword;

  }

  checkUsername(){
    let name:any = document.getElementById("username");
    let reg_username = /^\w{6,12}$/;
    let flag = reg_username.test(name.value);
    let s_username = document.getElementById("s_username");
    if(flag){
      s_username.innerHTML = "<img height='25' width='35' src='assets/register/gou.png'>"
    }else{
      s_username.innerHTML = "用户名格式有误";
    }
    return flag;
  }

   checkPassword(){
    let password:any = document.getElementById("password");
    let reg_password = /^\w{6,12}$/;
    let flag = reg_password.test(password.value);
    let s_password = document.getElementById("s_password");
    if(flag){
      s_password.innerHTML = "<img height='25' width='35' src='assets/register/gou.png'>"
    }else{
      s_password.innerHTML = "密码格式有误";
    }
    return flag;
  }

}
