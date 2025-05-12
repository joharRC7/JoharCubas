
package pe.edu.pucp.softProg.gestUsuarioBase;

import java.util.ArrayList;

public interface ICrud<T> {
    int insertar(T modelo);
    int modificar(T modelo);
    int eliminar(int idModelo);
    ArrayList<T> listarTodos();
}
