package llb.system.service;


import llb.common.BaseDao;
import llb.common.BaseServiceImpl;
import llb.common.entity.Apparatus;
import llb.system.dao.ApparatusDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApparatusService extends BaseServiceImpl<Apparatus> {
    @Autowired
    private ApparatusDAO ApparatusDAO;

    @Override
    public BaseDao thisBaseDao() {
        return ApparatusDAO;
    }



}
