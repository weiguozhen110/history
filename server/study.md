#学成在线项目学习
一、项目介绍
1.功能模块
1.1)门户      
    在首页、活动页、专题页等页面提供课程学习入口。
1.2)学习中心  
    学生登录学习中心在线学习课程。
1.3)社交系统      
    社交系统为老师和学生交流搭建沟通的平台，包括：问答系统、评论系统、论坛等，学生和老师通过问答系统提问问题、回答问题，通过评论系统对老师授课进行评论。
1.4)教学管理中心
    教师登录教学管理中心进行课程管理、资源管理、考试管理等教学活动。
1.5)系统管理中心
    系统管理员登录系统管理中心进行分类管理、运维管理等功能。

2.技术架构
    学成在线采用当前流行的前后端分离架构开发，由用户层、UI层、微服务层、数据层等部分组成，为PC、App、H5等客户端用户提供服务。
2.1)模块说明
2.1.1)用户层
    用户层描述了本系统所支持的用户类型包括：pc用户、app用户、h5用户。pc用户通过浏览器访问系统、app用户通过android、ios手机访问系统，H5用户通过h5页面访问系统。
2.1.2)CDN
    CDN全称Content Delivery Network，即内容分发网络，本系统所有静态资源全部通过CDN加速来提高访问速度。系统静态资源包括：html页面、js文件、css文件、image图片、pdf和ppt及doc教学文档、video视频等。
2.1.3)负载均衡
    系统的CDN层、UI层、服务层及数据层均设置了负载均衡服务，上图仅在UI层前边标注了负载均衡。 每一层的负载均衡会根据系统的需求来确定负载均衡器的类型，系统支持层负载均衡+7层负载均衡结合的方式，4层负载均衡是指在网络传输层进行流程转发，根据IP和端口进行转发，7层负载均衡完成HTTP协议负载均衡及反向代理的功能，根据url进行请求转发。
2.1.4)UI层
    UI层描述了系统向pc用户、app用户、h5用户提供的产品界面。根据系统功能模块特点确定了UI层包括如下产品界面类型： 
    1）面向pc用户的门户系统、学习中心系统、教学管理系统、系统管理中心。 
    2）面向h5用户的门户系统、学习中心系统。 
    3）面向app用户的门户系统、学习中心系统未在上图标注，在app项目中有详细说明。
2.1.5)微服务层
    微服务层将系统服务分类三类：前端服务、后端服务及系统服务。 前端服务：主要为学习用户提供学习服务。 后端服务：主要为管理用户提供教学管理服务。 系统服务：公共服务，为系统的所有微服务提供公共服务功能。 服务网关：提供服务路由、负载均衡、认证授权等服务。
2.1.6)数据层
    数据层描述了系统的数据存储的内容类型，持久化的业务数据使用MySQL和MongoDB保存，其中MongoDB中主要保存系统日志信息。 
    1)消息队列：存储系统服务间通信的消息，本身提供消息存取服务，与微服务层的系统服务连接。 
    2)索引库：存储课程信息的索引信息，本身提供索引维护及搜索的服务，与微服务层的系统服务连接。 
    3)缓存：作为系统的缓存服务，存储课程信息、分类信息、用户信息等，与微服务层的所有服务连接。
    4)文件存储：提供系统静态资源文件的分布式存储服务，文件存储服务器作为CDN服务器的数据来源，CDN上的静态资源将最终在文件存储服务器上保存多份。 
    5)流媒体服务：作为流媒体服务器，存储所有的流媒体文件。
2.1.7)外部系统接口
    1）微信、QQ、微博登录接口，本系统和微信、QQ、微博系统对接，用户输入微信、QQ、微博的账号和密码即可登录本系统。 
    2）微信、QQ、微博分享接口，本系统和微信、QQ、微博系统对接，可直接将本系统的课程资源信息分享到微信、QQ、微博。
    3）支付宝、微信、网银支付接口，本系统提供支付宝、微信、网银三种支付接口。
    4）短信接口，本系统与第三方平台对接短信发送接口。 
    5）邮件接口，本系统需要连接第三方的smpt邮件服务器对外发送电子邮件。 
    6）微信公众号，本系统与微信公众号平台接口，用户通过微信公众号访问H5页面。 
    7）点播、直播，前期视频点播与直播采用第三方服务方式，本系统与第三方点、直播服务对接，对外提供视频点播与直播服务。 
    8）OSS存储 ，前期静态资源文件的存储采用第三方服务方式，本系统与第三方提供的OSS存储服务对接，将系统的静态资源文件存储到第三方提供的OSS存储服务器上。 
    9）CDN，本系统与第三方CDN服务对接，使用CDN加速服务来提高本系统的访问速度。
2.1.8)DevOps
      DevOps（英文Development和Operations的组合）是一组过程、方法与系统的统称，用于促进开发（应用程序/软件工程）、技术运营和质量保障（QA）部门之间的沟通、协作与整合。
   本项目供了许多开发、运营、维护支撑的系统，包括： 
   1)Eureka服务治理中心：提供服务治理服务，包括：服务注册、服务获取等。 
   2)Spring Cloud Config服务配置管理中心：提供服务配置管理服务，包括：配置文件更新、配置文件下发等。
   3)Hystrix Dashboard服务熔断监控：监控熔断的请求响应时间、成功率等 。 
   4)Zipkin服务追踪监控：监控服务调用链路健康情况。 
   5)Jenkins持续集成服务：提供系统持续集成服务。 
   6)Git/GitLab代码管理服务: 提供git代码管理服务。 
   7)ELK日志分析服务: 提供elk日志分析服务，包括系统运行日志分析、告警服务。 
   8)Docker容器化部署服务：将本系统所有服务采用容器化部署方式。 
   9)Maven项目管理工具：提供管理项目所有的Java包依赖、项目工程打包服务。
   
2.2)学成在线服务端基于Spring Boot构建，采用Spring Cloud微服务框架。
    持久层：MySQL、MongoDB、Redis、ElasticSearch
    数据访问层：使用Spring Data JPA 、Mybatis、Spring Data Mongodb等
    业务层：Spring IOC、Aop事务控制、Spring Task任务调度、Feign、Ribbon、Spring AMQP、Spring Data Redis等。
    控制层：Spring MVC、FastJSON、RestTemplate、Spring Security Oauth2+JWT等
    微服务治理：Eureka、Zuul、Hystrix、Spring Cloud Config等 
    
3.开发步骤
3.1)需求分析
    梳理用户的需求，分析业务流程
3.2)接口定义
    根据需求分析定义接口
3.3)服务端和前端并行开发
    依据接口进行服务端接口开发。前端开发用户操作界面，并请求服务端接口完成业务处理。
3.4)前后端集成测试
    最终前端调用服务端接口完成业务。  
    
4.CMS页面管理需求
4.1)这些页面的管理流程是什么？
    1）创建站点：
    一个网站有很多子站点，比如：学成在线有主门户、学习中心、问答系统等子站点。具体的哪个页面是归属于具体
    的站点，所以要管理页面，先要管理页面所属的站点。
    2）创建模板：
    页面如何创建呢？比如电商网站的商品详情页面，每个页面的内容布局、板式是相同的，不同的只是内容，这个页面的布局、板式就是页面模板，
    模板+数据就组成一个完整的页面，最终要创建一个页面文件需要先定义此页面的模板，最终拿到页面的数据再结合模板就拼装成一个完整的页面。 
    3）创建页面：
    创建页面是指填写页面的基本信息，如：页面的名称、页面的url地址等。
    4）页面预览：
    页面预览是页面发布前的一项工作，页面预览使用静态化技术根据页面模板和数据生成页面内容，并通过浏览器预
    览页面。页面发布前进行页面预览的目是为了保证页面发布后的正确性。
    5）页面发布：
    使用计算机技术将页面发送到页面所在站点的服务器，页面发布成功就可以通过浏览器来访问了。
4.2)本项目要实现什么样的功能？
    1）页面管理
    管理员在后台添加、修改、删除页面信息
    2）页面预览
    管理员通过页面预览功能预览页面发布后的效果。
    3）页面发布
    管理员通过页面发布功能将页面发布到远程门户服务器。
    页面发布成功，用户即可在浏览器浏览到最新发布的页面，整个页面添加、发布的过程由于软件自动执行，无需人
    工登录服务器操作。     

二、准备工作
1.nginx http://nginx.org/en/download.html
1.1)配置虚拟主机
    在nginx中配置虚拟主机：
    server{
        listen 80;
        server_name www.xuecheng.com;
        ssi on;
        ssi_silent_errors on;
        location / {
            alias F:/teach/xcEdu/xcEduUI/xc‐ui‐pc‐static‐portal/;
            index index.html;
        }
    }
    F:/teach/xcEdu/xcEduUI/xc-ui-pc-static-portal/ 本目录即为门户的主目录
1.2)配置hosts文件
    hosts 追加 127.0.0.1 www.xuecheng.com
    
2.SSI服务端包含技术
    ssi包含类似于jsp页面中的incluce指令，ssi是在web服务端将include指定 的页面包含在网页中，渲染html网页响应给客户端 。nginx、apache等多数web容器都支持SSI指令。  
2.1)ssi指令
    <!‐‐#include virtual="/../....html"‐‐>
2.2)将首页拆分成
    index.html：首页主体内容
    include/header.html：头部区域
    include/index_banner.html：轮播图
    include/index_category.html：左侧列表导航
    include/footer.html：页尾
2.3)在nginx虚拟主机中开通SSI
    server{
        listen 80;
        server_name www.xuecheng.com;
        ssi on;
        ssi_silent_errors on;
        ......       
    注：ssi的配置参数如下： 
        ssi on： 开启ssi支持 
        ssi_silent_errors on：默认为off，设置为on则在处理SSI文件出错时不输出错误信息 
        ssi_types：默认为 ssi_types text/html，如果需要支持shtml（服务器执行脚本，类似于jsp）则需要设置为ssi_types text/shtml         

三、开发
1.工程结构
1.1)CMS及其它服务端工程基于maven进行构建，首先需要创建如下基础工程：
    parent工程：父工程，提供依赖管理。
    common工程：通用工程，提供各层封装
    model工程：模型工程，提供统一的模型类管理
    utils工程：工具类工程，提供本项目所使用的工具类
    Api工程：接口工程，统一管理本项目的服务接口。
    
1.2)代码导入问题
1.2.1)pring-boot-maven-plugin:1.5.6.RELEASE:repackage failed: Unable to find main class
    spring boot 插件去掉就好了 spring-boot-maven-plugin 先去掉
1.2.2)server.common spring-cloud-starter-feign 找不到版本
    先注释掉   
    
2.MongoDB https://www.mongodb.com
2.1)选择Mongodb
    1)Mongodb是非关系型数据库，存储Json格式数据 ,数据格式灵活。
    2)相比课程管理等核心数据CMS数据不重要，且没有事务管理要求。 
    
2.2)安装mongodb
    1)下载服务端 mongodb-org-server-4.2.0-1.el7.x86_64.rpm、mongodb-org-shell-4.2.0-1.el7.x86_64.rpm
      rpm -ivh mongodb-org-server-4.2.0-1.el7.x86_64.rpm mongodb-org-shell-4.2.0-1.el7.x86_64.rpm
      /usr/lib/systemd/system/mongod.service
    2)启动
      systemctl start mongod.service
2.3)基础概念
    database    database    数据库
    table       collection  数据库表/集合
    row         document    数据记录行/文档
    column      field       数据字段/域
    index       index       索引
    table       joins       表连接（MongoDB不支持）
    primary key primary key 主键,MongoDB自动在每个集合中添加_id的主键
    1)一个mongodb实例可以创建多个数据库
    2)一个数据库可以创建多个集合
    3)一个集合可以包括多个文档。
2.4)连接mongodb
    1)命令格式 mongodb://[username:password@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database][?options]] 
      mongodb://localhost 连接本地数据库27017端口
      mongodb://root:root@localhost 使用用户名root密码为root连接本地数据库27017端口
      mongodb://localhost,localhost:27018,localhost:27019，连接三台主从服务器，端口为27017、27018、27019  
      说明：
      mongodb:// 固定前缀
      username：账号，可不填
      password：密码，可不填
      host：主机名或ip地址，只有host主机名为必填项。
      port：端口，可不填，默认27017
      /database：连接某一个数据库
      ?options：连接参数，key/value对
    2)使用mongodb自带的javascript shell（mongo）连接   
    3)使用studio3T连接
    4)使用java程序连接
      <dependency>
        <groupId>org.mongodb</groupId>
        <artifactId>mongo‐java‐driver</artifactId>
         <version>3.4.3</version>
      </dependency>
      @Test
      public void testConnection(){
        //创建mongodb 客户端
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        //或者采用连接字符串
        //MongoClientURI connectionString = new
        MongoClientURI("mongodb://root:root@localhost:27017");
        //MongoClient mongoClient = new MongoClient(connectionString);
        //连接数据库
        MongoDatabase database = mongoClient.getDatabase("test");
        // 连接collection
        MongoCollection<Document> collection = database.getCollection("student");
        //查询第一个文档
        Document myDoc = collection.find().first();
        //得到文件内容 json串
        String json = myDoc.toJson();
        System.out.println(json);
      }
2.5)使用
    1)查询数据库
     show dbs 查询全部数据库
     db       显示当前数据库
    2)创建数据库test 有test数据库则切换到此数据库，没有则创建,新创建的数据库不显示，需要至少包括一个集合。
     use test
    3)删除数据库（慎用！！！）,删除test
     use test   
     db.dropDatabase()
    4)创建集合  name: 新创建的集合名称,options: 创建参数 
      db.createCollection(name, options)  
    5)删除集合 db.collection.drop()
      db.student.drop() 删除student集合
    6)插入文档
      db.student.insert({"name":"测试","age":10})  
    7)更新文档
      替换文档   db.student.update({"name":"测试"},{"name":"测试","age":10})
      $set修改器 db.student.update({"name":"测试"},{$set:{"name":"测试","age":10}},{multi:true}) db.student.update({"name":"测试"},{$set:{"name":"测试","age":10}},{multi:true})
    8)删除文档
      删除所有文档      db.student.remove({})
      删除符合条件的文档 db.student.remove({"name":"测试"})
    9)查询文档
      查询全部 db.student.find()
      条件查询 db.student.find({"name":"测试"})     
      投影查询 db.student.find({"name":"测试"},{name:1,age:1,_id:0})
   10)创建用户
      use admin
      db.createUser(
          {
              user:"root",
              pwd:"root",
              roles:[{role:"root",db:"admin"}]
          }
      ) 
    11)查询用户
       show users
    12)删除用户
       db.dropUser("root1")
    13)修改用户
       use admin
       db.updateUser("root",{roles:[{role:"readWriteAnyDatabase",db:"admin"}]})
    14)修改密码
       use admin
       db.changeUserPassword("root","123")          
    15)内置角色
       数据库用户角色：read、readWrite;
       数据库管理角色：dbAdmin、dbOwner、userAdmin；
       集群管理角色：  clusterAdmin、clusterManager、clusterMonitor、hostManager；
       备份恢复角色：  backup、restore；
       所有数据库角色：readAnyDatabase、readWriteAnyDatabase、userAdminAnyDatabase、dbAdminAnyDatabase
       超级用户角色：  root  
    16)使用问题
       1)mongodb失败Exception opening socket
         将配置的mongodb.conf中bindIP:127.0.0.1 改为0.0.0.0或将这一行注释掉
         :127.0.0.1只允许本地连接，不接受远程连接mongodb   
       2)Command failed with error 18: 'Authentication failed.' 
         MongoClientURI访问mongodb的授权报错,在使用MongoClientURI访问mongodb时需要格外注意的是：uri必须包含数据库名
           

3.导入mongodb 数据库
3.1)

3.接口开发规范
3.1)Api请求及响应规范,为了严格按照接口进行开发，提高效率，对请求及响应格式进行规范化
    1)get 请求时，采用key/value格式请求，SpringMVC可采用基本类型的变量接收，也可以采用对象接收。
    2)Post请求时，可以提交form表单数据（application/x-www-form-urlencoded）
       Json数据（ContentType=application/json），
       文件等多部件类型（multipart/form-data）三种数据格式，
       SpringMVC接收Json数据,使用@RequestBody注解解析请求的json数据。
    3)响应结果统一信息为：是否成功、操作代码、提示信息及自定义数据。
    4)响应结果统一格式为json。
3.2)Api定义约束
    1)@PathVariable 统一指定参数名称，如：@PathVariable("id") 
    2)@RequestParam 统一指定参数名称，如：@RequestParam（"id"）    

4.cms
4.1)需求分析
    1)分页查询CmsPage 集合下的数据
    2)根据站点Id、模板Id、页面别名查询页面信息
    3)接口基于Http Get请求，响应Json数据  
4.2)logback-spring.xml，此文件为工程的日志配置文    
4.3)测试
    1)自定义Dao方法
      同Spring Data JPA一样Spring Data mongodb也提供自定义方法的规则，如下：
      按照findByXXX，findByXXXAndYYY、countByXXXAndYYY等规则定义方法，实现查询操作
      //根据页面名称查询
      CmsPage findByPageName(String pageName);
      //根据页面名称和类型查询
      CmsPage findByPageNameAndPageType(String pageName,String pageType);
      //根据站点和页面类型查询记录数
      int countBySiteIdAndPageType(String siteId,String pageType);
      //根据站点和页面类型分页查询
      Page<CmsPage> findBySiteIdAndPageType(String siteId,String pageType, Pageable pageable);
    2)test下的包路径与main下的包路径保持一致,测试程序使用@SpringBootTest和@RunWith(SpringRunner.class)注解，
      启动测试类会从main下找springBoot启动类，加载spring容器
      http://localhost:31001/cms/page/list/1/10

5.页面查询接口测试
5.1)Swagger是全球最大的OpenAPI规范（OAS）API开发工具框架，支持从设计和文档到测试和部署的整个API生命周期的开发。 (https://swagger.io/)      
    1)Spring Boot 可以集成Swagger，生成Swagger接口，Spring Boot是Java领域的神器，它是Spring项目下快速构建项目的框架。
5.2)Swagger常用注解
    1)@Api：修饰整个类，描述Controller的作用 
    2)@ApiOperation：描述一个类的一个方法，或者说一个接口
    3)@ApiParam：单个参数描述 
    4)@ApiModel：用对象来接收参数 
    5)@ApiModelProperty：用对象接收参数时，描述对象的一个字段
    6)@ApiResponse：HTTP响应其中1个描述 
    7)@ApiResponses：HTTP响应整体描述 
    8)@ApiIgnore：使用该注解忽略这个API 
    9)@ApiError ：发生错误返回的信息 
   10)@ApiImplicitParam：一个请求参数
   11)@ApiImplicitParams：多个请求参数
5.3)@ApiImplicitParam属性
    paramType 查询参数类型
    path 以地址的形式提交数据
    query 直接跟参数完成自动映射赋值
    body 以流的形式提交 仅支持POST
    header 参数在request headers 里边提交
    form 以form表单的形式提交 仅支持POST
    dataType 参数的数据类型 只作为标志说明，并没有实际验证
    Long
    String
    name 接收参数名
    value 接收参数的意义描述
    required 参数是否必填
    true 必填
    false 非必填
    defaultValue 默认值   
5.4)Swagger2Configuration.java, 此类中指定了包路径server
    1)启动cms服务工程，查看接口文档，请求：
      http://localhost:31001/swagger-ui.html 
5.5)Swagger接口定义
    1)CmsPageControllerApi.java
    2)QueryPageRequest.java
5.6)postman是一款功能强大的http接口测试工具，使用postman可以完成http各种请求的功能测试。
    官方地址：https://www.getpostman.com/    

6.CMS前端工程 vue.js
    Vue (读音 /vjuː/，类似于 view) 是一套用于构建用户界面的渐进式框架。与其它大型框架不同的是，
    Vue 被设计为可以自底向上逐层应用。Vue 的核心库只关注视图层，不仅易于上手，还便于与第三方库或既有项目整合。
    另一方面，当与现代化的工具链以及各种支持类库结合使用时，Vue 也完全能够为复杂的单页应用提供驱动。
    渐进式框架：Progressive，说明vue.js的轻量，是指一个前端项目可以使用vue.js一两个特性也可以整个项目都用vue.js。
    自底向上逐层应用：作为渐进式框架要实现的目标就是方便项目增量开发。
    https://cn.vuejs.org/v2/guide/
    Vue 不支持 IE8 及以下版本，因为 Vue 使用了 IE8 无法模拟的 ECMAScript 5 特性。
6.1)Vue.js的使用
    1)在html页面使用script引入vue.js的库即可使用。
    2)使用Npm管理依赖，使用webpack打包工具对vue.js应用打包。大型应用推荐此方案。
    3)Vue-CLI脚手架
6.2)vue.js功能
    1)声明式渲染
      Vue.js 的核心是一个允许采用简洁的模板语法来声明式地将数据渲染进 DOM 的系统。
      比如：使用vue.js的插值表达式放在Dom的任意地方， 差值表达式的值将被渲染在Dom中。
    2)条件与循环
      dom中可以使用vue.js提供的v-if、v-for等标签，方便对数据进行判断、循环
    3)双向数据绑定
      Vue 提供v-model 指令，它可以轻松实现Dom元素和数据对象之间双向绑定，即修改Dom元素中的值自动修改绑定的数据对象，
      修改数据对象的值自动修改Dom元素中的值。  
    4)处理用户输入
      为了让用户和你的应用进行交互，我们可以用 v-on 指令添加一个事件监听器，通过它调用在 Vue 实例中定义的方法
    5)组件化应用构建
      vue.js可以定义一个一个的组件，在vue页面中引用组件，这个功能非常适合构建大型应用。
6.2)MVVM模式
    1)MVVM拆分解释为：
      Model:负责数据存储
      View:负责页面展示
      View Model:负责业务逻辑处理（比如Ajax请求等），对数据进行加工后交给视图展
6.3)代码编写步骤
    1)定义html，引入vue.js
    2)定义app div，此区域作为vue的接管区域
    3)定义vue实例，接管app区域。
    4)定义model（数据对象）
    5)VM完成在app中展示数据 
6.4)指令
    1)v-model 在表单控件或者组件上创建双向绑定;v-model仅能在如下元素中使用
      input
      select
      textarea
      components（Vue中的组件）
    2)v-text 解决插值表达式闪烁问题
      v-text可以将一个变量的值渲染到指定的元素中,它可以解决插值表达式闪烁的问题
    3)v-on   绑定一个按钮的单击事件
    4)v-bind
      作用：
      v‐bind可以将数据对象绑定在dom的任意属性中。
      v‐bind可以给dom对象绑定一个或多个特性，例如动态绑定style和class
      举例：
      <img v‐bind:src="imageSrc">
      <div v‐bind:style="{ fontSize: size + 'px' }"></div>
      缩写形式
      <img :src="imageSrc">
      <div :style="{ fontSize: size + 'px' }"></div> 
    5)v-if和v-for
      <li v‐for="(item,index) in list" :key="index" v‐if="index % 2==0">{{index}}‐{{item}}
      <li v‐for ="(value,key) in user">{{key}}‐{{value}}</li>
      <li v‐for="(item,index) in userlist" :key="item.user.uname">
      <div v‐if="item.user.uname=='test'" style="background: chartreuse"><!‐‐名称为 test 的加背景色‐‐>  
        {{index}}‐{{item.user.uname}}‐{{item.user.age}}
      </div>
      <div v‐else="">
        {{index}}‐{{item.user.uname}}‐{{item.user.age}}
      </div>
6.5)webpack 
    Webpack 是一个前端资源的打包工具，它可以将js、image、css等资源当成一个模块进行打包。
    1)安装webpack webpack基于node.js运行，首先需要安装node.js
    2)安装Node.js node -v
    3)安装NPM(node.js已经集成了npm工具)    npm -v
      设置包路径 npm config ls 查询NPM管理包路径（NPM下载的依赖包所存放的路径）
      npm config set prefix "C:\Program Files\nodejs\npm_modules"
      npm config set cache "c:\Program Files\nodejs\npm_cache
    4)安装cnpm npm默认会去国外的镜像去下载js包，在开发中通常我们使用国内镜像，这里我们使用淘宝镜像
      npm install -g cnpm --registry=https://registry.npm.taobao.org
      cnpm -v
      nrm ls 查看镜像已经指向taobao
      nrm use XXX切换 镜像
      如果nrm没有安装则需要进行全局安装：cnpm install -g nrm
    5)安装webpack
    5.1)在门户目录下创建webpack测试目录webpacktest01：
      npm install --save-dev webpack 或 cnpm install --save-dev webpack
      npm install --save-dev webpack-cli (4.0以后的版本需要安装webpack-cli)
    5.2)全局安装加-g
      全局安装就将webpack的js包下载到npm的包路径下。
      npm install webpack -g 或 cnpm install webpack -g
    5.3)安装webpack指定的版本
      进入webpacktest测试目录，运行：cnpm install --save-dev webpack@3.6.0
      全局安装：npm install webpack@3.6.0 -g或 cnpm install webpack@3.6.0 -g   
    5.4)打包测试
      进入程序目录，执行webpack main.js build.js ，这段指令表示将main.js打包输出为 build.js文件执行完成，观察程序目录是否出现build.js   
      在html中引用build.js <script src="build.js"></script>  
    6)webpack-dev-server
      webpack-dev-server开发服务器，它的功能可以实现热加载 并且自动刷新浏览器。使用 webpack-dev-server需要安装webpack、 webpack-dev-server和 html-webpack-plugin三个包
    6.1)安装配置 
      npm install webpack webpack-dev-server html-webpack-plugin --save-dev
      cnpm install webpack@3.6.0 webpack-dev-server@2.9.1 html-webpack-plugin@2.30.1 --save-dev
    6.2)配置webpack-dev-server
      在package.json中配置script
      "scripts": {
        "dev": "webpack‐dev‐server ‐‐inline ‐‐hot ‐‐open ‐‐port 5008"
      },
      --inline：自动刷新
      --hot：热加载
      --port：指定端口
      --open：自动在默认浏览器打开
      --host：可以指定服务器的 ip，不指定则为127.0.0.1，如果对外发布则填写公网ip地址
      此时package.json的文件内容如下：
      {
          "scripts": {
              "dev": "webpack‐dev‐server ‐‐inline ‐‐hot ‐‐open ‐‐port 5008"
          },
          "devDependencies": {
              "html‐webpack‐plugin": "^2.30.1",
              "webpack": "^3.6.0",
              "webpack‐dev‐server": "^2.9.1"
          }
      }
      devDependencies：开发人员在开发过程中所需要的依赖。
      scripts：可执行的命令
    6.3)配置webpack.config.js
      webpack.config.js是webpack的配置文件。在此文件中可以配置应用的入口文件、输出配置、插件等，其中要实现热加载自动刷新功能需要配置html-webpack-plugin插件    
      var htmlwp = require('html‐webpack‐plugin');
      module.exports={
          entry:'./src/main.js', //指定打包的入口文件
          output:{
              path : __dirname+'/dist', // 注意：__dirname表示webpack.config.js所在目录的绝对路径
              filename:'build.js' //输出文件
          },
          plugins:[
              new htmlwp({
                  title: '首页', //生成的页面标题<head><title>首页</title></head>
                  filename: 'index.html', //webpack‐dev‐server在内存中生成的文件名称，自动将build注入到这个页面底部，才能实现自动刷新功能
                  template: 'vue_02.html' //根据index1.html这个模板来生成(这个文件请程序员自己生成)
              })
          ]
      }
     6.4)启动
       进入 webpacktest02目录，执行npm run dev
       使用webstorm，右键package.json文件，选择“Show npm Scripts”,双击 dev.
       注意：dev就是在package.json中配置的webpack dev server命令
    7)debug调试
       7.1)在webpack.config.js中配置 
         devtool: 'eval‐source‐map',
       7.2)webpack.config.js部分内容如下
         var htmlwp = require('html‐webpack‐plugin');
         module.exports={
             entry:'./src/main.js', //指定打包的入口文件
             output:{
                 path : __dirname+'/dist', // 注意：__dirname表示webpack.config.js所在目录的绝对路径
                 filename:'build.js' //输出文件
         },
         devtool: 'eval‐source‐map',
         ......
       7.3)在js中跟踪代码的位置上添加debugger
         // 定义add函数
         function add(x, y) {
             debugger
             return x + y
         }  
7.CMS前端工程
7.1)安装vue-cli
    npm install --global vue-cli
    Vue --version
7.2)创建一个基于 webpack 模板的新项目
    vue init webpack ui-pc
7.3)运行
7.4)问题
    1)Node Sass does not yet support your current environment: OS X 64-bit with Unsupported runtime
        升级了node版本/ node版本太高会造成node-sass不兼容的问题，那么就再install node-sass一下就行了
        npm i node-sass -D      
7.5)成功运行项目
    http://localhost:11000
7.6)IDEA 添加 vue.js 插件   
7.7)页面结构
    1)在model目录创建 cms模块的目录结构
    2)page目录新建page_list.vue,三部分组成
      template
      script
      style
    注意：template内容必须有一个根元素，否则vue会报错，这里我们在template标签内定义一个div
    3)页面路由
      在cms的router下配置路由
      在base目录下的router导入cms模块的路由
    4)Api调用
      前端页面导入cms.js，调用js方法请求服务端页面查询接口
      4.1)导入cms.js
      4.2)在query方法中调用 page_list方法
    5)跨域问题解决
      5.1)采用proxyTable解决
          proxyTable的底层使用了http-proxymiddleware,它是http代理中间件，它依赖node.js，基本原理是用服务端代理解决浏览器跨域      
      5.2)在config/index.js下配置proxyTable。
        '/api/cms': {
            target: 'http://localhost:31001',
            pathRewrite: {
                '^/api': ''//实际请求去掉/api
        }
    6)进入页面立即查询
      6.1)生命周期钩子的函数
        created：vue实例已创建但是DOM元素还没有渲染生成
        mounted：DOM元素渲染生成完成后调用
      6.2)代码
        mounted() {
            //默认查询页面
            this.query()
        }
      6.3)router-link是vue提供的路由功能，用于在页面生成路由链接，最终在html渲染后就是<a标签。    
7.8)Element-UI
    1)http://element.eleme.io/#/zh-CN/component/installation    
8.异常处理
    8.1)采用SpringMVC控制器增强
        ExceptionCatch.java
        
#开发阶段二
1.页面静态化 FreeMarker 模板+数据模型=输出
    1.1)配置文件
        spring:
            application:
                name: test‐freemarker #指定服务名
            freemarker:
                cache: false #关闭模板缓存，方便测试
                settings:
                template_update_delay: 0 #检查模板更新延迟时间，设置为0表示立即检查，如果时间大于0会有缓存不方便进行模板测试
    1.2)创建模板
        在 src/main/resources下创建templates，此目录为freemarker的默认模板存放目录。
    1.3)创建controller
        @Controller（html） 不能使用RestController（json）
        public class FreemarkerController {    
    1.4)核心指令
        1)List指令
            _index：得到循环的下标，使用方法是在stu后边加"_index"，它的值是从0开始  
        2)遍历Map数据
           ${stuMap['stu1'].name}
           ${stuMap.stu1.name}
           <#list stuMap?keys as k> ${stuMap[k].name
        3)if指令
           <td <#if stu.name =='小明'>style="background:red;"</#if>>${stu.name}</td>
        4)运算符
           算数运算符 +, - , * , / , % 
           逻辑运算符 &&,||,!(只能作用于布尔值,否则将产生错误)
           比较运算符 =或者==,!=,>或者gt,>=或者gte,<或者lt,<=或者lte
        5)空值处理 
          “??”   如：<#if stus??>   
          !      如：${name!''}表示如果name为空显示空字符串。
          ()嵌套  如：${(stu.bestFriend.name)!''}表示，如果stu或bestFriend或name为空默认显示空字符串
     1.5)内建函数
        建函数语法格式： 变量+?+函数名称
        1)${集合名?size}
        2)显示年月日:    ${today?date}
          显示时分秒：   ${today?time}
          显示日期+时间：${today?datetime} <br>
          自定义格式化： ${today?string("yyyy年MM月")}
        3)内建函数c point是数字型
          ${point}     会显示这个数字的值，且每三位使用逗号分隔。
          ${point?c}   如果不想显示为每三位分隔的数字，可以使用c函数将数字型转成字符串输出。
        4)将json字符串转成对象 assign
          <#assign text="{'bank':'工商银行','account':'10101920201920212'}" />
          <#assign data=text?eval />
          开户行：${data.bank} 账号：${data.account}  
2.页面静态化
    2.1)页面静态化流程
        1)静态化程序首先读取页面获取DataUrl。
        2)静态化程序远程请求DataUrl得到数据模型。
        3)获取页面模板。
        4)执行页面静态化。
    2.2)数据模型
        CmsConfigModel.java
        CMS中有轮播图管理、精品课程推荐的功能，以轮播图管理为例说明：轮播图管理是通过可视化的操作界面由管理员指定轮播图图片地址，最后将轮播图图片地址保存在cms_config集合中              
    2.3)接口定义
        CmsConfigControllerApi.java
    2.4)Dao
        CmsConfigRepository.java
    2.5)Service
        CmsConfigService.java
    2.6)测试
        get请求：http://localhost:31001/cms/config/getmodel/5a791725dd573c3574ee333f （轮播图信息）
3.远程请求接口
    3.1)添加依赖
        <groupId>com.squareup.okhttp3</groupId>
        <artifactId>okhttp</artifactId>
    3.2)SpringBoot启动类中配置 RestTemplate
        public class ManageCmsApplication {
            public static void main(String[] args) {
                SpringApplication.run(ManageCmsApplication.class,args);
            } 
            @Bean
            public RestTemplate restTemplate() {
                return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
            }
        }
    3.3)测试RestTemplate
        ResponseEntity<Map> forEntity = restTemplate.getForEntity("http://localhost:31001/cms/config/get/5a791725dd573c3574ee333f",Map.class);
4.GridFS
    在GridFS存储文件是将文件分块存储，文件会按照256KB的大小分割成多个块进行存储，GridFS使用两个集合（collection）存储文件，一个集合是chunks, 用于存储文件的二进制数据；
    一个集合是files，用于存储文件的元数据信息（文件名称、块大小、上传时间等信息）。从GridFS中读取文件要对文件的各各块进行组装、合并。
    详细参考：https://docs.mongodb.com/manual/core/gridfs/  
5.页面预览开发
    5.1)sudo vi /private/etc/hosts
        追加： 127.0.0.1 www.server.com
    5.2)配置Nginx代理
        #页面预览
        location /cms/preview/ {
            proxy_pass http://cms_server_pool/cms/preview/;
        }
    5.3)配置cms_server_pool将请求转发到cms
        #cms页面预览
        upstream cms_server_pool{
            server 127.0.0.1:31001 weight=10;
        }    
6.            
            
                 
    
