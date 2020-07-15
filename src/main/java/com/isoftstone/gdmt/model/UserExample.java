package com.isoftstone.gdmt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserUuidIsNull() {
            addCriterion("user_uuid is null");
            return (Criteria) this;
        }

        public Criteria andUserUuidIsNotNull() {
            addCriterion("user_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUserUuidEqualTo(String value) {
            addCriterion("user_uuid =", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotEqualTo(String value) {
            addCriterion("user_uuid <>", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidGreaterThan(String value) {
            addCriterion("user_uuid >", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidGreaterThanOrEqualTo(String value) {
            addCriterion("user_uuid >=", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidLessThan(String value) {
            addCriterion("user_uuid <", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidLessThanOrEqualTo(String value) {
            addCriterion("user_uuid <=", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidLike(String value) {
            addCriterion("user_uuid like", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotLike(String value) {
            addCriterion("user_uuid not like", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidIn(List<String> values) {
            addCriterion("user_uuid in", values, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotIn(List<String> values) {
            addCriterion("user_uuid not in", values, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidBetween(String value1, String value2) {
            addCriterion("user_uuid between", value1, value2, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotBetween(String value1, String value2) {
            addCriterion("user_uuid not between", value1, value2, "userUuid");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Short value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Short value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Short value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Short value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Short value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Short value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Short> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Short> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Short value1, Short value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Short value1, Short value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredIsNull() {
            addCriterion("account_non_expired is null");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredIsNotNull() {
            addCriterion("account_non_expired is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredEqualTo(Short value) {
            addCriterion("account_non_expired =", value, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredNotEqualTo(Short value) {
            addCriterion("account_non_expired <>", value, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredGreaterThan(Short value) {
            addCriterion("account_non_expired >", value, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredGreaterThanOrEqualTo(Short value) {
            addCriterion("account_non_expired >=", value, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredLessThan(Short value) {
            addCriterion("account_non_expired <", value, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredLessThanOrEqualTo(Short value) {
            addCriterion("account_non_expired <=", value, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredIn(List<Short> values) {
            addCriterion("account_non_expired in", values, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredNotIn(List<Short> values) {
            addCriterion("account_non_expired not in", values, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredBetween(Short value1, Short value2) {
            addCriterion("account_non_expired between", value1, value2, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonExpiredNotBetween(Short value1, Short value2) {
            addCriterion("account_non_expired not between", value1, value2, "accountNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredIsNull() {
            addCriterion("credentials_non_expired is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredIsNotNull() {
            addCriterion("credentials_non_expired is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredEqualTo(Short value) {
            addCriterion("credentials_non_expired =", value, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredNotEqualTo(Short value) {
            addCriterion("credentials_non_expired <>", value, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredGreaterThan(Short value) {
            addCriterion("credentials_non_expired >", value, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredGreaterThanOrEqualTo(Short value) {
            addCriterion("credentials_non_expired >=", value, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredLessThan(Short value) {
            addCriterion("credentials_non_expired <", value, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredLessThanOrEqualTo(Short value) {
            addCriterion("credentials_non_expired <=", value, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredIn(List<Short> values) {
            addCriterion("credentials_non_expired in", values, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredNotIn(List<Short> values) {
            addCriterion("credentials_non_expired not in", values, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredBetween(Short value1, Short value2) {
            addCriterion("credentials_non_expired between", value1, value2, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsNonExpiredNotBetween(Short value1, Short value2) {
            addCriterion("credentials_non_expired not between", value1, value2, "credentialsNonExpired");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedIsNull() {
            addCriterion("account_non_locked is null");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedIsNotNull() {
            addCriterion("account_non_locked is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedEqualTo(Short value) {
            addCriterion("account_non_locked =", value, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedNotEqualTo(Short value) {
            addCriterion("account_non_locked <>", value, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedGreaterThan(Short value) {
            addCriterion("account_non_locked >", value, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedGreaterThanOrEqualTo(Short value) {
            addCriterion("account_non_locked >=", value, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedLessThan(Short value) {
            addCriterion("account_non_locked <", value, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedLessThanOrEqualTo(Short value) {
            addCriterion("account_non_locked <=", value, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedIn(List<Short> values) {
            addCriterion("account_non_locked in", values, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedNotIn(List<Short> values) {
            addCriterion("account_non_locked not in", values, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedBetween(Short value1, Short value2) {
            addCriterion("account_non_locked between", value1, value2, "accountNonLocked");
            return (Criteria) this;
        }

        public Criteria andAccountNonLockedNotBetween(Short value1, Short value2) {
            addCriterion("account_non_locked not between", value1, value2, "accountNonLocked");
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

        public Criteria andNiceNameIsNull() {
            addCriterion("nice_name is null");
            return (Criteria) this;
        }

        public Criteria andNiceNameIsNotNull() {
            addCriterion("nice_name is not null");
            return (Criteria) this;
        }

        public Criteria andNiceNameEqualTo(String value) {
            addCriterion("nice_name =", value, "niceName");
            return (Criteria) this;
        }

        public Criteria andNiceNameNotEqualTo(String value) {
            addCriterion("nice_name <>", value, "niceName");
            return (Criteria) this;
        }

        public Criteria andNiceNameGreaterThan(String value) {
            addCriterion("nice_name >", value, "niceName");
            return (Criteria) this;
        }

        public Criteria andNiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("nice_name >=", value, "niceName");
            return (Criteria) this;
        }

        public Criteria andNiceNameLessThan(String value) {
            addCriterion("nice_name <", value, "niceName");
            return (Criteria) this;
        }

        public Criteria andNiceNameLessThanOrEqualTo(String value) {
            addCriterion("nice_name <=", value, "niceName");
            return (Criteria) this;
        }

        public Criteria andNiceNameLike(String value) {
            addCriterion("nice_name like", value, "niceName");
            return (Criteria) this;
        }

        public Criteria andNiceNameNotLike(String value) {
            addCriterion("nice_name not like", value, "niceName");
            return (Criteria) this;
        }

        public Criteria andNiceNameIn(List<String> values) {
            addCriterion("nice_name in", values, "niceName");
            return (Criteria) this;
        }

        public Criteria andNiceNameNotIn(List<String> values) {
            addCriterion("nice_name not in", values, "niceName");
            return (Criteria) this;
        }

        public Criteria andNiceNameBetween(String value1, String value2) {
            addCriterion("nice_name between", value1, value2, "niceName");
            return (Criteria) this;
        }

        public Criteria andNiceNameNotBetween(String value1, String value2) {
            addCriterion("nice_name not between", value1, value2, "niceName");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNull() {
            addCriterion("is_admin is null");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNotNull() {
            addCriterion("is_admin is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdminEqualTo(Short value) {
            addCriterion("is_admin =", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotEqualTo(Short value) {
            addCriterion("is_admin <>", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThan(Short value) {
            addCriterion("is_admin >", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThanOrEqualTo(Short value) {
            addCriterion("is_admin >=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThan(Short value) {
            addCriterion("is_admin <", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThanOrEqualTo(Short value) {
            addCriterion("is_admin <=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminIn(List<Short> values) {
            addCriterion("is_admin in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotIn(List<Short> values) {
            addCriterion("is_admin not in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminBetween(Short value1, Short value2) {
            addCriterion("is_admin between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotBetween(Short value1, Short value2) {
            addCriterion("is_admin not between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andMaximumsessionsIsNull() {
            addCriterion("maximumsessions is null");
            return (Criteria) this;
        }

        public Criteria andMaximumsessionsIsNotNull() {
            addCriterion("maximumsessions is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumsessionsEqualTo(Short value) {
            addCriterion("maximumsessions =", value, "maximumsessions");
            return (Criteria) this;
        }

        public Criteria andMaximumsessionsNotEqualTo(Short value) {
            addCriterion("maximumsessions <>", value, "maximumsessions");
            return (Criteria) this;
        }

        public Criteria andMaximumsessionsGreaterThan(Short value) {
            addCriterion("maximumsessions >", value, "maximumsessions");
            return (Criteria) this;
        }

        public Criteria andMaximumsessionsGreaterThanOrEqualTo(Short value) {
            addCriterion("maximumsessions >=", value, "maximumsessions");
            return (Criteria) this;
        }

        public Criteria andMaximumsessionsLessThan(Short value) {
            addCriterion("maximumsessions <", value, "maximumsessions");
            return (Criteria) this;
        }

        public Criteria andMaximumsessionsLessThanOrEqualTo(Short value) {
            addCriterion("maximumsessions <=", value, "maximumsessions");
            return (Criteria) this;
        }

        public Criteria andMaximumsessionsIn(List<Short> values) {
            addCriterion("maximumsessions in", values, "maximumsessions");
            return (Criteria) this;
        }

        public Criteria andMaximumsessionsNotIn(List<Short> values) {
            addCriterion("maximumsessions not in", values, "maximumsessions");
            return (Criteria) this;
        }

        public Criteria andMaximumsessionsBetween(Short value1, Short value2) {
            addCriterion("maximumsessions between", value1, value2, "maximumsessions");
            return (Criteria) this;
        }

        public Criteria andMaximumsessionsNotBetween(Short value1, Short value2) {
            addCriterion("maximumsessions not between", value1, value2, "maximumsessions");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNull() {
            addCriterion("registerdate is null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNotNull() {
            addCriterion("registerdate is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateEqualTo(Date value) {
            addCriterion("registerdate =", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotEqualTo(Date value) {
            addCriterion("registerdate <>", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThan(Date value) {
            addCriterion("registerdate >", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThanOrEqualTo(Date value) {
            addCriterion("registerdate >=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThan(Date value) {
            addCriterion("registerdate <", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThanOrEqualTo(Date value) {
            addCriterion("registerdate <=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIn(List<Date> values) {
            addCriterion("registerdate in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotIn(List<Date> values) {
            addCriterion("registerdate not in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateBetween(Date value1, Date value2) {
            addCriterion("registerdate between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotBetween(Date value1, Date value2) {
            addCriterion("registerdate not between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("lastlogintime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("lastlogintime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(Date value) {
            addCriterion("lastlogintime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(Date value) {
            addCriterion("lastlogintime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(Date value) {
            addCriterion("lastlogintime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastlogintime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(Date value) {
            addCriterion("lastlogintime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("lastlogintime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<Date> values) {
            addCriterion("lastlogintime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<Date> values) {
            addCriterion("lastlogintime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(Date value1, Date value2) {
            addCriterion("lastlogintime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("lastlogintime not between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andPwdqueIsNull() {
            addCriterion("pwdque is null");
            return (Criteria) this;
        }

        public Criteria andPwdqueIsNotNull() {
            addCriterion("pwdque is not null");
            return (Criteria) this;
        }

        public Criteria andPwdqueEqualTo(String value) {
            addCriterion("pwdque =", value, "pwdque");
            return (Criteria) this;
        }

        public Criteria andPwdqueNotEqualTo(String value) {
            addCriterion("pwdque <>", value, "pwdque");
            return (Criteria) this;
        }

        public Criteria andPwdqueGreaterThan(String value) {
            addCriterion("pwdque >", value, "pwdque");
            return (Criteria) this;
        }

        public Criteria andPwdqueGreaterThanOrEqualTo(String value) {
            addCriterion("pwdque >=", value, "pwdque");
            return (Criteria) this;
        }

        public Criteria andPwdqueLessThan(String value) {
            addCriterion("pwdque <", value, "pwdque");
            return (Criteria) this;
        }

        public Criteria andPwdqueLessThanOrEqualTo(String value) {
            addCriterion("pwdque <=", value, "pwdque");
            return (Criteria) this;
        }

        public Criteria andPwdqueLike(String value) {
            addCriterion("pwdque like", value, "pwdque");
            return (Criteria) this;
        }

        public Criteria andPwdqueNotLike(String value) {
            addCriterion("pwdque not like", value, "pwdque");
            return (Criteria) this;
        }

        public Criteria andPwdqueIn(List<String> values) {
            addCriterion("pwdque in", values, "pwdque");
            return (Criteria) this;
        }

        public Criteria andPwdqueNotIn(List<String> values) {
            addCriterion("pwdque not in", values, "pwdque");
            return (Criteria) this;
        }

        public Criteria andPwdqueBetween(String value1, String value2) {
            addCriterion("pwdque between", value1, value2, "pwdque");
            return (Criteria) this;
        }

        public Criteria andPwdqueNotBetween(String value1, String value2) {
            addCriterion("pwdque not between", value1, value2, "pwdque");
            return (Criteria) this;
        }

        public Criteria andPwdansIsNull() {
            addCriterion("pwdans is null");
            return (Criteria) this;
        }

        public Criteria andPwdansIsNotNull() {
            addCriterion("pwdans is not null");
            return (Criteria) this;
        }

        public Criteria andPwdansEqualTo(String value) {
            addCriterion("pwdans =", value, "pwdans");
            return (Criteria) this;
        }

        public Criteria andPwdansNotEqualTo(String value) {
            addCriterion("pwdans <>", value, "pwdans");
            return (Criteria) this;
        }

        public Criteria andPwdansGreaterThan(String value) {
            addCriterion("pwdans >", value, "pwdans");
            return (Criteria) this;
        }

        public Criteria andPwdansGreaterThanOrEqualTo(String value) {
            addCriterion("pwdans >=", value, "pwdans");
            return (Criteria) this;
        }

        public Criteria andPwdansLessThan(String value) {
            addCriterion("pwdans <", value, "pwdans");
            return (Criteria) this;
        }

        public Criteria andPwdansLessThanOrEqualTo(String value) {
            addCriterion("pwdans <=", value, "pwdans");
            return (Criteria) this;
        }

        public Criteria andPwdansLike(String value) {
            addCriterion("pwdans like", value, "pwdans");
            return (Criteria) this;
        }

        public Criteria andPwdansNotLike(String value) {
            addCriterion("pwdans not like", value, "pwdans");
            return (Criteria) this;
        }

        public Criteria andPwdansIn(List<String> values) {
            addCriterion("pwdans in", values, "pwdans");
            return (Criteria) this;
        }

        public Criteria andPwdansNotIn(List<String> values) {
            addCriterion("pwdans not in", values, "pwdans");
            return (Criteria) this;
        }

        public Criteria andPwdansBetween(String value1, String value2) {
            addCriterion("pwdans between", value1, value2, "pwdans");
            return (Criteria) this;
        }

        public Criteria andPwdansNotBetween(String value1, String value2) {
            addCriterion("pwdans not between", value1, value2, "pwdans");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDepidIsNull() {
            addCriterion("depid is null");
            return (Criteria) this;
        }

        public Criteria andDepidIsNotNull() {
            addCriterion("depid is not null");
            return (Criteria) this;
        }

        public Criteria andDepidEqualTo(String value) {
            addCriterion("depid =", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotEqualTo(String value) {
            addCriterion("depid <>", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThan(String value) {
            addCriterion("depid >", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThanOrEqualTo(String value) {
            addCriterion("depid >=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThan(String value) {
            addCriterion("depid <", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThanOrEqualTo(String value) {
            addCriterion("depid <=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLike(String value) {
            addCriterion("depid like", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotLike(String value) {
            addCriterion("depid not like", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidIn(List<String> values) {
            addCriterion("depid in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotIn(List<String> values) {
            addCriterion("depid not in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidBetween(String value1, String value2) {
            addCriterion("depid between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotBetween(String value1, String value2) {
            addCriterion("depid not between", value1, value2, "depid");
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

        public Criteria andIsSumIsNull() {
            addCriterion("is_sum is null");
            return (Criteria) this;
        }

        public Criteria andIsSumIsNotNull() {
            addCriterion("is_sum is not null");
            return (Criteria) this;
        }

        public Criteria andIsSumEqualTo(Short value) {
            addCriterion("is_sum =", value, "isSum");
            return (Criteria) this;
        }

        public Criteria andIsSumNotEqualTo(Short value) {
            addCriterion("is_sum <>", value, "isSum");
            return (Criteria) this;
        }

        public Criteria andIsSumGreaterThan(Short value) {
            addCriterion("is_sum >", value, "isSum");
            return (Criteria) this;
        }

        public Criteria andIsSumGreaterThanOrEqualTo(Short value) {
            addCriterion("is_sum >=", value, "isSum");
            return (Criteria) this;
        }

        public Criteria andIsSumLessThan(Short value) {
            addCriterion("is_sum <", value, "isSum");
            return (Criteria) this;
        }

        public Criteria andIsSumLessThanOrEqualTo(Short value) {
            addCriterion("is_sum <=", value, "isSum");
            return (Criteria) this;
        }

        public Criteria andIsSumIn(List<Short> values) {
            addCriterion("is_sum in", values, "isSum");
            return (Criteria) this;
        }

        public Criteria andIsSumNotIn(List<Short> values) {
            addCriterion("is_sum not in", values, "isSum");
            return (Criteria) this;
        }

        public Criteria andIsSumBetween(Short value1, Short value2) {
            addCriterion("is_sum between", value1, value2, "isSum");
            return (Criteria) this;
        }

        public Criteria andIsSumNotBetween(Short value1, Short value2) {
            addCriterion("is_sum not between", value1, value2, "isSum");
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