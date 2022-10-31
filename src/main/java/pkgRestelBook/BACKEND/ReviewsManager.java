/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgRestelBook.BACKEND;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JRadioButton;

/**
 *
 * @author dhiys
 */
public class ReviewsManager {

    public static String getScore(Enumeration<AbstractButton> ratingBG) {

        String reviewScore = "";
        while (ratingBG.hasMoreElements()) {
            JRadioButton jrd = (JRadioButton) ratingBG.nextElement();
            if (jrd.isSelected()) {
                reviewScore = jrd.getText();
            }
        }
        return reviewScore;
    }

    public static void addReview(String reviewItemSelected, String reviewScore, String reviewComment) {

        try {
            File reviewsDB = new File("data//ReviewsDB.txt");
            FileWriter addReviewFW = new FileWriter(reviewsDB, true);
            PrintWriter addReviewPW = new PrintWriter(addReviewFW);

            //if no comment was ended, for writing to txt file
            if ((reviewComment.isBlank() || (reviewComment.isEmpty()))) {
                reviewComment = "No comment entered.";
            }
            //add to txt
            addReviewPW.print(reviewItemSelected + "#" + reviewScore + "#" + reviewComment + "\n");
            addReviewPW.close();
            addReviewFW.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReviewsManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReviewsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //method for UI label to show
    public static boolean checkForComment(String reviewComment) {

        boolean noComment = false;

        if ((reviewComment.isBlank() || (reviewComment.isEmpty()))) {
            noComment = true;
        }
        return noComment;
    }

    public static String getTxtFileScore(String viewReviewForStr) {

        String finalScore = "";
        try {
            File viewForReviewDB = new File("data\\ReviewsDB.txt");
            Scanner fileSc = new Scanner(viewForReviewDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String itemNameFromTxt = lineSc.next();
                String scoreFromTxt = lineSc.next();
                String commentFromTxt = lineSc.next();
                //get txt score once matches
                if (viewReviewForStr.equals(itemNameFromTxt)) {
                    finalScore = scoreFromTxt;

                }

            }
            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReviewsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return finalScore;
    }

    public static String getCommentFromTxt(String viewForItem) {

        String commentFromTxt = "";
        String finalComment = "";
        try {
            File viewForReviewDB = new File("data\\ReviewsDB.txt");
            Scanner fileSc = new Scanner(viewForReviewDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String itemNameFromTxt = lineSc.next();
                String scoreFromTxt = lineSc.next();
                commentFromTxt = lineSc.next();

                if (viewForItem.equals(itemNameFromTxt)) {
                    finalComment = commentFromTxt;
                }

            }
            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReviewsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return finalComment;
    }

}
