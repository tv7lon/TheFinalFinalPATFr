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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dhiys
 */
public class BookingsManager {

//////////////////////////////////////////////// HOTELS /////////////////////////////////////////////////////////////////////////////////////////////////
    public static void addHotelBooking(String hotelSelected, double numNightsDbb, double numPplDbb, double totalCost, String hotelDistanceString) {

        try {
            File bookingsDB = new File("data//BookingsDB.txt");
            FileWriter addBookingFW = new FileWriter(bookingsDB, true);
            PrintWriter addBookingPW = new PrintWriter(addBookingFW);

            //add all info to txt file
            addBookingPW.print(hotelSelected + "#" + numNightsDbb + "#" + numPplDbb + "#" + totalCost + "#" + hotelDistanceString + "\n");
            addBookingFW.close();
            addBookingPW.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookingsManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BookingsManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static String getNumNightsForView(String viewReviewForStr) {
        String finalNumNightsStr = "";
        try {
            File viewForBookingDB = new File("data\\BookingsDB.txt");
            Scanner fileSc = new Scanner(viewForBookingDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                //get info from txt
                String itemNameFromTxt = lineSc.next();
                String numNightsStr = lineSc.next();
                String numPplStr = lineSc.next();
                String totalCost = lineSc.next();
                String hotelDistanceStr = lineSc.next();
                //get the wanted num of nights, once it matches
                if (viewReviewForStr.equals(itemNameFromTxt)) {
                    finalNumNightsStr = numNightsStr;
                }

            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookingsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return finalNumNightsStr;
    }

    public static String getNumPplForView(String viewReviewForStr) {
        String finalNumPpl = "";
        try {
            File viewForBookingDB = new File("data\\BookingsDB.txt");
            Scanner fileSc = new Scanner(viewForBookingDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                //get info from txt
                String itemNameFromTxt = lineSc.next();
                String numNightsStr = lineSc.next();
                String numPplStr = lineSc.next();
                String totalCost = lineSc.next();
                String hotelDistanceStr = lineSc.next();
                //get the wanted num of people, once matches
                if (viewReviewForStr.equals(itemNameFromTxt)) {
                    finalNumPpl = numPplStr;
                }
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookingsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return finalNumPpl;
    }

    public static String getTotalCostForView(String viewReviewForStr) {
        String finalTotalCost = "";
        try {
            File viewForBookingDB = new File("data\\BookingsDB.txt");
            Scanner fileSc = new Scanner(viewForBookingDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                //get info from txt
                String itemNameFromTxt = lineSc.next();
                String numNightsStr = lineSc.next();
                String numPplStr = lineSc.next();
                String totalCost = lineSc.next();
                String hotelDistanceStr = lineSc.next();
                //get the wanted cost, once matches
                if (viewReviewForStr.equals(itemNameFromTxt)) {
                    finalTotalCost = totalCost;
                }
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookingsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return finalTotalCost;
    }

    public static String getHotelDistanceForView(String viewReviewForStr) {
        String finalDistance = "";
        try {
            File viewForBookingDB = new File("data\\BookingsDB.txt");
            Scanner fileSc = new Scanner(viewForBookingDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                String itemNameFromTxt = lineSc.next();
                String numNightsStr = lineSc.next();
                String numPplStr = lineSc.next();
                String totalCost = lineSc.next();
                String hotelDistanceStr = lineSc.next();

                //get distance for that hotel once matches
                if (viewReviewForStr.equals(itemNameFromTxt)) {
                    finalDistance = hotelDistanceStr;
                }
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookingsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return finalDistance;
    }

    //////////////////////////////////////////////// RESTAURANTS /////////////////////////////////////////////////////////////////////////////////////////////////
    public static void addRestBooking(String restSelected, int restNumGuests, String restDistanceStr, String timeSelected) {

        try {
            File bookingsDB = new File("data//BookingsDB.txt");
            FileWriter addBookingFW = new FileWriter(bookingsDB, true);
            PrintWriter addBookingPW = new PrintWriter(addBookingFW);

            addBookingPW.print(restSelected + "#" + restNumGuests + "#" + restDistanceStr + "#" + timeSelected + "\n");
            addBookingPW.close();
            addBookingFW.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookingsManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BookingsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //GETTING SECTION
    public static String getRestGuestsForView(String viewReviewForStr) {
        String finalRestNumGuests = "";
        try {
            File viewForBookingDB = new File("data\\BookingsDB.txt");
            Scanner fileSc = new Scanner(viewForBookingDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                String itemNameFromTxt = lineSc.next();
                String restNumGuests = lineSc.next();
                String restDistanceStr = lineSc.next();
                String timeSelected = lineSc.next();
                if (viewReviewForStr.equals(itemNameFromTxt)) {
                    finalRestNumGuests = restNumGuests;
                }
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookingsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return finalRestNumGuests;
    }

    public static String getRestDistanceForView(String viewReviewForStr) {
        String finalRestDistance = "";
        try {
            File viewForBookingDB = new File("data\\BookingsDB.txt");
            Scanner fileSc = new Scanner(viewForBookingDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                String itemNameFromTxt = lineSc.next();
                String restNumGuests = lineSc.next();
                String restDistanceStr = lineSc.next();
                String timeSelected = lineSc.next();
                if (viewReviewForStr.equals(itemNameFromTxt)) {
                    finalRestDistance = restDistanceStr;

                }

            }
            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookingsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return finalRestDistance;
    }

    public static String getTimeSelectedForView(String viewReviewForStr) {
        String finalTimeSelected = "";
        try {
            File viewForBookingDB = new File("data\\BookingsDB.txt");
            Scanner fileSc = new Scanner(viewForBookingDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                String itemNameFromTxt = lineSc.next();
                String restNumGuests = lineSc.next();
                String restDistanceStr = lineSc.next();
                String timeSelected = lineSc.next();
                if (viewReviewForStr.equals(itemNameFromTxt)) {
                    finalTimeSelected = timeSelected;
                }

            }
            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookingsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return finalTimeSelected;
    }

    ///////////////////////////////// OTHER CHECKING ///////////////////////////////////////
    public static boolean checkIfHotel(String viewReviewForStr) {

        //setup output requirements
        boolean isHotel = false;

        try {
            File hotelDB = new File("data\\HotelDB.txt");
            Scanner fileSc = new Scanner(hotelDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                //split into tokens
                String hotelName = lineSc.next();
                double linePrice = lineSc.nextDouble();

                //do something with tokens
                if (viewReviewForStr.equals(hotelName)) {
                    isHotel = true;
                }
            }
            fileSc.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookingsManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isHotel;
    }

}
