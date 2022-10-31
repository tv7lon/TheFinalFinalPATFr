/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgRestelBook.BACKEND;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JRadioButton;

/**
 *
 * @author dhiys
 */
public class ViewingManager {
        public static String getBookOrReview(Enumeration<AbstractButton> bookingOrReviewButtonGroup) {

        String viewFor = "";
        while (bookingOrReviewButtonGroup.hasMoreElements()) {
            JRadioButton jrd = (JRadioButton) bookingOrReviewButtonGroup.nextElement();
            if (jrd.isSelected()) {
                viewFor = jrd.getText();
            }
        }
        return viewFor;
    }
    
}
