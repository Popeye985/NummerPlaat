package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class NummerplaatMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Auto> autos = leesAutos(scanner);
        System.out.print("Geef nummerplaat die gezocht moet worden: ");
        String nummerplaat = scanner.nextLine();
        Auto auto = zoekAuto(autos, nummerplaat);
        if (auto != null) {
            System.out.printf("De bestuurder van de auto met nummerplaat %s is %s%n", auto.getNummerplaat(), auto.getBestuurder());
        } else {
            System.out.println("Nummerplaat is niet gevonden.");
        }
    }

    private static Auto zoekAuto(ArrayList<Auto> autolijst, String tezoekenNummerplaat) {

        for (Auto auto : autolijst) {
            String nummerplaat = auto.getNummerplaat();

            if (nummerplaat.equals(tezoekenNummerplaat)) {
                return auto;

            }

        }
        return null;

    }
        private static ArrayList<Auto> leesAutos (Scanner scanner){
            ArrayList<Auto> autos = new ArrayList<>();
            System.out.println("Geef bestuurder in. <Return> om te stoppen.");
            String bestuurder = scanner.nextLine();
            while (!bestuurder.equals("")) {
                System.out.println("Geef nummerplaat");
                String nummerplaat = scanner.nextLine();
                Auto auto = new Auto(bestuurder, nummerplaat);
                autos.add(auto);
                System.out.println("Geef bestuurder in. <Return> om te stoppen.");
                bestuurder = scanner.nextLine();


            }
            return autos;


        }
    }

    class Auto {
        public String getNummerplaat() {
            return nummerplaat;
        }

        public String getBestuurder() {
            return bestuurder;
        }

        public Auto(String bestuurder, String nummerplaat) {
            this.bestuurder = bestuurder;
            this.nummerplaat = nummerplaat;
        }

        private String bestuurder;
        private String nummerplaat;


    }



