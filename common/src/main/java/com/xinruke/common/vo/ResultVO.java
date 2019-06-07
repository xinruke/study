package com.xinruke.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName ResultVO.java
 * @CreateDate 2019/6/7
 * @Author FengXinQiang
 * @Version V1.0.0.0
 * @Decription 通用结果
 */
@ApiModel("通用结果")
public class ResultVO<T> {
    //成功
    public static final long SUCCESS = 1;
    //失败
    public static final long FAIL = -1;

    @ApiModelProperty("返回码")
    private long code;
    @ApiModelProperty("返回信息")
    private String message;
    @ApiModelProperty("返回数据")
    private T data;

    /**
     * @param code
     */
    public ResultVO(long code) {
        this.code = code;
        if (code == this.SUCCESS) {
            this.message = "成功";
        } else {
            this.message = "失败";
        }
    }

    /**
     * @param code
     * @param message
     */
    public ResultVO(long code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @param code
     * @param message
     * @param data
     */
    public ResultVO(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
