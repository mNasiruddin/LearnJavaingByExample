/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Surveyanswertext;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SurveyanswertextRecord extends UpdatableRecordImpl<SurveyanswertextRecord> implements Record5<Integer, Integer, Integer, String, Integer> {

    private static final long serialVersionUID = -802478709;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyAnswerText.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyAnswerText.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyAnswerText.fk_survey</code>.
     */
    public void setFkSurvey(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyAnswerText.fk_survey</code>.
     */
    public Integer getFkSurvey() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyAnswerText.fk_survey_question</code>.
     */
    public void setFkSurveyQuestion(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyAnswerText.fk_survey_question</code>.
     */
    public Integer getFkSurveyQuestion() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyAnswerText.answer_free_text</code>.
     */
    public void setAnswerFreeText(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyAnswerText.answer_free_text</code>.
     */
    public String getAnswerFreeText() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyAnswerText.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyAnswerText.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Surveyanswertext.SURVEYANSWERTEXT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Surveyanswertext.SURVEYANSWERTEXT.FK_SURVEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Surveyanswertext.SURVEYANSWERTEXT.FK_SURVEY_QUESTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Surveyanswertext.SURVEYANSWERTEXT.ANSWER_FREE_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Surveyanswertext.SURVEYANSWERTEXT.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getFkSurvey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFkSurveyQuestion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAnswerFreeText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getFkSurvey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFkSurveyQuestion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAnswerFreeText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyanswertextRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyanswertextRecord value2(Integer value) {
        setFkSurvey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyanswertextRecord value3(Integer value) {
        setFkSurveyQuestion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyanswertextRecord value4(String value) {
        setAnswerFreeText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyanswertextRecord value5(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyanswertextRecord values(Integer value1, Integer value2, Integer value3, String value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SurveyanswertextRecord
     */
    public SurveyanswertextRecord() {
        super(Surveyanswertext.SURVEYANSWERTEXT);
    }

    /**
     * Create a detached, initialised SurveyanswertextRecord
     */
    public SurveyanswertextRecord(Integer id, Integer fkSurvey, Integer fkSurveyQuestion, String answerFreeText, Integer fkReservation) {
        super(Surveyanswertext.SURVEYANSWERTEXT);

        set(0, id);
        set(1, fkSurvey);
        set(2, fkSurveyQuestion);
        set(3, answerFreeText);
        set(4, fkReservation);
    }
}
