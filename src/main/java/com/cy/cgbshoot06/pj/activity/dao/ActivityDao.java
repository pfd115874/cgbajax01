package com.cy.cgbshoot06.pj.activity.dao;


import com.cy.cgbshoot06.pj.activity.pojo.Activity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 小东东
 */
@Mapper
@Component
public interface ActivityDao {
    /**
     * 查询所有活动信息
     */
    @Select("select * from tb_activity")
    List<Activity> findAll();

    /**
     * 根据Id删除活动信息
     */
    @Delete("delete from tb_activity where id=#{id}")
    int deleteById(Integer id);

    int insertById(Activity activity);

    int updateActivity(Activity entity);

    @Select("select * from tb_activity where id=#{id}")
    Activity findById(Integer id);
}
