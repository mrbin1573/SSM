package com.saitejn.mapper;

import com.saitejn.pojo.JbUserifo;
import com.saitejn.pojo.JbUserifoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JbUserifoMapper {
    int countByExample(JbUserifoExample example);

    int deleteByExample(JbUserifoExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(JbUserifo record);

    int insertSelective(JbUserifo record);

    List<JbUserifo> selectByExample(JbUserifoExample example);

    JbUserifo selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") JbUserifo record, @Param("example") JbUserifoExample example);

    int updateByExample(@Param("record") JbUserifo record, @Param("example") JbUserifoExample example);

    int updateByPrimaryKeySelective(JbUserifo record);

    int updateByPrimaryKey(JbUserifo record);
}