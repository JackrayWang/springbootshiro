package com.jakcray.springbootshiro.mybatisutils.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RolePermissionDAOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    public RolePermissionDAOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table role_permission
     *
     * @mbggenerated
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

        public Criteria andIdrolePermissionIsNull() {
            addCriterion("idrole_permission is null");
            return (Criteria) this;
        }

        public Criteria andIdrolePermissionIsNotNull() {
            addCriterion("idrole_permission is not null");
            return (Criteria) this;
        }

        public Criteria andIdrolePermissionEqualTo(String value) {
            addCriterion("idrole_permission =", value, "idrolePermission");
            return (Criteria) this;
        }

        public Criteria andIdrolePermissionNotEqualTo(String value) {
            addCriterion("idrole_permission <>", value, "idrolePermission");
            return (Criteria) this;
        }

        public Criteria andIdrolePermissionGreaterThan(String value) {
            addCriterion("idrole_permission >", value, "idrolePermission");
            return (Criteria) this;
        }

        public Criteria andIdrolePermissionGreaterThanOrEqualTo(String value) {
            addCriterion("idrole_permission >=", value, "idrolePermission");
            return (Criteria) this;
        }

        public Criteria andIdrolePermissionLessThan(String value) {
            addCriterion("idrole_permission <", value, "idrolePermission");
            return (Criteria) this;
        }

        public Criteria andIdrolePermissionLessThanOrEqualTo(String value) {
            addCriterion("idrole_permission <=", value, "idrolePermission");
            return (Criteria) this;
        }

        public Criteria andIdrolePermissionLike(String value) {
            addCriterion("idrole_permission like", value, "idrolePermission");
            return (Criteria) this;
        }

        public Criteria andIdrolePermissionNotLike(String value) {
            addCriterion("idrole_permission not like", value, "idrolePermission");
            return (Criteria) this;
        }

        public Criteria andIdrolePermissionIn(List<String> values) {
            addCriterion("idrole_permission in", values, "idrolePermission");
            return (Criteria) this;
        }

        public Criteria andIdrolePermissionNotIn(List<String> values) {
            addCriterion("idrole_permission not in", values, "idrolePermission");
            return (Criteria) this;
        }

        public Criteria andIdrolePermissionBetween(String value1, String value2) {
            addCriterion("idrole_permission between", value1, value2, "idrolePermission");
            return (Criteria) this;
        }

        public Criteria andIdrolePermissionNotBetween(String value1, String value2) {
            addCriterion("idrole_permission not between", value1, value2, "idrolePermission");
            return (Criteria) this;
        }

        public Criteria andIdroleIsNull() {
            addCriterion("idrole is null");
            return (Criteria) this;
        }

        public Criteria andIdroleIsNotNull() {
            addCriterion("idrole is not null");
            return (Criteria) this;
        }

        public Criteria andIdroleEqualTo(String value) {
            addCriterion("idrole =", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleNotEqualTo(String value) {
            addCriterion("idrole <>", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleGreaterThan(String value) {
            addCriterion("idrole >", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleGreaterThanOrEqualTo(String value) {
            addCriterion("idrole >=", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleLessThan(String value) {
            addCriterion("idrole <", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleLessThanOrEqualTo(String value) {
            addCriterion("idrole <=", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleLike(String value) {
            addCriterion("idrole like", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleNotLike(String value) {
            addCriterion("idrole not like", value, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleIn(List<String> values) {
            addCriterion("idrole in", values, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleNotIn(List<String> values) {
            addCriterion("idrole not in", values, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleBetween(String value1, String value2) {
            addCriterion("idrole between", value1, value2, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdroleNotBetween(String value1, String value2) {
            addCriterion("idrole not between", value1, value2, "idrole");
            return (Criteria) this;
        }

        public Criteria andIdpermissionIsNull() {
            addCriterion("idpermission is null");
            return (Criteria) this;
        }

        public Criteria andIdpermissionIsNotNull() {
            addCriterion("idpermission is not null");
            return (Criteria) this;
        }

        public Criteria andIdpermissionEqualTo(String value) {
            addCriterion("idpermission =", value, "idpermission");
            return (Criteria) this;
        }

        public Criteria andIdpermissionNotEqualTo(String value) {
            addCriterion("idpermission <>", value, "idpermission");
            return (Criteria) this;
        }

        public Criteria andIdpermissionGreaterThan(String value) {
            addCriterion("idpermission >", value, "idpermission");
            return (Criteria) this;
        }

        public Criteria andIdpermissionGreaterThanOrEqualTo(String value) {
            addCriterion("idpermission >=", value, "idpermission");
            return (Criteria) this;
        }

        public Criteria andIdpermissionLessThan(String value) {
            addCriterion("idpermission <", value, "idpermission");
            return (Criteria) this;
        }

        public Criteria andIdpermissionLessThanOrEqualTo(String value) {
            addCriterion("idpermission <=", value, "idpermission");
            return (Criteria) this;
        }

        public Criteria andIdpermissionLike(String value) {
            addCriterion("idpermission like", value, "idpermission");
            return (Criteria) this;
        }

        public Criteria andIdpermissionNotLike(String value) {
            addCriterion("idpermission not like", value, "idpermission");
            return (Criteria) this;
        }

        public Criteria andIdpermissionIn(List<String> values) {
            addCriterion("idpermission in", values, "idpermission");
            return (Criteria) this;
        }

        public Criteria andIdpermissionNotIn(List<String> values) {
            addCriterion("idpermission not in", values, "idpermission");
            return (Criteria) this;
        }

        public Criteria andIdpermissionBetween(String value1, String value2) {
            addCriterion("idpermission between", value1, value2, "idpermission");
            return (Criteria) this;
        }

        public Criteria andIdpermissionNotBetween(String value1, String value2) {
            addCriterion("idpermission not between", value1, value2, "idpermission");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterion("ts not between", value1, value2, "ts");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table role_permission
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table role_permission
     *
     * @mbggenerated
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