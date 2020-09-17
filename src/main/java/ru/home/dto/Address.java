package ru.home.dto;

import java.math.BigInteger;

public class Address {
    protected Town town;
    protected String street;
    protected BigInteger build;
    protected BigInteger room;

    public Address(Town town, String street, BigInteger build, BigInteger room) {
        this.town = town;
        this.street = street;
        this.build = build;
        this.room = room;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public BigInteger getBuild() {
        return build;
    }

    public void setBuild(BigInteger build) {
        this.build = build;
    }

    public BigInteger getRoom() {
        return room;
    }

    public void setRoom(BigInteger room) {
        this.room = room;
    }
}
