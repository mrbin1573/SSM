package com.saitejn.pojo;

import java.util.ArrayList;
import java.util.List;

public class JbPushgrid23Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JbPushgrid23Example() {
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

        public Criteria and累计液氨产值IsNull() {
            addCriterion("累计液氨产值 is null");
            return (Criteria) this;
        }

        public Criteria and累计液氨产值IsNotNull() {
            addCriterion("累计液氨产值 is not null");
            return (Criteria) this;
        }

        public Criteria and累计液氨产值EqualTo(Float value) {
            addCriterion("累计液氨产值 =", value, "累计液氨产值");
            return (Criteria) this;
        }

        public Criteria and累计液氨产值NotEqualTo(Float value) {
            addCriterion("累计液氨产值 <>", value, "累计液氨产值");
            return (Criteria) this;
        }

        public Criteria and累计液氨产值GreaterThan(Float value) {
            addCriterion("累计液氨产值 >", value, "累计液氨产值");
            return (Criteria) this;
        }

        public Criteria and累计液氨产值GreaterThanOrEqualTo(Float value) {
            addCriterion("累计液氨产值 >=", value, "累计液氨产值");
            return (Criteria) this;
        }

        public Criteria and累计液氨产值LessThan(Float value) {
            addCriterion("累计液氨产值 <", value, "累计液氨产值");
            return (Criteria) this;
        }

        public Criteria and累计液氨产值LessThanOrEqualTo(Float value) {
            addCriterion("累计液氨产值 <=", value, "累计液氨产值");
            return (Criteria) this;
        }

        public Criteria and累计液氨产值In(List<Float> values) {
            addCriterion("累计液氨产值 in", values, "累计液氨产值");
            return (Criteria) this;
        }

        public Criteria and累计液氨产值NotIn(List<Float> values) {
            addCriterion("累计液氨产值 not in", values, "累计液氨产值");
            return (Criteria) this;
        }

        public Criteria and累计液氨产值Between(Float value1, Float value2) {
            addCriterion("累计液氨产值 between", value1, value2, "累计液氨产值");
            return (Criteria) this;
        }

        public Criteria and累计液氨产值NotBetween(Float value1, Float value2) {
            addCriterion("累计液氨产值 not between", value1, value2, "累计液氨产值");
            return (Criteria) this;
        }

        public Criteria and累计天然气费用IsNull() {
            addCriterion("累计天然气费用 is null");
            return (Criteria) this;
        }

        public Criteria and累计天然气费用IsNotNull() {
            addCriterion("累计天然气费用 is not null");
            return (Criteria) this;
        }

        public Criteria and累计天然气费用EqualTo(Float value) {
            addCriterion("累计天然气费用 =", value, "累计天然气费用");
            return (Criteria) this;
        }

        public Criteria and累计天然气费用NotEqualTo(Float value) {
            addCriterion("累计天然气费用 <>", value, "累计天然气费用");
            return (Criteria) this;
        }

        public Criteria and累计天然气费用GreaterThan(Float value) {
            addCriterion("累计天然气费用 >", value, "累计天然气费用");
            return (Criteria) this;
        }

        public Criteria and累计天然气费用GreaterThanOrEqualTo(Float value) {
            addCriterion("累计天然气费用 >=", value, "累计天然气费用");
            return (Criteria) this;
        }

        public Criteria and累计天然气费用LessThan(Float value) {
            addCriterion("累计天然气费用 <", value, "累计天然气费用");
            return (Criteria) this;
        }

        public Criteria and累计天然气费用LessThanOrEqualTo(Float value) {
            addCriterion("累计天然气费用 <=", value, "累计天然气费用");
            return (Criteria) this;
        }

        public Criteria and累计天然气费用In(List<Float> values) {
            addCriterion("累计天然气费用 in", values, "累计天然气费用");
            return (Criteria) this;
        }

        public Criteria and累计天然气费用NotIn(List<Float> values) {
            addCriterion("累计天然气费用 not in", values, "累计天然气费用");
            return (Criteria) this;
        }

        public Criteria and累计天然气费用Between(Float value1, Float value2) {
            addCriterion("累计天然气费用 between", value1, value2, "累计天然气费用");
            return (Criteria) this;
        }

        public Criteria and累计天然气费用NotBetween(Float value1, Float value2) {
            addCriterion("累计天然气费用 not between", value1, value2, "累计天然气费用");
            return (Criteria) this;
        }

        public Criteria and累计电费IsNull() {
            addCriterion("累计电费 is null");
            return (Criteria) this;
        }

        public Criteria and累计电费IsNotNull() {
            addCriterion("累计电费 is not null");
            return (Criteria) this;
        }

        public Criteria and累计电费EqualTo(Float value) {
            addCriterion("累计电费 =", value, "累计电费");
            return (Criteria) this;
        }

        public Criteria and累计电费NotEqualTo(Float value) {
            addCriterion("累计电费 <>", value, "累计电费");
            return (Criteria) this;
        }

        public Criteria and累计电费GreaterThan(Float value) {
            addCriterion("累计电费 >", value, "累计电费");
            return (Criteria) this;
        }

        public Criteria and累计电费GreaterThanOrEqualTo(Float value) {
            addCriterion("累计电费 >=", value, "累计电费");
            return (Criteria) this;
        }

        public Criteria and累计电费LessThan(Float value) {
            addCriterion("累计电费 <", value, "累计电费");
            return (Criteria) this;
        }

        public Criteria and累计电费LessThanOrEqualTo(Float value) {
            addCriterion("累计电费 <=", value, "累计电费");
            return (Criteria) this;
        }

        public Criteria and累计电费In(List<Float> values) {
            addCriterion("累计电费 in", values, "累计电费");
            return (Criteria) this;
        }

        public Criteria and累计电费NotIn(List<Float> values) {
            addCriterion("累计电费 not in", values, "累计电费");
            return (Criteria) this;
        }

        public Criteria and累计电费Between(Float value1, Float value2) {
            addCriterion("累计电费 between", value1, value2, "累计电费");
            return (Criteria) this;
        }

        public Criteria and累计电费NotBetween(Float value1, Float value2) {
            addCriterion("累计电费 not between", value1, value2, "累计电费");
            return (Criteria) this;
        }

        public Criteria and累计效益IsNull() {
            addCriterion("累计效益 is null");
            return (Criteria) this;
        }

        public Criteria and累计效益IsNotNull() {
            addCriterion("累计效益 is not null");
            return (Criteria) this;
        }

        public Criteria and累计效益EqualTo(Float value) {
            addCriterion("累计效益 =", value, "累计效益");
            return (Criteria) this;
        }

        public Criteria and累计效益NotEqualTo(Float value) {
            addCriterion("累计效益 <>", value, "累计效益");
            return (Criteria) this;
        }

        public Criteria and累计效益GreaterThan(Float value) {
            addCriterion("累计效益 >", value, "累计效益");
            return (Criteria) this;
        }

        public Criteria and累计效益GreaterThanOrEqualTo(Float value) {
            addCriterion("累计效益 >=", value, "累计效益");
            return (Criteria) this;
        }

        public Criteria and累计效益LessThan(Float value) {
            addCriterion("累计效益 <", value, "累计效益");
            return (Criteria) this;
        }

        public Criteria and累计效益LessThanOrEqualTo(Float value) {
            addCriterion("累计效益 <=", value, "累计效益");
            return (Criteria) this;
        }

        public Criteria and累计效益In(List<Float> values) {
            addCriterion("累计效益 in", values, "累计效益");
            return (Criteria) this;
        }

        public Criteria and累计效益NotIn(List<Float> values) {
            addCriterion("累计效益 not in", values, "累计效益");
            return (Criteria) this;
        }

        public Criteria and累计效益Between(Float value1, Float value2) {
            addCriterion("累计效益 between", value1, value2, "累计效益");
            return (Criteria) this;
        }

        public Criteria and累计效益NotBetween(Float value1, Float value2) {
            addCriterion("累计效益 not between", value1, value2, "累计效益");
            return (Criteria) this;
        }

        public Criteria and日均效益IsNull() {
            addCriterion("日均效益 is null");
            return (Criteria) this;
        }

        public Criteria and日均效益IsNotNull() {
            addCriterion("日均效益 is not null");
            return (Criteria) this;
        }

        public Criteria and日均效益EqualTo(Float value) {
            addCriterion("日均效益 =", value, "日均效益");
            return (Criteria) this;
        }

        public Criteria and日均效益NotEqualTo(Float value) {
            addCriterion("日均效益 <>", value, "日均效益");
            return (Criteria) this;
        }

        public Criteria and日均效益GreaterThan(Float value) {
            addCriterion("日均效益 >", value, "日均效益");
            return (Criteria) this;
        }

        public Criteria and日均效益GreaterThanOrEqualTo(Float value) {
            addCriterion("日均效益 >=", value, "日均效益");
            return (Criteria) this;
        }

        public Criteria and日均效益LessThan(Float value) {
            addCriterion("日均效益 <", value, "日均效益");
            return (Criteria) this;
        }

        public Criteria and日均效益LessThanOrEqualTo(Float value) {
            addCriterion("日均效益 <=", value, "日均效益");
            return (Criteria) this;
        }

        public Criteria and日均效益In(List<Float> values) {
            addCriterion("日均效益 in", values, "日均效益");
            return (Criteria) this;
        }

        public Criteria and日均效益NotIn(List<Float> values) {
            addCriterion("日均效益 not in", values, "日均效益");
            return (Criteria) this;
        }

        public Criteria and日均效益Between(Float value1, Float value2) {
            addCriterion("日均效益 between", value1, value2, "日均效益");
            return (Criteria) this;
        }

        public Criteria and日均效益NotBetween(Float value1, Float value2) {
            addCriterion("日均效益 not between", value1, value2, "日均效益");
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