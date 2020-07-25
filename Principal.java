package clases;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Cola cola = new Cola();
        int opcion = 0;

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opciones \n\n"
                        + "1- Insertar un nodo\n"
                        + "2- Extraer un nodo\n"
                        + "3- Mostrar contenido de la cola\n"
                        + "4- salir"
                ));

                switch (opcion) {

                    case 1:
                        
                        String nombre = JOptionPane.showInputDialog(null, "ingrese el nombre");
                        int cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de cedula"));
                        
                        Persona persona = new Persona(nombre, cedula);
                        
                        cola.insertar(persona);
                        
                     break;
                     
                    case 2:
                     
                        if (cola.colaVacia()) {
                            JOptionPane.showMessageDialog(null, "la cola esta vacia");
                        } else {
                            
                            JOptionPane.showMessageDialog(null, "se extrajo la persona : "+cola.extraerPersona());
                        }
                        
                        
                     break;
                     
                    case 3:
                        
                         JOptionPane.showMessageDialog(null,cola.mostrarCola());
                     break;
                     
                    case 4:
                        opcion = 4;
                     break;
                     
                    default:
                         JOptionPane.showMessageDialog(null,"opcion no valida");   
                     break;    

                }

            } catch (Exception e) {
            }

        } while (opcion != 4);

    }

}
