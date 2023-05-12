/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Antonio Matias
 */
public class Temperatura {
    private double farenheit;
    private double celsius;

    public Temperatura(double farenheit, double celsius) {
        this.farenheit = farenheit;
        this.celsius = celsius;
    }

    public Temperatura() {
    }

    public double getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(double farenheit) {
        this.farenheit = farenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    
    public double celsiusToFarenheit(){
        farenheit=(1.8)*(celsius+32);
    return farenheit;
    }    
    
    public double farenheitToCelsius(){
        celsius=(farenheit-32)/1.8;
    return celsius;
    }
}
