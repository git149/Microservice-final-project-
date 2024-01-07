package llb.system.dao;

import llb.common.BaseDao;
import llb.common.entity.Analyse;
import llb.common.entity.Reflection;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ReflectionDAO extends BaseDao<Reflection> {

    List<Analyse> AnalyseReflection(Analyse Analyse);
}
