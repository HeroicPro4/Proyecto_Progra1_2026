/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dashboard;
import Partidos.*;
import Clientes.*;
import Tickets.*;
import Ventas.*;
import Usuarios.*;
import Detalle_venta.*;
import Factura.FacturaTickets;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.JPanel;

/**
 * @author MK
 */

public class Dashboard1 extends javax.swing.JFrame {

/**
* Creates new form Dash
*/
    
    int xmouse, ymouse;
    private JPanel[] paneles;
    public Dashboard1() {
        initComponents();
        this.setLocationRelativeTo(null);
//-----------------------------------------------
// <editor-fold defaultstate="collapsed" desc="Fecha">
LocalDate actualdate = LocalDate.now();
    String dayweek = capitalize(actualdate.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
        int daymonth = actualdate.getDayOfMonth();
        String month = capitalize(actualdate.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
        int year = actualdate.getYear();
        String mensaje = "Hoy es " + dayweek + " " + daymonth + " de " + month + " de " + year;
    fecha.setText(mensaje);
// </editor-fold>
//-----------------------------------------------     
// <editor-fold defaultstate="collapsed" desc="Configuraciones de Botones">
paneles = new JPanel[] { btn_princp, btn_prod, btn_prov, btn_client, btn_fact, btn_fact1 }; 
    Color colorNormal = new Color(47,78,254);  
    Color colorHover = new Color(129,176,254);   
    Color colorSeleccionado = new Color(47,72,192);

        for (JPanel panel : paneles) {
            panel.addMouseListener(new java.awt.event.MouseAdapter() {
                
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (panel.getBackground() != colorSeleccionado) {
                    panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                    panel.setBackground(colorHover);
                }
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (panel.getBackground() != colorSeleccionado) {
                    panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                    panel.setBackground(colorNormal);
                }
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Restablecer paneles
                for (JPanel p : paneles) {
                    p.setBackground(colorNormal);
                }
                // Marca el seleccionado
                    panel.setBackground(colorSeleccionado);
            }
            });

        }// </editor-fold>
//-----------------------------------------------    
// <editor-fold defaultstate="collapsed" desc="Pantalla de inicio Dashboard">
Initial_Internal_Frame Init= new Initial_Internal_Frame();
DesktopPane.add(Init);
Init.setVisible(true);
    try{
        
        Init.setSelected(true);
        }catch (java.beans.PropertyVetoException e){
            e.printStackTrace();
        }
// </editor-fold>
//-----------------------------------------------    
}
    
    public static String capitalize(String texto) {if (texto == null || texto.isEmpty()) return texto; return texto.substring(0, 1).toUpperCase() + texto.substring(1);}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        bar = new javax.swing.JPanel();
        exit_cube = new javax.swing.JPanel();
        exit_txt = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Title_Separator = new javax.swing.JSeparator();
        btn_princp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_prod = new javax.swing.JPanel();
        btb_prod_txt = new javax.swing.JLabel();
        btn_prov = new javax.swing.JPanel();
        btb_prov_txt = new javax.swing.JLabel();
        btn_client = new javax.swing.JPanel();
        btb_client_txt = new javax.swing.JLabel();
        btn_fact = new javax.swing.JPanel();
        btb_fact_txt = new javax.swing.JLabel();
        btn_fact1 = new javax.swing.JPanel();
        btb_fact_txt1 = new javax.swing.JLabel();
        Sub_Header = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        mini_message = new javax.swing.JLabel();
        DesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1080, 720));

        Background.setBackground(new java.awt.Color(255, 255, 255));

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.setOpaque(false);
        bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barMouseDragged(evt);
            }
        });
        bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barMousePressed(evt);
            }
        });

        exit_cube.setBackground(new java.awt.Color(51, 102, 255));
        exit_cube.setMinimumSize(new java.awt.Dimension(50, 50));

        exit_txt.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        exit_txt.setForeground(new java.awt.Color(255, 255, 255));
        exit_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_txt.setText("x");
        exit_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit_txt.setPreferredSize(new java.awt.Dimension(18, 44));
        exit_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exit_cubeLayout = new javax.swing.GroupLayout(exit_cube);
        exit_cube.setLayout(exit_cubeLayout);
        exit_cubeLayout.setHorizontalGroup(
            exit_cubeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exit_cubeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        exit_cubeLayout.setVerticalGroup(
            exit_cubeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addComponent(exit_cube, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1280, 1280, 1280))
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addComponent(exit_cube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Menu.setBackground(new java.awt.Color(47, 78, 254));
        Menu.setPreferredSize(new java.awt.Dimension(250, 720));

        Title.setFont(new java.awt.Font("Roboto Black", 0, 30)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("EQUIPO LOCAL");

        Title_Separator.setBackground(new java.awt.Color(255, 255, 255));

        btn_princp.setBackground(new java.awt.Color(47, 78, 254));
        btn_princp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_princp.setDoubleBuffered(false);
        btn_princp.setPreferredSize(new java.awt.Dimension(0, 60));
        btn_princp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_princpMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-outline.png"))); // NOI18N
        jLabel3.setText("Principal");

        javax.swing.GroupLayout btn_princpLayout = new javax.swing.GroupLayout(btn_princp);
        btn_princp.setLayout(btn_princpLayout);
        btn_princpLayout.setHorizontalGroup(
            btn_princpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_princpLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(130, 130, 130))
        );
        btn_princpLayout.setVerticalGroup(
            btn_princpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_princpLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
        );

        btn_prod.setBackground(new java.awt.Color(47, 78, 254));
        btn_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_prodMouseClicked(evt);
            }
        });

        btb_prod_txt.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btb_prod_txt.setForeground(new java.awt.Color(255, 255, 255));
        btb_prod_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-outline.png"))); // NOI18N
        btb_prod_txt.setText("Partidos");

        javax.swing.GroupLayout btn_prodLayout = new javax.swing.GroupLayout(btn_prod);
        btn_prod.setLayout(btn_prodLayout);
        btn_prodLayout.setHorizontalGroup(
            btn_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_prodLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btb_prod_txt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_prodLayout.setVerticalGroup(
            btn_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_prodLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btb_prod_txt)
                .addGap(18, 18, 18))
        );

        btn_prov.setBackground(new java.awt.Color(47, 78, 254));
        btn_prov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_provMouseClicked(evt);
            }
        });

        btb_prov_txt.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btb_prov_txt.setForeground(new java.awt.Color(255, 255, 255));
        btb_prov_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/proov.png"))); // NOI18N
        btb_prov_txt.setText("Tickets");

        javax.swing.GroupLayout btn_provLayout = new javax.swing.GroupLayout(btn_prov);
        btn_prov.setLayout(btn_provLayout);
        btn_provLayout.setHorizontalGroup(
            btn_provLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_provLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btb_prov_txt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_provLayout.setVerticalGroup(
            btn_provLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_provLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btb_prov_txt)
                .addGap(18, 18, 18))
        );

        btn_client.setBackground(new java.awt.Color(47, 78, 254));
        btn_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientMouseClicked(evt);
            }
        });

        btb_client_txt.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btb_client_txt.setForeground(new java.awt.Color(255, 255, 255));
        btb_client_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account-multiple.png"))); // NOI18N
        btb_client_txt.setText("Clientes");

        javax.swing.GroupLayout btn_clientLayout = new javax.swing.GroupLayout(btn_client);
        btn_client.setLayout(btn_clientLayout);
        btn_clientLayout.setHorizontalGroup(
            btn_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_clientLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btb_client_txt)
                .addGap(134, 134, 134))
        );
        btn_clientLayout.setVerticalGroup(
            btn_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_clientLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btb_client_txt)
                .addGap(18, 18, 18))
        );

        btn_fact.setBackground(new java.awt.Color(47, 78, 254));
        btn_fact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_factMouseClicked(evt);
            }
        });

        btb_fact_txt.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btb_fact_txt.setForeground(new java.awt.Color(255, 255, 255));
        btb_fact_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file-chart.png"))); // NOI18N
        btb_fact_txt.setText("Ventas");

        javax.swing.GroupLayout btn_factLayout = new javax.swing.GroupLayout(btn_fact);
        btn_fact.setLayout(btn_factLayout);
        btn_factLayout.setHorizontalGroup(
            btn_factLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_factLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btb_fact_txt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_factLayout.setVerticalGroup(
            btn_factLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_factLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btb_fact_txt)
                .addGap(18, 18, 18))
        );

        btn_fact1.setBackground(new java.awt.Color(47, 78, 254));
        btn_fact1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fact1MouseClicked(evt);
            }
        });

        btb_fact_txt1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btb_fact_txt1.setForeground(new java.awt.Color(255, 255, 255));
        btb_fact_txt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file-chart.png"))); // NOI18N
        btb_fact_txt1.setText("Factura");

        javax.swing.GroupLayout btn_fact1Layout = new javax.swing.GroupLayout(btn_fact1);
        btn_fact1.setLayout(btn_fact1Layout);
        btn_fact1Layout.setHorizontalGroup(
            btn_fact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_fact1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btb_fact_txt1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_fact1Layout.setVerticalGroup(
            btn_fact1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_fact1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btb_fact_txt1)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_princp, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
            .addComponent(btn_prov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_fact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Title)
                                    .addComponent(Title_Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_fact1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_prod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(Title_Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btn_princp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_prov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_fact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_fact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        Sub_Header.setBackground(new java.awt.Color(129, 176, 254));
        Sub_Header.setPreferredSize(new java.awt.Dimension(830, 100));

        fecha.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Hoy es Domingo 25 de Mayo de 2025");

        javax.swing.GroupLayout Sub_HeaderLayout = new javax.swing.GroupLayout(Sub_Header);
        Sub_Header.setLayout(Sub_HeaderLayout);
        Sub_HeaderLayout.setHorizontalGroup(
            Sub_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sub_HeaderLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(fecha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Sub_HeaderLayout.setVerticalGroup(
            Sub_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sub_HeaderLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(fecha)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Header.setBackground(new java.awt.Color(255, 255, 255));

        mini_message.setBackground(new java.awt.Color(204, 204, 204));
        mini_message.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        mini_message.setForeground(new java.awt.Color(153, 153, 153));
        mini_message.setText("We belive that every enterprise matters!");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mini_message)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(mini_message)
                .addGap(15, 15, 15))
        );

        DesktopPane.setBackground(new java.awt.Color(255, 255, 255));
        DesktopPane.setPreferredSize(new java.awt.Dimension(1030, 740));

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sub_Header, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
                    .addComponent(DesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(Sub_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(DesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );

        DesktopPane.getAccessibleContext().setAccessibleParent(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// <editor-fold defaultstate="collapsed" desc="Configuraciones Btn Exit">    
    private void exit_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_txtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exit_txtMouseClicked

    private void exit_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_txtMouseEntered
        exit_cube.setBackground(Color.red);
        exit_txt.setForeground(Color.white);
    }//GEN-LAST:event_exit_txtMouseEntered

    private void exit_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_txtMouseExited
        exit_cube.setBackground(new Color(51,102,255));
        exit_txt.setForeground(Color.white);
    }//GEN-LAST:event_exit_txtMouseExited
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Configuraciones Barra">
    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse,y - ymouse);
    }//GEN-LAST:event_barMouseDragged

    private void barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMousePressed
        xmouse= evt.getX();
        ymouse= evt.getY();
    }//GEN-LAST:event_barMousePressed
// </editor-fold>
    
    private void btn_princpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_princpMouseClicked
    Initial_Internal_Frame Init= new Initial_Internal_Frame();
    DesktopPane.add(Init);
    Init.setVisible(true);
        try{
            Init.setSelected(true);
            }catch (java.beans.PropertyVetoException e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_btn_princpMouseClicked

    private void btn_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prodMouseClicked
    viestaPartido Init= new viestaPartido();
    DesktopPane.add(Init);
    Init.setVisible(true);
        try{
            Init.setSelected(true);
            }catch (java.beans.PropertyVetoException e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_btn_prodMouseClicked

    private void btn_provMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_provMouseClicked
    viestaTickets Init= new viestaTickets();
    DesktopPane.add(Init);
    Init.setVisible(true);
        try{
            Init.setSelected(true);
            }catch (java.beans.PropertyVetoException e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_btn_provMouseClicked

    private void btn_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientMouseClicked
        // TODO add your handling code here:
    viestaCliente Init= new viestaCliente();
    DesktopPane.add(Init);
    Init.setVisible(true);
        try{
            Init.setSelected(true);
            }catch (java.beans.PropertyVetoException e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_btn_clientMouseClicked

    private void btn_factMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_factMouseClicked
    Detalle_venta_view init = new Detalle_venta_view();
    DesktopPane.add(init);
    init.setVisible(true);
    try {
        init.setSelected(true);
    } catch (java.beans.PropertyVetoException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_btn_factMouseClicked

    private void btn_fact1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fact1MouseClicked
        // TODO add your handling code here:
        FacturaTickets init = new FacturaTickets();
    DesktopPane.add(init);
    init.setVisible(true);
    try {
        init.setSelected(true);
    } catch (java.beans.PropertyVetoException e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_btn_fact1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard1().setVisible(true);
            }
        });
    }

// <editor-fold defaultstate="collapsed" desc="Declaracion de Variables">
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Sub_Header;
    private javax.swing.JLabel Title;
    private javax.swing.JSeparator Title_Separator;
    private javax.swing.JPanel bar;
    private javax.swing.JLabel btb_client_txt;
    private javax.swing.JLabel btb_fact_txt;
    private javax.swing.JLabel btb_fact_txt1;
    private javax.swing.JLabel btb_prod_txt;
    private javax.swing.JLabel btb_prov_txt;
    private javax.swing.JPanel btn_client;
    private javax.swing.JPanel btn_fact;
    private javax.swing.JPanel btn_fact1;
    private javax.swing.JPanel btn_princp;
    private javax.swing.JPanel btn_prod;
    private javax.swing.JPanel btn_prov;
    private javax.swing.JPanel exit_cube;
    private javax.swing.JLabel exit_txt;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel mini_message;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
