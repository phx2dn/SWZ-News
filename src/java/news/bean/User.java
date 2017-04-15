/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.bean;

import java.io.Serializable;

/**
 *
 * @author liushuxiao
 */
public class User implements Serializable{
    
    private int id;
    private String username;
    private String password;
    
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    public User() {
    }
    
    public void setId(int id){this.id=id;}  
  
    public int getId(){return id;}  
  
    public void setUsername(String username){this.username=username;}  
  
    public String getUsername(){return username;}
    
    public void setPassword(String password){this.password=password;}  
  
    public String getPassword(){return password;}
    
}
