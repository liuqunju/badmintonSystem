package com.madequan.badminton.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TReserveMessage)实体类
 *
 * @author makejava
 * @since 2020-06-03 22:55:49
 */
public class TReserveMessage implements Serializable {
    private static final long serialVersionUID = 113963242857410100L;
    
    private String id;
    /**
    * 场地编号
    */
    private String plaaceId;
    /**
    * 人数
    */
    private Integer peopleNumber;
    /**
    * 预约时间
    */
    private Date appointmentTime;
    /**
    * 联系地址
    */
    private String contactAddress;
    /**
    * 联系人
    */
    private String linkman;
    /**
    * 联系电话
    */
    private String contactNumber;
    /**
    * 提交时间
    */
    private Date addTime;
    /**
    * 订单编号
    */
    private String orderNumber;
    /**
    * 预定会员
    */
    private String member;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaaceId() {
        return plaaceId;
    }

    public void setPlaaceId(String plaaceId) {
        this.plaaceId = plaaceId;
    }

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

}