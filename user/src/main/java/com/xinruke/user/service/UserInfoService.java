package com.xinruke.user.service;

import com.xinruke.common.vo.query.RowsDataVO;
import com.xinruke.user.dto.UserInfoAddVO;
import com.xinruke.user.dto.UserInfoQueryDTO;
import com.xinruke.user.dto.UserInfoQueryResultDTO;

public interface UserInfoService {
    public int addUser(UserInfoAddVO userInfoAddVO);

    public RowsDataVO<UserInfoQueryResultDTO> getUserInfoList(UserInfoQueryDTO userInfoQueryDTO);
}
