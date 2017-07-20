package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017/7/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/beans.xml")
public class SecKillDaoTest {

   @Resource
private SecKillDao seckillDao;


    @Test
    public void queryById() throws Exception {
        long id=1000;
        Seckill seckill=seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void queryAll() throws Exception {
        List<Seckill> seckillList=seckillDao.queryAll(0,100);
        for (Seckill seckill:seckillList) {
            System.out.println(seckill.toString());

        }
    }
    @Test
    public void reduceNumber() throws Exception {
        int updateCount=seckillDao.reduceNumber(1000l,new Date());
        System.out.println(updateCount);
    }

}