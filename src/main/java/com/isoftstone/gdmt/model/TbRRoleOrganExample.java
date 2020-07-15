package com.isoftstone.gdmt.model;

import java.util.ArrayList;
import java.util.List;

public class TbRRoleOrganExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbRRoleOrganExample() {
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

        public Criteria andDutyidIsNull() {
            addCriterion("dutyid is null");
            return (Criteria) this;
        }

        public Criteria andDutyidIsNotNull() {
            addCriterion("dutyid is not null");
            return (Criteria) this;
        }

        public Criteria andDutyidEqualTo(String value) {
            addCriterion("dutyid =", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotEqualTo(String value) {
            addCriterion("dutyid <>", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThan(String value) {
            addCriterion("dutyid >", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThanOrEqualTo(String value) {
            addCriterion("dutyid >=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThan(String value) {
            addCriterion("dutyid <", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThanOrEqualTo(String value) {
            addCriterion("dutyid <=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLike(String value) {
            addCriterion("dutyid like", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotLike(String value) {
            addCriterion("dutyid not like", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidIn(List<String> values) {
            addCriterion("dutyid in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotIn(List<String> values) {
            addCriterion("dutyid not in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidBetween(String value1, String value2) {
            addCriterion("dutyid between", value1, value2, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotBetween(String value1, String value2) {
            addCriterion("dutyid not between", value1, value2, "dutyid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOrganUuidIsNull() {
            addCriterion("organ_uuid is null");
            return (Criteria) this;
        }

        public Criteria andOrganUuidIsNotNull() {
            addCriterion("organ_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andOrganUuidEqualTo(String value) {
            addCriterion("organ_uuid =", value, "organUuid");
            return (Criteria) this;
        }

        public Criteria andOrganUuidNotEqualTo(String value) {
            addCriterion("organ_uuid <>", value, "organUuid");
            return (Criteria) this;
        }

        public Criteria andOrganUuidGreaterThan(String value) {
            addCriterion("organ_uuid >", value, "organUuid");
            return (Criteria) this;
        }

        public Criteria andOrganUuidGreaterThanOrEqualTo(String value) {
            addCriterion("organ_uuid >=", value, "organUuid");
            return (Criteria) this;
        }

        public Criteria andOrganUuidLessThan(String value) {
            addCriterion("organ_uuid <", value, "organUuid");
            return (Criteria) this;
        }

        public Criteria andOrganUuidLessThanOrEqualTo(String value) {
            addCriterion("organ_uuid <=", value, "organUuid");
            return (Criteria) this;
        }

        public Criteria andOrganUuidLike(String value) {
            addCriterion("organ_uuid like", value, "organUuid");
            return (Criteria) this;
        }

        public Criteria andOrganUuidNotLike(String value) {
            addCriterion("organ_uuid not like", value, "organUuid");
            return (Criteria) this;
        }

        public Criteria andOrganUuidIn(List<String> values) {
            addCriterion("organ_uuid in", values, "organUuid");
            return (Criteria) this;
        }

        public Criteria andOrganUuidNotIn(List<String> values) {
            addCriterion("organ_uuid not in", values, "organUuid");
            return (Criteria) this;
        }

        public Criteria andOrganUuidBetween(String value1, String value2) {
            addCriterion("organ_uuid between", value1, value2, "organUuid");
            return (Criteria) this;
        }

        public Criteria andOrganUuidNotBetween(String value1, String value2) {
            addCriterion("organ_uuid not between", value1, value2, "organUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidIsNull() {
            addCriterion("role_uuid is null");
            return (Criteria) this;
        }

        public Criteria andRoleUuidIsNotNull() {
            addCriterion("role_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleUuidEqualTo(String value) {
            addCriterion("role_uuid =", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidNotEqualTo(String value) {
            addCriterion("role_uuid <>", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidGreaterThan(String value) {
            addCriterion("role_uuid >", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidGreaterThanOrEqualTo(String value) {
            addCriterion("role_uuid >=", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidLessThan(String value) {
            addCriterion("role_uuid <", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidLessThanOrEqualTo(String value) {
            addCriterion("role_uuid <=", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidLike(String value) {
            addCriterion("role_uuid like", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidNotLike(String value) {
            addCriterion("role_uuid not like", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidIn(List<String> values) {
            addCriterion("role_uuid in", values, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidNotIn(List<String> values) {
            addCriterion("role_uuid not in", values, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidBetween(String value1, String value2) {
            addCriterion("role_uuid between", value1, value2, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidNotBetween(String value1, String value2) {
            addCriterion("role_uuid not between", value1, value2, "roleUuid");
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