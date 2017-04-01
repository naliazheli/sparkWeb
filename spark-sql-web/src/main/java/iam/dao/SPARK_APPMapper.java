package iam.dao;

import iam.db.SPARK_APP;
import org.springframework.stereotype.Repository;

@Repository
public interface SPARK_APPMapper {
    int deleteByPrimaryKey(Long APP_ID);

    int insert(SPARK_APP record);

    int insertSelective(SPARK_APP record);

    SPARK_APP selectByPrimaryKey(Long APP_ID);

    int updateByPrimaryKeySelective(SPARK_APP record);

    int updateByPrimaryKey(SPARK_APP record);
}