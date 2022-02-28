/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.acitividad2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author wilfr
 */
public class Estudiante {
    //definicion de mis variables de clase 

    private String nombres;
    private String apellido;
    private int edad;
    private String genero;
    private String carrera;
    private int carnet;
    private String[] materias = new String[5];

    private Scanner teclado;
// asignamos el constructor vacio por defecto

    public Estudiante() {

        nombres = "wilfredo";
        apellido = "alas";
        edad = 20;
        genero = "hombre";
        carrera = "tecnologias";
        carnet = 201800923;

    }
    // asignamos otro constructor donde estaran los datos personales del alumno 

    public Estudiante(String nombres, String apellido, int edad, String genero, String carrera, int carnet) {

        this.nombres = nombres;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.carrera = carrera;
        this.carnet = carnet;
    }

// asignamos los metodos get y set para cada variable 
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCarnet() {
        return carnet;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void IngresarMaterias() {

        teclado = new Scanner(System.in);
        System.out.println("Materia 1");
        this.materias[0] = teclado.next();
        teclado = new Scanner(System.in);
        System.out.println("Materia 2");
        this.materias[1] = teclado.next();
        teclado = new Scanner(System.in);
        System.out.println("Materia 3");
        this.materias[2] = teclado.next();
        teclado = new Scanner(System.in);
        System.out.println("Materia 4");
        this.materias[3] = teclado.next();
        teclado = new Scanner(System.in);
        System.out.println("Materia 5");
        this.materias[4] = teclado.next();

    }

    // procedimiento que no retorna valor
    public void IngresarDatos() {

        teclado = new Scanner(System.in);
        System.out.println("ingresar sus nombres ");
        this.nombres = teclado.next();
        System.out.println("ingresar sus apellidos ");
        this.apellido = teclado.next();
        System.out.println("ingresar su edad ");
        this.edad = teclado.nextInt();
        System.out.println("ingresar sus genero ");
        this.genero = teclado.next();
        System.out.println("ingresar su carrera ");
        this.carrera = teclado.next();
        System.out.println("ingresar su carnet ");
        this.carnet = teclado.nextInt();

    }
// clase para mostrar datos

    class Datos extends Estudiante {
    }

    public void MostrarDatos() {
        System.out.println(" nombre = " + nombres);
        System.out.println("apellidos = " + apellido);
        System.out.println("genero = " + edad);
        System.out.println("genero = " + genero);
        System.out.println("carrera = " + carrera);
        System.out.println("carnet = " + carnet);
        System.out.println("materia1 = " + materias[0]);
        System.out.println("materia2 = " + materias[1]);
        System.out.println("materia3 = " + materias[2]);
        System.out.println("materia4 = " + materias[3]);
        System.out.println("materia5 = " + materias[4]);

    }
}
