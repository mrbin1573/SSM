package com.saitejn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JfExcelInputExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JfExcelInputExample() {
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

        public Criteria andJfidIsNull() {
            addCriterion("jfid is null");
            return (Criteria) this;
        }

        public Criteria andJfidIsNotNull() {
            addCriterion("jfid is not null");
            return (Criteria) this;
        }

        public Criteria andJfidEqualTo(Integer value) {
            addCriterion("jfid =", value, "jfid");
            return (Criteria) this;
        }

        public Criteria andJfidNotEqualTo(Integer value) {
            addCriterion("jfid <>", value, "jfid");
            return (Criteria) this;
        }

        public Criteria andJfidGreaterThan(Integer value) {
            addCriterion("jfid >", value, "jfid");
            return (Criteria) this;
        }

        public Criteria andJfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jfid >=", value, "jfid");
            return (Criteria) this;
        }

        public Criteria andJfidLessThan(Integer value) {
            addCriterion("jfid <", value, "jfid");
            return (Criteria) this;
        }

        public Criteria andJfidLessThanOrEqualTo(Integer value) {
            addCriterion("jfid <=", value, "jfid");
            return (Criteria) this;
        }

        public Criteria andJfidIn(List<Integer> values) {
            addCriterion("jfid in", values, "jfid");
            return (Criteria) this;
        }

        public Criteria andJfidNotIn(List<Integer> values) {
            addCriterion("jfid not in", values, "jfid");
            return (Criteria) this;
        }

        public Criteria andJfidBetween(Integer value1, Integer value2) {
            addCriterion("jfid between", value1, value2, "jfid");
            return (Criteria) this;
        }

        public Criteria andJfidNotBetween(Integer value1, Integer value2) {
            addCriterion("jfid not between", value1, value2, "jfid");
            return (Criteria) this;
        }

        public Criteria andJf_data_timeIsNull() {
            addCriterion("jf_data_time is null");
            return (Criteria) this;
        }

        public Criteria andJf_data_timeIsNotNull() {
            addCriterion("jf_data_time is not null");
            return (Criteria) this;
        }

        public Criteria andJf_data_timeEqualTo(Date value) {
            addCriterion("jf_data_time =", value, "jf_data_time");
            return (Criteria) this;
        }

        public Criteria andJf_data_timeNotEqualTo(Date value) {
            addCriterion("jf_data_time <>", value, "jf_data_time");
            return (Criteria) this;
        }

        public Criteria andJf_data_timeGreaterThan(Date value) {
            addCriterion("jf_data_time >", value, "jf_data_time");
            return (Criteria) this;
        }

        public Criteria andJf_data_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("jf_data_time >=", value, "jf_data_time");
            return (Criteria) this;
        }

        public Criteria andJf_data_timeLessThan(Date value) {
            addCriterion("jf_data_time <", value, "jf_data_time");
            return (Criteria) this;
        }

        public Criteria andJf_data_timeLessThanOrEqualTo(Date value) {
            addCriterion("jf_data_time <=", value, "jf_data_time");
            return (Criteria) this;
        }

        public Criteria andJf_data_timeIn(List<Date> values) {
            addCriterion("jf_data_time in", values, "jf_data_time");
            return (Criteria) this;
        }

        public Criteria andJf_data_timeNotIn(List<Date> values) {
            addCriterion("jf_data_time not in", values, "jf_data_time");
            return (Criteria) this;
        }

        public Criteria andJf_data_timeBetween(Date value1, Date value2) {
            addCriterion("jf_data_time between", value1, value2, "jf_data_time");
            return (Criteria) this;
        }

        public Criteria andJf_data_timeNotBetween(Date value1, Date value2) {
            addCriterion("jf_data_time not between", value1, value2, "jf_data_time");
            return (Criteria) this;
        }

        public Criteria andFI100IsNull() {
            addCriterion("FI100 is null");
            return (Criteria) this;
        }

        public Criteria andFI100IsNotNull() {
            addCriterion("FI100 is not null");
            return (Criteria) this;
        }

        public Criteria andFI100EqualTo(Double value) {
            addCriterion("FI100 =", value, "FI100");
            return (Criteria) this;
        }

        public Criteria andFI100NotEqualTo(Double value) {
            addCriterion("FI100 <>", value, "FI100");
            return (Criteria) this;
        }

        public Criteria andFI100GreaterThan(Double value) {
            addCriterion("FI100 >", value, "FI100");
            return (Criteria) this;
        }

        public Criteria andFI100GreaterThanOrEqualTo(Double value) {
            addCriterion("FI100 >=", value, "FI100");
            return (Criteria) this;
        }

        public Criteria andFI100LessThan(Double value) {
            addCriterion("FI100 <", value, "FI100");
            return (Criteria) this;
        }

        public Criteria andFI100LessThanOrEqualTo(Double value) {
            addCriterion("FI100 <=", value, "FI100");
            return (Criteria) this;
        }

        public Criteria andFI100In(List<Double> values) {
            addCriterion("FI100 in", values, "FI100");
            return (Criteria) this;
        }

        public Criteria andFI100NotIn(List<Double> values) {
            addCriterion("FI100 not in", values, "FI100");
            return (Criteria) this;
        }

        public Criteria andFI100Between(Double value1, Double value2) {
            addCriterion("FI100 between", value1, value2, "FI100");
            return (Criteria) this;
        }

        public Criteria andFI100NotBetween(Double value1, Double value2) {
            addCriterion("FI100 not between", value1, value2, "FI100");
            return (Criteria) this;
        }

        public Criteria andFC101IsNull() {
            addCriterion("FC101 is null");
            return (Criteria) this;
        }

        public Criteria andFC101IsNotNull() {
            addCriterion("FC101 is not null");
            return (Criteria) this;
        }

        public Criteria andFC101EqualTo(Double value) {
            addCriterion("FC101 =", value, "FC101");
            return (Criteria) this;
        }

        public Criteria andFC101NotEqualTo(Double value) {
            addCriterion("FC101 <>", value, "FC101");
            return (Criteria) this;
        }

        public Criteria andFC101GreaterThan(Double value) {
            addCriterion("FC101 >", value, "FC101");
            return (Criteria) this;
        }

        public Criteria andFC101GreaterThanOrEqualTo(Double value) {
            addCriterion("FC101 >=", value, "FC101");
            return (Criteria) this;
        }

        public Criteria andFC101LessThan(Double value) {
            addCriterion("FC101 <", value, "FC101");
            return (Criteria) this;
        }

        public Criteria andFC101LessThanOrEqualTo(Double value) {
            addCriterion("FC101 <=", value, "FC101");
            return (Criteria) this;
        }

        public Criteria andFC101In(List<Double> values) {
            addCriterion("FC101 in", values, "FC101");
            return (Criteria) this;
        }

        public Criteria andFC101NotIn(List<Double> values) {
            addCriterion("FC101 not in", values, "FC101");
            return (Criteria) this;
        }

        public Criteria andFC101Between(Double value1, Double value2) {
            addCriterion("FC101 between", value1, value2, "FC101");
            return (Criteria) this;
        }

        public Criteria andFC101NotBetween(Double value1, Double value2) {
            addCriterion("FC101 not between", value1, value2, "FC101");
            return (Criteria) this;
        }

        public Criteria andFC105IsNull() {
            addCriterion("FC105 is null");
            return (Criteria) this;
        }

        public Criteria andFC105IsNotNull() {
            addCriterion("FC105 is not null");
            return (Criteria) this;
        }

        public Criteria andFC105EqualTo(Double value) {
            addCriterion("FC105 =", value, "FC105");
            return (Criteria) this;
        }

        public Criteria andFC105NotEqualTo(Double value) {
            addCriterion("FC105 <>", value, "FC105");
            return (Criteria) this;
        }

        public Criteria andFC105GreaterThan(Double value) {
            addCriterion("FC105 >", value, "FC105");
            return (Criteria) this;
        }

        public Criteria andFC105GreaterThanOrEqualTo(Double value) {
            addCriterion("FC105 >=", value, "FC105");
            return (Criteria) this;
        }

        public Criteria andFC105LessThan(Double value) {
            addCriterion("FC105 <", value, "FC105");
            return (Criteria) this;
        }

        public Criteria andFC105LessThanOrEqualTo(Double value) {
            addCriterion("FC105 <=", value, "FC105");
            return (Criteria) this;
        }

        public Criteria andFC105In(List<Double> values) {
            addCriterion("FC105 in", values, "FC105");
            return (Criteria) this;
        }

        public Criteria andFC105NotIn(List<Double> values) {
            addCriterion("FC105 not in", values, "FC105");
            return (Criteria) this;
        }

        public Criteria andFC105Between(Double value1, Double value2) {
            addCriterion("FC105 between", value1, value2, "FC105");
            return (Criteria) this;
        }

        public Criteria andFC105NotBetween(Double value1, Double value2) {
            addCriterion("FC105 not between", value1, value2, "FC105");
            return (Criteria) this;
        }

        public Criteria andFFY101IsNull() {
            addCriterion("FFY101 is null");
            return (Criteria) this;
        }

        public Criteria andFFY101IsNotNull() {
            addCriterion("FFY101 is not null");
            return (Criteria) this;
        }

        public Criteria andFFY101EqualTo(Double value) {
            addCriterion("FFY101 =", value, "FFY101");
            return (Criteria) this;
        }

        public Criteria andFFY101NotEqualTo(Double value) {
            addCriterion("FFY101 <>", value, "FFY101");
            return (Criteria) this;
        }

        public Criteria andFFY101GreaterThan(Double value) {
            addCriterion("FFY101 >", value, "FFY101");
            return (Criteria) this;
        }

        public Criteria andFFY101GreaterThanOrEqualTo(Double value) {
            addCriterion("FFY101 >=", value, "FFY101");
            return (Criteria) this;
        }

        public Criteria andFFY101LessThan(Double value) {
            addCriterion("FFY101 <", value, "FFY101");
            return (Criteria) this;
        }

        public Criteria andFFY101LessThanOrEqualTo(Double value) {
            addCriterion("FFY101 <=", value, "FFY101");
            return (Criteria) this;
        }

        public Criteria andFFY101In(List<Double> values) {
            addCriterion("FFY101 in", values, "FFY101");
            return (Criteria) this;
        }

        public Criteria andFFY101NotIn(List<Double> values) {
            addCriterion("FFY101 not in", values, "FFY101");
            return (Criteria) this;
        }

        public Criteria andFFY101Between(Double value1, Double value2) {
            addCriterion("FFY101 between", value1, value2, "FFY101");
            return (Criteria) this;
        }

        public Criteria andFFY101NotBetween(Double value1, Double value2) {
            addCriterion("FFY101 not between", value1, value2, "FFY101");
            return (Criteria) this;
        }

        public Criteria andFFY105IsNull() {
            addCriterion("FFY105 is null");
            return (Criteria) this;
        }

        public Criteria andFFY105IsNotNull() {
            addCriterion("FFY105 is not null");
            return (Criteria) this;
        }

        public Criteria andFFY105EqualTo(Double value) {
            addCriterion("FFY105 =", value, "FFY105");
            return (Criteria) this;
        }

        public Criteria andFFY105NotEqualTo(Double value) {
            addCriterion("FFY105 <>", value, "FFY105");
            return (Criteria) this;
        }

        public Criteria andFFY105GreaterThan(Double value) {
            addCriterion("FFY105 >", value, "FFY105");
            return (Criteria) this;
        }

        public Criteria andFFY105GreaterThanOrEqualTo(Double value) {
            addCriterion("FFY105 >=", value, "FFY105");
            return (Criteria) this;
        }

        public Criteria andFFY105LessThan(Double value) {
            addCriterion("FFY105 <", value, "FFY105");
            return (Criteria) this;
        }

        public Criteria andFFY105LessThanOrEqualTo(Double value) {
            addCriterion("FFY105 <=", value, "FFY105");
            return (Criteria) this;
        }

        public Criteria andFFY105In(List<Double> values) {
            addCriterion("FFY105 in", values, "FFY105");
            return (Criteria) this;
        }

        public Criteria andFFY105NotIn(List<Double> values) {
            addCriterion("FFY105 not in", values, "FFY105");
            return (Criteria) this;
        }

        public Criteria andFFY105Between(Double value1, Double value2) {
            addCriterion("FFY105 between", value1, value2, "FFY105");
            return (Criteria) this;
        }

        public Criteria andFFY105NotBetween(Double value1, Double value2) {
            addCriterion("FFY105 not between", value1, value2, "FFY105");
            return (Criteria) this;
        }

        public Criteria andFI203IsNull() {
            addCriterion("FI203 is null");
            return (Criteria) this;
        }

        public Criteria andFI203IsNotNull() {
            addCriterion("FI203 is not null");
            return (Criteria) this;
        }

        public Criteria andFI203EqualTo(Double value) {
            addCriterion("FI203 =", value, "FI203");
            return (Criteria) this;
        }

        public Criteria andFI203NotEqualTo(Double value) {
            addCriterion("FI203 <>", value, "FI203");
            return (Criteria) this;
        }

        public Criteria andFI203GreaterThan(Double value) {
            addCriterion("FI203 >", value, "FI203");
            return (Criteria) this;
        }

        public Criteria andFI203GreaterThanOrEqualTo(Double value) {
            addCriterion("FI203 >=", value, "FI203");
            return (Criteria) this;
        }

        public Criteria andFI203LessThan(Double value) {
            addCriterion("FI203 <", value, "FI203");
            return (Criteria) this;
        }

        public Criteria andFI203LessThanOrEqualTo(Double value) {
            addCriterion("FI203 <=", value, "FI203");
            return (Criteria) this;
        }

        public Criteria andFI203In(List<Double> values) {
            addCriterion("FI203 in", values, "FI203");
            return (Criteria) this;
        }

        public Criteria andFI203NotIn(List<Double> values) {
            addCriterion("FI203 not in", values, "FI203");
            return (Criteria) this;
        }

        public Criteria andFI203Between(Double value1, Double value2) {
            addCriterion("FI203 between", value1, value2, "FI203");
            return (Criteria) this;
        }

        public Criteria andFI203NotBetween(Double value1, Double value2) {
            addCriterion("FI203 not between", value1, value2, "FI203");
            return (Criteria) this;
        }

        public Criteria andPC167IsNull() {
            addCriterion("PC167 is null");
            return (Criteria) this;
        }

        public Criteria andPC167IsNotNull() {
            addCriterion("PC167 is not null");
            return (Criteria) this;
        }

        public Criteria andPC167EqualTo(Double value) {
            addCriterion("PC167 =", value, "PC167");
            return (Criteria) this;
        }

        public Criteria andPC167NotEqualTo(Double value) {
            addCriterion("PC167 <>", value, "PC167");
            return (Criteria) this;
        }

        public Criteria andPC167GreaterThan(Double value) {
            addCriterion("PC167 >", value, "PC167");
            return (Criteria) this;
        }

        public Criteria andPC167GreaterThanOrEqualTo(Double value) {
            addCriterion("PC167 >=", value, "PC167");
            return (Criteria) this;
        }

        public Criteria andPC167LessThan(Double value) {
            addCriterion("PC167 <", value, "PC167");
            return (Criteria) this;
        }

        public Criteria andPC167LessThanOrEqualTo(Double value) {
            addCriterion("PC167 <=", value, "PC167");
            return (Criteria) this;
        }

        public Criteria andPC167In(List<Double> values) {
            addCriterion("PC167 in", values, "PC167");
            return (Criteria) this;
        }

        public Criteria andPC167NotIn(List<Double> values) {
            addCriterion("PC167 not in", values, "PC167");
            return (Criteria) this;
        }

        public Criteria andPC167Between(Double value1, Double value2) {
            addCriterion("PC167 between", value1, value2, "PC167");
            return (Criteria) this;
        }

        public Criteria andPC167NotBetween(Double value1, Double value2) {
            addCriterion("PC167 not between", value1, value2, "PC167");
            return (Criteria) this;
        }

        public Criteria andFI175IsNull() {
            addCriterion("FI175 is null");
            return (Criteria) this;
        }

        public Criteria andFI175IsNotNull() {
            addCriterion("FI175 is not null");
            return (Criteria) this;
        }

        public Criteria andFI175EqualTo(Double value) {
            addCriterion("FI175 =", value, "FI175");
            return (Criteria) this;
        }

        public Criteria andFI175NotEqualTo(Double value) {
            addCriterion("FI175 <>", value, "FI175");
            return (Criteria) this;
        }

        public Criteria andFI175GreaterThan(Double value) {
            addCriterion("FI175 >", value, "FI175");
            return (Criteria) this;
        }

        public Criteria andFI175GreaterThanOrEqualTo(Double value) {
            addCriterion("FI175 >=", value, "FI175");
            return (Criteria) this;
        }

        public Criteria andFI175LessThan(Double value) {
            addCriterion("FI175 <", value, "FI175");
            return (Criteria) this;
        }

        public Criteria andFI175LessThanOrEqualTo(Double value) {
            addCriterion("FI175 <=", value, "FI175");
            return (Criteria) this;
        }

        public Criteria andFI175In(List<Double> values) {
            addCriterion("FI175 in", values, "FI175");
            return (Criteria) this;
        }

        public Criteria andFI175NotIn(List<Double> values) {
            addCriterion("FI175 not in", values, "FI175");
            return (Criteria) this;
        }

        public Criteria andFI175Between(Double value1, Double value2) {
            addCriterion("FI175 between", value1, value2, "FI175");
            return (Criteria) this;
        }

        public Criteria andFI175NotBetween(Double value1, Double value2) {
            addCriterion("FI175 not between", value1, value2, "FI175");
            return (Criteria) this;
        }

        public Criteria andFI172IsNull() {
            addCriterion("FI172 is null");
            return (Criteria) this;
        }

        public Criteria andFI172IsNotNull() {
            addCriterion("FI172 is not null");
            return (Criteria) this;
        }

        public Criteria andFI172EqualTo(Double value) {
            addCriterion("FI172 =", value, "FI172");
            return (Criteria) this;
        }

        public Criteria andFI172NotEqualTo(Double value) {
            addCriterion("FI172 <>", value, "FI172");
            return (Criteria) this;
        }

        public Criteria andFI172GreaterThan(Double value) {
            addCriterion("FI172 >", value, "FI172");
            return (Criteria) this;
        }

        public Criteria andFI172GreaterThanOrEqualTo(Double value) {
            addCriterion("FI172 >=", value, "FI172");
            return (Criteria) this;
        }

        public Criteria andFI172LessThan(Double value) {
            addCriterion("FI172 <", value, "FI172");
            return (Criteria) this;
        }

        public Criteria andFI172LessThanOrEqualTo(Double value) {
            addCriterion("FI172 <=", value, "FI172");
            return (Criteria) this;
        }

        public Criteria andFI172In(List<Double> values) {
            addCriterion("FI172 in", values, "FI172");
            return (Criteria) this;
        }

        public Criteria andFI172NotIn(List<Double> values) {
            addCriterion("FI172 not in", values, "FI172");
            return (Criteria) this;
        }

        public Criteria andFI172Between(Double value1, Double value2) {
            addCriterion("FI172 between", value1, value2, "FI172");
            return (Criteria) this;
        }

        public Criteria andFI172NotBetween(Double value1, Double value2) {
            addCriterion("FI172 not between", value1, value2, "FI172");
            return (Criteria) this;
        }

        public Criteria andFC191IsNull() {
            addCriterion("FC191 is null");
            return (Criteria) this;
        }

        public Criteria andFC191IsNotNull() {
            addCriterion("FC191 is not null");
            return (Criteria) this;
        }

        public Criteria andFC191EqualTo(Double value) {
            addCriterion("FC191 =", value, "FC191");
            return (Criteria) this;
        }

        public Criteria andFC191NotEqualTo(Double value) {
            addCriterion("FC191 <>", value, "FC191");
            return (Criteria) this;
        }

        public Criteria andFC191GreaterThan(Double value) {
            addCriterion("FC191 >", value, "FC191");
            return (Criteria) this;
        }

        public Criteria andFC191GreaterThanOrEqualTo(Double value) {
            addCriterion("FC191 >=", value, "FC191");
            return (Criteria) this;
        }

        public Criteria andFC191LessThan(Double value) {
            addCriterion("FC191 <", value, "FC191");
            return (Criteria) this;
        }

        public Criteria andFC191LessThanOrEqualTo(Double value) {
            addCriterion("FC191 <=", value, "FC191");
            return (Criteria) this;
        }

        public Criteria andFC191In(List<Double> values) {
            addCriterion("FC191 in", values, "FC191");
            return (Criteria) this;
        }

        public Criteria andFC191NotIn(List<Double> values) {
            addCriterion("FC191 not in", values, "FC191");
            return (Criteria) this;
        }

        public Criteria andFC191Between(Double value1, Double value2) {
            addCriterion("FC191 between", value1, value2, "FC191");
            return (Criteria) this;
        }

        public Criteria andFC191NotBetween(Double value1, Double value2) {
            addCriterion("FC191 not between", value1, value2, "FC191");
            return (Criteria) this;
        }

        public Criteria andFC133IsNull() {
            addCriterion("FC133 is null");
            return (Criteria) this;
        }

        public Criteria andFC133IsNotNull() {
            addCriterion("FC133 is not null");
            return (Criteria) this;
        }

        public Criteria andFC133EqualTo(Double value) {
            addCriterion("FC133 =", value, "FC133");
            return (Criteria) this;
        }

        public Criteria andFC133NotEqualTo(Double value) {
            addCriterion("FC133 <>", value, "FC133");
            return (Criteria) this;
        }

        public Criteria andFC133GreaterThan(Double value) {
            addCriterion("FC133 >", value, "FC133");
            return (Criteria) this;
        }

        public Criteria andFC133GreaterThanOrEqualTo(Double value) {
            addCriterion("FC133 >=", value, "FC133");
            return (Criteria) this;
        }

        public Criteria andFC133LessThan(Double value) {
            addCriterion("FC133 <", value, "FC133");
            return (Criteria) this;
        }

        public Criteria andFC133LessThanOrEqualTo(Double value) {
            addCriterion("FC133 <=", value, "FC133");
            return (Criteria) this;
        }

        public Criteria andFC133In(List<Double> values) {
            addCriterion("FC133 in", values, "FC133");
            return (Criteria) this;
        }

        public Criteria andFC133NotIn(List<Double> values) {
            addCriterion("FC133 not in", values, "FC133");
            return (Criteria) this;
        }

        public Criteria andFC133Between(Double value1, Double value2) {
            addCriterion("FC133 between", value1, value2, "FC133");
            return (Criteria) this;
        }

        public Criteria andFC133NotBetween(Double value1, Double value2) {
            addCriterion("FC133 not between", value1, value2, "FC133");
            return (Criteria) this;
        }

        public Criteria andFI162IsNull() {
            addCriterion("FI162 is null");
            return (Criteria) this;
        }

        public Criteria andFI162IsNotNull() {
            addCriterion("FI162 is not null");
            return (Criteria) this;
        }

        public Criteria andFI162EqualTo(Double value) {
            addCriterion("FI162 =", value, "FI162");
            return (Criteria) this;
        }

        public Criteria andFI162NotEqualTo(Double value) {
            addCriterion("FI162 <>", value, "FI162");
            return (Criteria) this;
        }

        public Criteria andFI162GreaterThan(Double value) {
            addCriterion("FI162 >", value, "FI162");
            return (Criteria) this;
        }

        public Criteria andFI162GreaterThanOrEqualTo(Double value) {
            addCriterion("FI162 >=", value, "FI162");
            return (Criteria) this;
        }

        public Criteria andFI162LessThan(Double value) {
            addCriterion("FI162 <", value, "FI162");
            return (Criteria) this;
        }

        public Criteria andFI162LessThanOrEqualTo(Double value) {
            addCriterion("FI162 <=", value, "FI162");
            return (Criteria) this;
        }

        public Criteria andFI162In(List<Double> values) {
            addCriterion("FI162 in", values, "FI162");
            return (Criteria) this;
        }

        public Criteria andFI162NotIn(List<Double> values) {
            addCriterion("FI162 not in", values, "FI162");
            return (Criteria) this;
        }

        public Criteria andFI162Between(Double value1, Double value2) {
            addCriterion("FI162 between", value1, value2, "FI162");
            return (Criteria) this;
        }

        public Criteria andFI162NotBetween(Double value1, Double value2) {
            addCriterion("FI162 not between", value1, value2, "FI162");
            return (Criteria) this;
        }

        public Criteria andFI107IsNull() {
            addCriterion("FI107 is null");
            return (Criteria) this;
        }

        public Criteria andFI107IsNotNull() {
            addCriterion("FI107 is not null");
            return (Criteria) this;
        }

        public Criteria andFI107EqualTo(Double value) {
            addCriterion("FI107 =", value, "FI107");
            return (Criteria) this;
        }

        public Criteria andFI107NotEqualTo(Double value) {
            addCriterion("FI107 <>", value, "FI107");
            return (Criteria) this;
        }

        public Criteria andFI107GreaterThan(Double value) {
            addCriterion("FI107 >", value, "FI107");
            return (Criteria) this;
        }

        public Criteria andFI107GreaterThanOrEqualTo(Double value) {
            addCriterion("FI107 >=", value, "FI107");
            return (Criteria) this;
        }

        public Criteria andFI107LessThan(Double value) {
            addCriterion("FI107 <", value, "FI107");
            return (Criteria) this;
        }

        public Criteria andFI107LessThanOrEqualTo(Double value) {
            addCriterion("FI107 <=", value, "FI107");
            return (Criteria) this;
        }

        public Criteria andFI107In(List<Double> values) {
            addCriterion("FI107 in", values, "FI107");
            return (Criteria) this;
        }

        public Criteria andFI107NotIn(List<Double> values) {
            addCriterion("FI107 not in", values, "FI107");
            return (Criteria) this;
        }

        public Criteria andFI107Between(Double value1, Double value2) {
            addCriterion("FI107 between", value1, value2, "FI107");
            return (Criteria) this;
        }

        public Criteria andFI107NotBetween(Double value1, Double value2) {
            addCriterion("FI107 not between", value1, value2, "FI107");
            return (Criteria) this;
        }

        public Criteria andFI207IsNull() {
            addCriterion("FI207 is null");
            return (Criteria) this;
        }

        public Criteria andFI207IsNotNull() {
            addCriterion("FI207 is not null");
            return (Criteria) this;
        }

        public Criteria andFI207EqualTo(Double value) {
            addCriterion("FI207 =", value, "FI207");
            return (Criteria) this;
        }

        public Criteria andFI207NotEqualTo(Double value) {
            addCriterion("FI207 <>", value, "FI207");
            return (Criteria) this;
        }

        public Criteria andFI207GreaterThan(Double value) {
            addCriterion("FI207 >", value, "FI207");
            return (Criteria) this;
        }

        public Criteria andFI207GreaterThanOrEqualTo(Double value) {
            addCriterion("FI207 >=", value, "FI207");
            return (Criteria) this;
        }

        public Criteria andFI207LessThan(Double value) {
            addCriterion("FI207 <", value, "FI207");
            return (Criteria) this;
        }

        public Criteria andFI207LessThanOrEqualTo(Double value) {
            addCriterion("FI207 <=", value, "FI207");
            return (Criteria) this;
        }

        public Criteria andFI207In(List<Double> values) {
            addCriterion("FI207 in", values, "FI207");
            return (Criteria) this;
        }

        public Criteria andFI207NotIn(List<Double> values) {
            addCriterion("FI207 not in", values, "FI207");
            return (Criteria) this;
        }

        public Criteria andFI207Between(Double value1, Double value2) {
            addCriterion("FI207 between", value1, value2, "FI207");
            return (Criteria) this;
        }

        public Criteria andFI207NotBetween(Double value1, Double value2) {
            addCriterion("FI207 not between", value1, value2, "FI207");
            return (Criteria) this;
        }

        public Criteria andFI180IsNull() {
            addCriterion("FI180 is null");
            return (Criteria) this;
        }

        public Criteria andFI180IsNotNull() {
            addCriterion("FI180 is not null");
            return (Criteria) this;
        }

        public Criteria andFI180EqualTo(Double value) {
            addCriterion("FI180 =", value, "FI180");
            return (Criteria) this;
        }

        public Criteria andFI180NotEqualTo(Double value) {
            addCriterion("FI180 <>", value, "FI180");
            return (Criteria) this;
        }

        public Criteria andFI180GreaterThan(Double value) {
            addCriterion("FI180 >", value, "FI180");
            return (Criteria) this;
        }

        public Criteria andFI180GreaterThanOrEqualTo(Double value) {
            addCriterion("FI180 >=", value, "FI180");
            return (Criteria) this;
        }

        public Criteria andFI180LessThan(Double value) {
            addCriterion("FI180 <", value, "FI180");
            return (Criteria) this;
        }

        public Criteria andFI180LessThanOrEqualTo(Double value) {
            addCriterion("FI180 <=", value, "FI180");
            return (Criteria) this;
        }

        public Criteria andFI180In(List<Double> values) {
            addCriterion("FI180 in", values, "FI180");
            return (Criteria) this;
        }

        public Criteria andFI180NotIn(List<Double> values) {
            addCriterion("FI180 not in", values, "FI180");
            return (Criteria) this;
        }

        public Criteria andFI180Between(Double value1, Double value2) {
            addCriterion("FI180 between", value1, value2, "FI180");
            return (Criteria) this;
        }

        public Criteria andFI180NotBetween(Double value1, Double value2) {
            addCriterion("FI180 not between", value1, value2, "FI180");
            return (Criteria) this;
        }

        public Criteria andFI177IsNull() {
            addCriterion("FI177 is null");
            return (Criteria) this;
        }

        public Criteria andFI177IsNotNull() {
            addCriterion("FI177 is not null");
            return (Criteria) this;
        }

        public Criteria andFI177EqualTo(Double value) {
            addCriterion("FI177 =", value, "FI177");
            return (Criteria) this;
        }

        public Criteria andFI177NotEqualTo(Double value) {
            addCriterion("FI177 <>", value, "FI177");
            return (Criteria) this;
        }

        public Criteria andFI177GreaterThan(Double value) {
            addCriterion("FI177 >", value, "FI177");
            return (Criteria) this;
        }

        public Criteria andFI177GreaterThanOrEqualTo(Double value) {
            addCriterion("FI177 >=", value, "FI177");
            return (Criteria) this;
        }

        public Criteria andFI177LessThan(Double value) {
            addCriterion("FI177 <", value, "FI177");
            return (Criteria) this;
        }

        public Criteria andFI177LessThanOrEqualTo(Double value) {
            addCriterion("FI177 <=", value, "FI177");
            return (Criteria) this;
        }

        public Criteria andFI177In(List<Double> values) {
            addCriterion("FI177 in", values, "FI177");
            return (Criteria) this;
        }

        public Criteria andFI177NotIn(List<Double> values) {
            addCriterion("FI177 not in", values, "FI177");
            return (Criteria) this;
        }

        public Criteria andFI177Between(Double value1, Double value2) {
            addCriterion("FI177 between", value1, value2, "FI177");
            return (Criteria) this;
        }

        public Criteria andFI177NotBetween(Double value1, Double value2) {
            addCriterion("FI177 not between", value1, value2, "FI177");
            return (Criteria) this;
        }

        public Criteria andFI9005IsNull() {
            addCriterion("FI9005 is null");
            return (Criteria) this;
        }

        public Criteria andFI9005IsNotNull() {
            addCriterion("FI9005 is not null");
            return (Criteria) this;
        }

        public Criteria andFI9005EqualTo(Double value) {
            addCriterion("FI9005 =", value, "FI9005");
            return (Criteria) this;
        }

        public Criteria andFI9005NotEqualTo(Double value) {
            addCriterion("FI9005 <>", value, "FI9005");
            return (Criteria) this;
        }

        public Criteria andFI9005GreaterThan(Double value) {
            addCriterion("FI9005 >", value, "FI9005");
            return (Criteria) this;
        }

        public Criteria andFI9005GreaterThanOrEqualTo(Double value) {
            addCriterion("FI9005 >=", value, "FI9005");
            return (Criteria) this;
        }

        public Criteria andFI9005LessThan(Double value) {
            addCriterion("FI9005 <", value, "FI9005");
            return (Criteria) this;
        }

        public Criteria andFI9005LessThanOrEqualTo(Double value) {
            addCriterion("FI9005 <=", value, "FI9005");
            return (Criteria) this;
        }

        public Criteria andFI9005In(List<Double> values) {
            addCriterion("FI9005 in", values, "FI9005");
            return (Criteria) this;
        }

        public Criteria andFI9005NotIn(List<Double> values) {
            addCriterion("FI9005 not in", values, "FI9005");
            return (Criteria) this;
        }

        public Criteria andFI9005Between(Double value1, Double value2) {
            addCriterion("FI9005 between", value1, value2, "FI9005");
            return (Criteria) this;
        }

        public Criteria andFI9005NotBetween(Double value1, Double value2) {
            addCriterion("FI9005 not between", value1, value2, "FI9005");
            return (Criteria) this;
        }

        public Criteria andFI147IsNull() {
            addCriterion("FI147 is null");
            return (Criteria) this;
        }

        public Criteria andFI147IsNotNull() {
            addCriterion("FI147 is not null");
            return (Criteria) this;
        }

        public Criteria andFI147EqualTo(Double value) {
            addCriterion("FI147 =", value, "FI147");
            return (Criteria) this;
        }

        public Criteria andFI147NotEqualTo(Double value) {
            addCriterion("FI147 <>", value, "FI147");
            return (Criteria) this;
        }

        public Criteria andFI147GreaterThan(Double value) {
            addCriterion("FI147 >", value, "FI147");
            return (Criteria) this;
        }

        public Criteria andFI147GreaterThanOrEqualTo(Double value) {
            addCriterion("FI147 >=", value, "FI147");
            return (Criteria) this;
        }

        public Criteria andFI147LessThan(Double value) {
            addCriterion("FI147 <", value, "FI147");
            return (Criteria) this;
        }

        public Criteria andFI147LessThanOrEqualTo(Double value) {
            addCriterion("FI147 <=", value, "FI147");
            return (Criteria) this;
        }

        public Criteria andFI147In(List<Double> values) {
            addCriterion("FI147 in", values, "FI147");
            return (Criteria) this;
        }

        public Criteria andFI147NotIn(List<Double> values) {
            addCriterion("FI147 not in", values, "FI147");
            return (Criteria) this;
        }

        public Criteria andFI147Between(Double value1, Double value2) {
            addCriterion("FI147 between", value1, value2, "FI147");
            return (Criteria) this;
        }

        public Criteria andFI147NotBetween(Double value1, Double value2) {
            addCriterion("FI147 not between", value1, value2, "FI147");
            return (Criteria) this;
        }

        public Criteria andFI199IsNull() {
            addCriterion("FI199 is null");
            return (Criteria) this;
        }

        public Criteria andFI199IsNotNull() {
            addCriterion("FI199 is not null");
            return (Criteria) this;
        }

        public Criteria andFI199EqualTo(Double value) {
            addCriterion("FI199 =", value, "FI199");
            return (Criteria) this;
        }

        public Criteria andFI199NotEqualTo(Double value) {
            addCriterion("FI199 <>", value, "FI199");
            return (Criteria) this;
        }

        public Criteria andFI199GreaterThan(Double value) {
            addCriterion("FI199 >", value, "FI199");
            return (Criteria) this;
        }

        public Criteria andFI199GreaterThanOrEqualTo(Double value) {
            addCriterion("FI199 >=", value, "FI199");
            return (Criteria) this;
        }

        public Criteria andFI199LessThan(Double value) {
            addCriterion("FI199 <", value, "FI199");
            return (Criteria) this;
        }

        public Criteria andFI199LessThanOrEqualTo(Double value) {
            addCriterion("FI199 <=", value, "FI199");
            return (Criteria) this;
        }

        public Criteria andFI199In(List<Double> values) {
            addCriterion("FI199 in", values, "FI199");
            return (Criteria) this;
        }

        public Criteria andFI199NotIn(List<Double> values) {
            addCriterion("FI199 not in", values, "FI199");
            return (Criteria) this;
        }

        public Criteria andFI199Between(Double value1, Double value2) {
            addCriterion("FI199 between", value1, value2, "FI199");
            return (Criteria) this;
        }

        public Criteria andFI199NotBetween(Double value1, Double value2) {
            addCriterion("FI199 not between", value1, value2, "FI199");
            return (Criteria) this;
        }

        public Criteria andTI106IsNull() {
            addCriterion("TI106 is null");
            return (Criteria) this;
        }

        public Criteria andTI106IsNotNull() {
            addCriterion("TI106 is not null");
            return (Criteria) this;
        }

        public Criteria andTI106EqualTo(Double value) {
            addCriterion("TI106 =", value, "TI106");
            return (Criteria) this;
        }

        public Criteria andTI106NotEqualTo(Double value) {
            addCriterion("TI106 <>", value, "TI106");
            return (Criteria) this;
        }

        public Criteria andTI106GreaterThan(Double value) {
            addCriterion("TI106 >", value, "TI106");
            return (Criteria) this;
        }

        public Criteria andTI106GreaterThanOrEqualTo(Double value) {
            addCriterion("TI106 >=", value, "TI106");
            return (Criteria) this;
        }

        public Criteria andTI106LessThan(Double value) {
            addCriterion("TI106 <", value, "TI106");
            return (Criteria) this;
        }

        public Criteria andTI106LessThanOrEqualTo(Double value) {
            addCriterion("TI106 <=", value, "TI106");
            return (Criteria) this;
        }

        public Criteria andTI106In(List<Double> values) {
            addCriterion("TI106 in", values, "TI106");
            return (Criteria) this;
        }

        public Criteria andTI106NotIn(List<Double> values) {
            addCriterion("TI106 not in", values, "TI106");
            return (Criteria) this;
        }

        public Criteria andTI106Between(Double value1, Double value2) {
            addCriterion("TI106 between", value1, value2, "TI106");
            return (Criteria) this;
        }

        public Criteria andTI106NotBetween(Double value1, Double value2) {
            addCriterion("TI106 not between", value1, value2, "TI106");
            return (Criteria) this;
        }

        public Criteria andTI240IsNull() {
            addCriterion("TI240 is null");
            return (Criteria) this;
        }

        public Criteria andTI240IsNotNull() {
            addCriterion("TI240 is not null");
            return (Criteria) this;
        }

        public Criteria andTI240EqualTo(Double value) {
            addCriterion("TI240 =", value, "TI240");
            return (Criteria) this;
        }

        public Criteria andTI240NotEqualTo(Double value) {
            addCriterion("TI240 <>", value, "TI240");
            return (Criteria) this;
        }

        public Criteria andTI240GreaterThan(Double value) {
            addCriterion("TI240 >", value, "TI240");
            return (Criteria) this;
        }

        public Criteria andTI240GreaterThanOrEqualTo(Double value) {
            addCriterion("TI240 >=", value, "TI240");
            return (Criteria) this;
        }

        public Criteria andTI240LessThan(Double value) {
            addCriterion("TI240 <", value, "TI240");
            return (Criteria) this;
        }

        public Criteria andTI240LessThanOrEqualTo(Double value) {
            addCriterion("TI240 <=", value, "TI240");
            return (Criteria) this;
        }

        public Criteria andTI240In(List<Double> values) {
            addCriterion("TI240 in", values, "TI240");
            return (Criteria) this;
        }

        public Criteria andTI240NotIn(List<Double> values) {
            addCriterion("TI240 not in", values, "TI240");
            return (Criteria) this;
        }

        public Criteria andTI240Between(Double value1, Double value2) {
            addCriterion("TI240 between", value1, value2, "TI240");
            return (Criteria) this;
        }

        public Criteria andTI240NotBetween(Double value1, Double value2) {
            addCriterion("TI240 not between", value1, value2, "TI240");
            return (Criteria) this;
        }

        public Criteria andTI107IsNull() {
            addCriterion("TI107 is null");
            return (Criteria) this;
        }

        public Criteria andTI107IsNotNull() {
            addCriterion("TI107 is not null");
            return (Criteria) this;
        }

        public Criteria andTI107EqualTo(Double value) {
            addCriterion("TI107 =", value, "TI107");
            return (Criteria) this;
        }

        public Criteria andTI107NotEqualTo(Double value) {
            addCriterion("TI107 <>", value, "TI107");
            return (Criteria) this;
        }

        public Criteria andTI107GreaterThan(Double value) {
            addCriterion("TI107 >", value, "TI107");
            return (Criteria) this;
        }

        public Criteria andTI107GreaterThanOrEqualTo(Double value) {
            addCriterion("TI107 >=", value, "TI107");
            return (Criteria) this;
        }

        public Criteria andTI107LessThan(Double value) {
            addCriterion("TI107 <", value, "TI107");
            return (Criteria) this;
        }

        public Criteria andTI107LessThanOrEqualTo(Double value) {
            addCriterion("TI107 <=", value, "TI107");
            return (Criteria) this;
        }

        public Criteria andTI107In(List<Double> values) {
            addCriterion("TI107 in", values, "TI107");
            return (Criteria) this;
        }

        public Criteria andTI107NotIn(List<Double> values) {
            addCriterion("TI107 not in", values, "TI107");
            return (Criteria) this;
        }

        public Criteria andTI107Between(Double value1, Double value2) {
            addCriterion("TI107 between", value1, value2, "TI107");
            return (Criteria) this;
        }

        public Criteria andTI107NotBetween(Double value1, Double value2) {
            addCriterion("TI107 not between", value1, value2, "TI107");
            return (Criteria) this;
        }

        public Criteria andTI124IsNull() {
            addCriterion("TI124 is null");
            return (Criteria) this;
        }

        public Criteria andTI124IsNotNull() {
            addCriterion("TI124 is not null");
            return (Criteria) this;
        }

        public Criteria andTI124EqualTo(Double value) {
            addCriterion("TI124 =", value, "TI124");
            return (Criteria) this;
        }

        public Criteria andTI124NotEqualTo(Double value) {
            addCriterion("TI124 <>", value, "TI124");
            return (Criteria) this;
        }

        public Criteria andTI124GreaterThan(Double value) {
            addCriterion("TI124 >", value, "TI124");
            return (Criteria) this;
        }

        public Criteria andTI124GreaterThanOrEqualTo(Double value) {
            addCriterion("TI124 >=", value, "TI124");
            return (Criteria) this;
        }

        public Criteria andTI124LessThan(Double value) {
            addCriterion("TI124 <", value, "TI124");
            return (Criteria) this;
        }

        public Criteria andTI124LessThanOrEqualTo(Double value) {
            addCriterion("TI124 <=", value, "TI124");
            return (Criteria) this;
        }

        public Criteria andTI124In(List<Double> values) {
            addCriterion("TI124 in", values, "TI124");
            return (Criteria) this;
        }

        public Criteria andTI124NotIn(List<Double> values) {
            addCriterion("TI124 not in", values, "TI124");
            return (Criteria) this;
        }

        public Criteria andTI124Between(Double value1, Double value2) {
            addCriterion("TI124 between", value1, value2, "TI124");
            return (Criteria) this;
        }

        public Criteria andTI124NotBetween(Double value1, Double value2) {
            addCriterion("TI124 not between", value1, value2, "TI124");
            return (Criteria) this;
        }

        public Criteria andTI262IsNull() {
            addCriterion("TI262 is null");
            return (Criteria) this;
        }

        public Criteria andTI262IsNotNull() {
            addCriterion("TI262 is not null");
            return (Criteria) this;
        }

        public Criteria andTI262EqualTo(Double value) {
            addCriterion("TI262 =", value, "TI262");
            return (Criteria) this;
        }

        public Criteria andTI262NotEqualTo(Double value) {
            addCriterion("TI262 <>", value, "TI262");
            return (Criteria) this;
        }

        public Criteria andTI262GreaterThan(Double value) {
            addCriterion("TI262 >", value, "TI262");
            return (Criteria) this;
        }

        public Criteria andTI262GreaterThanOrEqualTo(Double value) {
            addCriterion("TI262 >=", value, "TI262");
            return (Criteria) this;
        }

        public Criteria andTI262LessThan(Double value) {
            addCriterion("TI262 <", value, "TI262");
            return (Criteria) this;
        }

        public Criteria andTI262LessThanOrEqualTo(Double value) {
            addCriterion("TI262 <=", value, "TI262");
            return (Criteria) this;
        }

        public Criteria andTI262In(List<Double> values) {
            addCriterion("TI262 in", values, "TI262");
            return (Criteria) this;
        }

        public Criteria andTI262NotIn(List<Double> values) {
            addCriterion("TI262 not in", values, "TI262");
            return (Criteria) this;
        }

        public Criteria andTI262Between(Double value1, Double value2) {
            addCriterion("TI262 between", value1, value2, "TI262");
            return (Criteria) this;
        }

        public Criteria andTI262NotBetween(Double value1, Double value2) {
            addCriterion("TI262 not between", value1, value2, "TI262");
            return (Criteria) this;
        }

        public Criteria andTI125IsNull() {
            addCriterion("TI125 is null");
            return (Criteria) this;
        }

        public Criteria andTI125IsNotNull() {
            addCriterion("TI125 is not null");
            return (Criteria) this;
        }

        public Criteria andTI125EqualTo(Double value) {
            addCriterion("TI125 =", value, "TI125");
            return (Criteria) this;
        }

        public Criteria andTI125NotEqualTo(Double value) {
            addCriterion("TI125 <>", value, "TI125");
            return (Criteria) this;
        }

        public Criteria andTI125GreaterThan(Double value) {
            addCriterion("TI125 >", value, "TI125");
            return (Criteria) this;
        }

        public Criteria andTI125GreaterThanOrEqualTo(Double value) {
            addCriterion("TI125 >=", value, "TI125");
            return (Criteria) this;
        }

        public Criteria andTI125LessThan(Double value) {
            addCriterion("TI125 <", value, "TI125");
            return (Criteria) this;
        }

        public Criteria andTI125LessThanOrEqualTo(Double value) {
            addCriterion("TI125 <=", value, "TI125");
            return (Criteria) this;
        }

        public Criteria andTI125In(List<Double> values) {
            addCriterion("TI125 in", values, "TI125");
            return (Criteria) this;
        }

        public Criteria andTI125NotIn(List<Double> values) {
            addCriterion("TI125 not in", values, "TI125");
            return (Criteria) this;
        }

        public Criteria andTI125Between(Double value1, Double value2) {
            addCriterion("TI125 between", value1, value2, "TI125");
            return (Criteria) this;
        }

        public Criteria andTI125NotBetween(Double value1, Double value2) {
            addCriterion("TI125 not between", value1, value2, "TI125");
            return (Criteria) this;
        }

        public Criteria andTI132IsNull() {
            addCriterion("TI132 is null");
            return (Criteria) this;
        }

        public Criteria andTI132IsNotNull() {
            addCriterion("TI132 is not null");
            return (Criteria) this;
        }

        public Criteria andTI132EqualTo(Double value) {
            addCriterion("TI132 =", value, "TI132");
            return (Criteria) this;
        }

        public Criteria andTI132NotEqualTo(Double value) {
            addCriterion("TI132 <>", value, "TI132");
            return (Criteria) this;
        }

        public Criteria andTI132GreaterThan(Double value) {
            addCriterion("TI132 >", value, "TI132");
            return (Criteria) this;
        }

        public Criteria andTI132GreaterThanOrEqualTo(Double value) {
            addCriterion("TI132 >=", value, "TI132");
            return (Criteria) this;
        }

        public Criteria andTI132LessThan(Double value) {
            addCriterion("TI132 <", value, "TI132");
            return (Criteria) this;
        }

        public Criteria andTI132LessThanOrEqualTo(Double value) {
            addCriterion("TI132 <=", value, "TI132");
            return (Criteria) this;
        }

        public Criteria andTI132In(List<Double> values) {
            addCriterion("TI132 in", values, "TI132");
            return (Criteria) this;
        }

        public Criteria andTI132NotIn(List<Double> values) {
            addCriterion("TI132 not in", values, "TI132");
            return (Criteria) this;
        }

        public Criteria andTI132Between(Double value1, Double value2) {
            addCriterion("TI132 between", value1, value2, "TI132");
            return (Criteria) this;
        }

        public Criteria andTI132NotBetween(Double value1, Double value2) {
            addCriterion("TI132 not between", value1, value2, "TI132");
            return (Criteria) this;
        }

        public Criteria andTC127IsNull() {
            addCriterion("TC127 is null");
            return (Criteria) this;
        }

        public Criteria andTC127IsNotNull() {
            addCriterion("TC127 is not null");
            return (Criteria) this;
        }

        public Criteria andTC127EqualTo(Double value) {
            addCriterion("TC127 =", value, "TC127");
            return (Criteria) this;
        }

        public Criteria andTC127NotEqualTo(Double value) {
            addCriterion("TC127 <>", value, "TC127");
            return (Criteria) this;
        }

        public Criteria andTC127GreaterThan(Double value) {
            addCriterion("TC127 >", value, "TC127");
            return (Criteria) this;
        }

        public Criteria andTC127GreaterThanOrEqualTo(Double value) {
            addCriterion("TC127 >=", value, "TC127");
            return (Criteria) this;
        }

        public Criteria andTC127LessThan(Double value) {
            addCriterion("TC127 <", value, "TC127");
            return (Criteria) this;
        }

        public Criteria andTC127LessThanOrEqualTo(Double value) {
            addCriterion("TC127 <=", value, "TC127");
            return (Criteria) this;
        }

        public Criteria andTC127In(List<Double> values) {
            addCriterion("TC127 in", values, "TC127");
            return (Criteria) this;
        }

        public Criteria andTC127NotIn(List<Double> values) {
            addCriterion("TC127 not in", values, "TC127");
            return (Criteria) this;
        }

        public Criteria andTC127Between(Double value1, Double value2) {
            addCriterion("TC127 between", value1, value2, "TC127");
            return (Criteria) this;
        }

        public Criteria andTC127NotBetween(Double value1, Double value2) {
            addCriterion("TC127 not between", value1, value2, "TC127");
            return (Criteria) this;
        }

        public Criteria andTI137IsNull() {
            addCriterion("TI137 is null");
            return (Criteria) this;
        }

        public Criteria andTI137IsNotNull() {
            addCriterion("TI137 is not null");
            return (Criteria) this;
        }

        public Criteria andTI137EqualTo(Double value) {
            addCriterion("TI137 =", value, "TI137");
            return (Criteria) this;
        }

        public Criteria andTI137NotEqualTo(Double value) {
            addCriterion("TI137 <>", value, "TI137");
            return (Criteria) this;
        }

        public Criteria andTI137GreaterThan(Double value) {
            addCriterion("TI137 >", value, "TI137");
            return (Criteria) this;
        }

        public Criteria andTI137GreaterThanOrEqualTo(Double value) {
            addCriterion("TI137 >=", value, "TI137");
            return (Criteria) this;
        }

        public Criteria andTI137LessThan(Double value) {
            addCriterion("TI137 <", value, "TI137");
            return (Criteria) this;
        }

        public Criteria andTI137LessThanOrEqualTo(Double value) {
            addCriterion("TI137 <=", value, "TI137");
            return (Criteria) this;
        }

        public Criteria andTI137In(List<Double> values) {
            addCriterion("TI137 in", values, "TI137");
            return (Criteria) this;
        }

        public Criteria andTI137NotIn(List<Double> values) {
            addCriterion("TI137 not in", values, "TI137");
            return (Criteria) this;
        }

        public Criteria andTI137Between(Double value1, Double value2) {
            addCriterion("TI137 between", value1, value2, "TI137");
            return (Criteria) this;
        }

        public Criteria andTI137NotBetween(Double value1, Double value2) {
            addCriterion("TI137 not between", value1, value2, "TI137");
            return (Criteria) this;
        }

        public Criteria andTI153IsNull() {
            addCriterion("TI153 is null");
            return (Criteria) this;
        }

        public Criteria andTI153IsNotNull() {
            addCriterion("TI153 is not null");
            return (Criteria) this;
        }

        public Criteria andTI153EqualTo(Double value) {
            addCriterion("TI153 =", value, "TI153");
            return (Criteria) this;
        }

        public Criteria andTI153NotEqualTo(Double value) {
            addCriterion("TI153 <>", value, "TI153");
            return (Criteria) this;
        }

        public Criteria andTI153GreaterThan(Double value) {
            addCriterion("TI153 >", value, "TI153");
            return (Criteria) this;
        }

        public Criteria andTI153GreaterThanOrEqualTo(Double value) {
            addCriterion("TI153 >=", value, "TI153");
            return (Criteria) this;
        }

        public Criteria andTI153LessThan(Double value) {
            addCriterion("TI153 <", value, "TI153");
            return (Criteria) this;
        }

        public Criteria andTI153LessThanOrEqualTo(Double value) {
            addCriterion("TI153 <=", value, "TI153");
            return (Criteria) this;
        }

        public Criteria andTI153In(List<Double> values) {
            addCriterion("TI153 in", values, "TI153");
            return (Criteria) this;
        }

        public Criteria andTI153NotIn(List<Double> values) {
            addCriterion("TI153 not in", values, "TI153");
            return (Criteria) this;
        }

        public Criteria andTI153Between(Double value1, Double value2) {
            addCriterion("TI153 between", value1, value2, "TI153");
            return (Criteria) this;
        }

        public Criteria andTI153NotBetween(Double value1, Double value2) {
            addCriterion("TI153 not between", value1, value2, "TI153");
            return (Criteria) this;
        }

        public Criteria andTI154IsNull() {
            addCriterion("TI154 is null");
            return (Criteria) this;
        }

        public Criteria andTI154IsNotNull() {
            addCriterion("TI154 is not null");
            return (Criteria) this;
        }

        public Criteria andTI154EqualTo(Double value) {
            addCriterion("TI154 =", value, "TI154");
            return (Criteria) this;
        }

        public Criteria andTI154NotEqualTo(Double value) {
            addCriterion("TI154 <>", value, "TI154");
            return (Criteria) this;
        }

        public Criteria andTI154GreaterThan(Double value) {
            addCriterion("TI154 >", value, "TI154");
            return (Criteria) this;
        }

        public Criteria andTI154GreaterThanOrEqualTo(Double value) {
            addCriterion("TI154 >=", value, "TI154");
            return (Criteria) this;
        }

        public Criteria andTI154LessThan(Double value) {
            addCriterion("TI154 <", value, "TI154");
            return (Criteria) this;
        }

        public Criteria andTI154LessThanOrEqualTo(Double value) {
            addCriterion("TI154 <=", value, "TI154");
            return (Criteria) this;
        }

        public Criteria andTI154In(List<Double> values) {
            addCriterion("TI154 in", values, "TI154");
            return (Criteria) this;
        }

        public Criteria andTI154NotIn(List<Double> values) {
            addCriterion("TI154 not in", values, "TI154");
            return (Criteria) this;
        }

        public Criteria andTI154Between(Double value1, Double value2) {
            addCriterion("TI154 between", value1, value2, "TI154");
            return (Criteria) this;
        }

        public Criteria andTI154NotBetween(Double value1, Double value2) {
            addCriterion("TI154 not between", value1, value2, "TI154");
            return (Criteria) this;
        }

        public Criteria andTI274IsNull() {
            addCriterion("TI274 is null");
            return (Criteria) this;
        }

        public Criteria andTI274IsNotNull() {
            addCriterion("TI274 is not null");
            return (Criteria) this;
        }

        public Criteria andTI274EqualTo(Double value) {
            addCriterion("TI274 =", value, "TI274");
            return (Criteria) this;
        }

        public Criteria andTI274NotEqualTo(Double value) {
            addCriterion("TI274 <>", value, "TI274");
            return (Criteria) this;
        }

        public Criteria andTI274GreaterThan(Double value) {
            addCriterion("TI274 >", value, "TI274");
            return (Criteria) this;
        }

        public Criteria andTI274GreaterThanOrEqualTo(Double value) {
            addCriterion("TI274 >=", value, "TI274");
            return (Criteria) this;
        }

        public Criteria andTI274LessThan(Double value) {
            addCriterion("TI274 <", value, "TI274");
            return (Criteria) this;
        }

        public Criteria andTI274LessThanOrEqualTo(Double value) {
            addCriterion("TI274 <=", value, "TI274");
            return (Criteria) this;
        }

        public Criteria andTI274In(List<Double> values) {
            addCriterion("TI274 in", values, "TI274");
            return (Criteria) this;
        }

        public Criteria andTI274NotIn(List<Double> values) {
            addCriterion("TI274 not in", values, "TI274");
            return (Criteria) this;
        }

        public Criteria andTI274Between(Double value1, Double value2) {
            addCriterion("TI274 between", value1, value2, "TI274");
            return (Criteria) this;
        }

        public Criteria andTI274NotBetween(Double value1, Double value2) {
            addCriterion("TI274 not between", value1, value2, "TI274");
            return (Criteria) this;
        }

        public Criteria andTI275IsNull() {
            addCriterion("TI275 is null");
            return (Criteria) this;
        }

        public Criteria andTI275IsNotNull() {
            addCriterion("TI275 is not null");
            return (Criteria) this;
        }

        public Criteria andTI275EqualTo(Double value) {
            addCriterion("TI275 =", value, "TI275");
            return (Criteria) this;
        }

        public Criteria andTI275NotEqualTo(Double value) {
            addCriterion("TI275 <>", value, "TI275");
            return (Criteria) this;
        }

        public Criteria andTI275GreaterThan(Double value) {
            addCriterion("TI275 >", value, "TI275");
            return (Criteria) this;
        }

        public Criteria andTI275GreaterThanOrEqualTo(Double value) {
            addCriterion("TI275 >=", value, "TI275");
            return (Criteria) this;
        }

        public Criteria andTI275LessThan(Double value) {
            addCriterion("TI275 <", value, "TI275");
            return (Criteria) this;
        }

        public Criteria andTI275LessThanOrEqualTo(Double value) {
            addCriterion("TI275 <=", value, "TI275");
            return (Criteria) this;
        }

        public Criteria andTI275In(List<Double> values) {
            addCriterion("TI275 in", values, "TI275");
            return (Criteria) this;
        }

        public Criteria andTI275NotIn(List<Double> values) {
            addCriterion("TI275 not in", values, "TI275");
            return (Criteria) this;
        }

        public Criteria andTI275Between(Double value1, Double value2) {
            addCriterion("TI275 between", value1, value2, "TI275");
            return (Criteria) this;
        }

        public Criteria andTI275NotBetween(Double value1, Double value2) {
            addCriterion("TI275 not between", value1, value2, "TI275");
            return (Criteria) this;
        }

        public Criteria andPI176IsNull() {
            addCriterion("PI176 is null");
            return (Criteria) this;
        }

        public Criteria andPI176IsNotNull() {
            addCriterion("PI176 is not null");
            return (Criteria) this;
        }

        public Criteria andPI176EqualTo(Double value) {
            addCriterion("PI176 =", value, "PI176");
            return (Criteria) this;
        }

        public Criteria andPI176NotEqualTo(Double value) {
            addCriterion("PI176 <>", value, "PI176");
            return (Criteria) this;
        }

        public Criteria andPI176GreaterThan(Double value) {
            addCriterion("PI176 >", value, "PI176");
            return (Criteria) this;
        }

        public Criteria andPI176GreaterThanOrEqualTo(Double value) {
            addCriterion("PI176 >=", value, "PI176");
            return (Criteria) this;
        }

        public Criteria andPI176LessThan(Double value) {
            addCriterion("PI176 <", value, "PI176");
            return (Criteria) this;
        }

        public Criteria andPI176LessThanOrEqualTo(Double value) {
            addCriterion("PI176 <=", value, "PI176");
            return (Criteria) this;
        }

        public Criteria andPI176In(List<Double> values) {
            addCriterion("PI176 in", values, "PI176");
            return (Criteria) this;
        }

        public Criteria andPI176NotIn(List<Double> values) {
            addCriterion("PI176 not in", values, "PI176");
            return (Criteria) this;
        }

        public Criteria andPI176Between(Double value1, Double value2) {
            addCriterion("PI176 between", value1, value2, "PI176");
            return (Criteria) this;
        }

        public Criteria andPI176NotBetween(Double value1, Double value2) {
            addCriterion("PI176 not between", value1, value2, "PI176");
            return (Criteria) this;
        }

        public Criteria andPI100IsNull() {
            addCriterion("PI100 is null");
            return (Criteria) this;
        }

        public Criteria andPI100IsNotNull() {
            addCriterion("PI100 is not null");
            return (Criteria) this;
        }

        public Criteria andPI100EqualTo(Double value) {
            addCriterion("PI100 =", value, "PI100");
            return (Criteria) this;
        }

        public Criteria andPI100NotEqualTo(Double value) {
            addCriterion("PI100 <>", value, "PI100");
            return (Criteria) this;
        }

        public Criteria andPI100GreaterThan(Double value) {
            addCriterion("PI100 >", value, "PI100");
            return (Criteria) this;
        }

        public Criteria andPI100GreaterThanOrEqualTo(Double value) {
            addCriterion("PI100 >=", value, "PI100");
            return (Criteria) this;
        }

        public Criteria andPI100LessThan(Double value) {
            addCriterion("PI100 <", value, "PI100");
            return (Criteria) this;
        }

        public Criteria andPI100LessThanOrEqualTo(Double value) {
            addCriterion("PI100 <=", value, "PI100");
            return (Criteria) this;
        }

        public Criteria andPI100In(List<Double> values) {
            addCriterion("PI100 in", values, "PI100");
            return (Criteria) this;
        }

        public Criteria andPI100NotIn(List<Double> values) {
            addCriterion("PI100 not in", values, "PI100");
            return (Criteria) this;
        }

        public Criteria andPI100Between(Double value1, Double value2) {
            addCriterion("PI100 between", value1, value2, "PI100");
            return (Criteria) this;
        }

        public Criteria andPI100NotBetween(Double value1, Double value2) {
            addCriterion("PI100 not between", value1, value2, "PI100");
            return (Criteria) this;
        }

        public Criteria andPI109AIsNull() {
            addCriterion("PI109A is null");
            return (Criteria) this;
        }

        public Criteria andPI109AIsNotNull() {
            addCriterion("PI109A is not null");
            return (Criteria) this;
        }

        public Criteria andPI109AEqualTo(Double value) {
            addCriterion("PI109A =", value, "PI109A");
            return (Criteria) this;
        }

        public Criteria andPI109ANotEqualTo(Double value) {
            addCriterion("PI109A <>", value, "PI109A");
            return (Criteria) this;
        }

        public Criteria andPI109AGreaterThan(Double value) {
            addCriterion("PI109A >", value, "PI109A");
            return (Criteria) this;
        }

        public Criteria andPI109AGreaterThanOrEqualTo(Double value) {
            addCriterion("PI109A >=", value, "PI109A");
            return (Criteria) this;
        }

        public Criteria andPI109ALessThan(Double value) {
            addCriterion("PI109A <", value, "PI109A");
            return (Criteria) this;
        }

        public Criteria andPI109ALessThanOrEqualTo(Double value) {
            addCriterion("PI109A <=", value, "PI109A");
            return (Criteria) this;
        }

        public Criteria andPI109AIn(List<Double> values) {
            addCriterion("PI109A in", values, "PI109A");
            return (Criteria) this;
        }

        public Criteria andPI109ANotIn(List<Double> values) {
            addCriterion("PI109A not in", values, "PI109A");
            return (Criteria) this;
        }

        public Criteria andPI109ABetween(Double value1, Double value2) {
            addCriterion("PI109A between", value1, value2, "PI109A");
            return (Criteria) this;
        }

        public Criteria andPI109ANotBetween(Double value1, Double value2) {
            addCriterion("PI109A not between", value1, value2, "PI109A");
            return (Criteria) this;
        }

        public Criteria andPC117IsNull() {
            addCriterion("PC117 is null");
            return (Criteria) this;
        }

        public Criteria andPC117IsNotNull() {
            addCriterion("PC117 is not null");
            return (Criteria) this;
        }

        public Criteria andPC117EqualTo(Double value) {
            addCriterion("PC117 =", value, "PC117");
            return (Criteria) this;
        }

        public Criteria andPC117NotEqualTo(Double value) {
            addCriterion("PC117 <>", value, "PC117");
            return (Criteria) this;
        }

        public Criteria andPC117GreaterThan(Double value) {
            addCriterion("PC117 >", value, "PC117");
            return (Criteria) this;
        }

        public Criteria andPC117GreaterThanOrEqualTo(Double value) {
            addCriterion("PC117 >=", value, "PC117");
            return (Criteria) this;
        }

        public Criteria andPC117LessThan(Double value) {
            addCriterion("PC117 <", value, "PC117");
            return (Criteria) this;
        }

        public Criteria andPC117LessThanOrEqualTo(Double value) {
            addCriterion("PC117 <=", value, "PC117");
            return (Criteria) this;
        }

        public Criteria andPC117In(List<Double> values) {
            addCriterion("PC117 in", values, "PC117");
            return (Criteria) this;
        }

        public Criteria andPC117NotIn(List<Double> values) {
            addCriterion("PC117 not in", values, "PC117");
            return (Criteria) this;
        }

        public Criteria andPC117Between(Double value1, Double value2) {
            addCriterion("PC117 between", value1, value2, "PC117");
            return (Criteria) this;
        }

        public Criteria andPC117NotBetween(Double value1, Double value2) {
            addCriterion("PC117 not between", value1, value2, "PC117");
            return (Criteria) this;
        }

        public Criteria andPC123IsNull() {
            addCriterion("PC123 is null");
            return (Criteria) this;
        }

        public Criteria andPC123IsNotNull() {
            addCriterion("PC123 is not null");
            return (Criteria) this;
        }

        public Criteria andPC123EqualTo(Double value) {
            addCriterion("PC123 =", value, "PC123");
            return (Criteria) this;
        }

        public Criteria andPC123NotEqualTo(Double value) {
            addCriterion("PC123 <>", value, "PC123");
            return (Criteria) this;
        }

        public Criteria andPC123GreaterThan(Double value) {
            addCriterion("PC123 >", value, "PC123");
            return (Criteria) this;
        }

        public Criteria andPC123GreaterThanOrEqualTo(Double value) {
            addCriterion("PC123 >=", value, "PC123");
            return (Criteria) this;
        }

        public Criteria andPC123LessThan(Double value) {
            addCriterion("PC123 <", value, "PC123");
            return (Criteria) this;
        }

        public Criteria andPC123LessThanOrEqualTo(Double value) {
            addCriterion("PC123 <=", value, "PC123");
            return (Criteria) this;
        }

        public Criteria andPC123In(List<Double> values) {
            addCriterion("PC123 in", values, "PC123");
            return (Criteria) this;
        }

        public Criteria andPC123NotIn(List<Double> values) {
            addCriterion("PC123 not in", values, "PC123");
            return (Criteria) this;
        }

        public Criteria andPC123Between(Double value1, Double value2) {
            addCriterion("PC123 between", value1, value2, "PC123");
            return (Criteria) this;
        }

        public Criteria andPC123NotBetween(Double value1, Double value2) {
            addCriterion("PC123 not between", value1, value2, "PC123");
            return (Criteria) this;
        }

        public Criteria andPI142IsNull() {
            addCriterion("PI142 is null");
            return (Criteria) this;
        }

        public Criteria andPI142IsNotNull() {
            addCriterion("PI142 is not null");
            return (Criteria) this;
        }

        public Criteria andPI142EqualTo(Double value) {
            addCriterion("PI142 =", value, "PI142");
            return (Criteria) this;
        }

        public Criteria andPI142NotEqualTo(Double value) {
            addCriterion("PI142 <>", value, "PI142");
            return (Criteria) this;
        }

        public Criteria andPI142GreaterThan(Double value) {
            addCriterion("PI142 >", value, "PI142");
            return (Criteria) this;
        }

        public Criteria andPI142GreaterThanOrEqualTo(Double value) {
            addCriterion("PI142 >=", value, "PI142");
            return (Criteria) this;
        }

        public Criteria andPI142LessThan(Double value) {
            addCriterion("PI142 <", value, "PI142");
            return (Criteria) this;
        }

        public Criteria andPI142LessThanOrEqualTo(Double value) {
            addCriterion("PI142 <=", value, "PI142");
            return (Criteria) this;
        }

        public Criteria andPI142In(List<Double> values) {
            addCriterion("PI142 in", values, "PI142");
            return (Criteria) this;
        }

        public Criteria andPI142NotIn(List<Double> values) {
            addCriterion("PI142 not in", values, "PI142");
            return (Criteria) this;
        }

        public Criteria andPI142Between(Double value1, Double value2) {
            addCriterion("PI142 between", value1, value2, "PI142");
            return (Criteria) this;
        }

        public Criteria andPI142NotBetween(Double value1, Double value2) {
            addCriterion("PI142 not between", value1, value2, "PI142");
            return (Criteria) this;
        }

        public Criteria andPI182AIsNull() {
            addCriterion("PI182A is null");
            return (Criteria) this;
        }

        public Criteria andPI182AIsNotNull() {
            addCriterion("PI182A is not null");
            return (Criteria) this;
        }

        public Criteria andPI182AEqualTo(Double value) {
            addCriterion("PI182A =", value, "PI182A");
            return (Criteria) this;
        }

        public Criteria andPI182ANotEqualTo(Double value) {
            addCriterion("PI182A <>", value, "PI182A");
            return (Criteria) this;
        }

        public Criteria andPI182AGreaterThan(Double value) {
            addCriterion("PI182A >", value, "PI182A");
            return (Criteria) this;
        }

        public Criteria andPI182AGreaterThanOrEqualTo(Double value) {
            addCriterion("PI182A >=", value, "PI182A");
            return (Criteria) this;
        }

        public Criteria andPI182ALessThan(Double value) {
            addCriterion("PI182A <", value, "PI182A");
            return (Criteria) this;
        }

        public Criteria andPI182ALessThanOrEqualTo(Double value) {
            addCriterion("PI182A <=", value, "PI182A");
            return (Criteria) this;
        }

        public Criteria andPI182AIn(List<Double> values) {
            addCriterion("PI182A in", values, "PI182A");
            return (Criteria) this;
        }

        public Criteria andPI182ANotIn(List<Double> values) {
            addCriterion("PI182A not in", values, "PI182A");
            return (Criteria) this;
        }

        public Criteria andPI182ABetween(Double value1, Double value2) {
            addCriterion("PI182A between", value1, value2, "PI182A");
            return (Criteria) this;
        }

        public Criteria andPI182ANotBetween(Double value1, Double value2) {
            addCriterion("PI182A not between", value1, value2, "PI182A");
            return (Criteria) this;
        }

        public Criteria andPC153IsNull() {
            addCriterion("PC153 is null");
            return (Criteria) this;
        }

        public Criteria andPC153IsNotNull() {
            addCriterion("PC153 is not null");
            return (Criteria) this;
        }

        public Criteria andPC153EqualTo(Double value) {
            addCriterion("PC153 =", value, "PC153");
            return (Criteria) this;
        }

        public Criteria andPC153NotEqualTo(Double value) {
            addCriterion("PC153 <>", value, "PC153");
            return (Criteria) this;
        }

        public Criteria andPC153GreaterThan(Double value) {
            addCriterion("PC153 >", value, "PC153");
            return (Criteria) this;
        }

        public Criteria andPC153GreaterThanOrEqualTo(Double value) {
            addCriterion("PC153 >=", value, "PC153");
            return (Criteria) this;
        }

        public Criteria andPC153LessThan(Double value) {
            addCriterion("PC153 <", value, "PC153");
            return (Criteria) this;
        }

        public Criteria andPC153LessThanOrEqualTo(Double value) {
            addCriterion("PC153 <=", value, "PC153");
            return (Criteria) this;
        }

        public Criteria andPC153In(List<Double> values) {
            addCriterion("PC153 in", values, "PC153");
            return (Criteria) this;
        }

        public Criteria andPC153NotIn(List<Double> values) {
            addCriterion("PC153 not in", values, "PC153");
            return (Criteria) this;
        }

        public Criteria andPC153Between(Double value1, Double value2) {
            addCriterion("PC153 between", value1, value2, "PC153");
            return (Criteria) this;
        }

        public Criteria andPC153NotBetween(Double value1, Double value2) {
            addCriterion("PC153 not between", value1, value2, "PC153");
            return (Criteria) this;
        }

        public Criteria andPC156IsNull() {
            addCriterion("PC156 is null");
            return (Criteria) this;
        }

        public Criteria andPC156IsNotNull() {
            addCriterion("PC156 is not null");
            return (Criteria) this;
        }

        public Criteria andPC156EqualTo(Double value) {
            addCriterion("PC156 =", value, "PC156");
            return (Criteria) this;
        }

        public Criteria andPC156NotEqualTo(Double value) {
            addCriterion("PC156 <>", value, "PC156");
            return (Criteria) this;
        }

        public Criteria andPC156GreaterThan(Double value) {
            addCriterion("PC156 >", value, "PC156");
            return (Criteria) this;
        }

        public Criteria andPC156GreaterThanOrEqualTo(Double value) {
            addCriterion("PC156 >=", value, "PC156");
            return (Criteria) this;
        }

        public Criteria andPC156LessThan(Double value) {
            addCriterion("PC156 <", value, "PC156");
            return (Criteria) this;
        }

        public Criteria andPC156LessThanOrEqualTo(Double value) {
            addCriterion("PC156 <=", value, "PC156");
            return (Criteria) this;
        }

        public Criteria andPC156In(List<Double> values) {
            addCriterion("PC156 in", values, "PC156");
            return (Criteria) this;
        }

        public Criteria andPC156NotIn(List<Double> values) {
            addCriterion("PC156 not in", values, "PC156");
            return (Criteria) this;
        }

        public Criteria andPC156Between(Double value1, Double value2) {
            addCriterion("PC156 between", value1, value2, "PC156");
            return (Criteria) this;
        }

        public Criteria andPC156NotBetween(Double value1, Double value2) {
            addCriterion("PC156 not between", value1, value2, "PC156");
            return (Criteria) this;
        }

        public Criteria andAI113IsNull() {
            addCriterion("AI113 is null");
            return (Criteria) this;
        }

        public Criteria andAI113IsNotNull() {
            addCriterion("AI113 is not null");
            return (Criteria) this;
        }

        public Criteria andAI113EqualTo(Double value) {
            addCriterion("AI113 =", value, "AI113");
            return (Criteria) this;
        }

        public Criteria andAI113NotEqualTo(Double value) {
            addCriterion("AI113 <>", value, "AI113");
            return (Criteria) this;
        }

        public Criteria andAI113GreaterThan(Double value) {
            addCriterion("AI113 >", value, "AI113");
            return (Criteria) this;
        }

        public Criteria andAI113GreaterThanOrEqualTo(Double value) {
            addCriterion("AI113 >=", value, "AI113");
            return (Criteria) this;
        }

        public Criteria andAI113LessThan(Double value) {
            addCriterion("AI113 <", value, "AI113");
            return (Criteria) this;
        }

        public Criteria andAI113LessThanOrEqualTo(Double value) {
            addCriterion("AI113 <=", value, "AI113");
            return (Criteria) this;
        }

        public Criteria andAI113In(List<Double> values) {
            addCriterion("AI113 in", values, "AI113");
            return (Criteria) this;
        }

        public Criteria andAI113NotIn(List<Double> values) {
            addCriterion("AI113 not in", values, "AI113");
            return (Criteria) this;
        }

        public Criteria andAI113Between(Double value1, Double value2) {
            addCriterion("AI113 between", value1, value2, "AI113");
            return (Criteria) this;
        }

        public Criteria andAI113NotBetween(Double value1, Double value2) {
            addCriterion("AI113 not between", value1, value2, "AI113");
            return (Criteria) this;
        }

        public Criteria andAI108IsNull() {
            addCriterion("AI108 is null");
            return (Criteria) this;
        }

        public Criteria andAI108IsNotNull() {
            addCriterion("AI108 is not null");
            return (Criteria) this;
        }

        public Criteria andAI108EqualTo(Double value) {
            addCriterion("AI108 =", value, "AI108");
            return (Criteria) this;
        }

        public Criteria andAI108NotEqualTo(Double value) {
            addCriterion("AI108 <>", value, "AI108");
            return (Criteria) this;
        }

        public Criteria andAI108GreaterThan(Double value) {
            addCriterion("AI108 >", value, "AI108");
            return (Criteria) this;
        }

        public Criteria andAI108GreaterThanOrEqualTo(Double value) {
            addCriterion("AI108 >=", value, "AI108");
            return (Criteria) this;
        }

        public Criteria andAI108LessThan(Double value) {
            addCriterion("AI108 <", value, "AI108");
            return (Criteria) this;
        }

        public Criteria andAI108LessThanOrEqualTo(Double value) {
            addCriterion("AI108 <=", value, "AI108");
            return (Criteria) this;
        }

        public Criteria andAI108In(List<Double> values) {
            addCriterion("AI108 in", values, "AI108");
            return (Criteria) this;
        }

        public Criteria andAI108NotIn(List<Double> values) {
            addCriterion("AI108 not in", values, "AI108");
            return (Criteria) this;
        }

        public Criteria andAI108Between(Double value1, Double value2) {
            addCriterion("AI108 between", value1, value2, "AI108");
            return (Criteria) this;
        }

        public Criteria andAI108NotBetween(Double value1, Double value2) {
            addCriterion("AI108 not between", value1, value2, "AI108");
            return (Criteria) this;
        }

        public Criteria andAI100IsNull() {
            addCriterion("AI100 is null");
            return (Criteria) this;
        }

        public Criteria andAI100IsNotNull() {
            addCriterion("AI100 is not null");
            return (Criteria) this;
        }

        public Criteria andAI100EqualTo(Double value) {
            addCriterion("AI100 =", value, "AI100");
            return (Criteria) this;
        }

        public Criteria andAI100NotEqualTo(Double value) {
            addCriterion("AI100 <>", value, "AI100");
            return (Criteria) this;
        }

        public Criteria andAI100GreaterThan(Double value) {
            addCriterion("AI100 >", value, "AI100");
            return (Criteria) this;
        }

        public Criteria andAI100GreaterThanOrEqualTo(Double value) {
            addCriterion("AI100 >=", value, "AI100");
            return (Criteria) this;
        }

        public Criteria andAI100LessThan(Double value) {
            addCriterion("AI100 <", value, "AI100");
            return (Criteria) this;
        }

        public Criteria andAI100LessThanOrEqualTo(Double value) {
            addCriterion("AI100 <=", value, "AI100");
            return (Criteria) this;
        }

        public Criteria andAI100In(List<Double> values) {
            addCriterion("AI100 in", values, "AI100");
            return (Criteria) this;
        }

        public Criteria andAI100NotIn(List<Double> values) {
            addCriterion("AI100 not in", values, "AI100");
            return (Criteria) this;
        }

        public Criteria andAI100Between(Double value1, Double value2) {
            addCriterion("AI100 between", value1, value2, "AI100");
            return (Criteria) this;
        }

        public Criteria andAI100NotBetween(Double value1, Double value2) {
            addCriterion("AI100 not between", value1, value2, "AI100");
            return (Criteria) this;
        }

        public Criteria andAI101IsNull() {
            addCriterion("AI101 is null");
            return (Criteria) this;
        }

        public Criteria andAI101IsNotNull() {
            addCriterion("AI101 is not null");
            return (Criteria) this;
        }

        public Criteria andAI101EqualTo(Double value) {
            addCriterion("AI101 =", value, "AI101");
            return (Criteria) this;
        }

        public Criteria andAI101NotEqualTo(Double value) {
            addCriterion("AI101 <>", value, "AI101");
            return (Criteria) this;
        }

        public Criteria andAI101GreaterThan(Double value) {
            addCriterion("AI101 >", value, "AI101");
            return (Criteria) this;
        }

        public Criteria andAI101GreaterThanOrEqualTo(Double value) {
            addCriterion("AI101 >=", value, "AI101");
            return (Criteria) this;
        }

        public Criteria andAI101LessThan(Double value) {
            addCriterion("AI101 <", value, "AI101");
            return (Criteria) this;
        }

        public Criteria andAI101LessThanOrEqualTo(Double value) {
            addCriterion("AI101 <=", value, "AI101");
            return (Criteria) this;
        }

        public Criteria andAI101In(List<Double> values) {
            addCriterion("AI101 in", values, "AI101");
            return (Criteria) this;
        }

        public Criteria andAI101NotIn(List<Double> values) {
            addCriterion("AI101 not in", values, "AI101");
            return (Criteria) this;
        }

        public Criteria andAI101Between(Double value1, Double value2) {
            addCriterion("AI101 between", value1, value2, "AI101");
            return (Criteria) this;
        }

        public Criteria andAI101NotBetween(Double value1, Double value2) {
            addCriterion("AI101 not between", value1, value2, "AI101");
            return (Criteria) this;
        }

        public Criteria andAC102IsNull() {
            addCriterion("AC102 is null");
            return (Criteria) this;
        }

        public Criteria andAC102IsNotNull() {
            addCriterion("AC102 is not null");
            return (Criteria) this;
        }

        public Criteria andAC102EqualTo(Double value) {
            addCriterion("AC102 =", value, "AC102");
            return (Criteria) this;
        }

        public Criteria andAC102NotEqualTo(Double value) {
            addCriterion("AC102 <>", value, "AC102");
            return (Criteria) this;
        }

        public Criteria andAC102GreaterThan(Double value) {
            addCriterion("AC102 >", value, "AC102");
            return (Criteria) this;
        }

        public Criteria andAC102GreaterThanOrEqualTo(Double value) {
            addCriterion("AC102 >=", value, "AC102");
            return (Criteria) this;
        }

        public Criteria andAC102LessThan(Double value) {
            addCriterion("AC102 <", value, "AC102");
            return (Criteria) this;
        }

        public Criteria andAC102LessThanOrEqualTo(Double value) {
            addCriterion("AC102 <=", value, "AC102");
            return (Criteria) this;
        }

        public Criteria andAC102In(List<Double> values) {
            addCriterion("AC102 in", values, "AC102");
            return (Criteria) this;
        }

        public Criteria andAC102NotIn(List<Double> values) {
            addCriterion("AC102 not in", values, "AC102");
            return (Criteria) this;
        }

        public Criteria andAC102Between(Double value1, Double value2) {
            addCriterion("AC102 between", value1, value2, "AC102");
            return (Criteria) this;
        }

        public Criteria andAC102NotBetween(Double value1, Double value2) {
            addCriterion("AC102 not between", value1, value2, "AC102");
            return (Criteria) this;
        }

        public Criteria andAI103IsNull() {
            addCriterion("AI103 is null");
            return (Criteria) this;
        }

        public Criteria andAI103IsNotNull() {
            addCriterion("AI103 is not null");
            return (Criteria) this;
        }

        public Criteria andAI103EqualTo(Double value) {
            addCriterion("AI103 =", value, "AI103");
            return (Criteria) this;
        }

        public Criteria andAI103NotEqualTo(Double value) {
            addCriterion("AI103 <>", value, "AI103");
            return (Criteria) this;
        }

        public Criteria andAI103GreaterThan(Double value) {
            addCriterion("AI103 >", value, "AI103");
            return (Criteria) this;
        }

        public Criteria andAI103GreaterThanOrEqualTo(Double value) {
            addCriterion("AI103 >=", value, "AI103");
            return (Criteria) this;
        }

        public Criteria andAI103LessThan(Double value) {
            addCriterion("AI103 <", value, "AI103");
            return (Criteria) this;
        }

        public Criteria andAI103LessThanOrEqualTo(Double value) {
            addCriterion("AI103 <=", value, "AI103");
            return (Criteria) this;
        }

        public Criteria andAI103In(List<Double> values) {
            addCriterion("AI103 in", values, "AI103");
            return (Criteria) this;
        }

        public Criteria andAI103NotIn(List<Double> values) {
            addCriterion("AI103 not in", values, "AI103");
            return (Criteria) this;
        }

        public Criteria andAI103Between(Double value1, Double value2) {
            addCriterion("AI103 between", value1, value2, "AI103");
            return (Criteria) this;
        }

        public Criteria andAI103NotBetween(Double value1, Double value2) {
            addCriterion("AI103 not between", value1, value2, "AI103");
            return (Criteria) this;
        }

        public Criteria andAC111IsNull() {
            addCriterion("AC111 is null");
            return (Criteria) this;
        }

        public Criteria andAC111IsNotNull() {
            addCriterion("AC111 is not null");
            return (Criteria) this;
        }

        public Criteria andAC111EqualTo(Double value) {
            addCriterion("AC111 =", value, "AC111");
            return (Criteria) this;
        }

        public Criteria andAC111NotEqualTo(Double value) {
            addCriterion("AC111 <>", value, "AC111");
            return (Criteria) this;
        }

        public Criteria andAC111GreaterThan(Double value) {
            addCriterion("AC111 >", value, "AC111");
            return (Criteria) this;
        }

        public Criteria andAC111GreaterThanOrEqualTo(Double value) {
            addCriterion("AC111 >=", value, "AC111");
            return (Criteria) this;
        }

        public Criteria andAC111LessThan(Double value) {
            addCriterion("AC111 <", value, "AC111");
            return (Criteria) this;
        }

        public Criteria andAC111LessThanOrEqualTo(Double value) {
            addCriterion("AC111 <=", value, "AC111");
            return (Criteria) this;
        }

        public Criteria andAC111In(List<Double> values) {
            addCriterion("AC111 in", values, "AC111");
            return (Criteria) this;
        }

        public Criteria andAC111NotIn(List<Double> values) {
            addCriterion("AC111 not in", values, "AC111");
            return (Criteria) this;
        }

        public Criteria andAC111Between(Double value1, Double value2) {
            addCriterion("AC111 between", value1, value2, "AC111");
            return (Criteria) this;
        }

        public Criteria andAC111NotBetween(Double value1, Double value2) {
            addCriterion("AC111 not between", value1, value2, "AC111");
            return (Criteria) this;
        }

        public Criteria andTI5301IsNull() {
            addCriterion("TI5301 is null");
            return (Criteria) this;
        }

        public Criteria andTI5301IsNotNull() {
            addCriterion("TI5301 is not null");
            return (Criteria) this;
        }

        public Criteria andTI5301EqualTo(Double value) {
            addCriterion("TI5301 =", value, "TI5301");
            return (Criteria) this;
        }

        public Criteria andTI5301NotEqualTo(Double value) {
            addCriterion("TI5301 <>", value, "TI5301");
            return (Criteria) this;
        }

        public Criteria andTI5301GreaterThan(Double value) {
            addCriterion("TI5301 >", value, "TI5301");
            return (Criteria) this;
        }

        public Criteria andTI5301GreaterThanOrEqualTo(Double value) {
            addCriterion("TI5301 >=", value, "TI5301");
            return (Criteria) this;
        }

        public Criteria andTI5301LessThan(Double value) {
            addCriterion("TI5301 <", value, "TI5301");
            return (Criteria) this;
        }

        public Criteria andTI5301LessThanOrEqualTo(Double value) {
            addCriterion("TI5301 <=", value, "TI5301");
            return (Criteria) this;
        }

        public Criteria andTI5301In(List<Double> values) {
            addCriterion("TI5301 in", values, "TI5301");
            return (Criteria) this;
        }

        public Criteria andTI5301NotIn(List<Double> values) {
            addCriterion("TI5301 not in", values, "TI5301");
            return (Criteria) this;
        }

        public Criteria andTI5301Between(Double value1, Double value2) {
            addCriterion("TI5301 between", value1, value2, "TI5301");
            return (Criteria) this;
        }

        public Criteria andTI5301NotBetween(Double value1, Double value2) {
            addCriterion("TI5301 not between", value1, value2, "TI5301");
            return (Criteria) this;
        }

        public Criteria andFI153IsNull() {
            addCriterion("FI153 is null");
            return (Criteria) this;
        }

        public Criteria andFI153IsNotNull() {
            addCriterion("FI153 is not null");
            return (Criteria) this;
        }

        public Criteria andFI153EqualTo(Double value) {
            addCriterion("FI153 =", value, "FI153");
            return (Criteria) this;
        }

        public Criteria andFI153NotEqualTo(Double value) {
            addCriterion("FI153 <>", value, "FI153");
            return (Criteria) this;
        }

        public Criteria andFI153GreaterThan(Double value) {
            addCriterion("FI153 >", value, "FI153");
            return (Criteria) this;
        }

        public Criteria andFI153GreaterThanOrEqualTo(Double value) {
            addCriterion("FI153 >=", value, "FI153");
            return (Criteria) this;
        }

        public Criteria andFI153LessThan(Double value) {
            addCriterion("FI153 <", value, "FI153");
            return (Criteria) this;
        }

        public Criteria andFI153LessThanOrEqualTo(Double value) {
            addCriterion("FI153 <=", value, "FI153");
            return (Criteria) this;
        }

        public Criteria andFI153In(List<Double> values) {
            addCriterion("FI153 in", values, "FI153");
            return (Criteria) this;
        }

        public Criteria andFI153NotIn(List<Double> values) {
            addCriterion("FI153 not in", values, "FI153");
            return (Criteria) this;
        }

        public Criteria andFI153Between(Double value1, Double value2) {
            addCriterion("FI153 between", value1, value2, "FI153");
            return (Criteria) this;
        }

        public Criteria andFI153NotBetween(Double value1, Double value2) {
            addCriterion("FI153 not between", value1, value2, "FI153");
            return (Criteria) this;
        }

        public Criteria andFI116IsNull() {
            addCriterion("FI116 is null");
            return (Criteria) this;
        }

        public Criteria andFI116IsNotNull() {
            addCriterion("FI116 is not null");
            return (Criteria) this;
        }

        public Criteria andFI116EqualTo(Double value) {
            addCriterion("FI116 =", value, "FI116");
            return (Criteria) this;
        }

        public Criteria andFI116NotEqualTo(Double value) {
            addCriterion("FI116 <>", value, "FI116");
            return (Criteria) this;
        }

        public Criteria andFI116GreaterThan(Double value) {
            addCriterion("FI116 >", value, "FI116");
            return (Criteria) this;
        }

        public Criteria andFI116GreaterThanOrEqualTo(Double value) {
            addCriterion("FI116 >=", value, "FI116");
            return (Criteria) this;
        }

        public Criteria andFI116LessThan(Double value) {
            addCriterion("FI116 <", value, "FI116");
            return (Criteria) this;
        }

        public Criteria andFI116LessThanOrEqualTo(Double value) {
            addCriterion("FI116 <=", value, "FI116");
            return (Criteria) this;
        }

        public Criteria andFI116In(List<Double> values) {
            addCriterion("FI116 in", values, "FI116");
            return (Criteria) this;
        }

        public Criteria andFI116NotIn(List<Double> values) {
            addCriterion("FI116 not in", values, "FI116");
            return (Criteria) this;
        }

        public Criteria andFI116Between(Double value1, Double value2) {
            addCriterion("FI116 between", value1, value2, "FI116");
            return (Criteria) this;
        }

        public Criteria andFI116NotBetween(Double value1, Double value2) {
            addCriterion("FI116 not between", value1, value2, "FI116");
            return (Criteria) this;
        }

        public Criteria andFI140IsNull() {
            addCriterion("FI140 is null");
            return (Criteria) this;
        }

        public Criteria andFI140IsNotNull() {
            addCriterion("FI140 is not null");
            return (Criteria) this;
        }

        public Criteria andFI140EqualTo(Double value) {
            addCriterion("FI140 =", value, "FI140");
            return (Criteria) this;
        }

        public Criteria andFI140NotEqualTo(Double value) {
            addCriterion("FI140 <>", value, "FI140");
            return (Criteria) this;
        }

        public Criteria andFI140GreaterThan(Double value) {
            addCriterion("FI140 >", value, "FI140");
            return (Criteria) this;
        }

        public Criteria andFI140GreaterThanOrEqualTo(Double value) {
            addCriterion("FI140 >=", value, "FI140");
            return (Criteria) this;
        }

        public Criteria andFI140LessThan(Double value) {
            addCriterion("FI140 <", value, "FI140");
            return (Criteria) this;
        }

        public Criteria andFI140LessThanOrEqualTo(Double value) {
            addCriterion("FI140 <=", value, "FI140");
            return (Criteria) this;
        }

        public Criteria andFI140In(List<Double> values) {
            addCriterion("FI140 in", values, "FI140");
            return (Criteria) this;
        }

        public Criteria andFI140NotIn(List<Double> values) {
            addCriterion("FI140 not in", values, "FI140");
            return (Criteria) this;
        }

        public Criteria andFI140Between(Double value1, Double value2) {
            addCriterion("FI140 between", value1, value2, "FI140");
            return (Criteria) this;
        }

        public Criteria andFI140NotBetween(Double value1, Double value2) {
            addCriterion("FI140 not between", value1, value2, "FI140");
            return (Criteria) this;
        }

        public Criteria andFI09802IsNull() {
            addCriterion("FI09802 is null");
            return (Criteria) this;
        }

        public Criteria andFI09802IsNotNull() {
            addCriterion("FI09802 is not null");
            return (Criteria) this;
        }

        public Criteria andFI09802EqualTo(Double value) {
            addCriterion("FI09802 =", value, "FI09802");
            return (Criteria) this;
        }

        public Criteria andFI09802NotEqualTo(Double value) {
            addCriterion("FI09802 <>", value, "FI09802");
            return (Criteria) this;
        }

        public Criteria andFI09802GreaterThan(Double value) {
            addCriterion("FI09802 >", value, "FI09802");
            return (Criteria) this;
        }

        public Criteria andFI09802GreaterThanOrEqualTo(Double value) {
            addCriterion("FI09802 >=", value, "FI09802");
            return (Criteria) this;
        }

        public Criteria andFI09802LessThan(Double value) {
            addCriterion("FI09802 <", value, "FI09802");
            return (Criteria) this;
        }

        public Criteria andFI09802LessThanOrEqualTo(Double value) {
            addCriterion("FI09802 <=", value, "FI09802");
            return (Criteria) this;
        }

        public Criteria andFI09802In(List<Double> values) {
            addCriterion("FI09802 in", values, "FI09802");
            return (Criteria) this;
        }

        public Criteria andFI09802NotIn(List<Double> values) {
            addCriterion("FI09802 not in", values, "FI09802");
            return (Criteria) this;
        }

        public Criteria andFI09802Between(Double value1, Double value2) {
            addCriterion("FI09802 between", value1, value2, "FI09802");
            return (Criteria) this;
        }

        public Criteria andFI09802NotBetween(Double value1, Double value2) {
            addCriterion("FI09802 not between", value1, value2, "FI09802");
            return (Criteria) this;
        }

        public Criteria andFI09803IsNull() {
            addCriterion("FI09803 is null");
            return (Criteria) this;
        }

        public Criteria andFI09803IsNotNull() {
            addCriterion("FI09803 is not null");
            return (Criteria) this;
        }

        public Criteria andFI09803EqualTo(Double value) {
            addCriterion("FI09803 =", value, "FI09803");
            return (Criteria) this;
        }

        public Criteria andFI09803NotEqualTo(Double value) {
            addCriterion("FI09803 <>", value, "FI09803");
            return (Criteria) this;
        }

        public Criteria andFI09803GreaterThan(Double value) {
            addCriterion("FI09803 >", value, "FI09803");
            return (Criteria) this;
        }

        public Criteria andFI09803GreaterThanOrEqualTo(Double value) {
            addCriterion("FI09803 >=", value, "FI09803");
            return (Criteria) this;
        }

        public Criteria andFI09803LessThan(Double value) {
            addCriterion("FI09803 <", value, "FI09803");
            return (Criteria) this;
        }

        public Criteria andFI09803LessThanOrEqualTo(Double value) {
            addCriterion("FI09803 <=", value, "FI09803");
            return (Criteria) this;
        }

        public Criteria andFI09803In(List<Double> values) {
            addCriterion("FI09803 in", values, "FI09803");
            return (Criteria) this;
        }

        public Criteria andFI09803NotIn(List<Double> values) {
            addCriterion("FI09803 not in", values, "FI09803");
            return (Criteria) this;
        }

        public Criteria andFI09803Between(Double value1, Double value2) {
            addCriterion("FI09803 between", value1, value2, "FI09803");
            return (Criteria) this;
        }

        public Criteria andFI09803NotBetween(Double value1, Double value2) {
            addCriterion("FI09803 not between", value1, value2, "FI09803");
            return (Criteria) this;
        }

        public Criteria andFC131IsNull() {
            addCriterion("FC131 is null");
            return (Criteria) this;
        }

        public Criteria andFC131IsNotNull() {
            addCriterion("FC131 is not null");
            return (Criteria) this;
        }

        public Criteria andFC131EqualTo(Double value) {
            addCriterion("FC131 =", value, "FC131");
            return (Criteria) this;
        }

        public Criteria andFC131NotEqualTo(Double value) {
            addCriterion("FC131 <>", value, "FC131");
            return (Criteria) this;
        }

        public Criteria andFC131GreaterThan(Double value) {
            addCriterion("FC131 >", value, "FC131");
            return (Criteria) this;
        }

        public Criteria andFC131GreaterThanOrEqualTo(Double value) {
            addCriterion("FC131 >=", value, "FC131");
            return (Criteria) this;
        }

        public Criteria andFC131LessThan(Double value) {
            addCriterion("FC131 <", value, "FC131");
            return (Criteria) this;
        }

        public Criteria andFC131LessThanOrEqualTo(Double value) {
            addCriterion("FC131 <=", value, "FC131");
            return (Criteria) this;
        }

        public Criteria andFC131In(List<Double> values) {
            addCriterion("FC131 in", values, "FC131");
            return (Criteria) this;
        }

        public Criteria andFC131NotIn(List<Double> values) {
            addCriterion("FC131 not in", values, "FC131");
            return (Criteria) this;
        }

        public Criteria andFC131Between(Double value1, Double value2) {
            addCriterion("FC131 between", value1, value2, "FC131");
            return (Criteria) this;
        }

        public Criteria andFC131NotBetween(Double value1, Double value2) {
            addCriterion("FC131 not between", value1, value2, "FC131");
            return (Criteria) this;
        }

        public Criteria andTC200IsNull() {
            addCriterion("TC200 is null");
            return (Criteria) this;
        }

        public Criteria andTC200IsNotNull() {
            addCriterion("TC200 is not null");
            return (Criteria) this;
        }

        public Criteria andTC200EqualTo(Double value) {
            addCriterion("TC200 =", value, "TC200");
            return (Criteria) this;
        }

        public Criteria andTC200NotEqualTo(Double value) {
            addCriterion("TC200 <>", value, "TC200");
            return (Criteria) this;
        }

        public Criteria andTC200GreaterThan(Double value) {
            addCriterion("TC200 >", value, "TC200");
            return (Criteria) this;
        }

        public Criteria andTC200GreaterThanOrEqualTo(Double value) {
            addCriterion("TC200 >=", value, "TC200");
            return (Criteria) this;
        }

        public Criteria andTC200LessThan(Double value) {
            addCriterion("TC200 <", value, "TC200");
            return (Criteria) this;
        }

        public Criteria andTC200LessThanOrEqualTo(Double value) {
            addCriterion("TC200 <=", value, "TC200");
            return (Criteria) this;
        }

        public Criteria andTC200In(List<Double> values) {
            addCriterion("TC200 in", values, "TC200");
            return (Criteria) this;
        }

        public Criteria andTC200NotIn(List<Double> values) {
            addCriterion("TC200 not in", values, "TC200");
            return (Criteria) this;
        }

        public Criteria andTC200Between(Double value1, Double value2) {
            addCriterion("TC200 between", value1, value2, "TC200");
            return (Criteria) this;
        }

        public Criteria andTC200NotBetween(Double value1, Double value2) {
            addCriterion("TC200 not between", value1, value2, "TC200");
            return (Criteria) this;
        }

        public Criteria andTI203FIsNull() {
            addCriterion("TI203F is null");
            return (Criteria) this;
        }

        public Criteria andTI203FIsNotNull() {
            addCriterion("TI203F is not null");
            return (Criteria) this;
        }

        public Criteria andTI203FEqualTo(Double value) {
            addCriterion("TI203F =", value, "TI203F");
            return (Criteria) this;
        }

        public Criteria andTI203FNotEqualTo(Double value) {
            addCriterion("TI203F <>", value, "TI203F");
            return (Criteria) this;
        }

        public Criteria andTI203FGreaterThan(Double value) {
            addCriterion("TI203F >", value, "TI203F");
            return (Criteria) this;
        }

        public Criteria andTI203FGreaterThanOrEqualTo(Double value) {
            addCriterion("TI203F >=", value, "TI203F");
            return (Criteria) this;
        }

        public Criteria andTI203FLessThan(Double value) {
            addCriterion("TI203F <", value, "TI203F");
            return (Criteria) this;
        }

        public Criteria andTI203FLessThanOrEqualTo(Double value) {
            addCriterion("TI203F <=", value, "TI203F");
            return (Criteria) this;
        }

        public Criteria andTI203FIn(List<Double> values) {
            addCriterion("TI203F in", values, "TI203F");
            return (Criteria) this;
        }

        public Criteria andTI203FNotIn(List<Double> values) {
            addCriterion("TI203F not in", values, "TI203F");
            return (Criteria) this;
        }

        public Criteria andTI203FBetween(Double value1, Double value2) {
            addCriterion("TI203F between", value1, value2, "TI203F");
            return (Criteria) this;
        }

        public Criteria andTI203FNotBetween(Double value1, Double value2) {
            addCriterion("TI203F not between", value1, value2, "TI203F");
            return (Criteria) this;
        }

        public Criteria andTI208AIsNull() {
            addCriterion("TI208A is null");
            return (Criteria) this;
        }

        public Criteria andTI208AIsNotNull() {
            addCriterion("TI208A is not null");
            return (Criteria) this;
        }

        public Criteria andTI208AEqualTo(Double value) {
            addCriterion("TI208A =", value, "TI208A");
            return (Criteria) this;
        }

        public Criteria andTI208ANotEqualTo(Double value) {
            addCriterion("TI208A <>", value, "TI208A");
            return (Criteria) this;
        }

        public Criteria andTI208AGreaterThan(Double value) {
            addCriterion("TI208A >", value, "TI208A");
            return (Criteria) this;
        }

        public Criteria andTI208AGreaterThanOrEqualTo(Double value) {
            addCriterion("TI208A >=", value, "TI208A");
            return (Criteria) this;
        }

        public Criteria andTI208ALessThan(Double value) {
            addCriterion("TI208A <", value, "TI208A");
            return (Criteria) this;
        }

        public Criteria andTI208ALessThanOrEqualTo(Double value) {
            addCriterion("TI208A <=", value, "TI208A");
            return (Criteria) this;
        }

        public Criteria andTI208AIn(List<Double> values) {
            addCriterion("TI208A in", values, "TI208A");
            return (Criteria) this;
        }

        public Criteria andTI208ANotIn(List<Double> values) {
            addCriterion("TI208A not in", values, "TI208A");
            return (Criteria) this;
        }

        public Criteria andTI208ABetween(Double value1, Double value2) {
            addCriterion("TI208A between", value1, value2, "TI208A");
            return (Criteria) this;
        }

        public Criteria andTI208ANotBetween(Double value1, Double value2) {
            addCriterion("TI208A not between", value1, value2, "TI208A");
            return (Criteria) this;
        }

        public Criteria andTI210HIsNull() {
            addCriterion("TI210H is null");
            return (Criteria) this;
        }

        public Criteria andTI210HIsNotNull() {
            addCriterion("TI210H is not null");
            return (Criteria) this;
        }

        public Criteria andTI210HEqualTo(Double value) {
            addCriterion("TI210H =", value, "TI210H");
            return (Criteria) this;
        }

        public Criteria andTI210HNotEqualTo(Double value) {
            addCriterion("TI210H <>", value, "TI210H");
            return (Criteria) this;
        }

        public Criteria andTI210HGreaterThan(Double value) {
            addCriterion("TI210H >", value, "TI210H");
            return (Criteria) this;
        }

        public Criteria andTI210HGreaterThanOrEqualTo(Double value) {
            addCriterion("TI210H >=", value, "TI210H");
            return (Criteria) this;
        }

        public Criteria andTI210HLessThan(Double value) {
            addCriterion("TI210H <", value, "TI210H");
            return (Criteria) this;
        }

        public Criteria andTI210HLessThanOrEqualTo(Double value) {
            addCriterion("TI210H <=", value, "TI210H");
            return (Criteria) this;
        }

        public Criteria andTI210HIn(List<Double> values) {
            addCriterion("TI210H in", values, "TI210H");
            return (Criteria) this;
        }

        public Criteria andTI210HNotIn(List<Double> values) {
            addCriterion("TI210H not in", values, "TI210H");
            return (Criteria) this;
        }

        public Criteria andTI210HBetween(Double value1, Double value2) {
            addCriterion("TI210H between", value1, value2, "TI210H");
            return (Criteria) this;
        }

        public Criteria andTI210HNotBetween(Double value1, Double value2) {
            addCriterion("TI210H not between", value1, value2, "TI210H");
            return (Criteria) this;
        }

        public Criteria andTI266AIsNull() {
            addCriterion("TI266A is null");
            return (Criteria) this;
        }

        public Criteria andTI266AIsNotNull() {
            addCriterion("TI266A is not null");
            return (Criteria) this;
        }

        public Criteria andTI266AEqualTo(Double value) {
            addCriterion("TI266A =", value, "TI266A");
            return (Criteria) this;
        }

        public Criteria andTI266ANotEqualTo(Double value) {
            addCriterion("TI266A <>", value, "TI266A");
            return (Criteria) this;
        }

        public Criteria andTI266AGreaterThan(Double value) {
            addCriterion("TI266A >", value, "TI266A");
            return (Criteria) this;
        }

        public Criteria andTI266AGreaterThanOrEqualTo(Double value) {
            addCriterion("TI266A >=", value, "TI266A");
            return (Criteria) this;
        }

        public Criteria andTI266ALessThan(Double value) {
            addCriterion("TI266A <", value, "TI266A");
            return (Criteria) this;
        }

        public Criteria andTI266ALessThanOrEqualTo(Double value) {
            addCriterion("TI266A <=", value, "TI266A");
            return (Criteria) this;
        }

        public Criteria andTI266AIn(List<Double> values) {
            addCriterion("TI266A in", values, "TI266A");
            return (Criteria) this;
        }

        public Criteria andTI266ANotIn(List<Double> values) {
            addCriterion("TI266A not in", values, "TI266A");
            return (Criteria) this;
        }

        public Criteria andTI266ABetween(Double value1, Double value2) {
            addCriterion("TI266A between", value1, value2, "TI266A");
            return (Criteria) this;
        }

        public Criteria andTI266ANotBetween(Double value1, Double value2) {
            addCriterion("TI266A not between", value1, value2, "TI266A");
            return (Criteria) this;
        }

        public Criteria andTI268HIsNull() {
            addCriterion("TI268H is null");
            return (Criteria) this;
        }

        public Criteria andTI268HIsNotNull() {
            addCriterion("TI268H is not null");
            return (Criteria) this;
        }

        public Criteria andTI268HEqualTo(Double value) {
            addCriterion("TI268H =", value, "TI268H");
            return (Criteria) this;
        }

        public Criteria andTI268HNotEqualTo(Double value) {
            addCriterion("TI268H <>", value, "TI268H");
            return (Criteria) this;
        }

        public Criteria andTI268HGreaterThan(Double value) {
            addCriterion("TI268H >", value, "TI268H");
            return (Criteria) this;
        }

        public Criteria andTI268HGreaterThanOrEqualTo(Double value) {
            addCriterion("TI268H >=", value, "TI268H");
            return (Criteria) this;
        }

        public Criteria andTI268HLessThan(Double value) {
            addCriterion("TI268H <", value, "TI268H");
            return (Criteria) this;
        }

        public Criteria andTI268HLessThanOrEqualTo(Double value) {
            addCriterion("TI268H <=", value, "TI268H");
            return (Criteria) this;
        }

        public Criteria andTI268HIn(List<Double> values) {
            addCriterion("TI268H in", values, "TI268H");
            return (Criteria) this;
        }

        public Criteria andTI268HNotIn(List<Double> values) {
            addCriterion("TI268H not in", values, "TI268H");
            return (Criteria) this;
        }

        public Criteria andTI268HBetween(Double value1, Double value2) {
            addCriterion("TI268H between", value1, value2, "TI268H");
            return (Criteria) this;
        }

        public Criteria andTI268HNotBetween(Double value1, Double value2) {
            addCriterion("TI268H not between", value1, value2, "TI268H");
            return (Criteria) this;
        }

        public Criteria andTI239IsNull() {
            addCriterion("TI239 is null");
            return (Criteria) this;
        }

        public Criteria andTI239IsNotNull() {
            addCriterion("TI239 is not null");
            return (Criteria) this;
        }

        public Criteria andTI239EqualTo(Double value) {
            addCriterion("TI239 =", value, "TI239");
            return (Criteria) this;
        }

        public Criteria andTI239NotEqualTo(Double value) {
            addCriterion("TI239 <>", value, "TI239");
            return (Criteria) this;
        }

        public Criteria andTI239GreaterThan(Double value) {
            addCriterion("TI239 >", value, "TI239");
            return (Criteria) this;
        }

        public Criteria andTI239GreaterThanOrEqualTo(Double value) {
            addCriterion("TI239 >=", value, "TI239");
            return (Criteria) this;
        }

        public Criteria andTI239LessThan(Double value) {
            addCriterion("TI239 <", value, "TI239");
            return (Criteria) this;
        }

        public Criteria andTI239LessThanOrEqualTo(Double value) {
            addCriterion("TI239 <=", value, "TI239");
            return (Criteria) this;
        }

        public Criteria andTI239In(List<Double> values) {
            addCriterion("TI239 in", values, "TI239");
            return (Criteria) this;
        }

        public Criteria andTI239NotIn(List<Double> values) {
            addCriterion("TI239 not in", values, "TI239");
            return (Criteria) this;
        }

        public Criteria andTI239Between(Double value1, Double value2) {
            addCriterion("TI239 between", value1, value2, "TI239");
            return (Criteria) this;
        }

        public Criteria andTI239NotBetween(Double value1, Double value2) {
            addCriterion("TI239 not between", value1, value2, "TI239");
            return (Criteria) this;
        }

        public Criteria andTC142IsNull() {
            addCriterion("TC142 is null");
            return (Criteria) this;
        }

        public Criteria andTC142IsNotNull() {
            addCriterion("TC142 is not null");
            return (Criteria) this;
        }

        public Criteria andTC142EqualTo(Double value) {
            addCriterion("TC142 =", value, "TC142");
            return (Criteria) this;
        }

        public Criteria andTC142NotEqualTo(Double value) {
            addCriterion("TC142 <>", value, "TC142");
            return (Criteria) this;
        }

        public Criteria andTC142GreaterThan(Double value) {
            addCriterion("TC142 >", value, "TC142");
            return (Criteria) this;
        }

        public Criteria andTC142GreaterThanOrEqualTo(Double value) {
            addCriterion("TC142 >=", value, "TC142");
            return (Criteria) this;
        }

        public Criteria andTC142LessThan(Double value) {
            addCriterion("TC142 <", value, "TC142");
            return (Criteria) this;
        }

        public Criteria andTC142LessThanOrEqualTo(Double value) {
            addCriterion("TC142 <=", value, "TC142");
            return (Criteria) this;
        }

        public Criteria andTC142In(List<Double> values) {
            addCriterion("TC142 in", values, "TC142");
            return (Criteria) this;
        }

        public Criteria andTC142NotIn(List<Double> values) {
            addCriterion("TC142 not in", values, "TC142");
            return (Criteria) this;
        }

        public Criteria andTC142Between(Double value1, Double value2) {
            addCriterion("TC142 between", value1, value2, "TC142");
            return (Criteria) this;
        }

        public Criteria andTC142NotBetween(Double value1, Double value2) {
            addCriterion("TC142 not between", value1, value2, "TC142");
            return (Criteria) this;
        }

        public Criteria andTC144IsNull() {
            addCriterion("TC144 is null");
            return (Criteria) this;
        }

        public Criteria andTC144IsNotNull() {
            addCriterion("TC144 is not null");
            return (Criteria) this;
        }

        public Criteria andTC144EqualTo(Double value) {
            addCriterion("TC144 =", value, "TC144");
            return (Criteria) this;
        }

        public Criteria andTC144NotEqualTo(Double value) {
            addCriterion("TC144 <>", value, "TC144");
            return (Criteria) this;
        }

        public Criteria andTC144GreaterThan(Double value) {
            addCriterion("TC144 >", value, "TC144");
            return (Criteria) this;
        }

        public Criteria andTC144GreaterThanOrEqualTo(Double value) {
            addCriterion("TC144 >=", value, "TC144");
            return (Criteria) this;
        }

        public Criteria andTC144LessThan(Double value) {
            addCriterion("TC144 <", value, "TC144");
            return (Criteria) this;
        }

        public Criteria andTC144LessThanOrEqualTo(Double value) {
            addCriterion("TC144 <=", value, "TC144");
            return (Criteria) this;
        }

        public Criteria andTC144In(List<Double> values) {
            addCriterion("TC144 in", values, "TC144");
            return (Criteria) this;
        }

        public Criteria andTC144NotIn(List<Double> values) {
            addCriterion("TC144 not in", values, "TC144");
            return (Criteria) this;
        }

        public Criteria andTC144Between(Double value1, Double value2) {
            addCriterion("TC144 between", value1, value2, "TC144");
            return (Criteria) this;
        }

        public Criteria andTC144NotBetween(Double value1, Double value2) {
            addCriterion("TC144 not between", value1, value2, "TC144");
            return (Criteria) this;
        }

        public Criteria andFI163IsNull() {
            addCriterion("FI163 is null");
            return (Criteria) this;
        }

        public Criteria andFI163IsNotNull() {
            addCriterion("FI163 is not null");
            return (Criteria) this;
        }

        public Criteria andFI163EqualTo(Double value) {
            addCriterion("FI163 =", value, "FI163");
            return (Criteria) this;
        }

        public Criteria andFI163NotEqualTo(Double value) {
            addCriterion("FI163 <>", value, "FI163");
            return (Criteria) this;
        }

        public Criteria andFI163GreaterThan(Double value) {
            addCriterion("FI163 >", value, "FI163");
            return (Criteria) this;
        }

        public Criteria andFI163GreaterThanOrEqualTo(Double value) {
            addCriterion("FI163 >=", value, "FI163");
            return (Criteria) this;
        }

        public Criteria andFI163LessThan(Double value) {
            addCriterion("FI163 <", value, "FI163");
            return (Criteria) this;
        }

        public Criteria andFI163LessThanOrEqualTo(Double value) {
            addCriterion("FI163 <=", value, "FI163");
            return (Criteria) this;
        }

        public Criteria andFI163In(List<Double> values) {
            addCriterion("FI163 in", values, "FI163");
            return (Criteria) this;
        }

        public Criteria andFI163NotIn(List<Double> values) {
            addCriterion("FI163 not in", values, "FI163");
            return (Criteria) this;
        }

        public Criteria andFI163Between(Double value1, Double value2) {
            addCriterion("FI163 between", value1, value2, "FI163");
            return (Criteria) this;
        }

        public Criteria andFI163NotBetween(Double value1, Double value2) {
            addCriterion("FI163 not between", value1, value2, "FI163");
            return (Criteria) this;
        }

        public Criteria andFIQ203IsNull() {
            addCriterion("FIQ203 is null");
            return (Criteria) this;
        }

        public Criteria andFIQ203IsNotNull() {
            addCriterion("FIQ203 is not null");
            return (Criteria) this;
        }

        public Criteria andFIQ203EqualTo(Double value) {
            addCriterion("FIQ203 =", value, "FIQ203");
            return (Criteria) this;
        }

        public Criteria andFIQ203NotEqualTo(Double value) {
            addCriterion("FIQ203 <>", value, "FIQ203");
            return (Criteria) this;
        }

        public Criteria andFIQ203GreaterThan(Double value) {
            addCriterion("FIQ203 >", value, "FIQ203");
            return (Criteria) this;
        }

        public Criteria andFIQ203GreaterThanOrEqualTo(Double value) {
            addCriterion("FIQ203 >=", value, "FIQ203");
            return (Criteria) this;
        }

        public Criteria andFIQ203LessThan(Double value) {
            addCriterion("FIQ203 <", value, "FIQ203");
            return (Criteria) this;
        }

        public Criteria andFIQ203LessThanOrEqualTo(Double value) {
            addCriterion("FIQ203 <=", value, "FIQ203");
            return (Criteria) this;
        }

        public Criteria andFIQ203In(List<Double> values) {
            addCriterion("FIQ203 in", values, "FIQ203");
            return (Criteria) this;
        }

        public Criteria andFIQ203NotIn(List<Double> values) {
            addCriterion("FIQ203 not in", values, "FIQ203");
            return (Criteria) this;
        }

        public Criteria andFIQ203Between(Double value1, Double value2) {
            addCriterion("FIQ203 between", value1, value2, "FIQ203");
            return (Criteria) this;
        }

        public Criteria andFIQ203NotBetween(Double value1, Double value2) {
            addCriterion("FIQ203 not between", value1, value2, "FIQ203");
            return (Criteria) this;
        }

        public Criteria andFIQ100IsNull() {
            addCriterion("FIQ100 is null");
            return (Criteria) this;
        }

        public Criteria andFIQ100IsNotNull() {
            addCriterion("FIQ100 is not null");
            return (Criteria) this;
        }

        public Criteria andFIQ100EqualTo(Double value) {
            addCriterion("FIQ100 =", value, "FIQ100");
            return (Criteria) this;
        }

        public Criteria andFIQ100NotEqualTo(Double value) {
            addCriterion("FIQ100 <>", value, "FIQ100");
            return (Criteria) this;
        }

        public Criteria andFIQ100GreaterThan(Double value) {
            addCriterion("FIQ100 >", value, "FIQ100");
            return (Criteria) this;
        }

        public Criteria andFIQ100GreaterThanOrEqualTo(Double value) {
            addCriterion("FIQ100 >=", value, "FIQ100");
            return (Criteria) this;
        }

        public Criteria andFIQ100LessThan(Double value) {
            addCriterion("FIQ100 <", value, "FIQ100");
            return (Criteria) this;
        }

        public Criteria andFIQ100LessThanOrEqualTo(Double value) {
            addCriterion("FIQ100 <=", value, "FIQ100");
            return (Criteria) this;
        }

        public Criteria andFIQ100In(List<Double> values) {
            addCriterion("FIQ100 in", values, "FIQ100");
            return (Criteria) this;
        }

        public Criteria andFIQ100NotIn(List<Double> values) {
            addCriterion("FIQ100 not in", values, "FIQ100");
            return (Criteria) this;
        }

        public Criteria andFIQ100Between(Double value1, Double value2) {
            addCriterion("FIQ100 between", value1, value2, "FIQ100");
            return (Criteria) this;
        }

        public Criteria andFIQ100NotBetween(Double value1, Double value2) {
            addCriterion("FIQ100 not between", value1, value2, "FIQ100");
            return (Criteria) this;
        }

        public Criteria andFIQ172IsNull() {
            addCriterion("FIQ172 is null");
            return (Criteria) this;
        }

        public Criteria andFIQ172IsNotNull() {
            addCriterion("FIQ172 is not null");
            return (Criteria) this;
        }

        public Criteria andFIQ172EqualTo(Double value) {
            addCriterion("FIQ172 =", value, "FIQ172");
            return (Criteria) this;
        }

        public Criteria andFIQ172NotEqualTo(Double value) {
            addCriterion("FIQ172 <>", value, "FIQ172");
            return (Criteria) this;
        }

        public Criteria andFIQ172GreaterThan(Double value) {
            addCriterion("FIQ172 >", value, "FIQ172");
            return (Criteria) this;
        }

        public Criteria andFIQ172GreaterThanOrEqualTo(Double value) {
            addCriterion("FIQ172 >=", value, "FIQ172");
            return (Criteria) this;
        }

        public Criteria andFIQ172LessThan(Double value) {
            addCriterion("FIQ172 <", value, "FIQ172");
            return (Criteria) this;
        }

        public Criteria andFIQ172LessThanOrEqualTo(Double value) {
            addCriterion("FIQ172 <=", value, "FIQ172");
            return (Criteria) this;
        }

        public Criteria andFIQ172In(List<Double> values) {
            addCriterion("FIQ172 in", values, "FIQ172");
            return (Criteria) this;
        }

        public Criteria andFIQ172NotIn(List<Double> values) {
            addCriterion("FIQ172 not in", values, "FIQ172");
            return (Criteria) this;
        }

        public Criteria andFIQ172Between(Double value1, Double value2) {
            addCriterion("FIQ172 between", value1, value2, "FIQ172");
            return (Criteria) this;
        }

        public Criteria andFIQ172NotBetween(Double value1, Double value2) {
            addCriterion("FIQ172 not between", value1, value2, "FIQ172");
            return (Criteria) this;
        }

        public Criteria andFIQ175IsNull() {
            addCriterion("FIQ175 is null");
            return (Criteria) this;
        }

        public Criteria andFIQ175IsNotNull() {
            addCriterion("FIQ175 is not null");
            return (Criteria) this;
        }

        public Criteria andFIQ175EqualTo(Double value) {
            addCriterion("FIQ175 =", value, "FIQ175");
            return (Criteria) this;
        }

        public Criteria andFIQ175NotEqualTo(Double value) {
            addCriterion("FIQ175 <>", value, "FIQ175");
            return (Criteria) this;
        }

        public Criteria andFIQ175GreaterThan(Double value) {
            addCriterion("FIQ175 >", value, "FIQ175");
            return (Criteria) this;
        }

        public Criteria andFIQ175GreaterThanOrEqualTo(Double value) {
            addCriterion("FIQ175 >=", value, "FIQ175");
            return (Criteria) this;
        }

        public Criteria andFIQ175LessThan(Double value) {
            addCriterion("FIQ175 <", value, "FIQ175");
            return (Criteria) this;
        }

        public Criteria andFIQ175LessThanOrEqualTo(Double value) {
            addCriterion("FIQ175 <=", value, "FIQ175");
            return (Criteria) this;
        }

        public Criteria andFIQ175In(List<Double> values) {
            addCriterion("FIQ175 in", values, "FIQ175");
            return (Criteria) this;
        }

        public Criteria andFIQ175NotIn(List<Double> values) {
            addCriterion("FIQ175 not in", values, "FIQ175");
            return (Criteria) this;
        }

        public Criteria andFIQ175Between(Double value1, Double value2) {
            addCriterion("FIQ175 between", value1, value2, "FIQ175");
            return (Criteria) this;
        }

        public Criteria andFIQ175NotBetween(Double value1, Double value2) {
            addCriterion("FIQ175 not between", value1, value2, "FIQ175");
            return (Criteria) this;
        }

        public Criteria andFIQ162IsNull() {
            addCriterion("FIQ162 is null");
            return (Criteria) this;
        }

        public Criteria andFIQ162IsNotNull() {
            addCriterion("FIQ162 is not null");
            return (Criteria) this;
        }

        public Criteria andFIQ162EqualTo(Double value) {
            addCriterion("FIQ162 =", value, "FIQ162");
            return (Criteria) this;
        }

        public Criteria andFIQ162NotEqualTo(Double value) {
            addCriterion("FIQ162 <>", value, "FIQ162");
            return (Criteria) this;
        }

        public Criteria andFIQ162GreaterThan(Double value) {
            addCriterion("FIQ162 >", value, "FIQ162");
            return (Criteria) this;
        }

        public Criteria andFIQ162GreaterThanOrEqualTo(Double value) {
            addCriterion("FIQ162 >=", value, "FIQ162");
            return (Criteria) this;
        }

        public Criteria andFIQ162LessThan(Double value) {
            addCriterion("FIQ162 <", value, "FIQ162");
            return (Criteria) this;
        }

        public Criteria andFIQ162LessThanOrEqualTo(Double value) {
            addCriterion("FIQ162 <=", value, "FIQ162");
            return (Criteria) this;
        }

        public Criteria andFIQ162In(List<Double> values) {
            addCriterion("FIQ162 in", values, "FIQ162");
            return (Criteria) this;
        }

        public Criteria andFIQ162NotIn(List<Double> values) {
            addCriterion("FIQ162 not in", values, "FIQ162");
            return (Criteria) this;
        }

        public Criteria andFIQ162Between(Double value1, Double value2) {
            addCriterion("FIQ162 between", value1, value2, "FIQ162");
            return (Criteria) this;
        }

        public Criteria andFIQ162NotBetween(Double value1, Double value2) {
            addCriterion("FIQ162 not between", value1, value2, "FIQ162");
            return (Criteria) this;
        }

        public Criteria andFIQ221AIsNull() {
            addCriterion("FIQ221A is null");
            return (Criteria) this;
        }

        public Criteria andFIQ221AIsNotNull() {
            addCriterion("FIQ221A is not null");
            return (Criteria) this;
        }

        public Criteria andFIQ221AEqualTo(Double value) {
            addCriterion("FIQ221A =", value, "FIQ221A");
            return (Criteria) this;
        }

        public Criteria andFIQ221ANotEqualTo(Double value) {
            addCriterion("FIQ221A <>", value, "FIQ221A");
            return (Criteria) this;
        }

        public Criteria andFIQ221AGreaterThan(Double value) {
            addCriterion("FIQ221A >", value, "FIQ221A");
            return (Criteria) this;
        }

        public Criteria andFIQ221AGreaterThanOrEqualTo(Double value) {
            addCriterion("FIQ221A >=", value, "FIQ221A");
            return (Criteria) this;
        }

        public Criteria andFIQ221ALessThan(Double value) {
            addCriterion("FIQ221A <", value, "FIQ221A");
            return (Criteria) this;
        }

        public Criteria andFIQ221ALessThanOrEqualTo(Double value) {
            addCriterion("FIQ221A <=", value, "FIQ221A");
            return (Criteria) this;
        }

        public Criteria andFIQ221AIn(List<Double> values) {
            addCriterion("FIQ221A in", values, "FIQ221A");
            return (Criteria) this;
        }

        public Criteria andFIQ221ANotIn(List<Double> values) {
            addCriterion("FIQ221A not in", values, "FIQ221A");
            return (Criteria) this;
        }

        public Criteria andFIQ221ABetween(Double value1, Double value2) {
            addCriterion("FIQ221A between", value1, value2, "FIQ221A");
            return (Criteria) this;
        }

        public Criteria andFIQ221ANotBetween(Double value1, Double value2) {
            addCriterion("FIQ221A not between", value1, value2, "FIQ221A");
            return (Criteria) this;
        }

        public Criteria andFIQ221BIsNull() {
            addCriterion("FIQ221B is null");
            return (Criteria) this;
        }

        public Criteria andFIQ221BIsNotNull() {
            addCriterion("FIQ221B is not null");
            return (Criteria) this;
        }

        public Criteria andFIQ221BEqualTo(Double value) {
            addCriterion("FIQ221B =", value, "FIQ221B");
            return (Criteria) this;
        }

        public Criteria andFIQ221BNotEqualTo(Double value) {
            addCriterion("FIQ221B <>", value, "FIQ221B");
            return (Criteria) this;
        }

        public Criteria andFIQ221BGreaterThan(Double value) {
            addCriterion("FIQ221B >", value, "FIQ221B");
            return (Criteria) this;
        }

        public Criteria andFIQ221BGreaterThanOrEqualTo(Double value) {
            addCriterion("FIQ221B >=", value, "FIQ221B");
            return (Criteria) this;
        }

        public Criteria andFIQ221BLessThan(Double value) {
            addCriterion("FIQ221B <", value, "FIQ221B");
            return (Criteria) this;
        }

        public Criteria andFIQ221BLessThanOrEqualTo(Double value) {
            addCriterion("FIQ221B <=", value, "FIQ221B");
            return (Criteria) this;
        }

        public Criteria andFIQ221BIn(List<Double> values) {
            addCriterion("FIQ221B in", values, "FIQ221B");
            return (Criteria) this;
        }

        public Criteria andFIQ221BNotIn(List<Double> values) {
            addCriterion("FIQ221B not in", values, "FIQ221B");
            return (Criteria) this;
        }

        public Criteria andFIQ221BBetween(Double value1, Double value2) {
            addCriterion("FIQ221B between", value1, value2, "FIQ221B");
            return (Criteria) this;
        }

        public Criteria andFIQ221BNotBetween(Double value1, Double value2) {
            addCriterion("FIQ221B not between", value1, value2, "FIQ221B");
            return (Criteria) this;
        }

        public Criteria andFIQ180IsNull() {
            addCriterion("FIQ180 is null");
            return (Criteria) this;
        }

        public Criteria andFIQ180IsNotNull() {
            addCriterion("FIQ180 is not null");
            return (Criteria) this;
        }

        public Criteria andFIQ180EqualTo(Double value) {
            addCriterion("FIQ180 =", value, "FIQ180");
            return (Criteria) this;
        }

        public Criteria andFIQ180NotEqualTo(Double value) {
            addCriterion("FIQ180 <>", value, "FIQ180");
            return (Criteria) this;
        }

        public Criteria andFIQ180GreaterThan(Double value) {
            addCriterion("FIQ180 >", value, "FIQ180");
            return (Criteria) this;
        }

        public Criteria andFIQ180GreaterThanOrEqualTo(Double value) {
            addCriterion("FIQ180 >=", value, "FIQ180");
            return (Criteria) this;
        }

        public Criteria andFIQ180LessThan(Double value) {
            addCriterion("FIQ180 <", value, "FIQ180");
            return (Criteria) this;
        }

        public Criteria andFIQ180LessThanOrEqualTo(Double value) {
            addCriterion("FIQ180 <=", value, "FIQ180");
            return (Criteria) this;
        }

        public Criteria andFIQ180In(List<Double> values) {
            addCriterion("FIQ180 in", values, "FIQ180");
            return (Criteria) this;
        }

        public Criteria andFIQ180NotIn(List<Double> values) {
            addCriterion("FIQ180 not in", values, "FIQ180");
            return (Criteria) this;
        }

        public Criteria andFIQ180Between(Double value1, Double value2) {
            addCriterion("FIQ180 between", value1, value2, "FIQ180");
            return (Criteria) this;
        }

        public Criteria andFIQ180NotBetween(Double value1, Double value2) {
            addCriterion("FIQ180 not between", value1, value2, "FIQ180");
            return (Criteria) this;
        }

        public Criteria andFIQ9802IsNull() {
            addCriterion("FIQ9802 is null");
            return (Criteria) this;
        }

        public Criteria andFIQ9802IsNotNull() {
            addCriterion("FIQ9802 is not null");
            return (Criteria) this;
        }

        public Criteria andFIQ9802EqualTo(Double value) {
            addCriterion("FIQ9802 =", value, "FIQ9802");
            return (Criteria) this;
        }

        public Criteria andFIQ9802NotEqualTo(Double value) {
            addCriterion("FIQ9802 <>", value, "FIQ9802");
            return (Criteria) this;
        }

        public Criteria andFIQ9802GreaterThan(Double value) {
            addCriterion("FIQ9802 >", value, "FIQ9802");
            return (Criteria) this;
        }

        public Criteria andFIQ9802GreaterThanOrEqualTo(Double value) {
            addCriterion("FIQ9802 >=", value, "FIQ9802");
            return (Criteria) this;
        }

        public Criteria andFIQ9802LessThan(Double value) {
            addCriterion("FIQ9802 <", value, "FIQ9802");
            return (Criteria) this;
        }

        public Criteria andFIQ9802LessThanOrEqualTo(Double value) {
            addCriterion("FIQ9802 <=", value, "FIQ9802");
            return (Criteria) this;
        }

        public Criteria andFIQ9802In(List<Double> values) {
            addCriterion("FIQ9802 in", values, "FIQ9802");
            return (Criteria) this;
        }

        public Criteria andFIQ9802NotIn(List<Double> values) {
            addCriterion("FIQ9802 not in", values, "FIQ9802");
            return (Criteria) this;
        }

        public Criteria andFIQ9802Between(Double value1, Double value2) {
            addCriterion("FIQ9802 between", value1, value2, "FIQ9802");
            return (Criteria) this;
        }

        public Criteria andFIQ9802NotBetween(Double value1, Double value2) {
            addCriterion("FIQ9802 not between", value1, value2, "FIQ9802");
            return (Criteria) this;
        }

        public Criteria andFIQ9005IsNull() {
            addCriterion("FIQ9005 is null");
            return (Criteria) this;
        }

        public Criteria andFIQ9005IsNotNull() {
            addCriterion("FIQ9005 is not null");
            return (Criteria) this;
        }

        public Criteria andFIQ9005EqualTo(Double value) {
            addCriterion("FIQ9005 =", value, "FIQ9005");
            return (Criteria) this;
        }

        public Criteria andFIQ9005NotEqualTo(Double value) {
            addCriterion("FIQ9005 <>", value, "FIQ9005");
            return (Criteria) this;
        }

        public Criteria andFIQ9005GreaterThan(Double value) {
            addCriterion("FIQ9005 >", value, "FIQ9005");
            return (Criteria) this;
        }

        public Criteria andFIQ9005GreaterThanOrEqualTo(Double value) {
            addCriterion("FIQ9005 >=", value, "FIQ9005");
            return (Criteria) this;
        }

        public Criteria andFIQ9005LessThan(Double value) {
            addCriterion("FIQ9005 <", value, "FIQ9005");
            return (Criteria) this;
        }

        public Criteria andFIQ9005LessThanOrEqualTo(Double value) {
            addCriterion("FIQ9005 <=", value, "FIQ9005");
            return (Criteria) this;
        }

        public Criteria andFIQ9005In(List<Double> values) {
            addCriterion("FIQ9005 in", values, "FIQ9005");
            return (Criteria) this;
        }

        public Criteria andFIQ9005NotIn(List<Double> values) {
            addCriterion("FIQ9005 not in", values, "FIQ9005");
            return (Criteria) this;
        }

        public Criteria andFIQ9005Between(Double value1, Double value2) {
            addCriterion("FIQ9005 between", value1, value2, "FIQ9005");
            return (Criteria) this;
        }

        public Criteria andFIQ9005NotBetween(Double value1, Double value2) {
            addCriterion("FIQ9005 not between", value1, value2, "FIQ9005");
            return (Criteria) this;
        }

        public Criteria andFIQ9803IsNull() {
            addCriterion("FIQ9803 is null");
            return (Criteria) this;
        }

        public Criteria andFIQ9803IsNotNull() {
            addCriterion("FIQ9803 is not null");
            return (Criteria) this;
        }

        public Criteria andFIQ9803EqualTo(Double value) {
            addCriterion("FIQ9803 =", value, "FIQ9803");
            return (Criteria) this;
        }

        public Criteria andFIQ9803NotEqualTo(Double value) {
            addCriterion("FIQ9803 <>", value, "FIQ9803");
            return (Criteria) this;
        }

        public Criteria andFIQ9803GreaterThan(Double value) {
            addCriterion("FIQ9803 >", value, "FIQ9803");
            return (Criteria) this;
        }

        public Criteria andFIQ9803GreaterThanOrEqualTo(Double value) {
            addCriterion("FIQ9803 >=", value, "FIQ9803");
            return (Criteria) this;
        }

        public Criteria andFIQ9803LessThan(Double value) {
            addCriterion("FIQ9803 <", value, "FIQ9803");
            return (Criteria) this;
        }

        public Criteria andFIQ9803LessThanOrEqualTo(Double value) {
            addCriterion("FIQ9803 <=", value, "FIQ9803");
            return (Criteria) this;
        }

        public Criteria andFIQ9803In(List<Double> values) {
            addCriterion("FIQ9803 in", values, "FIQ9803");
            return (Criteria) this;
        }

        public Criteria andFIQ9803NotIn(List<Double> values) {
            addCriterion("FIQ9803 not in", values, "FIQ9803");
            return (Criteria) this;
        }

        public Criteria andFIQ9803Between(Double value1, Double value2) {
            addCriterion("FIQ9803 between", value1, value2, "FIQ9803");
            return (Criteria) this;
        }

        public Criteria andFIQ9803NotBetween(Double value1, Double value2) {
            addCriterion("FIQ9803 not between", value1, value2, "FIQ9803");
            return (Criteria) this;
        }

        public Criteria andFIQ116IsNull() {
            addCriterion("FIQ116 is null");
            return (Criteria) this;
        }

        public Criteria andFIQ116IsNotNull() {
            addCriterion("FIQ116 is not null");
            return (Criteria) this;
        }

        public Criteria andFIQ116EqualTo(Double value) {
            addCriterion("FIQ116 =", value, "FIQ116");
            return (Criteria) this;
        }

        public Criteria andFIQ116NotEqualTo(Double value) {
            addCriterion("FIQ116 <>", value, "FIQ116");
            return (Criteria) this;
        }

        public Criteria andFIQ116GreaterThan(Double value) {
            addCriterion("FIQ116 >", value, "FIQ116");
            return (Criteria) this;
        }

        public Criteria andFIQ116GreaterThanOrEqualTo(Double value) {
            addCriterion("FIQ116 >=", value, "FIQ116");
            return (Criteria) this;
        }

        public Criteria andFIQ116LessThan(Double value) {
            addCriterion("FIQ116 <", value, "FIQ116");
            return (Criteria) this;
        }

        public Criteria andFIQ116LessThanOrEqualTo(Double value) {
            addCriterion("FIQ116 <=", value, "FIQ116");
            return (Criteria) this;
        }

        public Criteria andFIQ116In(List<Double> values) {
            addCriterion("FIQ116 in", values, "FIQ116");
            return (Criteria) this;
        }

        public Criteria andFIQ116NotIn(List<Double> values) {
            addCriterion("FIQ116 not in", values, "FIQ116");
            return (Criteria) this;
        }

        public Criteria andFIQ116Between(Double value1, Double value2) {
            addCriterion("FIQ116 between", value1, value2, "FIQ116");
            return (Criteria) this;
        }

        public Criteria andFIQ116NotBetween(Double value1, Double value2) {
            addCriterion("FIQ116 not between", value1, value2, "FIQ116");
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