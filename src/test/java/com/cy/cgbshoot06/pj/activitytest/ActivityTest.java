package com.cy.cgbshoot06.pj.activitytest;

import com.cy.cgbshoot06.pj.activity.dao.ActivityDao;
import com.cy.cgbshoot06.pj.activity.pojo.Activity;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
public class ActivityTest {
    @Autowired
    private ActivityDao activityDao;

    @Test
    public void testFindAll(){
        List<Activity> list = activityDao.findAll();
        for (Activity activity : list) {
            System.out.println(activity);
        }

    }

    @Test
    public void testAty01(){
        long start = System.currentTimeMillis();
        Activity aty = new Activity();
        aty.setId(10L);
        aty.setTitle("A-Title");
        aty.setCategory("A-Type");
        System.out.println(aty.getId());
        System.out.println(aty.getTitle());
        System.out.println(aty.getCategory());
        System.out.println(aty);
        log.info(aty.toString());
        long end = System.currentTimeMillis();
        log.info("excute time:{}",(end-start));

    }
}
