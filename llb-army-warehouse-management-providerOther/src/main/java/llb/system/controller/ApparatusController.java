package llb.system.controller;


import llb.common.BaseInterface;
import llb.common.entity.Apparatus;
import llb.system.service.ApparatusService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/Apparatus")
public class ApparatusController implements BaseInterface<Apparatus> {

    @Autowired
    private ApparatusService ApparatusService;


    //查询
    @RequestMapping("/getAll")
    @ResponseBody
    @Override
    public List<Apparatus> getAll(@RequestBody Apparatus searchParam) {
        return ApparatusService.getAll(searchParam);
    }

    //查询
    @RequestMapping("/getAll2Page")
    @ResponseBody
    @Override
    public List<Apparatus> getAll2Page(@RequestBody Apparatus searchParam) {
        return ApparatusService.getAll2Page(searchParam);
    }

    //查询
    @RequestMapping("/get")
    @ResponseBody
    @Override
    public Apparatus get(@RequestBody Apparatus searchParam) {
        return ApparatusService.get(searchParam);
    }


    //总数
    @RequestMapping("/count")
    @ResponseBody
    @Override
    public Integer count(@RequestBody Apparatus searchParam) {
        return ApparatusService.count(searchParam);
    }

    //修改
    @RequestMapping("/update")
    @ResponseBody
    @Override
    public Integer update(@RequestBody Apparatus searchParam) {
        return ApparatusService.update(searchParam);
    }

    //新增
    @RequestMapping("/add")
    @ResponseBody
    @Override
    public Integer add(@RequestBody Apparatus searchParam) {
        return ApparatusService.add(searchParam);
    }

    @RequestMapping("/addS")
    @ResponseBody
    @Override
    public Integer addS(List<Apparatus> t) {
        return ApparatusService.addS(t);
    }

    //删除
    @RequestMapping("/del")
    @ResponseBody
    @Override
    public Integer del(@RequestBody Apparatus searchParam) {
        return ApparatusService.del(searchParam);
    }

}
