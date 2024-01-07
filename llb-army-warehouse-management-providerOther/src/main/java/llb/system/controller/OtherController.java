package llb.system.controller;


import llb.common.BaseInterface;
import llb.common.entity.Other;
import llb.system.service.OtherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/Other")
public class OtherController implements BaseInterface<Other> {

    @Autowired
    private OtherService OtherService;


    //查询
    @RequestMapping("/getAll")
    @ResponseBody
    @Override
    public List<Other> getAll(@RequestBody Other searchParam) {
        return OtherService.getAll(searchParam);
    }

    //查询
    @RequestMapping("/getAll2Page")
    @ResponseBody
    @Override
    public List<Other> getAll2Page(@RequestBody Other searchParam) {
        return OtherService.getAll2Page(searchParam);
    }

    //查询
    @RequestMapping("/get")
    @ResponseBody
    @Override
    public Other get(@RequestBody Other searchParam) {
        return OtherService.get(searchParam);
    }


    //总数
    @RequestMapping("/count")
    @ResponseBody
    @Override
    public Integer count(@RequestBody Other searchParam) {
        return OtherService.count(searchParam);
    }

    //修改
    @RequestMapping("/update")
    @ResponseBody
    @Override
    public Integer update(@RequestBody Other searchParam) {
        return OtherService.update(searchParam);
    }

    //新增
    @RequestMapping("/add")
    @ResponseBody
    @Override
    public Integer add(@RequestBody Other searchParam) {
        return OtherService.add(searchParam);
    }

    @RequestMapping("/addS")
    @ResponseBody
    @Override
    public Integer addS(List<Other> t) {
        return OtherService.addS(t);
    }

    //删除
    @RequestMapping("/del")
    @ResponseBody
    @Override
    public Integer del(@RequestBody Other searchParam) {
        return OtherService.del(searchParam);
    }

}
