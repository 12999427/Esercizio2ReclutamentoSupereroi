package org.example;

public class Main {
    public static void main(String[] args) {
        int difficoltaMissione = 75;
        int tentativi = 5;
        Reclutatore reclutatore = new Reclutatore();

        System.out.println("Reclutamento per la missione (difficoltà minima richiesta: " + difficoltaMissione + ")");

        for (int i = 1; i <= tentativi; i++) {
            System.out.println("\nTentativo " + i + ":");
            try {
                reclutatore.recluta(difficoltaMissione);
            } catch (EroeNonIdoneoException e) {
                System.out.println("Non reclutato: " + e.getMessage());
                System.out.println("Passo al candidato successivo.");
            }
        }
    }
}
