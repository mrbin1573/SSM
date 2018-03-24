package com.saitejn.pojo;

import java.util.ArrayList;
import java.util.List;

public class FileupifoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileupifoExample() {
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

        public Criteria andFilupidIsNull() {
            addCriterion("filupid is null");
            return (Criteria) this;
        }

        public Criteria andFilupidIsNotNull() {
            addCriterion("filupid is not null");
            return (Criteria) this;
        }

        public Criteria andFilupidEqualTo(Integer value) {
            addCriterion("filupid =", value, "filupid");
            return (Criteria) this;
        }

        public Criteria andFilupidNotEqualTo(Integer value) {
            addCriterion("filupid <>", value, "filupid");
            return (Criteria) this;
        }

        public Criteria andFilupidGreaterThan(Integer value) {
            addCriterion("filupid >", value, "filupid");
            return (Criteria) this;
        }

        public Criteria andFilupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("filupid >=", value, "filupid");
            return (Criteria) this;
        }

        public Criteria andFilupidLessThan(Integer value) {
            addCriterion("filupid <", value, "filupid");
            return (Criteria) this;
        }

        public Criteria andFilupidLessThanOrEqualTo(Integer value) {
            addCriterion("filupid <=", value, "filupid");
            return (Criteria) this;
        }

        public Criteria andFilupidIn(List<Integer> values) {
            addCriterion("filupid in", values, "filupid");
            return (Criteria) this;
        }

        public Criteria andFilupidNotIn(List<Integer> values) {
            addCriterion("filupid not in", values, "filupid");
            return (Criteria) this;
        }

        public Criteria andFilupidBetween(Integer value1, Integer value2) {
            addCriterion("filupid between", value1, value2, "filupid");
            return (Criteria) this;
        }

        public Criteria andFilupidNotBetween(Integer value1, Integer value2) {
            addCriterion("filupid not between", value1, value2, "filupid");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("uptime is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("uptime is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(String value) {
            addCriterion("uptime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(String value) {
            addCriterion("uptime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(String value) {
            addCriterion("uptime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(String value) {
            addCriterion("uptime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(String value) {
            addCriterion("uptime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(String value) {
            addCriterion("uptime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLike(String value) {
            addCriterion("uptime like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotLike(String value) {
            addCriterion("uptime not like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<String> values) {
            addCriterion("uptime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<String> values) {
            addCriterion("uptime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(String value1, String value2) {
            addCriterion("uptime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(String value1, String value2) {
            addCriterion("uptime not between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUpnameIsNull() {
            addCriterion("upname is null");
            return (Criteria) this;
        }

        public Criteria andUpnameIsNotNull() {
            addCriterion("upname is not null");
            return (Criteria) this;
        }

        public Criteria andUpnameEqualTo(String value) {
            addCriterion("upname =", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameNotEqualTo(String value) {
            addCriterion("upname <>", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameGreaterThan(String value) {
            addCriterion("upname >", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameGreaterThanOrEqualTo(String value) {
            addCriterion("upname >=", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameLessThan(String value) {
            addCriterion("upname <", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameLessThanOrEqualTo(String value) {
            addCriterion("upname <=", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameLike(String value) {
            addCriterion("upname like", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameNotLike(String value) {
            addCriterion("upname not like", value, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameIn(List<String> values) {
            addCriterion("upname in", values, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameNotIn(List<String> values) {
            addCriterion("upname not in", values, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameBetween(String value1, String value2) {
            addCriterion("upname between", value1, value2, "upname");
            return (Criteria) this;
        }

        public Criteria andUpnameNotBetween(String value1, String value2) {
            addCriterion("upname not between", value1, value2, "upname");
            return (Criteria) this;
        }

        public Criteria andUppersonIsNull() {
            addCriterion("upperson is null");
            return (Criteria) this;
        }

        public Criteria andUppersonIsNotNull() {
            addCriterion("upperson is not null");
            return (Criteria) this;
        }

        public Criteria andUppersonEqualTo(String value) {
            addCriterion("upperson =", value, "upperson");
            return (Criteria) this;
        }

        public Criteria andUppersonNotEqualTo(String value) {
            addCriterion("upperson <>", value, "upperson");
            return (Criteria) this;
        }

        public Criteria andUppersonGreaterThan(String value) {
            addCriterion("upperson >", value, "upperson");
            return (Criteria) this;
        }

        public Criteria andUppersonGreaterThanOrEqualTo(String value) {
            addCriterion("upperson >=", value, "upperson");
            return (Criteria) this;
        }

        public Criteria andUppersonLessThan(String value) {
            addCriterion("upperson <", value, "upperson");
            return (Criteria) this;
        }

        public Criteria andUppersonLessThanOrEqualTo(String value) {
            addCriterion("upperson <=", value, "upperson");
            return (Criteria) this;
        }

        public Criteria andUppersonLike(String value) {
            addCriterion("upperson like", value, "upperson");
            return (Criteria) this;
        }

        public Criteria andUppersonNotLike(String value) {
            addCriterion("upperson not like", value, "upperson");
            return (Criteria) this;
        }

        public Criteria andUppersonIn(List<String> values) {
            addCriterion("upperson in", values, "upperson");
            return (Criteria) this;
        }

        public Criteria andUppersonNotIn(List<String> values) {
            addCriterion("upperson not in", values, "upperson");
            return (Criteria) this;
        }

        public Criteria andUppersonBetween(String value1, String value2) {
            addCriterion("upperson between", value1, value2, "upperson");
            return (Criteria) this;
        }

        public Criteria andUppersonNotBetween(String value1, String value2) {
            addCriterion("upperson not between", value1, value2, "upperson");
            return (Criteria) this;
        }

        public Criteria andFiltypeIsNull() {
            addCriterion("filtype is null");
            return (Criteria) this;
        }

        public Criteria andFiltypeIsNotNull() {
            addCriterion("filtype is not null");
            return (Criteria) this;
        }

        public Criteria andFiltypeEqualTo(String value) {
            addCriterion("filtype =", value, "filtype");
            return (Criteria) this;
        }

        public Criteria andFiltypeNotEqualTo(String value) {
            addCriterion("filtype <>", value, "filtype");
            return (Criteria) this;
        }

        public Criteria andFiltypeGreaterThan(String value) {
            addCriterion("filtype >", value, "filtype");
            return (Criteria) this;
        }

        public Criteria andFiltypeGreaterThanOrEqualTo(String value) {
            addCriterion("filtype >=", value, "filtype");
            return (Criteria) this;
        }

        public Criteria andFiltypeLessThan(String value) {
            addCriterion("filtype <", value, "filtype");
            return (Criteria) this;
        }

        public Criteria andFiltypeLessThanOrEqualTo(String value) {
            addCriterion("filtype <=", value, "filtype");
            return (Criteria) this;
        }

        public Criteria andFiltypeLike(String value) {
            addCriterion("filtype like", value, "filtype");
            return (Criteria) this;
        }

        public Criteria andFiltypeNotLike(String value) {
            addCriterion("filtype not like", value, "filtype");
            return (Criteria) this;
        }

        public Criteria andFiltypeIn(List<String> values) {
            addCriterion("filtype in", values, "filtype");
            return (Criteria) this;
        }

        public Criteria andFiltypeNotIn(List<String> values) {
            addCriterion("filtype not in", values, "filtype");
            return (Criteria) this;
        }

        public Criteria andFiltypeBetween(String value1, String value2) {
            addCriterion("filtype between", value1, value2, "filtype");
            return (Criteria) this;
        }

        public Criteria andFiltypeNotBetween(String value1, String value2) {
            addCriterion("filtype not between", value1, value2, "filtype");
            return (Criteria) this;
        }

        public Criteria andFileenameIsNull() {
            addCriterion("fileename is null");
            return (Criteria) this;
        }

        public Criteria andFileenameIsNotNull() {
            addCriterion("fileename is not null");
            return (Criteria) this;
        }

        public Criteria andFileenameEqualTo(String value) {
            addCriterion("fileename =", value, "fileename");
            return (Criteria) this;
        }

        public Criteria andFileenameNotEqualTo(String value) {
            addCriterion("fileename <>", value, "fileename");
            return (Criteria) this;
        }

        public Criteria andFileenameGreaterThan(String value) {
            addCriterion("fileename >", value, "fileename");
            return (Criteria) this;
        }

        public Criteria andFileenameGreaterThanOrEqualTo(String value) {
            addCriterion("fileename >=", value, "fileename");
            return (Criteria) this;
        }

        public Criteria andFileenameLessThan(String value) {
            addCriterion("fileename <", value, "fileename");
            return (Criteria) this;
        }

        public Criteria andFileenameLessThanOrEqualTo(String value) {
            addCriterion("fileename <=", value, "fileename");
            return (Criteria) this;
        }

        public Criteria andFileenameLike(String value) {
            addCriterion("fileename like", value, "fileename");
            return (Criteria) this;
        }

        public Criteria andFileenameNotLike(String value) {
            addCriterion("fileename not like", value, "fileename");
            return (Criteria) this;
        }

        public Criteria andFileenameIn(List<String> values) {
            addCriterion("fileename in", values, "fileename");
            return (Criteria) this;
        }

        public Criteria andFileenameNotIn(List<String> values) {
            addCriterion("fileename not in", values, "fileename");
            return (Criteria) this;
        }

        public Criteria andFileenameBetween(String value1, String value2) {
            addCriterion("fileename between", value1, value2, "fileename");
            return (Criteria) this;
        }

        public Criteria andFileenameNotBetween(String value1, String value2) {
            addCriterion("fileename not between", value1, value2, "fileename");
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