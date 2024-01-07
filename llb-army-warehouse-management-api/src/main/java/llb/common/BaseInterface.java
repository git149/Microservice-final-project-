package llb.common;

import java.util.List;

public interface BaseInterface<T> {
    //查询全部
    List<T> getAll2Page(T t);
    //查询全部
    List<T> getAll(T t);
    //查询总数
    Integer count(T t);
    //查询
    T get(T t);
    //增加
    Integer add(T t);
    //批量新增
    Integer addS(List<T> t);
    //删除
    Integer del(T t);
    //修改
    Integer update(T t);
}
