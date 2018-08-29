package com.io.ssm.module.domain.user;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CmUserMapper {
    long countByExample(CmUserExample example);

    int deleteByExample(CmUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(CmUser record);

    int insertSelective(CmUser record);

    List<CmUser> selectByExampleWithRowbounds(CmUserExample example, RowBounds rowBounds);

    List<CmUser> selectByExample(CmUserExample example);

    CmUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") CmUser record, @Param("example") CmUserExample example);

    int updateByExample(@Param("record") CmUser record, @Param("example") CmUserExample example);

    int updateByPrimaryKeySelective(CmUser record);

    int updateByPrimaryKey(CmUser record);
}