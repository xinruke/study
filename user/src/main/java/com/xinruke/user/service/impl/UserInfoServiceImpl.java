package com.xinruke.user.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xinruke.common.vo.query.RowsDataVO;
import com.xinruke.user.dto.UserInfoAddVO;
import com.xinruke.user.dto.UserInfoQueryDTO;
import com.xinruke.user.dto.UserInfoQueryResultDTO;
import com.xinruke.user.mapper.UserInfoMapper;
import com.xinruke.user.po.UserInfoPO;
import com.xinruke.user.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserInfoMapper userInfoMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addUser(UserInfoAddVO userInfoAddVO) {
        UserInfoPO userInfoPO = new UserInfoPO();
//        userInfoPO.setId();
        userInfoPO.setName(userInfoAddVO.getName());
        userInfoPO.setPassword(userInfoAddVO.getPassword());
        return userInfoMapper.insert(userInfoPO);
    }

    @Override
    public RowsDataVO<UserInfoQueryResultDTO> getUserInfoList(UserInfoQueryDTO userInfoQueryDTO) {
        RowsDataVO<UserInfoQueryResultDTO> rowsDataVO = new RowsDataVO<>();
        List<UserInfoQueryResultDTO> resultList = new ArrayList<>();

        Example example = new Example(UserInfoPO.class);
        Example.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(userInfoQueryDTO.getName())) {
            criteria.andEqualTo("name", userInfoQueryDTO.getName());
        }
        example.orderBy("id").asc();

        Page<UserInfoPO> page = PageHelper.startPage(userInfoQueryDTO.getPageNo(), userInfoQueryDTO.getPageSize());
        List<UserInfoPO> list = userInfoMapper.selectByExample(example);

        if (list != null && list.size() > 0) {
            for (UserInfoPO userInfoPO : list) {
                UserInfoQueryResultDTO userInfoQueryResultDTO = new UserInfoQueryResultDTO();
                userInfoQueryResultDTO.transfer(userInfoPO);
                resultList.add(userInfoQueryResultDTO);
            }
        }

        rowsDataVO.setPageNo(page.getPageNum());
        rowsDataVO.setTotalRecords(page.getTotal());
        rowsDataVO.setTotalPages(page.getPages());
        rowsDataVO.setRows(resultList);

        return rowsDataVO;
    }

}
