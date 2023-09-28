package controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import modelo.AlumnoAD;

public class Conexion {

    private static final File FILE = new File("bd.txt");

    private Conexion() {
    }

    public static ArrayList<AlumnoAD> importarColeccion() {
        ArrayList<AlumnoAD> coleccion = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            if (FILE.exists() && FILE.isFile()) {
                fis = new FileInputStream(FILE);
                ois = new ObjectInputStream(fis);
                coleccion = (ArrayList<AlumnoAD>) ois.readObject();
            }
        } catch (SecurityException ex) {
            JOptionPane.showMessageDialog(null, "No tiene permisos para manipular el fichero."
                    + "Se cerrará el programa.");
            System.exit(0);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Fichero no econtrado o ilegible."
                    + "No se pueden los cargar datos.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Fichero ilegible."
                    + "No se pueden los cargar datos.");
        } finally {
            if (coleccion == null) {
                coleccion = new ArrayList<>();
            }
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Ocurrió un problema."
                        + "\nEs posible que los datos no se carguen correctamente");
            }
        }
        return coleccion;
    }

    public static void exportarColecion(ArrayList<AlumnoAD> coleccionModificada) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            if ((FILE.exists() && FILE.isFile()) || !FILE.exists()) {
                fos = new FileOutputStream(FILE);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(coleccionModificada);
            }

        } catch (SecurityException ex) {
            JOptionPane.showMessageDialog(null, "No tiene permisos para manipular el fichero."
                    + "\nSe perderá la información guardada.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Fichero innaccesible."
                    + "\nSe perderá la información guardada.");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Ocurrió un problema."
                        + "\nEs posible que los datos no se guarden correctamente");
            }
        }
    }

}
