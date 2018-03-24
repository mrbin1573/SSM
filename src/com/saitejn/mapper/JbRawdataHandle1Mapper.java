package com.saitejn.mapper;

import com.saitejn.pojo.JbRawdataHandle1;
import com.saitejn.pojo.JbRawdataHandle1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JbRawdataHandle1Mapper {
    int countByExample(JbRawdataHandle1Example example);

    int deleteByExample(JbRawdataHandle1Example example);

    int deleteByPrimaryKey(Integer orig_id);

    int insert(JbRawdataHandle1 record);

    int insertSelective(JbRawdataHandle1 record);

    List<JbRawdataHandle1> selectByExample(JbRawdataHandle1Example example);

    JbRawdataHandle1 selectByPrimaryKey(Integer orig_id);

    int updateByExampleSelective(@Param("record") JbRawdataHandle1 record, @Param("example") JbRawdataHandle1Example example);

    int updateByExample(@Param("record") JbRawdataHandle1 record, @Param("example") JbRawdataHandle1Example example);

    int updateByPrimaryKeySelective(JbRawdataHandle1 record);

    int updateByPrimaryKey(JbRawdataHandle1 record);
}