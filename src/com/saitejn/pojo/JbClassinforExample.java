package com.saitejn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JbClassinforExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JbClassinforExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andClass_timeIsNull() {
            addCriterion("class_time is null");
            return (Criteria) this;
        }

        public Criteria andClass_timeIsNotNull() {
            addCriterion("class_time is not null");
            return (Criteria) this;
        }

        public Criteria andClass_timeEqualTo(Date value) {
            addCriterion("class_time =", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeNotEqualTo(Date value) {
            addCriterion("class_time <>", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeGreaterThan(Date value) {
            addCriterion("class_time >", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("class_time >=", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeLessThan(Date value) {
            addCriterion("class_time <", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeLessThanOrEqualTo(Date value) {
            addCriterion("class_time <=", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeIn(List<Date> values) {
            addCriterion("class_time in", values, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeNotIn(List<Date> values) {
            addCriterion("class_time not in", values, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeBetween(Date value1, Date value2) {
            addCriterion("class_time between", value1, value2, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeNotBetween(Date value1, Date value2) {
            addCriterion("class_time not between", value1, value2, "class_time");
            return (Criteria) this;
        }

        public Criteria andMorclassIsNull() {
            addCriterion("morclass is null");
            return (Criteria) this;
        }

        public Criteria andMorclassIsNotNull() {
            addCriterion("morclass is not null");
            return (Criteria) this;
        }

        public Criteria andMorclassEqualTo(Integer value) {
            addCriterion("morclass =", value, "morclass");
            return (Criteria) this;
        }

        public Criteria andMorclassNotEqualTo(Integer value) {
            addCriterion("morclass <>", value, "morclass");
            return (Criteria) this;
        }

        public Criteria andMorclassGreaterThan(Integer value) {
            addCriterion("morclass >", value, "morclass");
            return (Criteria) this;
        }

        public Criteria andMorclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("morclass >=", value, "morclass");
            return (Criteria) this;
        }

        public Criteria andMorclassLessThan(Integer value) {
            addCriterion("morclass <", value, "morclass");
            return (Criteria) this;
        }

        public Criteria andMorclassLessThanOrEqualTo(Integer value) {
            addCriterion("morclass <=", value, "morclass");
            return (Criteria) this;
        }

        public Criteria andMorclassIn(List<Integer> values) {
            addCriterion("morclass in", values, "morclass");
            return (Criteria) this;
        }

        public Criteria andMorclassNotIn(List<Integer> values) {
            addCriterion("morclass not in", values, "morclass");
            return (Criteria) this;
        }

        public Criteria andMorclassBetween(Integer value1, Integer value2) {
            addCriterion("morclass between", value1, value2, "morclass");
            return (Criteria) this;
        }

        public Criteria andMorclassNotBetween(Integer value1, Integer value2) {
            addCriterion("morclass not between", value1, value2, "morclass");
            return (Criteria) this;
        }

        public Criteria andAftclassIsNull() {
            addCriterion("aftclass is null");
            return (Criteria) this;
        }

        public Criteria andAftclassIsNotNull() {
            addCriterion("aftclass is not null");
            return (Criteria) this;
        }

        public Criteria andAftclassEqualTo(Integer value) {
            addCriterion("aftclass =", value, "aftclass");
            return (Criteria) this;
        }

        public Criteria andAftclassNotEqualTo(Integer value) {
            addCriterion("aftclass <>", value, "aftclass");
            return (Criteria) this;
        }

        public Criteria andAftclassGreaterThan(Integer value) {
            addCriterion("aftclass >", value, "aftclass");
            return (Criteria) this;
        }

        public Criteria andAftclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("aftclass >=", value, "aftclass");
            return (Criteria) this;
        }

        public Criteria andAftclassLessThan(Integer value) {
            addCriterion("aftclass <", value, "aftclass");
            return (Criteria) this;
        }

        public Criteria andAftclassLessThanOrEqualTo(Integer value) {
            addCriterion("aftclass <=", value, "aftclass");
            return (Criteria) this;
        }

        public Criteria andAftclassIn(List<Integer> values) {
            addCriterion("aftclass in", values, "aftclass");
            return (Criteria) this;
        }

        public Criteria andAftclassNotIn(List<Integer> values) {
            addCriterion("aftclass not in", values, "aftclass");
            return (Criteria) this;
        }

        public Criteria andAftclassBetween(Integer value1, Integer value2) {
            addCriterion("aftclass between", value1, value2, "aftclass");
            return (Criteria) this;
        }

        public Criteria andAftclassNotBetween(Integer value1, Integer value2) {
            addCriterion("aftclass not between", value1, value2, "aftclass");
            return (Criteria) this;
        }

        public Criteria andEveclassIsNull() {
            addCriterion("eveclass is null");
            return (Criteria) this;
        }

        public Criteria andEveclassIsNotNull() {
            addCriterion("eveclass is not null");
            return (Criteria) this;
        }

        public Criteria andEveclassEqualTo(Integer value) {
            addCriterion("eveclass =", value, "eveclass");
            return (Criteria) this;
        }

        public Criteria andEveclassNotEqualTo(Integer value) {
            addCriterion("eveclass <>", value, "eveclass");
            return (Criteria) this;
        }

        public Criteria andEveclassGreaterThan(Integer value) {
            addCriterion("eveclass >", value, "eveclass");
            return (Criteria) this;
        }

        public Criteria andEveclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("eveclass >=", value, "eveclass");
            return (Criteria) this;
        }

        public Criteria andEveclassLessThan(Integer value) {
            addCriterion("eveclass <", value, "eveclass");
            return (Criteria) this;
        }

        public Criteria andEveclassLessThanOrEqualTo(Integer value) {
            addCriterion("eveclass <=", value, "eveclass");
            return (Criteria) this;
        }

        public Criteria andEveclassIn(List<Integer> values) {
            addCriterion("eveclass in", values, "eveclass");
            return (Criteria) this;
        }

        public Criteria andEveclassNotIn(List<Integer> values) {
            addCriterion("eveclass not in", values, "eveclass");
            return (Criteria) this;
        }

        public Criteria andEveclassBetween(Integer value1, Integer value2) {
            addCriterion("eveclass between", value1, value2, "eveclass");
            return (Criteria) this;
        }

        public Criteria andEveclassNotBetween(Integer value1, Integer value2) {
            addCriterion("eveclass not between", value1, value2, "eveclass");
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