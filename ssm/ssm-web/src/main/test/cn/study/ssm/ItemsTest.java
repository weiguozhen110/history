package cn.study.ssm;


import cn.study.ssm.entity.Items;
import cn.study.ssm.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void findById(){
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //dao测试
        //从容器中拿到所需的dao的代理对象
//        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        //调用方法
//        Items items = itemsDao.findById(1);
//        System.out.println(items.getName());
        //service测试
        ItemsService itemsService = ac.getBean(ItemsService.class);
        //调用方法
        Items items = itemsService.findById(1);
        System.out.println(items.getName());
    }
}
