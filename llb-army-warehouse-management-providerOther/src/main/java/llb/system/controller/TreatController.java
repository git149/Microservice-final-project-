package llb.system.controller;


import llb.common.BaseInterface;
import llb.common.entity.Treat;
import llb.system.service.TreatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/Treat")
public class TreatController implements BaseInterface<Treat> {

    @Autowired
    private TreatService TreatService;


    //查询
    @RequestMapping("/getAll")
    @ResponseBody
    @Override
    public List<Treat> getAll(@RequestBody Treat searchParam) {
        return TreatService.getAll(searchParam);
    }

    //查询
    @RequestMapping("/getAll2Page")
    @ResponseBody
    @Override
    public List<Treat> getAll2Page(@RequestBody Treat searchParam) {
        return TreatService.getAll2Page(searchParam);
    }

    //查询
    @RequestMapping("/get")
    @ResponseBody
    @Override
    public Treat get(@RequestBody Treat searchParam) {
        return TreatService.get(searchParam);
    }


    //总数
    @RequestMapping("/count")
    @ResponseBody
    @Override
    public Integer count(@RequestBody Treat searchParam) {
        return TreatService.count(searchParam);
    }

    //修改
    @RequestMapping("/update")
    @ResponseBody
    @Override
    public Integer update(@RequestBody Treat searchParam) {
        return TreatService.update(searchParam);
    }

    //新增
    @RequestMapping("/add")
    @ResponseBody
    @Override
    public Integer add(@RequestBody Treat searchParam) {
        return TreatService.add(searchParam);
    }

    @RequestMapping("/addS")
    @ResponseBody
    @Override
    public Integer addS(List<Treat> t) {
        return TreatService.addS(t);
    }

    //删除
    @RequestMapping("/del")
    @ResponseBody
    @Override
    public Integer del(@RequestBody Treat searchParam) {
        return TreatService.del(searchParam);
    }

}
