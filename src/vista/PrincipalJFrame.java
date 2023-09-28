package vista;

import controlador.Conexion;
import controlador.CrudDatos;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.AlumnoAD;

public class PrincipalJFrame extends javax.swing.JFrame {

    ArrayList<AlumnoAD> alumnosAD = null;

    //VARIABLES AUXILIARES
    String regexMatricula = "^-?\\d+$";
    String regexNotas = "^-?\\d+(\\.\\d+)?$";
    Color miRojo = new Color(255, 105, 97);
    Color defecto = Color.WHITE;

    //ELEMENTOS PESTAÑA READ
    DefaultListModel dlmRead = null;
    DefaultTableModel dtmRead = null;

    //ELEMENTOS PESTAÑA UPDATE
    DefaultListModel dlmUpdate = null;

    //ELEMENTOS PESTAÑA DELETE
    DefaultListModel dlmDelete = null;
    DefaultTableModel dtmDelete = null;

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

        //ELEMENTOS DE LA PESTAÑA BORRAR
        dlmDelete = new DefaultListModel();
        jListBorrar.setModel(dlmDelete);
        dtmDelete = new DefaultTableModel();
        dtmDelete.setColumnIdentifiers(new String[]{
            "Nº Matricula", "Nombre Alumno", "Nota 1ª Ev.", "Nota 2ª Ev.", "Nota final", "Nota extra"
        });
        jTableBorrarTabla.setModel(dtmDelete);
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
        jLabel2 = new javax.swing.JLabel();
        jPanelLeer = new javax.swing.JPanel();
        jScrollPaneLeerLista = new javax.swing.JScrollPane();
        jListLeer = new javax.swing.JList<>();
        jButtonLeerAniadir = new javax.swing.JButton();
        jScrollPaneLeerTabla = new javax.swing.JScrollPane();
        jTableLeerTabla = new javax.swing.JTable();
        jButtonLeerLimpiarTabla = new javax.swing.JButton();
        jRadioButtonLeerTexto = new javax.swing.JRadioButton();
        jRadioButtonLeerLista = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLeerManual = new javax.swing.JTextField();
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

        jPanelCrear.setLayout(null);

        jLabelCrearMatricula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCrearMatricula.setText("Número de matrícula");
        jLabelCrearMatricula.setPreferredSize(new java.awt.Dimension(150, 14));
        jPanelCrear.add(jLabelCrearMatricula);
        jLabelCrearMatricula.setBounds(50, 50, 150, 14);

        jTextFieldCrearMatricula.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanelCrear.add(jTextFieldCrearMatricula);
        jTextFieldCrearMatricula.setBounds(220, 40, 300, 30);

        jLabelCrearNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCrearNombre.setText("Nombre y apellidos");
        jLabelCrearNombre.setPreferredSize(new java.awt.Dimension(150, 14));
        jPanelCrear.add(jLabelCrearNombre);
        jLabelCrearNombre.setBounds(50, 90, 150, 14);

        jTextFieldCrearNombre.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanelCrear.add(jTextFieldCrearNombre);
        jTextFieldCrearNombre.setBounds(220, 80, 300, 30);

        jLabelCrearNot1Ev.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCrearNot1Ev.setText("Nota primera evaluación");
        jLabelCrearNot1Ev.setPreferredSize(new java.awt.Dimension(150, 14));
        jPanelCrear.add(jLabelCrearNot1Ev);
        jLabelCrearNot1Ev.setBounds(50, 130, 150, 14);

        jTextFieldCrearNot1Ev.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanelCrear.add(jTextFieldCrearNot1Ev);
        jTextFieldCrearNot1Ev.setBounds(220, 120, 300, 30);

        jLabelCrearNot2Ev.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCrearNot2Ev.setText("Nota segunda evaluación");
        jLabelCrearNot2Ev.setPreferredSize(new java.awt.Dimension(150, 14));
        jPanelCrear.add(jLabelCrearNot2Ev);
        jLabelCrearNot2Ev.setBounds(50, 170, 150, 14);

        jTextFieldCrearNot2Ev.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanelCrear.add(jTextFieldCrearNot2Ev);
        jTextFieldCrearNot2Ev.setBounds(220, 160, 300, 30);

        jLabelCrearNotFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCrearNotFinal.setText("Nota final");
        jLabelCrearNotFinal.setPreferredSize(new java.awt.Dimension(150, 14));
        jPanelCrear.add(jLabelCrearNotFinal);
        jLabelCrearNotFinal.setBounds(50, 210, 150, 14);

        jTextFieldCrearNotFinal.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanelCrear.add(jTextFieldCrearNotFinal);
        jTextFieldCrearNotFinal.setBounds(220, 200, 300, 30);

        jLabelCrearNotExtra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCrearNotExtra.setText("Nota extra");
        jLabelCrearNotExtra.setPreferredSize(new java.awt.Dimension(150, 14));
        jPanelCrear.add(jLabelCrearNotExtra);
        jLabelCrearNotExtra.setBounds(50, 250, 150, 14);

        jTextFieldCrearNotExtra.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanelCrear.add(jTextFieldCrearNotExtra);
        jTextFieldCrearNotExtra.setBounds(220, 240, 300, 30);

        jButtonCrear.setText("Crear alumno");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        jPanelCrear.add(jButtonCrear);
        jButtonCrear.setBounds(400, 290, 120, 23);

        jButtonCrearLimpiar.setText("Limpiar campos");
        jButtonCrearLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearLimpiarActionPerformed(evt);
            }
        });
        jPanelCrear.add(jButtonCrearLimpiar);
        jButtonCrearLimpiar.setBounds(220, 290, 130, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Crear un nuevo alumno");
        jPanelCrear.add(jLabel2);
        jLabel2.setBounds(10, 10, 580, 20);

        jTabbedPaneGeneral.addTab("Crear", jPanelCrear);

        jPanelLeer.setLayout(null);

        jListLeer.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneLeerLista.setViewportView(jListLeer);

        jPanelLeer.add(jScrollPaneLeerLista);
        jScrollPaneLeerLista.setBounds(30, 100, 100, 190);

        jButtonLeerAniadir.setText("Consultar datos");
        jButtonLeerAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeerAniadirActionPerformed(evt);
            }
        });
        jPanelLeer.add(jButtonLeerAniadir);
        jButtonLeerAniadir.setBounds(460, 70, 120, 23);

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

        jPanelLeer.add(jScrollPaneLeerTabla);
        jScrollPaneLeerTabla.setBounds(158, 100, 420, 190);

        jButtonLeerLimpiarTabla.setText("Limpiar tabla");
        jButtonLeerLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeerLimpiarTablaActionPerformed(evt);
            }
        });
        jPanelLeer.add(jButtonLeerLimpiarTabla);
        jButtonLeerLimpiarTabla.setBounds(460, 300, 120, 23);

        jRadioButtonLeerTexto.setText("Insertar una matrícula manualmente");
        jPanelLeer.add(jRadioButtonLeerTexto);
        jRadioButtonLeerTexto.setBounds(30, 40, 240, 25);

        jRadioButtonLeerLista.setText("Elegir una matrícula de la lista");
        jPanelLeer.add(jRadioButtonLeerLista);
        jRadioButtonLeerLista.setBounds(30, 70, 240, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar datos de uno o varios alumnos por medio de su número de matrícula");
        jPanelLeer.add(jLabel1);
        jLabel1.setBounds(10, 10, 580, 20);
        jPanelLeer.add(jTextFieldLeerManual);
        jTextFieldLeerManual.setBounds(270, 40, 180, 25);

        jTabbedPaneGeneral.addTab("Leer", jPanelLeer);

        jLabelModificarMatricula.setText("Número de matrícula");

        jTextFieldModificarMatricula.setEditable(false);

        jLabelModificarNotExtra.setText("Nota extra");

        jLabelModificarNotFinal.setText("Nota final");

        jLabelModificarNot2Ev.setText("Nota segunda evaluación");

        jLabelModificarNot1Ev.setText("Nota primera evaluación");

        jLabelModificarNombre.setText("Nombre y apellidos");

        jButtonModificarLimpiar.setText("Limpiar campos");
        jButtonModificarLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarLimpiarActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

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
        jButtonBorrarLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarLimpiarTablaActionPerformed(evt);
            }
        });

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBorrarTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPaneBorrarTabla.setViewportView(jTableBorrarTabla);

        jButtonBorrarAniadirTabla.setText("Añadir a tabla");
        jButtonBorrarAniadirTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarAniadirTablaActionPerformed(evt);
            }
        });

        jButtonBorrarRegistros.setText("Borrar registros");
        jButtonBorrarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarRegistrosActionPerformed(evt);
            }
        });

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
        jButtonGuardarDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarDescartarActionPerformed(evt);
            }
        });

        jLabelGuardarDescartarSalir.setText("Deshacer todos los cambios y salir");

        jButtonGuardarDescartarSalir.setText("Aceptar");
        jButtonGuardarDescartarSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarDescartarSalirActionPerformed(evt);
            }
        });

        jLabelGuardarGuardarSalir.setText("Guardar todos los cambios y salir");

        jButtonGuardarGuardarSalir.setText("Aceptar");
        jButtonGuardarGuardarSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarGuardarSalirActionPerformed(evt);
            }
        });

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
                agregarAlumnoATabla(dtm, a);
            }
        }
    }

    private void agregarAlumnoATabla(DefaultTableModel dtm, AlumnoAD alu) {
        dtm.addRow(new Object[]{
            alu.getNMatricula(),
            alu.getNombre(),
            alu.getNot1Ev(),
            alu.getNota2Ev(),
            alu.getNotaExtra(),
            alu.getNotaFinal()}
        );
    }

    private void agregarDeTextoATabla(JTextField jtf, DefaultTableModel dtm) {
        boolean encontrado = false;
        int matricula;
        if (jtf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe introducir un número de matrícula.");
        } else {
            if (!jtf.getText().matches(regexMatricula)) {
                JOptionPane.showMessageDialog(null, "La matrícula porporcionada no tiene un formato válido");
            } else {
                matricula = parseInt(jtf.getText());
                for (AlumnoAD a : alumnosAD) {
                    if (a.getNMatricula() == matricula) {
                        agregarAlumnoATabla(dtm, a);
                    }
                }
            }

        }
    }

    private void limpiarTabla(DefaultTableModel dtm) {
        for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
    }

    private void agregarDeListaACamposModificacion(JList jList) {
        if (jList.getSelectedValue() != null) {
            for (AlumnoAD a : alumnosAD) {
                if (a.getNMatricula() == (Integer) jList.getSelectedValue()) {
                    jTextFieldModificarMatricula.setText(String.valueOf(a.getNMatricula()));
                    jTextFieldModificarNombre.setText("" + a.getNombre());
                    jTextFieldModificarNot1Ev.setText("0" + a.getNot1Ev());
                    jTextFieldModificarNot2Ev.setText("0" + a.getNota2Ev());
                    jTextFieldModificarNotFinal.setText("0" + a.getNotaFinal());
                    jTextFieldModificarNotExtra.setText("0" + a.getNotaExtra());
                }
            }
        }
    }

    private void modificarAlumno() {

        AlumnoAD aluAD = new AlumnoAD();
        aluAD.setNMatricula(Integer.parseInt(jTextFieldModificarMatricula.getText()));

        aluAD.setNombre(jTextFieldCrearNombre.getText());

        if (asignarCamposNotasAAlumno(aluAD, jTextFieldModificarNot1Ev, jTextFieldModificarNot2Ev, jTextFieldModificarNotFinal, jTextFieldModificarNotExtra)) {
            if (CrudDatos.update(alumnosAD, aluAD)) {
                JOptionPane.showMessageDialog(null, "El alumno: \n"
                        + aluAD.toString() + "\nHa sido modificado correctamente");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Algunos campos contienen"
                    + " información no válida");
        }
    }

    private void crearAlumno() {
        AlumnoAD aluAD = new AlumnoAD();

        if (!jTextFieldCrearMatricula.getText().isEmpty() && jTextFieldCrearMatricula.getText().matches(regexMatricula)) {

            aluAD.setNMatricula(Integer.parseInt(jTextFieldCrearMatricula.getText()));

            aluAD.setNombre(jTextFieldCrearNombre.getText());

            if (asignarCamposNotasAAlumno(aluAD, jTextFieldCrearNot1Ev, jTextFieldCrearNot2Ev, jTextFieldCrearNotFinal, jTextFieldCrearNotExtra)) {
                if (CrudDatos.create(alumnosAD, aluAD)) {
                    JOptionPane.showMessageDialog(null, "El alumno: \n"
                            + aluAD.toString() + "\nHa sido creado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Ya existe un alumno con el"
                            + " número de matrícula: " + aluAD.getNMatricula() + "."
                            + "\nNo se puede crear el alumno. Pruebe otro número dematrícula.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Algunos campos contienen"
                        + " información no válida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe elegir un número de matrícula.");
        }
    }

    //Auxiliar para tomar los datos del formulario para crear/modificar alumno
    private boolean asignarCamposNotasAAlumno(AlumnoAD alu, JTextField not1, JTextField not2, JTextField notFi, JTextField notEx) {
        boolean asignacionCorrecta = true;
        not1.setBackground(defecto);
        not2.setBackground(defecto);
        notFi.setBackground(defecto);
        notEx.setBackground(defecto);

        if (not1.getText().isEmpty() || not1.getText().matches(regexNotas)) {
            alu.setNot1Ev(Float.parseFloat("0" + not1.getText()));
        } else {
            not1.setBackground(miRojo);
            asignacionCorrecta = false;
        }
        if (not2.getText().isEmpty() || not2.getText().matches(regexNotas)) {
            alu.setNota2Ev(Float.parseFloat("0" + not2.getText()));
        } else {
            not2.setBackground(miRojo);
            asignacionCorrecta = false;
        }
        if (notFi.getText().isEmpty() || notFi.getText().matches(regexNotas)) {
            alu.setNotaFinal(Float.parseFloat("0" + notFi.getText()));
        } else {
            notFi.setBackground(miRojo);
            asignacionCorrecta = false;
        }
        if (notEx.getText().isEmpty() || notEx.getText().matches(regexNotas)) {
            alu.setNotaExtra(Float.parseFloat("0" + notEx.getText()));
        } else {
            notEx.setBackground(miRojo);
            asignacionCorrecta = false;
        }
        return asignacionCorrecta;
    }

    private void borrarRegistros() {
        HashSet<Integer> matriculasABorrar = new HashSet<>();
        for (int i = dtmDelete.getRowCount() - 1; i >= 0; i--) {
            matriculasABorrar.add((Integer) dtmDelete.getValueAt(i, 0));
        }
        for (int i = alumnosAD.size() - 1; i >= 0; i--) {
            if (matriculasABorrar.contains(alumnosAD.get(i).getNMatricula())) {
                matriculasABorrar.remove(alumnosAD.get(i).getNMatricula());
                alumnosAD.remove(alumnosAD.get(i));

            }
        }
        limpiarTabla(dtmDelete);
    }

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        crearAlumno();
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jButtonCrearLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearLimpiarActionPerformed
        jTextFieldCrearMatricula.setText("");
        jTextFieldCrearNombre.setText("");
        jTextFieldCrearNot1Ev.setText("");
        jTextFieldCrearNot2Ev.setText("");
        jTextFieldCrearNotFinal.setText("");
        jTextFieldCrearNotExtra.setText("");
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
                actualizarListaMatriculas(dlmDelete);
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

    private void jButtonModificarLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarLimpiarActionPerformed
        jTextFieldModificarMatricula.setText("");
        jTextFieldModificarNombre.setText("");
        jTextFieldModificarNot1Ev.setText("");
        jTextFieldModificarNot2Ev.setText("");
        jTextFieldModificarNotFinal.setText("");
        jTextFieldModificarNotExtra.setText("");
    }//GEN-LAST:event_jButtonModificarLimpiarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        modificarAlumno();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonBorrarAniadirTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarAniadirTablaActionPerformed
        agregarDeListaATabla(jListBorrar, dtmDelete);
    }//GEN-LAST:event_jButtonBorrarAniadirTablaActionPerformed

    private void jButtonBorrarLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarLimpiarTablaActionPerformed
        limpiarTabla(dtmDelete);
    }//GEN-LAST:event_jButtonBorrarLimpiarTablaActionPerformed

    private void jButtonBorrarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarRegistrosActionPerformed
        borrarRegistros();
    }//GEN-LAST:event_jButtonBorrarRegistrosActionPerformed

    private void jButtonGuardarDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarDescartarActionPerformed
        alumnosAD = Conexion.importarColeccion();
    }//GEN-LAST:event_jButtonGuardarDescartarActionPerformed

    private void jButtonGuardarDescartarSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarDescartarSalirActionPerformed
        alumnosAD = null;
        System.exit(0);
    }//GEN-LAST:event_jButtonGuardarDescartarSalirActionPerformed

    private void jButtonGuardarGuardarSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarGuardarSalirActionPerformed
        Conexion.exportarColecion(alumnosAD);
        System.exit(0);

    }//GEN-LAST:event_jButtonGuardarGuardarSalirActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JRadioButton jRadioButtonLeerLista;
    private javax.swing.JRadioButton jRadioButtonLeerTexto;
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
    private javax.swing.JTextField jTextFieldLeerManual;
    private javax.swing.JTextField jTextFieldModificarMatricula;
    private javax.swing.JTextField jTextFieldModificarNombre;
    private javax.swing.JTextField jTextFieldModificarNot1Ev;
    private javax.swing.JTextField jTextFieldModificarNot2Ev;
    private javax.swing.JTextField jTextFieldModificarNotExtra;
    private javax.swing.JTextField jTextFieldModificarNotFinal;
    // End of variables declaration//GEN-END:variables

}
