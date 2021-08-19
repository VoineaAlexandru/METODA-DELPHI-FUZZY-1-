package com.company;

import jdk.internal.jimage.ImageStrings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        Expert e1= new Expert(1, 36, 40 ,50);
        Expert e2= new Expert(2, 40, 45 ,60);
        Expert e3= new Expert(3, 36, 48 ,60);
        Expert e4= new Expert(4, 48, 60 ,72);
        Expert e5= new Expert(5, 36, 36 ,36);
        Expert e6= new Expert(6, 38, 40 ,42);
        Expert e7= new Expert(7, 38, 48 ,58);
        Expert e8= new Expert(8, 36, 42 ,48);
        Expert e9= new Expert(9, 40, 52 ,60);
        Expert e10= new Expert(10, 48, 48 ,60);
        Expert e11= new Expert(11, 36, 36 ,60);
        Expert e12=new Expert(12, 36, 48 ,60);

        ArrayList<Expert> Experti = new ArrayList<Expert>( );
        Experti.add(e1);
        Experti.add(e2);
        Experti.add(e3);
        Experti.add(e4);
        Experti.add(e5);
        Experti.add(e6);
        Experti.add(e7);
        Experti.add(e8);
        Experti.add(e9);
        Experti.add(e10);
        Experti.add(e11);
        Experti.add(e12);

        Etapa etapa = new Etapa(Experti);
      //  etapa1.printEtapa();
       // etapa1.calculMediea1();
      //  etapa1.calculMedieam();
      //  etapa1.calculMediea2();
        GUI();
    }

    private static JLabel labeldelimitator1;
    private static JLabel labeldelimitator2;

    private static JLabel labelMedie;
    private static JLabel labelMedieA1;
    private static JLabel labelMedieAM;
    private static JLabel labelMedieA2;

    private static JLabel labelDistantaMediilor;
    private static JLabel labelCalculDistantaMediilor;
    private static boolean access;



    private static JLabel labelExpert;
    private static JLabel labelA1;
    private static JLabel labelAM;
    private static JLabel labelA2;

    private static JLabel labelE1;
    private static JTextField fieldE1a1;
    private static JTextField fieldE1aM;
    private static JTextField fieldE1a2;

    private static JLabel labelE2;
    private static JTextField fieldE2a1;
    private static JTextField fieldE2aM;
    private static JTextField fieldE2a2;


    private static JLabel labelE3;
    private static JTextField fieldE3a1;
    private static JTextField fieldE3aM;
    private static JTextField fieldE3a2;

    private static JLabel labelE4;
    private static JTextField fieldE4a1;
    private static JTextField fieldE4aM;
    private static JTextField fieldE4a2;

    private static JLabel labelE5;
    private static JTextField fieldE5a1;
    private static JTextField fieldE5aM;
    private static JTextField fieldE5a2;

    private static JLabel labelE6;
    private static JTextField fieldE6a1;
    private static JTextField fieldE6aM;
    private static JTextField fieldE6a2;

    private static JLabel labelE7;
    private static JTextField fieldE7a1;
    private static JTextField fieldE7aM;
    private static JTextField fieldE7a2;

    private static JLabel labelE8;
    private static JTextField fieldE8a1;
    private static JTextField fieldE8aM;
    private static JTextField fieldE8a2;

    private static JLabel labelE9;
    private static JTextField fieldE9a1;
    private static JTextField fieldE9aM;
    private static JTextField fieldE9a2;

    private static JLabel labelE10;
    private static JTextField fieldE10a1;
    private static JTextField fieldE10aM;
    private static JTextField fieldE10a2;

    private static JLabel labelE11;
    private static JTextField fieldE11a1;
    private static JTextField fieldE11aM;
    private static JTextField fieldE11a2;

    private static JLabel labelE12;
    private static JTextField fieldE12a1;
    private static JTextField fieldE12aM;
    private static JTextField fieldE12a2;

    private static JLabel labelDistanta;
    private static JLabel labelDistantaE1;
    private static JLabel labelDistantaE2;
    private static JLabel labelDistantaE3;
    private static JLabel labelDistantaE4;
    private static JLabel labelDistantaE5;
    private static JLabel labelDistantaE6;
    private static JLabel labelDistantaE7;
    private static JLabel labelDistantaE8;
    private static JLabel labelDistantaE9;
    private static JLabel labelDistantaE10;
    private static JLabel labelDistantaE11;
    private static JLabel labelDistantaE12;

    private static JButton calculeazaButton;
    private static JButton nextButton;
    private static JButton closeButton;


    public static void GUI() {



        JPanel panel = new JPanel();

        JFrame frame =new JFrame();
        frame.setSize(600, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Metoda Delphi Fuzzy");
        panel.setLayout(null);
        frame.add(panel);
//----------------------------------------------------------------------------------------------------------------------

        Expert e1= new Expert(1, 0, 0 ,0);
        Expert e2= new Expert(2, 0, 0 ,0);
        Expert e3= new Expert(3, 0, 0 ,0);
        Expert e4= new Expert(4, 0, 0 ,0);
        Expert e5= new Expert(5, 0, 0 ,0);
        Expert e6= new Expert(6, 0, 0 ,0);
        Expert e7= new Expert(7, 0, 0 ,0);
        Expert e8= new Expert(8, 0, 0 ,0);
        Expert e9= new Expert(9, 0, 0 ,0);
        Expert e10= new Expert(10, 0, 0 ,0);
        Expert e11= new Expert(11, 0, 0 ,0);
        Expert e12=new Expert(12, 0, 0 ,0);

        ArrayList<Expert> Experti = new ArrayList<Expert>( );
        Experti.add(e1);
        Experti.add(e2);
        Experti.add(e3);
        Experti.add(e4);
        Experti.add(e5);
        Experti.add(e6);
        Experti.add(e7);
        Experti.add(e8);
        Experti.add(e9);
        Experti.add(e10);
        Experti.add(e11);
        Experti.add(e12);

        Etapa etapaTest = new Etapa(Experti);

        ArrayList<Etapa> ListaEtape = new ArrayList<Etapa>();
      //  ListaEtape.add(etapaTest);
        // Capul de tabel:
        labelExpert = new JLabel("Expert");
        labelExpert.setBounds(30, 20, 50, 25);
        panel.add(labelExpert);

        labelA1 = new JLabel("a1");
        labelA1.setBounds(112, 20, 40, 25);
        panel.add(labelA1);

        labelAM = new JLabel("aM");
        labelAM.setBounds(172, 20, 40, 25);
        panel.add(labelAM);

        labelA2 = new JLabel("a2");
        labelA2.setBounds(232, 20, 40, 25);
        panel.add(labelA2);

        labeldelimitator1 = new JLabel("------------------------------------------------------------");
        labeldelimitator1.setBounds(20, 30, 280, 25);
        panel.add(labeldelimitator1);



//----------------------------------------------------------------------------------------------------------------------
        //Expertii:
        labelE1 = new JLabel("E1");
        labelE1.setBounds(42, 50, 40, 25);
        panel.add(labelE1);


        fieldE1a1= new JTextField();
        fieldE1a1.setBounds(100, 50, 40, 25);
        panel.add(fieldE1a1);

        fieldE1aM= new JTextField();
        fieldE1aM.setBounds(160, 50, 40, 25);
        panel.add(fieldE1aM);

        fieldE1a2= new JTextField();
        fieldE1a2.setBounds(220, 50, 40, 25);
        panel.add(fieldE1a2);
        //-----------------------------

        labelE2 = new JLabel("E2");
        labelE2.setBounds(42, 80, 40, 25);
        panel.add(labelE2);


        fieldE2a1= new JTextField();
        fieldE2a1.setBounds(100, 80, 40, 25);
        panel.add(fieldE2a1);

        fieldE2aM= new JTextField();
        fieldE2aM.setBounds(160, 80, 40, 25);
        panel.add(fieldE2aM);

        fieldE2a2= new JTextField();
        fieldE2a2.setBounds(220, 80, 40, 25);
        panel.add(fieldE2a2);
        //-------------------------------------
        labelE3 = new JLabel("E3");
        labelE3.setBounds(42, 110, 40, 25);
        panel.add(labelE3);


        fieldE3a1= new JTextField();
        fieldE3a1.setBounds(100, 110, 40, 25);
        panel.add(fieldE3a1);

        fieldE3aM= new JTextField();
        fieldE3aM.setBounds(160, 110, 40, 25);
        panel.add(fieldE3aM);

        fieldE3a2= new JTextField();
        fieldE3a2.setBounds(220, 110, 40, 25);
        panel.add(fieldE3a2);
        //----------------------------------------
        labelE4 = new JLabel("E4");
        labelE4.setBounds(42, 140, 40, 25);
        panel.add(labelE4);


        fieldE4a1= new JTextField();
        fieldE4a1.setBounds(100, 140, 40, 25);
        panel.add(fieldE4a1);

        fieldE4aM= new JTextField();
        fieldE4aM.setBounds(160, 140, 40, 25);
        panel.add(fieldE4aM);

        fieldE4a2= new JTextField();
        fieldE4a2.setBounds(220, 140, 40, 25);
        panel.add(fieldE4a2);
        //----------------------------------------
        labelE5 = new JLabel("E5");
        labelE5.setBounds(42, 170, 40, 25);
        panel.add(labelE5);


        fieldE5a1= new JTextField();
        fieldE5a1.setBounds(100, 170, 40, 25);
        panel.add(fieldE5a1);

        fieldE5aM= new JTextField();
        fieldE5aM.setBounds(160, 170, 40, 25);
        panel.add(fieldE5aM);

        fieldE5a2= new JTextField();
        fieldE5a2.setBounds(220, 170, 40, 25);
        panel.add(fieldE5a2);
        //----------------------------------------
        labelE6 = new JLabel("E6");
        labelE6.setBounds(42, 200, 40, 25);
        panel.add(labelE6);


        fieldE6a1= new JTextField();
        fieldE6a1.setBounds(100, 200, 40, 25);
        panel.add(fieldE6a1);

        fieldE6aM= new JTextField();
        fieldE6aM.setBounds(160, 200, 40, 25);
        panel.add(fieldE6aM);

        fieldE6a2= new JTextField();
        fieldE6a2.setBounds(220, 200, 40, 25);
        panel.add(fieldE6a2);
        //---------------------------------------
        labelE7 = new JLabel("E7");
        labelE7.setBounds(42, 230, 40, 25);
        panel.add(labelE7);


        fieldE7a1= new JTextField();
        fieldE7a1.setBounds(100, 230, 40, 25);
        panel.add(fieldE7a1);

        fieldE7aM= new JTextField();
        fieldE7aM.setBounds(160, 230, 40, 25);
        panel.add(fieldE7aM);

        fieldE7a2= new JTextField();
        fieldE7a2.setBounds(220, 230, 40, 25);
        panel.add(fieldE7a2);
        //-----------------------------------------
        labelE8 = new JLabel("E8");
        labelE8.setBounds(42, 260, 40, 25);
        panel.add(labelE8);


        fieldE8a1= new JTextField();
        fieldE8a1.setBounds(100, 260, 40, 25);
        panel.add(fieldE8a1);

        fieldE8aM= new JTextField();
        fieldE8aM.setBounds(160, 260, 40, 25);
        panel.add(fieldE8aM);

        fieldE8a2= new JTextField();
        fieldE8a2.setBounds(220, 260, 40, 25);
        panel.add(fieldE8a2);
        //----------------------------------------
        labelE9 = new JLabel("E9");
        labelE9.setBounds(42, 290, 40, 25);
        panel.add(labelE9);


        fieldE9a1= new JTextField();
        fieldE9a1.setBounds(100, 290, 40, 25);
        panel.add(fieldE9a1);

        fieldE9aM= new JTextField();
        fieldE9aM.setBounds(160, 290, 40, 25);
        panel.add(fieldE9aM);

        fieldE9a2= new JTextField();
        fieldE9a2.setBounds(220, 290, 40, 25);
        panel.add(fieldE9a2);
        //----------------------------------------
        labelE10 = new JLabel("E10");
        labelE10.setBounds(42, 320, 40, 25);
        panel.add(labelE10);


        fieldE10a1= new JTextField();
        fieldE10a1.setBounds(100, 320, 40, 25);
        panel.add(fieldE10a1);

        fieldE10aM= new JTextField();
        fieldE10aM.setBounds(160, 320, 40, 25);
        panel.add(fieldE10aM);

        fieldE10a2= new JTextField();
        fieldE10a2.setBounds(220, 320, 40, 25);
        panel.add(fieldE10a2);
        //---------------------------------------
        labelE11 = new JLabel("E11");
        labelE11.setBounds(42, 350, 40, 25);
        panel.add(labelE11);


        fieldE11a1= new JTextField();
        fieldE11a1.setBounds(100, 350, 40, 25);
        panel.add(fieldE11a1);

        fieldE11aM= new JTextField();
        fieldE11aM.setBounds(160, 350, 40, 25);
        panel.add(fieldE11aM);

        fieldE11a2= new JTextField();
        fieldE11a2.setBounds(220, 350, 40, 25);
        panel.add(fieldE11a2);
        //---------------------------------------
        labelE12 = new JLabel("E12");
        labelE12.setBounds(42, 380, 40, 25);
        panel.add(labelE12);


        fieldE12a1= new JTextField();
        fieldE12a1.setBounds(100, 380, 40, 25);
        panel.add(fieldE12a1);

        fieldE12aM= new JTextField();
        fieldE12aM.setBounds(160, 380, 40, 25);
        panel.add(fieldE12aM);

        fieldE12a2= new JTextField();
        fieldE12a2.setBounds(220, 380, 40, 25);
        panel.add(fieldE12a2);

        labeldelimitator2 = new JLabel("------------------------------------------------------------");
        labeldelimitator2.setBounds(20, 400, 280, 25);
        panel.add(labeldelimitator2);
        //-------------------------------------------------------------------------------------------------------------
        //Butoane:
            access=true;
        calculeazaButton = new JButton("Calculeaza");
        calculeazaButton.setBounds(30, 500, 100, 25);
        calculeazaButton.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (access == true) {
                    Expert e1 = new Expert(1, Double.parseDouble(fieldE1a1.getText()), Double.parseDouble(fieldE1aM.getText()), Double.parseDouble(fieldE1a2.getText()));
                    Expert e2 = new Expert(2, Double.parseDouble(fieldE2a1.getText()), Double.parseDouble(fieldE2aM.getText()), Double.parseDouble(fieldE2a2.getText()));
                    Expert e3 = new Expert(3, Double.parseDouble(fieldE3a1.getText()), Double.parseDouble(fieldE3aM.getText()), Double.parseDouble(fieldE3a2.getText()));
                    Expert e4 = new Expert(4, Double.parseDouble(fieldE4a1.getText()), Double.parseDouble(fieldE4aM.getText()), Double.parseDouble(fieldE4a2.getText()));
                    Expert e5 = new Expert(5, Double.parseDouble(fieldE5a1.getText()), Double.parseDouble(fieldE5aM.getText()), Double.parseDouble(fieldE5a2.getText()));
                    Expert e6 = new Expert(6, Double.parseDouble(fieldE6a1.getText()), Double.parseDouble(fieldE6aM.getText()), Double.parseDouble(fieldE6a2.getText()));
                    Expert e7 = new Expert(7, Double.parseDouble(fieldE7a1.getText()), Double.parseDouble(fieldE7aM.getText()), Double.parseDouble(fieldE7a2.getText()));
                    Expert e8 = new Expert(8, Double.parseDouble(fieldE8a1.getText()), Double.parseDouble(fieldE8aM.getText()), Double.parseDouble(fieldE8a2.getText()));
                    Expert e9 = new Expert(9, Double.parseDouble(fieldE9a1.getText()), Double.parseDouble(fieldE9aM.getText()), Double.parseDouble(fieldE9a2.getText()));
                    Expert e10 = new Expert(10, Double.parseDouble(fieldE10a1.getText()), Double.parseDouble(fieldE10aM.getText()), Double.parseDouble(fieldE10a2.getText()));
                    Expert e11 = new Expert(11, Double.parseDouble(fieldE11a1.getText()), Double.parseDouble(fieldE11aM.getText()), Double.parseDouble(fieldE11a2.getText()));
                    Expert e12 = new Expert(12, Double.parseDouble(fieldE12a1.getText()), Double.parseDouble(fieldE12aM.getText()), Double.parseDouble(fieldE12a2.getText()));

                    ArrayList<Expert> Experti = new ArrayList<Expert>();
                    Experti.add(e1);
                    Experti.add(e2);
                    Experti.add(e3);
                    Experti.add(e4);
                    Experti.add(e5);
                    Experti.add(e6);
                    Experti.add(e7);
                    Experti.add(e8);
                    Experti.add(e9);
                    Experti.add(e10);
                    Experti.add(e11);
                    Experti.add(e12);
                    Etapa etapa = new Etapa(Experti);
                    ListaEtape.add(etapa);


                    labelDistanta = new JLabel("Distanta");
                    labelDistanta.setBounds(292, 20, 50, 25);
                    panel.add(labelDistanta);

                    labelDistantaE1 = new JLabel(String.format("%.2f",(Math.max(Math.abs(etapa.calculMediea1() - e1.getA1()), Math.abs(etapa.calculMediea2() - e1.getA2())) + Math.abs(etapa.calculMedieam() - e1.getAm())) / 2));
                    labelDistantaE1.setBounds(292, 50, 50, 25);
                    panel.add(labelDistantaE1);

                    labelDistantaE2 = new JLabel(String.format("%.2f",(Math.max(Math.abs(etapa.calculMediea1() - e2.getA1()), Math.abs(etapa.calculMediea2() - e2.getA2())) + Math.abs(etapa.calculMedieam() - e2.getAm())) / 2));
                    labelDistantaE2.setBounds(292, 80, 50, 25);
                    panel.add(labelDistantaE2);

                    labelDistantaE3 = new JLabel(String.format("%.2f",(Math.max(Math.abs(etapa.calculMediea1() - e3.getA1()), Math.abs(etapa.calculMediea2() - e3.getA2())) + Math.abs(etapa.calculMedieam() - e3.getAm())) / 2));
                    labelDistantaE3.setBounds(292, 110, 50, 25);
                    panel.add(labelDistantaE3);

                    labelDistantaE4 = new JLabel(String.format("%.2f",(Math.max(Math.abs(etapa.calculMediea1() - e4.getA1()), Math.abs(etapa.calculMediea2() - e4.getA2())) + Math.abs(etapa.calculMedieam() - e4.getAm())) / 2));
                    labelDistantaE4.setBounds(292, 140, 50, 25);
                    panel.add(labelDistantaE4);

                    labelDistantaE5 = new JLabel(String.format("%.2f",(Math.max(Math.abs(etapa.calculMediea1() - e5.getA1()), Math.abs(etapa.calculMediea2() - e5.getA2())) + Math.abs(etapa.calculMedieam() - e5.getAm())) / 2));
                    labelDistantaE5.setBounds(292, 170, 50, 25);
                    panel.add(labelDistantaE5);

                    labelDistantaE6 = new JLabel(String.format("%.2f",(Math.max(Math.abs(etapa.calculMediea1() - e6.getA1()), Math.abs(etapa.calculMediea2() - e6.getA2())) + Math.abs(etapa.calculMedieam() - e6.getAm())) / 2));
                    labelDistantaE6.setBounds(292, 200, 50, 25);
                    panel.add(labelDistantaE6);

                    labelDistantaE7 = new JLabel(String.format("%.2f",(Math.max(Math.abs(etapa.calculMediea1() - e7.getA1()), Math.abs(etapa.calculMediea2() - e7.getA2())) + Math.abs(etapa.calculMedieam() - e7.getAm())) / 2));
                    labelDistantaE7.setBounds(292, 230, 50, 25);
                    panel.add(labelDistantaE7);

                    labelDistantaE8 = new JLabel(String.format("%.2f", (Math.max(Math.abs(etapa.calculMediea1() - e8.getA1()), Math.abs(etapa.calculMediea2() - e8.getA2())) + Math.abs(etapa.calculMedieam() - e8.getAm())) / 2));
                    labelDistantaE8.setBounds(292, 260, 50, 25);
                    panel.add(labelDistantaE8);

                    labelDistantaE9 = new JLabel(String.format("%.2f",(Math.max(Math.abs(etapa.calculMediea1() - e9.getA1()), Math.abs(etapa.calculMediea2() - e9.getA2())) + Math.abs(etapa.calculMedieam() - e9.getAm())) / 2));
                    labelDistantaE9.setBounds(292, 290, 50, 25);
                    panel.add(labelDistantaE9);

                    labelDistantaE10 = new JLabel(String.format("%.2f",(Math.max(Math.abs(etapa.calculMediea1() - e10.getA1()), Math.abs(etapa.calculMediea2() - e10.getA2())) + Math.abs(etapa.calculMedieam() - e10.getAm())) / 2));
                    labelDistantaE10.setBounds(292, 320, 50, 25);
                    panel.add(labelDistantaE10);

                    labelDistantaE11 = new JLabel(String.format("%.2f",(Math.max(Math.abs(etapa.calculMediea1() - e11.getA1()), Math.abs(etapa.calculMediea2() - e11.getA2())) + Math.abs(etapa.calculMedieam() - e11.getAm())) / 2));
                    labelDistantaE11.setBounds(292, 350, 50, 25);
                    panel.add(labelDistantaE11);

                    labelDistantaE12 = new JLabel(String.format("%.2f",(Math.max(Math.abs(etapa.calculMediea1() - e12.getA1()), Math.abs(etapa.calculMediea2() - e12.getA2())) + Math.abs(etapa.calculMedieam() - e12.getAm())) / 2));
                    labelDistantaE12.setBounds(292, 380, 50, 25);
                    panel.add(labelDistantaE12);

                    labelMedie = new JLabel("Medie");
                    labelMedie.setBounds(30, 430, 50, 25);
                    panel.add(labelMedie);

                    labelMedieA1 = new JLabel(String.format("%.2f", etapa.calculMediea1()));
                    labelMedieA1.setBounds(112, 430, 50, 25);
                    panel.add(labelMedieA1);

                    labelMedieAM = new JLabel(String.format("%.2f", etapa.calculMedieam()));
                    labelMedieAM.setBounds(172, 430, 50, 25);
                    panel.add(labelMedieAM);

                    labelMedieA2 = new JLabel(String.format("%.2f", etapa.calculMediea2()));
                    labelMedieA2.setBounds(232, 430, 50, 25);
                    panel.add(labelMedieA2);

                    if (ListaEtape.size() >= 2) {

                        double mediaa1A = ListaEtape.get(ListaEtape.size() - 2).calculMediea1();
                        double mediaa2A = ListaEtape.get(ListaEtape.size() - 2).calculMediea2();
                        double mediaaMA = ListaEtape.get(ListaEtape.size() - 2).calculMedieam();

                        double mediaa1B = ListaEtape.get(ListaEtape.size() - 1).calculMediea1();
                        double mediaa2B = ListaEtape.get(ListaEtape.size() - 1).calculMediea2();
                        double mediaaMB = ListaEtape.get(ListaEtape.size() - 1).calculMedieam();


                        labelDistantaMediilor = new JLabel("Distanta mediilor:");
                        labelDistantaMediilor.setBounds(30, 450, 100, 25);
                        panel.add(labelDistantaMediilor);

                        labelCalculDistantaMediilor = new JLabel(String.format("%.2f", (Math.max(Math.abs(mediaa1A - mediaa1B), Math.abs(mediaa2A - mediaa2B)) + Math.abs(mediaaMA - mediaaMB)) / 2));
                        labelCalculDistantaMediilor.setBounds(150, 450, 50, 25);
                        panel.add(labelCalculDistantaMediilor);
                    }


                    panel.revalidate();
                    panel.repaint();
                    access=false;
                }
            }
        });
        panel.add(calculeazaButton);

        nextButton = new JButton("Next");
        nextButton.setBounds(30, 550, 100, 25);
        nextButton.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(labelDistanta);
                panel.remove(labelDistantaE1);
                panel.remove(labelDistantaE2);
                panel.remove(labelDistantaE3);
                panel.remove(labelDistantaE4);
                panel.remove(labelDistantaE5);
                panel.remove(labelDistantaE6);
                panel.remove(labelDistantaE7);
                panel.remove(labelDistantaE8);
                panel.remove(labelDistantaE9);
                panel.remove(labelDistantaE10);
                panel.remove(labelDistantaE11);
                panel.remove(labelDistantaE12);
                panel.remove(labelMedie);
                panel.remove(labelMedieA1);
                panel.remove(labelMedieAM);
                panel.remove(labelMedieA2);
                Component[] components = panel.getComponents();



                    if(ListaEtape.size()>=2){
                        panel.remove(labelDistantaMediilor);
                        panel.remove(labelCalculDistantaMediilor);
                    }









                panel.revalidate();
                panel.repaint();
                access=true;
            }
        });
        panel.add(nextButton);

        closeButton = new JButton("Close");
        closeButton.setBounds(160, 480, 100, 25);
        closeButton.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        //panel.add(closeButton);




        frame.setVisible(true);
}


}
