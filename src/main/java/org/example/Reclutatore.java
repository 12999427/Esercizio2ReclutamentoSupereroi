package org.example;

import net.datafaker.Faker;

public class Reclutatore {
    private final Faker faker;

    public Reclutatore() {
        this.faker = new Faker();
    }

    public void recluta(int difficoltaMissione) throws EroeNonIdoneoException {
        String nomeEroe = faker.superhero().name();
        int livelloPotere = faker.number().numberBetween(1, 101);

        System.out.println("Candidato: " + nomeEroe + " (potere: " + livelloPotere + ")");

        if (livelloPotere < difficoltaMissione) {
            throw new EroeNonIdoneoException(nomeEroe, livelloPotere);
        }

        System.out.println("Idoneo! " + nomeEroe + " è stato reclutato.");
    }
}
