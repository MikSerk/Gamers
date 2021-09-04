package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

abstract public class Gamer {
    protected String name;
    protected int age;
    protected int level;
    protected int number;
    protected String amplua;
    protected List<Gamer> command;
    protected int sila;
    protected int speed;
    protected int jump;
    protected int technica;

    protected Gamer() throws FileNotFoundException {
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getTechnica() {
        return technica;
    }

    public void setTechnica(int technica) {
        this.technica = technica;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNumber() {
        return number;
    }

    public int setNumber(int number) {
        this.number = number;
        return number;
    }


    public String getAmplua() {
        return amplua;
    }

    public void setAmplua(String amplua) {
        this.amplua = amplua;
    }

    Random ag = new Random();

    public void setGamer() throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\Java\\Gamers2\\src\\com\\company\\spisok.txt"));
        command = new ArrayList<>();

        int num = 1;
        while (in.hasNext()) {
            Gamer com = new Start();
            String name = in.nextLine();
            com.setName(name);
            command.add(com);
            num++;

        }
        Collections.shuffle(command);
        addNum(command);
        addAge(command);
        addLevel(command);
        addAmplua(command);
        addAtrib(command);
//        prCommandAmplua();
//        prSortAge();
//        prSortNumber();
//        prSortLevel();
//        prZagolovokAttrib();
//        for (Gamer x:command){
//        x.prGamer();
//        }
//        getGamer();
        commandMenu();
    }

    public void addAge(List<Gamer> list) {
        Random ag = new Random();
        for (Gamer x : command) {
            int age = 18 + ag.nextInt(35 - 18);
            x.setAge(age);
        }
    }

    public void addAmplua(List<Gamer> list) throws FileNotFoundException {
        Random ag = new Random();
        for (Gamer x : command) {
            int amp = ag.nextInt(4) + 1;
//            Amplua(amp);
            x.setAmplua(Amplua(amp));
        }
    }

    public void addLevel(List<Gamer> list) {
        Random ag = new Random();
        for (Gamer x : command) {
            int lev = ag.nextInt(3) + 1;
            x.setLevel(lev);
        }
    }
    public void addAtrib(List<Gamer> list){
        for (Gamer x:command) {
            if (x.getLevel() == 3) {
                int addSila = ag.nextInt(15) + 1;
                int addSpeed = ag.nextInt(15) + 1;
                int addTechnica = ag.nextInt(15) + 1;
                int addJump = ag.nextInt(15) + 1;
                x.setSila(addSila);
                x.setSpeed(addSpeed);
                x.setTechnica(addTechnica);
                x.setJump(addJump);
            }
        }
            for (Gamer x:command){
                if (x.getLevel()==2){
                    int addSila=ag.nextInt(10)+1;
                    int addSpeed=ag.nextInt(10)+1;
                    int addTechnica=ag.nextInt(10)+1;
                    int addJump=ag.nextInt(10)+1;
                    x.setSila(addSila);
                    x.setSpeed(addSpeed);
                    x.setTechnica(addTechnica);
                    x.setJump(addJump);
                }
            }
                for (Gamer x:command){
                    if (x.getLevel()==1){
                        int addSila=ag.nextInt(5)+1;
                        int addSpeed=ag.nextInt(5)+1;
                        int addTechnica=ag.nextInt(5)+1;
                        int addJump=ag.nextInt(5)+1;
                        x.setSila(addSila);
                        x.setSpeed(addSpeed);
                        x.setTechnica(addTechnica);
                        x.setJump(addJump);
                    }
                }
    }

    public String Amplua(int amp) throws FileNotFoundException {

        if (amp == 1) {
            Gamer gamAtt = new Attack();
            return Attack.getAMPLUA();
        }
        if (amp == 2) {
            Gamer ganDef = new Deffender();
            return Deffender.getAMPLUA();
        }
        if (amp == 3) {
            Gamer gamMid = new Middefender();
            return Middefender.getAMPLUA();
        }
        Gamer gamGol = new Golkipper();
        return Golkipper.getAMPLUA();
    }

    public int addNum(List<Gamer> list) {
        int i = 1;
        for (Gamer v : command) {
            v.setNumber(i);
            i++;
        }
        Collections.shuffle(command);
        return number;
    }

    public void prCommand() {
        System.out.printf("%-5d %-20s %-7d %-15s %-7d\n", getNumber(), getName(), getAge(), getAmplua(), getLevel());
    }

    public void prZagolovok() {
        System.out.printf("%-5s %-20s %-7s %-15s %-7s \n", "НОМЕР", "ИГРОК", "ВОЗРАСТ", "ПОЗИЦИЯ", "УРОВЕНЬ");
    }

    public void prGolkipper() {
        for (Gamer x : command) {
            if (x.getAmplua() == Golkipper.getAMPLUA()) {
                x.prCommand();
            }
        }
    }

    public void prDeffender() {
        for (Gamer x : command) {
            if (x.getAmplua() == Deffender.getAMPLUA()) {
                x.prCommand();
            }
        }
    }

    public void prMiddefender() {
        for (Gamer x : command) {
            if (x.getAmplua() == Middefender.getAMPLUA()) {
                x.prCommand();
            }
        }
    }

    public void prAttack() {
        for (Gamer x : command) {
            if (x.getAmplua() == Attack.getAMPLUA()) {
                x.prCommand();
            }
        }
    }

    public void prCommandAmplua() {
        prZagolovok();
        prGolkipper();
        prDeffender();
        prMiddefender();
        prAttack();
    }

    public void prSortAge() {
        command.sort(new sortAge());
        prZagolovok();
        for (Gamer x : command) {
            x.prCommand();
        }
    }

    public void prSortNumber() {
        command.sort(new sortNumber());
        prZagolovok();
        for (Gamer x : command) {
            x.prCommand();
        }
    }

    public void prSortLevel() {
        command.sort(new sortLevel());
        prZagolovok();
        for (Gamer x : command) {
            x.prCommand();
        }
    }

    public void getGamer(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер игрока: ");
        int vvod=in.nextInt();
        for (Gamer x:command){
            if (x.getNumber() == vvod) {
                prZagolovokAttrib();
                x.prGamer();
            }
        }
    }

    public void prGamer(){
        System.out.printf("%-5d %-20s %-8d %-8s %-8d %-8d\n", getNumber(), getName(), getSila(), getSpeed(), getJump(),getTechnica());
    }

    public void prZagolovokAttrib(){
        System.out.printf("%-5s %-20s %-8s %-8s %-8s %-8s\n", "НОМЕР", "ИГРОК", "СИЛА", "СКОРОСТЬ", "ПРЫЖОК","ТЕХНИКА");
    }

    public void commandMenu() {
        System.out.println("Показать команду по уровню - 1");
        System.out.println("Показать команду по номеру - 2");
        System.out.println("Показать команду по возрасту - 3");
        System.out.println("Показать команду по позиции - 4");
        System.out.println("Показать атрибуты игрока - 5");
        System.out.println("");
        Scanner in = new Scanner(System.in);
        int vvod = in.nextInt();
        switch (vvod) {
            case 1:
                prSortLevel();
                break;
            case 2:
                prSortNumber();
                break;
            case 3:
                prSortAge();
                break;
            case 4:
                prCommandAmplua();
                break;
            case 5:
                getGamer();
                break;
            default:
                break;// вставить продолжение

        }
        commandMenu();

    }
}

class sortAge implements Comparator<Gamer>{

    @Override
    public int compare(Gamer o1, Gamer o2) {
        return o1.getAge()-o2.getAge();
    }
}

class sortNumber implements Comparator<Gamer>{

    @Override
    public int compare(Gamer o1, Gamer o2) {
        return o1.getNumber()-o2.getNumber();
    }
}

class sortLevel implements Comparator<Gamer> {

    @Override
    public int compare(Gamer o1, Gamer o2) {
        return o1.getLevel() - o2.getLevel();
    }
}




