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
public class UsersManager {

    public static boolean loginCheck(String usernameInStr, String usernamePassStr) {

        boolean showNaviScreen = false;
        try {
            //file sc
            File usersTxt = new File("data\\usersTxt.txt");
            Scanner usersScanner = new Scanner(usersTxt);

            while (usersScanner.hasNextLine()) {
                //line sc
                String userLineStr = usersScanner.nextLine();
                Scanner userLineScanner = new Scanner(userLineStr).useDelimiter("#");
                String acceptedUser = userLineScanner.next();
                String acceptedPass = userLineScanner.next();

                if ((usernameInStr.equals(acceptedUser)) && (usernamePassStr.equals(acceptedPass))) {
                    //show nextscreen
                    showNaviScreen = true;
                    break;
                }
            }
            usersScanner.close();
        } catch (Exception e) {
            System.out.println("Error with file.");
        }

        return showNaviScreen;
    }

    public static String[] getUsernames() {

        //setup output requirements
        String[] usernamesStrArray = new String[getNumUsers()];
        int currentUser = 0;

        try {
            File usersDB = new File("data\\usersTxt.txt");
            Scanner fileSc = new Scanner(usersDB);
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                //split into tokens
                String usernameItemStr = lineSc.next();
                String passwordItemStr = lineSc.next();

                //do something with tokens
                usernamesStrArray[currentUser] = usernameItemStr;
                currentUser++;
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsersManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usernamesStrArray;
    }

    public static int getNumUsers() {
        int count = 0;
        try {
            File usersDB = new File("data\\usersTxt.txt");
            Scanner fileSc = new Scanner(usersDB);
            while (fileSc.hasNextLine()) {
                //add number of users for every line in txt
                fileSc.nextLine();
                count++;
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsersManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return count;
    }

    public static void addUser(String usernameToAdd, String passwordToAdd) {

        try {

            File usersTxt = new File("data\\usersTxt.txt");
            FileWriter addUserFW = new FileWriter(usersTxt, true);
            PrintWriter addUserPW = new PrintWriter(addUserFW);

            //add user and pass of choice to txt
            addUserPW.print(usernameToAdd + "#" + passwordToAdd + "\n");
            addUserPW.close();
            addUserFW.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsersManager.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(UsersManager.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static void deleteUser(String usernameToDelete) {

        String tempFile = "data\\Temp.txt";
        String oldFilePath = "data\\usersTxt.txt";

        File oldFile = new File(oldFilePath);
        File newFile = new File(tempFile);

        try {
            Scanner fileSc = new Scanner(oldFile);
            while (fileSc.hasNext()) {
                String line = fileSc.nextLine();
                //scanners for old text file
                //printwriter for new text file
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String usernameFromTxt = lineSc.next();
                String passwordFromTxt = lineSc.next();

                //if current username in scanner is not the one you want to delete, then write it to the NEW text file
                //if it is the one u want to delete then dont write it
                if (!usernameToDelete.equals(usernameFromTxt)) {
                    FileWriter delUserFW = new FileWriter(tempFile, true);
                    PrintWriter delUserPW = new PrintWriter(delUserFW);
                    //adds username and corresp passw
                    delUserPW.print(usernameFromTxt + "#" + passwordFromTxt + "\n");
                    delUserPW.close();

                }
            }
            //delete + rename files

            //creates a dump file with file path of "data\\usersTxt.txt"
            File dumpFile = new File(oldFilePath);

            //deleted the old (original) file (usersTxt)
            oldFile.delete();

            //renames the temporary file to new usersTxt with all the updated users
            newFile.renameTo(dumpFile);

        } catch (Exception e) {
            System.out.println("Error with file.");
        }

    }

    public static boolean checkUsernameDoubles(String usernameToAdd) {

        boolean sameUsername = false;
        try {
            //file sc
            File usersTxt = new File("data\\usersTxt.txt");
            Scanner usersScanner = new Scanner(usersTxt);

            while (usersScanner.hasNextLine()) {
                //line sc
                String userLineStr = usersScanner.nextLine();
                Scanner userLineScanner = new Scanner(userLineStr).useDelimiter("#");
                String userFromTxt = userLineScanner.next();
                String passFromTxt = userLineScanner.next();

                if (usernameToAdd.equals(userFromTxt)) {
                    sameUsername = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error with file.");
        }
        return sameUsername;
    }
}
