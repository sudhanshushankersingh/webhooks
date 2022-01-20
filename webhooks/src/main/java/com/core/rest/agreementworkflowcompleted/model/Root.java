package com.core.rest.agreementworkflowcompleted.model;

import java.util.ArrayList;
import java.util.List;
public class Root
{
    private String webhookId;

    private String webhookName;

    private String webhookNotificationId;

    private WebhookUrlInfo webhookUrlInfo;

    private String webhookScope;

    private List<WebhookNotificationApplicableUsers> webhookNotificationApplicableUsers;

    private String event;

    private String subEvent;

    private String eventDate;

    private String eventResourceType;

    private String eventResourceParentType;

    private String eventResourceParentId;

    private String participantRole;

    private String participantUserId;

    private String participantUserEmail;

    private String actingUserId;

    private String actingUserEmail;

    private String actingUserIpAddress;

    private String initiatingUserId;

    private String initiatingUserEmail;

    private Agreement agreement;

    public void setWebhookId(String webhookId){
        this.webhookId = webhookId;
    }
    public String getWebhookId(){
        return this.webhookId;
    }
    public void setWebhookName(String webhookName){
        this.webhookName = webhookName;
    }
    public String getWebhookName(){
        return this.webhookName;
    }
    public void setWebhookNotificationId(String webhookNotificationId){
        this.webhookNotificationId = webhookNotificationId;
    }
    public String getWebhookNotificationId(){
        return this.webhookNotificationId;
    }
    public void setWebhookUrlInfo(WebhookUrlInfo webhookUrlInfo){
        this.webhookUrlInfo = webhookUrlInfo;
    }
    public WebhookUrlInfo getWebhookUrlInfo(){
        return this.webhookUrlInfo;
    }
    public void setWebhookScope(String webhookScope){
        this.webhookScope = webhookScope;
    }
    public String getWebhookScope(){
        return this.webhookScope;
    }
    public void setWebhookNotificationApplicableUsers(List<WebhookNotificationApplicableUsers> webhookNotificationApplicableUsers){
        this.webhookNotificationApplicableUsers = webhookNotificationApplicableUsers;
    }
    public List<WebhookNotificationApplicableUsers> getWebhookNotificationApplicableUsers(){
        return this.webhookNotificationApplicableUsers;
    }
    public void setEvent(String event){
        this.event = event;
    }
    public String getEvent(){
        return this.event;
    }
    public void setSubEvent(String subEvent){
        this.subEvent = subEvent;
    }
    public String getSubEvent(){
        return this.subEvent;
    }
    public void setEventDate(String eventDate){
        this.eventDate = eventDate;
    }
    public String getEventDate(){
        return this.eventDate;
    }
    public void setEventResourceType(String eventResourceType){
        this.eventResourceType = eventResourceType;
    }
    public String getEventResourceType(){
        return this.eventResourceType;
    }
    public void setEventResourceParentType(String eventResourceParentType){
        this.eventResourceParentType = eventResourceParentType;
    }
    public String getEventResourceParentType(){
        return this.eventResourceParentType;
    }
    public void setEventResourceParentId(String eventResourceParentId){
        this.eventResourceParentId = eventResourceParentId;
    }
    public String getEventResourceParentId(){
        return this.eventResourceParentId;
    }
    public void setParticipantRole(String participantRole){
        this.participantRole = participantRole;
    }
    public String getParticipantRole(){
        return this.participantRole;
    }
    public void setParticipantUserId(String participantUserId){
        this.participantUserId = participantUserId;
    }
    public String getParticipantUserId(){
        return this.participantUserId;
    }
    public void setParticipantUserEmail(String participantUserEmail){
        this.participantUserEmail = participantUserEmail;
    }
    public String getParticipantUserEmail(){
        return this.participantUserEmail;
    }
    public void setActingUserId(String actingUserId){
        this.actingUserId = actingUserId;
    }
    public String getActingUserId(){
        return this.actingUserId;
    }
    public void setActingUserEmail(String actingUserEmail){
        this.actingUserEmail = actingUserEmail;
    }
    public String getActingUserEmail(){
        return this.actingUserEmail;
    }
    public void setActingUserIpAddress(String actingUserIpAddress){
        this.actingUserIpAddress = actingUserIpAddress;
    }
    public String getActingUserIpAddress(){
        return this.actingUserIpAddress;
    }
    public void setInitiatingUserId(String initiatingUserId){
        this.initiatingUserId = initiatingUserId;
    }
    public String getInitiatingUserId(){
        return this.initiatingUserId;
    }
    public void setInitiatingUserEmail(String initiatingUserEmail){
        this.initiatingUserEmail = initiatingUserEmail;
    }
    public String getInitiatingUserEmail(){
        return this.initiatingUserEmail;
    }
    public void setAgreement(Agreement agreement){
        this.agreement = agreement;
    }
    public Agreement getAgreement(){
        return this.agreement;
    }
}

