/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author cristian
 */
public class Cola {
    
    private Nodo inicioCola, finalCola;
    String cola = "";
    
    public  Cola(){
        inicioCola = null;
        finalCola = null;
    }
    
    //metodo para saber si la cola esta vacia
    public boolean colaVacia(){
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
                
    }
    
    //metodo para insertar una persona en la cola
    public void insertar(Persona persona){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setPersona(persona);
        nuevoNodo.setSiguiente(null);
        
        if (colaVacia()) {
            
            inicioCola = nuevoNodo;
            finalCola = nuevoNodo;
            
        } else {
            
            finalCola.setSiguiente(nuevoNodo);
            finalCola = nuevoNodo;
        }
        
    }
    
    //metodo para extraer o eliminar una persona de la cola
    public String extraerPersona (){
        
        if(!colaVacia()){
        String nombre = inicioCola.getPersona().getNombre();
        
        if (inicioCola == finalCola) {
            
            inicioCola = null;
            finalCola = null;
            
        } else {
            inicioCola = inicioCola.getSiguiente();
        }
        
        return nombre;
        
        }else{
        
            return null;
        }
    }
    
    
    
    
    //metodo para mostrar el contenido de la cola
    public String mostrarCola(){
        
        Nodo recorrido = inicioCola;
        cola = "";
        String colaInvertida = "";
        
        if (colaVacia()) {
            
            return "la cola esta vacia";
            
        } else {
            
            while(recorrido != null){
                
                cola += recorrido.getPersona().toString() +" | ";
                recorrido = recorrido.getSiguiente();
              }   
            }
        
        String cadena [] = cola.split(" ");
        
        for(int i = cadena.length-1; i>=0; i--){
            
            colaInvertida += cadena[i];
        }
        
           
            return colaInvertida;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
            
