package com.company;

import java.io.FileNotFoundException;

public class Middefender extends Gamer{
    private static final String AMPLUA = "ПОЛУЗАЩИТНИК";
    private int sila;
    private int speed;
    private int jump;
    private int technica;

    protected Middefender() throws FileNotFoundException {
    }

    public static String getAMPLUA() {
        return AMPLUA;
    }



}
