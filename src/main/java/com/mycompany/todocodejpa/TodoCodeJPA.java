/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todocodejpa;

import com.mycompany.todocodejpa.controladoraDePersitencia.ControladoraPersistenciaAlumno;
import com.mycompany.todocodejpa.controladoraDePersitencia.ControladoraPersistenciaCarrera;
import com.mycompany.todocodejpa.logica.Alumno;
import com.mycompany.todocodejpa.logica.Carrera;

import java.util.Date;

/**
 *
 * @author brizu
 */
public class TodoCodeJPA {

    public static void main(String[] args) {
        ControladoraPersistenciaAlumno controladoraAlu =new ControladoraPersistenciaAlumno();
        ControladoraPersistenciaCarrera controladoraCarre = new ControladoraPersistenciaCarrera();
        // creacion carrera
        Carrera carre =new Carrera(1, "Tecnicatura en programcaión");
        //guardado de carrera en BD
        controladoraCarre.crearCarrera(carre);
        //creacion de alumno
     Alumno alu1= new Alumno(23, "Ibra","The yorkie" , new Date(),carre);
     //guardar alumno en BD
       controladoraAlu.crearAlumno(alu1);
    //Vemos el resultado
        System.out.println("------------------------------------------"); 
        System.out.println("----------DATOS ALUMNO------------");
        Alumno alu = controladoraAlu.traerAlumno(23);
        System.out.println("Alumno: "+ alu.getNombre()+" "+alu.getApellido());
        System.out.println("cursa la carerra de: "+ alu.getCarrera().getNombre());
        
    }
}
