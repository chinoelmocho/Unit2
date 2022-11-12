/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estidiante_Servicio;
import java.util.ArrayList;
import java.util.List;
import modelo1.Estudiante;
/**
 *
 * @author David
 */
public class Estudiante_Servicio {
    List<Estudiante> estudianteList;

    public Estudiante_Servicio() {
        this.estudianteList = new ArrayList<>();
    }
    
    
    
    public void crear(Estudiante estudiantes){
    this.estudianteList.add(estudiantes);
    
    }
    public List<Estudiante> listar(){
    return this.estudianteList;
    }
    public void eliminar(int posicion){
    this.estudianteList.remove(posicion);
    }
}