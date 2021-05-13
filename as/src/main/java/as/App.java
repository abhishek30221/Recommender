package as;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.ModuleLayer.empty;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

 class MainMenu extends javax.swing.JFrame 
{
    boolean a = true;
    public MainMenu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        Header = new javax.swing.JPanel();
        icon = new javax.swing.JPanel();
        ButtonClose = new javax.swing.JPanel();
        CloseLabel = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        linemenu = new javax.swing.JPanel();
        ButtonMenuHide = new javax.swing.JPanel();
        HideLabel = new javax.swing.JLabel();
        ButtonSetting = new javax.swing.JPanel();
        SettingLabel = new javax.swing.JLabel();
        lineSetting = new javax.swing.JPanel();
        dashboardview = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputstring = new javax.swing.JTextPane();
        searchButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ansArea = new javax.swing.JPanel();
        ansText = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        Header.setBackground(new java.awt.Color(15, 19, 52));
        Header.setPreferredSize(new java.awt.Dimension(900, 40));
        Header.setLayout(new java.awt.BorderLayout());

        icon.setBackground(new java.awt.Color(15, 19, 52));
        icon.setMinimumSize(new java.awt.Dimension(180, 40));
        icon.setPreferredSize(new java.awt.Dimension(150, 122));
        icon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonClose.setBackground(new java.awt.Color(15, 19, 52));
        ButtonClose.setLayout(new java.awt.BorderLayout());

        CloseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_32px.png"))); // NOI18N
        CloseLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CloseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseLabelMouseExited(evt);
            }
        });
        ButtonClose.add(CloseLabel, java.awt.BorderLayout.CENTER);

        icon.add(ButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 40));

        Header.add(icon, java.awt.BorderLayout.LINE_END);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        menu.setPreferredSize(new java.awt.Dimension(50, 470));
        menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(15, 19, 52));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 470));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linemenu.setBackground(new java.awt.Color(15, 19, 52));
        linemenu.setLayout(new java.awt.BorderLayout());
        MenuIcon.add(linemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 10));

        ButtonMenuHide.setBackground(new java.awt.Color(15, 19, 52));
        ButtonMenuHide.setLayout(new java.awt.BorderLayout());

        HideLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HideLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_32px.png"))); // NOI18N
        HideLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HideLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HideLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HideLabelMouseExited(evt);
            }
        });
        ButtonMenuHide.add(HideLabel, java.awt.BorderLayout.CENTER);

        MenuIcon.add(ButtonMenuHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 50));

        ButtonSetting.setBackground(new java.awt.Color(15, 19, 52));
        ButtonSetting.setLayout(new java.awt.BorderLayout());

        SettingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SettingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settings_32px.png"))); // NOI18N
        SettingLabel.setFocusable(false);
        SettingLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SettingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingLabelMouseExited(evt);
            }
        });
        ButtonSetting.add(SettingLabel, java.awt.BorderLayout.CENTER);

        MenuIcon.add(ButtonSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 50, 50));

        lineSetting.setBackground(new java.awt.Color(15, 19, 52));
        lineSetting.setLayout(new java.awt.BorderLayout());
        MenuIcon.add(lineSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, 10));

        menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        dashboardview.setBackground(new java.awt.Color(255, 255, 255));
        dashboardview.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dashboardview.setPreferredSize(new java.awt.Dimension(400, 248));

        jScrollPane2.setViewportView(inputstring);

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        searchButton.setText("SEARCH");
        searchButton.setBorder(new javax.swing.border.MatteBorder(null));
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("      M O V I E    R E C O M M E N D A T I O N    S Y S T E M");

        ansArea.setBackground(new java.awt.Color(255, 255, 255));
        ansArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ansText.setColumns(20);
        ansText.setRows(5);
        ansText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ansAreaLayout = new javax.swing.GroupLayout(ansArea);
        ansArea.setLayout(ansAreaLayout);
        ansAreaLayout.setHorizontalGroup(
            ansAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ansAreaLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(ansText, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        ansAreaLayout.setVerticalGroup(
            ansAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ansAreaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ansText, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel2.setText("Enter a Hollywood Movie name : ");

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel3.setText("Top 10 Recommendations for you : ");

        javax.swing.GroupLayout dashboardviewLayout = new javax.swing.GroupLayout(dashboardview);
        dashboardview.setLayout(dashboardviewLayout);
        dashboardviewLayout.setHorizontalGroup(
            dashboardviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardviewLayout.createSequentialGroup()
                .addGroup(dashboardviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardviewLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(dashboardviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dashboardviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ansArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(dashboardviewLayout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(dashboardviewLayout.createSequentialGroup()
                        .addGap(847, 847, 847)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dashboardviewLayout.setVerticalGroup(
            dashboardviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardviewLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboardviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ansArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(dashboardview, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(908, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>                        
 
    public void callbackend() throws IOException
    {     
        try
        {
            String getques = inputstring.getText();
            String cmd[] = new String[2];
            cmd[0] = "python";
            cmd[1]  = " C:\\Users\\abhis\\Desktop\\project\\recommendationsystem.py " + getques;

            System.out.println("Hello"); 
            String s = null;
            Process p = Runtime.getRuntime().exec(cmd);    
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            System.out.println(stdInput.readLine());
            while ((s = stdInput.readLine()) != null) 
            {
               System.out.println(s);
            }
       }
        catch(IOException ie)
        {
//           ansText.setText("Can't Find any Recommendation");
            ie.printStackTrace();
            System.out.println("Can't Find any Recommendation"); 
        }
    }
    
    public void changecolor(JPanel hover , Color rand)
    {
        hover.setBackground(rand);
    }
 
    public void clickmenu(JPanel h1 , JPanel h2 , int numberbool)
    {
        if(numberbool == 1)
        {
            h1.setBackground(new Color(25,29,74));
            h2.setBackground(new Color(15,19,52));
        }
        else
        {
            h1.setBackground(new Color(15,19,52));
            h2.setBackground(new Color(25,29,74));
        }
    }
    
    public void imagechange(JLabel button , String resourceimg)
    {
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourceimg));
        button.setIcon(aimg);
    }
    
    
    public void hideshow(JPanel menushowhide , boolean dashboard , JLabel button)
   {
        if(dashboard == true)
        {
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            imagechange(button, "/icon/menu_32px.png");
        }else{
             menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
              imagechange(button, "/icon/back_32px.png");
        }
    }
    
    
    private void CloseLabelMouseClicked(java.awt.event.MouseEvent evt) {                                        
        changecolor(ButtonClose, new Color(25,29,74));
        System.exit(0);
    }                                       

    private void CloseLabelMouseEntered(java.awt.event.MouseEvent evt) {                                        
            changecolor(ButtonClose, new Color(15,19,52));
    }                                       

    private void CloseLabelMouseExited(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        
    }                                      
    
    private void HideLabelMouseEntered(java.awt.event.MouseEvent evt) {                                       
        changecolor(linemenu, new Color(247, 78 , 105));
    }                                      

    private void HideLabelMouseExited(java.awt.event.MouseEvent evt) {                                      
        changecolor(linemenu, new Color(15,19,52));
    }                                     

    private void SettingLabelMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
         clickmenu(ButtonSetting,ButtonMenuHide,1);
    }                                         

    private void SettingLabelMouseEntered(java.awt.event.MouseEvent evt) {                                          
           changecolor(lineSetting, new Color(40, 98 , 12));
    }                                         

    private void SettingLabelMouseExited(java.awt.event.MouseEvent evt) {                                         
         changecolor(lineSetting, new Color(15,19,52));
    }                                        

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        try {
            // TODO add your handling code here:
            callbackend();
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                         
    
 
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel ButtonClose;
    private javax.swing.JPanel ButtonMenuHide;
    private javax.swing.JPanel ButtonSetting;
    private javax.swing.JLabel CloseLabel;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel HideLabel;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JLabel SettingLabel;
    private javax.swing.JPanel ansArea;
    private javax.swing.JTextArea ansText;
    private javax.swing.JPanel dashboardview;
    private javax.swing.JPanel icon;
    private javax.swing.JTextPane inputstring;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel lineSetting;
    private javax.swing.JPanel linemenu;
    private javax.swing.JPanel menu;
    private javax.swing.JButton searchButton;
    // End of variables declaration                   
}
