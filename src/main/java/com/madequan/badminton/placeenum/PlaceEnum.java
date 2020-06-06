package com.madequan.badminton.placeenum;

/**
 * @Description:
 * @Date: 2020/06/05/22:29
 */
public enum PlaceEnum {
    free("free","空闲"),booked("booked", "已预定"),inuse("inuse","使用中");
    private String code;
    private String desc;

    PlaceEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
