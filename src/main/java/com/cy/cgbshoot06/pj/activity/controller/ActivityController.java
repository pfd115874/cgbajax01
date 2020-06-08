package com.cy.cgbshoot06.pj.activity.controller;

import com.cy.cgbshoot06.pj.activity.pojo.Activity;
import com.cy.cgbshoot06.pj.activity.servlet.ActivityServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 小东东
 */
@Controller
@RequestMapping("/activity/")
public class ActivityController {
    @Autowired
    private ActivityServlet activityServlet;


    @RequestMapping("activityEditUI")
    public String activityEditUI(){
        return "activity-edit";
    }

    @RequestMapping("fingAllUI")
    public String findAllUI(Model model){
        List<Activity> list = activityServlet.findAll();
        model.addAttribute("list",list);
        return "activity";

    }

    @RequestMapping("deleteByIdUI")
    @ResponseBody
    public String deleteByIdUI(Model model,Integer id){
        activityServlet.deleteById(id);

        /*List<Activity> list = activityServlet.findAll();
        model.addAttribute("list",list);*/
        return "delete OK";
    }
    @RequestMapping("insertByIdUI")
    public String insertByIdUI(Activity activity,Model model){
        activityServlet.insertById(activity);

        List<Activity> list = activityServlet.findAll();
        model.addAttribute("list",list);
        return "activity";
    }
    @RequestMapping("doFindById")
    public String findByIdUI(Model model,Integer id){

        Activity aty = activityServlet.findById(id);
        model.addAttribute("aty",aty);

        return "forward:fingAllUI";
    }
}
