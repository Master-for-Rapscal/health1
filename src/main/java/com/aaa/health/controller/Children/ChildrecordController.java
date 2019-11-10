package com.aaa.health.controller.Children;

import com.aaa.health.entity.Children.Childinsrecord;
import com.aaa.health.page.admin.Page;

import com.aaa.health.service.Children.ChildinsercordService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.transport.ObjectTable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 健康检查记录
 */
@RequestMapping("/ChildRecord")
@Controller
public class ChildrecordController {
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @Autowired
    private ChildinsercordService childinsercordService;


    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Object list(Model model, Integer recordId) {


        return childinsercordService.findList(recordId);
    }



    /**
     * 删除方法！
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Object delete(Integer insrecordId) {



        return childinsercordService.delete(insrecordId);
    }




    /**
     *修改查询
     */
    @RequestMapping(value = "/findByid",method = RequestMethod.POST)
    @ResponseBody
    public Object selectById(long insrecordId){

        List list=childinsercordService.findBymentalMessage(insrecordId);
        return list;
    }





    /**
     * 修改用户信息
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Object edit(Childinsrecord childinsrecord) {
     //   System.out.println("修改成功==========================="+childinsrecord);

        return childinsercordService.edit(childinsrecord);
    }


    /**
     * 添加用户方法
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(Childinsrecord childinsrecord) {
        //  Map<String, String> ret = new HashMap<String, String>();
      //  System.out.println("childinsrecord" + childinsrecord);

        return childinsercordService.add(childinsrecord);
    }
}
