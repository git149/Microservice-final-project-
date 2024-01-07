package llb.system.controller;


import llb.common.BaseInterface;
import llb.common.entity.Item;
import llb.system.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/Item")
public class ItemController implements BaseInterface<Item> {

    @Autowired
    private ItemService ItemService;


    //查询
    @RequestMapping("/getAll")
    @ResponseBody
    @Override
    public List<Item> getAll(@RequestBody Item searchParam) {
        return ItemService.getAll(searchParam);
    }

    @RequestMapping("/updateCk")
    @ResponseBody
    public int updateCk(@RequestBody Item searchParam) {
        return ItemService.updateCk(searchParam);
    }

    //查询
    @RequestMapping("/getAll2Page")
    @ResponseBody
    @Override
    public List<Item> getAll2Page(@RequestBody Item searchParam) {
        return ItemService.getAll2Page(searchParam);
    }

    //查询
    @RequestMapping("/get")
    @ResponseBody
    @Override
    public Item get(@RequestBody Item searchParam) {
        return ItemService.get(searchParam);
    }


    //总数
    @RequestMapping("/count")
    @ResponseBody
    @Override
    public Integer count(@RequestBody Item searchParam) {
        return ItemService.count(searchParam);
    }

    //修改
    @RequestMapping("/update")
    @ResponseBody
    @Override
    public Integer update(@RequestBody Item searchParam) {
        return ItemService.update(searchParam);
    }

    //新增
    @RequestMapping("/add")
    @ResponseBody
    @Override
    public Integer add(@RequestBody Item searchParam) {
        return ItemService.add(searchParam);
    }

    @RequestMapping("/addS")
    @ResponseBody
    @Override
    public Integer addS(List<Item> t) {
        return ItemService.addS(t);
    }

    //删除
    @RequestMapping("/del")
    @ResponseBody
    @Override
    public Integer del(@RequestBody Item searchParam) {
        return ItemService.del(searchParam);
    }

}
