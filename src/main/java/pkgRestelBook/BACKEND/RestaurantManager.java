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
public class RestaurantManager {

    public static String[] getRestaurantNames() {

        //setup output requirements
        String[] restNames = new String[getNumRestaurants()];
        int currentRest = 0;

        try {
            File restaurantDB = new File("data\\RestaurantDB.txt");
            Scanner fileSc = new Scanner(restaurantDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                //split into tokens
                String lineName = lineSc.next();

                //do something with tokens
                restNames[currentRest] = lineName;
                currentRest++;
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return restNames;
    }

    public static int getNumRestaurants() {
        int count = 0;
        try {
            File restaurantDB = new File("data\\RestaurantDB.txt");
            Scanner fileSc = new Scanner(restaurantDB);
            while (fileSc.hasNextLine()) {
                fileSc.nextLine();
                count++;
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return count;
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
            Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return count;
    }

    public static String calcRestDistance(String selectedRest, String restLocationSelected) {

        String currentDistanceString;
        String finalDistanceString = "";
        try {
            File distancesDB = new File("data\\DistancesDB.txt");
            Scanner fileSc = new Scanner(distancesDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                //split into tokens
                String locationName = lineSc.next();
                String restName = lineSc.next();
                currentDistanceString = lineSc.next();

                //do something with tokens
                if ((selectedRest.equals(restName) && (restLocationSelected.equals(locationName)))) {
                    finalDistanceString = currentDistanceString;
                }

            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return finalDistanceString;
    }
}
