package controlador;

import java.util.ArrayList;
import modelo.AlumnoAD;

public class CrudDatos {

    public CrudDatos() {
    }

    public void create(ArrayList<AlumnoAD> lista, AlumnoAD alumnoAD) {
        if (!lista.contains(alumnoAD)) {
            lista.add(alumnoAD);
        }
    }

    public AlumnoAD read(ArrayList<AlumnoAD> lista, int idElemento) {
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

    public void update(ArrayList<AlumnoAD> lista, AlumnoAD alumnoAD) {

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

    public void delete(ArrayList<AlumnoAD> lista, int idElemento) {
        boolean encontrado = false;
        for (int i = 0; i < lista.size() && encontrado == false; i++) {
            if (lista.get(i).getNMatricula() == idElemento) {
                lista.remove(i);
                encontrado = true;
            }
        }
    }
}
