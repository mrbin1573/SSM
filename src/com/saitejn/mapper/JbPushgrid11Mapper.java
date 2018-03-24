package com.saitejn.mapper;

import com.saitejn.pojo.JbPushgrid11;
import com.saitejn.pojo.JbPushgrid11Example;
import com.saitejn.pojo.JbPushgrid11WithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JbPushgrid11Mapper {
    int countByExample(JbPushgrid11Example example);

    int deleteByExample(JbPushgrid11Example example);

    int deleteByPrimaryKey(Integer 序号);

    int insert(JbPushgrid11WithBLOBs record);

    int insertSelective(JbPushgrid11WithBLOBs record);

    List<JbPushgrid11WithBLOBs> selectByExampleWithBLOBs(JbPushgrid11Example example);

    List<JbPushgrid11> selectByExample(JbPushgrid11Example example);

    JbPushgrid11WithBLOBs selectByPrimaryKey(Integer 序号);

    int updateByExampleSelective(@Param("record") JbPushgrid11WithBLOBs record, @Param("example") JbPushgrid11Example example);

    int updateByExampleWithBLOBs(@Param("record") JbPushgrid11WithBLOBs record, @Param("example") JbPushgrid11Example example);

    int updateByExample(@Param("record") JbPushgrid11 record, @Param("example") JbPushgrid11Example example);

    int updateByPrimaryKeySelective(JbPushgrid11WithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(JbPushgrid11WithBLOBs record);

    int updateByPrimaryKey(JbPushgrid11 record);
}