/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.bean;


/**
 *
 * @author liushuxiao
 */
public class Comments{
    
    private int comm_id;
    private int news_id;
    private String content;
    private int uid;
    private String username;
    public Comments(int comm_id, int news_id, String content, int uid, String username) {
        this.comm_id = comm_id;
        this.news_id = news_id;
        this.content = content;
        this.uid = uid;
        this.username=username;
    }
    
    public Comments() {
    }
    
    public void setComm_id(int comm_id){this.comm_id=comm_id;}  
  
    public int getComm_id(){return comm_id;}  
  
    public void setNews_id(int news_id){this.news_id=news_id;}  
  
    public int getNews_id(){return news_id;}
    
    public void setContent(String content){this.content=content;}  
  
    public String getContent(){return content;}
    
    public void setUid(int uid){this.uid=uid;}  
  
    public int getUid(){return uid;}
    
     public void setUsername(String username){this.username=username;}  
  
    public String getUsername(){return username;}
    
}
