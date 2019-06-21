1.安装angular cli
  npm uninstall -g @angular-cli
  npm cache verify
  npm cache clean --force
  npm install -g @angular/cli@latest

2.基本命令、参数
  --skip-install     生成完项目文件之后不执行npm install这个动作，手动执行npm install 例：ng new my-app --skip-install 
  --help             查看帮助
  npm start/ng serve 运行项目
  pm build/ng build  执行构建
  
3.配置文件 angular.json

4.创建 angular(本工程)
  ng new angular --style=scss
  
5.创建html模块 html、css、bootstrap table的学习总结
  ng g module html --routing
  ng g component html
  

angular-in-memory-web-api 安装 模拟数据库服务端 依赖
npm install angular-in-memory-web-api --save




# Angular

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 8.0.3.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
