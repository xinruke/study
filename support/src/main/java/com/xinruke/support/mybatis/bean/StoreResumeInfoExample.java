package com.xinruke.support.mybatis.bean;

import com.xinruke.support.mybatis.generator.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreResumeInfoExample {
    /**
     * STORE_RESUME_INFO
     */
    protected String orderByClause;

    /**
     * STORE_RESUME_INFO
     */
    protected boolean distinct;

    /**
     * STORE_RESUME_INFO
     */
    protected List<Criteria> oredCriteria;

    /**
     * STORE_RESUME_INFO
     */
    protected Page page;

    /**
     * @mbggenerated 2019-06-05
     */
    public StoreResumeInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * @mbggenerated 2019-06-05
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbggenerated 2019-06-05
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbggenerated 2019-06-05
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbggenerated 2019-06-05
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbggenerated 2019-06-05
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbggenerated 2019-06-05
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbggenerated 2019-06-05
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbggenerated 2019-06-05
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbggenerated 2019-06-05
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbggenerated 2019-06-05
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @mbggenerated 2019-06-05
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * @mbggenerated 2019-06-05
     */
    public Page getPage() {
        return page;
    }

    /**
     * STORE_RESUME_INFO 2019-06-05
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIsNull() {
            addCriterion("STORE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIsNotNull() {
            addCriterion("STORE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeEqualTo(String value) {
            addCriterion("STORE_CODE =", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotEqualTo(String value) {
            addCriterion("STORE_CODE <>", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThan(String value) {
            addCriterion("STORE_CODE >", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_CODE >=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThan(String value) {
            addCriterion("STORE_CODE <", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThanOrEqualTo(String value) {
            addCriterion("STORE_CODE <=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLike(String value) {
            addCriterion("STORE_CODE like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotLike(String value) {
            addCriterion("STORE_CODE not like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIn(List<String> values) {
            addCriterion("STORE_CODE in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotIn(List<String> values) {
            addCriterion("STORE_CODE not in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeBetween(String value1, String value2) {
            addCriterion("STORE_CODE between", value1, value2, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotBetween(String value1, String value2) {
            addCriterion("STORE_CODE not between", value1, value2, "storeCode");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("INDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("INDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("INDUSTRY =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("INDUSTRY <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("INDUSTRY >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("INDUSTRY <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("INDUSTRY like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("INDUSTRY not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("INDUSTRY in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("INDUSTRY not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("INDUSTRY between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIsPartnerIsNull() {
            addCriterion("IS_PARTNER is null");
            return (Criteria) this;
        }

        public Criteria andIsPartnerIsNotNull() {
            addCriterion("IS_PARTNER is not null");
            return (Criteria) this;
        }

        public Criteria andIsPartnerEqualTo(String value) {
            addCriterion("IS_PARTNER =", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerNotEqualTo(String value) {
            addCriterion("IS_PARTNER <>", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerGreaterThan(String value) {
            addCriterion("IS_PARTNER >", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PARTNER >=", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerLessThan(String value) {
            addCriterion("IS_PARTNER <", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerLessThanOrEqualTo(String value) {
            addCriterion("IS_PARTNER <=", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerLike(String value) {
            addCriterion("IS_PARTNER like", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerNotLike(String value) {
            addCriterion("IS_PARTNER not like", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerIn(List<String> values) {
            addCriterion("IS_PARTNER in", values, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerNotIn(List<String> values) {
            addCriterion("IS_PARTNER not in", values, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerBetween(String value1, String value2) {
            addCriterion("IS_PARTNER between", value1, value2, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerNotBetween(String value1, String value2) {
            addCriterion("IS_PARTNER not between", value1, value2, "isPartner");
            return (Criteria) this;
        }

        public Criteria andInvestmentIsNull() {
            addCriterion("INVESTMENT is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentIsNotNull() {
            addCriterion("INVESTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentEqualTo(String value) {
            addCriterion("INVESTMENT =", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotEqualTo(String value) {
            addCriterion("INVESTMENT <>", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentGreaterThan(String value) {
            addCriterion("INVESTMENT >", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTMENT >=", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentLessThan(String value) {
            addCriterion("INVESTMENT <", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentLessThanOrEqualTo(String value) {
            addCriterion("INVESTMENT <=", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentLike(String value) {
            addCriterion("INVESTMENT like", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotLike(String value) {
            addCriterion("INVESTMENT not like", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentIn(List<String> values) {
            addCriterion("INVESTMENT in", values, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotIn(List<String> values) {
            addCriterion("INVESTMENT not in", values, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentBetween(String value1, String value2) {
            addCriterion("INVESTMENT between", value1, value2, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotBetween(String value1, String value2) {
            addCriterion("INVESTMENT not between", value1, value2, "investment");
            return (Criteria) this;
        }

        public Criteria andShopSpaceIsNull() {
            addCriterion("SHOP_SPACE is null");
            return (Criteria) this;
        }

        public Criteria andShopSpaceIsNotNull() {
            addCriterion("SHOP_SPACE is not null");
            return (Criteria) this;
        }

        public Criteria andShopSpaceEqualTo(String value) {
            addCriterion("SHOP_SPACE =", value, "shopSpace");
            return (Criteria) this;
        }

        public Criteria andShopSpaceNotEqualTo(String value) {
            addCriterion("SHOP_SPACE <>", value, "shopSpace");
            return (Criteria) this;
        }

        public Criteria andShopSpaceGreaterThan(String value) {
            addCriterion("SHOP_SPACE >", value, "shopSpace");
            return (Criteria) this;
        }

        public Criteria andShopSpaceGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_SPACE >=", value, "shopSpace");
            return (Criteria) this;
        }

        public Criteria andShopSpaceLessThan(String value) {
            addCriterion("SHOP_SPACE <", value, "shopSpace");
            return (Criteria) this;
        }

        public Criteria andShopSpaceLessThanOrEqualTo(String value) {
            addCriterion("SHOP_SPACE <=", value, "shopSpace");
            return (Criteria) this;
        }

        public Criteria andShopSpaceLike(String value) {
            addCriterion("SHOP_SPACE like", value, "shopSpace");
            return (Criteria) this;
        }

        public Criteria andShopSpaceNotLike(String value) {
            addCriterion("SHOP_SPACE not like", value, "shopSpace");
            return (Criteria) this;
        }

        public Criteria andShopSpaceIn(List<String> values) {
            addCriterion("SHOP_SPACE in", values, "shopSpace");
            return (Criteria) this;
        }

        public Criteria andShopSpaceNotIn(List<String> values) {
            addCriterion("SHOP_SPACE not in", values, "shopSpace");
            return (Criteria) this;
        }

        public Criteria andShopSpaceBetween(String value1, String value2) {
            addCriterion("SHOP_SPACE between", value1, value2, "shopSpace");
            return (Criteria) this;
        }

        public Criteria andShopSpaceNotBetween(String value1, String value2) {
            addCriterion("SHOP_SPACE not between", value1, value2, "shopSpace");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountIsNull() {
            addCriterion("EMPLOYEE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountIsNotNull() {
            addCriterion("EMPLOYEE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountEqualTo(String value) {
            addCriterion("EMPLOYEE_COUNT =", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountNotEqualTo(String value) {
            addCriterion("EMPLOYEE_COUNT <>", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountGreaterThan(String value) {
            addCriterion("EMPLOYEE_COUNT >", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_COUNT >=", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountLessThan(String value) {
            addCriterion("EMPLOYEE_COUNT <", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_COUNT <=", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountLike(String value) {
            addCriterion("EMPLOYEE_COUNT like", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountNotLike(String value) {
            addCriterion("EMPLOYEE_COUNT not like", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountIn(List<String> values) {
            addCriterion("EMPLOYEE_COUNT in", values, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountNotIn(List<String> values) {
            addCriterion("EMPLOYEE_COUNT not in", values, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_COUNT between", value1, value2, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_COUNT not between", value1, value2, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andGmtOpenIsNull() {
            addCriterion("GMT_OPEN is null");
            return (Criteria) this;
        }

        public Criteria andGmtOpenIsNotNull() {
            addCriterion("GMT_OPEN is not null");
            return (Criteria) this;
        }

        public Criteria andGmtOpenEqualTo(String value) {
            addCriterion("GMT_OPEN =", value, "gmtOpen");
            return (Criteria) this;
        }

        public Criteria andGmtOpenNotEqualTo(String value) {
            addCriterion("GMT_OPEN <>", value, "gmtOpen");
            return (Criteria) this;
        }

        public Criteria andGmtOpenGreaterThan(String value) {
            addCriterion("GMT_OPEN >", value, "gmtOpen");
            return (Criteria) this;
        }

        public Criteria andGmtOpenGreaterThanOrEqualTo(String value) {
            addCriterion("GMT_OPEN >=", value, "gmtOpen");
            return (Criteria) this;
        }

        public Criteria andGmtOpenLessThan(String value) {
            addCriterion("GMT_OPEN <", value, "gmtOpen");
            return (Criteria) this;
        }

        public Criteria andGmtOpenLessThanOrEqualTo(String value) {
            addCriterion("GMT_OPEN <=", value, "gmtOpen");
            return (Criteria) this;
        }

        public Criteria andGmtOpenLike(String value) {
            addCriterion("GMT_OPEN like", value, "gmtOpen");
            return (Criteria) this;
        }

        public Criteria andGmtOpenNotLike(String value) {
            addCriterion("GMT_OPEN not like", value, "gmtOpen");
            return (Criteria) this;
        }

        public Criteria andGmtOpenIn(List<String> values) {
            addCriterion("GMT_OPEN in", values, "gmtOpen");
            return (Criteria) this;
        }

        public Criteria andGmtOpenNotIn(List<String> values) {
            addCriterion("GMT_OPEN not in", values, "gmtOpen");
            return (Criteria) this;
        }

        public Criteria andGmtOpenBetween(String value1, String value2) {
            addCriterion("GMT_OPEN between", value1, value2, "gmtOpen");
            return (Criteria) this;
        }

        public Criteria andGmtOpenNotBetween(String value1, String value2) {
            addCriterion("GMT_OPEN not between", value1, value2, "gmtOpen");
            return (Criteria) this;
        }

        public Criteria andOpenStatusIsNull() {
            addCriterion("OPEN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOpenStatusIsNotNull() {
            addCriterion("OPEN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOpenStatusEqualTo(String value) {
            addCriterion("OPEN_STATUS =", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusNotEqualTo(String value) {
            addCriterion("OPEN_STATUS <>", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusGreaterThan(String value) {
            addCriterion("OPEN_STATUS >", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_STATUS >=", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusLessThan(String value) {
            addCriterion("OPEN_STATUS <", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusLessThanOrEqualTo(String value) {
            addCriterion("OPEN_STATUS <=", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusLike(String value) {
            addCriterion("OPEN_STATUS like", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusNotLike(String value) {
            addCriterion("OPEN_STATUS not like", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusIn(List<String> values) {
            addCriterion("OPEN_STATUS in", values, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusNotIn(List<String> values) {
            addCriterion("OPEN_STATUS not in", values, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusBetween(String value1, String value2) {
            addCriterion("OPEN_STATUS between", value1, value2, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusNotBetween(String value1, String value2) {
            addCriterion("OPEN_STATUS not between", value1, value2, "openStatus");
            return (Criteria) this;
        }

        public Criteria andDesignStatusIsNull() {
            addCriterion("DESIGN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDesignStatusIsNotNull() {
            addCriterion("DESIGN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDesignStatusEqualTo(String value) {
            addCriterion("DESIGN_STATUS =", value, "designStatus");
            return (Criteria) this;
        }

        public Criteria andDesignStatusNotEqualTo(String value) {
            addCriterion("DESIGN_STATUS <>", value, "designStatus");
            return (Criteria) this;
        }

        public Criteria andDesignStatusGreaterThan(String value) {
            addCriterion("DESIGN_STATUS >", value, "designStatus");
            return (Criteria) this;
        }

        public Criteria andDesignStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGN_STATUS >=", value, "designStatus");
            return (Criteria) this;
        }

        public Criteria andDesignStatusLessThan(String value) {
            addCriterion("DESIGN_STATUS <", value, "designStatus");
            return (Criteria) this;
        }

        public Criteria andDesignStatusLessThanOrEqualTo(String value) {
            addCriterion("DESIGN_STATUS <=", value, "designStatus");
            return (Criteria) this;
        }

        public Criteria andDesignStatusLike(String value) {
            addCriterion("DESIGN_STATUS like", value, "designStatus");
            return (Criteria) this;
        }

        public Criteria andDesignStatusNotLike(String value) {
            addCriterion("DESIGN_STATUS not like", value, "designStatus");
            return (Criteria) this;
        }

        public Criteria andDesignStatusIn(List<String> values) {
            addCriterion("DESIGN_STATUS in", values, "designStatus");
            return (Criteria) this;
        }

        public Criteria andDesignStatusNotIn(List<String> values) {
            addCriterion("DESIGN_STATUS not in", values, "designStatus");
            return (Criteria) this;
        }

        public Criteria andDesignStatusBetween(String value1, String value2) {
            addCriterion("DESIGN_STATUS between", value1, value2, "designStatus");
            return (Criteria) this;
        }

        public Criteria andDesignStatusNotBetween(String value1, String value2) {
            addCriterion("DESIGN_STATUS not between", value1, value2, "designStatus");
            return (Criteria) this;
        }

        public Criteria andProxyCountIsNull() {
            addCriterion("PROXY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andProxyCountIsNotNull() {
            addCriterion("PROXY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProxyCountEqualTo(String value) {
            addCriterion("PROXY_COUNT =", value, "proxyCount");
            return (Criteria) this;
        }

        public Criteria andProxyCountNotEqualTo(String value) {
            addCriterion("PROXY_COUNT <>", value, "proxyCount");
            return (Criteria) this;
        }

        public Criteria andProxyCountGreaterThan(String value) {
            addCriterion("PROXY_COUNT >", value, "proxyCount");
            return (Criteria) this;
        }

        public Criteria andProxyCountGreaterThanOrEqualTo(String value) {
            addCriterion("PROXY_COUNT >=", value, "proxyCount");
            return (Criteria) this;
        }

        public Criteria andProxyCountLessThan(String value) {
            addCriterion("PROXY_COUNT <", value, "proxyCount");
            return (Criteria) this;
        }

        public Criteria andProxyCountLessThanOrEqualTo(String value) {
            addCriterion("PROXY_COUNT <=", value, "proxyCount");
            return (Criteria) this;
        }

        public Criteria andProxyCountLike(String value) {
            addCriterion("PROXY_COUNT like", value, "proxyCount");
            return (Criteria) this;
        }

        public Criteria andProxyCountNotLike(String value) {
            addCriterion("PROXY_COUNT not like", value, "proxyCount");
            return (Criteria) this;
        }

        public Criteria andProxyCountIn(List<String> values) {
            addCriterion("PROXY_COUNT in", values, "proxyCount");
            return (Criteria) this;
        }

        public Criteria andProxyCountNotIn(List<String> values) {
            addCriterion("PROXY_COUNT not in", values, "proxyCount");
            return (Criteria) this;
        }

        public Criteria andProxyCountBetween(String value1, String value2) {
            addCriterion("PROXY_COUNT between", value1, value2, "proxyCount");
            return (Criteria) this;
        }

        public Criteria andProxyCountNotBetween(String value1, String value2) {
            addCriterion("PROXY_COUNT not between", value1, value2, "proxyCount");
            return (Criteria) this;
        }

        public Criteria andSignerIsNull() {
            addCriterion("SIGNER is null");
            return (Criteria) this;
        }

        public Criteria andSignerIsNotNull() {
            addCriterion("SIGNER is not null");
            return (Criteria) this;
        }

        public Criteria andSignerEqualTo(String value) {
            addCriterion("SIGNER =", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotEqualTo(String value) {
            addCriterion("SIGNER <>", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerGreaterThan(String value) {
            addCriterion("SIGNER >", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNER >=", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerLessThan(String value) {
            addCriterion("SIGNER <", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerLessThanOrEqualTo(String value) {
            addCriterion("SIGNER <=", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerLike(String value) {
            addCriterion("SIGNER like", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotLike(String value) {
            addCriterion("SIGNER not like", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerIn(List<String> values) {
            addCriterion("SIGNER in", values, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotIn(List<String> values) {
            addCriterion("SIGNER not in", values, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerBetween(String value1, String value2) {
            addCriterion("SIGNER between", value1, value2, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotBetween(String value1, String value2) {
            addCriterion("SIGNER not between", value1, value2, "signer");
            return (Criteria) this;
        }

        public Criteria andShopManagerIsNull() {
            addCriterion("SHOP_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andShopManagerIsNotNull() {
            addCriterion("SHOP_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andShopManagerEqualTo(String value) {
            addCriterion("SHOP_MANAGER =", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerNotEqualTo(String value) {
            addCriterion("SHOP_MANAGER <>", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerGreaterThan(String value) {
            addCriterion("SHOP_MANAGER >", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_MANAGER >=", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerLessThan(String value) {
            addCriterion("SHOP_MANAGER <", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerLessThanOrEqualTo(String value) {
            addCriterion("SHOP_MANAGER <=", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerLike(String value) {
            addCriterion("SHOP_MANAGER like", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerNotLike(String value) {
            addCriterion("SHOP_MANAGER not like", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerIn(List<String> values) {
            addCriterion("SHOP_MANAGER in", values, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerNotIn(List<String> values) {
            addCriterion("SHOP_MANAGER not in", values, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerBetween(String value1, String value2) {
            addCriterion("SHOP_MANAGER between", value1, value2, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerNotBetween(String value1, String value2) {
            addCriterion("SHOP_MANAGER not between", value1, value2, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleIsNull() {
            addCriterion("SHOP_MANAGER_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleIsNotNull() {
            addCriterion("SHOP_MANAGER_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleEqualTo(String value) {
            addCriterion("SHOP_MANAGER_TITLE =", value, "shopManagerTitle");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleNotEqualTo(String value) {
            addCriterion("SHOP_MANAGER_TITLE <>", value, "shopManagerTitle");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleGreaterThan(String value) {
            addCriterion("SHOP_MANAGER_TITLE >", value, "shopManagerTitle");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_MANAGER_TITLE >=", value, "shopManagerTitle");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleLessThan(String value) {
            addCriterion("SHOP_MANAGER_TITLE <", value, "shopManagerTitle");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleLessThanOrEqualTo(String value) {
            addCriterion("SHOP_MANAGER_TITLE <=", value, "shopManagerTitle");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleLike(String value) {
            addCriterion("SHOP_MANAGER_TITLE like", value, "shopManagerTitle");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleNotLike(String value) {
            addCriterion("SHOP_MANAGER_TITLE not like", value, "shopManagerTitle");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleIn(List<String> values) {
            addCriterion("SHOP_MANAGER_TITLE in", values, "shopManagerTitle");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleNotIn(List<String> values) {
            addCriterion("SHOP_MANAGER_TITLE not in", values, "shopManagerTitle");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleBetween(String value1, String value2) {
            addCriterion("SHOP_MANAGER_TITLE between", value1, value2, "shopManagerTitle");
            return (Criteria) this;
        }

        public Criteria andShopManagerTitleNotBetween(String value1, String value2) {
            addCriterion("SHOP_MANAGER_TITLE not between", value1, value2, "shopManagerTitle");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneIsNull() {
            addCriterion("SHOP_MANAGER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneIsNotNull() {
            addCriterion("SHOP_MANAGER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneEqualTo(String value) {
            addCriterion("SHOP_MANAGER_PHONE =", value, "shopManagerPhone");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneNotEqualTo(String value) {
            addCriterion("SHOP_MANAGER_PHONE <>", value, "shopManagerPhone");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneGreaterThan(String value) {
            addCriterion("SHOP_MANAGER_PHONE >", value, "shopManagerPhone");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_MANAGER_PHONE >=", value, "shopManagerPhone");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneLessThan(String value) {
            addCriterion("SHOP_MANAGER_PHONE <", value, "shopManagerPhone");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneLessThanOrEqualTo(String value) {
            addCriterion("SHOP_MANAGER_PHONE <=", value, "shopManagerPhone");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneLike(String value) {
            addCriterion("SHOP_MANAGER_PHONE like", value, "shopManagerPhone");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneNotLike(String value) {
            addCriterion("SHOP_MANAGER_PHONE not like", value, "shopManagerPhone");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneIn(List<String> values) {
            addCriterion("SHOP_MANAGER_PHONE in", values, "shopManagerPhone");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneNotIn(List<String> values) {
            addCriterion("SHOP_MANAGER_PHONE not in", values, "shopManagerPhone");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneBetween(String value1, String value2) {
            addCriterion("SHOP_MANAGER_PHONE between", value1, value2, "shopManagerPhone");
            return (Criteria) this;
        }

        public Criteria andShopManagerPhoneNotBetween(String value1, String value2) {
            addCriterion("SHOP_MANAGER_PHONE not between", value1, value2, "shopManagerPhone");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaIsNull() {
            addCriterion("SHOP_MANAGER_AREA is null");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaIsNotNull() {
            addCriterion("SHOP_MANAGER_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaEqualTo(String value) {
            addCriterion("SHOP_MANAGER_AREA =", value, "shopManagerArea");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaNotEqualTo(String value) {
            addCriterion("SHOP_MANAGER_AREA <>", value, "shopManagerArea");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaGreaterThan(String value) {
            addCriterion("SHOP_MANAGER_AREA >", value, "shopManagerArea");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_MANAGER_AREA >=", value, "shopManagerArea");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaLessThan(String value) {
            addCriterion("SHOP_MANAGER_AREA <", value, "shopManagerArea");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaLessThanOrEqualTo(String value) {
            addCriterion("SHOP_MANAGER_AREA <=", value, "shopManagerArea");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaLike(String value) {
            addCriterion("SHOP_MANAGER_AREA like", value, "shopManagerArea");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaNotLike(String value) {
            addCriterion("SHOP_MANAGER_AREA not like", value, "shopManagerArea");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaIn(List<String> values) {
            addCriterion("SHOP_MANAGER_AREA in", values, "shopManagerArea");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaNotIn(List<String> values) {
            addCriterion("SHOP_MANAGER_AREA not in", values, "shopManagerArea");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaBetween(String value1, String value2) {
            addCriterion("SHOP_MANAGER_AREA between", value1, value2, "shopManagerArea");
            return (Criteria) this;
        }

        public Criteria andShopManagerAreaNotBetween(String value1, String value2) {
            addCriterion("SHOP_MANAGER_AREA not between", value1, value2, "shopManagerArea");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIsNull() {
            addCriterion("CHANNEL_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIsNotNull() {
            addCriterion("CHANNEL_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andChannelManagerEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER =", value, "channelManager");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNotEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER <>", value, "channelManager");
            return (Criteria) this;
        }

        public Criteria andChannelManagerGreaterThan(String value) {
            addCriterion("CHANNEL_MANAGER >", value, "channelManager");
            return (Criteria) this;
        }

        public Criteria andChannelManagerGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER >=", value, "channelManager");
            return (Criteria) this;
        }

        public Criteria andChannelManagerLessThan(String value) {
            addCriterion("CHANNEL_MANAGER <", value, "channelManager");
            return (Criteria) this;
        }

        public Criteria andChannelManagerLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_MANAGER <=", value, "channelManager");
            return (Criteria) this;
        }

        public Criteria andChannelManagerLike(String value) {
            addCriterion("CHANNEL_MANAGER like", value, "channelManager");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNotLike(String value) {
            addCriterion("CHANNEL_MANAGER not like", value, "channelManager");
            return (Criteria) this;
        }

        public Criteria andChannelManagerIn(List<String> values) {
            addCriterion("CHANNEL_MANAGER in", values, "channelManager");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNotIn(List<String> values) {
            addCriterion("CHANNEL_MANAGER not in", values, "channelManager");
            return (Criteria) this;
        }

        public Criteria andChannelManagerBetween(String value1, String value2) {
            addCriterion("CHANNEL_MANAGER between", value1, value2, "channelManager");
            return (Criteria) this;
        }

        public Criteria andChannelManagerNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_MANAGER not between", value1, value2, "channelManager");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerIsNull() {
            addCriterion("BUSINESS_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerIsNotNull() {
            addCriterion("BUSINESS_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerEqualTo(String value) {
            addCriterion("BUSINESS_MANAGER =", value, "businessManager");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerNotEqualTo(String value) {
            addCriterion("BUSINESS_MANAGER <>", value, "businessManager");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerGreaterThan(String value) {
            addCriterion("BUSINESS_MANAGER >", value, "businessManager");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_MANAGER >=", value, "businessManager");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerLessThan(String value) {
            addCriterion("BUSINESS_MANAGER <", value, "businessManager");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_MANAGER <=", value, "businessManager");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerLike(String value) {
            addCriterion("BUSINESS_MANAGER like", value, "businessManager");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerNotLike(String value) {
            addCriterion("BUSINESS_MANAGER not like", value, "businessManager");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerIn(List<String> values) {
            addCriterion("BUSINESS_MANAGER in", values, "businessManager");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerNotIn(List<String> values) {
            addCriterion("BUSINESS_MANAGER not in", values, "businessManager");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerBetween(String value1, String value2) {
            addCriterion("BUSINESS_MANAGER between", value1, value2, "businessManager");
            return (Criteria) this;
        }

        public Criteria andBusinessManagerNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_MANAGER not between", value1, value2, "businessManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerIsNull() {
            addCriterion("GENERAL_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerIsNotNull() {
            addCriterion("GENERAL_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerEqualTo(String value) {
            addCriterion("GENERAL_MANAGER =", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerNotEqualTo(String value) {
            addCriterion("GENERAL_MANAGER <>", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerGreaterThan(String value) {
            addCriterion("GENERAL_MANAGER >", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerGreaterThanOrEqualTo(String value) {
            addCriterion("GENERAL_MANAGER >=", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerLessThan(String value) {
            addCriterion("GENERAL_MANAGER <", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerLessThanOrEqualTo(String value) {
            addCriterion("GENERAL_MANAGER <=", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerLike(String value) {
            addCriterion("GENERAL_MANAGER like", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerNotLike(String value) {
            addCriterion("GENERAL_MANAGER not like", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerIn(List<String> values) {
            addCriterion("GENERAL_MANAGER in", values, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerNotIn(List<String> values) {
            addCriterion("GENERAL_MANAGER not in", values, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerBetween(String value1, String value2) {
            addCriterion("GENERAL_MANAGER between", value1, value2, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerNotBetween(String value1, String value2) {
            addCriterion("GENERAL_MANAGER not between", value1, value2, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGmtJoinIsNull() {
            addCriterion("GMT_JOIN is null");
            return (Criteria) this;
        }

        public Criteria andGmtJoinIsNotNull() {
            addCriterion("GMT_JOIN is not null");
            return (Criteria) this;
        }

        public Criteria andGmtJoinEqualTo(String value) {
            addCriterion("GMT_JOIN =", value, "gmtJoin");
            return (Criteria) this;
        }

        public Criteria andGmtJoinNotEqualTo(String value) {
            addCriterion("GMT_JOIN <>", value, "gmtJoin");
            return (Criteria) this;
        }

        public Criteria andGmtJoinGreaterThan(String value) {
            addCriterion("GMT_JOIN >", value, "gmtJoin");
            return (Criteria) this;
        }

        public Criteria andGmtJoinGreaterThanOrEqualTo(String value) {
            addCriterion("GMT_JOIN >=", value, "gmtJoin");
            return (Criteria) this;
        }

        public Criteria andGmtJoinLessThan(String value) {
            addCriterion("GMT_JOIN <", value, "gmtJoin");
            return (Criteria) this;
        }

        public Criteria andGmtJoinLessThanOrEqualTo(String value) {
            addCriterion("GMT_JOIN <=", value, "gmtJoin");
            return (Criteria) this;
        }

        public Criteria andGmtJoinLike(String value) {
            addCriterion("GMT_JOIN like", value, "gmtJoin");
            return (Criteria) this;
        }

        public Criteria andGmtJoinNotLike(String value) {
            addCriterion("GMT_JOIN not like", value, "gmtJoin");
            return (Criteria) this;
        }

        public Criteria andGmtJoinIn(List<String> values) {
            addCriterion("GMT_JOIN in", values, "gmtJoin");
            return (Criteria) this;
        }

        public Criteria andGmtJoinNotIn(List<String> values) {
            addCriterion("GMT_JOIN not in", values, "gmtJoin");
            return (Criteria) this;
        }

        public Criteria andGmtJoinBetween(String value1, String value2) {
            addCriterion("GMT_JOIN between", value1, value2, "gmtJoin");
            return (Criteria) this;
        }

        public Criteria andGmtJoinNotBetween(String value1, String value2) {
            addCriterion("GMT_JOIN not between", value1, value2, "gmtJoin");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("GMT_CREATE is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("GMT_CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("GMT_CREATE =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("GMT_CREATE <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("GMT_CREATE >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("GMT_CREATE >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("GMT_CREATE <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("GMT_CREATE <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("GMT_CREATE in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("GMT_CREATE not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("GMT_CREATE between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("GMT_CREATE not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNull() {
            addCriterion("GMT_MODIFY is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNotNull() {
            addCriterion("GMT_MODIFY is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyEqualTo(Date value) {
            addCriterion("GMT_MODIFY =", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotEqualTo(Date value) {
            addCriterion("GMT_MODIFY <>", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThan(Date value) {
            addCriterion("GMT_MODIFY >", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("GMT_MODIFY >=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThan(Date value) {
            addCriterion("GMT_MODIFY <", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
            addCriterion("GMT_MODIFY <=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIn(List<Date> values) {
            addCriterion("GMT_MODIFY in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotIn(List<Date> values) {
            addCriterion("GMT_MODIFY not in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyBetween(Date value1, Date value2) {
            addCriterion("GMT_MODIFY between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
            addCriterion("GMT_MODIFY not between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIsNull() {
            addCriterion("STORE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIsNotNull() {
            addCriterion("STORE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStoreTypeEqualTo(Short value) {
            addCriterion("STORE_TYPE =", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeNotEqualTo(Short value) {
            addCriterion("STORE_TYPE <>", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeGreaterThan(Short value) {
            addCriterion("STORE_TYPE >", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("STORE_TYPE >=", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeLessThan(Short value) {
            addCriterion("STORE_TYPE <", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeLessThanOrEqualTo(Short value) {
            addCriterion("STORE_TYPE <=", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIn(List<Short> values) {
            addCriterion("STORE_TYPE in", values, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeNotIn(List<Short> values) {
            addCriterion("STORE_TYPE not in", values, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeBetween(Short value1, Short value2) {
            addCriterion("STORE_TYPE between", value1, value2, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeNotBetween(Short value1, Short value2) {
            addCriterion("STORE_TYPE not between", value1, value2, "storeType");
            return (Criteria) this;
        }
    }

    /**
     * STORE_RESUME_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * STORE_RESUME_INFO 2019-06-05
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}