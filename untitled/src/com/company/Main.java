package com.company;

public class Main {

    public static void main(String[] args) {


        Motor V8 = new Motor("V8", "Diesel", 6, 3000, 6000);

        Car bmw= new Car("BMW", "M4", "Fahrzeug", V8, 300, "Manuell", "Coupe", "Rot", 45000, "V8", "Diesel", 3, 3333, 6666);
	Car mercedes = new Car("Mercedes", "C63 AMG", "Test", V8, 350, "Manuell", "Limo", "Schwarz", 55000, "V8", "Diesel", 3, 3333, 6666);

       bmw.updateEinkaufspreis(50000);
       bmw.getEinKaufspreis();



        schneller(bmw, mercedes);
    }

    public static void schneller( Car one, Car two){
        Car t =one;
       if (one.Ps > two.Ps) {
           t = one;
       } else t = two;



        System.out.printf("Der %s %s ist schneller mit %d ps", t.Hersteller, t.Model, t.Ps);
    }
}
