package llb.common;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseServiceImpl<T> implements BaseServiceInterface<T> {

    public abstract BaseDao<T> thisBaseDao();


    @Override
    public List<T> getAll2Page(T t) {
        List<T> allT = new ArrayList<>();
        try {
            allT = this.thisBaseDao().getAll2Page(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allT;
    }

    @Override
    public List<T> getAll(T t) {
        List<T> allT = new ArrayList<>();
        try {
            allT = this.thisBaseDao().getAll(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allT;
    }

    @Override
    public Integer count(T t) {
        return this.thisBaseDao().count(t);
    }

    @Override
    public T get(T t) {
        T TSearch = null;
        try {
            TSearch = this.thisBaseDao().get(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return TSearch;
    }

    @Override
    public Integer add(T t) {

        return this.thisBaseDao().add(t);
    }

    @Override
    public Integer addS(List<T> t) {
        return this.thisBaseDao().addS(t);
    }

    @Override
    public Integer del(T t) {
        return this.thisBaseDao().del(t);
    }

    @Override
    public Integer update(T t) {
        return this.thisBaseDao().update(t);
    }


}
