package com.isoftstone.gdmt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExample() {
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

        public Criteria andorgan_uuidIsNull() {
            addCriterion("organ_uuid is null");
            return (Criteria) this;
        }

        public Criteria andorgan_uuidIsNotNull() {
            addCriterion("organ_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andorgan_uuidEqualTo(String value) {
            addCriterion("organ_uuid =", value, "organ_uuid");
            return (Criteria) this;
        }

        public Criteria andorgan_uuidNotEqualTo(String value) {
            addCriterion("organ_uuid <>", value, "organ_uuid");
            return (Criteria) this;
        }

        public Criteria andorgan_uuidGreaterThan(String value) {
            addCriterion("organ_uuid >", value, "organ_uuid");
            return (Criteria) this;
        }

        public Criteria andorgan_uuidGreaterThanOrEqualTo(String value) {
            addCriterion("organ_uuid >=", value, "organ_uuid");
            return (Criteria) this;
        }

        public Criteria andorgan_uuidLessThan(String value) {
            addCriterion("organ_uuid <", value, "organ_uuid");
            return (Criteria) this;
        }

        public Criteria andorgan_uuidLessThanOrEqualTo(String value) {
            addCriterion("organ_uuid <=", value, "organ_uuid");
            return (Criteria) this;
        }

        public Criteria andorgan_uuidLike(String value) {
            addCriterion("organ_uuid like", value, "organ_uuid");
            return (Criteria) this;
        }

        public Criteria andorgan_uuidNotLike(String value) {
            addCriterion("organ_uuid not like", value, "organ_uuid");
            return (Criteria) this;
        }

        public Criteria andorgan_uuidIn(List<String> values) {
            addCriterion("organ_uuid in", values, "organ_uuid");
            return (Criteria) this;
        }

        public Criteria andorgan_uuidNotIn(List<String> values) {
            addCriterion("organ_uuid not in", values, "organ_uuid");
            return (Criteria) this;
        }

        public Criteria andorgan_uuidBetween(String value1, String value2) {
            addCriterion("organ_uuid between", value1, value2, "organ_uuid");
            return (Criteria) this;
        }

        public Criteria andorgan_uuidNotBetween(String value1, String value2) {
            addCriterion("organ_uuid not between", value1, value2, "organ_uuid");
            return (Criteria) this;
        }

        public Criteria andOrganCodeIsNull() {
            addCriterion("organ_code is null");
            return (Criteria) this;
        }

        public Criteria andOrganCodeIsNotNull() {
            addCriterion("organ_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrganCodeEqualTo(String value) {
            addCriterion("organ_code =", value, "organ_code");
            return (Criteria) this;
        }

        public Criteria andOrganCodeNotEqualTo(String value) {
            addCriterion("organ_code <>", value, "organ_code");
            return (Criteria) this;
        }

        public Criteria andOrganCodeGreaterThan(String value) {
            addCriterion("organ_code >", value, "organ_code");
            return (Criteria) this;
        }

        public Criteria andOrganCodeGreaterThanOrEqualTo(String value) {
            addCriterion("organ_code >=", value, "organ_code");
            return (Criteria) this;
        }

        public Criteria andOrganCodeLessThan(String value) {
            addCriterion("organ_code <", value, "organ_code");
            return (Criteria) this;
        }

        public Criteria andOrganCodeLessThanOrEqualTo(String value) {
            addCriterion("organ_code <=", value, "organ_code");
            return (Criteria) this;
        }

        public Criteria andOrganCodeLike(String value) {
            addCriterion("organ_code like", value, "organ_code");
            return (Criteria) this;
        }

        public Criteria andOrganCodeNotLike(String value) {
            addCriterion("organ_code not like", value, "organ_code");
            return (Criteria) this;
        }

        public Criteria andOrganCodeIn(List<String> values) {
            addCriterion("organ_code in", values, "organ_code");
            return (Criteria) this;
        }

        public Criteria andOrganCodeNotIn(List<String> values) {
            addCriterion("organ_code not in", values, "organ_code");
            return (Criteria) this;
        }

        public Criteria andOrganCodeBetween(String value1, String value2) {
            addCriterion("organ_code between", value1, value2, "organ_code");
            return (Criteria) this;
        }

        public Criteria andOrganCodeNotBetween(String value1, String value2) {
            addCriterion("organ_code not between", value1, value2, "organ_code");
            return (Criteria) this;
        }

        public Criteria andorgan_nameIsNull() {
            addCriterion("organ_name is null");
            return (Criteria) this;
        }

        public Criteria andorgan_nameIsNotNull() {
            addCriterion("organ_name is not null");
            return (Criteria) this;
        }

        public Criteria andorgan_nameEqualTo(String value) {
            addCriterion("organ_name =", value, "organ_name");
            return (Criteria) this;
        }

        public Criteria andorgan_nameNotEqualTo(String value) {
            addCriterion("organ_name <>", value, "organ_name");
            return (Criteria) this;
        }

        public Criteria andorgan_nameGreaterThan(String value) {
            addCriterion("organ_name >", value, "organ_name");
            return (Criteria) this;
        }

        public Criteria andorgan_nameGreaterThanOrEqualTo(String value) {
            addCriterion("organ_name >=", value, "organ_name");
            return (Criteria) this;
        }

        public Criteria andorgan_nameLessThan(String value) {
            addCriterion("organ_name <", value, "organ_name");
            return (Criteria) this;
        }

        public Criteria andorgan_nameLessThanOrEqualTo(String value) {
            addCriterion("organ_name <=", value, "organ_name");
            return (Criteria) this;
        }

        public Criteria andorgan_nameLike(String value) {
            addCriterion("organ_name like", value, "organ_name");
            return (Criteria) this;
        }

        public Criteria andorgan_nameNotLike(String value) {
            addCriterion("organ_name not like", value, "organ_name");
            return (Criteria) this;
        }

        public Criteria andorgan_nameIn(List<String> values) {
            addCriterion("organ_name in", values, "organ_name");
            return (Criteria) this;
        }

        public Criteria andorgan_nameNotIn(List<String> values) {
            addCriterion("organ_name not in", values, "organ_name");
            return (Criteria) this;
        }

        public Criteria andorgan_nameBetween(String value1, String value2) {
            addCriterion("organ_name between", value1, value2, "organ_name");
            return (Criteria) this;
        }

        public Criteria andorgan_nameNotBetween(String value1, String value2) {
            addCriterion("organ_name not between", value1, value2, "organ_name");
            return (Criteria) this;
        }

        public Criteria andorgan_typeIsNull() {
            addCriterion("organ_type is null");
            return (Criteria) this;
        }

        public Criteria andorgan_typeIsNotNull() {
            addCriterion("organ_type is not null");
            return (Criteria) this;
        }

        public Criteria andorgan_typeEqualTo(String value) {
            addCriterion("organ_type =", value, "organ_type");
            return (Criteria) this;
        }

        public Criteria andorgan_typeNotEqualTo(String value) {
            addCriterion("organ_type <>", value, "organ_type");
            return (Criteria) this;
        }

        public Criteria andorgan_typeGreaterThan(String value) {
            addCriterion("organ_type >", value, "organ_type");
            return (Criteria) this;
        }

        public Criteria andorgan_typeGreaterThanOrEqualTo(String value) {
            addCriterion("organ_type >=", value, "organ_type");
            return (Criteria) this;
        }

        public Criteria andorgan_typeLessThan(String value) {
            addCriterion("organ_type <", value, "organ_type");
            return (Criteria) this;
        }

        public Criteria andorgan_typeLessThanOrEqualTo(String value) {
            addCriterion("organ_type <=", value, "organ_type");
            return (Criteria) this;
        }

        public Criteria andorgan_typeLike(String value) {
            addCriterion("organ_type like", value, "organ_type");
            return (Criteria) this;
        }

        public Criteria andorgan_typeNotLike(String value) {
            addCriterion("organ_type not like", value, "organ_type");
            return (Criteria) this;
        }

        public Criteria andorgan_typeIn(List<String> values) {
            addCriterion("organ_type in", values, "organ_type");
            return (Criteria) this;
        }

        public Criteria andorgan_typeNotIn(List<String> values) {
            addCriterion("organ_type not in", values, "organ_type");
            return (Criteria) this;
        }

        public Criteria andorgan_typeBetween(String value1, String value2) {
            addCriterion("organ_type between", value1, value2, "organ_type");
            return (Criteria) this;
        }

        public Criteria andorgan_typeNotBetween(String value1, String value2) {
            addCriterion("organ_type not between", value1, value2, "organ_type");
            return (Criteria) this;
        }

        public Criteria andin_useIsNull() {
            addCriterion("in_use is null");
            return (Criteria) this;
        }

        public Criteria andin_useIsNotNull() {
            addCriterion("in_use is not null");
            return (Criteria) this;
        }

        public Criteria andin_useEqualTo(String value) {
            addCriterion("in_use =", value, "in_use");
            return (Criteria) this;
        }

        public Criteria andin_useNotEqualTo(String value) {
            addCriterion("in_use <>", value, "in_use");
            return (Criteria) this;
        }

        public Criteria andin_useGreaterThan(String value) {
            addCriterion("in_use >", value, "in_use");
            return (Criteria) this;
        }

        public Criteria andin_useGreaterThanOrEqualTo(String value) {
            addCriterion("in_use >=", value, "in_use");
            return (Criteria) this;
        }

        public Criteria andin_useLessThan(String value) {
            addCriterion("in_use <", value, "in_use");
            return (Criteria) this;
        }

        public Criteria andin_useLessThanOrEqualTo(String value) {
            addCriterion("in_use <=", value, "in_use");
            return (Criteria) this;
        }

        public Criteria andin_useLike(String value) {
            addCriterion("in_use like", value, "in_use");
            return (Criteria) this;
        }

        public Criteria andin_useNotLike(String value) {
            addCriterion("in_use not like", value, "in_use");
            return (Criteria) this;
        }

        public Criteria andin_useIn(List<String> values) {
            addCriterion("in_use in", values, "in_use");
            return (Criteria) this;
        }

        public Criteria andin_useNotIn(List<String> values) {
            addCriterion("in_use not in", values, "in_use");
            return (Criteria) this;
        }

        public Criteria andin_useBetween(String value1, String value2) {
            addCriterion("in_use between", value1, value2, "in_use");
            return (Criteria) this;
        }

        public Criteria andin_useNotBetween(String value1, String value2) {
            addCriterion("in_use not between", value1, value2, "in_use");
            return (Criteria) this;
        }

        public Criteria andparent_uuidIsNull() {
            addCriterion("parent_uuid is null");
            return (Criteria) this;
        }

        public Criteria andparent_uuidIsNotNull() {
            addCriterion("parent_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andparent_uuidEqualTo(String value) {
            addCriterion("parent_uuid =", value, "parent_uuid");
            return (Criteria) this;
        }

        public Criteria andparent_uuidNotEqualTo(String value) {
            addCriterion("parent_uuid <>", value, "parent_uuid");
            return (Criteria) this;
        }

        public Criteria andparent_uuidGreaterThan(String value) {
            addCriterion("parent_uuid >", value, "parent_uuid");
            return (Criteria) this;
        }

        public Criteria andparent_uuidGreaterThanOrEqualTo(String value) {
            addCriterion("parent_uuid >=", value, "parent_uuid");
            return (Criteria) this;
        }

        public Criteria andparent_uuidLessThan(String value) {
            addCriterion("parent_uuid <", value, "parent_uuid");
            return (Criteria) this;
        }

        public Criteria andparent_uuidLessThanOrEqualTo(String value) {
            addCriterion("parent_uuid <=", value, "parent_uuid");
            return (Criteria) this;
        }

        public Criteria andparent_uuidLike(String value) {
            addCriterion("parent_uuid like", value, "parent_uuid");
            return (Criteria) this;
        }

        public Criteria andparent_uuidNotLike(String value) {
            addCriterion("parent_uuid not like", value, "parent_uuid");
            return (Criteria) this;
        }

        public Criteria andparent_uuidIn(List<String> values) {
            addCriterion("parent_uuid in", values, "parent_uuid");
            return (Criteria) this;
        }

        public Criteria andparent_uuidNotIn(List<String> values) {
            addCriterion("parent_uuid not in", values, "parent_uuid");
            return (Criteria) this;
        }

        public Criteria andparent_uuidBetween(String value1, String value2) {
            addCriterion("parent_uuid between", value1, value2, "parent_uuid");
            return (Criteria) this;
        }

        public Criteria andparent_uuidNotBetween(String value1, String value2) {
            addCriterion("parent_uuid not between", value1, value2, "parent_uuid");
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

        public Criteria andModifieridIsNull() {
            addCriterion("modifierid is null");
            return (Criteria) this;
        }

        public Criteria andModifieridIsNotNull() {
            addCriterion("modifierid is not null");
            return (Criteria) this;
        }

        public Criteria andModifieridEqualTo(String value) {
            addCriterion("modifierid =", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotEqualTo(String value) {
            addCriterion("modifierid <>", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridGreaterThan(String value) {
            addCriterion("modifierid >", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridGreaterThanOrEqualTo(String value) {
            addCriterion("modifierid >=", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridLessThan(String value) {
            addCriterion("modifierid <", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridLessThanOrEqualTo(String value) {
            addCriterion("modifierid <=", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridLike(String value) {
            addCriterion("modifierid like", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotLike(String value) {
            addCriterion("modifierid not like", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridIn(List<String> values) {
            addCriterion("modifierid in", values, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotIn(List<String> values) {
            addCriterion("modifierid not in", values, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridBetween(String value1, String value2) {
            addCriterion("modifierid between", value1, value2, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotBetween(String value1, String value2) {
            addCriterion("modifierid not between", value1, value2, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNull() {
            addCriterion("modtime is null");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNotNull() {
            addCriterion("modtime is not null");
            return (Criteria) this;
        }

        public Criteria andModtimeEqualTo(Date value) {
            addCriterion("modtime =", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotEqualTo(Date value) {
            addCriterion("modtime <>", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThan(Date value) {
            addCriterion("modtime >", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modtime >=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThan(Date value) {
            addCriterion("modtime <", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThanOrEqualTo(Date value) {
            addCriterion("modtime <=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeIn(List<Date> values) {
            addCriterion("modtime in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotIn(List<Date> values) {
            addCriterion("modtime not in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeBetween(Date value1, Date value2) {
            addCriterion("modtime between", value1, value2, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotBetween(Date value1, Date value2) {
            addCriterion("modtime not between", value1, value2, "modtime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andaccount_codeIsNull() {
            addCriterion("account_code is null");
            return (Criteria) this;
        }

        public Criteria andaccount_codeIsNotNull() {
            addCriterion("account_code is not null");
            return (Criteria) this;
        }

        public Criteria andaccount_codeEqualTo(String value) {
            addCriterion("account_code =", value, "account_code");
            return (Criteria) this;
        }

        public Criteria andaccount_codeNotEqualTo(String value) {
            addCriterion("account_code <>", value, "account_code");
            return (Criteria) this;
        }

        public Criteria andaccount_codeGreaterThan(String value) {
            addCriterion("account_code >", value, "account_code");
            return (Criteria) this;
        }

        public Criteria andaccount_codeGreaterThanOrEqualTo(String value) {
            addCriterion("account_code >=", value, "account_code");
            return (Criteria) this;
        }

        public Criteria andaccount_codeLessThan(String value) {
            addCriterion("account_code <", value, "account_code");
            return (Criteria) this;
        }

        public Criteria andaccount_codeLessThanOrEqualTo(String value) {
            addCriterion("account_code <=", value, "account_code");
            return (Criteria) this;
        }

        public Criteria andaccount_codeLike(String value) {
            addCriterion("account_code like", value, "account_code");
            return (Criteria) this;
        }

        public Criteria andaccount_codeNotLike(String value) {
            addCriterion("account_code not like", value, "account_code");
            return (Criteria) this;
        }

        public Criteria andaccount_codeIn(List<String> values) {
            addCriterion("account_code in", values, "account_code");
            return (Criteria) this;
        }

        public Criteria andaccount_codeNotIn(List<String> values) {
            addCriterion("account_code not in", values, "account_code");
            return (Criteria) this;
        }

        public Criteria andaccount_codeBetween(String value1, String value2) {
            addCriterion("account_code between", value1, value2, "account_code");
            return (Criteria) this;
        }

        public Criteria andaccount_codeNotBetween(String value1, String value2) {
            addCriterion("account_code not between", value1, value2, "account_code");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("shortname is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("shortname is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("shortname =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("shortname <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("shortname >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("shortname >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("shortname <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("shortname <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("shortname like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("shortname not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("shortname in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("shortname not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("shortname between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("shortname not between", value1, value2, "shortname");
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