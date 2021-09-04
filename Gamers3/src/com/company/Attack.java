package com.company;

import java.io.FileNotFoundException;

public class Attack extends Gamer{
    private static final String AMPLUA = "НАПАДАЮЩИЙ";
    private int sila;
    private int speed;
    private int jump;
    private int technica;

    protected Attack() throws FileNotFoundException {
    }

    public static String getAMPLUA() {
        return AMPLUA;
    }



}
