package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("ФУТБОЛЬНЫЙ МЕНЕДЖЕР\n");
        System.out.println("КАК ВАС ЗОВУТ?");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("ФИО:   ");
//        String nameManager = sc.next();
        Gamer gamer=new Start();
        gamer.setGamer();
//        gamer.commandMenu();



    }
}
