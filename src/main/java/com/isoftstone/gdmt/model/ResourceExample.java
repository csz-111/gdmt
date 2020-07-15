package com.isoftstone.gdmt.model;

import java.util.ArrayList;
import java.util.List;

public class ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("menu_id like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("menu_id not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andDirCodeIsNull() {
            addCriterion("dir_code is null");
            return (Criteria) this;
        }

        public Criteria andDirCodeIsNotNull() {
            addCriterion("dir_code is not null");
            return (Criteria) this;
        }

        public Criteria andDirCodeEqualTo(String value) {
            addCriterion("dir_code =", value, "dirCode");
            return (Criteria) this;
        }

        public Criteria andDirCodeNotEqualTo(String value) {
            addCriterion("dir_code <>", value, "dirCode");
            return (Criteria) this;
        }

        public Criteria andDirCodeGreaterThan(String value) {
            addCriterion("dir_code >", value, "dirCode");
            return (Criteria) this;
        }

        public Criteria andDirCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dir_code >=", value, "dirCode");
            return (Criteria) this;
        }

        public Criteria andDirCodeLessThan(String value) {
            addCriterion("dir_code <", value, "dirCode");
            return (Criteria) this;
        }

        public Criteria andDirCodeLessThanOrEqualTo(String value) {
            addCriterion("dir_code <=", value, "dirCode");
            return (Criteria) this;
        }

        public Criteria andDirCodeLike(String value) {
            addCriterion("dir_code like", value, "dirCode");
            return (Criteria) this;
        }

        public Criteria andDirCodeNotLike(String value) {
            addCriterion("dir_code not like", value, "dirCode");
            return (Criteria) this;
        }

        public Criteria andDirCodeIn(List<String> values) {
            addCriterion("dir_code in", values, "dirCode");
            return (Criteria) this;
        }

        public Criteria andDirCodeNotIn(List<String> values) {
            addCriterion("dir_code not in", values, "dirCode");
            return (Criteria) this;
        }

        public Criteria andDirCodeBetween(String value1, String value2) {
            addCriterion("dir_code between", value1, value2, "dirCode");
            return (Criteria) this;
        }

        public Criteria andDirCodeNotBetween(String value1, String value2) {
            addCriterion("dir_code not between", value1, value2, "dirCode");
            return (Criteria) this;
        }

        public Criteria andDirNameIsNull() {
            addCriterion("dir_name is null");
            return (Criteria) this;
        }

        public Criteria andDirNameIsNotNull() {
            addCriterion("dir_name is not null");
            return (Criteria) this;
        }

        public Criteria andDirNameEqualTo(String value) {
            addCriterion("dir_name =", value, "dirName");
            return (Criteria) this;
        }

        public Criteria andDirNameNotEqualTo(String value) {
            addCriterion("dir_name <>", value, "dirName");
            return (Criteria) this;
        }

        public Criteria andDirNameGreaterThan(String value) {
            addCriterion("dir_name >", value, "dirName");
            return (Criteria) this;
        }

        public Criteria andDirNameGreaterThanOrEqualTo(String value) {
            addCriterion("dir_name >=", value, "dirName");
            return (Criteria) this;
        }

        public Criteria andDirNameLessThan(String value) {
            addCriterion("dir_name <", value, "dirName");
            return (Criteria) this;
        }

        public Criteria andDirNameLessThanOrEqualTo(String value) {
            addCriterion("dir_name <=", value, "dirName");
            return (Criteria) this;
        }

        public Criteria andDirNameLike(String value) {
            addCriterion("dir_name like", value, "dirName");
            return (Criteria) this;
        }

        public Criteria andDirNameNotLike(String value) {
            addCriterion("dir_name not like", value, "dirName");
            return (Criteria) this;
        }

        public Criteria andDirNameIn(List<String> values) {
            addCriterion("dir_name in", values, "dirName");
            return (Criteria) this;
        }

        public Criteria andDirNameNotIn(List<String> values) {
            addCriterion("dir_name not in", values, "dirName");
            return (Criteria) this;
        }

        public Criteria andDirNameBetween(String value1, String value2) {
            addCriterion("dir_name between", value1, value2, "dirName");
            return (Criteria) this;
        }

        public Criteria andDirNameNotBetween(String value1, String value2) {
            addCriterion("dir_name not between", value1, value2, "dirName");
            return (Criteria) this;
        }

        public Criteria andDirLevelNumberIsNull() {
            addCriterion("dir_level_number is null");
            return (Criteria) this;
        }

        public Criteria andDirLevelNumberIsNotNull() {
            addCriterion("dir_level_number is not null");
            return (Criteria) this;
        }

        public Criteria andDirLevelNumberEqualTo(Integer value) {
            addCriterion("dir_level_number =", value, "dirLevelNumber");
            return (Criteria) this;
        }

        public Criteria andDirLevelNumberNotEqualTo(Integer value) {
            addCriterion("dir_level_number <>", value, "dirLevelNumber");
            return (Criteria) this;
        }

        public Criteria andDirLevelNumberGreaterThan(Integer value) {
            addCriterion("dir_level_number >", value, "dirLevelNumber");
            return (Criteria) this;
        }

        public Criteria andDirLevelNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("dir_level_number >=", value, "dirLevelNumber");
            return (Criteria) this;
        }

        public Criteria andDirLevelNumberLessThan(Integer value) {
            addCriterion("dir_level_number <", value, "dirLevelNumber");
            return (Criteria) this;
        }

        public Criteria andDirLevelNumberLessThanOrEqualTo(Integer value) {
            addCriterion("dir_level_number <=", value, "dirLevelNumber");
            return (Criteria) this;
        }

        public Criteria andDirLevelNumberIn(List<Integer> values) {
            addCriterion("dir_level_number in", values, "dirLevelNumber");
            return (Criteria) this;
        }

        public Criteria andDirLevelNumberNotIn(List<Integer> values) {
            addCriterion("dir_level_number not in", values, "dirLevelNumber");
            return (Criteria) this;
        }

        public Criteria andDirLevelNumberBetween(Integer value1, Integer value2) {
            addCriterion("dir_level_number between", value1, value2, "dirLevelNumber");
            return (Criteria) this;
        }

        public Criteria andDirLevelNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("dir_level_number not between", value1, value2, "dirLevelNumber");
            return (Criteria) this;
        }

        public Criteria andDirTypeIsNull() {
            addCriterion("dir_type is null");
            return (Criteria) this;
        }

        public Criteria andDirTypeIsNotNull() {
            addCriterion("dir_type is not null");
            return (Criteria) this;
        }

        public Criteria andDirTypeEqualTo(String value) {
            addCriterion("dir_type =", value, "dirType");
            return (Criteria) this;
        }

        public Criteria andDirTypeNotEqualTo(String value) {
            addCriterion("dir_type <>", value, "dirType");
            return (Criteria) this;
        }

        public Criteria andDirTypeGreaterThan(String value) {
            addCriterion("dir_type >", value, "dirType");
            return (Criteria) this;
        }

        public Criteria andDirTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dir_type >=", value, "dirType");
            return (Criteria) this;
        }

        public Criteria andDirTypeLessThan(String value) {
            addCriterion("dir_type <", value, "dirType");
            return (Criteria) this;
        }

        public Criteria andDirTypeLessThanOrEqualTo(String value) {
            addCriterion("dir_type <=", value, "dirType");
            return (Criteria) this;
        }

        public Criteria andDirTypeLike(String value) {
            addCriterion("dir_type like", value, "dirType");
            return (Criteria) this;
        }

        public Criteria andDirTypeNotLike(String value) {
            addCriterion("dir_type not like", value, "dirType");
            return (Criteria) this;
        }

        public Criteria andDirTypeIn(List<String> values) {
            addCriterion("dir_type in", values, "dirType");
            return (Criteria) this;
        }

        public Criteria andDirTypeNotIn(List<String> values) {
            addCriterion("dir_type not in", values, "dirType");
            return (Criteria) this;
        }

        public Criteria andDirTypeBetween(String value1, String value2) {
            addCriterion("dir_type between", value1, value2, "dirType");
            return (Criteria) this;
        }

        public Criteria andDirTypeNotBetween(String value1, String value2) {
            addCriterion("dir_type not between", value1, value2, "dirType");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(String value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(String value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(String value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(String value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(String value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLike(String value) {
            addCriterion("resource_id like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotLike(String value) {
            addCriterion("resource_id not like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<String> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<String> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(String value1, String value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(String value1, String value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andIsitemIsNull() {
            addCriterion("isitem is null");
            return (Criteria) this;
        }

        public Criteria andIsitemIsNotNull() {
            addCriterion("isitem is not null");
            return (Criteria) this;
        }

        public Criteria andIsitemEqualTo(String value) {
            addCriterion("isitem =", value, "isitem");
            return (Criteria) this;
        }

        public Criteria andIsitemNotEqualTo(String value) {
            addCriterion("isitem <>", value, "isitem");
            return (Criteria) this;
        }

        public Criteria andIsitemGreaterThan(String value) {
            addCriterion("isitem >", value, "isitem");
            return (Criteria) this;
        }

        public Criteria andIsitemGreaterThanOrEqualTo(String value) {
            addCriterion("isitem >=", value, "isitem");
            return (Criteria) this;
        }

        public Criteria andIsitemLessThan(String value) {
            addCriterion("isitem <", value, "isitem");
            return (Criteria) this;
        }

        public Criteria andIsitemLessThanOrEqualTo(String value) {
            addCriterion("isitem <=", value, "isitem");
            return (Criteria) this;
        }

        public Criteria andIsitemLike(String value) {
            addCriterion("isitem like", value, "isitem");
            return (Criteria) this;
        }

        public Criteria andIsitemNotLike(String value) {
            addCriterion("isitem not like", value, "isitem");
            return (Criteria) this;
        }

        public Criteria andIsitemIn(List<String> values) {
            addCriterion("isitem in", values, "isitem");
            return (Criteria) this;
        }

        public Criteria andIsitemNotIn(List<String> values) {
            addCriterion("isitem not in", values, "isitem");
            return (Criteria) this;
        }

        public Criteria andIsitemBetween(String value1, String value2) {
            addCriterion("isitem between", value1, value2, "isitem");
            return (Criteria) this;
        }

        public Criteria andIsitemNotBetween(String value1, String value2) {
            addCriterion("isitem not between", value1, value2, "isitem");
            return (Criteria) this;
        }

        public Criteria andDirOrderIsNull() {
            addCriterion("dir_order is null");
            return (Criteria) this;
        }

        public Criteria andDirOrderIsNotNull() {
            addCriterion("dir_order is not null");
            return (Criteria) this;
        }

        public Criteria andDirOrderEqualTo(Integer value) {
            addCriterion("dir_order =", value, "dirOrder");
            return (Criteria) this;
        }

        public Criteria andDirOrderNotEqualTo(Integer value) {
            addCriterion("dir_order <>", value, "dirOrder");
            return (Criteria) this;
        }

        public Criteria andDirOrderGreaterThan(Integer value) {
            addCriterion("dir_order >", value, "dirOrder");
            return (Criteria) this;
        }

        public Criteria andDirOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("dir_order >=", value, "dirOrder");
            return (Criteria) this;
        }

        public Criteria andDirOrderLessThan(Integer value) {
            addCriterion("dir_order <", value, "dirOrder");
            return (Criteria) this;
        }

        public Criteria andDirOrderLessThanOrEqualTo(Integer value) {
            addCriterion("dir_order <=", value, "dirOrder");
            return (Criteria) this;
        }

        public Criteria andDirOrderIn(List<Integer> values) {
            addCriterion("dir_order in", values, "dirOrder");
            return (Criteria) this;
        }

        public Criteria andDirOrderNotIn(List<Integer> values) {
            addCriterion("dir_order not in", values, "dirOrder");
            return (Criteria) this;
        }

        public Criteria andDirOrderBetween(Integer value1, Integer value2) {
            addCriterion("dir_order between", value1, value2, "dirOrder");
            return (Criteria) this;
        }

        public Criteria andDirOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("dir_order not between", value1, value2, "dirOrder");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdIsNull() {
            addCriterion("menu_group_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdIsNotNull() {
            addCriterion("menu_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdEqualTo(String value) {
            addCriterion("menu_group_id =", value, "menuGroupId");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdNotEqualTo(String value) {
            addCriterion("menu_group_id <>", value, "menuGroupId");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdGreaterThan(String value) {
            addCriterion("menu_group_id >", value, "menuGroupId");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("menu_group_id >=", value, "menuGroupId");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdLessThan(String value) {
            addCriterion("menu_group_id <", value, "menuGroupId");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdLessThanOrEqualTo(String value) {
            addCriterion("menu_group_id <=", value, "menuGroupId");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdLike(String value) {
            addCriterion("menu_group_id like", value, "menuGroupId");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdNotLike(String value) {
            addCriterion("menu_group_id not like", value, "menuGroupId");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdIn(List<String> values) {
            addCriterion("menu_group_id in", values, "menuGroupId");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdNotIn(List<String> values) {
            addCriterion("menu_group_id not in", values, "menuGroupId");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdBetween(String value1, String value2) {
            addCriterion("menu_group_id between", value1, value2, "menuGroupId");
            return (Criteria) this;
        }

        public Criteria andMenuGroupIdNotBetween(String value1, String value2) {
            addCriterion("menu_group_id not between", value1, value2, "menuGroupId");
            return (Criteria) this;
        }

        public Criteria andLocaleIsNull() {
            addCriterion("locale is null");
            return (Criteria) this;
        }

        public Criteria andLocaleIsNotNull() {
            addCriterion("locale is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleEqualTo(String value) {
            addCriterion("locale =", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotEqualTo(String value) {
            addCriterion("locale <>", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleGreaterThan(String value) {
            addCriterion("locale >", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleGreaterThanOrEqualTo(String value) {
            addCriterion("locale >=", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLessThan(String value) {
            addCriterion("locale <", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLessThanOrEqualTo(String value) {
            addCriterion("locale <=", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLike(String value) {
            addCriterion("locale like", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotLike(String value) {
            addCriterion("locale not like", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleIn(List<String> values) {
            addCriterion("locale in", values, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotIn(List<String> values) {
            addCriterion("locale not in", values, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleBetween(String value1, String value2) {
            addCriterion("locale between", value1, value2, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotBetween(String value1, String value2) {
            addCriterion("locale not between", value1, value2, "locale");
            return (Criteria) this;
        }

        public Criteria andResUuidIsNull() {
            addCriterion("res_uuid is null");
            return (Criteria) this;
        }

        public Criteria andResUuidIsNotNull() {
            addCriterion("res_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andResUuidEqualTo(String value) {
            addCriterion("res_uuid =", value, "resUuid");
            return (Criteria) this;
        }

        public Criteria andResUuidNotEqualTo(String value) {
            addCriterion("res_uuid <>", value, "resUuid");
            return (Criteria) this;
        }

        public Criteria andResUuidGreaterThan(String value) {
            addCriterion("res_uuid >", value, "resUuid");
            return (Criteria) this;
        }

        public Criteria andResUuidGreaterThanOrEqualTo(String value) {
            addCriterion("res_uuid >=", value, "resUuid");
            return (Criteria) this;
        }

        public Criteria andResUuidLessThan(String value) {
            addCriterion("res_uuid <", value, "resUuid");
            return (Criteria) this;
        }

        public Criteria andResUuidLessThanOrEqualTo(String value) {
            addCriterion("res_uuid <=", value, "resUuid");
            return (Criteria) this;
        }

        public Criteria andResUuidLike(String value) {
            addCriterion("res_uuid like", value, "resUuid");
            return (Criteria) this;
        }

        public Criteria andResUuidNotLike(String value) {
            addCriterion("res_uuid not like", value, "resUuid");
            return (Criteria) this;
        }

        public Criteria andResUuidIn(List<String> values) {
            addCriterion("res_uuid in", values, "resUuid");
            return (Criteria) this;
        }

        public Criteria andResUuidNotIn(List<String> values) {
            addCriterion("res_uuid not in", values, "resUuid");
            return (Criteria) this;
        }

        public Criteria andResUuidBetween(String value1, String value2) {
            addCriterion("res_uuid between", value1, value2, "resUuid");
            return (Criteria) this;
        }

        public Criteria andResUuidNotBetween(String value1, String value2) {
            addCriterion("res_uuid not between", value1, value2, "resUuid");
            return (Criteria) this;
        }

        public Criteria andRealidIsNull() {
            addCriterion("realid is null");
            return (Criteria) this;
        }

        public Criteria andRealidIsNotNull() {
            addCriterion("realid is not null");
            return (Criteria) this;
        }

        public Criteria andRealidEqualTo(String value) {
            addCriterion("realid =", value, "realid");
            return (Criteria) this;
        }

        public Criteria andRealidNotEqualTo(String value) {
            addCriterion("realid <>", value, "realid");
            return (Criteria) this;
        }

        public Criteria andRealidGreaterThan(String value) {
            addCriterion("realid >", value, "realid");
            return (Criteria) this;
        }

        public Criteria andRealidGreaterThanOrEqualTo(String value) {
            addCriterion("realid >=", value, "realid");
            return (Criteria) this;
        }

        public Criteria andRealidLessThan(String value) {
            addCriterion("realid <", value, "realid");
            return (Criteria) this;
        }

        public Criteria andRealidLessThanOrEqualTo(String value) {
            addCriterion("realid <=", value, "realid");
            return (Criteria) this;
        }

        public Criteria andRealidLike(String value) {
            addCriterion("realid like", value, "realid");
            return (Criteria) this;
        }

        public Criteria andRealidNotLike(String value) {
            addCriterion("realid not like", value, "realid");
            return (Criteria) this;
        }

        public Criteria andRealidIn(List<String> values) {
            addCriterion("realid in", values, "realid");
            return (Criteria) this;
        }

        public Criteria andRealidNotIn(List<String> values) {
            addCriterion("realid not in", values, "realid");
            return (Criteria) this;
        }

        public Criteria andRealidBetween(String value1, String value2) {
            addCriterion("realid between", value1, value2, "realid");
            return (Criteria) this;
        }

        public Criteria andRealidNotBetween(String value1, String value2) {
            addCriterion("realid not between", value1, value2, "realid");
            return (Criteria) this;
        }

        public Criteria andIstransferIsNull() {
            addCriterion("istransfer is null");
            return (Criteria) this;
        }

        public Criteria andIstransferIsNotNull() {
            addCriterion("istransfer is not null");
            return (Criteria) this;
        }

        public Criteria andIstransferEqualTo(String value) {
            addCriterion("istransfer =", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferNotEqualTo(String value) {
            addCriterion("istransfer <>", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferGreaterThan(String value) {
            addCriterion("istransfer >", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferGreaterThanOrEqualTo(String value) {
            addCriterion("istransfer >=", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferLessThan(String value) {
            addCriterion("istransfer <", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferLessThanOrEqualTo(String value) {
            addCriterion("istransfer <=", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferLike(String value) {
            addCriterion("istransfer like", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferNotLike(String value) {
            addCriterion("istransfer not like", value, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferIn(List<String> values) {
            addCriterion("istransfer in", values, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferNotIn(List<String> values) {
            addCriterion("istransfer not in", values, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferBetween(String value1, String value2) {
            addCriterion("istransfer between", value1, value2, "istransfer");
            return (Criteria) this;
        }

        public Criteria andIstransferNotBetween(String value1, String value2) {
            addCriterion("istransfer not between", value1, value2, "istransfer");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("menu_type is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("menu_type is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("menu_type =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("menu_type <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("menu_type >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_type >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("menu_type <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("menu_type <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("menu_type like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("menu_type not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("menu_type in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("menu_type not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("menu_type between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("menu_type not between", value1, value2, "menuType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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