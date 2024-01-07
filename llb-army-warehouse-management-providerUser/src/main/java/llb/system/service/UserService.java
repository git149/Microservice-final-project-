package llb.system.service;


import llb.common.BaseDao;
import llb.common.BaseServiceImpl;
import llb.common.entity.User;
import llb.system.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService extends BaseServiceImpl<User> {
    @Autowired
    private UserDAO UserDAO;

    @Override
    public BaseDao thisBaseDao() {
        return UserDAO;
    }



}
