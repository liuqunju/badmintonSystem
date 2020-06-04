package com.madequan.badminton.entity;

import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2020-06-03 22:55:49
 */
public class TUser implements Serializable {
    private static final long serialVersionUID = -70757822656083024L;
    /**
    * 主键
    */
    private String id;
    /**
    * 用户账号
    */
    private String userAccount;
    /**
    * 用户密码
    */
    private String password;
    /**
    * 用户身份证号
    */
    private String identityCard;
    /**
    * 用户名
    */
    private String userName;
    /**
    * 用户性别
    */
    private String userSex;
    /**
    * 用户电子邮箱
    */
    private String email;
    /**
    * 用户电话号码
    */
    private String userTel;
    /**
    * 用户地址
    */
    private String address;
    /**
    * 用户VIP卡
    */
    private String vipCard;
    /**
    * 用户状态
    */
    private String userStatus;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVipCard() {
        return vipCard;
    }

    public void setVipCard(String vipCard) {
        this.vipCard = vipCard;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

}