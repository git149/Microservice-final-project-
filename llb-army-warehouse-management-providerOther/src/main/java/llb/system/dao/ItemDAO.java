package llb.system.dao;

import llb.common.BaseDao;
import llb.common.entity.Item;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemDAO extends BaseDao<Item> {
    //修改
    int updateCk(Item Item);

}
