
package clases;

public class Nodo {
    
    private Persona persona;
    private Nodo siguiente;
    
    public Persona getPersona(){
        return persona;
    }
    
        public Nodo getNodo(){
        return siguiente;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    
        
}
