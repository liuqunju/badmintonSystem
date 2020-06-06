package com.madequan.badminton.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Date: 2020/06/06/14:57
 */
public class Pager<T> {
    private List<T> bigList; // 大的集合，外界传入
    private int curentPageIndex = 1; // 当前页号，外界传入
    private int countPerpage = 2; // 每页条数，外界可以设定
    private List<T> smallList; // 小的集合，返回
    private int pageCount; // 页数
    private int recordCount; // 记录条数
    private int prePageIndex; // 上一页序号
    private int nextPageIndex; // 下一页序号
    private boolean firstPage; // 是否第一页
    private boolean lastPage; // 是否最后一页

    public Pager(List<T> bigList, int curentPageIndex, int countPerpage) {
        this.bigList = bigList;
        this.curentPageIndex = curentPageIndex;
        this.countPerpage = countPerpage;
        this.setBigList(bigList);
        this.setCurentPageIndex(curentPageIndex);
        this.setCountPerpage(countPerpage);
    }
    public Pager(List<T> bigList, int curentPageIndex, int countPerpage, List<T> smallList, int pageCount,
                 int recordCount, int prePageIndex, int nextPageIndex, boolean firstPage, boolean lastPage) {
        this.bigList = bigList;
        this.curentPageIndex = curentPageIndex;
        this.countPerpage = countPerpage;
        this.smallList = smallList;
        this.pageCount = pageCount;
        this.recordCount = recordCount;
        this.prePageIndex = prePageIndex;
        this.nextPageIndex = nextPageIndex;
        this.firstPage = firstPage;
        this.lastPage = lastPage;
    }

    public void setCurentPageIndex(int curentPageIndex) { // 每当页数改变，都会调用这个函数，筛选代码可以写在这里
        this.curentPageIndex = curentPageIndex;

        // 上一页，下一页确定
        prePageIndex = curentPageIndex - 1;
        nextPageIndex = curentPageIndex + 1;
        // 是否第一页，最后一页
        if (curentPageIndex == 1) {
            firstPage = true;
        } else {
            firstPage = false;
        }
        if (curentPageIndex == pageCount) {
            lastPage = true;
        } else {
            lastPage = false;
        }
        // 筛选工作
        smallList = new ArrayList<T>();
        for (int i = (curentPageIndex - 1) * countPerpage; i < curentPageIndex
                * countPerpage
                && i < recordCount; i++) {
            smallList.add(bigList.get(i));
        }
    }

    public int getCurentPageIndex() {
        return curentPageIndex;
    }

    public List<T> getBigList() {
        return bigList;
    }

    public void setBigList(List<T> bigList) {
        this.bigList = bigList;
        // 计算条数
        recordCount = bigList.size();
        // 计算页数
        if (recordCount % countPerpage == 0) {
            pageCount = recordCount / countPerpage;
        } else {
            pageCount = recordCount / countPerpage + 1;
        }

        // 筛选工作
        smallList = new ArrayList<T>();
        for (int i = (curentPageIndex - 1) * countPerpage; i < curentPageIndex
                * countPerpage
                && i < recordCount; i++) {
            smallList.add(bigList.get(i));
        }
    }

    public int getCountPerpage() {
        return countPerpage;
    }

    public void setCountPerpage(int countPerpage) {
        this.countPerpage = countPerpage;
    }

    public List<T> getSmallList() {
        return smallList;
    }

    public void setSmallList(ArrayList<T> smallList) {
        this.smallList = smallList;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public int getNextPageIndex() {
        return nextPageIndex;
    }

    public void setNextPageIndex(int nextPageIndex) {
        this.nextPageIndex = nextPageIndex;
    }

    public int getPrePageIndex() {
        return prePageIndex;
    }

    public void setPrePageIndex(int prePageIndex) {
        this.prePageIndex = prePageIndex;
    }

    public boolean isFirstPage() {
        return firstPage;
    }

    public void setFirstPage(boolean firstPage) {
        this.firstPage = firstPage;
    }

    public boolean isLastPage() {
        return lastPage;
    }

    public void setLastPage(boolean lastPage) {
        this.lastPage = lastPage;
    }
}
