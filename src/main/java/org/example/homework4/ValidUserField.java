package org.example.homework4;

import org.example.homework4.MyLibException.WrongLoginException;
import org.example.homework4.MyLibException.WrongPasswordException;

public class ValidUserField {
    private static int loginLength;
    private static int passswordLength;


    public static boolean isValid(String login, String password, String confirmPassword){
        loginLength = login.length();
        passswordLength = password.length();
        boolean isMatch = password.equals(confirmPassword);
        if(loginLength >= 20){
            throw new WrongLoginException(login.length());
        }
        else if(passswordLength >= 20 || !isMatch){
            throw new WrongPasswordException(passswordLength, isMatch );
        }
        return true;
    }
}