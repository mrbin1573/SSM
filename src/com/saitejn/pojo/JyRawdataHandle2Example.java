package com.saitejn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JyRawdataHandle2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JyRawdataHandle2Example() {
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

        public Criteria and时间IsNull() {
            addCriterion("时间 is null");
            return (Criteria) this;
        }

        public Criteria and时间IsNotNull() {
            addCriterion("时间 is not null");
            return (Criteria) this;
        }

        public Criteria and时间EqualTo(Date value) {
            addCriterion("时间 =", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间NotEqualTo(Date value) {
            addCriterion("时间 <>", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间GreaterThan(Date value) {
            addCriterion("时间 >", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间GreaterThanOrEqualTo(Date value) {
            addCriterion("时间 >=", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间LessThan(Date value) {
            addCriterion("时间 <", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间LessThanOrEqualTo(Date value) {
            addCriterion("时间 <=", value, "时间");
            return (Criteria) this;
        }

        public Criteria and时间In(List<Date> values) {
            addCriterion("时间 in", values, "时间");
            return (Criteria) this;
        }

        public Criteria and时间NotIn(List<Date> values) {
            addCriterion("时间 not in", values, "时间");
            return (Criteria) this;
        }

        public Criteria and时间Between(Date value1, Date value2) {
            addCriterion("时间 between", value1, value2, "时间");
            return (Criteria) this;
        }

        public Criteria and时间NotBetween(Date value1, Date value2) {
            addCriterion("时间 not between", value1, value2, "时间");
            return (Criteria) this;
        }

        public Criteria andTI_501IsNull() {
            addCriterion("TI_501 is null");
            return (Criteria) this;
        }

        public Criteria andTI_501IsNotNull() {
            addCriterion("TI_501 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_501EqualTo(Double value) {
            addCriterion("TI_501 =", value, "TI_501");
            return (Criteria) this;
        }

        public Criteria andTI_501NotEqualTo(Double value) {
            addCriterion("TI_501 <>", value, "TI_501");
            return (Criteria) this;
        }

        public Criteria andTI_501GreaterThan(Double value) {
            addCriterion("TI_501 >", value, "TI_501");
            return (Criteria) this;
        }

        public Criteria andTI_501GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_501 >=", value, "TI_501");
            return (Criteria) this;
        }

        public Criteria andTI_501LessThan(Double value) {
            addCriterion("TI_501 <", value, "TI_501");
            return (Criteria) this;
        }

        public Criteria andTI_501LessThanOrEqualTo(Double value) {
            addCriterion("TI_501 <=", value, "TI_501");
            return (Criteria) this;
        }

        public Criteria andTI_501In(List<Double> values) {
            addCriterion("TI_501 in", values, "TI_501");
            return (Criteria) this;
        }

        public Criteria andTI_501NotIn(List<Double> values) {
            addCriterion("TI_501 not in", values, "TI_501");
            return (Criteria) this;
        }

        public Criteria andTI_501Between(Double value1, Double value2) {
            addCriterion("TI_501 between", value1, value2, "TI_501");
            return (Criteria) this;
        }

        public Criteria andTI_501NotBetween(Double value1, Double value2) {
            addCriterion("TI_501 not between", value1, value2, "TI_501");
            return (Criteria) this;
        }

        public Criteria andTI_1_51IsNull() {
            addCriterion("TI_1_51 is null");
            return (Criteria) this;
        }

        public Criteria andTI_1_51IsNotNull() {
            addCriterion("TI_1_51 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_1_51EqualTo(Double value) {
            addCriterion("TI_1_51 =", value, "TI_1_51");
            return (Criteria) this;
        }

        public Criteria andTI_1_51NotEqualTo(Double value) {
            addCriterion("TI_1_51 <>", value, "TI_1_51");
            return (Criteria) this;
        }

        public Criteria andTI_1_51GreaterThan(Double value) {
            addCriterion("TI_1_51 >", value, "TI_1_51");
            return (Criteria) this;
        }

        public Criteria andTI_1_51GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_1_51 >=", value, "TI_1_51");
            return (Criteria) this;
        }

        public Criteria andTI_1_51LessThan(Double value) {
            addCriterion("TI_1_51 <", value, "TI_1_51");
            return (Criteria) this;
        }

        public Criteria andTI_1_51LessThanOrEqualTo(Double value) {
            addCriterion("TI_1_51 <=", value, "TI_1_51");
            return (Criteria) this;
        }

        public Criteria andTI_1_51In(List<Double> values) {
            addCriterion("TI_1_51 in", values, "TI_1_51");
            return (Criteria) this;
        }

        public Criteria andTI_1_51NotIn(List<Double> values) {
            addCriterion("TI_1_51 not in", values, "TI_1_51");
            return (Criteria) this;
        }

        public Criteria andTI_1_51Between(Double value1, Double value2) {
            addCriterion("TI_1_51 between", value1, value2, "TI_1_51");
            return (Criteria) this;
        }

        public Criteria andTI_1_51NotBetween(Double value1, Double value2) {
            addCriterion("TI_1_51 not between", value1, value2, "TI_1_51");
            return (Criteria) this;
        }

        public Criteria andTI_1_85IsNull() {
            addCriterion("TI_1_85 is null");
            return (Criteria) this;
        }

        public Criteria andTI_1_85IsNotNull() {
            addCriterion("TI_1_85 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_1_85EqualTo(Double value) {
            addCriterion("TI_1_85 =", value, "TI_1_85");
            return (Criteria) this;
        }

        public Criteria andTI_1_85NotEqualTo(Double value) {
            addCriterion("TI_1_85 <>", value, "TI_1_85");
            return (Criteria) this;
        }

        public Criteria andTI_1_85GreaterThan(Double value) {
            addCriterion("TI_1_85 >", value, "TI_1_85");
            return (Criteria) this;
        }

        public Criteria andTI_1_85GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_1_85 >=", value, "TI_1_85");
            return (Criteria) this;
        }

        public Criteria andTI_1_85LessThan(Double value) {
            addCriterion("TI_1_85 <", value, "TI_1_85");
            return (Criteria) this;
        }

        public Criteria andTI_1_85LessThanOrEqualTo(Double value) {
            addCriterion("TI_1_85 <=", value, "TI_1_85");
            return (Criteria) this;
        }

        public Criteria andTI_1_85In(List<Double> values) {
            addCriterion("TI_1_85 in", values, "TI_1_85");
            return (Criteria) this;
        }

        public Criteria andTI_1_85NotIn(List<Double> values) {
            addCriterion("TI_1_85 not in", values, "TI_1_85");
            return (Criteria) this;
        }

        public Criteria andTI_1_85Between(Double value1, Double value2) {
            addCriterion("TI_1_85 between", value1, value2, "TI_1_85");
            return (Criteria) this;
        }

        public Criteria andTI_1_85NotBetween(Double value1, Double value2) {
            addCriterion("TI_1_85 not between", value1, value2, "TI_1_85");
            return (Criteria) this;
        }

        public Criteria andTI_1_90IsNull() {
            addCriterion("TI_1_90 is null");
            return (Criteria) this;
        }

        public Criteria andTI_1_90IsNotNull() {
            addCriterion("TI_1_90 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_1_90EqualTo(Double value) {
            addCriterion("TI_1_90 =", value, "TI_1_90");
            return (Criteria) this;
        }

        public Criteria andTI_1_90NotEqualTo(Double value) {
            addCriterion("TI_1_90 <>", value, "TI_1_90");
            return (Criteria) this;
        }

        public Criteria andTI_1_90GreaterThan(Double value) {
            addCriterion("TI_1_90 >", value, "TI_1_90");
            return (Criteria) this;
        }

        public Criteria andTI_1_90GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_1_90 >=", value, "TI_1_90");
            return (Criteria) this;
        }

        public Criteria andTI_1_90LessThan(Double value) {
            addCriterion("TI_1_90 <", value, "TI_1_90");
            return (Criteria) this;
        }

        public Criteria andTI_1_90LessThanOrEqualTo(Double value) {
            addCriterion("TI_1_90 <=", value, "TI_1_90");
            return (Criteria) this;
        }

        public Criteria andTI_1_90In(List<Double> values) {
            addCriterion("TI_1_90 in", values, "TI_1_90");
            return (Criteria) this;
        }

        public Criteria andTI_1_90NotIn(List<Double> values) {
            addCriterion("TI_1_90 not in", values, "TI_1_90");
            return (Criteria) this;
        }

        public Criteria andTI_1_90Between(Double value1, Double value2) {
            addCriterion("TI_1_90 between", value1, value2, "TI_1_90");
            return (Criteria) this;
        }

        public Criteria andTI_1_90NotBetween(Double value1, Double value2) {
            addCriterion("TI_1_90 not between", value1, value2, "TI_1_90");
            return (Criteria) this;
        }

        public Criteria andTI_10IsNull() {
            addCriterion("TI_10 is null");
            return (Criteria) this;
        }

        public Criteria andTI_10IsNotNull() {
            addCriterion("TI_10 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_10EqualTo(Double value) {
            addCriterion("TI_10 =", value, "TI_10");
            return (Criteria) this;
        }

        public Criteria andTI_10NotEqualTo(Double value) {
            addCriterion("TI_10 <>", value, "TI_10");
            return (Criteria) this;
        }

        public Criteria andTI_10GreaterThan(Double value) {
            addCriterion("TI_10 >", value, "TI_10");
            return (Criteria) this;
        }

        public Criteria andTI_10GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_10 >=", value, "TI_10");
            return (Criteria) this;
        }

        public Criteria andTI_10LessThan(Double value) {
            addCriterion("TI_10 <", value, "TI_10");
            return (Criteria) this;
        }

        public Criteria andTI_10LessThanOrEqualTo(Double value) {
            addCriterion("TI_10 <=", value, "TI_10");
            return (Criteria) this;
        }

        public Criteria andTI_10In(List<Double> values) {
            addCriterion("TI_10 in", values, "TI_10");
            return (Criteria) this;
        }

        public Criteria andTI_10NotIn(List<Double> values) {
            addCriterion("TI_10 not in", values, "TI_10");
            return (Criteria) this;
        }

        public Criteria andTI_10Between(Double value1, Double value2) {
            addCriterion("TI_10 between", value1, value2, "TI_10");
            return (Criteria) this;
        }

        public Criteria andTI_10NotBetween(Double value1, Double value2) {
            addCriterion("TI_10 not between", value1, value2, "TI_10");
            return (Criteria) this;
        }

        public Criteria andTI_281IsNull() {
            addCriterion("TI_281 is null");
            return (Criteria) this;
        }

        public Criteria andTI_281IsNotNull() {
            addCriterion("TI_281 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_281EqualTo(Double value) {
            addCriterion("TI_281 =", value, "TI_281");
            return (Criteria) this;
        }

        public Criteria andTI_281NotEqualTo(Double value) {
            addCriterion("TI_281 <>", value, "TI_281");
            return (Criteria) this;
        }

        public Criteria andTI_281GreaterThan(Double value) {
            addCriterion("TI_281 >", value, "TI_281");
            return (Criteria) this;
        }

        public Criteria andTI_281GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_281 >=", value, "TI_281");
            return (Criteria) this;
        }

        public Criteria andTI_281LessThan(Double value) {
            addCriterion("TI_281 <", value, "TI_281");
            return (Criteria) this;
        }

        public Criteria andTI_281LessThanOrEqualTo(Double value) {
            addCriterion("TI_281 <=", value, "TI_281");
            return (Criteria) this;
        }

        public Criteria andTI_281In(List<Double> values) {
            addCriterion("TI_281 in", values, "TI_281");
            return (Criteria) this;
        }

        public Criteria andTI_281NotIn(List<Double> values) {
            addCriterion("TI_281 not in", values, "TI_281");
            return (Criteria) this;
        }

        public Criteria andTI_281Between(Double value1, Double value2) {
            addCriterion("TI_281 between", value1, value2, "TI_281");
            return (Criteria) this;
        }

        public Criteria andTI_281NotBetween(Double value1, Double value2) {
            addCriterion("TI_281 not between", value1, value2, "TI_281");
            return (Criteria) this;
        }

        public Criteria andTI_111IsNull() {
            addCriterion("TI_111 is null");
            return (Criteria) this;
        }

        public Criteria andTI_111IsNotNull() {
            addCriterion("TI_111 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_111EqualTo(Double value) {
            addCriterion("TI_111 =", value, "TI_111");
            return (Criteria) this;
        }

        public Criteria andTI_111NotEqualTo(Double value) {
            addCriterion("TI_111 <>", value, "TI_111");
            return (Criteria) this;
        }

        public Criteria andTI_111GreaterThan(Double value) {
            addCriterion("TI_111 >", value, "TI_111");
            return (Criteria) this;
        }

        public Criteria andTI_111GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_111 >=", value, "TI_111");
            return (Criteria) this;
        }

        public Criteria andTI_111LessThan(Double value) {
            addCriterion("TI_111 <", value, "TI_111");
            return (Criteria) this;
        }

        public Criteria andTI_111LessThanOrEqualTo(Double value) {
            addCriterion("TI_111 <=", value, "TI_111");
            return (Criteria) this;
        }

        public Criteria andTI_111In(List<Double> values) {
            addCriterion("TI_111 in", values, "TI_111");
            return (Criteria) this;
        }

        public Criteria andTI_111NotIn(List<Double> values) {
            addCriterion("TI_111 not in", values, "TI_111");
            return (Criteria) this;
        }

        public Criteria andTI_111Between(Double value1, Double value2) {
            addCriterion("TI_111 between", value1, value2, "TI_111");
            return (Criteria) this;
        }

        public Criteria andTI_111NotBetween(Double value1, Double value2) {
            addCriterion("TI_111 not between", value1, value2, "TI_111");
            return (Criteria) this;
        }

        public Criteria andTI_19IsNull() {
            addCriterion("TI_19 is null");
            return (Criteria) this;
        }

        public Criteria andTI_19IsNotNull() {
            addCriterion("TI_19 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_19EqualTo(Double value) {
            addCriterion("TI_19 =", value, "TI_19");
            return (Criteria) this;
        }

        public Criteria andTI_19NotEqualTo(Double value) {
            addCriterion("TI_19 <>", value, "TI_19");
            return (Criteria) this;
        }

        public Criteria andTI_19GreaterThan(Double value) {
            addCriterion("TI_19 >", value, "TI_19");
            return (Criteria) this;
        }

        public Criteria andTI_19GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_19 >=", value, "TI_19");
            return (Criteria) this;
        }

        public Criteria andTI_19LessThan(Double value) {
            addCriterion("TI_19 <", value, "TI_19");
            return (Criteria) this;
        }

        public Criteria andTI_19LessThanOrEqualTo(Double value) {
            addCriterion("TI_19 <=", value, "TI_19");
            return (Criteria) this;
        }

        public Criteria andTI_19In(List<Double> values) {
            addCriterion("TI_19 in", values, "TI_19");
            return (Criteria) this;
        }

        public Criteria andTI_19NotIn(List<Double> values) {
            addCriterion("TI_19 not in", values, "TI_19");
            return (Criteria) this;
        }

        public Criteria andTI_19Between(Double value1, Double value2) {
            addCriterion("TI_19 between", value1, value2, "TI_19");
            return (Criteria) this;
        }

        public Criteria andTI_19NotBetween(Double value1, Double value2) {
            addCriterion("TI_19 not between", value1, value2, "TI_19");
            return (Criteria) this;
        }

        public Criteria andTI_272IsNull() {
            addCriterion("TI_272 is null");
            return (Criteria) this;
        }

        public Criteria andTI_272IsNotNull() {
            addCriterion("TI_272 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_272EqualTo(Double value) {
            addCriterion("TI_272 =", value, "TI_272");
            return (Criteria) this;
        }

        public Criteria andTI_272NotEqualTo(Double value) {
            addCriterion("TI_272 <>", value, "TI_272");
            return (Criteria) this;
        }

        public Criteria andTI_272GreaterThan(Double value) {
            addCriterion("TI_272 >", value, "TI_272");
            return (Criteria) this;
        }

        public Criteria andTI_272GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_272 >=", value, "TI_272");
            return (Criteria) this;
        }

        public Criteria andTI_272LessThan(Double value) {
            addCriterion("TI_272 <", value, "TI_272");
            return (Criteria) this;
        }

        public Criteria andTI_272LessThanOrEqualTo(Double value) {
            addCriterion("TI_272 <=", value, "TI_272");
            return (Criteria) this;
        }

        public Criteria andTI_272In(List<Double> values) {
            addCriterion("TI_272 in", values, "TI_272");
            return (Criteria) this;
        }

        public Criteria andTI_272NotIn(List<Double> values) {
            addCriterion("TI_272 not in", values, "TI_272");
            return (Criteria) this;
        }

        public Criteria andTI_272Between(Double value1, Double value2) {
            addCriterion("TI_272 between", value1, value2, "TI_272");
            return (Criteria) this;
        }

        public Criteria andTI_272NotBetween(Double value1, Double value2) {
            addCriterion("TI_272 not between", value1, value2, "TI_272");
            return (Criteria) this;
        }

        public Criteria andTI_22IsNull() {
            addCriterion("TI_22 is null");
            return (Criteria) this;
        }

        public Criteria andTI_22IsNotNull() {
            addCriterion("TI_22 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_22EqualTo(Double value) {
            addCriterion("TI_22 =", value, "TI_22");
            return (Criteria) this;
        }

        public Criteria andTI_22NotEqualTo(Double value) {
            addCriterion("TI_22 <>", value, "TI_22");
            return (Criteria) this;
        }

        public Criteria andTI_22GreaterThan(Double value) {
            addCriterion("TI_22 >", value, "TI_22");
            return (Criteria) this;
        }

        public Criteria andTI_22GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_22 >=", value, "TI_22");
            return (Criteria) this;
        }

        public Criteria andTI_22LessThan(Double value) {
            addCriterion("TI_22 <", value, "TI_22");
            return (Criteria) this;
        }

        public Criteria andTI_22LessThanOrEqualTo(Double value) {
            addCriterion("TI_22 <=", value, "TI_22");
            return (Criteria) this;
        }

        public Criteria andTI_22In(List<Double> values) {
            addCriterion("TI_22 in", values, "TI_22");
            return (Criteria) this;
        }

        public Criteria andTI_22NotIn(List<Double> values) {
            addCriterion("TI_22 not in", values, "TI_22");
            return (Criteria) this;
        }

        public Criteria andTI_22Between(Double value1, Double value2) {
            addCriterion("TI_22 between", value1, value2, "TI_22");
            return (Criteria) this;
        }

        public Criteria andTI_22NotBetween(Double value1, Double value2) {
            addCriterion("TI_22 not between", value1, value2, "TI_22");
            return (Criteria) this;
        }

        public Criteria andTI_24IsNull() {
            addCriterion("TI_24 is null");
            return (Criteria) this;
        }

        public Criteria andTI_24IsNotNull() {
            addCriterion("TI_24 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_24EqualTo(Double value) {
            addCriterion("TI_24 =", value, "TI_24");
            return (Criteria) this;
        }

        public Criteria andTI_24NotEqualTo(Double value) {
            addCriterion("TI_24 <>", value, "TI_24");
            return (Criteria) this;
        }

        public Criteria andTI_24GreaterThan(Double value) {
            addCriterion("TI_24 >", value, "TI_24");
            return (Criteria) this;
        }

        public Criteria andTI_24GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_24 >=", value, "TI_24");
            return (Criteria) this;
        }

        public Criteria andTI_24LessThan(Double value) {
            addCriterion("TI_24 <", value, "TI_24");
            return (Criteria) this;
        }

        public Criteria andTI_24LessThanOrEqualTo(Double value) {
            addCriterion("TI_24 <=", value, "TI_24");
            return (Criteria) this;
        }

        public Criteria andTI_24In(List<Double> values) {
            addCriterion("TI_24 in", values, "TI_24");
            return (Criteria) this;
        }

        public Criteria andTI_24NotIn(List<Double> values) {
            addCriterion("TI_24 not in", values, "TI_24");
            return (Criteria) this;
        }

        public Criteria andTI_24Between(Double value1, Double value2) {
            addCriterion("TI_24 between", value1, value2, "TI_24");
            return (Criteria) this;
        }

        public Criteria andTI_24NotBetween(Double value1, Double value2) {
            addCriterion("TI_24 not between", value1, value2, "TI_24");
            return (Criteria) this;
        }

        public Criteria andTI_266IsNull() {
            addCriterion("TI_266 is null");
            return (Criteria) this;
        }

        public Criteria andTI_266IsNotNull() {
            addCriterion("TI_266 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_266EqualTo(Double value) {
            addCriterion("TI_266 =", value, "TI_266");
            return (Criteria) this;
        }

        public Criteria andTI_266NotEqualTo(Double value) {
            addCriterion("TI_266 <>", value, "TI_266");
            return (Criteria) this;
        }

        public Criteria andTI_266GreaterThan(Double value) {
            addCriterion("TI_266 >", value, "TI_266");
            return (Criteria) this;
        }

        public Criteria andTI_266GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_266 >=", value, "TI_266");
            return (Criteria) this;
        }

        public Criteria andTI_266LessThan(Double value) {
            addCriterion("TI_266 <", value, "TI_266");
            return (Criteria) this;
        }

        public Criteria andTI_266LessThanOrEqualTo(Double value) {
            addCriterion("TI_266 <=", value, "TI_266");
            return (Criteria) this;
        }

        public Criteria andTI_266In(List<Double> values) {
            addCriterion("TI_266 in", values, "TI_266");
            return (Criteria) this;
        }

        public Criteria andTI_266NotIn(List<Double> values) {
            addCriterion("TI_266 not in", values, "TI_266");
            return (Criteria) this;
        }

        public Criteria andTI_266Between(Double value1, Double value2) {
            addCriterion("TI_266 between", value1, value2, "TI_266");
            return (Criteria) this;
        }

        public Criteria andTI_266NotBetween(Double value1, Double value2) {
            addCriterion("TI_266 not between", value1, value2, "TI_266");
            return (Criteria) this;
        }

        public Criteria andTI_31IsNull() {
            addCriterion("TI_31 is null");
            return (Criteria) this;
        }

        public Criteria andTI_31IsNotNull() {
            addCriterion("TI_31 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_31EqualTo(Double value) {
            addCriterion("TI_31 =", value, "TI_31");
            return (Criteria) this;
        }

        public Criteria andTI_31NotEqualTo(Double value) {
            addCriterion("TI_31 <>", value, "TI_31");
            return (Criteria) this;
        }

        public Criteria andTI_31GreaterThan(Double value) {
            addCriterion("TI_31 >", value, "TI_31");
            return (Criteria) this;
        }

        public Criteria andTI_31GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_31 >=", value, "TI_31");
            return (Criteria) this;
        }

        public Criteria andTI_31LessThan(Double value) {
            addCriterion("TI_31 <", value, "TI_31");
            return (Criteria) this;
        }

        public Criteria andTI_31LessThanOrEqualTo(Double value) {
            addCriterion("TI_31 <=", value, "TI_31");
            return (Criteria) this;
        }

        public Criteria andTI_31In(List<Double> values) {
            addCriterion("TI_31 in", values, "TI_31");
            return (Criteria) this;
        }

        public Criteria andTI_31NotIn(List<Double> values) {
            addCriterion("TI_31 not in", values, "TI_31");
            return (Criteria) this;
        }

        public Criteria andTI_31Between(Double value1, Double value2) {
            addCriterion("TI_31 between", value1, value2, "TI_31");
            return (Criteria) this;
        }

        public Criteria andTI_31NotBetween(Double value1, Double value2) {
            addCriterion("TI_31 not between", value1, value2, "TI_31");
            return (Criteria) this;
        }

        public Criteria andTI_70IsNull() {
            addCriterion("TI_70 is null");
            return (Criteria) this;
        }

        public Criteria andTI_70IsNotNull() {
            addCriterion("TI_70 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_70EqualTo(Double value) {
            addCriterion("TI_70 =", value, "TI_70");
            return (Criteria) this;
        }

        public Criteria andTI_70NotEqualTo(Double value) {
            addCriterion("TI_70 <>", value, "TI_70");
            return (Criteria) this;
        }

        public Criteria andTI_70GreaterThan(Double value) {
            addCriterion("TI_70 >", value, "TI_70");
            return (Criteria) this;
        }

        public Criteria andTI_70GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_70 >=", value, "TI_70");
            return (Criteria) this;
        }

        public Criteria andTI_70LessThan(Double value) {
            addCriterion("TI_70 <", value, "TI_70");
            return (Criteria) this;
        }

        public Criteria andTI_70LessThanOrEqualTo(Double value) {
            addCriterion("TI_70 <=", value, "TI_70");
            return (Criteria) this;
        }

        public Criteria andTI_70In(List<Double> values) {
            addCriterion("TI_70 in", values, "TI_70");
            return (Criteria) this;
        }

        public Criteria andTI_70NotIn(List<Double> values) {
            addCriterion("TI_70 not in", values, "TI_70");
            return (Criteria) this;
        }

        public Criteria andTI_70Between(Double value1, Double value2) {
            addCriterion("TI_70 between", value1, value2, "TI_70");
            return (Criteria) this;
        }

        public Criteria andTI_70NotBetween(Double value1, Double value2) {
            addCriterion("TI_70 not between", value1, value2, "TI_70");
            return (Criteria) this;
        }

        public Criteria andTI_267IsNull() {
            addCriterion("TI_267 is null");
            return (Criteria) this;
        }

        public Criteria andTI_267IsNotNull() {
            addCriterion("TI_267 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_267EqualTo(Double value) {
            addCriterion("TI_267 =", value, "TI_267");
            return (Criteria) this;
        }

        public Criteria andTI_267NotEqualTo(Double value) {
            addCriterion("TI_267 <>", value, "TI_267");
            return (Criteria) this;
        }

        public Criteria andTI_267GreaterThan(Double value) {
            addCriterion("TI_267 >", value, "TI_267");
            return (Criteria) this;
        }

        public Criteria andTI_267GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_267 >=", value, "TI_267");
            return (Criteria) this;
        }

        public Criteria andTI_267LessThan(Double value) {
            addCriterion("TI_267 <", value, "TI_267");
            return (Criteria) this;
        }

        public Criteria andTI_267LessThanOrEqualTo(Double value) {
            addCriterion("TI_267 <=", value, "TI_267");
            return (Criteria) this;
        }

        public Criteria andTI_267In(List<Double> values) {
            addCriterion("TI_267 in", values, "TI_267");
            return (Criteria) this;
        }

        public Criteria andTI_267NotIn(List<Double> values) {
            addCriterion("TI_267 not in", values, "TI_267");
            return (Criteria) this;
        }

        public Criteria andTI_267Between(Double value1, Double value2) {
            addCriterion("TI_267 between", value1, value2, "TI_267");
            return (Criteria) this;
        }

        public Criteria andTI_267NotBetween(Double value1, Double value2) {
            addCriterion("TI_267 not between", value1, value2, "TI_267");
            return (Criteria) this;
        }

        public Criteria andTI_85AIsNull() {
            addCriterion("TI_85A is null");
            return (Criteria) this;
        }

        public Criteria andTI_85AIsNotNull() {
            addCriterion("TI_85A is not null");
            return (Criteria) this;
        }

        public Criteria andTI_85AEqualTo(Double value) {
            addCriterion("TI_85A =", value, "TI_85A");
            return (Criteria) this;
        }

        public Criteria andTI_85ANotEqualTo(Double value) {
            addCriterion("TI_85A <>", value, "TI_85A");
            return (Criteria) this;
        }

        public Criteria andTI_85AGreaterThan(Double value) {
            addCriterion("TI_85A >", value, "TI_85A");
            return (Criteria) this;
        }

        public Criteria andTI_85AGreaterThanOrEqualTo(Double value) {
            addCriterion("TI_85A >=", value, "TI_85A");
            return (Criteria) this;
        }

        public Criteria andTI_85ALessThan(Double value) {
            addCriterion("TI_85A <", value, "TI_85A");
            return (Criteria) this;
        }

        public Criteria andTI_85ALessThanOrEqualTo(Double value) {
            addCriterion("TI_85A <=", value, "TI_85A");
            return (Criteria) this;
        }

        public Criteria andTI_85AIn(List<Double> values) {
            addCriterion("TI_85A in", values, "TI_85A");
            return (Criteria) this;
        }

        public Criteria andTI_85ANotIn(List<Double> values) {
            addCriterion("TI_85A not in", values, "TI_85A");
            return (Criteria) this;
        }

        public Criteria andTI_85ABetween(Double value1, Double value2) {
            addCriterion("TI_85A between", value1, value2, "TI_85A");
            return (Criteria) this;
        }

        public Criteria andTI_85ANotBetween(Double value1, Double value2) {
            addCriterion("TI_85A not between", value1, value2, "TI_85A");
            return (Criteria) this;
        }

        public Criteria andTI_522IsNull() {
            addCriterion("TI_522 is null");
            return (Criteria) this;
        }

        public Criteria andTI_522IsNotNull() {
            addCriterion("TI_522 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_522EqualTo(Double value) {
            addCriterion("TI_522 =", value, "TI_522");
            return (Criteria) this;
        }

        public Criteria andTI_522NotEqualTo(Double value) {
            addCriterion("TI_522 <>", value, "TI_522");
            return (Criteria) this;
        }

        public Criteria andTI_522GreaterThan(Double value) {
            addCriterion("TI_522 >", value, "TI_522");
            return (Criteria) this;
        }

        public Criteria andTI_522GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_522 >=", value, "TI_522");
            return (Criteria) this;
        }

        public Criteria andTI_522LessThan(Double value) {
            addCriterion("TI_522 <", value, "TI_522");
            return (Criteria) this;
        }

        public Criteria andTI_522LessThanOrEqualTo(Double value) {
            addCriterion("TI_522 <=", value, "TI_522");
            return (Criteria) this;
        }

        public Criteria andTI_522In(List<Double> values) {
            addCriterion("TI_522 in", values, "TI_522");
            return (Criteria) this;
        }

        public Criteria andTI_522NotIn(List<Double> values) {
            addCriterion("TI_522 not in", values, "TI_522");
            return (Criteria) this;
        }

        public Criteria andTI_522Between(Double value1, Double value2) {
            addCriterion("TI_522 between", value1, value2, "TI_522");
            return (Criteria) this;
        }

        public Criteria andTI_522NotBetween(Double value1, Double value2) {
            addCriterion("TI_522 not between", value1, value2, "TI_522");
            return (Criteria) this;
        }

        public Criteria andTI_81IsNull() {
            addCriterion("TI_81 is null");
            return (Criteria) this;
        }

        public Criteria andTI_81IsNotNull() {
            addCriterion("TI_81 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_81EqualTo(Double value) {
            addCriterion("TI_81 =", value, "TI_81");
            return (Criteria) this;
        }

        public Criteria andTI_81NotEqualTo(Double value) {
            addCriterion("TI_81 <>", value, "TI_81");
            return (Criteria) this;
        }

        public Criteria andTI_81GreaterThan(Double value) {
            addCriterion("TI_81 >", value, "TI_81");
            return (Criteria) this;
        }

        public Criteria andTI_81GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_81 >=", value, "TI_81");
            return (Criteria) this;
        }

        public Criteria andTI_81LessThan(Double value) {
            addCriterion("TI_81 <", value, "TI_81");
            return (Criteria) this;
        }

        public Criteria andTI_81LessThanOrEqualTo(Double value) {
            addCriterion("TI_81 <=", value, "TI_81");
            return (Criteria) this;
        }

        public Criteria andTI_81In(List<Double> values) {
            addCriterion("TI_81 in", values, "TI_81");
            return (Criteria) this;
        }

        public Criteria andTI_81NotIn(List<Double> values) {
            addCriterion("TI_81 not in", values, "TI_81");
            return (Criteria) this;
        }

        public Criteria andTI_81Between(Double value1, Double value2) {
            addCriterion("TI_81 between", value1, value2, "TI_81");
            return (Criteria) this;
        }

        public Criteria andTI_81NotBetween(Double value1, Double value2) {
            addCriterion("TI_81 not between", value1, value2, "TI_81");
            return (Criteria) this;
        }

        public Criteria andTI_45IsNull() {
            addCriterion("TI_45 is null");
            return (Criteria) this;
        }

        public Criteria andTI_45IsNotNull() {
            addCriterion("TI_45 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_45EqualTo(Double value) {
            addCriterion("TI_45 =", value, "TI_45");
            return (Criteria) this;
        }

        public Criteria andTI_45NotEqualTo(Double value) {
            addCriterion("TI_45 <>", value, "TI_45");
            return (Criteria) this;
        }

        public Criteria andTI_45GreaterThan(Double value) {
            addCriterion("TI_45 >", value, "TI_45");
            return (Criteria) this;
        }

        public Criteria andTI_45GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_45 >=", value, "TI_45");
            return (Criteria) this;
        }

        public Criteria andTI_45LessThan(Double value) {
            addCriterion("TI_45 <", value, "TI_45");
            return (Criteria) this;
        }

        public Criteria andTI_45LessThanOrEqualTo(Double value) {
            addCriterion("TI_45 <=", value, "TI_45");
            return (Criteria) this;
        }

        public Criteria andTI_45In(List<Double> values) {
            addCriterion("TI_45 in", values, "TI_45");
            return (Criteria) this;
        }

        public Criteria andTI_45NotIn(List<Double> values) {
            addCriterion("TI_45 not in", values, "TI_45");
            return (Criteria) this;
        }

        public Criteria andTI_45Between(Double value1, Double value2) {
            addCriterion("TI_45 between", value1, value2, "TI_45");
            return (Criteria) this;
        }

        public Criteria andTI_45NotBetween(Double value1, Double value2) {
            addCriterion("TI_45 not between", value1, value2, "TI_45");
            return (Criteria) this;
        }

        public Criteria andTI_12IsNull() {
            addCriterion("TI_12 is null");
            return (Criteria) this;
        }

        public Criteria andTI_12IsNotNull() {
            addCriterion("TI_12 is not null");
            return (Criteria) this;
        }

        public Criteria andTI_12EqualTo(Double value) {
            addCriterion("TI_12 =", value, "TI_12");
            return (Criteria) this;
        }

        public Criteria andTI_12NotEqualTo(Double value) {
            addCriterion("TI_12 <>", value, "TI_12");
            return (Criteria) this;
        }

        public Criteria andTI_12GreaterThan(Double value) {
            addCriterion("TI_12 >", value, "TI_12");
            return (Criteria) this;
        }

        public Criteria andTI_12GreaterThanOrEqualTo(Double value) {
            addCriterion("TI_12 >=", value, "TI_12");
            return (Criteria) this;
        }

        public Criteria andTI_12LessThan(Double value) {
            addCriterion("TI_12 <", value, "TI_12");
            return (Criteria) this;
        }

        public Criteria andTI_12LessThanOrEqualTo(Double value) {
            addCriterion("TI_12 <=", value, "TI_12");
            return (Criteria) this;
        }

        public Criteria andTI_12In(List<Double> values) {
            addCriterion("TI_12 in", values, "TI_12");
            return (Criteria) this;
        }

        public Criteria andTI_12NotIn(List<Double> values) {
            addCriterion("TI_12 not in", values, "TI_12");
            return (Criteria) this;
        }

        public Criteria andTI_12Between(Double value1, Double value2) {
            addCriterion("TI_12 between", value1, value2, "TI_12");
            return (Criteria) this;
        }

        public Criteria andTI_12NotBetween(Double value1, Double value2) {
            addCriterion("TI_12 not between", value1, value2, "TI_12");
            return (Criteria) this;
        }

        public Criteria andFI_1IsNull() {
            addCriterion("FI_1 is null");
            return (Criteria) this;
        }

        public Criteria andFI_1IsNotNull() {
            addCriterion("FI_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_1EqualTo(Double value) {
            addCriterion("FI_1 =", value, "FI_1");
            return (Criteria) this;
        }

        public Criteria andFI_1NotEqualTo(Double value) {
            addCriterion("FI_1 <>", value, "FI_1");
            return (Criteria) this;
        }

        public Criteria andFI_1GreaterThan(Double value) {
            addCriterion("FI_1 >", value, "FI_1");
            return (Criteria) this;
        }

        public Criteria andFI_1GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_1 >=", value, "FI_1");
            return (Criteria) this;
        }

        public Criteria andFI_1LessThan(Double value) {
            addCriterion("FI_1 <", value, "FI_1");
            return (Criteria) this;
        }

        public Criteria andFI_1LessThanOrEqualTo(Double value) {
            addCriterion("FI_1 <=", value, "FI_1");
            return (Criteria) this;
        }

        public Criteria andFI_1In(List<Double> values) {
            addCriterion("FI_1 in", values, "FI_1");
            return (Criteria) this;
        }

        public Criteria andFI_1NotIn(List<Double> values) {
            addCriterion("FI_1 not in", values, "FI_1");
            return (Criteria) this;
        }

        public Criteria andFI_1Between(Double value1, Double value2) {
            addCriterion("FI_1 between", value1, value2, "FI_1");
            return (Criteria) this;
        }

        public Criteria andFI_1NotBetween(Double value1, Double value2) {
            addCriterion("FI_1 not between", value1, value2, "FI_1");
            return (Criteria) this;
        }

        public Criteria andFI_2IsNull() {
            addCriterion("FI_2 is null");
            return (Criteria) this;
        }

        public Criteria andFI_2IsNotNull() {
            addCriterion("FI_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_2EqualTo(Double value) {
            addCriterion("FI_2 =", value, "FI_2");
            return (Criteria) this;
        }

        public Criteria andFI_2NotEqualTo(Double value) {
            addCriterion("FI_2 <>", value, "FI_2");
            return (Criteria) this;
        }

        public Criteria andFI_2GreaterThan(Double value) {
            addCriterion("FI_2 >", value, "FI_2");
            return (Criteria) this;
        }

        public Criteria andFI_2GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_2 >=", value, "FI_2");
            return (Criteria) this;
        }

        public Criteria andFI_2LessThan(Double value) {
            addCriterion("FI_2 <", value, "FI_2");
            return (Criteria) this;
        }

        public Criteria andFI_2LessThanOrEqualTo(Double value) {
            addCriterion("FI_2 <=", value, "FI_2");
            return (Criteria) this;
        }

        public Criteria andFI_2In(List<Double> values) {
            addCriterion("FI_2 in", values, "FI_2");
            return (Criteria) this;
        }

        public Criteria andFI_2NotIn(List<Double> values) {
            addCriterion("FI_2 not in", values, "FI_2");
            return (Criteria) this;
        }

        public Criteria andFI_2Between(Double value1, Double value2) {
            addCriterion("FI_2 between", value1, value2, "FI_2");
            return (Criteria) this;
        }

        public Criteria andFI_2NotBetween(Double value1, Double value2) {
            addCriterion("FI_2 not between", value1, value2, "FI_2");
            return (Criteria) this;
        }

        public Criteria andFI_3IsNull() {
            addCriterion("FI_3 is null");
            return (Criteria) this;
        }

        public Criteria andFI_3IsNotNull() {
            addCriterion("FI_3 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_3EqualTo(Double value) {
            addCriterion("FI_3 =", value, "FI_3");
            return (Criteria) this;
        }

        public Criteria andFI_3NotEqualTo(Double value) {
            addCriterion("FI_3 <>", value, "FI_3");
            return (Criteria) this;
        }

        public Criteria andFI_3GreaterThan(Double value) {
            addCriterion("FI_3 >", value, "FI_3");
            return (Criteria) this;
        }

        public Criteria andFI_3GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_3 >=", value, "FI_3");
            return (Criteria) this;
        }

        public Criteria andFI_3LessThan(Double value) {
            addCriterion("FI_3 <", value, "FI_3");
            return (Criteria) this;
        }

        public Criteria andFI_3LessThanOrEqualTo(Double value) {
            addCriterion("FI_3 <=", value, "FI_3");
            return (Criteria) this;
        }

        public Criteria andFI_3In(List<Double> values) {
            addCriterion("FI_3 in", values, "FI_3");
            return (Criteria) this;
        }

        public Criteria andFI_3NotIn(List<Double> values) {
            addCriterion("FI_3 not in", values, "FI_3");
            return (Criteria) this;
        }

        public Criteria andFI_3Between(Double value1, Double value2) {
            addCriterion("FI_3 between", value1, value2, "FI_3");
            return (Criteria) this;
        }

        public Criteria andFI_3NotBetween(Double value1, Double value2) {
            addCriterion("FI_3 not between", value1, value2, "FI_3");
            return (Criteria) this;
        }

        public Criteria andFI_51IsNull() {
            addCriterion("FI_51 is null");
            return (Criteria) this;
        }

        public Criteria andFI_51IsNotNull() {
            addCriterion("FI_51 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_51EqualTo(Double value) {
            addCriterion("FI_51 =", value, "FI_51");
            return (Criteria) this;
        }

        public Criteria andFI_51NotEqualTo(Double value) {
            addCriterion("FI_51 <>", value, "FI_51");
            return (Criteria) this;
        }

        public Criteria andFI_51GreaterThan(Double value) {
            addCriterion("FI_51 >", value, "FI_51");
            return (Criteria) this;
        }

        public Criteria andFI_51GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_51 >=", value, "FI_51");
            return (Criteria) this;
        }

        public Criteria andFI_51LessThan(Double value) {
            addCriterion("FI_51 <", value, "FI_51");
            return (Criteria) this;
        }

        public Criteria andFI_51LessThanOrEqualTo(Double value) {
            addCriterion("FI_51 <=", value, "FI_51");
            return (Criteria) this;
        }

        public Criteria andFI_51In(List<Double> values) {
            addCriterion("FI_51 in", values, "FI_51");
            return (Criteria) this;
        }

        public Criteria andFI_51NotIn(List<Double> values) {
            addCriterion("FI_51 not in", values, "FI_51");
            return (Criteria) this;
        }

        public Criteria andFI_51Between(Double value1, Double value2) {
            addCriterion("FI_51 between", value1, value2, "FI_51");
            return (Criteria) this;
        }

        public Criteria andFI_51NotBetween(Double value1, Double value2) {
            addCriterion("FI_51 not between", value1, value2, "FI_51");
            return (Criteria) this;
        }

        public Criteria andFI_4001IsNull() {
            addCriterion("FI_4001 is null");
            return (Criteria) this;
        }

        public Criteria andFI_4001IsNotNull() {
            addCriterion("FI_4001 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_4001EqualTo(Double value) {
            addCriterion("FI_4001 =", value, "FI_4001");
            return (Criteria) this;
        }

        public Criteria andFI_4001NotEqualTo(Double value) {
            addCriterion("FI_4001 <>", value, "FI_4001");
            return (Criteria) this;
        }

        public Criteria andFI_4001GreaterThan(Double value) {
            addCriterion("FI_4001 >", value, "FI_4001");
            return (Criteria) this;
        }

        public Criteria andFI_4001GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_4001 >=", value, "FI_4001");
            return (Criteria) this;
        }

        public Criteria andFI_4001LessThan(Double value) {
            addCriterion("FI_4001 <", value, "FI_4001");
            return (Criteria) this;
        }

        public Criteria andFI_4001LessThanOrEqualTo(Double value) {
            addCriterion("FI_4001 <=", value, "FI_4001");
            return (Criteria) this;
        }

        public Criteria andFI_4001In(List<Double> values) {
            addCriterion("FI_4001 in", values, "FI_4001");
            return (Criteria) this;
        }

        public Criteria andFI_4001NotIn(List<Double> values) {
            addCriterion("FI_4001 not in", values, "FI_4001");
            return (Criteria) this;
        }

        public Criteria andFI_4001Between(Double value1, Double value2) {
            addCriterion("FI_4001 between", value1, value2, "FI_4001");
            return (Criteria) this;
        }

        public Criteria andFI_4001NotBetween(Double value1, Double value2) {
            addCriterion("FI_4001 not between", value1, value2, "FI_4001");
            return (Criteria) this;
        }

        public Criteria andFI_63IsNull() {
            addCriterion("FI_63 is null");
            return (Criteria) this;
        }

        public Criteria andFI_63IsNotNull() {
            addCriterion("FI_63 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_63EqualTo(Double value) {
            addCriterion("FI_63 =", value, "FI_63");
            return (Criteria) this;
        }

        public Criteria andFI_63NotEqualTo(Double value) {
            addCriterion("FI_63 <>", value, "FI_63");
            return (Criteria) this;
        }

        public Criteria andFI_63GreaterThan(Double value) {
            addCriterion("FI_63 >", value, "FI_63");
            return (Criteria) this;
        }

        public Criteria andFI_63GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_63 >=", value, "FI_63");
            return (Criteria) this;
        }

        public Criteria andFI_63LessThan(Double value) {
            addCriterion("FI_63 <", value, "FI_63");
            return (Criteria) this;
        }

        public Criteria andFI_63LessThanOrEqualTo(Double value) {
            addCriterion("FI_63 <=", value, "FI_63");
            return (Criteria) this;
        }

        public Criteria andFI_63In(List<Double> values) {
            addCriterion("FI_63 in", values, "FI_63");
            return (Criteria) this;
        }

        public Criteria andFI_63NotIn(List<Double> values) {
            addCriterion("FI_63 not in", values, "FI_63");
            return (Criteria) this;
        }

        public Criteria andFI_63Between(Double value1, Double value2) {
            addCriterion("FI_63 between", value1, value2, "FI_63");
            return (Criteria) this;
        }

        public Criteria andFI_63NotBetween(Double value1, Double value2) {
            addCriterion("FI_63 not between", value1, value2, "FI_63");
            return (Criteria) this;
        }

        public Criteria andFI_27IsNull() {
            addCriterion("FI_27 is null");
            return (Criteria) this;
        }

        public Criteria andFI_27IsNotNull() {
            addCriterion("FI_27 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_27EqualTo(Double value) {
            addCriterion("FI_27 =", value, "FI_27");
            return (Criteria) this;
        }

        public Criteria andFI_27NotEqualTo(Double value) {
            addCriterion("FI_27 <>", value, "FI_27");
            return (Criteria) this;
        }

        public Criteria andFI_27GreaterThan(Double value) {
            addCriterion("FI_27 >", value, "FI_27");
            return (Criteria) this;
        }

        public Criteria andFI_27GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_27 >=", value, "FI_27");
            return (Criteria) this;
        }

        public Criteria andFI_27LessThan(Double value) {
            addCriterion("FI_27 <", value, "FI_27");
            return (Criteria) this;
        }

        public Criteria andFI_27LessThanOrEqualTo(Double value) {
            addCriterion("FI_27 <=", value, "FI_27");
            return (Criteria) this;
        }

        public Criteria andFI_27In(List<Double> values) {
            addCriterion("FI_27 in", values, "FI_27");
            return (Criteria) this;
        }

        public Criteria andFI_27NotIn(List<Double> values) {
            addCriterion("FI_27 not in", values, "FI_27");
            return (Criteria) this;
        }

        public Criteria andFI_27Between(Double value1, Double value2) {
            addCriterion("FI_27 between", value1, value2, "FI_27");
            return (Criteria) this;
        }

        public Criteria andFI_27NotBetween(Double value1, Double value2) {
            addCriterion("FI_27 not between", value1, value2, "FI_27");
            return (Criteria) this;
        }

        public Criteria andFI_5IsNull() {
            addCriterion("FI_5 is null");
            return (Criteria) this;
        }

        public Criteria andFI_5IsNotNull() {
            addCriterion("FI_5 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_5EqualTo(Double value) {
            addCriterion("FI_5 =", value, "FI_5");
            return (Criteria) this;
        }

        public Criteria andFI_5NotEqualTo(Double value) {
            addCriterion("FI_5 <>", value, "FI_5");
            return (Criteria) this;
        }

        public Criteria andFI_5GreaterThan(Double value) {
            addCriterion("FI_5 >", value, "FI_5");
            return (Criteria) this;
        }

        public Criteria andFI_5GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_5 >=", value, "FI_5");
            return (Criteria) this;
        }

        public Criteria andFI_5LessThan(Double value) {
            addCriterion("FI_5 <", value, "FI_5");
            return (Criteria) this;
        }

        public Criteria andFI_5LessThanOrEqualTo(Double value) {
            addCriterion("FI_5 <=", value, "FI_5");
            return (Criteria) this;
        }

        public Criteria andFI_5In(List<Double> values) {
            addCriterion("FI_5 in", values, "FI_5");
            return (Criteria) this;
        }

        public Criteria andFI_5NotIn(List<Double> values) {
            addCriterion("FI_5 not in", values, "FI_5");
            return (Criteria) this;
        }

        public Criteria andFI_5Between(Double value1, Double value2) {
            addCriterion("FI_5 between", value1, value2, "FI_5");
            return (Criteria) this;
        }

        public Criteria andFI_5NotBetween(Double value1, Double value2) {
            addCriterion("FI_5 not between", value1, value2, "FI_5");
            return (Criteria) this;
        }

        public Criteria andW_CIsNull() {
            addCriterion("W_C is null");
            return (Criteria) this;
        }

        public Criteria andW_CIsNotNull() {
            addCriterion("W_C is not null");
            return (Criteria) this;
        }

        public Criteria andW_CEqualTo(Double value) {
            addCriterion("W_C =", value, "w_C");
            return (Criteria) this;
        }

        public Criteria andW_CNotEqualTo(Double value) {
            addCriterion("W_C <>", value, "w_C");
            return (Criteria) this;
        }

        public Criteria andW_CGreaterThan(Double value) {
            addCriterion("W_C >", value, "w_C");
            return (Criteria) this;
        }

        public Criteria andW_CGreaterThanOrEqualTo(Double value) {
            addCriterion("W_C >=", value, "w_C");
            return (Criteria) this;
        }

        public Criteria andW_CLessThan(Double value) {
            addCriterion("W_C <", value, "w_C");
            return (Criteria) this;
        }

        public Criteria andW_CLessThanOrEqualTo(Double value) {
            addCriterion("W_C <=", value, "w_C");
            return (Criteria) this;
        }

        public Criteria andW_CIn(List<Double> values) {
            addCriterion("W_C in", values, "w_C");
            return (Criteria) this;
        }

        public Criteria andW_CNotIn(List<Double> values) {
            addCriterion("W_C not in", values, "w_C");
            return (Criteria) this;
        }

        public Criteria andW_CBetween(Double value1, Double value2) {
            addCriterion("W_C between", value1, value2, "w_C");
            return (Criteria) this;
        }

        public Criteria andW_CNotBetween(Double value1, Double value2) {
            addCriterion("W_C not between", value1, value2, "w_C");
            return (Criteria) this;
        }

        public Criteria andA_CIsNull() {
            addCriterion("A_C is null");
            return (Criteria) this;
        }

        public Criteria andA_CIsNotNull() {
            addCriterion("A_C is not null");
            return (Criteria) this;
        }

        public Criteria andA_CEqualTo(Double value) {
            addCriterion("A_C =", value, "a_C");
            return (Criteria) this;
        }

        public Criteria andA_CNotEqualTo(Double value) {
            addCriterion("A_C <>", value, "a_C");
            return (Criteria) this;
        }

        public Criteria andA_CGreaterThan(Double value) {
            addCriterion("A_C >", value, "a_C");
            return (Criteria) this;
        }

        public Criteria andA_CGreaterThanOrEqualTo(Double value) {
            addCriterion("A_C >=", value, "a_C");
            return (Criteria) this;
        }

        public Criteria andA_CLessThan(Double value) {
            addCriterion("A_C <", value, "a_C");
            return (Criteria) this;
        }

        public Criteria andA_CLessThanOrEqualTo(Double value) {
            addCriterion("A_C <=", value, "a_C");
            return (Criteria) this;
        }

        public Criteria andA_CIn(List<Double> values) {
            addCriterion("A_C in", values, "a_C");
            return (Criteria) this;
        }

        public Criteria andA_CNotIn(List<Double> values) {
            addCriterion("A_C not in", values, "a_C");
            return (Criteria) this;
        }

        public Criteria andA_CBetween(Double value1, Double value2) {
            addCriterion("A_C between", value1, value2, "a_C");
            return (Criteria) this;
        }

        public Criteria andA_CNotBetween(Double value1, Double value2) {
            addCriterion("A_C not between", value1, value2, "a_C");
            return (Criteria) this;
        }

        public Criteria andFI_2000IsNull() {
            addCriterion("FI_2000 is null");
            return (Criteria) this;
        }

        public Criteria andFI_2000IsNotNull() {
            addCriterion("FI_2000 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_2000EqualTo(Double value) {
            addCriterion("FI_2000 =", value, "FI_2000");
            return (Criteria) this;
        }

        public Criteria andFI_2000NotEqualTo(Double value) {
            addCriterion("FI_2000 <>", value, "FI_2000");
            return (Criteria) this;
        }

        public Criteria andFI_2000GreaterThan(Double value) {
            addCriterion("FI_2000 >", value, "FI_2000");
            return (Criteria) this;
        }

        public Criteria andFI_2000GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_2000 >=", value, "FI_2000");
            return (Criteria) this;
        }

        public Criteria andFI_2000LessThan(Double value) {
            addCriterion("FI_2000 <", value, "FI_2000");
            return (Criteria) this;
        }

        public Criteria andFI_2000LessThanOrEqualTo(Double value) {
            addCriterion("FI_2000 <=", value, "FI_2000");
            return (Criteria) this;
        }

        public Criteria andFI_2000In(List<Double> values) {
            addCriterion("FI_2000 in", values, "FI_2000");
            return (Criteria) this;
        }

        public Criteria andFI_2000NotIn(List<Double> values) {
            addCriterion("FI_2000 not in", values, "FI_2000");
            return (Criteria) this;
        }

        public Criteria andFI_2000Between(Double value1, Double value2) {
            addCriterion("FI_2000 between", value1, value2, "FI_2000");
            return (Criteria) this;
        }

        public Criteria andFI_2000NotBetween(Double value1, Double value2) {
            addCriterion("FI_2000 not between", value1, value2, "FI_2000");
            return (Criteria) this;
        }

        public Criteria andFI_7IsNull() {
            addCriterion("FI_7 is null");
            return (Criteria) this;
        }

        public Criteria andFI_7IsNotNull() {
            addCriterion("FI_7 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_7EqualTo(Double value) {
            addCriterion("FI_7 =", value, "FI_7");
            return (Criteria) this;
        }

        public Criteria andFI_7NotEqualTo(Double value) {
            addCriterion("FI_7 <>", value, "FI_7");
            return (Criteria) this;
        }

        public Criteria andFI_7GreaterThan(Double value) {
            addCriterion("FI_7 >", value, "FI_7");
            return (Criteria) this;
        }

        public Criteria andFI_7GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_7 >=", value, "FI_7");
            return (Criteria) this;
        }

        public Criteria andFI_7LessThan(Double value) {
            addCriterion("FI_7 <", value, "FI_7");
            return (Criteria) this;
        }

        public Criteria andFI_7LessThanOrEqualTo(Double value) {
            addCriterion("FI_7 <=", value, "FI_7");
            return (Criteria) this;
        }

        public Criteria andFI_7In(List<Double> values) {
            addCriterion("FI_7 in", values, "FI_7");
            return (Criteria) this;
        }

        public Criteria andFI_7NotIn(List<Double> values) {
            addCriterion("FI_7 not in", values, "FI_7");
            return (Criteria) this;
        }

        public Criteria andFI_7Between(Double value1, Double value2) {
            addCriterion("FI_7 between", value1, value2, "FI_7");
            return (Criteria) this;
        }

        public Criteria andFI_7NotBetween(Double value1, Double value2) {
            addCriterion("FI_7 not between", value1, value2, "FI_7");
            return (Criteria) this;
        }

        public Criteria andFI_84IsNull() {
            addCriterion("FI_84 is null");
            return (Criteria) this;
        }

        public Criteria andFI_84IsNotNull() {
            addCriterion("FI_84 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_84EqualTo(Double value) {
            addCriterion("FI_84 =", value, "FI_84");
            return (Criteria) this;
        }

        public Criteria andFI_84NotEqualTo(Double value) {
            addCriterion("FI_84 <>", value, "FI_84");
            return (Criteria) this;
        }

        public Criteria andFI_84GreaterThan(Double value) {
            addCriterion("FI_84 >", value, "FI_84");
            return (Criteria) this;
        }

        public Criteria andFI_84GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_84 >=", value, "FI_84");
            return (Criteria) this;
        }

        public Criteria andFI_84LessThan(Double value) {
            addCriterion("FI_84 <", value, "FI_84");
            return (Criteria) this;
        }

        public Criteria andFI_84LessThanOrEqualTo(Double value) {
            addCriterion("FI_84 <=", value, "FI_84");
            return (Criteria) this;
        }

        public Criteria andFI_84In(List<Double> values) {
            addCriterion("FI_84 in", values, "FI_84");
            return (Criteria) this;
        }

        public Criteria andFI_84NotIn(List<Double> values) {
            addCriterion("FI_84 not in", values, "FI_84");
            return (Criteria) this;
        }

        public Criteria andFI_84Between(Double value1, Double value2) {
            addCriterion("FI_84 between", value1, value2, "FI_84");
            return (Criteria) this;
        }

        public Criteria andFI_84NotBetween(Double value1, Double value2) {
            addCriterion("FI_84 not between", value1, value2, "FI_84");
            return (Criteria) this;
        }

        public Criteria andFI_84AIsNull() {
            addCriterion("FI_84A is null");
            return (Criteria) this;
        }

        public Criteria andFI_84AIsNotNull() {
            addCriterion("FI_84A is not null");
            return (Criteria) this;
        }

        public Criteria andFI_84AEqualTo(Double value) {
            addCriterion("FI_84A =", value, "FI_84A");
            return (Criteria) this;
        }

        public Criteria andFI_84ANotEqualTo(Double value) {
            addCriterion("FI_84A <>", value, "FI_84A");
            return (Criteria) this;
        }

        public Criteria andFI_84AGreaterThan(Double value) {
            addCriterion("FI_84A >", value, "FI_84A");
            return (Criteria) this;
        }

        public Criteria andFI_84AGreaterThanOrEqualTo(Double value) {
            addCriterion("FI_84A >=", value, "FI_84A");
            return (Criteria) this;
        }

        public Criteria andFI_84ALessThan(Double value) {
            addCriterion("FI_84A <", value, "FI_84A");
            return (Criteria) this;
        }

        public Criteria andFI_84ALessThanOrEqualTo(Double value) {
            addCriterion("FI_84A <=", value, "FI_84A");
            return (Criteria) this;
        }

        public Criteria andFI_84AIn(List<Double> values) {
            addCriterion("FI_84A in", values, "FI_84A");
            return (Criteria) this;
        }

        public Criteria andFI_84ANotIn(List<Double> values) {
            addCriterion("FI_84A not in", values, "FI_84A");
            return (Criteria) this;
        }

        public Criteria andFI_84ABetween(Double value1, Double value2) {
            addCriterion("FI_84A between", value1, value2, "FI_84A");
            return (Criteria) this;
        }

        public Criteria andFI_84ANotBetween(Double value1, Double value2) {
            addCriterion("FI_84A not between", value1, value2, "FI_84A");
            return (Criteria) this;
        }

        public Criteria andFI_84BIsNull() {
            addCriterion("FI_84B is null");
            return (Criteria) this;
        }

        public Criteria andFI_84BIsNotNull() {
            addCriterion("FI_84B is not null");
            return (Criteria) this;
        }

        public Criteria andFI_84BEqualTo(Double value) {
            addCriterion("FI_84B =", value, "FI_84B");
            return (Criteria) this;
        }

        public Criteria andFI_84BNotEqualTo(Double value) {
            addCriterion("FI_84B <>", value, "FI_84B");
            return (Criteria) this;
        }

        public Criteria andFI_84BGreaterThan(Double value) {
            addCriterion("FI_84B >", value, "FI_84B");
            return (Criteria) this;
        }

        public Criteria andFI_84BGreaterThanOrEqualTo(Double value) {
            addCriterion("FI_84B >=", value, "FI_84B");
            return (Criteria) this;
        }

        public Criteria andFI_84BLessThan(Double value) {
            addCriterion("FI_84B <", value, "FI_84B");
            return (Criteria) this;
        }

        public Criteria andFI_84BLessThanOrEqualTo(Double value) {
            addCriterion("FI_84B <=", value, "FI_84B");
            return (Criteria) this;
        }

        public Criteria andFI_84BIn(List<Double> values) {
            addCriterion("FI_84B in", values, "FI_84B");
            return (Criteria) this;
        }

        public Criteria andFI_84BNotIn(List<Double> values) {
            addCriterion("FI_84B not in", values, "FI_84B");
            return (Criteria) this;
        }

        public Criteria andFI_84BBetween(Double value1, Double value2) {
            addCriterion("FI_84B between", value1, value2, "FI_84B");
            return (Criteria) this;
        }

        public Criteria andFI_84BNotBetween(Double value1, Double value2) {
            addCriterion("FI_84B not between", value1, value2, "FI_84B");
            return (Criteria) this;
        }

        public Criteria andFI_314IsNull() {
            addCriterion("FI_314 is null");
            return (Criteria) this;
        }

        public Criteria andFI_314IsNotNull() {
            addCriterion("FI_314 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_314EqualTo(Double value) {
            addCriterion("FI_314 =", value, "FI_314");
            return (Criteria) this;
        }

        public Criteria andFI_314NotEqualTo(Double value) {
            addCriterion("FI_314 <>", value, "FI_314");
            return (Criteria) this;
        }

        public Criteria andFI_314GreaterThan(Double value) {
            addCriterion("FI_314 >", value, "FI_314");
            return (Criteria) this;
        }

        public Criteria andFI_314GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_314 >=", value, "FI_314");
            return (Criteria) this;
        }

        public Criteria andFI_314LessThan(Double value) {
            addCriterion("FI_314 <", value, "FI_314");
            return (Criteria) this;
        }

        public Criteria andFI_314LessThanOrEqualTo(Double value) {
            addCriterion("FI_314 <=", value, "FI_314");
            return (Criteria) this;
        }

        public Criteria andFI_314In(List<Double> values) {
            addCriterion("FI_314 in", values, "FI_314");
            return (Criteria) this;
        }

        public Criteria andFI_314NotIn(List<Double> values) {
            addCriterion("FI_314 not in", values, "FI_314");
            return (Criteria) this;
        }

        public Criteria andFI_314Between(Double value1, Double value2) {
            addCriterion("FI_314 between", value1, value2, "FI_314");
            return (Criteria) this;
        }

        public Criteria andFI_314NotBetween(Double value1, Double value2) {
            addCriterion("FI_314 not between", value1, value2, "FI_314");
            return (Criteria) this;
        }

        public Criteria andFI_3110IsNull() {
            addCriterion("FI_3110 is null");
            return (Criteria) this;
        }

        public Criteria andFI_3110IsNotNull() {
            addCriterion("FI_3110 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_3110EqualTo(Double value) {
            addCriterion("FI_3110 =", value, "FI_3110");
            return (Criteria) this;
        }

        public Criteria andFI_3110NotEqualTo(Double value) {
            addCriterion("FI_3110 <>", value, "FI_3110");
            return (Criteria) this;
        }

        public Criteria andFI_3110GreaterThan(Double value) {
            addCriterion("FI_3110 >", value, "FI_3110");
            return (Criteria) this;
        }

        public Criteria andFI_3110GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_3110 >=", value, "FI_3110");
            return (Criteria) this;
        }

        public Criteria andFI_3110LessThan(Double value) {
            addCriterion("FI_3110 <", value, "FI_3110");
            return (Criteria) this;
        }

        public Criteria andFI_3110LessThanOrEqualTo(Double value) {
            addCriterion("FI_3110 <=", value, "FI_3110");
            return (Criteria) this;
        }

        public Criteria andFI_3110In(List<Double> values) {
            addCriterion("FI_3110 in", values, "FI_3110");
            return (Criteria) this;
        }

        public Criteria andFI_3110NotIn(List<Double> values) {
            addCriterion("FI_3110 not in", values, "FI_3110");
            return (Criteria) this;
        }

        public Criteria andFI_3110Between(Double value1, Double value2) {
            addCriterion("FI_3110 between", value1, value2, "FI_3110");
            return (Criteria) this;
        }

        public Criteria andFI_3110NotBetween(Double value1, Double value2) {
            addCriterion("FI_3110 not between", value1, value2, "FI_3110");
            return (Criteria) this;
        }

        public Criteria andFI_3116IsNull() {
            addCriterion("FI_3116 is null");
            return (Criteria) this;
        }

        public Criteria andFI_3116IsNotNull() {
            addCriterion("FI_3116 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_3116EqualTo(Double value) {
            addCriterion("FI_3116 =", value, "FI_3116");
            return (Criteria) this;
        }

        public Criteria andFI_3116NotEqualTo(Double value) {
            addCriterion("FI_3116 <>", value, "FI_3116");
            return (Criteria) this;
        }

        public Criteria andFI_3116GreaterThan(Double value) {
            addCriterion("FI_3116 >", value, "FI_3116");
            return (Criteria) this;
        }

        public Criteria andFI_3116GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_3116 >=", value, "FI_3116");
            return (Criteria) this;
        }

        public Criteria andFI_3116LessThan(Double value) {
            addCriterion("FI_3116 <", value, "FI_3116");
            return (Criteria) this;
        }

        public Criteria andFI_3116LessThanOrEqualTo(Double value) {
            addCriterion("FI_3116 <=", value, "FI_3116");
            return (Criteria) this;
        }

        public Criteria andFI_3116In(List<Double> values) {
            addCriterion("FI_3116 in", values, "FI_3116");
            return (Criteria) this;
        }

        public Criteria andFI_3116NotIn(List<Double> values) {
            addCriterion("FI_3116 not in", values, "FI_3116");
            return (Criteria) this;
        }

        public Criteria andFI_3116Between(Double value1, Double value2) {
            addCriterion("FI_3116 between", value1, value2, "FI_3116");
            return (Criteria) this;
        }

        public Criteria andFI_3116NotBetween(Double value1, Double value2) {
            addCriterion("FI_3116 not between", value1, value2, "FI_3116");
            return (Criteria) this;
        }

        public Criteria andFI_3117IsNull() {
            addCriterion("FI_3117 is null");
            return (Criteria) this;
        }

        public Criteria andFI_3117IsNotNull() {
            addCriterion("FI_3117 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_3117EqualTo(Double value) {
            addCriterion("FI_3117 =", value, "FI_3117");
            return (Criteria) this;
        }

        public Criteria andFI_3117NotEqualTo(Double value) {
            addCriterion("FI_3117 <>", value, "FI_3117");
            return (Criteria) this;
        }

        public Criteria andFI_3117GreaterThan(Double value) {
            addCriterion("FI_3117 >", value, "FI_3117");
            return (Criteria) this;
        }

        public Criteria andFI_3117GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_3117 >=", value, "FI_3117");
            return (Criteria) this;
        }

        public Criteria andFI_3117LessThan(Double value) {
            addCriterion("FI_3117 <", value, "FI_3117");
            return (Criteria) this;
        }

        public Criteria andFI_3117LessThanOrEqualTo(Double value) {
            addCriterion("FI_3117 <=", value, "FI_3117");
            return (Criteria) this;
        }

        public Criteria andFI_3117In(List<Double> values) {
            addCriterion("FI_3117 in", values, "FI_3117");
            return (Criteria) this;
        }

        public Criteria andFI_3117NotIn(List<Double> values) {
            addCriterion("FI_3117 not in", values, "FI_3117");
            return (Criteria) this;
        }

        public Criteria andFI_3117Between(Double value1, Double value2) {
            addCriterion("FI_3117 between", value1, value2, "FI_3117");
            return (Criteria) this;
        }

        public Criteria andFI_3117NotBetween(Double value1, Double value2) {
            addCriterion("FI_3117 not between", value1, value2, "FI_3117");
            return (Criteria) this;
        }

        public Criteria andFI_2301IsNull() {
            addCriterion("FI_2301 is null");
            return (Criteria) this;
        }

        public Criteria andFI_2301IsNotNull() {
            addCriterion("FI_2301 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_2301EqualTo(Double value) {
            addCriterion("FI_2301 =", value, "FI_2301");
            return (Criteria) this;
        }

        public Criteria andFI_2301NotEqualTo(Double value) {
            addCriterion("FI_2301 <>", value, "FI_2301");
            return (Criteria) this;
        }

        public Criteria andFI_2301GreaterThan(Double value) {
            addCriterion("FI_2301 >", value, "FI_2301");
            return (Criteria) this;
        }

        public Criteria andFI_2301GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_2301 >=", value, "FI_2301");
            return (Criteria) this;
        }

        public Criteria andFI_2301LessThan(Double value) {
            addCriterion("FI_2301 <", value, "FI_2301");
            return (Criteria) this;
        }

        public Criteria andFI_2301LessThanOrEqualTo(Double value) {
            addCriterion("FI_2301 <=", value, "FI_2301");
            return (Criteria) this;
        }

        public Criteria andFI_2301In(List<Double> values) {
            addCriterion("FI_2301 in", values, "FI_2301");
            return (Criteria) this;
        }

        public Criteria andFI_2301NotIn(List<Double> values) {
            addCriterion("FI_2301 not in", values, "FI_2301");
            return (Criteria) this;
        }

        public Criteria andFI_2301Between(Double value1, Double value2) {
            addCriterion("FI_2301 between", value1, value2, "FI_2301");
            return (Criteria) this;
        }

        public Criteria andFI_2301NotBetween(Double value1, Double value2) {
            addCriterion("FI_2301 not between", value1, value2, "FI_2301");
            return (Criteria) this;
        }

        public Criteria andFI_50IsNull() {
            addCriterion("FI_50 is null");
            return (Criteria) this;
        }

        public Criteria andFI_50IsNotNull() {
            addCriterion("FI_50 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_50EqualTo(Double value) {
            addCriterion("FI_50 =", value, "FI_50");
            return (Criteria) this;
        }

        public Criteria andFI_50NotEqualTo(Double value) {
            addCriterion("FI_50 <>", value, "FI_50");
            return (Criteria) this;
        }

        public Criteria andFI_50GreaterThan(Double value) {
            addCriterion("FI_50 >", value, "FI_50");
            return (Criteria) this;
        }

        public Criteria andFI_50GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_50 >=", value, "FI_50");
            return (Criteria) this;
        }

        public Criteria andFI_50LessThan(Double value) {
            addCriterion("FI_50 <", value, "FI_50");
            return (Criteria) this;
        }

        public Criteria andFI_50LessThanOrEqualTo(Double value) {
            addCriterion("FI_50 <=", value, "FI_50");
            return (Criteria) this;
        }

        public Criteria andFI_50In(List<Double> values) {
            addCriterion("FI_50 in", values, "FI_50");
            return (Criteria) this;
        }

        public Criteria andFI_50NotIn(List<Double> values) {
            addCriterion("FI_50 not in", values, "FI_50");
            return (Criteria) this;
        }

        public Criteria andFI_50Between(Double value1, Double value2) {
            addCriterion("FI_50 between", value1, value2, "FI_50");
            return (Criteria) this;
        }

        public Criteria andFI_50NotBetween(Double value1, Double value2) {
            addCriterion("FI_50 not between", value1, value2, "FI_50");
            return (Criteria) this;
        }

        public Criteria andFI_1502IsNull() {
            addCriterion("FI_1502 is null");
            return (Criteria) this;
        }

        public Criteria andFI_1502IsNotNull() {
            addCriterion("FI_1502 is not null");
            return (Criteria) this;
        }

        public Criteria andFI_1502EqualTo(Double value) {
            addCriterion("FI_1502 =", value, "FI_1502");
            return (Criteria) this;
        }

        public Criteria andFI_1502NotEqualTo(Double value) {
            addCriterion("FI_1502 <>", value, "FI_1502");
            return (Criteria) this;
        }

        public Criteria andFI_1502GreaterThan(Double value) {
            addCriterion("FI_1502 >", value, "FI_1502");
            return (Criteria) this;
        }

        public Criteria andFI_1502GreaterThanOrEqualTo(Double value) {
            addCriterion("FI_1502 >=", value, "FI_1502");
            return (Criteria) this;
        }

        public Criteria andFI_1502LessThan(Double value) {
            addCriterion("FI_1502 <", value, "FI_1502");
            return (Criteria) this;
        }

        public Criteria andFI_1502LessThanOrEqualTo(Double value) {
            addCriterion("FI_1502 <=", value, "FI_1502");
            return (Criteria) this;
        }

        public Criteria andFI_1502In(List<Double> values) {
            addCriterion("FI_1502 in", values, "FI_1502");
            return (Criteria) this;
        }

        public Criteria andFI_1502NotIn(List<Double> values) {
            addCriterion("FI_1502 not in", values, "FI_1502");
            return (Criteria) this;
        }

        public Criteria andFI_1502Between(Double value1, Double value2) {
            addCriterion("FI_1502 between", value1, value2, "FI_1502");
            return (Criteria) this;
        }

        public Criteria andFI_1502NotBetween(Double value1, Double value2) {
            addCriterion("FI_1502 not between", value1, value2, "FI_1502");
            return (Criteria) this;
        }

        public Criteria andPI_657IsNull() {
            addCriterion("PI_657 is null");
            return (Criteria) this;
        }

        public Criteria andPI_657IsNotNull() {
            addCriterion("PI_657 is not null");
            return (Criteria) this;
        }

        public Criteria andPI_657EqualTo(Double value) {
            addCriterion("PI_657 =", value, "PI_657");
            return (Criteria) this;
        }

        public Criteria andPI_657NotEqualTo(Double value) {
            addCriterion("PI_657 <>", value, "PI_657");
            return (Criteria) this;
        }

        public Criteria andPI_657GreaterThan(Double value) {
            addCriterion("PI_657 >", value, "PI_657");
            return (Criteria) this;
        }

        public Criteria andPI_657GreaterThanOrEqualTo(Double value) {
            addCriterion("PI_657 >=", value, "PI_657");
            return (Criteria) this;
        }

        public Criteria andPI_657LessThan(Double value) {
            addCriterion("PI_657 <", value, "PI_657");
            return (Criteria) this;
        }

        public Criteria andPI_657LessThanOrEqualTo(Double value) {
            addCriterion("PI_657 <=", value, "PI_657");
            return (Criteria) this;
        }

        public Criteria andPI_657In(List<Double> values) {
            addCriterion("PI_657 in", values, "PI_657");
            return (Criteria) this;
        }

        public Criteria andPI_657NotIn(List<Double> values) {
            addCriterion("PI_657 not in", values, "PI_657");
            return (Criteria) this;
        }

        public Criteria andPI_657Between(Double value1, Double value2) {
            addCriterion("PI_657 between", value1, value2, "PI_657");
            return (Criteria) this;
        }

        public Criteria andPI_657NotBetween(Double value1, Double value2) {
            addCriterion("PI_657 not between", value1, value2, "PI_657");
            return (Criteria) this;
        }

        public Criteria andPI_4IsNull() {
            addCriterion("PI_4 is null");
            return (Criteria) this;
        }

        public Criteria andPI_4IsNotNull() {
            addCriterion("PI_4 is not null");
            return (Criteria) this;
        }

        public Criteria andPI_4EqualTo(Double value) {
            addCriterion("PI_4 =", value, "PI_4");
            return (Criteria) this;
        }

        public Criteria andPI_4NotEqualTo(Double value) {
            addCriterion("PI_4 <>", value, "PI_4");
            return (Criteria) this;
        }

        public Criteria andPI_4GreaterThan(Double value) {
            addCriterion("PI_4 >", value, "PI_4");
            return (Criteria) this;
        }

        public Criteria andPI_4GreaterThanOrEqualTo(Double value) {
            addCriterion("PI_4 >=", value, "PI_4");
            return (Criteria) this;
        }

        public Criteria andPI_4LessThan(Double value) {
            addCriterion("PI_4 <", value, "PI_4");
            return (Criteria) this;
        }

        public Criteria andPI_4LessThanOrEqualTo(Double value) {
            addCriterion("PI_4 <=", value, "PI_4");
            return (Criteria) this;
        }

        public Criteria andPI_4In(List<Double> values) {
            addCriterion("PI_4 in", values, "PI_4");
            return (Criteria) this;
        }

        public Criteria andPI_4NotIn(List<Double> values) {
            addCriterion("PI_4 not in", values, "PI_4");
            return (Criteria) this;
        }

        public Criteria andPI_4Between(Double value1, Double value2) {
            addCriterion("PI_4 between", value1, value2, "PI_4");
            return (Criteria) this;
        }

        public Criteria andPI_4NotBetween(Double value1, Double value2) {
            addCriterion("PI_4 not between", value1, value2, "PI_4");
            return (Criteria) this;
        }

        public Criteria andPI_5IsNull() {
            addCriterion("PI_5 is null");
            return (Criteria) this;
        }

        public Criteria andPI_5IsNotNull() {
            addCriterion("PI_5 is not null");
            return (Criteria) this;
        }

        public Criteria andPI_5EqualTo(Double value) {
            addCriterion("PI_5 =", value, "PI_5");
            return (Criteria) this;
        }

        public Criteria andPI_5NotEqualTo(Double value) {
            addCriterion("PI_5 <>", value, "PI_5");
            return (Criteria) this;
        }

        public Criteria andPI_5GreaterThan(Double value) {
            addCriterion("PI_5 >", value, "PI_5");
            return (Criteria) this;
        }

        public Criteria andPI_5GreaterThanOrEqualTo(Double value) {
            addCriterion("PI_5 >=", value, "PI_5");
            return (Criteria) this;
        }

        public Criteria andPI_5LessThan(Double value) {
            addCriterion("PI_5 <", value, "PI_5");
            return (Criteria) this;
        }

        public Criteria andPI_5LessThanOrEqualTo(Double value) {
            addCriterion("PI_5 <=", value, "PI_5");
            return (Criteria) this;
        }

        public Criteria andPI_5In(List<Double> values) {
            addCriterion("PI_5 in", values, "PI_5");
            return (Criteria) this;
        }

        public Criteria andPI_5NotIn(List<Double> values) {
            addCriterion("PI_5 not in", values, "PI_5");
            return (Criteria) this;
        }

        public Criteria andPI_5Between(Double value1, Double value2) {
            addCriterion("PI_5 between", value1, value2, "PI_5");
            return (Criteria) this;
        }

        public Criteria andPI_5NotBetween(Double value1, Double value2) {
            addCriterion("PI_5 not between", value1, value2, "PI_5");
            return (Criteria) this;
        }

        public Criteria andPI_6IsNull() {
            addCriterion("PI_6 is null");
            return (Criteria) this;
        }

        public Criteria andPI_6IsNotNull() {
            addCriterion("PI_6 is not null");
            return (Criteria) this;
        }

        public Criteria andPI_6EqualTo(Double value) {
            addCriterion("PI_6 =", value, "PI_6");
            return (Criteria) this;
        }

        public Criteria andPI_6NotEqualTo(Double value) {
            addCriterion("PI_6 <>", value, "PI_6");
            return (Criteria) this;
        }

        public Criteria andPI_6GreaterThan(Double value) {
            addCriterion("PI_6 >", value, "PI_6");
            return (Criteria) this;
        }

        public Criteria andPI_6GreaterThanOrEqualTo(Double value) {
            addCriterion("PI_6 >=", value, "PI_6");
            return (Criteria) this;
        }

        public Criteria andPI_6LessThan(Double value) {
            addCriterion("PI_6 <", value, "PI_6");
            return (Criteria) this;
        }

        public Criteria andPI_6LessThanOrEqualTo(Double value) {
            addCriterion("PI_6 <=", value, "PI_6");
            return (Criteria) this;
        }

        public Criteria andPI_6In(List<Double> values) {
            addCriterion("PI_6 in", values, "PI_6");
            return (Criteria) this;
        }

        public Criteria andPI_6NotIn(List<Double> values) {
            addCriterion("PI_6 not in", values, "PI_6");
            return (Criteria) this;
        }

        public Criteria andPI_6Between(Double value1, Double value2) {
            addCriterion("PI_6 between", value1, value2, "PI_6");
            return (Criteria) this;
        }

        public Criteria andPI_6NotBetween(Double value1, Double value2) {
            addCriterion("PI_6 not between", value1, value2, "PI_6");
            return (Criteria) this;
        }

        public Criteria andPI_80IsNull() {
            addCriterion("PI_80 is null");
            return (Criteria) this;
        }

        public Criteria andPI_80IsNotNull() {
            addCriterion("PI_80 is not null");
            return (Criteria) this;
        }

        public Criteria andPI_80EqualTo(Double value) {
            addCriterion("PI_80 =", value, "PI_80");
            return (Criteria) this;
        }

        public Criteria andPI_80NotEqualTo(Double value) {
            addCriterion("PI_80 <>", value, "PI_80");
            return (Criteria) this;
        }

        public Criteria andPI_80GreaterThan(Double value) {
            addCriterion("PI_80 >", value, "PI_80");
            return (Criteria) this;
        }

        public Criteria andPI_80GreaterThanOrEqualTo(Double value) {
            addCriterion("PI_80 >=", value, "PI_80");
            return (Criteria) this;
        }

        public Criteria andPI_80LessThan(Double value) {
            addCriterion("PI_80 <", value, "PI_80");
            return (Criteria) this;
        }

        public Criteria andPI_80LessThanOrEqualTo(Double value) {
            addCriterion("PI_80 <=", value, "PI_80");
            return (Criteria) this;
        }

        public Criteria andPI_80In(List<Double> values) {
            addCriterion("PI_80 in", values, "PI_80");
            return (Criteria) this;
        }

        public Criteria andPI_80NotIn(List<Double> values) {
            addCriterion("PI_80 not in", values, "PI_80");
            return (Criteria) this;
        }

        public Criteria andPI_80Between(Double value1, Double value2) {
            addCriterion("PI_80 between", value1, value2, "PI_80");
            return (Criteria) this;
        }

        public Criteria andPI_80NotBetween(Double value1, Double value2) {
            addCriterion("PI_80 not between", value1, value2, "PI_80");
            return (Criteria) this;
        }

        public Criteria andPI_82IsNull() {
            addCriterion("PI_82 is null");
            return (Criteria) this;
        }

        public Criteria andPI_82IsNotNull() {
            addCriterion("PI_82 is not null");
            return (Criteria) this;
        }

        public Criteria andPI_82EqualTo(Double value) {
            addCriterion("PI_82 =", value, "PI_82");
            return (Criteria) this;
        }

        public Criteria andPI_82NotEqualTo(Double value) {
            addCriterion("PI_82 <>", value, "PI_82");
            return (Criteria) this;
        }

        public Criteria andPI_82GreaterThan(Double value) {
            addCriterion("PI_82 >", value, "PI_82");
            return (Criteria) this;
        }

        public Criteria andPI_82GreaterThanOrEqualTo(Double value) {
            addCriterion("PI_82 >=", value, "PI_82");
            return (Criteria) this;
        }

        public Criteria andPI_82LessThan(Double value) {
            addCriterion("PI_82 <", value, "PI_82");
            return (Criteria) this;
        }

        public Criteria andPI_82LessThanOrEqualTo(Double value) {
            addCriterion("PI_82 <=", value, "PI_82");
            return (Criteria) this;
        }

        public Criteria andPI_82In(List<Double> values) {
            addCriterion("PI_82 in", values, "PI_82");
            return (Criteria) this;
        }

        public Criteria andPI_82NotIn(List<Double> values) {
            addCriterion("PI_82 not in", values, "PI_82");
            return (Criteria) this;
        }

        public Criteria andPI_82Between(Double value1, Double value2) {
            addCriterion("PI_82 between", value1, value2, "PI_82");
            return (Criteria) this;
        }

        public Criteria andPI_82NotBetween(Double value1, Double value2) {
            addCriterion("PI_82 not between", value1, value2, "PI_82");
            return (Criteria) this;
        }

        public Criteria andPI_9IsNull() {
            addCriterion("PI_9 is null");
            return (Criteria) this;
        }

        public Criteria andPI_9IsNotNull() {
            addCriterion("PI_9 is not null");
            return (Criteria) this;
        }

        public Criteria andPI_9EqualTo(Double value) {
            addCriterion("PI_9 =", value, "PI_9");
            return (Criteria) this;
        }

        public Criteria andPI_9NotEqualTo(Double value) {
            addCriterion("PI_9 <>", value, "PI_9");
            return (Criteria) this;
        }

        public Criteria andPI_9GreaterThan(Double value) {
            addCriterion("PI_9 >", value, "PI_9");
            return (Criteria) this;
        }

        public Criteria andPI_9GreaterThanOrEqualTo(Double value) {
            addCriterion("PI_9 >=", value, "PI_9");
            return (Criteria) this;
        }

        public Criteria andPI_9LessThan(Double value) {
            addCriterion("PI_9 <", value, "PI_9");
            return (Criteria) this;
        }

        public Criteria andPI_9LessThanOrEqualTo(Double value) {
            addCriterion("PI_9 <=", value, "PI_9");
            return (Criteria) this;
        }

        public Criteria andPI_9In(List<Double> values) {
            addCriterion("PI_9 in", values, "PI_9");
            return (Criteria) this;
        }

        public Criteria andPI_9NotIn(List<Double> values) {
            addCriterion("PI_9 not in", values, "PI_9");
            return (Criteria) this;
        }

        public Criteria andPI_9Between(Double value1, Double value2) {
            addCriterion("PI_9 between", value1, value2, "PI_9");
            return (Criteria) this;
        }

        public Criteria andPI_9NotBetween(Double value1, Double value2) {
            addCriterion("PI_9 not between", value1, value2, "PI_9");
            return (Criteria) this;
        }

        public Criteria andPI_19IsNull() {
            addCriterion("PI_19 is null");
            return (Criteria) this;
        }

        public Criteria andPI_19IsNotNull() {
            addCriterion("PI_19 is not null");
            return (Criteria) this;
        }

        public Criteria andPI_19EqualTo(Double value) {
            addCriterion("PI_19 =", value, "PI_19");
            return (Criteria) this;
        }

        public Criteria andPI_19NotEqualTo(Double value) {
            addCriterion("PI_19 <>", value, "PI_19");
            return (Criteria) this;
        }

        public Criteria andPI_19GreaterThan(Double value) {
            addCriterion("PI_19 >", value, "PI_19");
            return (Criteria) this;
        }

        public Criteria andPI_19GreaterThanOrEqualTo(Double value) {
            addCriterion("PI_19 >=", value, "PI_19");
            return (Criteria) this;
        }

        public Criteria andPI_19LessThan(Double value) {
            addCriterion("PI_19 <", value, "PI_19");
            return (Criteria) this;
        }

        public Criteria andPI_19LessThanOrEqualTo(Double value) {
            addCriterion("PI_19 <=", value, "PI_19");
            return (Criteria) this;
        }

        public Criteria andPI_19In(List<Double> values) {
            addCriterion("PI_19 in", values, "PI_19");
            return (Criteria) this;
        }

        public Criteria andPI_19NotIn(List<Double> values) {
            addCriterion("PI_19 not in", values, "PI_19");
            return (Criteria) this;
        }

        public Criteria andPI_19Between(Double value1, Double value2) {
            addCriterion("PI_19 between", value1, value2, "PI_19");
            return (Criteria) this;
        }

        public Criteria andPI_19NotBetween(Double value1, Double value2) {
            addCriterion("PI_19 not between", value1, value2, "PI_19");
            return (Criteria) this;
        }

        public Criteria andPI_25IsNull() {
            addCriterion("PI_25 is null");
            return (Criteria) this;
        }

        public Criteria andPI_25IsNotNull() {
            addCriterion("PI_25 is not null");
            return (Criteria) this;
        }

        public Criteria andPI_25EqualTo(Double value) {
            addCriterion("PI_25 =", value, "PI_25");
            return (Criteria) this;
        }

        public Criteria andPI_25NotEqualTo(Double value) {
            addCriterion("PI_25 <>", value, "PI_25");
            return (Criteria) this;
        }

        public Criteria andPI_25GreaterThan(Double value) {
            addCriterion("PI_25 >", value, "PI_25");
            return (Criteria) this;
        }

        public Criteria andPI_25GreaterThanOrEqualTo(Double value) {
            addCriterion("PI_25 >=", value, "PI_25");
            return (Criteria) this;
        }

        public Criteria andPI_25LessThan(Double value) {
            addCriterion("PI_25 <", value, "PI_25");
            return (Criteria) this;
        }

        public Criteria andPI_25LessThanOrEqualTo(Double value) {
            addCriterion("PI_25 <=", value, "PI_25");
            return (Criteria) this;
        }

        public Criteria andPI_25In(List<Double> values) {
            addCriterion("PI_25 in", values, "PI_25");
            return (Criteria) this;
        }

        public Criteria andPI_25NotIn(List<Double> values) {
            addCriterion("PI_25 not in", values, "PI_25");
            return (Criteria) this;
        }

        public Criteria andPI_25Between(Double value1, Double value2) {
            addCriterion("PI_25 between", value1, value2, "PI_25");
            return (Criteria) this;
        }

        public Criteria andPI_25NotBetween(Double value1, Double value2) {
            addCriterion("PI_25 not between", value1, value2, "PI_25");
            return (Criteria) this;
        }

        public Criteria andAIA_5IsNull() {
            addCriterion("AIA_5 is null");
            return (Criteria) this;
        }

        public Criteria andAIA_5IsNotNull() {
            addCriterion("AIA_5 is not null");
            return (Criteria) this;
        }

        public Criteria andAIA_5EqualTo(Double value) {
            addCriterion("AIA_5 =", value, "AIA_5");
            return (Criteria) this;
        }

        public Criteria andAIA_5NotEqualTo(Double value) {
            addCriterion("AIA_5 <>", value, "AIA_5");
            return (Criteria) this;
        }

        public Criteria andAIA_5GreaterThan(Double value) {
            addCriterion("AIA_5 >", value, "AIA_5");
            return (Criteria) this;
        }

        public Criteria andAIA_5GreaterThanOrEqualTo(Double value) {
            addCriterion("AIA_5 >=", value, "AIA_5");
            return (Criteria) this;
        }

        public Criteria andAIA_5LessThan(Double value) {
            addCriterion("AIA_5 <", value, "AIA_5");
            return (Criteria) this;
        }

        public Criteria andAIA_5LessThanOrEqualTo(Double value) {
            addCriterion("AIA_5 <=", value, "AIA_5");
            return (Criteria) this;
        }

        public Criteria andAIA_5In(List<Double> values) {
            addCriterion("AIA_5 in", values, "AIA_5");
            return (Criteria) this;
        }

        public Criteria andAIA_5NotIn(List<Double> values) {
            addCriterion("AIA_5 not in", values, "AIA_5");
            return (Criteria) this;
        }

        public Criteria andAIA_5Between(Double value1, Double value2) {
            addCriterion("AIA_5 between", value1, value2, "AIA_5");
            return (Criteria) this;
        }

        public Criteria andAIA_5NotBetween(Double value1, Double value2) {
            addCriterion("AIA_5 not between", value1, value2, "AIA_5");
            return (Criteria) this;
        }

        public Criteria andAIA_5AIsNull() {
            addCriterion("AIA_5A is null");
            return (Criteria) this;
        }

        public Criteria andAIA_5AIsNotNull() {
            addCriterion("AIA_5A is not null");
            return (Criteria) this;
        }

        public Criteria andAIA_5AEqualTo(Double value) {
            addCriterion("AIA_5A =", value, "AIA_5A");
            return (Criteria) this;
        }

        public Criteria andAIA_5ANotEqualTo(Double value) {
            addCriterion("AIA_5A <>", value, "AIA_5A");
            return (Criteria) this;
        }

        public Criteria andAIA_5AGreaterThan(Double value) {
            addCriterion("AIA_5A >", value, "AIA_5A");
            return (Criteria) this;
        }

        public Criteria andAIA_5AGreaterThanOrEqualTo(Double value) {
            addCriterion("AIA_5A >=", value, "AIA_5A");
            return (Criteria) this;
        }

        public Criteria andAIA_5ALessThan(Double value) {
            addCriterion("AIA_5A <", value, "AIA_5A");
            return (Criteria) this;
        }

        public Criteria andAIA_5ALessThanOrEqualTo(Double value) {
            addCriterion("AIA_5A <=", value, "AIA_5A");
            return (Criteria) this;
        }

        public Criteria andAIA_5AIn(List<Double> values) {
            addCriterion("AIA_5A in", values, "AIA_5A");
            return (Criteria) this;
        }

        public Criteria andAIA_5ANotIn(List<Double> values) {
            addCriterion("AIA_5A not in", values, "AIA_5A");
            return (Criteria) this;
        }

        public Criteria andAIA_5ABetween(Double value1, Double value2) {
            addCriterion("AIA_5A between", value1, value2, "AIA_5A");
            return (Criteria) this;
        }

        public Criteria andAIA_5ANotBetween(Double value1, Double value2) {
            addCriterion("AIA_5A not between", value1, value2, "AIA_5A");
            return (Criteria) this;
        }

        public Criteria andAI_1IsNull() {
            addCriterion("AI_1 is null");
            return (Criteria) this;
        }

        public Criteria andAI_1IsNotNull() {
            addCriterion("AI_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAI_1EqualTo(Double value) {
            addCriterion("AI_1 =", value, "AI_1");
            return (Criteria) this;
        }

        public Criteria andAI_1NotEqualTo(Double value) {
            addCriterion("AI_1 <>", value, "AI_1");
            return (Criteria) this;
        }

        public Criteria andAI_1GreaterThan(Double value) {
            addCriterion("AI_1 >", value, "AI_1");
            return (Criteria) this;
        }

        public Criteria andAI_1GreaterThanOrEqualTo(Double value) {
            addCriterion("AI_1 >=", value, "AI_1");
            return (Criteria) this;
        }

        public Criteria andAI_1LessThan(Double value) {
            addCriterion("AI_1 <", value, "AI_1");
            return (Criteria) this;
        }

        public Criteria andAI_1LessThanOrEqualTo(Double value) {
            addCriterion("AI_1 <=", value, "AI_1");
            return (Criteria) this;
        }

        public Criteria andAI_1In(List<Double> values) {
            addCriterion("AI_1 in", values, "AI_1");
            return (Criteria) this;
        }

        public Criteria andAI_1NotIn(List<Double> values) {
            addCriterion("AI_1 not in", values, "AI_1");
            return (Criteria) this;
        }

        public Criteria andAI_1Between(Double value1, Double value2) {
            addCriterion("AI_1 between", value1, value2, "AI_1");
            return (Criteria) this;
        }

        public Criteria andAI_1NotBetween(Double value1, Double value2) {
            addCriterion("AI_1 not between", value1, value2, "AI_1");
            return (Criteria) this;
        }

        public Criteria andAI_1BIsNull() {
            addCriterion("AI_1B is null");
            return (Criteria) this;
        }

        public Criteria andAI_1BIsNotNull() {
            addCriterion("AI_1B is not null");
            return (Criteria) this;
        }

        public Criteria andAI_1BEqualTo(Double value) {
            addCriterion("AI_1B =", value, "AI_1B");
            return (Criteria) this;
        }

        public Criteria andAI_1BNotEqualTo(Double value) {
            addCriterion("AI_1B <>", value, "AI_1B");
            return (Criteria) this;
        }

        public Criteria andAI_1BGreaterThan(Double value) {
            addCriterion("AI_1B >", value, "AI_1B");
            return (Criteria) this;
        }

        public Criteria andAI_1BGreaterThanOrEqualTo(Double value) {
            addCriterion("AI_1B >=", value, "AI_1B");
            return (Criteria) this;
        }

        public Criteria andAI_1BLessThan(Double value) {
            addCriterion("AI_1B <", value, "AI_1B");
            return (Criteria) this;
        }

        public Criteria andAI_1BLessThanOrEqualTo(Double value) {
            addCriterion("AI_1B <=", value, "AI_1B");
            return (Criteria) this;
        }

        public Criteria andAI_1BIn(List<Double> values) {
            addCriterion("AI_1B in", values, "AI_1B");
            return (Criteria) this;
        }

        public Criteria andAI_1BNotIn(List<Double> values) {
            addCriterion("AI_1B not in", values, "AI_1B");
            return (Criteria) this;
        }

        public Criteria andAI_1BBetween(Double value1, Double value2) {
            addCriterion("AI_1B between", value1, value2, "AI_1B");
            return (Criteria) this;
        }

        public Criteria andAI_1BNotBetween(Double value1, Double value2) {
            addCriterion("AI_1B not between", value1, value2, "AI_1B");
            return (Criteria) this;
        }

        public Criteria andAI_1401IsNull() {
            addCriterion("AI_1401 is null");
            return (Criteria) this;
        }

        public Criteria andAI_1401IsNotNull() {
            addCriterion("AI_1401 is not null");
            return (Criteria) this;
        }

        public Criteria andAI_1401EqualTo(Double value) {
            addCriterion("AI_1401 =", value, "AI_1401");
            return (Criteria) this;
        }

        public Criteria andAI_1401NotEqualTo(Double value) {
            addCriterion("AI_1401 <>", value, "AI_1401");
            return (Criteria) this;
        }

        public Criteria andAI_1401GreaterThan(Double value) {
            addCriterion("AI_1401 >", value, "AI_1401");
            return (Criteria) this;
        }

        public Criteria andAI_1401GreaterThanOrEqualTo(Double value) {
            addCriterion("AI_1401 >=", value, "AI_1401");
            return (Criteria) this;
        }

        public Criteria andAI_1401LessThan(Double value) {
            addCriterion("AI_1401 <", value, "AI_1401");
            return (Criteria) this;
        }

        public Criteria andAI_1401LessThanOrEqualTo(Double value) {
            addCriterion("AI_1401 <=", value, "AI_1401");
            return (Criteria) this;
        }

        public Criteria andAI_1401In(List<Double> values) {
            addCriterion("AI_1401 in", values, "AI_1401");
            return (Criteria) this;
        }

        public Criteria andAI_1401NotIn(List<Double> values) {
            addCriterion("AI_1401 not in", values, "AI_1401");
            return (Criteria) this;
        }

        public Criteria andAI_1401Between(Double value1, Double value2) {
            addCriterion("AI_1401 between", value1, value2, "AI_1401");
            return (Criteria) this;
        }

        public Criteria andAI_1401NotBetween(Double value1, Double value2) {
            addCriterion("AI_1401 not between", value1, value2, "AI_1401");
            return (Criteria) this;
        }

        public Criteria andAI_1401HNIsNull() {
            addCriterion("AI_1401HN is null");
            return (Criteria) this;
        }

        public Criteria andAI_1401HNIsNotNull() {
            addCriterion("AI_1401HN is not null");
            return (Criteria) this;
        }

        public Criteria andAI_1401HNEqualTo(Double value) {
            addCriterion("AI_1401HN =", value, "AI_1401HN");
            return (Criteria) this;
        }

        public Criteria andAI_1401HNNotEqualTo(Double value) {
            addCriterion("AI_1401HN <>", value, "AI_1401HN");
            return (Criteria) this;
        }

        public Criteria andAI_1401HNGreaterThan(Double value) {
            addCriterion("AI_1401HN >", value, "AI_1401HN");
            return (Criteria) this;
        }

        public Criteria andAI_1401HNGreaterThanOrEqualTo(Double value) {
            addCriterion("AI_1401HN >=", value, "AI_1401HN");
            return (Criteria) this;
        }

        public Criteria andAI_1401HNLessThan(Double value) {
            addCriterion("AI_1401HN <", value, "AI_1401HN");
            return (Criteria) this;
        }

        public Criteria andAI_1401HNLessThanOrEqualTo(Double value) {
            addCriterion("AI_1401HN <=", value, "AI_1401HN");
            return (Criteria) this;
        }

        public Criteria andAI_1401HNIn(List<Double> values) {
            addCriterion("AI_1401HN in", values, "AI_1401HN");
            return (Criteria) this;
        }

        public Criteria andAI_1401HNNotIn(List<Double> values) {
            addCriterion("AI_1401HN not in", values, "AI_1401HN");
            return (Criteria) this;
        }

        public Criteria andAI_1401HNBetween(Double value1, Double value2) {
            addCriterion("AI_1401HN between", value1, value2, "AI_1401HN");
            return (Criteria) this;
        }

        public Criteria andAI_1401HNNotBetween(Double value1, Double value2) {
            addCriterion("AI_1401HN not between", value1, value2, "AI_1401HN");
            return (Criteria) this;
        }

        public Criteria and累积氨产量IsNull() {
            addCriterion("累积氨产量 is null");
            return (Criteria) this;
        }

        public Criteria and累积氨产量IsNotNull() {
            addCriterion("累积氨产量 is not null");
            return (Criteria) this;
        }

        public Criteria and累积氨产量EqualTo(Double value) {
            addCriterion("累积氨产量 =", value, "累积氨产量");
            return (Criteria) this;
        }

        public Criteria and累积氨产量NotEqualTo(Double value) {
            addCriterion("累积氨产量 <>", value, "累积氨产量");
            return (Criteria) this;
        }

        public Criteria and累积氨产量GreaterThan(Double value) {
            addCriterion("累积氨产量 >", value, "累积氨产量");
            return (Criteria) this;
        }

        public Criteria and累积氨产量GreaterThanOrEqualTo(Double value) {
            addCriterion("累积氨产量 >=", value, "累积氨产量");
            return (Criteria) this;
        }

        public Criteria and累积氨产量LessThan(Double value) {
            addCriterion("累积氨产量 <", value, "累积氨产量");
            return (Criteria) this;
        }

        public Criteria and累积氨产量LessThanOrEqualTo(Double value) {
            addCriterion("累积氨产量 <=", value, "累积氨产量");
            return (Criteria) this;
        }

        public Criteria and累积氨产量In(List<Double> values) {
            addCriterion("累积氨产量 in", values, "累积氨产量");
            return (Criteria) this;
        }

        public Criteria and累积氨产量NotIn(List<Double> values) {
            addCriterion("累积氨产量 not in", values, "累积氨产量");
            return (Criteria) this;
        }

        public Criteria and累积氨产量Between(Double value1, Double value2) {
            addCriterion("累积氨产量 between", value1, value2, "累积氨产量");
            return (Criteria) this;
        }

        public Criteria and累积氨产量NotBetween(Double value1, Double value2) {
            addCriterion("累积氨产量 not between", value1, value2, "累积氨产量");
            return (Criteria) this;
        }

        public Criteria and累积总气耗IsNull() {
            addCriterion("累积总气耗 is null");
            return (Criteria) this;
        }

        public Criteria and累积总气耗IsNotNull() {
            addCriterion("累积总气耗 is not null");
            return (Criteria) this;
        }

        public Criteria and累积总气耗EqualTo(Double value) {
            addCriterion("累积总气耗 =", value, "累积总气耗");
            return (Criteria) this;
        }

        public Criteria and累积总气耗NotEqualTo(Double value) {
            addCriterion("累积总气耗 <>", value, "累积总气耗");
            return (Criteria) this;
        }

        public Criteria and累积总气耗GreaterThan(Double value) {
            addCriterion("累积总气耗 >", value, "累积总气耗");
            return (Criteria) this;
        }

        public Criteria and累积总气耗GreaterThanOrEqualTo(Double value) {
            addCriterion("累积总气耗 >=", value, "累积总气耗");
            return (Criteria) this;
        }

        public Criteria and累积总气耗LessThan(Double value) {
            addCriterion("累积总气耗 <", value, "累积总气耗");
            return (Criteria) this;
        }

        public Criteria and累积总气耗LessThanOrEqualTo(Double value) {
            addCriterion("累积总气耗 <=", value, "累积总气耗");
            return (Criteria) this;
        }

        public Criteria and累积总气耗In(List<Double> values) {
            addCriterion("累积总气耗 in", values, "累积总气耗");
            return (Criteria) this;
        }

        public Criteria and累积总气耗NotIn(List<Double> values) {
            addCriterion("累积总气耗 not in", values, "累积总气耗");
            return (Criteria) this;
        }

        public Criteria and累积总气耗Between(Double value1, Double value2) {
            addCriterion("累积总气耗 between", value1, value2, "累积总气耗");
            return (Criteria) this;
        }

        public Criteria and累积总气耗NotBetween(Double value1, Double value2) {
            addCriterion("累积总气耗 not between", value1, value2, "累积总气耗");
            return (Criteria) this;
        }

        public Criteria and累积原料气耗IsNull() {
            addCriterion("累积原料气耗 is null");
            return (Criteria) this;
        }

        public Criteria and累积原料气耗IsNotNull() {
            addCriterion("累积原料气耗 is not null");
            return (Criteria) this;
        }

        public Criteria and累积原料气耗EqualTo(Double value) {
            addCriterion("累积原料气耗 =", value, "累积原料气耗");
            return (Criteria) this;
        }

        public Criteria and累积原料气耗NotEqualTo(Double value) {
            addCriterion("累积原料气耗 <>", value, "累积原料气耗");
            return (Criteria) this;
        }

        public Criteria and累积原料气耗GreaterThan(Double value) {
            addCriterion("累积原料气耗 >", value, "累积原料气耗");
            return (Criteria) this;
        }

        public Criteria and累积原料气耗GreaterThanOrEqualTo(Double value) {
            addCriterion("累积原料气耗 >=", value, "累积原料气耗");
            return (Criteria) this;
        }

        public Criteria and累积原料气耗LessThan(Double value) {
            addCriterion("累积原料气耗 <", value, "累积原料气耗");
            return (Criteria) this;
        }

        public Criteria and累积原料气耗LessThanOrEqualTo(Double value) {
            addCriterion("累积原料气耗 <=", value, "累积原料气耗");
            return (Criteria) this;
        }

        public Criteria and累积原料气耗In(List<Double> values) {
            addCriterion("累积原料气耗 in", values, "累积原料气耗");
            return (Criteria) this;
        }

        public Criteria and累积原料气耗NotIn(List<Double> values) {
            addCriterion("累积原料气耗 not in", values, "累积原料气耗");
            return (Criteria) this;
        }

        public Criteria and累积原料气耗Between(Double value1, Double value2) {
            addCriterion("累积原料气耗 between", value1, value2, "累积原料气耗");
            return (Criteria) this;
        }

        public Criteria and累积原料气耗NotBetween(Double value1, Double value2) {
            addCriterion("累积原料气耗 not between", value1, value2, "累积原料气耗");
            return (Criteria) this;
        }

        public Criteria and累积燃料气耗IsNull() {
            addCriterion("累积燃料气耗 is null");
            return (Criteria) this;
        }

        public Criteria and累积燃料气耗IsNotNull() {
            addCriterion("累积燃料气耗 is not null");
            return (Criteria) this;
        }

        public Criteria and累积燃料气耗EqualTo(Double value) {
            addCriterion("累积燃料气耗 =", value, "累积燃料气耗");
            return (Criteria) this;
        }

        public Criteria and累积燃料气耗NotEqualTo(Double value) {
            addCriterion("累积燃料气耗 <>", value, "累积燃料气耗");
            return (Criteria) this;
        }

        public Criteria and累积燃料气耗GreaterThan(Double value) {
            addCriterion("累积燃料气耗 >", value, "累积燃料气耗");
            return (Criteria) this;
        }

        public Criteria and累积燃料气耗GreaterThanOrEqualTo(Double value) {
            addCriterion("累积燃料气耗 >=", value, "累积燃料气耗");
            return (Criteria) this;
        }

        public Criteria and累积燃料气耗LessThan(Double value) {
            addCriterion("累积燃料气耗 <", value, "累积燃料气耗");
            return (Criteria) this;
        }

        public Criteria and累积燃料气耗LessThanOrEqualTo(Double value) {
            addCriterion("累积燃料气耗 <=", value, "累积燃料气耗");
            return (Criteria) this;
        }

        public Criteria and累积燃料气耗In(List<Double> values) {
            addCriterion("累积燃料气耗 in", values, "累积燃料气耗");
            return (Criteria) this;
        }

        public Criteria and累积燃料气耗NotIn(List<Double> values) {
            addCriterion("累积燃料气耗 not in", values, "累积燃料气耗");
            return (Criteria) this;
        }

        public Criteria and累积燃料气耗Between(Double value1, Double value2) {
            addCriterion("累积燃料气耗 between", value1, value2, "累积燃料气耗");
            return (Criteria) this;
        }

        public Criteria and累积燃料气耗NotBetween(Double value1, Double value2) {
            addCriterion("累积燃料气耗 not between", value1, value2, "累积燃料气耗");
            return (Criteria) this;
        }

        public Criteria and累积快锅燃气IsNull() {
            addCriterion("累积快锅燃气 is null");
            return (Criteria) this;
        }

        public Criteria and累积快锅燃气IsNotNull() {
            addCriterion("累积快锅燃气 is not null");
            return (Criteria) this;
        }

        public Criteria and累积快锅燃气EqualTo(Double value) {
            addCriterion("累积快锅燃气 =", value, "累积快锅燃气");
            return (Criteria) this;
        }

        public Criteria and累积快锅燃气NotEqualTo(Double value) {
            addCriterion("累积快锅燃气 <>", value, "累积快锅燃气");
            return (Criteria) this;
        }

        public Criteria and累积快锅燃气GreaterThan(Double value) {
            addCriterion("累积快锅燃气 >", value, "累积快锅燃气");
            return (Criteria) this;
        }

        public Criteria and累积快锅燃气GreaterThanOrEqualTo(Double value) {
            addCriterion("累积快锅燃气 >=", value, "累积快锅燃气");
            return (Criteria) this;
        }

        public Criteria and累积快锅燃气LessThan(Double value) {
            addCriterion("累积快锅燃气 <", value, "累积快锅燃气");
            return (Criteria) this;
        }

        public Criteria and累积快锅燃气LessThanOrEqualTo(Double value) {
            addCriterion("累积快锅燃气 <=", value, "累积快锅燃气");
            return (Criteria) this;
        }

        public Criteria and累积快锅燃气In(List<Double> values) {
            addCriterion("累积快锅燃气 in", values, "累积快锅燃气");
            return (Criteria) this;
        }

        public Criteria and累积快锅燃气NotIn(List<Double> values) {
            addCriterion("累积快锅燃气 not in", values, "累积快锅燃气");
            return (Criteria) this;
        }

        public Criteria and累积快锅燃气Between(Double value1, Double value2) {
            addCriterion("累积快锅燃气 between", value1, value2, "累积快锅燃气");
            return (Criteria) this;
        }

        public Criteria and累积快锅燃气NotBetween(Double value1, Double value2) {
            addCriterion("累积快锅燃气 not between", value1, value2, "累积快锅燃气");
            return (Criteria) this;
        }

        public Criteria and累积快锅产汽IsNull() {
            addCriterion("累积快锅产汽 is null");
            return (Criteria) this;
        }

        public Criteria and累积快锅产汽IsNotNull() {
            addCriterion("累积快锅产汽 is not null");
            return (Criteria) this;
        }

        public Criteria and累积快锅产汽EqualTo(Double value) {
            addCriterion("累积快锅产汽 =", value, "累积快锅产汽");
            return (Criteria) this;
        }

        public Criteria and累积快锅产汽NotEqualTo(Double value) {
            addCriterion("累积快锅产汽 <>", value, "累积快锅产汽");
            return (Criteria) this;
        }

        public Criteria and累积快锅产汽GreaterThan(Double value) {
            addCriterion("累积快锅产汽 >", value, "累积快锅产汽");
            return (Criteria) this;
        }

        public Criteria and累积快锅产汽GreaterThanOrEqualTo(Double value) {
            addCriterion("累积快锅产汽 >=", value, "累积快锅产汽");
            return (Criteria) this;
        }

        public Criteria and累积快锅产汽LessThan(Double value) {
            addCriterion("累积快锅产汽 <", value, "累积快锅产汽");
            return (Criteria) this;
        }

        public Criteria and累积快锅产汽LessThanOrEqualTo(Double value) {
            addCriterion("累积快锅产汽 <=", value, "累积快锅产汽");
            return (Criteria) this;
        }

        public Criteria and累积快锅产汽In(List<Double> values) {
            addCriterion("累积快锅产汽 in", values, "累积快锅产汽");
            return (Criteria) this;
        }

        public Criteria and累积快锅产汽NotIn(List<Double> values) {
            addCriterion("累积快锅产汽 not in", values, "累积快锅产汽");
            return (Criteria) this;
        }

        public Criteria and累积快锅产汽Between(Double value1, Double value2) {
            addCriterion("累积快锅产汽 between", value1, value2, "累积快锅产汽");
            return (Criteria) this;
        }

        public Criteria and累积快锅产汽NotBetween(Double value1, Double value2) {
            addCriterion("累积快锅产汽 not between", value1, value2, "累积快锅产汽");
            return (Criteria) this;
        }

        public Criteria and时段氨产量IsNull() {
            addCriterion("时段氨产量 is null");
            return (Criteria) this;
        }

        public Criteria and时段氨产量IsNotNull() {
            addCriterion("时段氨产量 is not null");
            return (Criteria) this;
        }

        public Criteria and时段氨产量EqualTo(Double value) {
            addCriterion("时段氨产量 =", value, "时段氨产量");
            return (Criteria) this;
        }

        public Criteria and时段氨产量NotEqualTo(Double value) {
            addCriterion("时段氨产量 <>", value, "时段氨产量");
            return (Criteria) this;
        }

        public Criteria and时段氨产量GreaterThan(Double value) {
            addCriterion("时段氨产量 >", value, "时段氨产量");
            return (Criteria) this;
        }

        public Criteria and时段氨产量GreaterThanOrEqualTo(Double value) {
            addCriterion("时段氨产量 >=", value, "时段氨产量");
            return (Criteria) this;
        }

        public Criteria and时段氨产量LessThan(Double value) {
            addCriterion("时段氨产量 <", value, "时段氨产量");
            return (Criteria) this;
        }

        public Criteria and时段氨产量LessThanOrEqualTo(Double value) {
            addCriterion("时段氨产量 <=", value, "时段氨产量");
            return (Criteria) this;
        }

        public Criteria and时段氨产量In(List<Double> values) {
            addCriterion("时段氨产量 in", values, "时段氨产量");
            return (Criteria) this;
        }

        public Criteria and时段氨产量NotIn(List<Double> values) {
            addCriterion("时段氨产量 not in", values, "时段氨产量");
            return (Criteria) this;
        }

        public Criteria and时段氨产量Between(Double value1, Double value2) {
            addCriterion("时段氨产量 between", value1, value2, "时段氨产量");
            return (Criteria) this;
        }

        public Criteria and时段氨产量NotBetween(Double value1, Double value2) {
            addCriterion("时段氨产量 not between", value1, value2, "时段氨产量");
            return (Criteria) this;
        }

        public Criteria and时段总气耗IsNull() {
            addCriterion("时段总气耗 is null");
            return (Criteria) this;
        }

        public Criteria and时段总气耗IsNotNull() {
            addCriterion("时段总气耗 is not null");
            return (Criteria) this;
        }

        public Criteria and时段总气耗EqualTo(Double value) {
            addCriterion("时段总气耗 =", value, "时段总气耗");
            return (Criteria) this;
        }

        public Criteria and时段总气耗NotEqualTo(Double value) {
            addCriterion("时段总气耗 <>", value, "时段总气耗");
            return (Criteria) this;
        }

        public Criteria and时段总气耗GreaterThan(Double value) {
            addCriterion("时段总气耗 >", value, "时段总气耗");
            return (Criteria) this;
        }

        public Criteria and时段总气耗GreaterThanOrEqualTo(Double value) {
            addCriterion("时段总气耗 >=", value, "时段总气耗");
            return (Criteria) this;
        }

        public Criteria and时段总气耗LessThan(Double value) {
            addCriterion("时段总气耗 <", value, "时段总气耗");
            return (Criteria) this;
        }

        public Criteria and时段总气耗LessThanOrEqualTo(Double value) {
            addCriterion("时段总气耗 <=", value, "时段总气耗");
            return (Criteria) this;
        }

        public Criteria and时段总气耗In(List<Double> values) {
            addCriterion("时段总气耗 in", values, "时段总气耗");
            return (Criteria) this;
        }

        public Criteria and时段总气耗NotIn(List<Double> values) {
            addCriterion("时段总气耗 not in", values, "时段总气耗");
            return (Criteria) this;
        }

        public Criteria and时段总气耗Between(Double value1, Double value2) {
            addCriterion("时段总气耗 between", value1, value2, "时段总气耗");
            return (Criteria) this;
        }

        public Criteria and时段总气耗NotBetween(Double value1, Double value2) {
            addCriterion("时段总气耗 not between", value1, value2, "时段总气耗");
            return (Criteria) this;
        }

        public Criteria and时段原料气耗IsNull() {
            addCriterion("时段原料气耗 is null");
            return (Criteria) this;
        }

        public Criteria and时段原料气耗IsNotNull() {
            addCriterion("时段原料气耗 is not null");
            return (Criteria) this;
        }

        public Criteria and时段原料气耗EqualTo(Double value) {
            addCriterion("时段原料气耗 =", value, "时段原料气耗");
            return (Criteria) this;
        }

        public Criteria and时段原料气耗NotEqualTo(Double value) {
            addCriterion("时段原料气耗 <>", value, "时段原料气耗");
            return (Criteria) this;
        }

        public Criteria and时段原料气耗GreaterThan(Double value) {
            addCriterion("时段原料气耗 >", value, "时段原料气耗");
            return (Criteria) this;
        }

        public Criteria and时段原料气耗GreaterThanOrEqualTo(Double value) {
            addCriterion("时段原料气耗 >=", value, "时段原料气耗");
            return (Criteria) this;
        }

        public Criteria and时段原料气耗LessThan(Double value) {
            addCriterion("时段原料气耗 <", value, "时段原料气耗");
            return (Criteria) this;
        }

        public Criteria and时段原料气耗LessThanOrEqualTo(Double value) {
            addCriterion("时段原料气耗 <=", value, "时段原料气耗");
            return (Criteria) this;
        }

        public Criteria and时段原料气耗In(List<Double> values) {
            addCriterion("时段原料气耗 in", values, "时段原料气耗");
            return (Criteria) this;
        }

        public Criteria and时段原料气耗NotIn(List<Double> values) {
            addCriterion("时段原料气耗 not in", values, "时段原料气耗");
            return (Criteria) this;
        }

        public Criteria and时段原料气耗Between(Double value1, Double value2) {
            addCriterion("时段原料气耗 between", value1, value2, "时段原料气耗");
            return (Criteria) this;
        }

        public Criteria and时段原料气耗NotBetween(Double value1, Double value2) {
            addCriterion("时段原料气耗 not between", value1, value2, "时段原料气耗");
            return (Criteria) this;
        }

        public Criteria and时段燃料气耗IsNull() {
            addCriterion("时段燃料气耗 is null");
            return (Criteria) this;
        }

        public Criteria and时段燃料气耗IsNotNull() {
            addCriterion("时段燃料气耗 is not null");
            return (Criteria) this;
        }

        public Criteria and时段燃料气耗EqualTo(Double value) {
            addCriterion("时段燃料气耗 =", value, "时段燃料气耗");
            return (Criteria) this;
        }

        public Criteria and时段燃料气耗NotEqualTo(Double value) {
            addCriterion("时段燃料气耗 <>", value, "时段燃料气耗");
            return (Criteria) this;
        }

        public Criteria and时段燃料气耗GreaterThan(Double value) {
            addCriterion("时段燃料气耗 >", value, "时段燃料气耗");
            return (Criteria) this;
        }

        public Criteria and时段燃料气耗GreaterThanOrEqualTo(Double value) {
            addCriterion("时段燃料气耗 >=", value, "时段燃料气耗");
            return (Criteria) this;
        }

        public Criteria and时段燃料气耗LessThan(Double value) {
            addCriterion("时段燃料气耗 <", value, "时段燃料气耗");
            return (Criteria) this;
        }

        public Criteria and时段燃料气耗LessThanOrEqualTo(Double value) {
            addCriterion("时段燃料气耗 <=", value, "时段燃料气耗");
            return (Criteria) this;
        }

        public Criteria and时段燃料气耗In(List<Double> values) {
            addCriterion("时段燃料气耗 in", values, "时段燃料气耗");
            return (Criteria) this;
        }

        public Criteria and时段燃料气耗NotIn(List<Double> values) {
            addCriterion("时段燃料气耗 not in", values, "时段燃料气耗");
            return (Criteria) this;
        }

        public Criteria and时段燃料气耗Between(Double value1, Double value2) {
            addCriterion("时段燃料气耗 between", value1, value2, "时段燃料气耗");
            return (Criteria) this;
        }

        public Criteria and时段燃料气耗NotBetween(Double value1, Double value2) {
            addCriterion("时段燃料气耗 not between", value1, value2, "时段燃料气耗");
            return (Criteria) this;
        }

        public Criteria and时段快锅气耗IsNull() {
            addCriterion("时段快锅气耗 is null");
            return (Criteria) this;
        }

        public Criteria and时段快锅气耗IsNotNull() {
            addCriterion("时段快锅气耗 is not null");
            return (Criteria) this;
        }

        public Criteria and时段快锅气耗EqualTo(Double value) {
            addCriterion("时段快锅气耗 =", value, "时段快锅气耗");
            return (Criteria) this;
        }

        public Criteria and时段快锅气耗NotEqualTo(Double value) {
            addCriterion("时段快锅气耗 <>", value, "时段快锅气耗");
            return (Criteria) this;
        }

        public Criteria and时段快锅气耗GreaterThan(Double value) {
            addCriterion("时段快锅气耗 >", value, "时段快锅气耗");
            return (Criteria) this;
        }

        public Criteria and时段快锅气耗GreaterThanOrEqualTo(Double value) {
            addCriterion("时段快锅气耗 >=", value, "时段快锅气耗");
            return (Criteria) this;
        }

        public Criteria and时段快锅气耗LessThan(Double value) {
            addCriterion("时段快锅气耗 <", value, "时段快锅气耗");
            return (Criteria) this;
        }

        public Criteria and时段快锅气耗LessThanOrEqualTo(Double value) {
            addCriterion("时段快锅气耗 <=", value, "时段快锅气耗");
            return (Criteria) this;
        }

        public Criteria and时段快锅气耗In(List<Double> values) {
            addCriterion("时段快锅气耗 in", values, "时段快锅气耗");
            return (Criteria) this;
        }

        public Criteria and时段快锅气耗NotIn(List<Double> values) {
            addCriterion("时段快锅气耗 not in", values, "时段快锅气耗");
            return (Criteria) this;
        }

        public Criteria and时段快锅气耗Between(Double value1, Double value2) {
            addCriterion("时段快锅气耗 between", value1, value2, "时段快锅气耗");
            return (Criteria) this;
        }

        public Criteria and时段快锅气耗NotBetween(Double value1, Double value2) {
            addCriterion("时段快锅气耗 not between", value1, value2, "时段快锅气耗");
            return (Criteria) this;
        }

        public Criteria and时段净蒸汽耗IsNull() {
            addCriterion("时段净蒸汽耗 is null");
            return (Criteria) this;
        }

        public Criteria and时段净蒸汽耗IsNotNull() {
            addCriterion("时段净蒸汽耗 is not null");
            return (Criteria) this;
        }

        public Criteria and时段净蒸汽耗EqualTo(Double value) {
            addCriterion("时段净蒸汽耗 =", value, "时段净蒸汽耗");
            return (Criteria) this;
        }

        public Criteria and时段净蒸汽耗NotEqualTo(Double value) {
            addCriterion("时段净蒸汽耗 <>", value, "时段净蒸汽耗");
            return (Criteria) this;
        }

        public Criteria and时段净蒸汽耗GreaterThan(Double value) {
            addCriterion("时段净蒸汽耗 >", value, "时段净蒸汽耗");
            return (Criteria) this;
        }

        public Criteria and时段净蒸汽耗GreaterThanOrEqualTo(Double value) {
            addCriterion("时段净蒸汽耗 >=", value, "时段净蒸汽耗");
            return (Criteria) this;
        }

        public Criteria and时段净蒸汽耗LessThan(Double value) {
            addCriterion("时段净蒸汽耗 <", value, "时段净蒸汽耗");
            return (Criteria) this;
        }

        public Criteria and时段净蒸汽耗LessThanOrEqualTo(Double value) {
            addCriterion("时段净蒸汽耗 <=", value, "时段净蒸汽耗");
            return (Criteria) this;
        }

        public Criteria and时段净蒸汽耗In(List<Double> values) {
            addCriterion("时段净蒸汽耗 in", values, "时段净蒸汽耗");
            return (Criteria) this;
        }

        public Criteria and时段净蒸汽耗NotIn(List<Double> values) {
            addCriterion("时段净蒸汽耗 not in", values, "时段净蒸汽耗");
            return (Criteria) this;
        }

        public Criteria and时段净蒸汽耗Between(Double value1, Double value2) {
            addCriterion("时段净蒸汽耗 between", value1, value2, "时段净蒸汽耗");
            return (Criteria) this;
        }

        public Criteria and时段净蒸汽耗NotBetween(Double value1, Double value2) {
            addCriterion("时段净蒸汽耗 not between", value1, value2, "时段净蒸汽耗");
            return (Criteria) this;
        }

        public Criteria and时段气耗IsNull() {
            addCriterion("时段气耗 is null");
            return (Criteria) this;
        }

        public Criteria and时段气耗IsNotNull() {
            addCriterion("时段气耗 is not null");
            return (Criteria) this;
        }

        public Criteria and时段气耗EqualTo(Double value) {
            addCriterion("时段气耗 =", value, "时段气耗");
            return (Criteria) this;
        }

        public Criteria and时段气耗NotEqualTo(Double value) {
            addCriterion("时段气耗 <>", value, "时段气耗");
            return (Criteria) this;
        }

        public Criteria and时段气耗GreaterThan(Double value) {
            addCriterion("时段气耗 >", value, "时段气耗");
            return (Criteria) this;
        }

        public Criteria and时段气耗GreaterThanOrEqualTo(Double value) {
            addCriterion("时段气耗 >=", value, "时段气耗");
            return (Criteria) this;
        }

        public Criteria and时段气耗LessThan(Double value) {
            addCriterion("时段气耗 <", value, "时段气耗");
            return (Criteria) this;
        }

        public Criteria and时段气耗LessThanOrEqualTo(Double value) {
            addCriterion("时段气耗 <=", value, "时段气耗");
            return (Criteria) this;
        }

        public Criteria and时段气耗In(List<Double> values) {
            addCriterion("时段气耗 in", values, "时段气耗");
            return (Criteria) this;
        }

        public Criteria and时段气耗NotIn(List<Double> values) {
            addCriterion("时段气耗 not in", values, "时段气耗");
            return (Criteria) this;
        }

        public Criteria and时段气耗Between(Double value1, Double value2) {
            addCriterion("时段气耗 between", value1, value2, "时段气耗");
            return (Criteria) this;
        }

        public Criteria and时段气耗NotBetween(Double value1, Double value2) {
            addCriterion("时段气耗 not between", value1, value2, "时段气耗");
            return (Criteria) this;
        }

        public Criteria and时段气耗_含蒸汽折算IsNull() {
            addCriterion("时段气耗_含蒸汽折算 is null");
            return (Criteria) this;
        }

        public Criteria and时段气耗_含蒸汽折算IsNotNull() {
            addCriterion("时段气耗_含蒸汽折算 is not null");
            return (Criteria) this;
        }

        public Criteria and时段气耗_含蒸汽折算EqualTo(Double value) {
            addCriterion("时段气耗_含蒸汽折算 =", value, "时段气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and时段气耗_含蒸汽折算NotEqualTo(Double value) {
            addCriterion("时段气耗_含蒸汽折算 <>", value, "时段气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and时段气耗_含蒸汽折算GreaterThan(Double value) {
            addCriterion("时段气耗_含蒸汽折算 >", value, "时段气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and时段气耗_含蒸汽折算GreaterThanOrEqualTo(Double value) {
            addCriterion("时段气耗_含蒸汽折算 >=", value, "时段气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and时段气耗_含蒸汽折算LessThan(Double value) {
            addCriterion("时段气耗_含蒸汽折算 <", value, "时段气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and时段气耗_含蒸汽折算LessThanOrEqualTo(Double value) {
            addCriterion("时段气耗_含蒸汽折算 <=", value, "时段气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and时段气耗_含蒸汽折算In(List<Double> values) {
            addCriterion("时段气耗_含蒸汽折算 in", values, "时段气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and时段气耗_含蒸汽折算NotIn(List<Double> values) {
            addCriterion("时段气耗_含蒸汽折算 not in", values, "时段气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and时段气耗_含蒸汽折算Between(Double value1, Double value2) {
            addCriterion("时段气耗_含蒸汽折算 between", value1, value2, "时段气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and时段气耗_含蒸汽折算NotBetween(Double value1, Double value2) {
            addCriterion("时段气耗_含蒸汽折算 not between", value1, value2, "时段气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and系统负荷IsNull() {
            addCriterion("系统负荷 is null");
            return (Criteria) this;
        }

        public Criteria and系统负荷IsNotNull() {
            addCriterion("系统负荷 is not null");
            return (Criteria) this;
        }

        public Criteria and系统负荷EqualTo(Double value) {
            addCriterion("系统负荷 =", value, "系统负荷");
            return (Criteria) this;
        }

        public Criteria and系统负荷NotEqualTo(Double value) {
            addCriterion("系统负荷 <>", value, "系统负荷");
            return (Criteria) this;
        }

        public Criteria and系统负荷GreaterThan(Double value) {
            addCriterion("系统负荷 >", value, "系统负荷");
            return (Criteria) this;
        }

        public Criteria and系统负荷GreaterThanOrEqualTo(Double value) {
            addCriterion("系统负荷 >=", value, "系统负荷");
            return (Criteria) this;
        }

        public Criteria and系统负荷LessThan(Double value) {
            addCriterion("系统负荷 <", value, "系统负荷");
            return (Criteria) this;
        }

        public Criteria and系统负荷LessThanOrEqualTo(Double value) {
            addCriterion("系统负荷 <=", value, "系统负荷");
            return (Criteria) this;
        }

        public Criteria and系统负荷In(List<Double> values) {
            addCriterion("系统负荷 in", values, "系统负荷");
            return (Criteria) this;
        }

        public Criteria and系统负荷NotIn(List<Double> values) {
            addCriterion("系统负荷 not in", values, "系统负荷");
            return (Criteria) this;
        }

        public Criteria and系统负荷Between(Double value1, Double value2) {
            addCriterion("系统负荷 between", value1, value2, "系统负荷");
            return (Criteria) this;
        }

        public Criteria and系统负荷NotBetween(Double value1, Double value2) {
            addCriterion("系统负荷 not between", value1, value2, "系统负荷");
            return (Criteria) this;
        }

        public Criteria and小时氨产量IsNull() {
            addCriterion("小时氨产量 is null");
            return (Criteria) this;
        }

        public Criteria and小时氨产量IsNotNull() {
            addCriterion("小时氨产量 is not null");
            return (Criteria) this;
        }

        public Criteria and小时氨产量EqualTo(Double value) {
            addCriterion("小时氨产量 =", value, "小时氨产量");
            return (Criteria) this;
        }

        public Criteria and小时氨产量NotEqualTo(Double value) {
            addCriterion("小时氨产量 <>", value, "小时氨产量");
            return (Criteria) this;
        }

        public Criteria and小时氨产量GreaterThan(Double value) {
            addCriterion("小时氨产量 >", value, "小时氨产量");
            return (Criteria) this;
        }

        public Criteria and小时氨产量GreaterThanOrEqualTo(Double value) {
            addCriterion("小时氨产量 >=", value, "小时氨产量");
            return (Criteria) this;
        }

        public Criteria and小时氨产量LessThan(Double value) {
            addCriterion("小时氨产量 <", value, "小时氨产量");
            return (Criteria) this;
        }

        public Criteria and小时氨产量LessThanOrEqualTo(Double value) {
            addCriterion("小时氨产量 <=", value, "小时氨产量");
            return (Criteria) this;
        }

        public Criteria and小时氨产量In(List<Double> values) {
            addCriterion("小时氨产量 in", values, "小时氨产量");
            return (Criteria) this;
        }

        public Criteria and小时氨产量NotIn(List<Double> values) {
            addCriterion("小时氨产量 not in", values, "小时氨产量");
            return (Criteria) this;
        }

        public Criteria and小时氨产量Between(Double value1, Double value2) {
            addCriterion("小时氨产量 between", value1, value2, "小时氨产量");
            return (Criteria) this;
        }

        public Criteria and小时氨产量NotBetween(Double value1, Double value2) {
            addCriterion("小时氨产量 not between", value1, value2, "小时氨产量");
            return (Criteria) this;
        }

        public Criteria and吨氨综合消耗IsNull() {
            addCriterion("吨氨综合消耗 is null");
            return (Criteria) this;
        }

        public Criteria and吨氨综合消耗IsNotNull() {
            addCriterion("吨氨综合消耗 is not null");
            return (Criteria) this;
        }

        public Criteria and吨氨综合消耗EqualTo(Double value) {
            addCriterion("吨氨综合消耗 =", value, "吨氨综合消耗");
            return (Criteria) this;
        }

        public Criteria and吨氨综合消耗NotEqualTo(Double value) {
            addCriterion("吨氨综合消耗 <>", value, "吨氨综合消耗");
            return (Criteria) this;
        }

        public Criteria and吨氨综合消耗GreaterThan(Double value) {
            addCriterion("吨氨综合消耗 >", value, "吨氨综合消耗");
            return (Criteria) this;
        }

        public Criteria and吨氨综合消耗GreaterThanOrEqualTo(Double value) {
            addCriterion("吨氨综合消耗 >=", value, "吨氨综合消耗");
            return (Criteria) this;
        }

        public Criteria and吨氨综合消耗LessThan(Double value) {
            addCriterion("吨氨综合消耗 <", value, "吨氨综合消耗");
            return (Criteria) this;
        }

        public Criteria and吨氨综合消耗LessThanOrEqualTo(Double value) {
            addCriterion("吨氨综合消耗 <=", value, "吨氨综合消耗");
            return (Criteria) this;
        }

        public Criteria and吨氨综合消耗In(List<Double> values) {
            addCriterion("吨氨综合消耗 in", values, "吨氨综合消耗");
            return (Criteria) this;
        }

        public Criteria and吨氨综合消耗NotIn(List<Double> values) {
            addCriterion("吨氨综合消耗 not in", values, "吨氨综合消耗");
            return (Criteria) this;
        }

        public Criteria and吨氨综合消耗Between(Double value1, Double value2) {
            addCriterion("吨氨综合消耗 between", value1, value2, "吨氨综合消耗");
            return (Criteria) this;
        }

        public Criteria and吨氨综合消耗NotBetween(Double value1, Double value2) {
            addCriterion("吨氨综合消耗 not between", value1, value2, "吨氨综合消耗");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗IsNull() {
            addCriterion("吨氨气耗 is null");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗IsNotNull() {
            addCriterion("吨氨气耗 is not null");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗EqualTo(Double value) {
            addCriterion("吨氨气耗 =", value, "吨氨气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗NotEqualTo(Double value) {
            addCriterion("吨氨气耗 <>", value, "吨氨气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗GreaterThan(Double value) {
            addCriterion("吨氨气耗 >", value, "吨氨气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗GreaterThanOrEqualTo(Double value) {
            addCriterion("吨氨气耗 >=", value, "吨氨气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗LessThan(Double value) {
            addCriterion("吨氨气耗 <", value, "吨氨气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗LessThanOrEqualTo(Double value) {
            addCriterion("吨氨气耗 <=", value, "吨氨气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗In(List<Double> values) {
            addCriterion("吨氨气耗 in", values, "吨氨气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗NotIn(List<Double> values) {
            addCriterion("吨氨气耗 not in", values, "吨氨气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗Between(Double value1, Double value2) {
            addCriterion("吨氨气耗 between", value1, value2, "吨氨气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗NotBetween(Double value1, Double value2) {
            addCriterion("吨氨气耗 not between", value1, value2, "吨氨气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨原料气耗IsNull() {
            addCriterion("吨氨原料气耗 is null");
            return (Criteria) this;
        }

        public Criteria and吨氨原料气耗IsNotNull() {
            addCriterion("吨氨原料气耗 is not null");
            return (Criteria) this;
        }

        public Criteria and吨氨原料气耗EqualTo(Double value) {
            addCriterion("吨氨原料气耗 =", value, "吨氨原料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨原料气耗NotEqualTo(Double value) {
            addCriterion("吨氨原料气耗 <>", value, "吨氨原料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨原料气耗GreaterThan(Double value) {
            addCriterion("吨氨原料气耗 >", value, "吨氨原料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨原料气耗GreaterThanOrEqualTo(Double value) {
            addCriterion("吨氨原料气耗 >=", value, "吨氨原料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨原料气耗LessThan(Double value) {
            addCriterion("吨氨原料气耗 <", value, "吨氨原料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨原料气耗LessThanOrEqualTo(Double value) {
            addCriterion("吨氨原料气耗 <=", value, "吨氨原料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨原料气耗In(List<Double> values) {
            addCriterion("吨氨原料气耗 in", values, "吨氨原料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨原料气耗NotIn(List<Double> values) {
            addCriterion("吨氨原料气耗 not in", values, "吨氨原料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨原料气耗Between(Double value1, Double value2) {
            addCriterion("吨氨原料气耗 between", value1, value2, "吨氨原料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨原料气耗NotBetween(Double value1, Double value2) {
            addCriterion("吨氨原料气耗 not between", value1, value2, "吨氨原料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨燃料气耗IsNull() {
            addCriterion("吨氨燃料气耗 is null");
            return (Criteria) this;
        }

        public Criteria and吨氨燃料气耗IsNotNull() {
            addCriterion("吨氨燃料气耗 is not null");
            return (Criteria) this;
        }

        public Criteria and吨氨燃料气耗EqualTo(Double value) {
            addCriterion("吨氨燃料气耗 =", value, "吨氨燃料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨燃料气耗NotEqualTo(Double value) {
            addCriterion("吨氨燃料气耗 <>", value, "吨氨燃料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨燃料气耗GreaterThan(Double value) {
            addCriterion("吨氨燃料气耗 >", value, "吨氨燃料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨燃料气耗GreaterThanOrEqualTo(Double value) {
            addCriterion("吨氨燃料气耗 >=", value, "吨氨燃料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨燃料气耗LessThan(Double value) {
            addCriterion("吨氨燃料气耗 <", value, "吨氨燃料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨燃料气耗LessThanOrEqualTo(Double value) {
            addCriterion("吨氨燃料气耗 <=", value, "吨氨燃料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨燃料气耗In(List<Double> values) {
            addCriterion("吨氨燃料气耗 in", values, "吨氨燃料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨燃料气耗NotIn(List<Double> values) {
            addCriterion("吨氨燃料气耗 not in", values, "吨氨燃料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨燃料气耗Between(Double value1, Double value2) {
            addCriterion("吨氨燃料气耗 between", value1, value2, "吨氨燃料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨燃料气耗NotBetween(Double value1, Double value2) {
            addCriterion("吨氨燃料气耗 not between", value1, value2, "吨氨燃料气耗");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗_含蒸汽折算IsNull() {
            addCriterion("吨氨气耗_含蒸汽折算 is null");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗_含蒸汽折算IsNotNull() {
            addCriterion("吨氨气耗_含蒸汽折算 is not null");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗_含蒸汽折算EqualTo(Double value) {
            addCriterion("吨氨气耗_含蒸汽折算 =", value, "吨氨气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗_含蒸汽折算NotEqualTo(Double value) {
            addCriterion("吨氨气耗_含蒸汽折算 <>", value, "吨氨气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗_含蒸汽折算GreaterThan(Double value) {
            addCriterion("吨氨气耗_含蒸汽折算 >", value, "吨氨气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗_含蒸汽折算GreaterThanOrEqualTo(Double value) {
            addCriterion("吨氨气耗_含蒸汽折算 >=", value, "吨氨气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗_含蒸汽折算LessThan(Double value) {
            addCriterion("吨氨气耗_含蒸汽折算 <", value, "吨氨气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗_含蒸汽折算LessThanOrEqualTo(Double value) {
            addCriterion("吨氨气耗_含蒸汽折算 <=", value, "吨氨气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗_含蒸汽折算In(List<Double> values) {
            addCriterion("吨氨气耗_含蒸汽折算 in", values, "吨氨气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗_含蒸汽折算NotIn(List<Double> values) {
            addCriterion("吨氨气耗_含蒸汽折算 not in", values, "吨氨气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗_含蒸汽折算Between(Double value1, Double value2) {
            addCriterion("吨氨气耗_含蒸汽折算 between", value1, value2, "吨氨气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and吨氨气耗_含蒸汽折算NotBetween(Double value1, Double value2) {
            addCriterion("吨氨气耗_含蒸汽折算 not between", value1, value2, "吨氨气耗_含蒸汽折算");
            return (Criteria) this;
        }

        public Criteria and班次IsNull() {
            addCriterion("班次 is null");
            return (Criteria) this;
        }

        public Criteria and班次IsNotNull() {
            addCriterion("班次 is not null");
            return (Criteria) this;
        }

        public Criteria and班次EqualTo(Integer value) {
            addCriterion("班次 =", value, "班次");
            return (Criteria) this;
        }

        public Criteria and班次NotEqualTo(Integer value) {
            addCriterion("班次 <>", value, "班次");
            return (Criteria) this;
        }

        public Criteria and班次GreaterThan(Integer value) {
            addCriterion("班次 >", value, "班次");
            return (Criteria) this;
        }

        public Criteria and班次GreaterThanOrEqualTo(Integer value) {
            addCriterion("班次 >=", value, "班次");
            return (Criteria) this;
        }

        public Criteria and班次LessThan(Integer value) {
            addCriterion("班次 <", value, "班次");
            return (Criteria) this;
        }

        public Criteria and班次LessThanOrEqualTo(Integer value) {
            addCriterion("班次 <=", value, "班次");
            return (Criteria) this;
        }

        public Criteria and班次In(List<Integer> values) {
            addCriterion("班次 in", values, "班次");
            return (Criteria) this;
        }

        public Criteria and班次NotIn(List<Integer> values) {
            addCriterion("班次 not in", values, "班次");
            return (Criteria) this;
        }

        public Criteria and班次Between(Integer value1, Integer value2) {
            addCriterion("班次 between", value1, value2, "班次");
            return (Criteria) this;
        }

        public Criteria and班次NotBetween(Integer value1, Integer value2) {
            addCriterion("班次 not between", value1, value2, "班次");
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