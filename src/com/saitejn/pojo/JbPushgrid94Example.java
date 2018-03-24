package com.saitejn.pojo;

import java.util.ArrayList;
import java.util.List;

public class JbPushgrid94Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JbPushgrid94Example() {
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

        public Criteria and序号IsNull() {
            addCriterion("序号 is null");
            return (Criteria) this;
        }

        public Criteria and序号IsNotNull() {
            addCriterion("序号 is not null");
            return (Criteria) this;
        }

        public Criteria and序号EqualTo(Integer value) {
            addCriterion("序号 =", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号NotEqualTo(Integer value) {
            addCriterion("序号 <>", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号GreaterThan(Integer value) {
            addCriterion("序号 >", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号GreaterThanOrEqualTo(Integer value) {
            addCriterion("序号 >=", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号LessThan(Integer value) {
            addCriterion("序号 <", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号LessThanOrEqualTo(Integer value) {
            addCriterion("序号 <=", value, "序号");
            return (Criteria) this;
        }

        public Criteria and序号In(List<Integer> values) {
            addCriterion("序号 in", values, "序号");
            return (Criteria) this;
        }

        public Criteria and序号NotIn(List<Integer> values) {
            addCriterion("序号 not in", values, "序号");
            return (Criteria) this;
        }

        public Criteria and序号Between(Integer value1, Integer value2) {
            addCriterion("序号 between", value1, value2, "序号");
            return (Criteria) this;
        }

        public Criteria and序号NotBetween(Integer value1, Integer value2) {
            addCriterion("序号 not between", value1, value2, "序号");
            return (Criteria) this;
        }

        public Criteria and控制下限IsNull() {
            addCriterion("控制下限 is null");
            return (Criteria) this;
        }

        public Criteria and控制下限IsNotNull() {
            addCriterion("控制下限 is not null");
            return (Criteria) this;
        }

        public Criteria and控制下限EqualTo(Double value) {
            addCriterion("控制下限 =", value, "控制下限");
            return (Criteria) this;
        }

        public Criteria and控制下限NotEqualTo(Double value) {
            addCriterion("控制下限 <>", value, "控制下限");
            return (Criteria) this;
        }

        public Criteria and控制下限GreaterThan(Double value) {
            addCriterion("控制下限 >", value, "控制下限");
            return (Criteria) this;
        }

        public Criteria and控制下限GreaterThanOrEqualTo(Double value) {
            addCriterion("控制下限 >=", value, "控制下限");
            return (Criteria) this;
        }

        public Criteria and控制下限LessThan(Double value) {
            addCriterion("控制下限 <", value, "控制下限");
            return (Criteria) this;
        }

        public Criteria and控制下限LessThanOrEqualTo(Double value) {
            addCriterion("控制下限 <=", value, "控制下限");
            return (Criteria) this;
        }

        public Criteria and控制下限In(List<Double> values) {
            addCriterion("控制下限 in", values, "控制下限");
            return (Criteria) this;
        }

        public Criteria and控制下限NotIn(List<Double> values) {
            addCriterion("控制下限 not in", values, "控制下限");
            return (Criteria) this;
        }

        public Criteria and控制下限Between(Double value1, Double value2) {
            addCriterion("控制下限 between", value1, value2, "控制下限");
            return (Criteria) this;
        }

        public Criteria and控制下限NotBetween(Double value1, Double value2) {
            addCriterion("控制下限 not between", value1, value2, "控制下限");
            return (Criteria) this;
        }

        public Criteria and控制上限IsNull() {
            addCriterion("控制上限 is null");
            return (Criteria) this;
        }

        public Criteria and控制上限IsNotNull() {
            addCriterion("控制上限 is not null");
            return (Criteria) this;
        }

        public Criteria and控制上限EqualTo(Double value) {
            addCriterion("控制上限 =", value, "控制上限");
            return (Criteria) this;
        }

        public Criteria and控制上限NotEqualTo(Double value) {
            addCriterion("控制上限 <>", value, "控制上限");
            return (Criteria) this;
        }

        public Criteria and控制上限GreaterThan(Double value) {
            addCriterion("控制上限 >", value, "控制上限");
            return (Criteria) this;
        }

        public Criteria and控制上限GreaterThanOrEqualTo(Double value) {
            addCriterion("控制上限 >=", value, "控制上限");
            return (Criteria) this;
        }

        public Criteria and控制上限LessThan(Double value) {
            addCriterion("控制上限 <", value, "控制上限");
            return (Criteria) this;
        }

        public Criteria and控制上限LessThanOrEqualTo(Double value) {
            addCriterion("控制上限 <=", value, "控制上限");
            return (Criteria) this;
        }

        public Criteria and控制上限In(List<Double> values) {
            addCriterion("控制上限 in", values, "控制上限");
            return (Criteria) this;
        }

        public Criteria and控制上限NotIn(List<Double> values) {
            addCriterion("控制上限 not in", values, "控制上限");
            return (Criteria) this;
        }

        public Criteria and控制上限Between(Double value1, Double value2) {
            addCriterion("控制上限 between", value1, value2, "控制上限");
            return (Criteria) this;
        }

        public Criteria and控制上限NotBetween(Double value1, Double value2) {
            addCriterion("控制上限 not between", value1, value2, "控制上限");
            return (Criteria) this;
        }

        public Criteria and变量控制类型IsNull() {
            addCriterion("变量控制类型 is null");
            return (Criteria) this;
        }

        public Criteria and变量控制类型IsNotNull() {
            addCriterion("变量控制类型 is not null");
            return (Criteria) this;
        }

        public Criteria and变量控制类型EqualTo(Integer value) {
            addCriterion("变量控制类型 =", value, "变量控制类型");
            return (Criteria) this;
        }

        public Criteria and变量控制类型NotEqualTo(Integer value) {
            addCriterion("变量控制类型 <>", value, "变量控制类型");
            return (Criteria) this;
        }

        public Criteria and变量控制类型GreaterThan(Integer value) {
            addCriterion("变量控制类型 >", value, "变量控制类型");
            return (Criteria) this;
        }

        public Criteria and变量控制类型GreaterThanOrEqualTo(Integer value) {
            addCriterion("变量控制类型 >=", value, "变量控制类型");
            return (Criteria) this;
        }

        public Criteria and变量控制类型LessThan(Integer value) {
            addCriterion("变量控制类型 <", value, "变量控制类型");
            return (Criteria) this;
        }

        public Criteria and变量控制类型LessThanOrEqualTo(Integer value) {
            addCriterion("变量控制类型 <=", value, "变量控制类型");
            return (Criteria) this;
        }

        public Criteria and变量控制类型In(List<Integer> values) {
            addCriterion("变量控制类型 in", values, "变量控制类型");
            return (Criteria) this;
        }

        public Criteria and变量控制类型NotIn(List<Integer> values) {
            addCriterion("变量控制类型 not in", values, "变量控制类型");
            return (Criteria) this;
        }

        public Criteria and变量控制类型Between(Integer value1, Integer value2) {
            addCriterion("变量控制类型 between", value1, value2, "变量控制类型");
            return (Criteria) this;
        }

        public Criteria and变量控制类型NotBetween(Integer value1, Integer value2) {
            addCriterion("变量控制类型 not between", value1, value2, "变量控制类型");
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