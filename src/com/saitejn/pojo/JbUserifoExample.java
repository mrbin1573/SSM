package com.saitejn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JbUserifoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JbUserifoExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUloginnameIsNull() {
            addCriterion("uloginname is null");
            return (Criteria) this;
        }

        public Criteria andUloginnameIsNotNull() {
            addCriterion("uloginname is not null");
            return (Criteria) this;
        }

        public Criteria andUloginnameEqualTo(String value) {
            addCriterion("uloginname =", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameNotEqualTo(String value) {
            addCriterion("uloginname <>", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameGreaterThan(String value) {
            addCriterion("uloginname >", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameGreaterThanOrEqualTo(String value) {
            addCriterion("uloginname >=", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameLessThan(String value) {
            addCriterion("uloginname <", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameLessThanOrEqualTo(String value) {
            addCriterion("uloginname <=", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameLike(String value) {
            addCriterion("uloginname like", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameNotLike(String value) {
            addCriterion("uloginname not like", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameIn(List<String> values) {
            addCriterion("uloginname in", values, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameNotIn(List<String> values) {
            addCriterion("uloginname not in", values, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameBetween(String value1, String value2) {
            addCriterion("uloginname between", value1, value2, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameNotBetween(String value1, String value2) {
            addCriterion("uloginname not between", value1, value2, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginpassIsNull() {
            addCriterion("uloginpass is null");
            return (Criteria) this;
        }

        public Criteria andUloginpassIsNotNull() {
            addCriterion("uloginpass is not null");
            return (Criteria) this;
        }

        public Criteria andUloginpassEqualTo(String value) {
            addCriterion("uloginpass =", value, "uloginpass");
            return (Criteria) this;
        }

        public Criteria andUloginpassNotEqualTo(String value) {
            addCriterion("uloginpass <>", value, "uloginpass");
            return (Criteria) this;
        }

        public Criteria andUloginpassGreaterThan(String value) {
            addCriterion("uloginpass >", value, "uloginpass");
            return (Criteria) this;
        }

        public Criteria andUloginpassGreaterThanOrEqualTo(String value) {
            addCriterion("uloginpass >=", value, "uloginpass");
            return (Criteria) this;
        }

        public Criteria andUloginpassLessThan(String value) {
            addCriterion("uloginpass <", value, "uloginpass");
            return (Criteria) this;
        }

        public Criteria andUloginpassLessThanOrEqualTo(String value) {
            addCriterion("uloginpass <=", value, "uloginpass");
            return (Criteria) this;
        }

        public Criteria andUloginpassLike(String value) {
            addCriterion("uloginpass like", value, "uloginpass");
            return (Criteria) this;
        }

        public Criteria andUloginpassNotLike(String value) {
            addCriterion("uloginpass not like", value, "uloginpass");
            return (Criteria) this;
        }

        public Criteria andUloginpassIn(List<String> values) {
            addCriterion("uloginpass in", values, "uloginpass");
            return (Criteria) this;
        }

        public Criteria andUloginpassNotIn(List<String> values) {
            addCriterion("uloginpass not in", values, "uloginpass");
            return (Criteria) this;
        }

        public Criteria andUloginpassBetween(String value1, String value2) {
            addCriterion("uloginpass between", value1, value2, "uloginpass");
            return (Criteria) this;
        }

        public Criteria andUloginpassNotBetween(String value1, String value2) {
            addCriterion("uloginpass not between", value1, value2, "uloginpass");
            return (Criteria) this;
        }

        public Criteria andUtruenameIsNull() {
            addCriterion("utruename is null");
            return (Criteria) this;
        }

        public Criteria andUtruenameIsNotNull() {
            addCriterion("utruename is not null");
            return (Criteria) this;
        }

        public Criteria andUtruenameEqualTo(String value) {
            addCriterion("utruename =", value, "utruename");
            return (Criteria) this;
        }

        public Criteria andUtruenameNotEqualTo(String value) {
            addCriterion("utruename <>", value, "utruename");
            return (Criteria) this;
        }

        public Criteria andUtruenameGreaterThan(String value) {
            addCriterion("utruename >", value, "utruename");
            return (Criteria) this;
        }

        public Criteria andUtruenameGreaterThanOrEqualTo(String value) {
            addCriterion("utruename >=", value, "utruename");
            return (Criteria) this;
        }

        public Criteria andUtruenameLessThan(String value) {
            addCriterion("utruename <", value, "utruename");
            return (Criteria) this;
        }

        public Criteria andUtruenameLessThanOrEqualTo(String value) {
            addCriterion("utruename <=", value, "utruename");
            return (Criteria) this;
        }

        public Criteria andUtruenameLike(String value) {
            addCriterion("utruename like", value, "utruename");
            return (Criteria) this;
        }

        public Criteria andUtruenameNotLike(String value) {
            addCriterion("utruename not like", value, "utruename");
            return (Criteria) this;
        }

        public Criteria andUtruenameIn(List<String> values) {
            addCriterion("utruename in", values, "utruename");
            return (Criteria) this;
        }

        public Criteria andUtruenameNotIn(List<String> values) {
            addCriterion("utruename not in", values, "utruename");
            return (Criteria) this;
        }

        public Criteria andUtruenameBetween(String value1, String value2) {
            addCriterion("utruename between", value1, value2, "utruename");
            return (Criteria) this;
        }

        public Criteria andUtruenameNotBetween(String value1, String value2) {
            addCriterion("utruename not between", value1, value2, "utruename");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNull() {
            addCriterion("uphone is null");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNotNull() {
            addCriterion("uphone is not null");
            return (Criteria) this;
        }

        public Criteria andUphoneEqualTo(String value) {
            addCriterion("uphone =", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotEqualTo(String value) {
            addCriterion("uphone <>", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThan(String value) {
            addCriterion("uphone >", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThanOrEqualTo(String value) {
            addCriterion("uphone >=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThan(String value) {
            addCriterion("uphone <", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThanOrEqualTo(String value) {
            addCriterion("uphone <=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLike(String value) {
            addCriterion("uphone like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotLike(String value) {
            addCriterion("uphone not like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneIn(List<String> values) {
            addCriterion("uphone in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotIn(List<String> values) {
            addCriterion("uphone not in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneBetween(String value1, String value2) {
            addCriterion("uphone between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotBetween(String value1, String value2) {
            addCriterion("uphone not between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUcycleIsNull() {
            addCriterion("ucycle is null");
            return (Criteria) this;
        }

        public Criteria andUcycleIsNotNull() {
            addCriterion("ucycle is not null");
            return (Criteria) this;
        }

        public Criteria andUcycleEqualTo(Integer value) {
            addCriterion("ucycle =", value, "ucycle");
            return (Criteria) this;
        }

        public Criteria andUcycleNotEqualTo(Integer value) {
            addCriterion("ucycle <>", value, "ucycle");
            return (Criteria) this;
        }

        public Criteria andUcycleGreaterThan(Integer value) {
            addCriterion("ucycle >", value, "ucycle");
            return (Criteria) this;
        }

        public Criteria andUcycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("ucycle >=", value, "ucycle");
            return (Criteria) this;
        }

        public Criteria andUcycleLessThan(Integer value) {
            addCriterion("ucycle <", value, "ucycle");
            return (Criteria) this;
        }

        public Criteria andUcycleLessThanOrEqualTo(Integer value) {
            addCriterion("ucycle <=", value, "ucycle");
            return (Criteria) this;
        }

        public Criteria andUcycleIn(List<Integer> values) {
            addCriterion("ucycle in", values, "ucycle");
            return (Criteria) this;
        }

        public Criteria andUcycleNotIn(List<Integer> values) {
            addCriterion("ucycle not in", values, "ucycle");
            return (Criteria) this;
        }

        public Criteria andUcycleBetween(Integer value1, Integer value2) {
            addCriterion("ucycle between", value1, value2, "ucycle");
            return (Criteria) this;
        }

        public Criteria andUcycleNotBetween(Integer value1, Integer value2) {
            addCriterion("ucycle not between", value1, value2, "ucycle");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andHeadimageIsNull() {
            addCriterion("headimage is null");
            return (Criteria) this;
        }

        public Criteria andHeadimageIsNotNull() {
            addCriterion("headimage is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimageEqualTo(String value) {
            addCriterion("headimage =", value, "headimage");
            return (Criteria) this;
        }

        public Criteria andHeadimageNotEqualTo(String value) {
            addCriterion("headimage <>", value, "headimage");
            return (Criteria) this;
        }

        public Criteria andHeadimageGreaterThan(String value) {
            addCriterion("headimage >", value, "headimage");
            return (Criteria) this;
        }

        public Criteria andHeadimageGreaterThanOrEqualTo(String value) {
            addCriterion("headimage >=", value, "headimage");
            return (Criteria) this;
        }

        public Criteria andHeadimageLessThan(String value) {
            addCriterion("headimage <", value, "headimage");
            return (Criteria) this;
        }

        public Criteria andHeadimageLessThanOrEqualTo(String value) {
            addCriterion("headimage <=", value, "headimage");
            return (Criteria) this;
        }

        public Criteria andHeadimageLike(String value) {
            addCriterion("headimage like", value, "headimage");
            return (Criteria) this;
        }

        public Criteria andHeadimageNotLike(String value) {
            addCriterion("headimage not like", value, "headimage");
            return (Criteria) this;
        }

        public Criteria andHeadimageIn(List<String> values) {
            addCriterion("headimage in", values, "headimage");
            return (Criteria) this;
        }

        public Criteria andHeadimageNotIn(List<String> values) {
            addCriterion("headimage not in", values, "headimage");
            return (Criteria) this;
        }

        public Criteria andHeadimageBetween(String value1, String value2) {
            addCriterion("headimage between", value1, value2, "headimage");
            return (Criteria) this;
        }

        public Criteria andHeadimageNotBetween(String value1, String value2) {
            addCriterion("headimage not between", value1, value2, "headimage");
            return (Criteria) this;
        }

        public Criteria andClassinfoIsNull() {
            addCriterion("classinfo is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoIsNotNull() {
            addCriterion("classinfo is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoEqualTo(String value) {
            addCriterion("classinfo =", value, "classinfo");
            return (Criteria) this;
        }

        public Criteria andClassinfoNotEqualTo(String value) {
            addCriterion("classinfo <>", value, "classinfo");
            return (Criteria) this;
        }

        public Criteria andClassinfoGreaterThan(String value) {
            addCriterion("classinfo >", value, "classinfo");
            return (Criteria) this;
        }

        public Criteria andClassinfoGreaterThanOrEqualTo(String value) {
            addCriterion("classinfo >=", value, "classinfo");
            return (Criteria) this;
        }

        public Criteria andClassinfoLessThan(String value) {
            addCriterion("classinfo <", value, "classinfo");
            return (Criteria) this;
        }

        public Criteria andClassinfoLessThanOrEqualTo(String value) {
            addCriterion("classinfo <=", value, "classinfo");
            return (Criteria) this;
        }

        public Criteria andClassinfoLike(String value) {
            addCriterion("classinfo like", value, "classinfo");
            return (Criteria) this;
        }

        public Criteria andClassinfoNotLike(String value) {
            addCriterion("classinfo not like", value, "classinfo");
            return (Criteria) this;
        }

        public Criteria andClassinfoIn(List<String> values) {
            addCriterion("classinfo in", values, "classinfo");
            return (Criteria) this;
        }

        public Criteria andClassinfoNotIn(List<String> values) {
            addCriterion("classinfo not in", values, "classinfo");
            return (Criteria) this;
        }

        public Criteria andClassinfoBetween(String value1, String value2) {
            addCriterion("classinfo between", value1, value2, "classinfo");
            return (Criteria) this;
        }

        public Criteria andClassinfoNotBetween(String value1, String value2) {
            addCriterion("classinfo not between", value1, value2, "classinfo");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIsNull() {
            addCriterion("Jurisdiction is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIsNotNull() {
            addCriterion("Jurisdiction is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionEqualTo(String value) {
            addCriterion("Jurisdiction =", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNotEqualTo(String value) {
            addCriterion("Jurisdiction <>", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionGreaterThan(String value) {
            addCriterion("Jurisdiction >", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionGreaterThanOrEqualTo(String value) {
            addCriterion("Jurisdiction >=", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionLessThan(String value) {
            addCriterion("Jurisdiction <", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionLessThanOrEqualTo(String value) {
            addCriterion("Jurisdiction <=", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionLike(String value) {
            addCriterion("Jurisdiction like", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNotLike(String value) {
            addCriterion("Jurisdiction not like", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIn(List<String> values) {
            addCriterion("Jurisdiction in", values, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNotIn(List<String> values) {
            addCriterion("Jurisdiction not in", values, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionBetween(String value1, String value2) {
            addCriterion("Jurisdiction between", value1, value2, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNotBetween(String value1, String value2) {
            addCriterion("Jurisdiction not between", value1, value2, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNull() {
            addCriterion("lastLogin is null");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNotNull() {
            addCriterion("lastLogin is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginEqualTo(Date value) {
            addCriterion("lastLogin =", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotEqualTo(Date value) {
            addCriterion("lastLogin <>", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThan(Date value) {
            addCriterion("lastLogin >", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLogin >=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThan(Date value) {
            addCriterion("lastLogin <", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThanOrEqualTo(Date value) {
            addCriterion("lastLogin <=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginIn(List<Date> values) {
            addCriterion("lastLogin in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotIn(List<Date> values) {
            addCriterion("lastLogin not in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginBetween(Date value1, Date value2) {
            addCriterion("lastLogin between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotBetween(Date value1, Date value2) {
            addCriterion("lastLogin not between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastexitIsNull() {
            addCriterion("lastexit is null");
            return (Criteria) this;
        }

        public Criteria andLastexitIsNotNull() {
            addCriterion("lastexit is not null");
            return (Criteria) this;
        }

        public Criteria andLastexitEqualTo(Date value) {
            addCriterion("lastexit =", value, "lastexit");
            return (Criteria) this;
        }

        public Criteria andLastexitNotEqualTo(Date value) {
            addCriterion("lastexit <>", value, "lastexit");
            return (Criteria) this;
        }

        public Criteria andLastexitGreaterThan(Date value) {
            addCriterion("lastexit >", value, "lastexit");
            return (Criteria) this;
        }

        public Criteria andLastexitGreaterThanOrEqualTo(Date value) {
            addCriterion("lastexit >=", value, "lastexit");
            return (Criteria) this;
        }

        public Criteria andLastexitLessThan(Date value) {
            addCriterion("lastexit <", value, "lastexit");
            return (Criteria) this;
        }

        public Criteria andLastexitLessThanOrEqualTo(Date value) {
            addCriterion("lastexit <=", value, "lastexit");
            return (Criteria) this;
        }

        public Criteria andLastexitIn(List<Date> values) {
            addCriterion("lastexit in", values, "lastexit");
            return (Criteria) this;
        }

        public Criteria andLastexitNotIn(List<Date> values) {
            addCriterion("lastexit not in", values, "lastexit");
            return (Criteria) this;
        }

        public Criteria andLastexitBetween(Date value1, Date value2) {
            addCriterion("lastexit between", value1, value2, "lastexit");
            return (Criteria) this;
        }

        public Criteria andLastexitNotBetween(Date value1, Date value2) {
            addCriterion("lastexit not between", value1, value2, "lastexit");
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