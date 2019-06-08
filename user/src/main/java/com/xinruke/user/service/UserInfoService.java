package com.xinruke.user.service;

import com.xinruke.common.vo.query.RowsDataVO;
import com.xinruke.user.dto.UserInfoAddVO;
import com.xinruke.user.dto.UserInfoQueryDTO;
import com.xinruke.user.dto.UserInfoQueryResultDTO;
import com.xinruke.user.dto.UserResultDTO;
import com.xinruke.user.po.UserInfoPO;

public interface UserInfoService {
     int addUser(UserInfoAddVO userInfoAddVO);

     RowsDataVO<UserInfoQueryResultDTO> getUserInfoList(UserInfoQueryDTO userInfoQueryDTO);

    void updateUserByPrimaryKeySelective(UserInfoPO userInfoPO);

    RowsDataVO<UserResultDTO> selectPmcUserList(UserInfoQueryDTO userInfoQueryDTO);
}
