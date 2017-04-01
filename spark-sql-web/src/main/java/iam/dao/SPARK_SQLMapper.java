package iam.dao;

import iam.db.SPARK_SQL;
import iam.db.SPARK_SQLKey;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("sPARK_SQLMapper")
public interface SPARK_SQLMapper {
    int deleteByPrimaryKey(SPARK_SQLKey key);

    int insert(SPARK_SQL record);

    int insertSelective(SPARK_SQL record);

    SPARK_SQL selectByPrimaryKey(SPARK_SQLKey key);

    List<SPARK_SQL> selectByAppId(Long sql_id);

    int updateByPrimaryKeySelective(SPARK_SQL record);

    int updateByPrimaryKeyWithBLOBs(SPARK_SQL record);

    int updateByPrimaryKey(SPARK_SQL record);
}