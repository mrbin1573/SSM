package com.saitejn.mapper;

import com.saitejn.pojo.JbRawdataMiddle;
import com.saitejn.pojo.JbRawdataMiddleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JbRawdataMiddleMapper {
    int countByExample(JbRawdataMiddleExample example);

    int deleteByExample(JbRawdataMiddleExample example);

    int deleteByPrimaryKey(Integer orig_id);

    int insert(JbRawdataMiddle record);

    int insertSelective(JbRawdataMiddle record);

    List<JbRawdataMiddle> selectByExample(JbRawdataMiddleExample example);

    JbRawdataMiddle selectByPrimaryKey(Integer orig_id);

    int updateByExampleSelective(@Param("record") JbRawdataMiddle record, @Param("example") JbRawdataMiddleExample example);

    int updateByExample(@Param("record") JbRawdataMiddle record, @Param("example") JbRawdataMiddleExample example);

    int updateByPrimaryKeySelective(JbRawdataMiddle record);

    int updateByPrimaryKey(JbRawdataMiddle record);
}