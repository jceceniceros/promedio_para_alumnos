package com.ORMUZ09a.Tecmilenio;

import java.util.Scanner;

public class Operaciones {

    private String participante;
    private int calif[] = new int[5];
    
    //private String estado;
    // El atributo "estado" lo podemos cambiar a char porque consiste en una sola letra
    private char estado;
    
    //private float promedio;
    // Para mantener el programa simple podemos trabajar "promedio" como un entero
    private int promedio;
    
    //public float calcular_promedio(int[] calif) {
    // El método esta correctamente declarado
    // pero podemos eliminar el parámetro int[] calif
    // y usar el atributo de la clase que declaraste en la línea 8
    // también podemos no regresar nada (void) y asignar el promedio
    // al atributo "promedio" de la clase (linea 16)
    public void calcular_promedio() {
        Scanner scaner = new Scanner(System.in);
        
        //this.calif = calif;
        // Ya no es necesario usar this, porque el parámetro ya no existe en la firma del método, se elimino (línea 24)
        
        int suma = 0;
        
        //float promedio;
        // Ya no es necesario porque usaremos el atributo "promedio" de la clase (linea 16)

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
        promedio = (suma / calif.length); // Se asigna a "promedio" línea 16

        //return promedio;
        // Ya no es necesario porque no estamos regresando nada en la firma del método (void) (línea 24)
    }

    //public <promedio> void evaluar_estado(promedio) {
    // El método está bien, solo no debe ir <promedio> ya que void indica que no se va a regresar nada
    // También podemos eliminar el parámetro promedio para utilizar el atributo de la clase (línea 16)
    public void evaluar_estado() {
       /*
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
        */
        // Aquí hay que modificar el bloque completo
        // los rangos de las condiciones estan perfectos, pero hay que refactorizar
        // observa como cada condición debe evaluar "promedio" tanto a la derecha como a la izquierda
        // También usaremos los ejemplos del tema 7 para restructurar los if-else-if-else
        if (promedio > 50 && promedio <= 60){
            estado = 'E';
        } else if (promedio > 60 && promedio <= 70) {
            estado = 'D';
        } else if (promedio > 70 && promedio <= 80) {
            estado = 'C';
        } else if (promedio > 80 && promedio <= 90) {
            estado = 'B';
        } else if (promedio > 90 && promedio <= 100) {
            estado = 'A';
        } else {
            estado = 'F';
        }
        
        //return;
        // Ya no es necesario porque no regresamos nada (void) (línea 58)
    }


    public void mostrar_mensajes(){
        Scanner nom = new Scanner(System.in);
        System.out.println("Ingresar Nombre del Participante:");
        participante = nom.nextLine();

        System.out.println("Calificacion 1:"+calif[0]);

        System.out.println("Calificacion 2:"+calif[1]);

        System.out.println("Calificacion 3:"+calif[2]);

        System.out.println("Calificacion 4:"+calif[3]);

        System.out.println("Calificacion 5:"+calif[4]);

        System.out.println("Promedio: " + promedio);

        //System.out.println("Calificacion: " + evaluar_estado());
        // Se debe imprimir el atributo "estado" que se asigna al llamar evaluar_estado
        System.out.println("Calificacion: " + estado);
    }

}




