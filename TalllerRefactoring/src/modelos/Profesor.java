package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    private String codigo;
    private ArrayList<Paralelo> paralelos;
    private int añosdeTrabajo;
    private String facultad;
    private double BonoFijo;

    public Profesor(String nombre, String apellido, int edad, String direccion, String telefono, String codigo, ArrayList<Paralelo> paralelos, int añosdeTrabajo, String facultad, double BonoFijo) {
        super(nombre,apellido,edad,direccion, telefono);
        this.codigo = codigo;
        this.paralelos = paralelos;
        this.añosdeTrabajo = añosdeTrabajo;
        this.facultad = facultad;
        this.BonoFijo = BonoFijo;
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
    public double calcularSueldo(){
        return añosdeTrabajo*600 + BonoFijo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    public void setParalelos(ArrayList<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }

    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    public void setAñosdeTrabajo(int añosdeTrabajo) {
        this.añosdeTrabajo = añosdeTrabajo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }

    public void setBonoFijo(double BonoFijo) {
        this.BonoFijo = BonoFijo;
    }
    
    
}
