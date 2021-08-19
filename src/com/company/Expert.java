package com.company;

public class Expert {
    int idExpert;

    double a1;
    double am;
    double a2;

    public Expert(int idExpert, double a1, double am, double a2) {
        this.idExpert=idExpert;
        this.a1 = a1;
        this.am = am;
        this.a2 = a2;
    }

    public int getIdExpert(){
        return this.idExpert;
    }

    public double getA1() {
        return a1;
    }

    public double getAm() {
        return am;
    }

    public double getA2() {
        return a2;
    }

    @Override
    public String toString() {
        return "Expert"+idExpert+"{" +
                "a1=" + a1 +
                ", am=" + am +
                ", a2=" + a2 +
                '}';
    }
}
