/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;

/**
 *
 * @author Esteban Correa, Leandro Toro, Jhon Argaez
 */

public class Product{
    //Instance field declarations
    private String numberElement;
    private String productName;
    private short numberUnits;
    private double price;
    private int numberData;
    
    //Its functionality is given to be able to create the products without sending any parameters
    public Product(){
    
        
    }
    
    public Product(String numberElement, String productName, short numberUnits, double price, int numberData){
        this.numberElement = numberElement;
        this.productName = productName;
        this.numberUnits = numberUnits;
        this.price = price;
        this.numberData = numberData;
    }

    //The functionality of the get is to generate a return of data and the set is used to save some value on an attribute

    public String getNumberElement() {
        return numberElement;
    }

    public void setNumberElement(String numberElement) {
        this.numberElement = numberElement;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public short getNumberUnits() {
        return numberUnits;
    }

    public void setNumberUnits(short numberUnits) {
        this.numberUnits = numberUnits;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberData() {
        return numberData;
    }

    public void setNumberData(int numberData) {
        this.numberData = numberData;
    }

            
   
    //Its function is to capture the variables and use them to send the data in the following format
    public void showProduct() {
        System.out.println("");
        System.out.println("+=========================================+" );
        System.out.println("|             DATOS!" + getNumberData());
        System.out.println("+=========================================+" );
        System.out.println("|Item Number:              | " + getNumberElement());
        System.out.println("|Name:                     | " + getProductName());
        System.out.println("|Quantity in stock:        | " + getNumberUnits());
        System.out.println("|Price:                    | " + getPrice());
        System.out.println("+=========================================+" );
        System.out.println("" );
        System.out.println("" );
        System.out.println("" );
    }
    
    
}
