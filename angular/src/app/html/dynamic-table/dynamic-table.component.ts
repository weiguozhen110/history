import {Component, ElementRef, OnInit} from '@angular/core';

@Component({
  selector: 'app-dynamic-table',
  templateUrl: './dynamic-table.component.html',
  styleUrls: ['./dynamic-table.component.scss']
})
export class DynamicTableComponent implements OnInit {

  constructor(public el: ElementRef) { }

  ngOnInit() {
    //1.获取btn
    let btn_add = document.getElementById("btn_add");
    //2.绑定单击事件
    btn_add.onclick = function(){
      //获取每一个输入框内容
      let id:any  = document.getElementById("id");
      id = id.value;
      let name:any = document.getElementById("name");
      name = name.value;
      let gender:any = document.getElementById("gender");
      gender = gender.value;

      //获取表格
      let table = document.getElementById("table");

      //创建tr
      let tr = document.createElement("tr");
      //创建td
      let td_id = document.createElement("td");
      let text_id = document.createTextNode(id);
      td_id.appendChild(text_id);
      tr.appendChild(td_id);

      let td_name = document.createElement("td");
      let text_name = document.createTextNode(name);
      td_name.appendChild(text_name);
      tr.appendChild(td_name);

      let td_gender = document.createElement("td");
      let text_gender = document.createTextNode(gender);
      td_gender.appendChild(text_gender);
      tr.appendChild(td_gender);

      let td_option = document.createElement("td");

      let a = document.createElement("a");
      a.setAttribute("href","javascript:void(0);");
      a.onclick = function(){
        let table = document.getElementById("table");
        table.removeChild(tr);
      };
      let text_a = document.createTextNode("删除");
      a.appendChild(text_a);
      td_option.appendChild(a);
      tr.appendChild(td_option);

      table.appendChild(tr);
    };

    // onload 一张页面或一幅图像完成加载
    window.onload  = function(){
      document.getElementById("selectAll").onclick = function(){
        let cbs:any = document.getElementsByName("cb");
        for (let i = 0; i < cbs.length; i++) {
          cbs[i].checked = true;
        }

      };

      document.getElementById("unSelectAll").onclick = function(){
        let cbs:any = document.getElementsByName("cb");
        for (let i = 0; i < cbs.length; i++) {
          cbs[i].checked = false;
        }
      };

      document.getElementById("selectRev").onclick = function(){
        let cbs:any = document.getElementsByName("cb");
        for (let i = 0; i < cbs.length; i++) {
          cbs[i].checked = !cbs[i].checked
        }
      };

      document.getElementById("firstcb").onclick = function(){
        let cbs:any = document.getElementsByName("cb");
        let firstcb:any = document.getElementById("firstcb");
        for (let i = 0; i < cbs.length; i++) {
          cbs[i].checked = firstcb.checked;
        }

      };

      let trs:any = document.getElementsByTagName("tr");
      for (let i = 0; i < trs.length; i++) {
        trs[i].onmouseover = function(){
          this.className = "over"
        };

        trs[i].onmouseout = function(){
          this.className = "out"
        }
      }

    }
  }

  getSid(){
    let table = document.getElementById("table");
    return table.childNodes.length - 1;
  }

  del(obj:any){
    let table = document.getElementById("table");
    let tr = obj.target.parentNode.parentNode;
    table.removeChild(tr);
  }

}
