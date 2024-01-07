package llb.system.controller;


import llb.common.BaseInterface;
import llb.common.entity.Loaded;
import llb.system.service.LoadedService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/Loaded")
public class LoadedController implements BaseInterface<Loaded> {

    @Autowired
    private LoadedService LoadedService;


    //查询
    @RequestMapping("/getAll")
    @ResponseBody
    @Override
    public List<Loaded> getAll(@RequestBody Loaded searchParam) {
        return LoadedService.getAll(searchParam);
    }

    //查询
    @RequestMapping("/getAll2Page")
    @ResponseBody
    @Override
    public List<Loaded> getAll2Page(@RequestBody Loaded searchParam) {
        return LoadedService.getAll2Page(searchParam);
    }

    //查询
    @RequestMapping("/get")
    @ResponseBody
    @Override
    public Loaded get(@RequestBody Loaded searchParam) {
        return LoadedService.get(searchParam);
    }


    //总数
    @RequestMapping("/count")
    @ResponseBody
    @Override
    public Integer count(@RequestBody Loaded searchParam) {
        return LoadedService.count(searchParam);
    }

    //修改
    @RequestMapping("/update")
    @ResponseBody
    @Override
    public Integer update(@RequestBody Loaded searchParam) {
        return LoadedService.update(searchParam);
    }

    //新增
    @RequestMapping("/add")
    @ResponseBody
    @Override
    public Integer add(@RequestBody Loaded searchParam) {
        return LoadedService.add(searchParam);
    }

    @RequestMapping("/addS")
    @ResponseBody
    @Override
    public Integer addS(List<Loaded> t) {
        return LoadedService.addS(t);
    }

    //删除
    @RequestMapping("/del")
    @ResponseBody
    @Override
    public Integer del(@RequestBody Loaded searchParam) {
        return LoadedService.del(searchParam);
    }

}
