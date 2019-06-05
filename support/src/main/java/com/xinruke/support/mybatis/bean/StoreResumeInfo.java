package com.xinruke.support.mybatis.bean;

import java.io.Serializable;
import java.util.Date;

public class StoreResumeInfo implements Serializable {
    /**
     * null
     */
    @ApiModelProperty("null")
    private Long id;

    /**
     * 商户编号
     */
    @ApiModelProperty("商户编号")
    private String storeCode;

    /**
     * 公司名称
     */
    @ApiModelProperty("公司名称")
    private String companyName;

    /**
     * 所属行业
     */
    @ApiModelProperty("所属行业")
    private String industry;

    /**
     * 是否合伙
     */
    @ApiModelProperty("是否合伙")
    private String isPartner;

    /**
     * 投资关系
     */
    @ApiModelProperty("投资关系")
    private String investment;

    /**
     * 店铺面积
     */
    @ApiModelProperty("店铺面积")
    private String shopSpace;

    /**
     * 员工人数
     */
    @ApiModelProperty("员工人数")
    private String employeeCount;

    /**
     * 开业时间
     */
    @ApiModelProperty("开业时间")
    private String gmtOpen;

    /**
     * 开业状态
     */
    @ApiModelProperty("开业状态")
    private String openStatus;

    /**
     * 门店装修状态
     */
    @ApiModelProperty("门店装修状态")
    private String designStatus;

    /**
     * 代理数量
     */
    @ApiModelProperty("代理数量")
    private String proxyCount;

    /**
     * 签约人
     */
    @ApiModelProperty("签约人")
    private String signer;

    /**
     * 店面负责人
     */
    @ApiModelProperty("店面负责人")
    private String shopManager;

    /**
     * 店面负责人职务
     */
    @ApiModelProperty("店面负责人职务")
    private String shopManagerTitle;

    /**
     * 店面负责人电话
     */
    @ApiModelProperty("店面负责人电话")
    private String shopManagerPhone;

    /**
     * 店铺位置
     */
    @ApiModelProperty("店铺位置")
    private String shopManagerArea;

    /**
     * 渠道负责人
     */
    @ApiModelProperty("渠道负责人")
    private String channelManager;

    /**
     * 业务负责人
     */
    @ApiModelProperty("业务负责人")
    private String businessManager;

    /**
     * 总经理
     */
    @ApiModelProperty("总经理")
    private String generalManager;

    /**
     * 日期
     */
    @ApiModelProperty("日期")
    private String gmtJoin;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private Date gmtModify;

    /**
     * 商户类型1个人2公司
     */
    @ApiModelProperty("商户类型1个人2公司")
    private Short storeType;

    private static final long serialVersionUID = 1L;

    /**
     * null
     * @return ID null
     */
    public Long getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 商户编号
     * @return STORE_CODE 商户编号
     */
    public String getStoreCode() {
        return storeCode;
    }

    /**
     * 商户编号
     * @param storeCode 商户编号
     */
    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode == null ? null : storeCode.trim();
    }

    /**
     * 公司名称
     * @return COMPANY_NAME 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 公司名称
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 所属行业
     * @return INDUSTRY 所属行业
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 所属行业
     * @param industry 所属行业
     */
    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    /**
     * 是否合伙
     * @return IS_PARTNER 是否合伙
     */
    public String getIsPartner() {
        return isPartner;
    }

    /**
     * 是否合伙
     * @param isPartner 是否合伙
     */
    public void setIsPartner(String isPartner) {
        this.isPartner = isPartner == null ? null : isPartner.trim();
    }

    /**
     * 投资关系
     * @return INVESTMENT 投资关系
     */
    public String getInvestment() {
        return investment;
    }

    /**
     * 投资关系
     * @param investment 投资关系
     */
    public void setInvestment(String investment) {
        this.investment = investment == null ? null : investment.trim();
    }

    /**
     * 店铺面积
     * @return SHOP_SPACE 店铺面积
     */
    public String getShopSpace() {
        return shopSpace;
    }

    /**
     * 店铺面积
     * @param shopSpace 店铺面积
     */
    public void setShopSpace(String shopSpace) {
        this.shopSpace = shopSpace == null ? null : shopSpace.trim();
    }

    /**
     * 员工人数
     * @return EMPLOYEE_COUNT 员工人数
     */
    public String getEmployeeCount() {
        return employeeCount;
    }

    /**
     * 员工人数
     * @param employeeCount 员工人数
     */
    public void setEmployeeCount(String employeeCount) {
        this.employeeCount = employeeCount == null ? null : employeeCount.trim();
    }

    /**
     * 开业时间
     * @return GMT_OPEN 开业时间
     */
    public String getGmtOpen() {
        return gmtOpen;
    }

    /**
     * 开业时间
     * @param gmtOpen 开业时间
     */
    public void setGmtOpen(String gmtOpen) {
        this.gmtOpen = gmtOpen == null ? null : gmtOpen.trim();
    }

    /**
     * 开业状态
     * @return OPEN_STATUS 开业状态
     */
    public String getOpenStatus() {
        return openStatus;
    }

    /**
     * 开业状态
     * @param openStatus 开业状态
     */
    public void setOpenStatus(String openStatus) {
        this.openStatus = openStatus == null ? null : openStatus.trim();
    }

    /**
     * 门店装修状态
     * @return DESIGN_STATUS 门店装修状态
     */
    public String getDesignStatus() {
        return designStatus;
    }

    /**
     * 门店装修状态
     * @param designStatus 门店装修状态
     */
    public void setDesignStatus(String designStatus) {
        this.designStatus = designStatus == null ? null : designStatus.trim();
    }

    /**
     * 代理数量
     * @return PROXY_COUNT 代理数量
     */
    public String getProxyCount() {
        return proxyCount;
    }

    /**
     * 代理数量
     * @param proxyCount 代理数量
     */
    public void setProxyCount(String proxyCount) {
        this.proxyCount = proxyCount == null ? null : proxyCount.trim();
    }

    /**
     * 签约人
     * @return SIGNER 签约人
     */
    public String getSigner() {
        return signer;
    }

    /**
     * 签约人
     * @param signer 签约人
     */
    public void setSigner(String signer) {
        this.signer = signer == null ? null : signer.trim();
    }

    /**
     * 店面负责人
     * @return SHOP_MANAGER 店面负责人
     */
    public String getShopManager() {
        return shopManager;
    }

    /**
     * 店面负责人
     * @param shopManager 店面负责人
     */
    public void setShopManager(String shopManager) {
        this.shopManager = shopManager == null ? null : shopManager.trim();
    }

    /**
     * 店面负责人职务
     * @return SHOP_MANAGER_TITLE 店面负责人职务
     */
    public String getShopManagerTitle() {
        return shopManagerTitle;
    }

    /**
     * 店面负责人职务
     * @param shopManagerTitle 店面负责人职务
     */
    public void setShopManagerTitle(String shopManagerTitle) {
        this.shopManagerTitle = shopManagerTitle == null ? null : shopManagerTitle.trim();
    }

    /**
     * 店面负责人电话
     * @return SHOP_MANAGER_PHONE 店面负责人电话
     */
    public String getShopManagerPhone() {
        return shopManagerPhone;
    }

    /**
     * 店面负责人电话
     * @param shopManagerPhone 店面负责人电话
     */
    public void setShopManagerPhone(String shopManagerPhone) {
        this.shopManagerPhone = shopManagerPhone == null ? null : shopManagerPhone.trim();
    }

    /**
     * 店铺位置
     * @return SHOP_MANAGER_AREA 店铺位置
     */
    public String getShopManagerArea() {
        return shopManagerArea;
    }

    /**
     * 店铺位置
     * @param shopManagerArea 店铺位置
     */
    public void setShopManagerArea(String shopManagerArea) {
        this.shopManagerArea = shopManagerArea == null ? null : shopManagerArea.trim();
    }

    /**
     * 渠道负责人
     * @return CHANNEL_MANAGER 渠道负责人
     */
    public String getChannelManager() {
        return channelManager;
    }

    /**
     * 渠道负责人
     * @param channelManager 渠道负责人
     */
    public void setChannelManager(String channelManager) {
        this.channelManager = channelManager == null ? null : channelManager.trim();
    }

    /**
     * 业务负责人
     * @return BUSINESS_MANAGER 业务负责人
     */
    public String getBusinessManager() {
        return businessManager;
    }

    /**
     * 业务负责人
     * @param businessManager 业务负责人
     */
    public void setBusinessManager(String businessManager) {
        this.businessManager = businessManager == null ? null : businessManager.trim();
    }

    /**
     * 总经理
     * @return GENERAL_MANAGER 总经理
     */
    public String getGeneralManager() {
        return generalManager;
    }

    /**
     * 总经理
     * @param generalManager 总经理
     */
    public void setGeneralManager(String generalManager) {
        this.generalManager = generalManager == null ? null : generalManager.trim();
    }

    /**
     * 日期
     * @return GMT_JOIN 日期
     */
    public String getGmtJoin() {
        return gmtJoin;
    }

    /**
     * 日期
     * @param gmtJoin 日期
     */
    public void setGmtJoin(String gmtJoin) {
        this.gmtJoin = gmtJoin == null ? null : gmtJoin.trim();
    }

    /**
     * 创建时间
     * @return GMT_CREATE 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 创建时间
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 修改时间
     * @return GMT_MODIFY 修改时间
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * 修改时间
     * @param gmtModify 修改时间
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * 商户类型1个人2公司
     * @return STORE_TYPE 商户类型1个人2公司
     */
    public Short getStoreType() {
        return storeType;
    }

    /**
     * 商户类型1个人2公司
     * @param storeType 商户类型1个人2公司
     */
    public void setStoreType(Short storeType) {
        this.storeType = storeType;
    }
}