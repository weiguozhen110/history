package cn.study.ssm.service.impl;


import cn.study.ssm.dao.ItemsDao;
import cn.study.ssm.entity.Items;
import cn.study.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
