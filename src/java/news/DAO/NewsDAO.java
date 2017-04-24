/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import news.bean.News;
import news.conn.MyDB;

public class NewsDAO {

    Connection connection;

    public NewsDAO() {
        connection = MyDB.getCon();
    }

    public void addNews(String title,String author,String description,String content,int news_type) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into news(title,author,description,content,news_type) values (?,?,?,?,?)");
            // Parameters start with 1
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setString(3, description);
            preparedStatement.setString(4, content);
            preparedStatement.setInt(5, news_type);
            //missing pictures
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteNews(int id) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from news where news_id=?");
            // Parameters start with 1
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateNews(News news) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update news set title=?, author=?, decription=?, content=?, main_pic=?, second_pic=?"
                             + "where id=?");
            // Parameters start with 1
            preparedStatement.setString(1, news.getTitle());
            preparedStatement.setString(2, news.getAuthor());
            preparedStatement.setString(3, news.getDescription());
            preparedStatement.setString(4, news.getContent());
            //missing pictures
            preparedStatement.setInt(7, news.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<News> getAllNews() {
        List<News> ns = new ArrayList<News>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select news.news_id,news.title,news.author,news.description,news.content,news.news_time from news;");
            while (rs.next()) {
                News news = new News();
                news.setId(rs.getInt("news_id"));
                news.setTitle(rs.getString("title"));
                news.setAuthor(rs.getString("author"));
                news.setDescription(rs.getString("description"));
                news.setContent(rs.getString("content"));
                news.setNews_time(rs.getString("news_time"));
                ns.add(news);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ns;
    }

    public News getNewsById(int id) {
        News news = new News();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from news where news_id=?");
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                news.setId(rs.getInt("news_id"));
                news.setTitle(rs.getString("title"));
                news.setAuthor(rs.getString("author"));
                news.setDescription(rs.getString("description"));
                news.setContent(rs.getString("content"));
                news.setNews_time(rs.getString("news_time"));
                //missing pictures
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return news;
    }
    
    public List<News> getNewsByTitle(String title) {
        List<News> ns = new ArrayList<News>();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from news where title like ?;");
            preparedStatement.setString(1, "%" + title + "%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                News news = new News();
                news.setId(rs.getInt("news_id"));
                news.setTitle(rs.getString("title"));
                news.setAuthor(rs.getString("author"));
                news.setDescription(rs.getString("description"));
                news.setContent(rs.getString("content"));
                ns.add(news);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ns;
    }
    
    public List<News> getNewsByType(int news_type) {
        List<News> ns = new ArrayList<News>();
        try {
        PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from news where news_type = ?;");
            preparedStatement.setInt(1,news_type);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                News news = new News();
                news.setId(rs.getInt("news_id"));
                news.setTitle(rs.getString("title"));
                news.setAuthor(rs.getString("author"));
                news.setDescription(rs.getString("description"));
                news.setContent(rs.getString("content"));
                ns.add(news);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ns;
    }
}