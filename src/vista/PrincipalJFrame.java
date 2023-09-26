package vista;

import controlador.Conexion;
import controlador.CrudDatos;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.AlumnoAD;

public class PrincipalJFrame extends javax.swing.JFrame {

    ArrayList<AlumnoAD> alumnosAD = null;

    //ELEMENTOS PESTAÑA READ
    DefaultListModel dlmRead = null;
    DefaultTableModel dtmRead = null;

    //ELEMENTOS PESTAÑA UPDATE
    DefaultListModel dlmUpdate = null;

    public PrincipalJFrame() {
        initComponents();
        alumnosAD = Conexion.importarColeccion();

        //ELEMENTOS PESTAÑA READ
        dlmRead = new DefaultListModel();
        jListLeer.setModel(dlmRead);
        dtmRead = new DefaultTableModel();
        dtmRead.setColumnIdentifiers(new String[]{
            "Nº Matricula", "Nombre Alumno", "Nota 1ª Ev.", "Nota 2ª Ev.", "Nota final", "Nota extra"
        });
        jTableLeerTabla.setModel(dtmRead);

        //ELEMENTOS PESTAÑA UPDATE
        dlmUpdate = new DefaultListModel();
        jListModificar.setModel(dlmUpdate);

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
        jButtonCrearLimpiar = new javax.swing.JButton();
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
        jTextFieldModificarNotFinal = new javax.swing.JTextField();
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
        jListModificar = new javax.swing.JList<>();
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

        jTabbedPaneGeneral.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneGeneralStateChanged(evt);
            }
        });

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

        jButtonCrearLimpiar.setText("Limpiar campos");
        jButtonCrearLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearLimpiarActionPerformed(evt);
            }
        });

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
                            .addComponent(jButtonCrearLimpiar)
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
                    .addComponent(jButtonCrearLimpiar)
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
        jButtonLeerAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeerAniadirActionPerformed(evt);
            }
        });

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLeerTabla.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTableLeerTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPaneLeerTabla.setViewportView(jTableLeerTabla);

        jButtonLeerLimpiarTabla.setText("Limpiar tabla");
        jButtonLeerLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeerLimpiarTablaActionPerformed(evt);
            }
        });

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

        jTextFieldModificarMatricula.setEditable(false);

        jLabelModificarNotExtra.setText("Nota extra");

        jLabelModificarNotFinal.setText("Nota final");

        jLabelModificarNot2Ev.setText("Nota segunda evaluación");

        jLabelModificarNot1Ev.setText("Nota primera evaluación");

        jLabelModificarNombre.setText("Nombre y apellidos");

        jButtonModificarLimpiar.setText("Limpiar campos");

        jButtonModificar.setText("Modificar");

        jLabelModificar.setText("Elige nº  matrícula");

        jListModificar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListModificar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPaneModificarLista.setViewportView(jListModificar);

        jButtonModificarIniciar.setText("Iniciar modificación");
        jButtonModificarIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarIniciarActionPerformed(evt);
            }
        });

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
                    .addComponent(jTextFieldModificarNotFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
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
                            .addComponent(jTextFieldModificarNotFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    //MÉTODOS AUXILIARES
    //--------------------------------------------------------------------------
    private void actualizarListaMatriculas(DefaultListModel dlm) {
        dlm.removeAllElements();
        for (AlumnoAD a : alumnosAD) {
            dlm.addElement(a.getNMatricula());
        }
    }

    private void agregarDeListaATabla(JList jList, DefaultTableModel dtm) {
        List listaMatriculas = jList.getSelectedValuesList();
        for (AlumnoAD a : alumnosAD) {
            if (listaMatriculas.contains(a.getNMatricula())) {
                dtm.addRow(new Object[]{
                    a.getNMatricula(),
                    a.getNombre(),
                    a.getNot1Ev(),
                    a.getNota2Ev(),
                    a.getNotaExtra(),
                    a.getNotaFinal()}
                );

            }
        }

    }

    private void limpiarTabla(DefaultTableModel dtm) {
        for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
    }

    private void agregarDeListaACamposModificacion(JList jList) {
        for (AlumnoAD a : alumnosAD) {
            if (a.getNMatricula() == (Integer) jList.getSelectedValue()) {
                jTextFieldModificarMatricula.setText(Integer.toString(a.getNMatricula()));
                jTextFieldModificarNombre.setText(a.getNombre());
                jTextFieldModificarNot1Ev.setText(Float.toString(a.getNot1Ev()));
                jTextFieldModificarNot2Ev.setText(Float.toString(a.getNota2Ev()));
                jTextFieldModificarNotFinal.setText(Float.toString(a.getNotaFinal()));
                jTextFieldModificarNotExtra.setText(Float.toString(a.getNotaExtra()));
            }
        }
    }

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        AlumnoAD aluAD = null;

        if (!jTextFieldCrearMatricula.getText().isEmpty()) {
            try {
                int nMatr = parseInt(jTextFieldCrearMatricula.getText());
                String nomb = jTextFieldCrearNombre.getText().isEmpty() ? null : jTextFieldCrearNombre.getText();
                Float not1ev = jTextFieldCrearNot1Ev.getText().isEmpty() ? null : Float.valueOf(jTextFieldCrearNot1Ev.getText());
                Float not2ev = jTextFieldCrearNot2Ev.getText().isEmpty() ? null : Float.valueOf(jTextFieldCrearNot2Ev.getText());
                Float notFin = jTextFieldCrearNotFinal.getText().isEmpty() ? null : Float.valueOf(jTextFieldCrearNotFinal.getText());
                Float notExt = jTextFieldCrearNotExtra.getText().isEmpty() ? null : Float.valueOf(jTextFieldCrearNotExtra.getText());
                aluAD = new AlumnoAD(nMatr, nomb, not1ev, not2ev, notFin, notExt);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El número de matrícula solo admite números enteros.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe introducir al menos el número de matrícula.");
        }

        if (aluAD != null) {
            System.out.println(alumnosAD);
            System.out.println(aluAD);
            if (CrudDatos.create(alumnosAD, aluAD)) {
                JOptionPane.showMessageDialog(null, "El alumno: \n"
                        + aluAD.toString() + "\nHa sido creado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe un alumno con el"
                        + " número de matrícula: " + aluAD.getNMatricula() + "."
                        + "\nNo se puede crear el alumno. Pruebe otro número dematrícula.");
            }
        }

    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jButtonCrearLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearLimpiarActionPerformed
        jTextFieldCrearMatricula.setText("");
        jTextFieldCrearNombre.setText("");
        jTextFieldCrearNot1Ev.setText("");
        jTextFieldCrearNot2Ev.setText("");
        jTextFieldCrearNotFinal.setText("");
        jTextFieldCrearNotExtra.setText("");
        Conexion.exportarColecion(alumnosAD);
    }//GEN-LAST:event_jButtonCrearLimpiarActionPerformed

    private void jTabbedPaneGeneralStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneGeneralStateChanged
        // TODO add your handling code here:
        int indexActual = jTabbedPaneGeneral.getModel().getSelectedIndex();

        switch (indexActual) {
            case 0:
                break;
            case 1:
                actualizarListaMatriculas(dlmRead);
                break;
            case 2:
                actualizarListaMatriculas(dlmUpdate);
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }//GEN-LAST:event_jTabbedPaneGeneralStateChanged

    private void jButtonLeerAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeerAniadirActionPerformed
        agregarDeListaATabla(jListLeer, dtmRead);
    }//GEN-LAST:event_jButtonLeerAniadirActionPerformed

    private void jButtonLeerLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeerLimpiarTablaActionPerformed
        limpiarTabla(dtmRead);
    }//GEN-LAST:event_jButtonLeerLimpiarTablaActionPerformed

    private void jButtonModificarIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarIniciarActionPerformed
        agregarDeListaACamposModificacion(jListModificar);
    }//GEN-LAST:event_jButtonModificarIniciarActionPerformed

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
    private javax.swing.JButton jButtonCrearLimpiar;
    private javax.swing.JButton jButtonGuardarDescartar;
    private javax.swing.JButton jButtonGuardarDescartarSalir;
    private javax.swing.JButton jButtonGuardarGuardarSalir;
    private javax.swing.JButton jButtonLeerAniadir;
    private javax.swing.JButton jButtonLeerLimpiarTabla;
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
    private javax.swing.JList<String> jListModificar;
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
    private javax.swing.JTextField jTextFieldModificarNotFinal;
    // End of variables declaration//GEN-END:variables

}
