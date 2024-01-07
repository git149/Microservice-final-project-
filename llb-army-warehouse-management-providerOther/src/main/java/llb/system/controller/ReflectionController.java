package llb.system.controller;


import llb.common.BaseInterface;
import llb.common.entity.Analyse;
import llb.common.entity.Reflection;
import llb.system.service.ReflectionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/Reflection")
public class ReflectionController implements BaseInterface<Reflection> {

    @Autowired
    private ReflectionService ReflectionService;

    @RequestMapping("/AnalyseReflection")
    @ResponseBody
    public List<Analyse> AnalyseReflection(Analyse Analyse) {
        return ReflectionService.AnalyseReflection(Analyse);
    }

    //查询
    @RequestMapping("/getAll")
    @ResponseBody
    @Override
    public List<Reflection> getAll(@RequestBody Reflection searchParam) {
        return ReflectionService.getAll(searchParam);
    }

    //查询
    @RequestMapping("/getAll2Page")
    @ResponseBody
    @Override
    public List<Reflection> getAll2Page(@RequestBody Reflection searchParam) {
        return ReflectionService.getAll2Page(searchParam);
    }

    //查询
    @RequestMapping("/get")
    @ResponseBody
    @Override
    public Reflection get(@RequestBody Reflection searchParam) {
        return ReflectionService.get(searchParam);
    }


    //总数
    @RequestMapping("/count")
    @ResponseBody
    @Override
    public Integer count(@RequestBody Reflection searchParam) {
        return ReflectionService.count(searchParam);
    }

    //修改
    @RequestMapping("/update")
    @ResponseBody
    @Override
    public Integer update(@RequestBody Reflection searchParam) {
        return ReflectionService.update(searchParam);
    }

    //新增
    @RequestMapping("/add")
    @ResponseBody
    @Override
    public Integer add(@RequestBody Reflection searchParam) {
        return ReflectionService.add(searchParam);
    }

    @RequestMapping("/addS")
    @ResponseBody
    @Override
    public Integer addS(List<Reflection> t) {
        return ReflectionService.addS(t);
    }

    //删除
    @RequestMapping("/del")
    @ResponseBody
    @Override
    public Integer del(@RequestBody Reflection searchParam) {
        return ReflectionService.del(searchParam);
    }

}
