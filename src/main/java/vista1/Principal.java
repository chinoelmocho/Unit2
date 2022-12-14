/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista1;

import estidiante_Servicio.Estudiante_Servicio;
import modelo1.Asignatura;
import modelo1.Atencion;
import modelo1.Dueño;
import modelo1.Estudiante;
import modelo1.Jugador;
import modelo1.Mascota;
import java.time.LocalDate;
import java.time.Month;
import jugador_servicio.JugadorServicio;
/**
 *
 * @author David
 */
 public class Principal {
    
    public static void main(String[] args) {
       
        var mauricio = new Dueño("0103667754","Mauricio Ortiz");
        mauricio.nuevoTelefono("0984357604", 0, "Móvil", "tuenti");
        mauricio.nuevoTelefono("074078385",2,"Casa","Etapa");
        mauricio.nuevoTelefono("074135250",1287,"Fijo IP","Etapa");
        
        var mascot = new Mascota("Mauricio","Perro","Golden",5.9,mauricio);
        
        var atencionnum1=new Atencion("Juan", 20,mascot);
        atencionnum1.recetas("Perrorab",10,"1 cada 6 horas");
        atencionnum1.recetas("RKs",5,"5 cada 2 horas");
        atencionnum1.recetas("Perrofin",3,"3 cada 24 horas");
        atencionnum1.recetas("Sinovac",8,"1 cada 34 horas");
        atencionnum1.recetas("Matlabh",9,"2 cada 80 horas");
        
       System.out.println(atencionnum1.toString()+"\n");
       System.out.println(mauricio.toString());
    
    var juanito = new Estudiante("Juan Pelaez","0106195951");
    var pedrito= new Estudiante("Pedro Ochoa","0106987523");
    var asignature = new Asignatura("Matemathics","100 ciclos");
    asignature.listestudiante(juanito);
     asignature.listestudiante(pedrito);
     System.out.println(asignature.toString());
     
     
     
     var jugador13 =new Jugador("Juan",80,173,LocalDate.of(2003,8,26));
      var jugador14 =new Jugador("Pedro",56,160,LocalDate.of(2003,11,10));
       var jugador15 =new Jugador("Diego",70,180,LocalDate.of(2003,8,26));
     var basedeDatos=new JugadorServicio();
     basedeDatos.crear(jugador13);
     basedeDatos.crear(jugador14);
     basedeDatos.crear(jugador15);
     System.out.println(basedeDatos.listar());
     
     var BasedeDatos2=new Estudiante_Servicio();
     BasedeDatos2.crear(juanito);
     BasedeDatos2.crear(pedrito);
     System.out.println(BasedeDatos2.listar());

    }   
}   

