package com.cy.cgbshoot06.pj.activity.servlet;

import com.cy.cgbshoot06.pj.activity.pojo.Activity;

import java.util.List;

/**
 * @author 小东东
 */
public interface ActivityServlet {
    List<Activity> findAll();
    int deleteById(Integer id);
    int insertById(Activity activity);
    Activity findById(Integer id);

}
