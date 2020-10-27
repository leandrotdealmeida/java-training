package br.com.java.devsuperior.OO.triangle.entities;

import java.io.Serializable;

public class Triangle implements Serializable {

    public double a;
    public double b;
    public double c;

    public Triangle() {
    }

    public double calculaMedia() {
        return (a + b + c) / 2.0;
    }

    public double calculaArea() {
        return Math.sqrt(calculaMedia() * (calculaMedia() - a) * (calculaMedia() - b) * (calculaMedia() - c));
    }
}
