package com.company;

import java.util.ArrayList;

public class Etapa {
    ArrayList<Expert> Experti = new ArrayList<Expert>();


    public void  printEtapa(){


        for (Expert element : Experti) {
            System.out.println(element);

        }
        System.out.println("Media A {"+calculMediea1()+" "+calculMedieam()+" "+calculMediea2()+"}");
    }

    public Etapa(ArrayList < Expert > Experti) {
            this.Experti = Experti;
        }

        public double calculMediea1(){
        double suma=0;
            for (Expert element : Experti)
               suma=suma+ element.getA1();
            return suma/12;
        }
    public double calculMedieam(){
        double suma=0;
        for (Expert element : Experti)
            suma=suma+ element.getAm();
        return suma/12;
    }
    public double calculMediea2(){
        double suma=0;
        for (Expert element : Experti)
            suma=suma+ element.getA2();
        return suma/12;
    }

}
