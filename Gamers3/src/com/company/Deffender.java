package com.company;

import java.io.FileNotFoundException;

public class Deffender extends Gamer{
    private static final String AMPLUA = "ЗАЩИТНИК";
    private int sila;
    private int speed;
    private int jump;
    private int technica;

    protected Deffender() throws FileNotFoundException {
    }

    public static String getAMPLUA() {
        return AMPLUA;
    }



}
