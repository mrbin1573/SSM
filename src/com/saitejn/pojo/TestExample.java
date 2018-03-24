package com.saitejn.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestExample() {
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

        public Criteria andTestidIsNull() {
            addCriterion("testid is null");
            return (Criteria) this;
        }

        public Criteria andTestidIsNotNull() {
            addCriterion("testid is not null");
            return (Criteria) this;
        }

        public Criteria andTestidEqualTo(Integer value) {
            addCriterion("testid =", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotEqualTo(Integer value) {
            addCriterion("testid <>", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidGreaterThan(Integer value) {
            addCriterion("testid >", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidGreaterThanOrEqualTo(Integer value) {
            addCriterion("testid >=", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidLessThan(Integer value) {
            addCriterion("testid <", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidLessThanOrEqualTo(Integer value) {
            addCriterion("testid <=", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidIn(List<Integer> values) {
            addCriterion("testid in", values, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotIn(List<Integer> values) {
            addCriterion("testid not in", values, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidBetween(Integer value1, Integer value2) {
            addCriterion("testid between", value1, value2, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotBetween(Integer value1, Integer value2) {
            addCriterion("testid not between", value1, value2, "testid");
            return (Criteria) this;
        }

        public Criteria andTestnameIsNull() {
            addCriterion("testname is null");
            return (Criteria) this;
        }

        public Criteria andTestnameIsNotNull() {
            addCriterion("testname is not null");
            return (Criteria) this;
        }

        public Criteria andTestnameEqualTo(String value) {
            addCriterion("testname =", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameNotEqualTo(String value) {
            addCriterion("testname <>", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameGreaterThan(String value) {
            addCriterion("testname >", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameGreaterThanOrEqualTo(String value) {
            addCriterion("testname >=", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameLessThan(String value) {
            addCriterion("testname <", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameLessThanOrEqualTo(String value) {
            addCriterion("testname <=", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameLike(String value) {
            addCriterion("testname like", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameNotLike(String value) {
            addCriterion("testname not like", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameIn(List<String> values) {
            addCriterion("testname in", values, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameNotIn(List<String> values) {
            addCriterion("testname not in", values, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameBetween(String value1, String value2) {
            addCriterion("testname between", value1, value2, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameNotBetween(String value1, String value2) {
            addCriterion("testname not between", value1, value2, "testname");
            return (Criteria) this;
        }

        public Criteria and用户名IsNull() {
            addCriterion("用户名 is null");
            return (Criteria) this;
        }

        public Criteria and用户名IsNotNull() {
            addCriterion("用户名 is not null");
            return (Criteria) this;
        }

        public Criteria and用户名EqualTo(Double value) {
            addCriterion("用户名 =", value, "用户名");
            return (Criteria) this;
        }

        public Criteria and用户名NotEqualTo(Double value) {
            addCriterion("用户名 <>", value, "用户名");
            return (Criteria) this;
        }

        public Criteria and用户名GreaterThan(Double value) {
            addCriterion("用户名 >", value, "用户名");
            return (Criteria) this;
        }

        public Criteria and用户名GreaterThanOrEqualTo(Double value) {
            addCriterion("用户名 >=", value, "用户名");
            return (Criteria) this;
        }

        public Criteria and用户名LessThan(Double value) {
            addCriterion("用户名 <", value, "用户名");
            return (Criteria) this;
        }

        public Criteria and用户名LessThanOrEqualTo(Double value) {
            addCriterion("用户名 <=", value, "用户名");
            return (Criteria) this;
        }

        public Criteria and用户名In(List<Double> values) {
            addCriterion("用户名 in", values, "用户名");
            return (Criteria) this;
        }

        public Criteria and用户名NotIn(List<Double> values) {
            addCriterion("用户名 not in", values, "用户名");
            return (Criteria) this;
        }

        public Criteria and用户名Between(Double value1, Double value2) {
            addCriterion("用户名 between", value1, value2, "用户名");
            return (Criteria) this;
        }

        public Criteria and用户名NotBetween(Double value1, Double value2) {
            addCriterion("用户名 not between", value1, value2, "用户名");
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