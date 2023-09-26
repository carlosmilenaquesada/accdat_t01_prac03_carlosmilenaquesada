package controlador;

import java.util.ArrayList;
import modelo.AlumnoAD;

public class CrudDatos {

    public CrudDatos() {
    }

    public static boolean create(ArrayList<AlumnoAD> lista, AlumnoAD alumnoAD) {
        boolean creado = false;
        if (!lista.contains(alumnoAD)) {
            creado = lista.add(alumnoAD);
        }
        return creado;
    }

    public static AlumnoAD read(ArrayList<AlumnoAD> lista, int idElemento) {
        AlumnoAD alumnoAD = null;
        boolean encontrado = false;
        for (int i = 0; i < lista.size() && encontrado == false; i++) {
            if (lista.get(i).getNMatricula() == idElemento) {
                alumnoAD = lista.get(i);
                encontrado = true;
            }
        }
        return alumnoAD;
    }

    public static void update(ArrayList<AlumnoAD> lista, AlumnoAD alumnoAD) {

        boolean encontrado = false;

        for (int i = 0; i < lista.size() && encontrado == false; i++) {
            if (lista.get(i).equals(alumnoAD)) {
                lista.get(i).setNombre(alumnoAD.getNombre());
                lista.get(i).setNot1Ev(alumnoAD.getNot1Ev());
                lista.get(i).setNota2Ev(alumnoAD.getNota2Ev());
                lista.get(i).setNotaFinal(alumnoAD.getNotaFinal());
                lista.get(i).setNotaExtra(alumnoAD.getNotaExtra());
                encontrado = true;
            }
        }
    }

    public static void delete(ArrayList<AlumnoAD> lista, int idElemento) {
        boolean encontrado = false;
        for (int i = 0; i < lista.size() && encontrado == false; i++) {
            if (lista.get(i).getNMatricula() == idElemento) {
                lista.remove(i);
                encontrado = true;
            }
        }
    }
}
