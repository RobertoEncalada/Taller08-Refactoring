package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    public ArrayList<Paralelo> paralelos;

    public Ayudante(String matricula, String facultad, ArrayList<Paralelo> paralelos, String nombre, String apellido, int edad, String direccion, String telefono) {
        super(matricula, facultad, paralelos, nombre, apellido, edad, direccion, telefono);
    }
    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos


    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
