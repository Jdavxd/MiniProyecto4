/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.HashMap;
/**
 *
 * @author julia
 */
public class Cliente implements Serializable {
    private String nombre;
    private String identificacion;
    private ArrayList<HashMap<String,String>> carrito;
    
    
    public Cliente(String nombre, String identificacion){
        this.nombre = nombre;
        this.identificacion = identificacion;
        carrito = new ArrayList<>();
    }
    
        public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
        public String getNombre() {
        return nombre;
    }
        
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
      public String getIdentificacion() {
        return identificacion;
    }
      
      public ArrayList<HashMap<String, String>> getCarrito() {
        return carrito;
    }
    
    

    
}
