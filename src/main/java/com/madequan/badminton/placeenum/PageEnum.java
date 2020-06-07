package com.madequan.badminton.placeenum;

/**
 * @Description:
 * @Date: 2020/06/06/15:37
 */
public enum PageEnum {
    pageSize("10", 10);

    private String pageSizeStr;
    private int intPageSize;

    PageEnum(String pageSizeStr, int intPageSize) {
        this.pageSizeStr = pageSizeStr;
        this.intPageSize = intPageSize;
    }

    public String getPageSizeStr() {
        return pageSizeStr;
    }

    public void setPageSizeStr(String pageSizeStr) {
        this.pageSizeStr = pageSizeStr;
    }

    public int getIntPageSize() {
        return intPageSize;
    }

    public void setIntPageSize(int intPageSize) {
        this.intPageSize = intPageSize;
    }
}
