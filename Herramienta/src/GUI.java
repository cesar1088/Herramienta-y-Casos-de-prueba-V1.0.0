/*-----------------------------------------------------------------------------
| Interfaz Gráfica de Usuario                                                  |
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| Esta clase es la encargada de realizar la conexión entre el usuario y el     |
| servidor. La conexión se realiza mediante un formulario que se llenan con    |
| las entradas para cada Caso de Prueba.                                       |
------------------------------------------------------------------------------*/
import java.awt.Color;
import java.awt.Toolkit;
import java.net.URL;
import java.net.HttpURLConnection;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame
{
    private Object[][] valoresTabla1;
    private Object[][] valoresTabla2;
    private int filaTabla1 = 0;
    private int filaTabla2 = 0;

    static
    {
        try //Establece la fuente "Windows"
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } 
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error en la carga de elementos visuales: " + ex);
        }
    }

    public GUI()
    {
        initComponents();
        this.getContentPane().setBackground(new Color(0, 51, 102));
        acercaDE.getContentPane().setBackground(new Color(255, 255, 255));
        panelResultados.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        acercaDE = new javax.swing.JDialog();
        titulo2 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        director = new javax.swing.JLabel();
        codirector = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JSplitPane();
        panelEntradas = new javax.swing.JPanel();
        encabezado = new javax.swing.JLabel();
        panelCasosPrueba = new javax.swing.JTabbedPane();
        panelCP1 = new javax.swing.JPanel();
        iniciarCP1 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        etiqueta1CP1 = new javax.swing.JLabel();
        arquitecturaCP1 = new javax.swing.JComboBox();
        jSplitPane2 = new javax.swing.JSplitPane();
        dimensionesCP1 = new javax.swing.JComboBox();
        etiqueta2CP1 = new javax.swing.JLabel();
        jSplitPane3 = new javax.swing.JSplitPane();
        throughputCP1 = new javax.swing.JComboBox();
        etiqueta3CP1 = new javax.swing.JLabel();
        jSplitPane4 = new javax.swing.JSplitPane();
        repeticionesCP1 = new javax.swing.JComboBox();
        etiqueta4CP1 = new javax.swing.JLabel();
        panelCP2 = new javax.swing.JPanel();
        iniciarCP2 = new javax.swing.JButton();
        jSplitPane5 = new javax.swing.JSplitPane();
        etiqueta1CP2 = new javax.swing.JLabel();
        arquitecturaCP2 = new javax.swing.JComboBox();
        jSplitPane6 = new javax.swing.JSplitPane();
        totalCP2 = new javax.swing.JComboBox();
        etiqueta2CP2 = new javax.swing.JLabel();
        jSplitPane7 = new javax.swing.JSplitPane();
        etiqueta3CP2 = new javax.swing.JLabel();
        throughputCP2 = new javax.swing.JComboBox();
        jSplitPane8 = new javax.swing.JSplitPane();
        etiqueta4CP2 = new javax.swing.JLabel();
        repeticionesCP2 = new javax.swing.JComboBox();
        panelCP3 = new javax.swing.JPanel();
        iniciarCP3 = new javax.swing.JButton();
        jSplitPane9 = new javax.swing.JSplitPane();
        etiqueta1CP3 = new javax.swing.JLabel();
        arquitecturaCP3 = new javax.swing.JComboBox();
        jSplitPane10 = new javax.swing.JSplitPane();
        subAlgoritmoCP3 = new javax.swing.JComboBox();
        etiqueta2CP3 = new javax.swing.JLabel();
        jSplitPane11 = new javax.swing.JSplitPane();
        etiqueta3CP3 = new javax.swing.JLabel();
        totalCP3 = new javax.swing.JComboBox();
        jSplitPane12 = new javax.swing.JSplitPane();
        etiqueta4CP3 = new javax.swing.JLabel();
        contenedoresCP3 = new javax.swing.JComboBox();
        jSplitPane13 = new javax.swing.JSplitPane();
        etiqueta5CP3 = new javax.swing.JLabel();
        throughputCP3 = new javax.swing.JComboBox();
        jSplitPane14 = new javax.swing.JSplitPane();
        etiqueta6CP3 = new javax.swing.JLabel();
        repeticionesCP3 = new javax.swing.JComboBox();
        panelCP4 = new javax.swing.JPanel();
        iniciarCP4 = new javax.swing.JButton();
        jSplitPane15 = new javax.swing.JSplitPane();
        etiqueta1CP4 = new javax.swing.JLabel();
        arquitecturaCP4 = new javax.swing.JComboBox();
        jSplitPane16 = new javax.swing.JSplitPane();
        etiqueta2CP4 = new javax.swing.JLabel();
        totalCP4 = new javax.swing.JComboBox();
        jSplitPane17 = new javax.swing.JSplitPane();
        etiqueta3CP4 = new javax.swing.JLabel();
        metodosCP4 = new javax.swing.JComboBox();
        jSplitPane18 = new javax.swing.JSplitPane();
        etiqueta4CP4 = new javax.swing.JLabel();
        tipodatosCP4 = new javax.swing.JComboBox();
        jSplitPane19 = new javax.swing.JSplitPane();
        etiqueta5CP4 = new javax.swing.JLabel();
        throughputCP4 = new javax.swing.JComboBox();
        jSplitPane20 = new javax.swing.JSplitPane();
        etiqueta6CP4 = new javax.swing.JLabel();
        repeticionesCP4 = new javax.swing.JComboBox();
        panelCP5 = new javax.swing.JPanel();
        iniciarCP5 = new javax.swing.JButton();
        jSplitPane21 = new javax.swing.JSplitPane();
        etiqueta1CP5 = new javax.swing.JLabel();
        arquitecturaCP5 = new javax.swing.JComboBox();
        jSplitPane22 = new javax.swing.JSplitPane();
        etiqueta2CP5 = new javax.swing.JLabel();
        totalCP5 = new javax.swing.JComboBox();
        jSplitPane23 = new javax.swing.JSplitPane();
        etiqueta4CP5 = new javax.swing.JLabel();
        tipodatosCP5 = new javax.swing.JComboBox();
        jSplitPane24 = new javax.swing.JSplitPane();
        etiqueta5CP5 = new javax.swing.JLabel();
        throughputCP5 = new javax.swing.JComboBox();
        jSplitPane25 = new javax.swing.JSplitPane();
        etiqueta6CP5 = new javax.swing.JLabel();
        repeticionesCP5 = new javax.swing.JComboBox();
        panelResultados = new javax.swing.JPanel();
        medias = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        encabezado2 = new javax.swing.JLabel();
        mediaPoblacional = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        encabezado3 = new javax.swing.JLabel();
        resultadoFinal = new javax.swing.JTextField();
        barraMenu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        acercaDe = new javax.swing.JMenuItem();

        this.getContentPane().setBackground(Color.WHITE);
        acercaDE.setTitle("Acerca del sistema");
        acercaDE.setBounds(150,150,500,350);
        acercaDE.setForeground(new java.awt.Color(-1,true));
        acercaDE.setModal(true);
        acercaDE.setResizable(false);

        titulo2.setFont(new java.awt.Font("SansSerif", 1, 14));
        titulo2.setForeground(new java.awt.Color(-65536,true));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("VERSIÓN 1.0");

        nombre.setFont(new java.awt.Font("SansSerif", 1, 18));
        nombre.setForeground(new java.awt.Color(-65536,true));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("HERRAMIENTA DE PRUEBAS");

        director.setFont(new java.awt.Font("SansSerif", 1, 12));
        director.setForeground(new java.awt.Color(-16764058,true));
        director.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        director.setText("Director de Tesis: Dr. René Santaolaya Salgado");

        codirector.setFont(new java.awt.Font("SansSerif", 1, 12));
        codirector.setForeground(new java.awt.Color(-16764058,true));
        codirector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codirector.setText("Codirector de Tesis: Dra. Olivia Graciela Fragoso Díaz");

        autor.setFont(new java.awt.Font("SansSerif", 1, 12));
        autor.setForeground(new java.awt.Color(-16764058,true));
        autor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        autor.setText("Tesista: Luis César Guadarrama Rogel");

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cenidet logo.JPG"))); // NOI18N

        javax.swing.GroupLayout acercaDELayout = new javax.swing.GroupLayout(acercaDE.getContentPane());
        acercaDE.getContentPane().setLayout(acercaDELayout);
        acercaDELayout.setHorizontalGroup(
            acercaDELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acercaDELayout.createSequentialGroup()
                .addGroup(acercaDELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(acercaDELayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
                    .addGroup(acercaDELayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(acercaDELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                            .addComponent(titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acercaDELayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(codirector, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
                    .addGroup(acercaDELayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(director, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acercaDELayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(autor, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)))
                .addContainerGap())
        );
        acercaDELayout.setVerticalGroup(
            acercaDELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acercaDELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo2)
                .addGap(30, 30, 30)
                .addComponent(director)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codirector)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Herramienta de pruebas");
        setBackground(new java.awt.Color(-1,true));
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(-1,true));
        panelPrincipal.setBorder(null);
        panelPrincipal.setDividerSize(0);
        panelPrincipal.setForeground(new java.awt.Color(-65536,true));

        panelEntradas.setBackground(new java.awt.Color(-1,true));
        panelEntradas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true), 5));
        panelEntradas.setForeground(new java.awt.Color(-15708533,true));

        encabezado.setBackground(new java.awt.Color(-16777216,true));
        encabezado.setFont(new java.awt.Font("SansSerif", 1, 14));
        encabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encabezado.setText("PARÁMETROS DE ENTRADA");

        panelCasosPrueba.setBackground(new java.awt.Color(-4144960,true));
        panelCasosPrueba.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        panelCasosPrueba.setFont(new java.awt.Font("SansSerif", 0, 12));

        panelCP1.setBackground(new java.awt.Color(-1,true));

        iniciarCP1.setFont(new java.awt.Font("SansSerif", 1, 18));
        iniciarCP1.setText("INICIAR");
        iniciarCP1.setToolTipText("Inicia el proceso de pruebas");
        iniciarCP1.setBorder(new javax.swing.border.SoftBevelBorder(5));
        iniciarCP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarCP1ActionPerformed(evt);
            }
        });

        jSplitPane1.setBackground(new java.awt.Color(-1,true));
        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerSize(0);

        etiqueta1CP1.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta1CP1.setText("Arquitectura:  ");
        etiqueta1CP1.setAlignmentX(0.5F);
        jSplitPane1.setLeftComponent(etiqueta1CP1);

        arquitecturaCP1.setFont(new java.awt.Font("Dialog", 0, 12));
        arquitecturaCP1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arquitectura #1", "Arquitectura #2", "Arquitectura #3", "Arquitectura #4" }));
        arquitecturaCP1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane1.setRightComponent(arquitecturaCP1);

        jSplitPane2.setBackground(new java.awt.Color(-1,true));
        jSplitPane2.setBorder(null);
        jSplitPane2.setDividerSize(0);

        dimensionesCP1.setFont(new java.awt.Font("Dialog", 0, 12));
        dimensionesCP1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "4", "8", "16" }));
        jSplitPane2.setRightComponent(dimensionesCP1);

        etiqueta2CP1.setBackground(new java.awt.Color(-1,true));
        etiqueta2CP1.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta2CP1.setText("Tamaño de las matrices:  ");
        jSplitPane2.setLeftComponent(etiqueta2CP1);

        jSplitPane3.setBackground(new java.awt.Color(-1,true));
        jSplitPane3.setBorder(null);
        jSplitPane3.setDividerSize(0);

        throughputCP1.setFont(new java.awt.Font("Dialog", 0, 12));
        throughputCP1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "5", "8", "10", "15", "20", "25", "30", "50", "70", "75", "80", "100", "125", "150", "175", "200", "225", "250", "275", "300", "325", "350", "375", "400", "425", "450", "475", "500", "525", "550", "575", "600", "625", "650", "675", "700", "725", "750", "775", "800", "825", "850", "875", "900", "925", "950", "975", "1000", "1050", "1100", "1150", "1200", "1250", "1300", "1350", "1400", "1450", "1500", "1550", "1600", "1650", "1700", "1750", "1800", "1850", "1900", "1950", "2000", "2100", "2200", "2300", "2400", "2500", "3000" }));
        throughputCP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                throughputCP1ActionPerformed(evt);
            }
        });
        jSplitPane3.setRightComponent(throughputCP1);

        etiqueta3CP1.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta3CP1.setText("Throughput:  ");
        etiqueta3CP1.setAlignmentX(0.5F);
        jSplitPane3.setLeftComponent(etiqueta3CP1);

        jSplitPane4.setBackground(new java.awt.Color(-1,true));
        jSplitPane4.setBorder(null);
        jSplitPane4.setDividerSize(0);

        repeticionesCP1.setFont(new java.awt.Font("Dialog", 0, 12));
        repeticionesCP1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "5", "10", "15", "30" }));
        jSplitPane4.setRightComponent(repeticionesCP1);

        etiqueta4CP1.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta4CP1.setText("Repeticiones:  ");
        jSplitPane4.setLeftComponent(etiqueta4CP1);

        javax.swing.GroupLayout panelCP1Layout = new javax.swing.GroupLayout(panelCP1);
        panelCP1.setLayout(panelCP1Layout);
        panelCP1Layout.setHorizontalGroup(
            panelCP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCP1Layout.createSequentialGroup()
                .addGroup(panelCP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCP1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                    .addGroup(panelCP1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSplitPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(panelCP1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSplitPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(panelCP1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(panelCP1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iniciarCP1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCP1Layout.setVerticalGroup(
            panelCP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(iniciarCP1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCasosPrueba.addTab("Hipercubo", panelCP1);

        panelCP2.setBackground(new java.awt.Color(-1,true));

        iniciarCP2.setFont(new java.awt.Font("SansSerif", 1, 18));
        iniciarCP2.setText("INICIAR");
        iniciarCP2.setToolTipText("Inicia el proceso de pruebas");
        iniciarCP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarCP2ActionPerformed(evt);
            }
        });

        jSplitPane5.setBackground(new java.awt.Color(-1,true));
        jSplitPane5.setBorder(null);
        jSplitPane5.setDividerSize(0);

        etiqueta1CP2.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta1CP2.setText("Arquitectura:  ");
        etiqueta1CP2.setAlignmentX(0.5F);
        jSplitPane5.setLeftComponent(etiqueta1CP2);

        arquitecturaCP2.setFont(new java.awt.Font("Dialog", 0, 12));
        arquitecturaCP2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arquitectura #1", "Arquitectura #2", "Arquitectura #3", "Arquitectura #4" }));
        arquitecturaCP2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane5.setRightComponent(arquitecturaCP2);

        jSplitPane6.setBackground(new java.awt.Color(-1,true));
        jSplitPane6.setBorder(null);
        jSplitPane6.setDividerSize(0);

        totalCP2.setFont(new java.awt.Font("SansSerif", 0, 12));
        totalCP2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "25", "50", "75", "100", "125", "150", "175", "200", "225", "250", "275", "300", "325", "350", "375", "400", "425", "450", "475", "500", "1000" }));
        jSplitPane6.setRightComponent(totalCP2);

        etiqueta2CP2.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta2CP2.setText("Números de Bernoulli:  ");
        jSplitPane6.setLeftComponent(etiqueta2CP2);

        jSplitPane7.setBackground(new java.awt.Color(-1,true));
        jSplitPane7.setBorder(null);
        jSplitPane7.setDividerSize(0);

        etiqueta3CP2.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta3CP2.setText("Throughput:  ");
        jSplitPane7.setLeftComponent(etiqueta3CP2);

        throughputCP2.setFont(new java.awt.Font("SansSerif", 0, 12));
        throughputCP2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "5", "8", "10", "15", "20", "25", "30", "40", "50", "60", "70", "75", "80", "90", "100", "125", "150", "175", "200", "225", "250", "275", "300", "325", "350", "375", "400", "425", "450", "475", "500", "525", "550", "575", "600", "625", "650", "675", "700", "725", "750", "775", "800", "825", "850", "875", "900", "925", "950", "975", "1000", "1050", "1100", "1150", "1200", "1250", "1300", "1350", "1400", "1450", "1500", "1550", "1600", "1650", "1700", "1750", "1800", "1850", "1900", "1950", "2000", "2100", "2200", "2300", "2400", "2500", "3000" }));
        jSplitPane7.setRightComponent(throughputCP2);

        jSplitPane8.setBackground(new java.awt.Color(-1,true));
        jSplitPane8.setBorder(null);
        jSplitPane8.setDividerSize(0);

        etiqueta4CP2.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta4CP2.setText("Repeticiones:  ");
        jSplitPane8.setLeftComponent(etiqueta4CP2);

        repeticionesCP2.setFont(new java.awt.Font("SansSerif", 0, 12));
        repeticionesCP2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "5", "10", "15", "30" }));
        jSplitPane8.setRightComponent(repeticionesCP2);

        javax.swing.GroupLayout panelCP2Layout = new javax.swing.GroupLayout(panelCP2);
        panelCP2.setLayout(panelCP2Layout);
        panelCP2Layout.setHorizontalGroup(
            panelCP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCP2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addGroup(panelCP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSplitPane7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(iniciarCP2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCP2Layout.setVerticalGroup(
            panelCP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(iniciarCP2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCasosPrueba.addTab("Números de Bernoulli", panelCP2);

        panelCP3.setBackground(new java.awt.Color(-1,true));

        iniciarCP3.setFont(new java.awt.Font("SansSerif", 1, 18));
        iniciarCP3.setText("INICIAR");
        iniciarCP3.setToolTipText("Inicia el proceso de pruebas");
        iniciarCP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarCP3ActionPerformed(evt);
            }
        });

        jSplitPane9.setBackground(new java.awt.Color(-1,true));
        jSplitPane9.setBorder(null);
        jSplitPane9.setDividerSize(0);

        etiqueta1CP3.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta1CP3.setText("Arquitectura:  ");
        etiqueta1CP3.setAlignmentX(0.5F);
        jSplitPane9.setLeftComponent(etiqueta1CP3);

        arquitecturaCP3.setFont(new java.awt.Font("Dialog", 0, 12));
        arquitecturaCP3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arquitectura #1", "Arquitectura #2", "Arquitectura #3", "Arquitectura #4" }));
        arquitecturaCP3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane9.setRightComponent(arquitecturaCP3);

        jSplitPane10.setBackground(new java.awt.Color(-1,true));
        jSplitPane10.setBorder(null);
        jSplitPane10.setDividerSize(0);

        subAlgoritmoCP3.setFont(new java.awt.Font("SansSerif", 0, 12));
        subAlgoritmoCP3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Burbuja", "Burbuja Direccional", "Inserción", "Selección" }));
        jSplitPane10.setRightComponent(subAlgoritmoCP3);

        etiqueta2CP3.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta2CP3.setText("Algoritmo interno:  ");
        jSplitPane10.setLeftComponent(etiqueta2CP3);

        jSplitPane11.setBackground(new java.awt.Color(-1,true));
        jSplitPane11.setBorder(null);
        jSplitPane11.setDividerSize(0);

        etiqueta3CP3.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta3CP3.setText("Total de series:  ");
        jSplitPane11.setLeftComponent(etiqueta3CP3);

        totalCP3.setFont(new java.awt.Font("SansSerif", 0, 12));
        totalCP3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "30", "50", "75", "100", "150", "200", "250", "300", "350", "400", "450", "500", "550", "600", "650", "700", "750", "800", "850", "900", "950", "1000", "1100", "1200", "1300", "1400", "1500", "1600", "1700", "1800", "1900", "2000", "2200", "2400", "2600", "2800", "3000", "3250", "3500", "3750", "4000", "4250", "4500", "4750", "5000", "5500", "6000", "6500", "7000", "7500", "8000", "8500", "9000", "9500", "10000" }));
        jSplitPane11.setRightComponent(totalCP3);

        jSplitPane12.setBackground(new java.awt.Color(-1,true));
        jSplitPane12.setBorder(null);
        jSplitPane12.setDividerSize(0);

        etiqueta4CP3.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta4CP3.setText("Total de casilleros:  ");
        jSplitPane12.setLeftComponent(etiqueta4CP3);

        contenedoresCP3.setFont(new java.awt.Font("SansSerif", 0, 12));
        contenedoresCP3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50" }));
        jSplitPane12.setRightComponent(contenedoresCP3);

        jSplitPane13.setBackground(new java.awt.Color(-1,true));
        jSplitPane13.setBorder(null);
        jSplitPane13.setDividerSize(0);

        etiqueta5CP3.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta5CP3.setText("Throughput:  ");
        jSplitPane13.setLeftComponent(etiqueta5CP3);

        throughputCP3.setFont(new java.awt.Font("SansSerif", 0, 12));
        throughputCP3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "5", "8", "10", "15", "20", "25", "30", "50", "70", "75", "80", "100", "125", "150", "175", "200", "225", "250", "275", "300", "325", "350", "375", "400", "425", "450", "475", "500", "525", "550", "575", "600", "625", "650", "675", "700", "725", "750", "775", "800", "825", "850", "875", "900", "925", "950", "975", "1000", "1050", "1100", "1150", "1200", "1250", "1300", "1350", "1400", "1450", "1500", "1550", "1600", "1650", "1700", "1750", "1800", "1850", "1900", "1950", "2000", "2100", "2200", "2300", "2400", "2500", "3000" }));
        jSplitPane13.setRightComponent(throughputCP3);

        jSplitPane14.setBackground(new java.awt.Color(-1,true));
        jSplitPane14.setBorder(null);
        jSplitPane14.setDividerSize(0);

        etiqueta6CP3.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta6CP3.setText("Repeticiones:  ");
        jSplitPane14.setLeftComponent(etiqueta6CP3);

        repeticionesCP3.setFont(new java.awt.Font("SansSerif", 0, 12));
        repeticionesCP3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "5", "10", "15", "30" }));
        jSplitPane14.setRightComponent(repeticionesCP3);

        javax.swing.GroupLayout panelCP3Layout = new javax.swing.GroupLayout(panelCP3);
        panelCP3.setLayout(panelCP3Layout);
        panelCP3Layout.setHorizontalGroup(
            panelCP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCP3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCP3Layout.createSequentialGroup()
                        .addGroup(panelCP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSplitPane9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iniciarCP3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCP3Layout.createSequentialGroup()
                        .addGroup(panelCP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSplitPane14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(jSplitPane13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(jSplitPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(jSplitPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(jSplitPane11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                        .addGap(73, 73, 73))))
        );
        panelCP3Layout.setVerticalGroup(
            panelCP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCP3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(iniciarCP3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCasosPrueba.addTab("Series de Taylor", panelCP3);

        panelCP4.setBackground(new java.awt.Color(-1,true));

        iniciarCP4.setFont(new java.awt.Font("SansSerif", 1, 18));
        iniciarCP4.setText("INICIAR");
        iniciarCP4.setToolTipText("Inicia el proceso de pruebas");
        iniciarCP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarCP4ActionPerformed(evt);
            }
        });

        jSplitPane15.setBackground(new java.awt.Color(-1,true));
        jSplitPane15.setBorder(null);
        jSplitPane15.setDividerSize(0);

        etiqueta1CP4.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta1CP4.setText("Arquitectura:  ");
        etiqueta1CP4.setAlignmentX(0.5F);
        jSplitPane15.setLeftComponent(etiqueta1CP4);

        arquitecturaCP4.setFont(new java.awt.Font("Dialog", 0, 12));
        arquitecturaCP4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arquitectura #1", "Arquitectura #2", "Arquitectura #3", "Arquitectura #4" }));
        arquitecturaCP4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane15.setRightComponent(arquitecturaCP4);

        jSplitPane16.setBackground(new java.awt.Color(-1,true));
        jSplitPane16.setBorder(null);
        jSplitPane16.setDividerSize(0);

        etiqueta2CP4.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta2CP4.setText("Total de V.A. Continuas:  ");
        jSplitPane16.setLeftComponent(etiqueta2CP4);

        totalCP4.setFont(new java.awt.Font("SansSerif", 0, 12));
        totalCP4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15", "20", "25", "30", "35", "50", "75", "100", "125", "150", "175", "200", "250", "300", "350", "500", "700", "1000", "1250", "1500", "1750", "2000", "2500", "3000" }));
        jSplitPane16.setRightComponent(totalCP4);

        jSplitPane17.setBackground(new java.awt.Color(-1,true));
        jSplitPane17.setBorder(null);
        jSplitPane17.setDividerSize(0);

        etiqueta3CP4.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta3CP4.setText("Métodos para Xn:  ");
        jSplitPane17.setLeftComponent(etiqueta3CP4);

        metodosCP4.setFont(new java.awt.Font("SansSerif", 0, 12));
        metodosCP4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Congruenciales", "No Congruenciales" }));
        jSplitPane17.setRightComponent(metodosCP4);

        jSplitPane18.setBackground(new java.awt.Color(-1,true));
        jSplitPane18.setBorder(null);
        jSplitPane18.setDividerSize(0);

        etiqueta4CP4.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta4CP4.setText("Tipo de datos:  ");
        jSplitPane18.setLeftComponent(etiqueta4CP4);

        tipodatosCP4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tipodatosCP4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "float", "double" }));
        jSplitPane18.setRightComponent(tipodatosCP4);

        jSplitPane19.setBackground(new java.awt.Color(-1,true));
        jSplitPane19.setBorder(null);
        jSplitPane19.setDividerSize(0);

        etiqueta5CP4.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta5CP4.setText("Throughput:  ");
        jSplitPane19.setLeftComponent(etiqueta5CP4);

        throughputCP4.setFont(new java.awt.Font("SansSerif", 0, 12));
        throughputCP4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "5", "8", "10", "15", "20", "25", "30", "50", "70", "75", "80", "100", "125", "150", "175", "200", "225", "250", "275", "300", "325", "350", "375", "400", "425", "450", "475", "500", "525", "550", "575", "600", "625", "650", "675", "700", "725", "750", "775", "800", "825", "850", "875", "900", "925", "950", "975", "1000", "1050", "1100", "1150", "1200", "1250", "1300", "1350", "1400", "1450", "1500", "1550", "1600", "1650", "1700", "1750", "1800", "1850", "1900", "1950", "2000", "2100", "2200", "2300", "2400", "2500", "3000" }));
        jSplitPane19.setRightComponent(throughputCP4);

        jSplitPane20.setBackground(new java.awt.Color(-1,true));
        jSplitPane20.setBorder(null);
        jSplitPane20.setDividerSize(0);

        etiqueta6CP4.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta6CP4.setText("Repeticiones:  ");
        jSplitPane20.setLeftComponent(etiqueta6CP4);

        repeticionesCP4.setFont(new java.awt.Font("SansSerif", 0, 12));
        repeticionesCP4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "5", "10", "15", "30" }));
        jSplitPane20.setRightComponent(repeticionesCP4);

        javax.swing.GroupLayout panelCP4Layout = new javax.swing.GroupLayout(panelCP4);
        panelCP4.setLayout(panelCP4Layout);
        panelCP4Layout.setHorizontalGroup(
            panelCP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCP4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jSplitPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jSplitPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jSplitPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jSplitPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jSplitPane18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(iniciarCP4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelCP4Layout.setVerticalGroup(
            panelCP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCP4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(iniciarCP4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCasosPrueba.addTab("V.A. Continuas", panelCP4);

        panelCP5.setBackground(new java.awt.Color(-1,true));
        panelCP5.setToolTipText("");

        iniciarCP5.setFont(new java.awt.Font("SansSerif", 1, 18));
        iniciarCP5.setText("INICIAR");
        iniciarCP5.setToolTipText("Inicia el proceso de pruebas");
        iniciarCP5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarCP5ActionPerformed(evt);
            }
        });

        jSplitPane21.setBackground(new java.awt.Color(-1,true));
        jSplitPane21.setBorder(null);
        jSplitPane21.setDividerSize(0);

        etiqueta1CP5.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta1CP5.setText("Arquitectura:  ");
        etiqueta1CP5.setAlignmentX(0.5F);
        jSplitPane21.setLeftComponent(etiqueta1CP5);

        arquitecturaCP5.setFont(new java.awt.Font("Dialog", 0, 12));
        arquitecturaCP5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arquitectura #1", "Arquitectura #2", "Arquitectura #3", "Arquitectura #4" }));
        arquitecturaCP5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane21.setRightComponent(arquitecturaCP5);

        jSplitPane22.setBackground(new java.awt.Color(-1,true));
        jSplitPane22.setBorder(null);
        jSplitPane22.setDividerSize(0);

        etiqueta2CP5.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta2CP5.setText("Total de V.A. Discretas:  ");
        jSplitPane22.setLeftComponent(etiqueta2CP5);

        totalCP5.setFont(new java.awt.Font("SansSerif", 0, 12));
        totalCP5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15", "20", "25", "30", "50", "75", "100", "125", "150", "175", "200", "225", "250", "275", "300", "325", "350", "375", "400", "425", "450", "475", "500", "525", "550", "575", "600", "625", "650", "675", "700", "725", "750", "775", "800", "825", "850", "875", "900", "925", "950", "975", "1000", "1250", "1500", "1750", "2000", "2500", "3000" }));
        jSplitPane22.setRightComponent(totalCP5);

        jSplitPane23.setBackground(new java.awt.Color(-1,true));
        jSplitPane23.setBorder(null);
        jSplitPane23.setDividerSize(0);

        etiqueta4CP5.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta4CP5.setText("Tipo de datos:  ");
        jSplitPane23.setLeftComponent(etiqueta4CP5);

        tipodatosCP5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tipodatosCP5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "float", "double" }));
        tipodatosCP5.setSelectedIndex(0);
        jSplitPane23.setRightComponent(tipodatosCP5);

        jSplitPane24.setBackground(new java.awt.Color(-1,true));
        jSplitPane24.setBorder(null);
        jSplitPane24.setDividerSize(0);

        etiqueta5CP5.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta5CP5.setText("Throughput:  ");
        jSplitPane24.setLeftComponent(etiqueta5CP5);

        throughputCP5.setFont(new java.awt.Font("SansSerif", 0, 12));
        throughputCP5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "5", "8", "10", "15", "20", "25", "30", "50", "70", "75", "80", "100", "125", "150", "175", "200", "225", "250", "275", "300", "325", "350", "375", "400", "425", "450", "475", "500", "525", "550", "575", "600", "625", "650", "675", "700", "725", "750", "775", "800", "825", "850", "875", "900", "925", "950", "975", "1000", "1050", "1100", "1150", "1200", "1250", "1300", "1350", "1400", "1450", "1500", "1550", "1600", "1650", "1700", "1750", "1800", "1850", "1900", "1950", "2000", "2100", "2200", "2300", "2400", "2500", "3000" }));
        jSplitPane24.setRightComponent(throughputCP5);

        jSplitPane25.setBackground(new java.awt.Color(-1,true));
        jSplitPane25.setBorder(null);
        jSplitPane25.setDividerSize(0);

        etiqueta6CP5.setFont(new java.awt.Font("SansSerif", 1, 12));
        etiqueta6CP5.setText("Repeticiones:  ");
        jSplitPane25.setLeftComponent(etiqueta6CP5);

        repeticionesCP5.setFont(new java.awt.Font("SansSerif", 0, 12));
        repeticionesCP5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "5", "10", "15", "30" }));
        jSplitPane25.setRightComponent(repeticionesCP5);

        javax.swing.GroupLayout panelCP5Layout = new javax.swing.GroupLayout(panelCP5);
        panelCP5.setLayout(panelCP5Layout);
        panelCP5Layout.setHorizontalGroup(
            panelCP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCP5Layout.createSequentialGroup()
                .addGroup(panelCP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCP5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSplitPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(panelCP5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSplitPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(panelCP5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSplitPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(panelCP5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jSplitPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                    .addGroup(panelCP5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSplitPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(iniciarCP5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelCP5Layout.setVerticalGroup(
            panelCP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCP5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(iniciarCP5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCasosPrueba.addTab("V.A. Discretas", panelCP5);

        javax.swing.GroupLayout panelEntradasLayout = new javax.swing.GroupLayout(panelEntradas);
        panelEntradas.setLayout(panelEntradasLayout);
        panelEntradasLayout.setHorizontalGroup(
            panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCasosPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEntradasLayout.setVerticalGroup(
            panelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCasosPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.setTopComponent(panelEntradas);

        panelResultados.setBackground(new java.awt.Color(-1,true));
        panelResultados.setVisible(false);
        panelResultados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true), 5));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla1.setEnabled(false);
        tabla1.setGridColor(new java.awt.Color(-4144960,true));
        tabla1.setName("yuthg"); // NOI18N
        tabla1.setOpaque(false);
        tabla1.setRowMargin(2);
        tabla1.setRowSelectionAllowed(false);
        tabla1.setSelectionBackground(new java.awt.Color(-16764058,true));
        tabla1.getTableHeader().setResizingAllowed(false);
        medias.setViewportView(tabla1);
        tabla1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla1.getAccessibleContext().setAccessibleDescription("");

        encabezado2.setFont(new java.awt.Font("SansSerif", 1, 14));
        encabezado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encabezado2.setText("RESULTADOS");

        tabla2.setFont(new java.awt.Font("Dialog", 0, 12));
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla2.setColumnSelectionAllowed(true);
        tabla2.setRowSelectionAllowed(false);
        tabla2.setSelectionBackground(new java.awt.Color(-15708533,true));
        mediaPoblacional.setViewportView(tabla2);

        encabezado3.setFont(new java.awt.Font("SansSerif", 1, 14));
        encabezado3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encabezado3.setText("MEDIAS DE LAS PRUEBAS");

        resultadoFinal.setEditable(false);
        resultadoFinal.setFont(new java.awt.Font("SansSerif", 1, 18));
        resultadoFinal.setForeground(new java.awt.Color(-65536,true));
        resultadoFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultadoFinal.setBorder(null);

        javax.swing.GroupLayout panelResultadosLayout = new javax.swing.GroupLayout(panelResultados);
        panelResultados.setLayout(panelResultadosLayout);
        panelResultadosLayout.setHorizontalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(encabezado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medias, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mediaPoblacional, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(encabezado3, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(resultadoFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelResultadosLayout.setVerticalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(encabezado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(encabezado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelResultadosLayout.createSequentialGroup()
                        .addComponent(mediaPoblacional, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addComponent(medias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelPrincipal.setRightComponent(panelResultados);

        menu1.setText("Archivo");

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        salir.setFont(new java.awt.Font("SansSerif", 0, 12));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu1.add(salir);

        barraMenu.add(menu1);

        menu2.setText("Opciones");

        acercaDe.setText("Acerca de...");
        acercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeActionPerformed(evt);
            }
        });
        menu2.add(acercaDe);

        barraMenu.add(menu2);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
}//GEN-LAST:event_salirActionPerformed

    private void acercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeActionPerformed
        acercaDE.setVisible(true);
}//GEN-LAST:event_acercaDeActionPerformed

    private void iniciarCP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarCP2ActionPerformed
        int arquitectura = arquitecturaCP2.getSelectedIndex();
        int entrada = Integer.parseInt(totalCP2.getSelectedItem().toString());
        int throughtput = Integer.parseInt(throughputCP2.getSelectedItem().toString());
        int repeticiones = Integer.parseInt(repeticionesCP2.getSelectedItem().toString());
        int[] valores = {entrada, throughtput, arquitectura};

        iniciar(valores, throughtput, repeticiones, 1); //Envia las entradas
    }//GEN-LAST:event_iniciarCP2ActionPerformed

    private void iniciarCP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarCP3ActionPerformed
        int arquitectura = arquitecturaCP3.getSelectedIndex();
        int entrada = Integer.parseInt(totalCP3.getSelectedItem().toString());
        int numCasilleros = Integer.parseInt(contenedoresCP3.getSelectedItem().toString());
        int subAlgoritmo = subAlgoritmoCP3.getSelectedIndex();
        int throughtput = Integer.parseInt(throughputCP3.getSelectedItem().toString());
        int repeticiones = Integer.parseInt(repeticionesCP3.getSelectedItem().toString());
        int[] valores = {entrada, numCasilleros, subAlgoritmo, throughtput, arquitectura};

        iniciar(valores, throughtput, repeticiones, 2); //Envia las entradas
    }//GEN-LAST:event_iniciarCP3ActionPerformed

    private void iniciarCP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarCP4ActionPerformed
        int arquitectura = arquitecturaCP4.getSelectedIndex();
        int total = Integer.parseInt(totalCP4.getSelectedItem().toString());
        int tipoMetodo = metodosCP4.getSelectedIndex();
        int datos = tipodatosCP4.getSelectedIndex();
        int throughtput = Integer.parseInt(throughputCP4.getSelectedItem().toString());
        int repeticiones = Integer.parseInt(repeticionesCP4.getSelectedItem().toString());
        int[] valores = {total, tipoMetodo, datos, throughtput, arquitectura};

        iniciar(valores, throughtput, repeticiones, 3); //Envia las entradas
    }//GEN-LAST:event_iniciarCP4ActionPerformed

    private void iniciarCP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarCP1ActionPerformed
        int arquitectura = arquitecturaCP1.getSelectedIndex();
        int entrada = dimensionesCP1.getSelectedIndex();
        int throughtput = Integer.parseInt(throughputCP1.getSelectedItem().toString());
        int repeticiones = Integer.parseInt(repeticionesCP1.getSelectedItem().toString());
        int[] valores = {entrada, throughtput, arquitectura};

        iniciar(valores, throughtput, repeticiones, 0); //Envia las entradas
    }//GEN-LAST:event_iniciarCP1ActionPerformed

    private void iniciarCP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarCP5ActionPerformed
        int arquitectura = arquitecturaCP5.getSelectedIndex();
        int total = Integer.parseInt(totalCP5.getSelectedItem().toString());
        int datos = tipodatosCP5.getSelectedIndex();
        int throughtput = Integer.parseInt(throughputCP5.getSelectedItem().toString());
        int repeticiones = Integer.parseInt(repeticionesCP5.getSelectedItem().toString());
        int[] valores = {total, datos, throughtput, arquitectura};
        
        iniciar(valores, throughtput, repeticiones, 4); //Envia las entradas
    }//GEN-LAST:event_iniciarCP5ActionPerformed

    private void throughputCP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_throughputCP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_throughputCP1ActionPerformed

    private boolean test()
    {
        long tiempoPeticion = 0;

        System.out.println("Inicia el test de velocidad");

        for (int i = 1; i <= 30; i++)
        {
            tiempoPeticion += ping("http://www.google.com.mx", i);
        }

        tiempoPeticion = tiempoPeticion / 30;
        System.out.println("El tiempo fue: " + tiempoPeticion +" ms");

        if (tiempoPeticion >= 40 && tiempoPeticion <= 50)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private long ping(String direccion, int ID)
    {
        try
        {
            URL url = new URL(direccion);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setConnectTimeout(1000 * 10);
            long inicio = System.currentTimeMillis();
            conexion.connect();
            long fin = System.currentTimeMillis();

            if (conexion.getResponseCode() == HttpURLConnection.HTTP_OK)
            {
                System.out.println("El ping: " +ID + " tardò: " + (fin - inicio));
                return (fin - inicio);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "No pude hacer pings");
            }
        }
        catch (Exception er)
        {
            System.out.println("Error en el test de velocidad: " + er);
        }

        return 0;
    }
    
    private void iniciar(int[] valores, int throughput, int repeticiones, int caso)
    {
        valoresTabla1 = new Object[throughput * repeticiones][3];
        valoresTabla2 = new Object[repeticiones][2]; 
        filaTabla1 = 0;
        filaTabla2 = 0;
        Object[][] tiempoRespuesta = null;
        boolean test = true;
        
        try
        {
            for(int i = 1; i <= repeticiones;)
            {
                if(test == true)
                {
                    switch(caso)
                    {
                        case 0: //Se invoca al Servicio Web: "Hipercubo"
                        {
                            tiempoRespuesta = new ControlHipercubo.Generador().crearPeticiones(i, valores);
                        }
                        break;

                        case 1: //Se invoca al Servicio Web: "Bernoulli"
                        {
                            tiempoRespuesta = new ControlBernoulli.Generador().crearPeticiones(i, valores);
                        }
                        break;

                        case 2: //Se invoca al Servicio Web: "Taylor"
                        {
                            tiempoRespuesta = new ControlTaylor.Generador().crearPeticiones(i, valores);
                        }
                        break;

                        case 3: //Se invoca al Servicio Web: "V.A Continuas"
                        {
                            tiempoRespuesta = new ControlContinuas.Generador().crearPeticiones(i, valores);
                        }
                        break;

                        case 4: //Se invoca al Servicio Web: "V.A Discretas"
                        {
                            tiempoRespuesta = new ControlDiscretas.Generador().crearPeticiones(i, valores);
                        }
                        break;
                    }

                    almacenarValores(tiempoRespuesta, throughput);
                    i++;
                }
            }

            llenarTablas(valoresTabla1, 0); //Llena la tabla 1 con los datos obtenidos
            llenarTablas(valoresTabla2, 1); //Llena la tabla 2 con los datos obtenidos

            panelResultados.setVisible(true);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "¡Las pruebas han finalizado!");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Error en la carga de resultados");
        } 
    }

    private void almacenarValores(Object[][] datos, int throughput)
    {
        for (int i = 0; i < throughput; i++, filaTabla1++) //Tabla 1
        {
            valoresTabla1[filaTabla1][0] = datos[i][0];
            valoresTabla1[filaTabla1][1] = datos[i][1];
            valoresTabla1[filaTabla1][2] = datos[i][2];
        }

        double mediaMuestral = 0;

        for (int i = 0; i < throughput; i++) //Tabla 2
        {
            mediaMuestral += Double.valueOf(datos[i][2].toString());
        }

        mediaMuestral = mediaMuestral / throughput;
        valoresTabla2[filaTabla2][0] = datos[0][0].toString();
        valoresTabla2[filaTabla2][1] = mediaMuestral;
        filaTabla2++;
    }

    private void llenarTablas(Object[][] valores, int index)
    {
        switch (index)
        {
            case 0:
            {
                String[] columnasT1 = {"Repetición", "No. de Solicitud", "Tiempo de Respuesta"};
                Object[][] valoresT1 = new Object[valores.length][3];

                for (int i = 0; i < valores.length; i++) //Llena fila por fila
                {
                    for (int j = 0; j < 3; j++)
                    {
                        valoresT1[i][j] = valores[i][j].toString();
                    }
                }

                TableModel model = new DefaultTableModel(valoresT1, columnasT1)
                {
                    @Override
                    public Class getColumnClass(int column)
                    {
                        Class returnValue;

                        if ((column >= 0) && (column < getColumnCount()))
                        {
                            returnValue = getValueAt(0, column).getClass();
                        } 
                        else
                        {
                            returnValue = Object.class;
                        }

                        return returnValue;
                    }
                };

                tabla1.setModel(model);
                tabla1.setRowSorter(new TableRowSorter<TableModel>(model));
            }
            break;

            case 1:
            {
                String[] columnasT2 = {"Repetición", "Media poblacional"};
                Object[][] valoresT2 = new Object[valores.length][2];

                double tiempoTotal = 0;

                for (int i = 0; i < valores.length; i++) //Llena fila por fila
                {
                    for (int j = 0; j < 2; j++)
                    {
                        if(j == 0)
                        {
                            double resultado = Double.valueOf(valores[i][j].toString());
                            resultado = Math.rint((resultado) * 100000) / 100000;
                            valoresT2[i][j] = resultado;
                        }
                        else
                        {
                            double resultado = Double.valueOf(valores[i][j].toString());
                            resultado = Math.rint((resultado) * 100000) / 100000;
                            valoresT2[i][j] = resultado;
                            tiempoTotal += Double.valueOf(valores[i][j].toString());
                        }
                    }
                }

                tiempoTotal = Math.rint((tiempoTotal / 30) * 100000) / 100000;
                resultadoFinal.setText("Total: " + Double.toString(tiempoTotal) + " seg.");
                resultadoFinal.setBackground(Color.WHITE);

                TableModel model2 = new DefaultTableModel(valoresT2, columnasT2)
                {
                    @Override
                    public Class getColumnClass(int column)
                    {
                        Class returnValue;

                        if ((column >= 0) && (column < getColumnCount()))
                        {
                            returnValue = getValueAt(0, column).getClass();
                        } 
                        else
                        {
                            returnValue = Object.class;
                        }

                        return returnValue;
                    }
                };

                tabla2.setModel(model2);
                tabla2.setRowSorter(new TableRowSorter<TableModel>(model2));
            }
        }
    }

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog acercaDE;
    private javax.swing.JMenuItem acercaDe;
    private javax.swing.JComboBox arquitecturaCP1;
    private javax.swing.JComboBox arquitecturaCP2;
    private javax.swing.JComboBox arquitecturaCP3;
    private javax.swing.JComboBox arquitecturaCP4;
    private javax.swing.JComboBox arquitecturaCP5;
    private javax.swing.JLabel autor;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel codirector;
    private javax.swing.JComboBox contenedoresCP3;
    private javax.swing.JComboBox dimensionesCP1;
    private javax.swing.JLabel director;
    private javax.swing.JLabel encabezado;
    private javax.swing.JLabel encabezado2;
    private javax.swing.JLabel encabezado3;
    private javax.swing.JLabel etiqueta1CP1;
    private javax.swing.JLabel etiqueta1CP2;
    private javax.swing.JLabel etiqueta1CP3;
    private javax.swing.JLabel etiqueta1CP4;
    private javax.swing.JLabel etiqueta1CP5;
    private javax.swing.JLabel etiqueta2CP1;
    private javax.swing.JLabel etiqueta2CP2;
    private javax.swing.JLabel etiqueta2CP3;
    private javax.swing.JLabel etiqueta2CP4;
    private javax.swing.JLabel etiqueta2CP5;
    private javax.swing.JLabel etiqueta3CP1;
    private javax.swing.JLabel etiqueta3CP2;
    private javax.swing.JLabel etiqueta3CP3;
    private javax.swing.JLabel etiqueta3CP4;
    private javax.swing.JLabel etiqueta4CP1;
    private javax.swing.JLabel etiqueta4CP2;
    private javax.swing.JLabel etiqueta4CP3;
    private javax.swing.JLabel etiqueta4CP4;
    private javax.swing.JLabel etiqueta4CP5;
    private javax.swing.JLabel etiqueta5CP3;
    private javax.swing.JLabel etiqueta5CP4;
    private javax.swing.JLabel etiqueta5CP5;
    private javax.swing.JLabel etiqueta6CP3;
    private javax.swing.JLabel etiqueta6CP4;
    private javax.swing.JLabel etiqueta6CP5;
    private javax.swing.JButton iniciarCP1;
    private javax.swing.JButton iniciarCP2;
    private javax.swing.JButton iniciarCP3;
    private javax.swing.JButton iniciarCP4;
    private javax.swing.JButton iniciarCP5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane10;
    private javax.swing.JSplitPane jSplitPane11;
    private javax.swing.JSplitPane jSplitPane12;
    private javax.swing.JSplitPane jSplitPane13;
    private javax.swing.JSplitPane jSplitPane14;
    private javax.swing.JSplitPane jSplitPane15;
    private javax.swing.JSplitPane jSplitPane16;
    private javax.swing.JSplitPane jSplitPane17;
    private javax.swing.JSplitPane jSplitPane18;
    private javax.swing.JSplitPane jSplitPane19;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane20;
    private javax.swing.JSplitPane jSplitPane21;
    private javax.swing.JSplitPane jSplitPane22;
    private javax.swing.JSplitPane jSplitPane23;
    private javax.swing.JSplitPane jSplitPane24;
    private javax.swing.JSplitPane jSplitPane25;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JSplitPane jSplitPane6;
    private javax.swing.JSplitPane jSplitPane7;
    private javax.swing.JSplitPane jSplitPane8;
    private javax.swing.JSplitPane jSplitPane9;
    private javax.swing.JLabel logo;
    private javax.swing.JScrollPane mediaPoblacional;
    private javax.swing.JScrollPane medias;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JComboBox metodosCP4;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelCP1;
    private javax.swing.JPanel panelCP2;
    private javax.swing.JPanel panelCP3;
    private javax.swing.JPanel panelCP4;
    private javax.swing.JPanel panelCP5;
    private javax.swing.JTabbedPane panelCasosPrueba;
    private javax.swing.JPanel panelEntradas;
    private javax.swing.JSplitPane panelPrincipal;
    private javax.swing.JPanel panelResultados;
    private javax.swing.JComboBox repeticionesCP1;
    private javax.swing.JComboBox repeticionesCP2;
    private javax.swing.JComboBox repeticionesCP3;
    private javax.swing.JComboBox repeticionesCP4;
    private javax.swing.JComboBox repeticionesCP5;
    private javax.swing.JTextField resultadoFinal;
    private javax.swing.JMenuItem salir;
    private javax.swing.JComboBox subAlgoritmoCP3;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JComboBox throughputCP1;
    private javax.swing.JComboBox throughputCP2;
    private javax.swing.JComboBox throughputCP3;
    private javax.swing.JComboBox throughputCP4;
    private javax.swing.JComboBox throughputCP5;
    private javax.swing.JComboBox tipodatosCP4;
    private javax.swing.JComboBox tipodatosCP5;
    private javax.swing.JLabel titulo2;
    private javax.swing.JComboBox totalCP2;
    private javax.swing.JComboBox totalCP3;
    private javax.swing.JComboBox totalCP4;
    private javax.swing.JComboBox totalCP5;
    // End of variables declaration//GEN-END:variables
}