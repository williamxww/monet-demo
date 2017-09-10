package com.bow.monet.dao;

import com.bow.monet.entity.MData1;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * @author vv
 * @since 2017/9/10.
 */
public class MachineDaoTest {

    private MachineDao dao;

    @Before
    public void before() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-mybatis.xml");
        dao = context.getBean(MachineDao.class);
    }


    /**
     * insert 效率不高
     * @throws Exception e
     */
    @Test
    public void insert() throws Exception {
        Random random = new Random(3);
        for(int bat=0; bat<2; bat++){
            List<MData1> data = new ArrayList();
            for(int i=0; i<1000; i++){
                double rd = random.nextDouble();
                int ri = random.nextInt(1000);
                MData1 d = new MData1();
                int id = i*bat;
                d.setId(id);
                d.setName("vv"+id);
                d.setIp("127.0.0."+id);
                d.setPwd(""+ri);
                d.setNickName("test"+id);
                d.setSn("sn"+id);
                d.setF0(rd+1);
                d.setF1(rd+2);
                d.setF2(rd+3);
                d.setF3(rd+4);
                d.setF4(rd+5);
                d.setF5(rd+6);
                d.setF6(rd+7);
                d.setF7(rd+7);
                d.setF8(rd+7);
                d.setF9(rd+9);
                data.add(d);
            }
            System.out.println("stored "+bat*1000);
            dao.insert(data);
        }
    }

    @Test
    public void count() throws Exception {
        int num = dao.count();
        System.out.println(num);
    }

}