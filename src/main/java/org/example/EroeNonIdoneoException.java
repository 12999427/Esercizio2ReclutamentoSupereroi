package org.example;

public class EroeNonIdoneoException extends Exception {
    private final String nomeEroe;
    private final int livelloPotere;

    public EroeNonIdoneoException(String nomeEroe, int livelloPotere) {
        super("L'eroe " + nomeEroe + " ha un livello di potere insufficiente (" + livelloPotere + ")");
        this.nomeEroe = nomeEroe;
        this.livelloPotere = livelloPotere;
    }

    public String getNomeEroe() {
        return nomeEroe;
    }

    public int getLivelloPotere() {
        return livelloPotere;
    }
}
