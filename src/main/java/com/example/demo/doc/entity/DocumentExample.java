package com.example.demo.doc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocumentExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIsNull() {
            addCriterion("document_id is null");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIsNotNull() {
            addCriterion("document_id is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentIdEqualTo(Integer value) {
            addCriterion("document_id =", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotEqualTo(Integer value) {
            addCriterion("document_id <>", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdGreaterThan(Integer value) {
            addCriterion("document_id >", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("document_id >=", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLessThan(Integer value) {
            addCriterion("document_id <", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLessThanOrEqualTo(Integer value) {
            addCriterion("document_id <=", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIn(List<Integer> values) {
            addCriterion("document_id in", values, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotIn(List<Integer> values) {
            addCriterion("document_id not in", values, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdBetween(Integer value1, Integer value2) {
            addCriterion("document_id between", value1, value2, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("document_id not between", value1, value2, "documentId");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNull() {
            addCriterion("version_id is null");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNotNull() {
            addCriterion("version_id is not null");
            return (Criteria) this;
        }

        public Criteria andVersionIdEqualTo(Integer value) {
            addCriterion("version_id =", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotEqualTo(Integer value) {
            addCriterion("version_id <>", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThan(Integer value) {
            addCriterion("version_id >", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_id >=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThan(Integer value) {
            addCriterion("version_id <", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThanOrEqualTo(Integer value) {
            addCriterion("version_id <=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdIn(List<Integer> values) {
            addCriterion("version_id in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotIn(List<Integer> values) {
            addCriterion("version_id not in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdBetween(Integer value1, Integer value2) {
            addCriterion("version_id between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("version_id not between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdIsNull() {
            addCriterion("history_document_id is null");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdIsNotNull() {
            addCriterion("history_document_id is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdEqualTo(String value) {
            addCriterion("history_document_id =", value, "historyDocumentId");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdNotEqualTo(String value) {
            addCriterion("history_document_id <>", value, "historyDocumentId");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdGreaterThan(String value) {
            addCriterion("history_document_id >", value, "historyDocumentId");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdGreaterThanOrEqualTo(String value) {
            addCriterion("history_document_id >=", value, "historyDocumentId");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdLessThan(String value) {
            addCriterion("history_document_id <", value, "historyDocumentId");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdLessThanOrEqualTo(String value) {
            addCriterion("history_document_id <=", value, "historyDocumentId");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdLike(String value) {
            addCriterion("history_document_id like", value, "historyDocumentId");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdNotLike(String value) {
            addCriterion("history_document_id not like", value, "historyDocumentId");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdIn(List<String> values) {
            addCriterion("history_document_id in", values, "historyDocumentId");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdNotIn(List<String> values) {
            addCriterion("history_document_id not in", values, "historyDocumentId");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdBetween(String value1, String value2) {
            addCriterion("history_document_id between", value1, value2, "historyDocumentId");
            return (Criteria) this;
        }

        public Criteria andHistoryDocumentIdNotBetween(String value1, String value2) {
            addCriterion("history_document_id not between", value1, value2, "historyDocumentId");
            return (Criteria) this;
        }

        public Criteria andDocumentNameIsNull() {
            addCriterion("document_name is null");
            return (Criteria) this;
        }

        public Criteria andDocumentNameIsNotNull() {
            addCriterion("document_name is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentNameEqualTo(String value) {
            addCriterion("document_name =", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameNotEqualTo(String value) {
            addCriterion("document_name <>", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameGreaterThan(String value) {
            addCriterion("document_name >", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameGreaterThanOrEqualTo(String value) {
            addCriterion("document_name >=", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameLessThan(String value) {
            addCriterion("document_name <", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameLessThanOrEqualTo(String value) {
            addCriterion("document_name <=", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameLike(String value) {
            addCriterion("document_name like", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameNotLike(String value) {
            addCriterion("document_name not like", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameIn(List<String> values) {
            addCriterion("document_name in", values, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameNotIn(List<String> values) {
            addCriterion("document_name not in", values, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameBetween(String value1, String value2) {
            addCriterion("document_name between", value1, value2, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameNotBetween(String value1, String value2) {
            addCriterion("document_name not between", value1, value2, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelIsNull() {
            addCriterion("document_secret_level is null");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelIsNotNull() {
            addCriterion("document_secret_level is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelEqualTo(String value) {
            addCriterion("document_secret_level =", value, "documentSecretLevel");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelNotEqualTo(String value) {
            addCriterion("document_secret_level <>", value, "documentSecretLevel");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelGreaterThan(String value) {
            addCriterion("document_secret_level >", value, "documentSecretLevel");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelGreaterThanOrEqualTo(String value) {
            addCriterion("document_secret_level >=", value, "documentSecretLevel");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelLessThan(String value) {
            addCriterion("document_secret_level <", value, "documentSecretLevel");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelLessThanOrEqualTo(String value) {
            addCriterion("document_secret_level <=", value, "documentSecretLevel");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelLike(String value) {
            addCriterion("document_secret_level like", value, "documentSecretLevel");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelNotLike(String value) {
            addCriterion("document_secret_level not like", value, "documentSecretLevel");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelIn(List<String> values) {
            addCriterion("document_secret_level in", values, "documentSecretLevel");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelNotIn(List<String> values) {
            addCriterion("document_secret_level not in", values, "documentSecretLevel");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelBetween(String value1, String value2) {
            addCriterion("document_secret_level between", value1, value2, "documentSecretLevel");
            return (Criteria) this;
        }

        public Criteria andDocumentSecretLevelNotBetween(String value1, String value2) {
            addCriterion("document_secret_level not between", value1, value2, "documentSecretLevel");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberIsNull() {
            addCriterion("document_release_number is null");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberIsNotNull() {
            addCriterion("document_release_number is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberEqualTo(String value) {
            addCriterion("document_release_number =", value, "documentReleaseNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberNotEqualTo(String value) {
            addCriterion("document_release_number <>", value, "documentReleaseNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberGreaterThan(String value) {
            addCriterion("document_release_number >", value, "documentReleaseNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("document_release_number >=", value, "documentReleaseNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberLessThan(String value) {
            addCriterion("document_release_number <", value, "documentReleaseNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberLessThanOrEqualTo(String value) {
            addCriterion("document_release_number <=", value, "documentReleaseNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberLike(String value) {
            addCriterion("document_release_number like", value, "documentReleaseNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberNotLike(String value) {
            addCriterion("document_release_number not like", value, "documentReleaseNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberIn(List<String> values) {
            addCriterion("document_release_number in", values, "documentReleaseNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberNotIn(List<String> values) {
            addCriterion("document_release_number not in", values, "documentReleaseNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberBetween(String value1, String value2) {
            addCriterion("document_release_number between", value1, value2, "documentReleaseNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseNumberNotBetween(String value1, String value2) {
            addCriterion("document_release_number not between", value1, value2, "documentReleaseNumber");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeIsNull() {
            addCriterion("document_release_time is null");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeIsNotNull() {
            addCriterion("document_release_time is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeEqualTo(String value) {
            addCriterion("document_release_time =", value, "documentReleaseTime");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeNotEqualTo(String value) {
            addCriterion("document_release_time <>", value, "documentReleaseTime");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeGreaterThan(String value) {
            addCriterion("document_release_time >", value, "documentReleaseTime");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("document_release_time >=", value, "documentReleaseTime");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeLessThan(String value) {
            addCriterion("document_release_time <", value, "documentReleaseTime");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeLessThanOrEqualTo(String value) {
            addCriterion("document_release_time <=", value, "documentReleaseTime");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeLike(String value) {
            addCriterion("document_release_time like", value, "documentReleaseTime");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeNotLike(String value) {
            addCriterion("document_release_time not like", value, "documentReleaseTime");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeIn(List<String> values) {
            addCriterion("document_release_time in", values, "documentReleaseTime");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeNotIn(List<String> values) {
            addCriterion("document_release_time not in", values, "documentReleaseTime");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeBetween(String value1, String value2) {
            addCriterion("document_release_time between", value1, value2, "documentReleaseTime");
            return (Criteria) this;
        }

        public Criteria andDocumentReleaseTimeNotBetween(String value1, String value2) {
            addCriterion("document_release_time not between", value1, value2, "documentReleaseTime");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNull() {
            addCriterion("operator_name is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("operator_name =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("operator_name <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("operator_name >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_name >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("operator_name <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("operator_name <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("operator_name like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("operator_name not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("operator_name in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("operator_name not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("operator_name between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
            addCriterion("operator_name not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("operate_time is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("operate_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("operate_time =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("operate_time <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("operate_time >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operate_time >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("operate_time <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("operate_time <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("operate_time in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("operate_time not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("operate_time between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("operate_time not between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksIsNull() {
            addCriterion("operate_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksIsNotNull() {
            addCriterion("operate_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksEqualTo(String value) {
            addCriterion("operate_remarks =", value, "operateRemarks");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksNotEqualTo(String value) {
            addCriterion("operate_remarks <>", value, "operateRemarks");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksGreaterThan(String value) {
            addCriterion("operate_remarks >", value, "operateRemarks");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("operate_remarks >=", value, "operateRemarks");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksLessThan(String value) {
            addCriterion("operate_remarks <", value, "operateRemarks");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksLessThanOrEqualTo(String value) {
            addCriterion("operate_remarks <=", value, "operateRemarks");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksLike(String value) {
            addCriterion("operate_remarks like", value, "operateRemarks");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksNotLike(String value) {
            addCriterion("operate_remarks not like", value, "operateRemarks");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksIn(List<String> values) {
            addCriterion("operate_remarks in", values, "operateRemarks");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksNotIn(List<String> values) {
            addCriterion("operate_remarks not in", values, "operateRemarks");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksBetween(String value1, String value2) {
            addCriterion("operate_remarks between", value1, value2, "operateRemarks");
            return (Criteria) this;
        }

        public Criteria andOperateRemarksNotBetween(String value1, String value2) {
            addCriterion("operate_remarks not between", value1, value2, "operateRemarks");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNull() {
            addCriterion("operate_type is null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNotNull() {
            addCriterion("operate_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeEqualTo(String value) {
            addCriterion("operate_type =", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotEqualTo(String value) {
            addCriterion("operate_type <>", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThan(String value) {
            addCriterion("operate_type >", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operate_type >=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThan(String value) {
            addCriterion("operate_type <", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThanOrEqualTo(String value) {
            addCriterion("operate_type <=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLike(String value) {
            addCriterion("operate_type like", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotLike(String value) {
            addCriterion("operate_type not like", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIn(List<String> values) {
            addCriterion("operate_type in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotIn(List<String> values) {
            addCriterion("operate_type not in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeBetween(String value1, String value2) {
            addCriterion("operate_type between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotBetween(String value1, String value2) {
            addCriterion("operate_type not between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1IsNull() {
            addCriterion("category_value_1 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1IsNotNull() {
            addCriterion("category_value_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1EqualTo(String value) {
            addCriterion("category_value_1 =", value, "categoryValue1");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1NotEqualTo(String value) {
            addCriterion("category_value_1 <>", value, "categoryValue1");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1GreaterThan(String value) {
            addCriterion("category_value_1 >", value, "categoryValue1");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1GreaterThanOrEqualTo(String value) {
            addCriterion("category_value_1 >=", value, "categoryValue1");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1LessThan(String value) {
            addCriterion("category_value_1 <", value, "categoryValue1");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1LessThanOrEqualTo(String value) {
            addCriterion("category_value_1 <=", value, "categoryValue1");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1Like(String value) {
            addCriterion("category_value_1 like", value, "categoryValue1");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1NotLike(String value) {
            addCriterion("category_value_1 not like", value, "categoryValue1");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1In(List<String> values) {
            addCriterion("category_value_1 in", values, "categoryValue1");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1NotIn(List<String> values) {
            addCriterion("category_value_1 not in", values, "categoryValue1");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1Between(String value1, String value2) {
            addCriterion("category_value_1 between", value1, value2, "categoryValue1");
            return (Criteria) this;
        }

        public Criteria andCategoryValue1NotBetween(String value1, String value2) {
            addCriterion("category_value_1 not between", value1, value2, "categoryValue1");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2IsNull() {
            addCriterion("category_value_2 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2IsNotNull() {
            addCriterion("category_value_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2EqualTo(String value) {
            addCriterion("category_value_2 =", value, "categoryValue2");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2NotEqualTo(String value) {
            addCriterion("category_value_2 <>", value, "categoryValue2");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2GreaterThan(String value) {
            addCriterion("category_value_2 >", value, "categoryValue2");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2GreaterThanOrEqualTo(String value) {
            addCriterion("category_value_2 >=", value, "categoryValue2");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2LessThan(String value) {
            addCriterion("category_value_2 <", value, "categoryValue2");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2LessThanOrEqualTo(String value) {
            addCriterion("category_value_2 <=", value, "categoryValue2");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2Like(String value) {
            addCriterion("category_value_2 like", value, "categoryValue2");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2NotLike(String value) {
            addCriterion("category_value_2 not like", value, "categoryValue2");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2In(List<String> values) {
            addCriterion("category_value_2 in", values, "categoryValue2");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2NotIn(List<String> values) {
            addCriterion("category_value_2 not in", values, "categoryValue2");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2Between(String value1, String value2) {
            addCriterion("category_value_2 between", value1, value2, "categoryValue2");
            return (Criteria) this;
        }

        public Criteria andCategoryValue2NotBetween(String value1, String value2) {
            addCriterion("category_value_2 not between", value1, value2, "categoryValue2");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3IsNull() {
            addCriterion("category_value_3 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3IsNotNull() {
            addCriterion("category_value_3 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3EqualTo(String value) {
            addCriterion("category_value_3 =", value, "categoryValue3");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3NotEqualTo(String value) {
            addCriterion("category_value_3 <>", value, "categoryValue3");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3GreaterThan(String value) {
            addCriterion("category_value_3 >", value, "categoryValue3");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3GreaterThanOrEqualTo(String value) {
            addCriterion("category_value_3 >=", value, "categoryValue3");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3LessThan(String value) {
            addCriterion("category_value_3 <", value, "categoryValue3");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3LessThanOrEqualTo(String value) {
            addCriterion("category_value_3 <=", value, "categoryValue3");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3Like(String value) {
            addCriterion("category_value_3 like", value, "categoryValue3");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3NotLike(String value) {
            addCriterion("category_value_3 not like", value, "categoryValue3");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3In(List<String> values) {
            addCriterion("category_value_3 in", values, "categoryValue3");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3NotIn(List<String> values) {
            addCriterion("category_value_3 not in", values, "categoryValue3");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3Between(String value1, String value2) {
            addCriterion("category_value_3 between", value1, value2, "categoryValue3");
            return (Criteria) this;
        }

        public Criteria andCategoryValue3NotBetween(String value1, String value2) {
            addCriterion("category_value_3 not between", value1, value2, "categoryValue3");
            return (Criteria) this;
        }

        public Criteria andDocumentTextIsNull() {
            addCriterion("document_text is null");
            return (Criteria) this;
        }

        public Criteria andDocumentTextIsNotNull() {
            addCriterion("document_text is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentTextEqualTo(String value) {
            addCriterion("document_text =", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextNotEqualTo(String value) {
            addCriterion("document_text <>", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextGreaterThan(String value) {
            addCriterion("document_text >", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextGreaterThanOrEqualTo(String value) {
            addCriterion("document_text >=", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextLessThan(String value) {
            addCriterion("document_text <", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextLessThanOrEqualTo(String value) {
            addCriterion("document_text <=", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextLike(String value) {
            addCriterion("document_text like", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextNotLike(String value) {
            addCriterion("document_text not like", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextIn(List<String> values) {
            addCriterion("document_text in", values, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextNotIn(List<String> values) {
            addCriterion("document_text not in", values, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextBetween(String value1, String value2) {
            addCriterion("document_text between", value1, value2, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextNotBetween(String value1, String value2) {
            addCriterion("document_text not between", value1, value2, "documentText");
            return (Criteria) this;
        }

        public Criteria andPictureLinkIsNull() {
            addCriterion("picture_link is null");
            return (Criteria) this;
        }

        public Criteria andPictureLinkIsNotNull() {
            addCriterion("picture_link is not null");
            return (Criteria) this;
        }

        public Criteria andPictureLinkEqualTo(String value) {
            addCriterion("picture_link =", value, "pictureLink");
            return (Criteria) this;
        }

        public Criteria andPictureLinkNotEqualTo(String value) {
            addCriterion("picture_link <>", value, "pictureLink");
            return (Criteria) this;
        }

        public Criteria andPictureLinkGreaterThan(String value) {
            addCriterion("picture_link >", value, "pictureLink");
            return (Criteria) this;
        }

        public Criteria andPictureLinkGreaterThanOrEqualTo(String value) {
            addCriterion("picture_link >=", value, "pictureLink");
            return (Criteria) this;
        }

        public Criteria andPictureLinkLessThan(String value) {
            addCriterion("picture_link <", value, "pictureLink");
            return (Criteria) this;
        }

        public Criteria andPictureLinkLessThanOrEqualTo(String value) {
            addCriterion("picture_link <=", value, "pictureLink");
            return (Criteria) this;
        }

        public Criteria andPictureLinkLike(String value) {
            addCriterion("picture_link like", value, "pictureLink");
            return (Criteria) this;
        }

        public Criteria andPictureLinkNotLike(String value) {
            addCriterion("picture_link not like", value, "pictureLink");
            return (Criteria) this;
        }

        public Criteria andPictureLinkIn(List<String> values) {
            addCriterion("picture_link in", values, "pictureLink");
            return (Criteria) this;
        }

        public Criteria andPictureLinkNotIn(List<String> values) {
            addCriterion("picture_link not in", values, "pictureLink");
            return (Criteria) this;
        }

        public Criteria andPictureLinkBetween(String value1, String value2) {
            addCriterion("picture_link between", value1, value2, "pictureLink");
            return (Criteria) this;
        }

        public Criteria andPictureLinkNotBetween(String value1, String value2) {
            addCriterion("picture_link not between", value1, value2, "pictureLink");
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