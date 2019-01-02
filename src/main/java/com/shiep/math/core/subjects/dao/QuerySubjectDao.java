package com.shiep.math.core.subjects.dao;

import com.shiep.math.core.subjects.entity.MathSubjectDTO;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("querySubjectDao")
@Mapper
public interface QuerySubjectDao {

    List<MathSubjectDTO> listMathSubject(MathSubjectDTO mathSubjectDTO);

}
