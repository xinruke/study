package com.xinruke.user.controller;

import com.xinruke.commoditystarter.service.CommodityService;
import com.xinruke.common.vo.ResultVO;
import com.xinruke.common.vo.query.RowsDataVO;
import com.xinruke.user.dto.UserInfoAddVO;
import com.xinruke.user.dto.UserInfoQueryDTO;
import com.xinruke.user.dto.UserInfoQueryResultDTO;
import com.xinruke.user.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/info")
@Api(tags = "用户信息")
public class UserInfoController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CommodityService commodityService;
    @Autowired
    UserInfoService userInfoService;

    @PostMapping(value = "add")
    @ApiOperation(value = "添加用户信息", response = ResultVO.class)
    public ResultVO addUserInfo(@RequestBody @Validated UserInfoAddVO userInfoAddVO, BindingResult bindingResult) {
        logger.info("name[" + userInfoAddVO.getName() + "]password[" + userInfoAddVO.getPassword() + "]");
        ResultVO resultVO = new ResultVO(ResultVO.FAIL);

        /*String[] configs = commodityService.split(",");
        for (String config : configs) {
            logger.info("commodity-starter,config=" + config);
        }*/


        if (bindingResult.hasErrors()) {
            for (ObjectError objectError : bindingResult.getAllErrors()) {
                logger.error("BindingResult[" + objectError.getCodes()[0] + "=" + objectError.getDefaultMessage() + "]");
            }
            String result = bindingResult.getAllErrors().get(0).getDefaultMessage();
            resultVO.setMessage(result);
            return resultVO;
        }

        int ret = userInfoService.addUser(userInfoAddVO);
        logger.info("addUser=" + ret);
        if (ret > 0) {
            resultVO.setCode(ResultVO.SUCCESS);
            resultVO.setMessage("添加用户信息成功");
        }

        return resultVO;
    }

    @PostMapping(value = "list")
    @ApiOperation(value = "查询用户信息", response = UserInfoQueryResultDTO.class)
    public ResultVO getUserInfoList(@RequestBody UserInfoQueryDTO userInfoQueryDTO) {
        ResultVO resultVO = new ResultVO(ResultVO.FAIL);

        try {
            RowsDataVO<UserInfoQueryResultDTO> rowsDataVO = userInfoService.getUserInfoList(userInfoQueryDTO);

            resultVO.setCode(ResultVO.SUCCESS);
            resultVO.setMessage("查询成功");
            resultVO.setData(rowsDataVO);
        } catch (Exception e) {
            logger.error("系统异常", e);
        }

        return resultVO;
    }
}
