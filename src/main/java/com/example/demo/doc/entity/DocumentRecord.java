package com.example.demo.doc.entity;

public class DocumentRecord {
    //只保存前端发来的数据，Document根据需要从DocumentRecord中提取
    //主键id
    private int id;
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
    //操作说明
    private String operateRemarks;
    //文件正文
    private String documentText;
    //文件图片（暂用此名字）
    private String pictureLink;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getOperateRemarks() {
        return operateRemarks;
    }

    public void setOperateRemarks(String operateRemarks) {
        this.operateRemarks = operateRemarks == null ? null : operateRemarks.trim();
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
