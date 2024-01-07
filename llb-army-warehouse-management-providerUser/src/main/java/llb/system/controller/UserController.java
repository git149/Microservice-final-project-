package llb.system.controller;


import llb.common.BaseInterface;
import llb.common.entity.User;
import llb.system.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/User")
public class UserController implements BaseInterface<User> {

    @Autowired
    private UserService UserService;


    //查询
    @RequestMapping("/getAll")
    @ResponseBody
    @Override
    public List<User> getAll(@RequestBody User searchParam) {
        return UserService.getAll(searchParam);
    }

    //查询
    @RequestMapping("/getAll2Page")
    @ResponseBody
    @Override
    public List<User> getAll2Page(@RequestBody User searchParam) {
        return UserService.getAll2Page(searchParam);
    }

    //查询
    @RequestMapping("/get")
    @ResponseBody
    @Override
    public User get(@RequestBody User searchParam) {
        return UserService.get(searchParam);
    }


    //总数
    @RequestMapping("/count")
    @ResponseBody
    @Override
    public Integer count(@RequestBody User searchParam) {
        return UserService.count(searchParam);
    }

    //修改
    @RequestMapping("/update")
    @ResponseBody
    @Override
    public Integer update(@RequestBody User searchParam) {
        return UserService.update(searchParam);
    }

    //新增
    @RequestMapping("/add")
    @ResponseBody
    @Override
    public Integer add(@RequestBody User searchParam) {
        return UserService.add(searchParam);
    }

    @RequestMapping("/addS")
    @ResponseBody
    @Override
    public Integer addS(List<User> t) {
        return UserService.addS(t);
    }

    //删除
    @RequestMapping("/del")
    @ResponseBody
    @Override
    public Integer del(@RequestBody User searchParam) {
        return UserService.del(searchParam);
    }

}
