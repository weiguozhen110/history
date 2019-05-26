package cn.study.ssm;

import cn.study.ssm.entity.Items;
import cn.study.ssm.service.ItemsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-dao.xml","classpath:spring/applicationContext-service.xml"})
public class ItemsServiceTest {
    @Autowired
    private ItemsService itemsService = null;

    @Test
    public void testFindItemsById() {
        Items items = itemsService.findById(1);
        System.out.println(items.getName());
    }

}
