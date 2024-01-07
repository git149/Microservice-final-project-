package llb.system.controller;


import llb.common.BaseInterface;
import llb.common.entity.Food;
import llb.system.service.FoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/Food")
public class FoodController implements BaseInterface<Food> {

    @Autowired
    private FoodService FoodService;


    //查询
    @RequestMapping("/getAll")
    @ResponseBody
    @Override
    public List<Food> getAll(@RequestBody Food searchParam) {
        return FoodService.getAll(searchParam);
    }

    //查询
    @RequestMapping("/getAll2Page")
    @ResponseBody
    @Override
    public List<Food> getAll2Page(@RequestBody Food searchParam) {
        return FoodService.getAll2Page(searchParam);
    }

    //查询
    @RequestMapping("/get")
    @ResponseBody
    @Override
    public Food get(@RequestBody Food searchParam) {
        return FoodService.get(searchParam);
    }


    //总数
    @RequestMapping("/count")
    @ResponseBody
    @Override
    public Integer count(@RequestBody Food searchParam) {
        return FoodService.count(searchParam);
    }

    //修改
    @RequestMapping("/update")
    @ResponseBody
    @Override
    public Integer update(@RequestBody Food searchParam) {
        return FoodService.update(searchParam);
    }

    //新增
    @RequestMapping("/add")
    @ResponseBody
    @Override
    public Integer add(@RequestBody Food searchParam) {
        return FoodService.add(searchParam);
    }

    @RequestMapping("/addS")
    @ResponseBody
    @Override
    public Integer addS(List<Food> t) {
        return FoodService.addS(t);
    }

    //删除
    @RequestMapping("/del")
    @ResponseBody
    @Override
    public Integer del(@RequestBody Food searchParam) {
        return FoodService.del(searchParam);
    }

}
