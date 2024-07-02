/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todocodejpa;

import com.mycompany.todocodejpa.controladoraDePersitencia.ControladoraPersistenciaAlumno;
import com.mycompany.todocodejpa.logica.Alumno;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author brizu
 */
public class TodoCodeJPA {

    public static void main(String[] args) {
        ControladoraPersistenciaAlumno controladoraAlu =new ControladoraPersistenciaAlumno();
     Alumno alu1= new Alumno(23, "Ibra","The yorkie" , new Date());
       controladoraAlu.crearAlumno(alu1);
//        controladoraAlu.eliminarAlumno(30);
//        alu1.setApellido("de Paula");
//        controladoraAlu.editarAlumno(alu1);
        
        Alumno alumno= controladoraAlu.traerAlumno(30);
        System.out.println("--------------------------BUSQUEDA INDIVIDUAL-----------------");
        System.out.println("el alumno es: "+alumno.toString());
        System.out.println("---------------------------BUSQUEDA DE TODOS---------------------");
        ArrayList<Alumno> listaAlumnos = controladoraAlu.traerListaAlumnos();
        for (Alumno alu : listaAlumnos) {
            System.out.println(""+alu.toString());
        }
        System.out.println("------------------------------------------------------");
    }
}
