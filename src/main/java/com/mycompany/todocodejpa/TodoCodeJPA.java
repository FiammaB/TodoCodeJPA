/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todocodejpa;

import com.mycompany.todocodejpa.controladoraDePersitencia.ControladoraPersistenciaAlumno;
import com.mycompany.todocodejpa.controladoraDePersitencia.ControladoraPersistenciaCarrera;
import com.mycompany.todocodejpa.controladoraDePersitencia.ControladoraPersistenciaMateria;
import com.mycompany.todocodejpa.logica.Alumno;
import com.mycompany.todocodejpa.logica.Carrera;
import com.mycompany.todocodejpa.logica.Materia;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author brizu
 */
public class TodoCodeJPA {

    public static void main(String[] args) {
        ControladoraPersistenciaAlumno controladoraAlu =new ControladoraPersistenciaAlumno();
        ControladoraPersistenciaCarrera controladoraCarre = new ControladoraPersistenciaCarrera();
        ControladoraPersistenciaMateria controladoraMateria= new ControladoraPersistenciaMateria();
    
        //creacion lista de Materia
        LinkedList<Materia> listaMaterias =  new LinkedList<>();    
        // creacion carrera con lista materia
        Carrera carre =new Carrera(1, "Tecnicatura en programcaión",listaMaterias);
        //guardado de carrera en BD
        controladoraCarre.crearCarrera(carre);
        
        //creacion de materias
        Materia mate1 = new Materia(58, "programación 1", "cuatrimestral",carre);
        Materia mate2 = new Materia(59, "programación 2", "cuatrimestral",carre);
        Materia mate3 = new Materia(60, "programación Avanzada", "Anual",carre);
        
        //guardado materias en BD
        
        controladoraMateria.crearMateria(mate1);
         controladoraMateria.crearMateria(mate2);
         controladoraMateria.crearMateria(mate3);
         
         // agregamos  a la lista materias
         
         listaMaterias.add(mate1);
         listaMaterias.add(mate2);
         listaMaterias.add(mate3);
         carre.setListaMaterias(listaMaterias);
         controladoraCarre.editarCarrera(carre);
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
