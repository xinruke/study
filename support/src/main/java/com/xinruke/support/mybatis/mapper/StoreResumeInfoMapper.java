package com.xinruke.support.mybatis.mapper;

import com.xinruke.support.mybatis.bean.StoreResumeInfo;
import com.xinruke.support.mybatis.bean.StoreResumeInfoExample;
import java.util.List;

public interface StoreResumeInfoMapper {
    /**
     *
     * @mbggenerated 2019-06-05
     */
    int countByExample(StoreResumeInfoExample example);

    /**
     *
     * @mbggenerated 2019-06-05
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-06-05
     */
    int insertSelective(StoreResumeInfo record);

    /**
     *
     * @mbggenerated 2019-06-05
     */
    List<StoreResumeInfo> selectByExample(StoreResumeInfoExample example);

    /**
     *
     * @mbggenerated 2019-06-05
     */
    StoreResumeInfo selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-06-05
     */
    int updateByPrimaryKeySelective(StoreResumeInfo record);
}