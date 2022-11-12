/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugador_servicio;
import java.util.ArrayList;
import java.util.List;
import modelo1.Jugador;

/**
 *
 * @author David
 */
    
   public class JugadorServicio {
 private List<Jugador> jugadorList;
    
    public JugadorServicio(){
    this.jugadorList=new ArrayList<>();
    }
    public void crear(Jugador jugadors){
    this.jugadorList.add(jugadors);
    
    }
  
  public List<Jugador> listar(){
    return this.jugadorList;
}  

   
  
  public void eliminar(int posicion){
  this.jugadorList.remove(posicion);
  
  }
} 

