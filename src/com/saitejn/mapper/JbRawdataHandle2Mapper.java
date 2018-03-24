package com.saitejn.mapper;

import com.saitejn.pojo.JbRawdataHandle2;
import com.saitejn.pojo.JbRawdataHandle2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JbRawdataHandle2Mapper {
    int countByExample(JbRawdataHandle2Example example);

    int deleteByExample(JbRawdataHandle2Example example);

    int deleteByPrimaryKey(Integer orig_id);

    int insert(JbRawdataHandle2 record);

    int insertSelective(JbRawdataHandle2 record);

    List<JbRawdataHandle2> selectByExample(JbRawdataHandle2Example example);

    JbRawdataHandle2 selectByPrimaryKey(Integer orig_id);

    int updateByExampleSelective(@Param("record") JbRawdataHandle2 record, @Param("example") JbRawdataHandle2Example example);

    int updateByExample(@Param("record") JbRawdataHandle2 record, @Param("example") JbRawdataHandle2Example example);

    int updateByPrimaryKeySelective(JbRawdataHandle2 record);

    int updateByPrimaryKey(JbRawdataHandle2 record);
}