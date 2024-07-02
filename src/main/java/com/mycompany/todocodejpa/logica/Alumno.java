
package com.mycompany.todocodejpa.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Alumno implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  
  @Basic
  private  String nombre;
  private  String Apellido;
  @Temporal(TemporalType.DATE)
  private Date fechaNac;

    public Alumno(int id, String nombre, String Apellido, Date fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido= Apellido;
        this.fechaNac = fechaNac;
    }

   

    public Alumno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido= Apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", Apellido=" + Apellido + ", fechaNac=" + fechaNac + '}';
    }
          
}
