package ru.home.dto;

public enum Town {
    MOSCOW("Moscow"),
    KRASNOGORSK("Krasnogorsk");
    private final String value;

    Town(String v) {
        value = v;
    }
}
