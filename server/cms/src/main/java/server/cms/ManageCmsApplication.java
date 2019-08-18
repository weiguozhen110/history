package server.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Administrator
 * @version 1.0
 * @create 2018-09-12 17:13
 **/
@SpringBootApplication
@EntityScan("server.model.domain.cms")//扫描实体类
@ComponentScan(basePackages={"server.api"})//扫描接口
@ComponentScan(basePackages={"server.common"})//扫描common包下的类
@ComponentScan(basePackages={"server.cms"})//扫描本项目下的所有类
public class ManageCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageCmsApplication.class,args);
    }
}
