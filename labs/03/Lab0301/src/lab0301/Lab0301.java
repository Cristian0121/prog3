package lab0301;

import java.util.LinkedList;
import java.util.Queue;

public class Lab0301 {

    static Queue<Registro> regis = new LinkedList<>();
    public static void main(String[] args) {
        registro_estudiante();
        registro_asignatura();
        reporte_registro_final();
        
    }
    
    public static void registro_estudiante(){
        
        String codigo =Entrada.readText("Codigo Estidiante");
        String nombre =Entrada.readText("Nombre Estudiante");
        String correo =Entrada.readText("Correo Estidiante");
        int semestre =Entrada.readInt("estudiante");
        Estudiante estud = new Estudiante(codigo,nombre,correo,semestre);
        
        regis.add(new Registro(estud));
        
    }
    
    
     public static void registro_asignatura(){
        
    }
     
     
      public static void reporte_registro_final(){
        
    }
    
}
