package com.letsball.entity;

import java.util.Date;

public class TMatchFootball {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.M_ID
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Long mId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.MATCH_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Date matchDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.MATCH_ADDRESS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private String matchAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.MATCH_ORGANIZER
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Long matchOrganizer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.MATCH_KEEPER_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Long matchKeeperMembers;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.MATCH_DEFENDER_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Long matchDefenderMembers;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.MATCH_MIDFIELDER_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Long matchMidfielderMembers;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.MATCH_STRIKER_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Long matchStrikerMembers;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.MATCH_REFEREE_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Long matchRefereeMembers;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.MATCH_TEAMA_ID
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Long matchTeamaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.MATCH_TEAMB_ID
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Long matchTeambId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.INPUT_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private String inputName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.INPUT_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Date inputDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.UPDATE_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private String updateName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.UPDATE_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_match_football.DELSIGN
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Short delsign;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.M_ID
     *
     * @return the value of t_match_football.M_ID
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Long getmId() {
        return mId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.M_ID
     *
     * @param mId the value for t_match_football.M_ID
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setmId(Long mId) {
        this.mId = mId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.MATCH_DATE
     *
     * @return the value of t_match_football.MATCH_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Date getMatchDate() {
        return matchDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.MATCH_DATE
     *
     * @param matchDate the value for t_match_football.MATCH_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.MATCH_ADDRESS
     *
     * @return the value of t_match_football.MATCH_ADDRESS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public String getMatchAddress() {
        return matchAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.MATCH_ADDRESS
     *
     * @param matchAddress the value for t_match_football.MATCH_ADDRESS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setMatchAddress(String matchAddress) {
        this.matchAddress = matchAddress == null ? null : matchAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.MATCH_ORGANIZER
     *
     * @return the value of t_match_football.MATCH_ORGANIZER
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Long getMatchOrganizer() {
        return matchOrganizer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.MATCH_ORGANIZER
     *
     * @param matchOrganizer the value for t_match_football.MATCH_ORGANIZER
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setMatchOrganizer(Long matchOrganizer) {
        this.matchOrganizer = matchOrganizer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.MATCH_KEEPER_MEMBERS
     *
     * @return the value of t_match_football.MATCH_KEEPER_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Long getMatchKeeperMembers() {
        return matchKeeperMembers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.MATCH_KEEPER_MEMBERS
     *
     * @param matchKeeperMembers the value for t_match_football.MATCH_KEEPER_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setMatchKeeperMembers(Long matchKeeperMembers) {
        this.matchKeeperMembers = matchKeeperMembers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.MATCH_DEFENDER_MEMBERS
     *
     * @return the value of t_match_football.MATCH_DEFENDER_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Long getMatchDefenderMembers() {
        return matchDefenderMembers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.MATCH_DEFENDER_MEMBERS
     *
     * @param matchDefenderMembers the value for t_match_football.MATCH_DEFENDER_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setMatchDefenderMembers(Long matchDefenderMembers) {
        this.matchDefenderMembers = matchDefenderMembers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.MATCH_MIDFIELDER_MEMBERS
     *
     * @return the value of t_match_football.MATCH_MIDFIELDER_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Long getMatchMidfielderMembers() {
        return matchMidfielderMembers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.MATCH_MIDFIELDER_MEMBERS
     *
     * @param matchMidfielderMembers the value for t_match_football.MATCH_MIDFIELDER_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setMatchMidfielderMembers(Long matchMidfielderMembers) {
        this.matchMidfielderMembers = matchMidfielderMembers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.MATCH_STRIKER_MEMBERS
     *
     * @return the value of t_match_football.MATCH_STRIKER_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Long getMatchStrikerMembers() {
        return matchStrikerMembers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.MATCH_STRIKER_MEMBERS
     *
     * @param matchStrikerMembers the value for t_match_football.MATCH_STRIKER_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setMatchStrikerMembers(Long matchStrikerMembers) {
        this.matchStrikerMembers = matchStrikerMembers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.MATCH_REFEREE_MEMBERS
     *
     * @return the value of t_match_football.MATCH_REFEREE_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Long getMatchRefereeMembers() {
        return matchRefereeMembers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.MATCH_REFEREE_MEMBERS
     *
     * @param matchRefereeMembers the value for t_match_football.MATCH_REFEREE_MEMBERS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setMatchRefereeMembers(Long matchRefereeMembers) {
        this.matchRefereeMembers = matchRefereeMembers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.MATCH_TEAMA_ID
     *
     * @return the value of t_match_football.MATCH_TEAMA_ID
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Long getMatchTeamaId() {
        return matchTeamaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.MATCH_TEAMA_ID
     *
     * @param matchTeamaId the value for t_match_football.MATCH_TEAMA_ID
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setMatchTeamaId(Long matchTeamaId) {
        this.matchTeamaId = matchTeamaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.MATCH_TEAMB_ID
     *
     * @return the value of t_match_football.MATCH_TEAMB_ID
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Long getMatchTeambId() {
        return matchTeambId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.MATCH_TEAMB_ID
     *
     * @param matchTeambId the value for t_match_football.MATCH_TEAMB_ID
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setMatchTeambId(Long matchTeambId) {
        this.matchTeambId = matchTeambId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.INPUT_NAME
     *
     * @return the value of t_match_football.INPUT_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public String getInputName() {
        return inputName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.INPUT_NAME
     *
     * @param inputName the value for t_match_football.INPUT_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setInputName(String inputName) {
        this.inputName = inputName == null ? null : inputName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.INPUT_DATE
     *
     * @return the value of t_match_football.INPUT_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Date getInputDate() {
        return inputDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.INPUT_DATE
     *
     * @param inputDate the value for t_match_football.INPUT_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.UPDATE_NAME
     *
     * @return the value of t_match_football.UPDATE_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.UPDATE_NAME
     *
     * @param updateName the value for t_match_football.UPDATE_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.UPDATE_DATE
     *
     * @return the value of t_match_football.UPDATE_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.UPDATE_DATE
     *
     * @param updateDate the value for t_match_football.UPDATE_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_match_football.DELSIGN
     *
     * @return the value of t_match_football.DELSIGN
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Short getDelsign() {
        return delsign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_match_football.DELSIGN
     *
     * @param delsign the value for t_match_football.DELSIGN
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setDelsign(Short delsign) {
        this.delsign = delsign;
    }
}