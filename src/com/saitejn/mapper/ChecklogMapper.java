package com.saitejn.mapper;

import com.saitejn.pojo.Checklog;
import com.saitejn.pojo.ChecklogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChecklogMapper {
    int countByExample(ChecklogExample example);
    int deleteByExample(ChecklogExample example);
    int deleteByPrimaryKey(Integer id);
    int insert(Checklog record);
    int insertSelective(Checklog record);
    List<Checklog> selectByExample(ChecklogExample example);
    Checklog selectByPrimaryKey(Integer id);
    int updateByExampleSelective(@Param("record") Checklog record, @Param("example") ChecklogExample example);
    int updateByExample(@Param("record") Checklog record, @Param("example") ChecklogExample example);
    int updateByPrimaryKeySelective(Checklog record);
    int updateByPrimaryKey(Checklog record);
}