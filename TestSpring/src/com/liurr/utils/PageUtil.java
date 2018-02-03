package com.liurr.utils;

public class PageUtil {
    private int pageSize=10;//ÿҳ����
    private int totalRows;//������
    private int currentPage;//��ǰҳ
    private int totalPages;//��ҳ��
    private int startRow;//��ǰҳ�����ݿ����ʼ��
    
    
    
    
    public PageUtil() {
        super();
    }
    //Ĭ��ÿҳ10��
    public PageUtil(int totalRows){
        this.totalRows=totalRows;
        totalPages = (int) Math.ceil((double)totalRows/(double)pageSize);
        startRow=0;
    }
    //�Զ���ÿҳ����
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
    //��ҳ
    public void first(){
        this.currentPage=1;
        this.startRow=1;
    }
    //��һҳ
    public void pre(){
        if(currentPage==1){
            return;
        }
        currentPage--;
        startRow=(currentPage-1)*pageSize;
    }
    //��һҳ
    public void next(){
        if(currentPage<totalPages){
            currentPage++;
        }
        startRow=(currentPage-1)*pageSize;
    }
    
    //ĩҳ
    public void last(){
        this.currentPage=totalPages;
        if(currentPage<1){  
            currentPage = 1;  
        }  
        this.startRow = (currentPage-1) * this.pageSize;  
        totalPages =(int) Math.ceil((double)totalRows / (double)this.pageSize);     
    }
    
    //��ת��ָ��ҳ 
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
