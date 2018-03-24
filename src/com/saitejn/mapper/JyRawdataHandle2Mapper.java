package com.saitejn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.saitejn.pojo.JyRawdataHandle2;
import com.saitejn.pojo.JyRawdataHandle2Example;

public interface JyRawdataHandle2Mapper {
    int countByExample(JyRawdataHandle2Example example);

    int deleteByExample(JyRawdataHandle2Example example);

    int insert(JyRawdataHandle2 record);

    int insertSelective(JyRawdataHandle2 record);

    List<JyRawdataHandle2> selectByExample(JyRawdataHandle2Example example);

    int updateByExampleSelective(@Param("record") JyRawdataHandle2 record, @Param("example") JyRawdataHandle2Example example);

    int updateByExample(@Param("record") JyRawdataHandle2 record, @Param("example") JyRawdataHandle2Example example);
}