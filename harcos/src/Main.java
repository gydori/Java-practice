import harcosokklubja.Harcos;
import harcosokklubja.Nagydarab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*        Harcos[] tomb = new Harcos[args.length / 3];
        int j = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("Harcos")) {
                Harcos harcos = new Harcos(Integer.parseInt(args[i + 1]), Integer.parseInt(args[i + 2]));
                tomb[j++] = harcos;
                i = i + 2;
            } else {
                Nagydarab nagydb = new Nagydarab(Integer.parseInt(args[i + 1]), Integer.parseInt(args[i + 2]), Integer.parseInt(args[i + 3]));
                tomb[j++] = nagydb;
                i = i + 3;
            }
        }*/
        ArrayList<Harcos> tomb = new ArrayList<Harcos>();
        try (FileReader reader = new FileReader("harcosok.txt");
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts[0].equals("Harcos")) {
                    int power = Integer.parseInt(parts[1]);
                    int health = Integer.parseInt(parts[2]);
                    Harcos harcos = new Harcos(power, health);
                    tomb.add(harcos);
                }
                if (parts[0].equals("Nagydarab")) {
                    int power = Integer.parseInt(parts[1]);
                    int health = Integer.parseInt(parts[2]);
                    int endurance = Integer.parseInt(parts[3]);
                    Nagydarab nagydb = new Nagydarab(power, health, endurance);
                    tomb.add(nagydb);
                }
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        /*
        if (j > 1) {
            for (int i = 0; i < j; i++) {
                if (i == j - 1) {
                    meccs(tomb[i], tomb[0]);
                } else {
                    meccs(tomb[i], tomb[i + 1]);
                }
            }
        }*/


        int j = tomb.size();
        if (j > 1) {
            for (int i = 0; i < j; i++) {
                if (i == j - 1) {
                    meccs(tomb.get(i), tomb.get(0));
                } else {
                    meccs(tomb.get(i), tomb.get(i + 1));
                }
            }
        }
    }

    public static void meccs(Harcos h1, Harcos h2) {
        System.out.println(h1 + " és " + h2 + "harcol.");
        int i = 0;
        while (i < 3) {
            h1.megut(h2);
            h2.megut(h1);
            if (h1.getHealth() <= 0 && h2.getHealth() > 0) {
                System.out.println("Vége a meccsnek, " + h1 + " egészsége elfogyott. " + h2 + " nyert");
                break;
            } else if (h1.getHealth() > 0 && h2.getHealth() <= 0) {
                System.out.println("Vége a meccsnek, " + h2 + " egészsége elfogyott. " + h1 + " nyert");
                break;
            } else if (h1.getHealth() <= 0 && h2.getHealth() <= 0) {
                System.out.println("Vége a meccsnek, mindkettőnek elfogyott az élete, döntetlen.");
                break;
            } else {
                i++;
            }
        }
        if (i == 3) {
            System.out.println("Vége a meccsnek, mindenki túlélte, döntetlen");
        }

    }
}
