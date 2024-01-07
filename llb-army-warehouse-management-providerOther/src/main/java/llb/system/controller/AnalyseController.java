package llb.system.controller;


import llb.common.entity.Analyse;
import llb.system.service.AnalyseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/Analyse")
public class AnalyseController {

    @Autowired
    private AnalyseService AnalyseService;

    //查询
    @RequestMapping("/AnalyseTable")
    @ResponseBody
    public List<Analyse> AnalyseTable(@RequestBody Analyse searchParam) {
        return AnalyseService.AnalyseTable(searchParam);
    }


}
