package com.liurr.utils;

public class PageUtil {
    private int pageSize=10;//每页条数
    private int totalRows;//总行数
    private int currentPage;//当前页
    private int totalPages;//总页数
    private int startRow;//当前页在数据库的起始行
    
    
    
    
    public PageUtil() {
        super();
    }
    //默认每页10条
    public PageUtil(int totalRows){
        this.totalRows=totalRows;
        totalPages = (int) Math.ceil((double)totalRows/(double)pageSize);
        startRow=0;
    }
    //自定义每页条数
    public PageUtil(int totalRows,int pageSize){
        this.totalRows=totalRows;
        this.pageSize=pageSize;
        if(pageSize<1){
            this.pageSize=1;
        }else if(pageSize>20){
            this.pageSize=20;
        }
        totalPages= (int) Math.ceil((double)totalRows/(double)this.pageSize);
        currentPage=1;
        startRow=0;
    }
    //首页
    public void first(){
        this.currentPage=1;
        this.startRow=1;
    }
    //上一页
    public void pre(){
        if(currentPage==1){
            return;
        }
        currentPage--;
        startRow=(currentPage-1)*pageSize;
    }
    //下一页
    public void next(){
        if(currentPage<totalPages){
            currentPage++;
        }
        startRow=(currentPage-1)*pageSize;
    }
    
    //末页
    public void last(){
        this.currentPage=totalPages;
        if(currentPage<1){  
            currentPage = 1;  
        }  
        this.startRow = (currentPage-1) * this.pageSize;  
        totalPages =(int) Math.ceil((double)totalRows / (double)this.pageSize);     
    }
    
    //跳转到指定页 
    public void refresh(int currentPage) {
        if (currentPage < 0) {
            first();
        } else if (currentPage > totalPages) {
            last();
        } else {
            this.currentPage = currentPage;
            this.startRow = (currentPage - 1) * this.pageSize;
        }

    }

    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getTotalRows() {
        return totalRows;
    }
    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }
    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public int getTotalPages() {
        return totalPages;
    }
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
    public int getStartRow() {
        return startRow;
    }
    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }
    

}
