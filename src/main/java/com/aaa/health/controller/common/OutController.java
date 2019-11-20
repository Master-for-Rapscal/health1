package com.aaa.health.controller.common;


import com.aaa.health.entity.admin.SysUser;
import com.aaa.health.entity.zzh.Healthcheck;
import com.aaa.health.entity.zzh.Userinfo;
import com.aaa.health.service.anfoll.AnteFollowService;
import com.aaa.health.service.busman.AnteBusmanService;
import com.aaa.health.service.hostpit.HostService;
import com.aaa.health.service.hyper.HyPerService;
import com.aaa.health.service.mental.MetalService;
import com.aaa.health.service.othslow.OthMECService;
import com.aaa.health.service.othslow.OthTNFService;
import com.aaa.health.service.tangniaon.TangService;
import com.aaa.health.service.womandis.WomanDiseaseService;
import com.aaa.health.service.zzh.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/out")
public class OutController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @Autowired
    public UserinfoService userinfoService;
    @Autowired
    private HostService hostService;
    @Autowired
    private TangService tangService;
    @Autowired
    private HyPerService hyPerService;
    @Autowired
    private OthMECService othMECService;
    @Autowired
    private OthTNFService othTNFService;
    @Autowired
    private MetalService metalService;
    @Autowired
    private WomanDiseaseService womanDiseaseService;
    @Autowired
    private AnteBusmanService anteBusmanService;
    @Autowired
    private AnteFollowService anteFollowService;
    @CrossOrigin(value="*")
    @RequestMapping(value = "/findUser", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getList( HttpServletRequest request,
                                       @RequestParam(name = "userId", required = false)  Long userId,
                                       @RequestParam(name = "recordName", required = false, defaultValue = "")  String recordName,
                                       @RequestParam(name = "userIdnumber", required = false, defaultValue = "")  String userIdnumber,
                                       @RequestParam(name = "userMyphone", required = false, defaultValue = "")  String userMyphone,
                                       @RequestParam(name = "recordUnit", required = false, defaultValue = "-1")  int recordUnit,
                                       @RequestParam(name = "recordPlaceadress", required = false, defaultValue = "")  String recordPlaceadress,
                                       @RequestParam(name = "userSex", required = false, defaultValue = "-1")  Integer userSex
    ) {
//       System.out.println("编号"+userId+"-姓名"+recordName+"-身份证"+userIdnumber+"-所属单位"+recordUnit+"-常住地址"+recordPlaceadress+"-性别"+userSex+"-");


        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("userId",userId);
        queryMap.put("recordName",recordName);
        queryMap.put("userIdnumber",userIdnumber);
        queryMap.put("userMyphone",userMyphone);
        queryMap.put("recordUnit",recordUnit);
        queryMap.put("recordPlaceadress",recordPlaceadress);
        queryMap.put("userSex",userSex);
       if (userinfoService.findList(queryMap).size()<=0){
        ret.put("type","error");
        ret.put("rows", "null");
        return ret;
    }
        ret.put("type","success");
        ret.put("rows", userinfoService.findList(queryMap));
        System.out.println("准备返回数据");
        return ret;
    }

    @CrossOrigin(value="*")
    @RequestMapping(value = "/findUser2", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getList2( HttpServletRequest request,
                                        @RequestParam(name = "userId", required = false)  Long userId,
                                        @RequestParam(name = "recordName", required = false, defaultValue = "")  String recordName,
                                        @RequestParam(name = "userIdnumber", required = false, defaultValue = "")  String userIdnumber,
                                        @RequestParam(name = "recordUnit", required = false, defaultValue = "-1")  int recordUnit,
                                        @RequestParam(name = "recordPlaceadress", required = false, defaultValue = "")  String recordPlaceadress,
                                        @RequestParam(name = "userSex", required = false, defaultValue = "-1")  Integer userSex
    ) {
//       System.out.println("编号"+userId+"-姓名"+recordName+"-身份证"+userIdnumber+"-所属单位"+recordUnit+"-常住地址"+recordPlaceadress+"-性别"+userSex+"-");
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa"+userId);

        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("userId",userId);
        List<Userinfo> u = userinfoService.findList(queryMap);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa"+u.size());
        //糖尿病
        queryMap.put("recordUnit",-1);
        int tangniao  =  tangService.queryTotal(queryMap);
        //高血压
        queryMap.put("recordUnit",-1);
        int gaoxue = hyPerService.queryHyTotal(queryMap);
        //肿瘤
        queryMap.put("areaId",410000);
        queryMap.put("recordUnit",410000);
        int zhongliu = othTNFService.getTotal(queryMap);
        //慢性病
        queryMap.put("areaId",410000);
        queryMap.put("recordUnit",410000);
        int manxing =  othMECService.getTotal(queryMap);
        //重症精神病
        queryMap.put("areaId",410000);
        queryMap.put("recordUnit",410000);
        int jingshen = metalService.getTotal(queryMap);
        //妇科
        //河南孕产妇建卡
        queryMap.put("recordUnit",410000);
        queryMap.put("areaId",410000);
        int yunchan = anteFollowService.getTotal(queryMap);
        //河南业务管理
        queryMap.put("areaId",410000);
        queryMap.put("recordUnit",410000);
        int yewu = womanDiseaseService.getTotal(queryMap);
        //妇女病
        queryMap.put("recordUnit",410000);
        queryMap.put("areaId",410000);
        int funv = anteBusmanService.getTotal(queryMap);

        ret.put("tangniao", tangniao);
        ret.put("gaoxue", gaoxue);
        ret.put("zhongliu", zhongliu);
        ret.put("manxing", manxing);
        ret.put("jingshen", jingshen);
        ret.put("yunchan", yunchan);
        ret.put("yewu", yewu);
        ret.put("funv", funv);
        return ret;
    }


    @CrossOrigin(value = "*")//
    @RequestMapping(value = "/queryArea", method = RequestMethod.POST)
    @ResponseBody
    public Object queryArea(){
        List<Map<String,Object>> list =  hostService.queryArea();
        return list;
    }

    @CrossOrigin(value = "*")//
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public Object insertUserInfo(Userinfo userinfo){
        Map<String,Object> map=new HashMap<String,Object>();
        int num = hostService.addUserInfo(userinfo);
        System.out.println(num);
        if(num>0){
            map.put("type", "success");
            map.put("msg", "用户添加成功！");

        }else{
            map.put("type", "error");
            map.put("msg", "用户添加失败");
        }
        System.out.println(map);
        return map;
    }

    @CrossOrigin(value = "*")
    @RequestMapping(value = "/queryDoctor", method = RequestMethod.POST)
    @ResponseBody//查询医生
    public Object queryDocetor(){
        List<Map> list = tangService.queryDoctor();
        System.out.println(list);
        return list;
    }

    @CrossOrigin(value = "*")
    @RequestMapping(value = "/queryCheck", method = RequestMethod.POST)
    @ResponseBody//根据用户名  身份证号查询用户体检情况
    public Object queryCheck( String id,
            @RequestParam(name = "date", required = false, defaultValue = "")  Date date){
//        String username="王宇飞";
//        String IDnumber="411082194612252245
        System.out.println("------------------------"+id);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("userId",id);
        map.put("healthcheckDate",date);
        List<Healthcheck> list = hostService.queryCheck(map);
        int num=list.size();
        return list;
    }


    @CrossOrigin(value = "*")
    @RequestMapping(value = "queryIDnumberTotal", method = RequestMethod.POST)
    @ResponseBody
    public Object queryIdNumberTotal(String userIdnumber){
        Integer num = userinfoService.queryIDnumberTotal(userIdnumber);
        return num <= 0;
    }

    @CrossOrigin(value = "*")
    @RequestMapping(value = "queryDoctorByName", method = RequestMethod.POST)
    @ResponseBody
    public Object queryDoctorByName(String lastname){
        List<Map<String,Object>> list = hostService.queryDoctorByName(lastname);
        return list.get(0);
    }
}
