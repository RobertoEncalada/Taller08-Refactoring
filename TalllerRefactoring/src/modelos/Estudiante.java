package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona{
    //Informacion del estudiante
    private String matricula;
    private String facultad;
    private ArrayList<Paralelo> paralelos;
    
    //Getter y setter de Matricula
    
    public Estudiante(String matricula, String facultad, ArrayList<Paralelo> paralelos, String nombre, String apellido, int edad, String direccion, String telefono) {
        super(nombre, apellido, edad, direccion, telefono);
        this.matricula = matricula;
        this.facultad = facultad;
        this.paralelos = paralelos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //Getter y setter de la Facultad
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNota(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double nota=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                nota=notaTeorico+notaPractico;
            }
        }
        return nota;
    }

    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().getNotaInicial()+p.getMateria().getNotaFinal())/2;
                
            }
        }
        return notaTotal;
        
    }
}
        
    
    
    
            
        
        
