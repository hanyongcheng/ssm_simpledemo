package com.hanyong.test;

import com.hanyong.dao.ItemsDao;
import com.hanyong.domain.Items;
import com.hanyong.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void daoTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ItemsDao itemsDao = applicationContext.getBean(ItemsDao.class);

        Items items = itemsDao.findById(1);

        System.out.println("dao:" + items.getName());
    }

    @Test
    public void serviceTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ItemsService itemsService = applicationContext.getBean(ItemsService.class);

        Items items = itemsService.findById(1);

        System.out.println("service:" + items.getName());
    }
}
