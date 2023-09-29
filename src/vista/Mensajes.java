package vista;

public class Mensajes {

    public static final String[][] MENSAJES = initMensajes();

    public static String[][] initMensajes() {
        String[][] mensajes = new String[1][36];

        //MENSAJES CONEXIÓN
        mensajes[0][0] = "No tiene permisos para manipular el fichero."
                + " Se cerrará el programa.";
        mensajes[0][1] = "Fichero no econtrado o ilegible."
                + " No se pueden los cargar datos.";
        mensajes[0][2] = "Fichero ilegible."
                + " No se pueden los cargar datos.";
        
        mensajes[0][4] = "Ocurrió un problema."
                + "\nEs posible que los datos no se carguen correctamente";
        mensajes[0][5] = "No tiene permisos para manipular el fichero."
                + "\nSe perderá la información guardada.";
        mensajes[0][6] = "Fichero innaccesible."
                + "\nSe perderá la información guardada.";
        mensajes[0][7] = "Ocurrió un problema."
                + "\nEs posible que los datos no se guarden correctamente";

        //MENSAJES CLASE JFRAME
        mensajes[0][8] = "Algunos campos contienen"
                + " información no válida";
        
        mensajes[0][10] = "Debe introducir un número de matrícula válido.";
        mensajes[0][11] = "No existe ningún alumno con esa matrícula.";
        mensajes[0][12] = "Introduzca una matrícula válida.";
        mensajes[0][13] = "Seleccione una matrícula de la lista.";
        mensajes[0][14] = "No existe ningún alumno con esa matrícula.";
        
        mensajes[0][16] = "Debe elegir una matrícula de la lista.";
        mensajes[0][17] = "Indique primero una matrícula para modificar al alumno.";

        
        mensajes[0][20] = "El número de matrícula elegido ya expiró.";
        mensajes[0][21] = "Se borrarán de la base de datos todos los alumnos que aparecen en la tabla,"
                + "\n¿desea continuar?";
        mensajes[0][22] = "Inserte alumnos en la tabla para empezar a borrar";
        mensajes[0][23] = "Se perderán todos los cambios que no hayan sido guardados."
                + "\n¿Desea deshacer los cambios y volver al estado inicial?";
        mensajes[0][24] = "Se dispone a salir del programa sin guardar ningún cambio. "
                + "¿Está seguro?";
        mensajes[0][25] = "Se dispone a guardar todo los cambios realizados hasta ahora."
                + "\nEste proceso es IRREVERSIBLE. También se saldrá del programa."
                + " ¿Desea continuar?";
        mensajes[0][26] = "¿Está seguro?";

        //Mensajes concatenados
        mensajes[0][27] = "El alumno: \n";
        mensajes[0][28] = "\nHa sido modificado correctamente";
        mensajes[0][29] = "Ya existe un alumno con el"
                + " número de matrícula: ";
        mensajes[0][30] = "." + "\nNo se puede crear el alumno. Pruebe otro número de matrícula.";
        mensajes[0][35] = "¿Desea salir del programa? \nSe perderán los cambios que no haya guardado.";
        //Títulos de cuadros
        mensajes[0][31] = "Borrado de alumnos";
        mensajes[0][32] = "Deshacer cambios";
        mensajes[0][33] = "Salir del programa";
        mensajes[0][34] = "Salir y guardar";

        return mensajes;

    }

}
