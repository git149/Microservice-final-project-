package llb.system.dao;

import llb.common.BaseDao;
import llb.common.entity.Analyse;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AnalyseDAO extends BaseDao<Analyse> {

    List<Analyse> AnalyseTable(Analyse Analyse);
}
