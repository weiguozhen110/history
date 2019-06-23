##html  
  1. 概念：是最基础的网页开发语言
      * Hyper Text Markup Language 超文本标记语言
      * 超文本:
      * 超文本是用超链接的方法，将各种不同空间的文字信息组织在一起的网状文本.
      * 标记语言:
      * 由标签构成的语言。<标签名称> 如 html，xml
      * 标记语言不是编程语言
      
   2. 标签学习   
    1. 文件标签：构成html最基本的标签
      *<!DOCTYPE>:       定义文档类型。
			* <!DOCTYPE html>：html5中定义该文档是html文档
			* html:            html文档的根标签
			* head：           头标签。用于指定html文档的一些属性。引入外部的资源
			* title：          标题标签。
			* body：           体标签
			
		2. 文本标签：和文本有关的标签
			* 注释：       <!-- 注释内容 -->
			* <h1>to<h6>：标题标签
			* h1~h6:      字体大小逐渐递减
			* <p>：       段落标签
			* <br>：      换行标签
			* <hr>：      展示一条水平线
			* 属性：
				* color： 颜色
				* width： 宽度
				* size：  高度
				* align： 对其方式
				  * center：居中
				  * left：  左对齐
				  * right： 右对齐
			* <b>：字体加粗
			* <i>：字体斜体
			* <font>:字体标签
			* <center>:文本居中
      * 属性：
        * color：颜色
        * size： 大小 
        * face： 字体

			* 属性定义：
				* color：
					1. 英文单词：           red,green,blue
					2. rgb(值1，值2，值3)： 值的范围：0~255  如  rgb(0,0,255) 不推荐
					3. #值1值2值3：值的范围：00~FF之间。      如： #FF00FF     推荐使用
				* width：
					1. 数值： width='20' ,数值的单位，默认是 px(像素)
					2. 数值%：占比相对于父元素的比例
					
			特殊字符表
			  * http://tool.oschina.net/commons?type=2
			  * 常用
			    字符	 十进制	  转义字符
			    "	   &#34;	  &quot;
          &  	 &#38;	  &amp;
          <	   &#60;	  &lt;
          >	   &#62;	  &gt;
          空格	 &#160;	  &nbsp;
          ©	   &#169;	  &copy;
          
		3. 图片标签：
			* img：展示图片
				* 属性：
					* src：指定图片的位置

			* 代码：
				 <!--展示一张图片 img-->

			    <img src="image/image.jpg" align="right" alt="测试" width="500" height="500"/>
			
          相对路径
              * 以.开头的路径
              * ./：代表当前目录  ./image/1.jpg src="image/image.jpg" 默认是 ./:
              * ../:代表上一级目录
  
		4. 列表标签：
			* 有序列表：
				* ol: 
				* li: 列表的每个项
			* 无序列表：
				* ul:
				* li: 列表的每个项
				
		5. 链接标签：
			* a:定义一个超链接
				* 属性：
					* href：指定访问资源的URL(统一资源定位符)
					* target：指定打开资源的方式
						* _self:默认值，在当前页面打开
						* _blank：在空白页面打开

			* 代码：
				 <!--超链接  a-->
			     <a href="http://www.baidu.com">点我</a>
            <br>
            <a href="http://www.baidu.com" target="_self">本页面打开</a>
            <br>
            <a href="http://www.baidu.com" target="_blank">新标签页打开</a>
            <br>
            <a href="./html5.html">列表标签</a><br>
            <br>
            <a href="mailto:weiguozhen@outlook.com">联系我</a>
            <br>
            <a href="http://www.baidu.com"><img src="image/image.jpg"></a>
			    
		6. div和span：
			* div:  每一个div占满一整行。块级标签
      * span：文本信息在一行展示，行内标签 内联标签

		7. 语义化标签：html5中为了提高程序的可读性，提供了一些标签。
			1. <header>：页眉
			2. <footer>：页脚

		8. 表格标签：
			* table：定义表格
				* width：      宽度
				* border：     边框
				* cellpadding：定义内容和单元格的距离
				* cellspacing：定义单元格之间的距离。如果指定为0，则单元格的线会合为一条、
				* bgcolor：    背景色
				* align：      对齐方式
				
			* tr：定义行
				* bgcolor：    背景色
				* align：      对齐方式
				
			* td：定义单元格
				* colspan：    合并列
				* rowspan：    合并行
				
			* th：定义表头单元格
			  * <caption>：  表格标题
			  * <thead>：    表示表格的头部分
			  * <tbody>：    表示表格的体部分
			  * <tfoot>：    表示表格的脚部分


* HTML标签：表单标签
	* 表单：
		* 概念： 用于采集用户输入的数据的。用于和服务器进行交互。
		* form：用于定义表单的。可以定义一个范围，范围代表采集用户数据的范围
            * 属性：
                * action：指定提交数据的URL
                * method:指定提交方式
                    * 分类：一共7种，2种比较常用
                       * get：
                            1. 请求参数会在地址栏中显示。会封装到请求行中(HTTP协议后讲解)。
                            2. 请求参数大小是有限制的。
                            3. 不太安全。
                       * post：
                            2. 请求参数不会再地址栏中显示。会封装在请求体中(HTTP协议后讲解)
                            2. 请求参数的大小没有限制。
                            3. 较为安全。
            
                       *表单项中的数据要想被提交：必须指定其name属性
		
表单项标签：
			* input：可以通过type属性值，改变元素展示的样式
				* type 属性：
					* text：       文本输入框，默认值
					* placeholder：指定输入框的提示信息，当输入框的内容发生变化，会自动清空提示信息	
					* password：   密码输入框
					* radio:       单选框
						* 注意：
							1. 要想让多个单选框实现单选的效果，则多个单选框的name属性值必须一样。
							2. 一般会给每一个单选框提供value属性，指定其被选中后提交的值
							3. checked属性，可以指定默认值
					* checkbox：复选框
						* 注意：
							1. 一般会给每一个单选框提供value属性，指定其被选中后提交的值
							2. checked属性，可以指定默认值
			* file：文件选择框
			* hidden：隐藏域，用于提交一些信息。
			* 按钮：
					* submit：提交按钮。可以提交表单
					* button：普通按钮
					* image： 图片提交按钮, src 属性指定图片的路径	
			    * label：指定输入项的文字描述信息
					   * label的for属性一般会和 input 的 id属性值 对应。如果对应了，则点击label区域，会让input输入框获取焦点。
			* select: 下拉列表
				* 子元素：option，指定列表项
			* textarea：文本域
				* cols：指定列数，每一行有多少个字符
				* rows：默认多少行。		

CSS：页面美化和布局控制
	1. 概念： Cascading Style Sheets 层叠样式表
	层叠：多个样式可以作用在同一个html的元素上，同时生效
	2. 好处：
		1. 功能强大
		2. 将内容展示和样式控制分离
			* 降低耦合度。解耦
			* 让分工协作更容易
			* 提高开发效率
	3. CSS的使用：CSS与html结合方式
		1. 内联样式
			 * 在标签内使用style属性指定css代码
			 * 如：<div style="color:red;">hello css</div>
		2. 内部样式
			* 在head标签内，定义style标签，style标签的标签体内容就是css代码
			* 如：
				<style>
			        div{
			            color:blue;
			        }
			    </style>
				<div>hello css</div>
		3. 外部样式
			1. 定义css资源文件。
    		2. 在head标签内，定义link标签，引入外部的资源文件
    		* 如：
	    		* a.css文件：
					div{
					    color:green;
					}
				<link rel="stylesheet" href="css/a.css">
				<div>hello css</div>
				<div>hello css</div>
		* 注意：
			* 1,2,3种方式 css作用范围越来越大
			* 1方式不常用，后期常用2,3
			* 3种格式可以写为：
				<style>
			        @import "css/a.css";
			  </style>
	4. css语法：
		* 格式：
			选择器 {
				属性名1:属性值1;
				属性名2:属性值2;
				...
			}
		* 选择器:筛选具有相似特征的元素
		* 注意：
			* 每一对属性需要使用；隔开，最后一对属性可以不加；
	5. 选择器：筛选具有相似特征的元素
		* 分类：
			1. 基础选择器
				1. id选择器：选择具体的id属性值的元素.建议在一个html页面中id值唯一
			        * 语法：#id属性值{}
			    2. 元素选择器：选择具有相同标签名称的元素
			        * 语法： 标签名称{}
			        * 注意：id选择器优先级高于元素选择器
			    3. 类选择器：选择具有相同的class属性值的元素。
			        * 语法：.class属性值{}
			        * 注意：类选择器选择器优先级高于元素选择器
			2. 扩展选择器：
				1. 选择所有元素：
					* 语法： *{}
				2. 并集选择器：
					* 选择器1,选择器2{}
				3. 子选择器：筛选选择器1元素下的选择器2元素
					* 语法：  选择器1 选择器2{}
				4. 父选择器：筛选选择器2的父元素选择器1
					* 语法：  选择器1 > 选择器2{}
				5. 属性选择器：选择元素名称，属性名=属性值的元素
					* 语法：  元素名称[属性名="属性值"]{}
				6. 伪类选择器：选择一些元素具有的状态
					* 语法： 元素:状态{}
					* 如： <a>
						* 状态：
							* link：初始化的状态
							* visited：被访问过的状态
							* active：正在访问状态
							* hover：鼠标悬浮状态
	6. 属性
		1. 字体、文本
			* font-size：字体大小
			* color：文本颜色
			* text-align：对其方式
			* line-height：行高 
		2. 背景
			* background：
		3. 边框
			* border：设置边框，符合属性
		4. 尺寸
			* width：宽度
			* height：高度
		5. 盒子模型：控制布局
			* margin： 外边距
			* padding：内边距
				* 默认情况下内边距会影响整个盒子的大小
				* box-sizing: border-box;  设置盒子的属性，让width和height就是最终盒子的大小
			* float：浮动
				* left
				* right
