package controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import modelo.AlumnoAD;

public class Conexion {

    private static final File FILE = new File("bd.txt");

    private Conexion() {
    }

    public static ArrayList<AlumnoAD> importarColeccion() {
        ArrayList<AlumnoAD> coleccion = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
                System.out.println("hola");

        if (FILE.exists() && FILE.isFile()) {
            try {
                fis = new FileInputStream(FILE);
                ois = new ObjectInputStream(fis);
                coleccion = (ArrayList<AlumnoAD>) ois.readObject();
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                System.out.println(ex);
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        return coleccion;
    }

    public static void exportarColecion(ArrayList<AlumnoAD> coleccionModificada) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        if ((FILE.exists() && FILE.isFile()) || !FILE.exists()) {
            try {
                fos = new FileOutputStream(FILE);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(coleccionModificada);
                System.out.println("asdf");
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                System.out.println(ex);
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                    if (fos != null) {
                        fos.close();
                    }
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
    
    public static void main(String args[]){
        exportarColecion(new ArrayList<AlumnoAD>());
    
    }

}
