package vista;

import controlador.Conexion;
import controlador.CrudDatos;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.AlumnoAD;

public class PrincipalJFrame extends javax.swing.JFrame {

    ArrayList<AlumnoAD> alumnosAD = null;

    public PrincipalJFrame() {
        initComponents();

        alumnosAD = Conexion.importarColeccion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneGeneral = new javax.swing.JTabbedPane();
        jPanelCrear = new javax.swing.JPanel();
        jLabelCrearMatricula = new javax.swing.JLabel();
        jTextFieldCrearMatricula = new javax.swing.JTextField();
        jLabelCrearNombre = new javax.swing.JLabel();
        jTextFieldCrearNombre = new javax.swing.JTextField();
        jLabelCrearNot1Ev = new javax.swing.JLabel();
        jTextFieldCrearNot1Ev = new javax.swing.JTextField();
        jLabelCrearNot2Ev = new javax.swing.JLabel();
        jTextFieldCrearNot2Ev = new javax.swing.JTextField();
        jLabelCrearNotFinal = new javax.swing.JLabel();
        jTextFieldCrearNotFinal = new javax.swing.JTextField();
        jLabelCrearNotExtra = new javax.swing.JLabel();
        jTextFieldCrearNotExtra = new javax.swing.JTextField();
        jButtonCrear = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jPanelLeer = new javax.swing.JPanel();
        jLabelLeer = new javax.swing.JLabel();
        jScrollPaneLeerLista = new javax.swing.JScrollPane();
        jListLeer = new javax.swing.JList<>();
        jButtonLeerAniadir = new javax.swing.JButton();
        jScrollPaneLeerTabla = new javax.swing.JScrollPane();
        jTableLeerTabla = new javax.swing.JTable();
        jButtonLeerLimpiarTabla = new javax.swing.JButton();
        jPanelActualizar = new javax.swing.JPanel();
        jLabelModificarMatricula = new javax.swing.JLabel();
        jTextFieldModificarMatricula = new javax.swing.JTextField();
        jTextFieldModificarNombre = new javax.swing.JTextField();
        jTextFieldModificarNot1Ev = new javax.swing.JTextField();
        jTextFieldModificarNot2Ev = new javax.swing.JTextField();
        jTextFieleModificarNotFinal = new javax.swing.JTextField();
        jTextFieldModificarNotExtra = new javax.swing.JTextField();
        jLabelModificarNotExtra = new javax.swing.JLabel();
        jLabelModificarNotFinal = new javax.swing.JLabel();
        jLabelModificarNot2Ev = new javax.swing.JLabel();
        jLabelModificarNot1Ev = new javax.swing.JLabel();
        jLabelModificarNombre = new javax.swing.JLabel();
        jButtonModificarLimpiar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jLabelModificar = new javax.swing.JLabel();
        jScrollPaneModificarLista = new javax.swing.JScrollPane();
        jListLeerModificar = new javax.swing.JList<>();
        jButtonModificarIniciar = new javax.swing.JButton();
        jPanelBorrar = new javax.swing.JPanel();
        jLabelBorrar = new javax.swing.JLabel();
        jButtonBorrarLimpiarTabla = new javax.swing.JButton();
        jScrollPaneBorrarLista = new javax.swing.JScrollPane();
        jListBorrar = new javax.swing.JList<>();
        jScrollPaneBorrarTabla = new javax.swing.JScrollPane();
        jTableBorrarTabla = new javax.swing.JTable();
        jButtonBorrarAniadirTabla = new javax.swing.JButton();
        jButtonBorrarRegistros = new javax.swing.JButton();
        jPanelGuardar = new javax.swing.JPanel();
        jLabelGuardarDescartar = new javax.swing.JLabel();
        jButtonGuardarDescartar = new javax.swing.JButton();
        jLabelGuardarDescartarSalir = new javax.swing.JLabel();
        jButtonGuardarDescartarSalir = new javax.swing.JButton();
        jLabelGuardarGuardarSalir = new javax.swing.JLabel();
        jButtonGuardarGuardarSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCrearMatricula.setText("Número de matrícula");

        jLabelCrearNombre.setText("Nombre y apellidos");

        jLabelCrearNot1Ev.setText("Nota primera evaluación");

        jLabelCrearNot2Ev.setText("Nota segunda evaluación");

        jLabelCrearNotFinal.setText("Nota final");

        jLabelCrearNotExtra.setText("Nota extra");

        jButtonCrear.setText("Crear");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar campos");

        javax.swing.GroupLayout jPanelCrearLayout = new javax.swing.GroupLayout(jPanelCrear);
        jPanelCrear.setLayout(jPanelCrearLayout);
        jPanelCrearLayout.setHorizontalGroup(
            jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCrearNombre)
                    .addComponent(jLabelCrearMatricula)
                    .addComponent(jLabelCrearNot1Ev)
                    .addComponent(jLabelCrearNot2Ev)
                    .addComponent(jLabelCrearNotFinal)
                    .addComponent(jLabelCrearNotExtra))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCrearNotExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelCrearLayout.createSequentialGroup()
                            .addComponent(jButtonLimpiar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCrear))
                        .addComponent(jTextFieldCrearMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jTextFieldCrearNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jTextFieldCrearNot1Ev, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jTextFieldCrearNot2Ev, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jTextFieldCrearNotFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanelCrearLayout.setVerticalGroup(
            jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCrearMatricula)
                    .addComponent(jTextFieldCrearMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCrearNombre)
                    .addComponent(jTextFieldCrearNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCrearNot1Ev)
                    .addComponent(jTextFieldCrearNot1Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCrearNot2Ev)
                    .addComponent(jTextFieldCrearNot2Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCrearNotFinal)
                    .addComponent(jTextFieldCrearNotFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCrearNotExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCrearNotExtra))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonCrear))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPaneGeneral.addTab("Crear", jPanelCrear);

        jLabelLeer.setText("Elige nº  matrícula");

        jListLeer.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneLeerLista.setViewportView(jListLeer);

        jButtonLeerAniadir.setText("Añadir a tabla");

        jTableLeerTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableLeerTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPaneLeerTabla.setViewportView(jTableLeerTabla);

        jButtonLeerLimpiarTabla.setText("Limpiar tabla");

        javax.swing.GroupLayout jPanelLeerLayout = new javax.swing.GroupLayout(jPanelLeer);
        jPanelLeer.setLayout(jPanelLeerLayout);
        jPanelLeerLayout.setHorizontalGroup(
            jPanelLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLeerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelLeer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLeerAniadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneLeerLista))
                .addGap(18, 18, 18)
                .addGroup(jPanelLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLeerLayout.createSequentialGroup()
                        .addComponent(jButtonLeerLimpiarTabla)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPaneLeerTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLeerLayout.setVerticalGroup(
            jPanelLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeerLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanelLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLeerLimpiarTabla)
                    .addComponent(jLabelLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLeerLayout.createSequentialGroup()
                        .addComponent(jScrollPaneLeerLista, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLeerAniadir))
                    .addComponent(jScrollPaneLeerTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneGeneral.addTab("Leer", jPanelLeer);

        jLabelModificarMatricula.setText("Número de matrícula");

        jLabelModificarNotExtra.setText("Nota extra");

        jLabelModificarNotFinal.setText("Nota final");

        jLabelModificarNot2Ev.setText("Nota segunda evaluación");

        jLabelModificarNot1Ev.setText("Nota primera evaluación");

        jLabelModificarNombre.setText("Nombre y apellidos");

        jButtonModificarLimpiar.setText("Limpiar campos");

        jButtonModificar.setText("Modificar");

        jLabelModificar.setText("Elige nº  matrícula");

        jListLeerModificar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneModificarLista.setViewportView(jListLeerModificar);

        jButtonModificarIniciar.setText("Iniciar modificación");

        javax.swing.GroupLayout jPanelActualizarLayout = new javax.swing.GroupLayout(jPanelActualizar);
        jPanelActualizar.setLayout(jPanelActualizarLayout);
        jPanelActualizarLayout.setHorizontalGroup(
            jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelModificarNombre)
                    .addComponent(jLabelModificarMatricula)
                    .addComponent(jLabelModificarNot1Ev)
                    .addComponent(jLabelModificarNot2Ev)
                    .addComponent(jLabelModificarNotFinal)
                    .addComponent(jLabelModificarNotExtra))
                .addGap(18, 18, 18)
                .addGroup(jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldModificarMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jTextFieldModificarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jTextFieldModificarNot1Ev, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jTextFieldModificarNot2Ev, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jTextFieleModificarNotFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jTextFieldModificarNotExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelActualizarLayout.createSequentialGroup()
                        .addComponent(jButtonModificarLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonModificar)))
                .addGap(18, 18, 18)
                .addGroup(jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneModificarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificarIniciar))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanelActualizarLayout.setVerticalGroup(
            jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModificarMatricula)
                    .addComponent(jTextFieldModificarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelActualizarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelModificarNombre)
                            .addComponent(jTextFieldModificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelModificarNot1Ev)
                            .addComponent(jTextFieldModificarNot1Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelModificarNot2Ev)
                            .addComponent(jTextFieldModificarNot2Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelModificarNotFinal)
                            .addComponent(jTextFieleModificarNotFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldModificarNotExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelModificarNotExtra)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelActualizarLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPaneModificarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonModificarIniciar)
                        .addComponent(jButtonModificar))
                    .addComponent(jButtonModificarLimpiar))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPaneGeneral.addTab("Actualizar", jPanelActualizar);

        jLabelBorrar.setText("Elige nº  matrícula");

        jButtonBorrarLimpiarTabla.setText("Limpiar tabla");

        jListBorrar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneBorrarLista.setViewportView(jListBorrar);

        jTableBorrarTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneBorrarTabla.setViewportView(jTableBorrarTabla);

        jButtonBorrarAniadirTabla.setText("Añadir a tabla");

        jButtonBorrarRegistros.setText("Borrar registros");

        javax.swing.GroupLayout jPanelBorrarLayout = new javax.swing.GroupLayout(jPanelBorrar);
        jPanelBorrar.setLayout(jPanelBorrarLayout);
        jPanelBorrarLayout.setHorizontalGroup(
            jPanelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBorrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBorrarAniadirTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneBorrarLista))
                .addGap(18, 18, 18)
                .addGroup(jPanelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBorrarLayout.createSequentialGroup()
                        .addComponent(jButtonBorrarLimpiarTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBorrarRegistros))
                    .addComponent(jScrollPaneBorrarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBorrarLayout.setVerticalGroup(
            jPanelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBorrarLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBorrarLimpiarTabla)
                    .addComponent(jButtonBorrarRegistros)
                    .addComponent(jLabelBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBorrarLayout.createSequentialGroup()
                        .addComponent(jScrollPaneBorrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBorrarAniadirTabla))
                    .addComponent(jScrollPaneBorrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneGeneral.addTab("Borrar", jPanelBorrar);

        jLabelGuardarDescartar.setText("Deshacer todos los cambios");

        jButtonGuardarDescartar.setText("Aceptar");

        jLabelGuardarDescartarSalir.setText("Deshacer todos los cambios y salir");

        jButtonGuardarDescartarSalir.setText("Aceptar");

        jLabelGuardarGuardarSalir.setText("Guardar todos los cambios y salir");

        jButtonGuardarGuardarSalir.setText("Aceptar");

        javax.swing.GroupLayout jPanelGuardarLayout = new javax.swing.GroupLayout(jPanelGuardar);
        jPanelGuardar.setLayout(jPanelGuardarLayout);
        jPanelGuardarLayout.setHorizontalGroup(
            jPanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGuardarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGuardarDescartarSalir)
                    .addComponent(jLabelGuardarDescartar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelGuardarGuardarSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardarDescartar)
                    .addComponent(jButtonGuardarDescartarSalir)
                    .addComponent(jButtonGuardarGuardarSalir))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanelGuardarLayout.setVerticalGroup(
            jPanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGuardarDescartar)
                    .addComponent(jButtonGuardarDescartar))
                .addGap(18, 18, 18)
                .addGroup(jPanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGuardarDescartarSalir)
                    .addComponent(jButtonGuardarDescartarSalir))
                .addGap(18, 18, 18)
                .addGroup(jPanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGuardarGuardarSalir)
                    .addComponent(jButtonGuardarGuardarSalir))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jTabbedPaneGeneral.addTab("Guardar y salir", jPanelGuardar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneGeneral)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        AlumnoAD aluAD = new AlumnoAD(
                parseInt(jTextFieldCrearMatricula.getText()),
                jTextFieldCrearNombre.getText(),
                parseFloat(jTextFieldCrearNot1Ev.getText()),
                parseFloat(jTextFieldCrearNot2Ev.getText()),
                parseFloat(jTextFieldCrearNotFinal.getText()),
                parseFloat(jTextFieldCrearNotExtra.getText())
        );

        if (CrudDatos.create(alumnosAD, aluAD)) {
            
        }else{
            JOptionPane.showMessageDialog(null, "Ya existe un alumno con el número de matrícula: \n"
                    + aluAD.getNMatricula() + "\nNo se puede crear el alumno. Pruebe otro número de matrícula.");
        }
    }//GEN-LAST:event_jButtonCrearActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrarAniadirTabla;
    private javax.swing.JButton jButtonBorrarLimpiarTabla;
    private javax.swing.JButton jButtonBorrarRegistros;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonGuardarDescartar;
    private javax.swing.JButton jButtonGuardarDescartarSalir;
    private javax.swing.JButton jButtonGuardarGuardarSalir;
    private javax.swing.JButton jButtonLeerAniadir;
    private javax.swing.JButton jButtonLeerLimpiarTabla;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonModificarIniciar;
    private javax.swing.JButton jButtonModificarLimpiar;
    private javax.swing.JLabel jLabelBorrar;
    private javax.swing.JLabel jLabelCrearMatricula;
    private javax.swing.JLabel jLabelCrearNombre;
    private javax.swing.JLabel jLabelCrearNot1Ev;
    private javax.swing.JLabel jLabelCrearNot2Ev;
    private javax.swing.JLabel jLabelCrearNotExtra;
    private javax.swing.JLabel jLabelCrearNotFinal;
    private javax.swing.JLabel jLabelGuardarDescartar;
    private javax.swing.JLabel jLabelGuardarDescartarSalir;
    private javax.swing.JLabel jLabelGuardarGuardarSalir;
    private javax.swing.JLabel jLabelLeer;
    private javax.swing.JLabel jLabelModificar;
    private javax.swing.JLabel jLabelModificarMatricula;
    private javax.swing.JLabel jLabelModificarNombre;
    private javax.swing.JLabel jLabelModificarNot1Ev;
    private javax.swing.JLabel jLabelModificarNot2Ev;
    private javax.swing.JLabel jLabelModificarNotExtra;
    private javax.swing.JLabel jLabelModificarNotFinal;
    private javax.swing.JList<String> jListBorrar;
    private javax.swing.JList<String> jListLeer;
    private javax.swing.JList<String> jListLeerModificar;
    private javax.swing.JPanel jPanelActualizar;
    private javax.swing.JPanel jPanelBorrar;
    private javax.swing.JPanel jPanelCrear;
    private javax.swing.JPanel jPanelGuardar;
    private javax.swing.JPanel jPanelLeer;
    private javax.swing.JScrollPane jScrollPaneBorrarLista;
    private javax.swing.JScrollPane jScrollPaneBorrarTabla;
    private javax.swing.JScrollPane jScrollPaneLeerLista;
    private javax.swing.JScrollPane jScrollPaneLeerTabla;
    private javax.swing.JScrollPane jScrollPaneModificarLista;
    private javax.swing.JTabbedPane jTabbedPaneGeneral;
    private javax.swing.JTable jTableBorrarTabla;
    private javax.swing.JTable jTableLeerTabla;
    private javax.swing.JTextField jTextFieldCrearMatricula;
    private javax.swing.JTextField jTextFieldCrearNombre;
    private javax.swing.JTextField jTextFieldCrearNot1Ev;
    private javax.swing.JTextField jTextFieldCrearNot2Ev;
    private javax.swing.JTextField jTextFieldCrearNotExtra;
    private javax.swing.JTextField jTextFieldCrearNotFinal;
    private javax.swing.JTextField jTextFieldModificarMatricula;
    private javax.swing.JTextField jTextFieldModificarNombre;
    private javax.swing.JTextField jTextFieldModificarNot1Ev;
    private javax.swing.JTextField jTextFieldModificarNot2Ev;
    private javax.swing.JTextField jTextFieldModificarNotExtra;
    private javax.swing.JTextField jTextFieleModificarNotFinal;
    // End of variables declaration//GEN-END:variables
}
