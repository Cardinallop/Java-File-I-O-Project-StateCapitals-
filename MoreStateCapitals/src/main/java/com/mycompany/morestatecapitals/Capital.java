/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.morestatecapitals;

/**
 *
 * @author boburmurtozaev
 */
public class Capital {
    
    private String name;
    private int population;
    private double sqrMile;

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

    public double getSqrMile() {
        return sqrMile;
    }

    public void setSqrMile(double sqrMile) {
        this.sqrMile = sqrMile;
    }

    @Override
    public String toString() {
        return "Capital{" + "name=" + name + ", population=" + population + ", sqrMile=" + sqrMile + '}';
    }
    
    
    
}
