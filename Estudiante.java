/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Aprendiz
 */
class Estudiante extends Persona{
    
    private int contador = 0;

    public Estudiante(String nombre, String genero, String materia, double Nota, String Calificacion) {
        super(nombre, genero, materia, Nota, Calificacion);
    }



    
    public int contarRegulares(){
        for (int i = 0; i < cantidad.legth; i++) {
            if (calificación === regular) {
                contador = contador + 1;
            }
        }
      
    return contador;}
    
}

  public static void main(String[] args) {
      
    Estudiante = estudi new Estudiante (nombre, genero, materia, Nota, Calificacion);
      
      
        System.out.println(Estudiante);
    }

