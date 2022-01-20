package com.core.rest.agreementworkflowcompleted.model;

import java.util.List;

public class Agreement {
	private String id;

    private String name;

    private String signatureType;

    private String status;

    private List<Ccs> ccs;

    private DeviceInfo deviceInfo;

    private String documentVisibilityEnabled;

    private String createdDate;

    private String expirationTime;

    private ExternalId externalId;

    private PostSignOption postSignOption;

    private String firstReminderDelay;

    private String locale;

    private String message;

    private String reminderFrequency;

    private String senderEmail;

    private VaultingInfo vaultingInfo;

    private String workflowId;

    private ParticipantSetsInfo participantSetsInfo;

    private DocumentsInfo documentsInfo;

    private SignedDocumentInfo signedDocumentInfo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSignatureType() {
		return signatureType;
	}

	public void setSignatureType(String signatureType) {
		this.signatureType = signatureType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Ccs> getCcs() {
		return ccs;
	}

	public void setCcs(List<Ccs> ccs) {
		this.ccs = ccs;
	}

	public DeviceInfo getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getDocumentVisibilityEnabled() {
		return documentVisibilityEnabled;
	}

	public void setDocumentVisibilityEnabled(String documentVisibilityEnabled) {
		this.documentVisibilityEnabled = documentVisibilityEnabled;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(String expirationTime) {
		this.expirationTime = expirationTime;
	}

	public ExternalId getExternalId() {
		return externalId;
	}

	public void setExternalId(ExternalId externalId) {
		this.externalId = externalId;
	}

	public PostSignOption getPostSignOption() {
		return postSignOption;
	}

	public void setPostSignOption(PostSignOption postSignOption) {
		this.postSignOption = postSignOption;
	}

	public String getFirstReminderDelay() {
		return firstReminderDelay;
	}

	public void setFirstReminderDelay(String firstReminderDelay) {
		this.firstReminderDelay = firstReminderDelay;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getReminderFrequency() {
		return reminderFrequency;
	}

	public void setReminderFrequency(String reminderFrequency) {
		this.reminderFrequency = reminderFrequency;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public VaultingInfo getVaultingInfo() {
		return vaultingInfo;
	}

	public void setVaultingInfo(VaultingInfo vaultingInfo) {
		this.vaultingInfo = vaultingInfo;
	}

	public String getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
	}

	public ParticipantSetsInfo getParticipantSetsInfo() {
		return participantSetsInfo;
	}

	public void setParticipantSetsInfo(ParticipantSetsInfo participantSetsInfo) {
		this.participantSetsInfo = participantSetsInfo;
	}

	public DocumentsInfo getDocumentsInfo() {
		return documentsInfo;
	}

	public void setDocumentsInfo(DocumentsInfo documentsInfo) {
		this.documentsInfo = documentsInfo;
	}

	public SignedDocumentInfo getSignedDocumentInfo() {
		return signedDocumentInfo;
	}

	public void setSignedDocumentInfo(SignedDocumentInfo signedDocumentInfo) {
		this.signedDocumentInfo = signedDocumentInfo;
	}

}
