package com.letsball.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TMatchFootballMemberExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    public TMatchFootballMemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
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
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMmIdIsNull() {
            addCriterion("MM_ID is null");
            return (Criteria) this;
        }

        public Criteria andMmIdIsNotNull() {
            addCriterion("MM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMmIdEqualTo(Integer value) {
            addCriterion("MM_ID =", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdNotEqualTo(Integer value) {
            addCriterion("MM_ID <>", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdGreaterThan(Integer value) {
            addCriterion("MM_ID >", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MM_ID >=", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdLessThan(Integer value) {
            addCriterion("MM_ID <", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdLessThanOrEqualTo(Integer value) {
            addCriterion("MM_ID <=", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdIn(List<Integer> values) {
            addCriterion("MM_ID in", values, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdNotIn(List<Integer> values) {
            addCriterion("MM_ID not in", values, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdBetween(Integer value1, Integer value2) {
            addCriterion("MM_ID between", value1, value2, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MM_ID not between", value1, value2, "mmId");
            return (Criteria) this;
        }

        public Criteria andMIdIsNull() {
            addCriterion("M_ID is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("M_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("M_ID =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("M_ID <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("M_ID >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_ID >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("M_ID <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("M_ID <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("M_ID in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("M_ID not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("M_ID between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("M_ID not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andTIdIsNull() {
            addCriterion("T_ID is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("T_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("T_ID =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("T_ID <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("T_ID >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_ID >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("T_ID <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_ID <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("T_ID in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("T_ID not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("T_ID between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_ID not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionIsNull() {
            addCriterion("MATCH_MEMBER_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionIsNotNull() {
            addCriterion("MATCH_MEMBER_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionEqualTo(String value) {
            addCriterion("MATCH_MEMBER_POSITION =", value, "matchMemberPosition");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionNotEqualTo(String value) {
            addCriterion("MATCH_MEMBER_POSITION <>", value, "matchMemberPosition");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionGreaterThan(String value) {
            addCriterion("MATCH_MEMBER_POSITION >", value, "matchMemberPosition");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_MEMBER_POSITION >=", value, "matchMemberPosition");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionLessThan(String value) {
            addCriterion("MATCH_MEMBER_POSITION <", value, "matchMemberPosition");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionLessThanOrEqualTo(String value) {
            addCriterion("MATCH_MEMBER_POSITION <=", value, "matchMemberPosition");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionLike(String value) {
            addCriterion("MATCH_MEMBER_POSITION like", value, "matchMemberPosition");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionNotLike(String value) {
            addCriterion("MATCH_MEMBER_POSITION not like", value, "matchMemberPosition");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionIn(List<String> values) {
            addCriterion("MATCH_MEMBER_POSITION in", values, "matchMemberPosition");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionNotIn(List<String> values) {
            addCriterion("MATCH_MEMBER_POSITION not in", values, "matchMemberPosition");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionBetween(String value1, String value2) {
            addCriterion("MATCH_MEMBER_POSITION between", value1, value2, "matchMemberPosition");
            return (Criteria) this;
        }

        public Criteria andMatchMemberPositionNotBetween(String value1, String value2) {
            addCriterion("MATCH_MEMBER_POSITION not between", value1, value2, "matchMemberPosition");
            return (Criteria) this;
        }

        public Criteria andInputNameIsNull() {
            addCriterion("INPUT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInputNameIsNotNull() {
            addCriterion("INPUT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInputNameEqualTo(String value) {
            addCriterion("INPUT_NAME =", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameNotEqualTo(String value) {
            addCriterion("INPUT_NAME <>", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameGreaterThan(String value) {
            addCriterion("INPUT_NAME >", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_NAME >=", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameLessThan(String value) {
            addCriterion("INPUT_NAME <", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameLessThanOrEqualTo(String value) {
            addCriterion("INPUT_NAME <=", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameLike(String value) {
            addCriterion("INPUT_NAME like", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameNotLike(String value) {
            addCriterion("INPUT_NAME not like", value, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameIn(List<String> values) {
            addCriterion("INPUT_NAME in", values, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameNotIn(List<String> values) {
            addCriterion("INPUT_NAME not in", values, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameBetween(String value1, String value2) {
            addCriterion("INPUT_NAME between", value1, value2, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputNameNotBetween(String value1, String value2) {
            addCriterion("INPUT_NAME not between", value1, value2, "inputName");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNull() {
            addCriterion("INPUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNotNull() {
            addCriterion("INPUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInputDateEqualTo(Date value) {
            addCriterionForJDBCDate("INPUT_DATE =", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("INPUT_DATE <>", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThan(Date value) {
            addCriterionForJDBCDate("INPUT_DATE >", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INPUT_DATE >=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThan(Date value) {
            addCriterionForJDBCDate("INPUT_DATE <", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INPUT_DATE <=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateIn(List<Date> values) {
            addCriterionForJDBCDate("INPUT_DATE in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("INPUT_DATE not in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INPUT_DATE between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INPUT_DATE not between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNull() {
            addCriterion("UPDATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNotNull() {
            addCriterion("UPDATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameEqualTo(String value) {
            addCriterion("UPDATE_NAME =", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotEqualTo(String value) {
            addCriterion("UPDATE_NAME <>", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThan(String value) {
            addCriterion("UPDATE_NAME >", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_NAME >=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThan(String value) {
            addCriterion("UPDATE_NAME <", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_NAME <=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLike(String value) {
            addCriterion("UPDATE_NAME like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotLike(String value) {
            addCriterion("UPDATE_NAME not like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIn(List<String> values) {
            addCriterion("UPDATE_NAME in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotIn(List<String> values) {
            addCriterion("UPDATE_NAME not in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameBetween(String value1, String value2) {
            addCriterion("UPDATE_NAME between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotBetween(String value1, String value2) {
            addCriterion("UPDATE_NAME not between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andDelsignIsNull() {
            addCriterion("DELSIGN is null");
            return (Criteria) this;
        }

        public Criteria andDelsignIsNotNull() {
            addCriterion("DELSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andDelsignEqualTo(Integer value) {
            addCriterion("DELSIGN =", value, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignNotEqualTo(Integer value) {
            addCriterion("DELSIGN <>", value, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignGreaterThan(Integer value) {
            addCriterion("DELSIGN >", value, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELSIGN >=", value, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignLessThan(Integer value) {
            addCriterion("DELSIGN <", value, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignLessThanOrEqualTo(Integer value) {
            addCriterion("DELSIGN <=", value, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignIn(List<Integer> values) {
            addCriterion("DELSIGN in", values, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignNotIn(List<Integer> values) {
            addCriterion("DELSIGN not in", values, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignBetween(Integer value1, Integer value2) {
            addCriterion("DELSIGN between", value1, value2, "delsign");
            return (Criteria) this;
        }

        public Criteria andDelsignNotBetween(Integer value1, Integer value2) {
            addCriterion("DELSIGN not between", value1, value2, "delsign");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_match_football_member
     *
     * @mbggenerated do_not_delete_during_merge Tue Oct 13 13:07:36 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
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