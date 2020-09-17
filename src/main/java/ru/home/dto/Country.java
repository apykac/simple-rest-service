package ru.home.dto;

public class Country {
    protected String name;
    protected int population;
    protected String capital;
    protected Currency currency;

    public Country(String name, int population, String capital, Currency currency) {
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
