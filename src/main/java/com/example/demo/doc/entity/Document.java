package com.example.demo.doc.entity;

import java.util.Date;

public class Document {
    //操作id
    private Integer id;

    //文件id
    private Integer documentId;

    //版本id
    private Integer versionId;

    //关联历史文件id
    private String historyDocumentId;

    //文件名称
    private String documentName;

    //文件密等
    private String documentSecretLevel;

    //文件编号
    private String documentReleaseNumber;

    //发布时间
    private String documentReleaseTime;

    //用户姓名
    private String operatorName;

    //操作时间
    private Date operateTime;

    //操作说明
    private String operateRemarks;

    //操作类型
    private String operateType;

    //123先空出
    private String categoryValue1;

    private String categoryValue2;

    private String categoryValue3;

    //文件正文
    private String documentText;

    //图片链接
    private String pictureLink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public String getHistoryDocumentId() {
        return historyDocumentId;
    }

    public void setHistoryDocumentId(String historyDocumentId) {
        this.historyDocumentId = historyDocumentId == null ? null : historyDocumentId.trim();
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName == null ? null : documentName.trim();
    }

    public String getDocumentSecretLevel() {
        return documentSecretLevel;
    }

    public void setDocumentSecretLevel(String documentSecretLevel) {
        this.documentSecretLevel = documentSecretLevel == null ? null : documentSecretLevel.trim();
    }

    public String getDocumentReleaseNumber() {
        return documentReleaseNumber;
    }

    public void setDocumentReleaseNumber(String documentReleaseNumber) {
        this.documentReleaseNumber = documentReleaseNumber == null ? null : documentReleaseNumber.trim();
    }

    public String getDocumentReleaseTime() {
        return documentReleaseTime;
    }

    public void setDocumentReleaseTime(String documentReleaseTime) {
        this.documentReleaseTime = documentReleaseTime == null ? null : documentReleaseTime.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateRemarks() {
        return operateRemarks;
    }

    public void setOperateRemarks(String operateRemarks) {
        this.operateRemarks = operateRemarks == null ? null : operateRemarks.trim();
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType == null ? null : operateType.trim();
    }

    public String getCategoryValue1() {
        return categoryValue1;
    }

    public void setCategoryValue1(String categoryValue1) {
        this.categoryValue1 = categoryValue1 == null ? null : categoryValue1.trim();
    }

    public String getCategoryValue2() {
        return categoryValue2;
    }

    public void setCategoryValue2(String categoryValue2) {
        this.categoryValue2 = categoryValue2 == null ? null : categoryValue2.trim();
    }

    public String getCategoryValue3() {
        return categoryValue3;
    }

    public void setCategoryValue3(String categoryValue3) {
        this.categoryValue3 = categoryValue3 == null ? null : categoryValue3.trim();
    }

    public String getDocumentText() {
        return documentText;
    }

    public void setDocumentText(String documentText) {
        this.documentText = documentText == null ? null : documentText.trim();
    }

    public String getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink == null ? null : pictureLink.trim();
    }
}