/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advertisement.concretes;

import Singleton.SingletonConnection;
import advertisement.abstracts.House;
import advertisement.abstracts.IComment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EmreOzkaya
 */
public class Comment implements IComment {

    private int id;
    private int ownerId;
    private int advertisementId;
    private String content;
    private int point;
    private String userName;
    Statement st;
    ResultSet rs;
    Statement st2;
    ResultSet rs2;
    Connection db = Singleton.SingletonConnection.getCon();
    PreparedStatement pst;

    public Comment() {
    }

    @Override
    public void post(Comment comment, int personId, int advertisementId) {
        try {
            pst = db.prepareStatement(Singleton.SingletonConnection.insertComment);
            pst.setInt(1, 0);
            pst.setInt(2, advertisementId);
            pst.setString(3,getContent());
            pst.setInt(4, getPoint());
            pst.setInt(5, getOwnerId());
            pst.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Advertisement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Comment comment, int personId, int advertisementId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Comment> getAllComments() {
        ArrayList<Comment> CommentList = new ArrayList();
        try {
            st = db.createStatement();
            rs = st.executeQuery(SingletonConnection.getCommentsById + "'" + advertisementId + "'");
            while (rs.next()) {
                Comment comm=new Comment();
                comm.setId(rs.getInt("id"));
                comm.setPoint(rs.getInt("rating"));
                comm.setContent(rs.getString("comment"));
                comm.setOwnerId(rs.getInt("person_id"));
                st2 = db.createStatement();
                rs2 = st2.executeQuery(SingletonConnection.getPersonById + "'" + comm.getId() + "'");
                while(rs2.next()){
                    comm.setUserName(rs2.getString("name")+" "+rs2.getString("surname"));
                }
                CommentList.add(comm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Advertisement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CommentList;
    }

    @Override
    public void delete(int commentId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getAdvertisementId() {
        return advertisementId;
    }

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public int getPoint() {
        return point;
    }

    public void setAdvertisementId(int advertisementId) {
        this.advertisementId = advertisementId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
