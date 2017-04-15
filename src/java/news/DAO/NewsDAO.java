/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import news.bean.News;
import news.conn.MyDB;

public class NewsDAO {

    private Connection connection;

    public NewsDAO() {
        connection = MyDB.getCon();
    }

    public void addNews(News news) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into news(title,author,description,content,main_pic,second_pic) values (?,?,?,?,?,?)");
            // Parameters start with 1
            preparedStatement.setString(1, news.getTitle());
            preparedStatement.setString(2, news.getAuthor());
            preparedStatement.setString(3, news.getDescription());
            preparedStatement.setString(4, news.getContent());
            //missing pictures
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteNews(int id) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from news where id=?");
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

    public List<News> getAllUsers() {
        List<News> ns = new ArrayList<News>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from news");
            while (rs.next()) {
                News news = new News();
                news.setId(rs.getInt("id"));
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

    public News getNewsById(int id) {
        News news = new News();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from news where id=?");
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                news.setId(rs.getInt("id"));
                news.setTitle(rs.getString("username"));
                news.setAuthor(rs.getString("password"));
                news.setDescription(rs.getString("username"));
                news.setContent(rs.getString("password"));
                //missing pictures
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return news;
    }
}