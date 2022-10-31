/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgRestelBook.BACKEND;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dhiys
 */
public class HotelManager {

    public static String[] getHotelNames() {

        //setup output requirements
        String[] hotelNames = new String[getNumHotels()];
        int currentHotel = 0;

        try {
            File hotelDB = new File("data\\HotelDB.txt");
            Scanner fileSc = new Scanner(hotelDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                //split into tokens
                String lineName = lineSc.next();
                double linePrice = lineSc.nextDouble();

                //do something with tokens
                hotelNames[currentHotel] = lineName;
                currentHotel++;
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HotelManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hotelNames;
    }

    public static int getNumHotels() {
        int count = 0;
        try {
            File hotelDB = new File("data\\HotelDB.txt");
            Scanner fileSc = new Scanner(hotelDB);
            while (fileSc.hasNextLine()) {
                fileSc.nextLine();
                count++;
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HotelManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return count;
    }

    public static double getHotelPrice(String hotelName) {

        //setup output requirements
        double price = 0;

        try {
            File hotelDB = new File("data\\HotelDB.txt");
            Scanner fileSc = new Scanner(hotelDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                //split into tokens
                String lineName = lineSc.next();
                double linePrice = lineSc.nextDouble();

                //do something with tokens
                if (lineName.equalsIgnoreCase(hotelName)) {
                    price = linePrice;
                }
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HotelManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return price;
    }

    public static int getNumLocations() {
        int count = 0;
        try {
            File locationsDB = new File("data\\LocationNamesDB.txt");
            Scanner fileSc = new Scanner(locationsDB);
            while (fileSc.hasNextLine()) {
                fileSc.nextLine();
                count++;
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HotelManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return count;
    }

    public static String[] getLocationNames() {

        //setup output requirements
        String[] locationNames = new String[getNumLocations()];
        int currentLocation = 0;

        try {
            File locationDB = new File("data\\LocationNamesDB.txt");
            Scanner fileSc = new Scanner(locationDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                //split into tokens
                String lineName = lineSc.next();

                //do something with tokens
                locationNames[currentLocation] = lineName;
                currentLocation++;
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HotelManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return locationNames;

    }

    public static double priceCalc(double hotelPrice, double numNightsDbb, double numPplDbb) {
        double numRooms;
        if (numPplDbb == 1) {

            numRooms = 1;
        } else {
            numRooms = numPplDbb / 2;
        }
        double totalCost = (hotelPrice * numNightsDbb * numRooms);
        //setup output requirements

        return totalCost;
    }

    public static String calcHotelDistance(String selectedHotel, String hotLocationSelected) {

        String currentDistanceString;
        String finalDistanceString  = "";
        try {
            File distancesDB = new File("data\\DistancesDB.txt");
            Scanner fileSc = new Scanner(distancesDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                //split into tokens
                String locationName = lineSc.next();
                String hotelName = lineSc.next();
                currentDistanceString = lineSc.next();
                
                //do something with tokens
                if ((selectedHotel.equals(hotelName) && (hotLocationSelected.equals(locationName)))) {
                    finalDistanceString = currentDistanceString;
                }

            }
            
            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HotelManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return finalDistanceString;
    }
}
