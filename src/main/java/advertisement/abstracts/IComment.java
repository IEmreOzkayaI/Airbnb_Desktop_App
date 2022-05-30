/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package advertisement.abstracts;

import advertisement.concretes.Comment;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EmreOzkaya
 */
public interface IComment {
    void post(Comment comment , int personId, int advertisementId);
    void update(Comment comment , int personId, int advertisementId);
    ArrayList<Comment> getAllComments();
    void delete(int commentId);
}
