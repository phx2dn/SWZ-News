/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.bean;

import javax.swing.ImageIcon;

/**
 *
 * @author liushuxiao
 */
public class News {
    
    private int id;
    private String title;
    private String author;
    private String description;
    private String content;
    private byte[] main_pic;
    private byte[] second_pic;
    private String news_type;
    private String news_time;
    
    public News(int id, String title, String author, String description, String content, byte[] main_pic,byte[] second_pic,String news_time) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.author = author;
        this.main_pic = main_pic;
        this.second_pic = second_pic;
        this.news_time = news_time;
    }
    
    public News() {
    }
    
    public void setId(int id){this.id=id;}  
  
    public int getId(){return id;}  
  
    public void setTitle(String title){this.title=title;}  
  
    public String getTitle(){return title;}
    
    public void setAuthor(String author){this.author=author;}  
  
    public String getAuthor(){return author;}
    
    public void setDescription(String description){this.description=description;}  
  
    public String getDescription(){return description;}
    
    public void setContent(String content){this.content=content;}  
  
    public String getContent(){return content;}
    
    public void setNews_time(String news_time){this.news_time=news_time;}  
    
    public String getNews_time(){return news_time;}
    
    public void setMain_pic(byte[] main_pic){this.main_pic=main_pic;}
  
    public byte[] getMain_pic(){return main_pic;}
    
    public void setSecond_pic(byte[] second_pic){this.second_pic=second_pic;}  
  
    public byte[] getSecond_pic(){return second_pic;}
    
    public void setNews_type(String news_type){this.news_type=news_type;}  
  
    public String getNews_type(){return news_type;}

    public void setMain_pic(ImageIcon image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
