package com.mycompany.inventory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Esteban Correa, Leandro Toro, Jhon Argaez
 */
public class ProductTester {

    //Observacion: La documentacion se encuentra en el idioma ingles, pero lo que se encuentra en español no es relevante para el funcionamiento del programa.
    //Observation: The documentation is in English, but what is in Spanish is not relevant to the operation of the program.
    //Method that reads double numbers and validates them
    static double readDouble(String mensaje) throws IOException {
        //class variable declarationreadDouble
        String income;
        double number = 0;
        boolean validate = true;
        //Algorithm to validate the number entered by the console is a double with the necessary characteristics
        do {
            try {
                System.out.println(mensaje);
                BufferedReader stdin = new BufferedReader(
                        new InputStreamReader(System.in));
                income = stdin.readLine();
                number = Double.parseDouble(income);
                if (number > 0) {
                    validate = false;
                }
                if (number < 0) {
                    System.out.println("DEBE INGRESAR UN NUMERO MAYOR A 0");
                }
            } catch (Exception e) {
                System.out.println("EL DATO INGRESADO NO ES UN NUMERO REAL: ");

            }
        } while (validate == true);
        //return of the validated number
        return number;
    }

    //Method that reads short numbers and validates them
    static short leerShort(String mensaje) throws IOException {
        //class variable leerShort
        String income;
        short number = 0;
        boolean validate = true;
        //Algorithm to validate the number entered by the console is a Short with the necessary characteristics
        do {
            try {
                System.out.println(mensaje);
                BufferedReader stdin = new BufferedReader(
                        new InputStreamReader(System.in));
                income = stdin.readLine();
                number = Short.parseShort(income);
                if (number > 0) {
                    validate = false;
                }
                if (number < 0) {
                    System.out.println("DEBE INGRESAR UN NUMERO MAYOR A 0");
                }
            } catch (Exception e) {
                System.out.println("EL DATO INGRESADO NO ES UN NUMERO REAL o ES MAYOR A 32767: ");

            }
        } while (validate == true);
        //return of the validated number
        return number;
    }

    //main of the project
    public static void main(String[] args) throws IOException {
        //Instance field declarations
        String numberElement;
        String productName;
        short numberUnits;
        double price;
        short unitsStock1 = 50;
        short unitsStock2 = 5;
        int numberData;
        Product enterProduct[] = new Product[6];

        //the function of for is to request the data and add it to a list in order to create a new product
        for (int i = 0; i < 4; i++) {
            System.out.println("Dato de producto numero : " + (i + 1));
            System.out.println("");
            System.out.println("Ingrese el numero de elementos de esta manera #001");
            BufferedReader stdin = new BufferedReader(
                    new InputStreamReader(System.in));
            numberElement = stdin.readLine();
            System.out.println("");

            System.out.println("Ingrese el nombre del producto");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            productName = reader.readLine();
            System.out.println("");

            numberUnits = leerShort("Ingrese el numero de unidades");
            System.out.println("");

            price = readDouble("Ingrese el precio");
            System.out.println("");

            numberData = i;

            ////creation of a product with parameters given by the user
            enterProduct[i] = new Product(numberElement, productName, numberUnits, price, numberData);
        }

        //data burned from the system
        enterProduct[4] = new Product("#0001", "Lapicero", unitsStock1, 2000, 4);
        enterProduct[5] = new Product("#0002", "Impresora", unitsStock2, 1000000, 5);

        //for used to call the function that displays the data of the products
        for (int i = 0; i < enterProduct.length; i++) {
            enterProduct[i].showProduct();
        }
    }
}
