package com.madequan.badminton.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TPlace)实体类
 *
 * @author makejava
 * @since 2020-06-03 22:54:46
 */
public class TPlace implements Serializable {
    private static final long serialVersionUID = 420808141233240199L;
    
    private String id;
    /**
    * 场地名称
    */
    private String placeName;
    /**
    * 价位
    */
    private Integer price;
    /**
    * 负责人
    */
    private String principal;
    /**
    * 咨询电话
    */
    private String consultingTelephone;
    /**
    * 容纳人数
    */
    private String galleryful;
    /**
    * 价绍
    */
    private String content;
    /**
    * 发布时间
    */
    private Date addTime;
    /**
    * 场地状态
    */
    private String placeStatus;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getConsultingTelephone() {
        return consultingTelephone;
    }

    public void setConsultingTelephone(String consultingTelephone) {
        this.consultingTelephone = consultingTelephone;
    }

    public String getGalleryful() {
        return galleryful;
    }

    public void setGalleryful(String galleryful) {
        this.galleryful = galleryful;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getPlaceStatus() {
        return placeStatus;
    }

    public void setPlaceStatus(String placeStatus) {
        this.placeStatus = placeStatus;
    }

}