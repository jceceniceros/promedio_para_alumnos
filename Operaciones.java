package com.ORMUZ09a.Tecmilenio;

import java.util.Scanner;

public class Operaciones {

    private String participante;
    private int calif[] = new int[5];
    private String estado;
    private float promedio;

    public float calcular_promedio(int[] calif) {
        Scanner scaner = new Scanner(System.in);
        this.calif = calif;

        int suma = 0;
        float promedio;

        System.out.println("Primera Calificacion:\n ");
        calif[0] = scaner.nextInt();
        System.out.println("Seguda Calificacion:\n ");
        calif[1] = scaner.nextInt();
        System.out.println("Tercera Calificacion:\n ");
        calif[2] = scaner.nextInt();
        System.out.println("Cuarta Calificacion:\n ");
        calif[3] = scaner.nextInt();
        System.out.println("Quinta Calificacion:\n ");
        calif[4] = scaner.nextInt();

        for (int i = 0; i < calif.length; i++) {
            suma += calif[i];
        }
        promedio = (suma / calif.length);

        return promedio;
    }

    public <promedio> void evaluar_estado(promedio) {

        if (promedio > 50 &&<=60){
            estado = "E";
        }else {
            if (promedio > 60 && <=70) {
                estado = "D";
                  }
            }else {
                if (promedio > 70 && <=80) {
                     estado = "C";
                        }
                 }else {
                     if (promedio > 80 && <=90) {
                         estado = "B";
                             }
                        }else {
                              if (promedio > 90 && <=100) {
                                  estado = "A";
                                      }
                                  }else {
                                     estado = "F";
                                          }
        return;
    }


    public void mostrar_mensajes(){
        Scanner nom=  new Scanner(System.in);
        System.out.println("Ingresar Nombre del Participante:");
        participante =nom.nextLine();

        System.out.println("Calificacion 1:"+calif[0]);

        System.out.println("Calificacion 2:"+calif[1]);

        System.out.println("Calificacion 3:"+calif[2]);

        System.out.println("Calificacion 4:"+calif[3]);

        System.out.println("Calificacion 5:"+calif[4]);

        System.out.println("Promedio: " +promedio);

        System.out.println("Calificacion: " +evaluar_estado());

    }


    }




