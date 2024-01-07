package llb.system.service;


import llb.common.BaseDao;
import llb.common.BaseServiceImpl;
import llb.common.entity.Analyse;
import llb.system.dao.AnalyseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AnalyseService extends BaseServiceImpl<Analyse> {
    @Autowired
    private AnalyseDAO AnalyseDAO;

    @Override
    public BaseDao thisBaseDao() {
        return AnalyseDAO;
    }
   public List<Analyse> AnalyseTable(Analyse Analyse){
        return AnalyseDAO.AnalyseTable(Analyse);
    }


}
