package com.shiep.math.core.TestDao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component("mathTestDao")
@Mapper
public interface MathTestDao {

    void saveMath(@Param("mathSubject") String mathSubject);

    String getSubject(@Param("id") Long id);

}
