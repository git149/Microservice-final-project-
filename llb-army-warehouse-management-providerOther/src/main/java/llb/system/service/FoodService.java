package llb.system.service;


import llb.common.BaseDao;
import llb.common.BaseServiceImpl;
import llb.common.entity.Food;
import llb.system.dao.FoodDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FoodService extends BaseServiceImpl<Food> {
    @Autowired
    private FoodDAO FoodDAO;

    @Override
    public BaseDao thisBaseDao() {
        return FoodDAO;
    }



}
