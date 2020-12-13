package com.company;

public class Car {

    public String Hersteller ;
    public String Model;
    public String fzg;
    public Motor Motortyp;
    public int Ps;
    public String Getriebe;
    public String Aufbau;
    public double Verkaufspreis;
    private double Einkaufspreis;
    public String Farbe;

    public Car(String Hersteller, String Model, String fzg, Motor Motortyp, int Ps, String Getriebe, String Aufbau,
               String Farbe, int Einkaufspreis, String Bauform, String Kraftstoff, int Zylinder, int Hubraum, int Drehzahl){
        this.Motortyp = new Motor(Bauform, Kraftstoff, Zylinder, Hubraum, Drehzahl);
        this.Hersteller = Hersteller;
        this.Model = Model;
        this.fzg= fzg;

        this.Ps = Ps;
        this.Getriebe = Getriebe;
        this.Aufbau = Aufbau;
        this.Farbe = Farbe;
        this.Einkaufspreis = Einkaufspreis;
        this.Verkaufspreis = Einkaufspreis * 1.15;


    };

    public  void getFarbe(){
        System.out.println(this.Farbe);
    }

    public void getEinKaufspreis(){
        System.out.println(this.Einkaufspreis);
    }

    public void updateEinkaufspreis(double newPreis){
        this.Einkaufspreis = newPreis;
    }

}
