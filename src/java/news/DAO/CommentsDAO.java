/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news.DAO;

/**
 *
 * @author liushuxiao
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import news.bean.Comments;
import news.conn.MyDB;

public class CommentsDAO {
    private Connection connection; 
    
    public CommentsDAO() {
        connection = MyDB.getCon();
    }


    public void addComments(int news_id, String content, int uid, String username) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into comments(news_id,content,uid,username) values (?,?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setInt(1, news_id);
            preparedStatement.setString(2, content);
            preparedStatement.setInt(3, uid);
            preparedStatement.setString(4, username);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteComments(int uid) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from comments where uid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, uid);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Comments> getAllComments() {
        List<Comments> cs = new ArrayList<Comments>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from comments");
            while (rs.next()) {
                Comments comments = new Comments();
                comments.setComm_id(rs.getInt("comm_id"));
                comments.setNews_id(rs.getInt("news_id"));
                comments.setContent(rs.getString("content"));
                comments.setUid(rs.getInt("uid"));
                comments.setUsername(rs.getString("username"));
                cs.add(comments);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cs;
    }
    public List<Comments> getCommsByNid(int nid) {
        List<Comments> cs = new ArrayList<Comments>();
        try {
             PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from comments where news_id = ?;");
            preparedStatement.setInt(1,nid);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Comments comments = new Comments();
                comments.setComm_id(rs.getInt("comm_id"));
                comments.setNews_id(rs.getInt("news_id"));
                comments.setContent(rs.getString("content"));
                comments.setUid(rs.getInt("uid"));
                comments.setUsername(rs.getString("username"));
                cs.add(comments);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cs;
    }


}