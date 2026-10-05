/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Aprendiz
 */
public class Persona {

 

    protected String nombre;
    protected String genero;
    protected String materia;
    protected double Nota;
    protected String Calificacion;
    ;

    public Persona(String nombre, String genero, String materia, double Nota, String Calificacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.materia = materia;
        this.Nota = Nota;
        this.Calificacion = Calificacion;
    }

    public String Calificacion() {

        if (Nota <= 5) {
            Calificacion = "Excelente";
        } else if (Nota <= 4.5) {
            Calificacion = "Sobresaliente";
        } else if (Nota <= 3.5) {
            Calificacion = "Regular";
        } else if (Nota <= 2.5) {
            Calificacion = "insuficiente";
        } else {
            Calificacion = "Deficiente";
        }

        return Calificacion;

    }
}
