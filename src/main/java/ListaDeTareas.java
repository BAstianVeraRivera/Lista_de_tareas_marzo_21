import javax.swing.*;
import java.util.ArrayList;

public class ListaDeTareas {

    public ArrayList<Tarea> listaDeTareas = new ArrayList<Tarea>();
    public String input(String text) {
        return JOptionPane.showInputDialog(text);
    }
    // // Este método muestra el menú de opciones al usuario.
    public void mostrarMenu() {
        ListaDeTareas lista = new ListaDeTareas();
        byte opcion;
        do{
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                    "Menu Principal\n"
                            +"1. Agregar tarea nueva\n"
                            +"2. Eliminar tarea existente\n"
                            +"3. Mostrar todas las tareas\n"
                            +"4. Salir"));

            switch(opcion){
                case 1:
                    lista.agregarTarea();
                    break;
                case 2:
                    lista.eliminarTarea();
                    break;
                case 3:
                    lista.mostrarTareas();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, ":)");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Tarea no encontrada");
                    break;

            }


        }while(opcion!=4);

    }
    // Este método agrega tareas a la Arraylist listaDeTareas.
    public void agregarTarea() {
        String nombreTarea = input("Nombre de la tarea: ");
        String descripcionTarea = input("Descripción de la tarea: ");
        Tarea tareaNueva = new Tarea(nombreTarea, descripcionTarea);
        listaDeTareas.add(tareaNueva);
    }
    // Este método elimina tareas que hayan sido agregadas por el usuario a la Arraylist listaDeTareas.
    public void eliminarTarea() {
            String nombreTareaBuscada = input("Nombre de la tarea: ");
            for(Tarea tarea : listaDeTareas){
                if(tarea.getNombre().equals(nombreTareaBuscada)){
                    listaDeTareas.remove(tarea);
                    String string = ("Tarea eliminada");
                    JOptionPane.showMessageDialog (null, tarea);
                    JOptionPane.showMessageDialog (null, string);
                }
            }
    }
    // Este método muestra todas las tareas que hayan sido agregadas por el usuario a la Arraylist listaDeTareas.
    public void mostrarTareas() {
        String string="";
        for (int i=0;i<listaDeTareas.size () ;i++) {
            string+="Tarea "+(i+1)+"\n";
            string+="Nombre: "+listaDeTareas.get (i).getNombre() +" \n" ;
            string+="Descripción: "+listaDeTareas.get (i).getDescripcion() +" \n" ;
        }
        JOptionPane.showMessageDialog (null, string);
    }
}