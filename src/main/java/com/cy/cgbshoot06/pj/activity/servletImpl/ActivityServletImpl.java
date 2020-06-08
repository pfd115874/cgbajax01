package com.cy.cgbshoot06.pj.activity.servletImpl;

import com.cy.cgbshoot06.pj.activity.dao.ActivityDao;
import com.cy.cgbshoot06.pj.activity.pojo.Activity;
import com.cy.cgbshoot06.pj.activity.servlet.ActivityServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小东东
 */
@Service
public class ActivityServletImpl implements ActivityServlet {
    @Autowired
    private ActivityDao activityDao;

    @Override
    public List<Activity> findAll() {
        List<Activity> list = activityDao.findAll();
        return list;
    }

    @Override
    public int deleteById(Integer id) {
        int rows = activityDao.deleteById(id);
        return rows;
    }

    @Override
    public int insertById(Activity entity) {
        if(entity.getId()==null) {
            return activityDao.insertById(entity);
        }else {
            return activityDao.updateActivity(entity);
        }
    }

    @Override
    public Activity findById(Integer id) {

        return activityDao.findById(id);


    }
}
