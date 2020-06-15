
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sqltest.Sqltest.CONN_STRING;
import static sqltest.Sqltest.PASSWORD;
import static sqltest.Sqltest.USERNAME;


public class f2 extends javax.swing.JFrame {
    boolean All_spaces_are_full=false;
    boolean notsameairport=true;
    Connection conn=null;
    ResultSet rs=null;
    DateFormat df;
    
    
    public f2() {
        initComponents();
            show_user();
            combobox();
    }
//     public ArrayList<User> List(){
//        ArrayList<User> List =new ArrayList<>();
//        try {
//            conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
//            String query1="SELECT * FROM mydata22.flight_schedule";
//            Statement st=conn.createStatement();
//             rs=st.executeQuery(query1);
//            User user; 
//            //2l user is a linked list of rows
//            while(rs.next()){
//                user=new User(rs.getString("idFlight_Schedule"),rs.getString("Company_name"),rs.getString("Fromx"),rs.getString("TOx"),rs.getString("Departure_Time"),rs.getString("Arrival_Time"),rs.getString("Departure_Date"),rs.getString("Arrival_Date"),rs.getString("Price"));
//                List.add(user);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(f2.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return List;
//    }
     
     public final void show_user(){
         try{
        conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);   
        DefaultTableModel dm=(DefaultTableModel) jTable1.getModel();
        String sql= "SELECT idflight_schedule,Company_name,Price,Fromx,Tox,Departure_Time,Arrival_Time,Departure_Date from mydata22.flight_schedule";
        Statement st=conn.createStatement();
        rs=st.executeQuery(sql);
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        while (rs.next()) {
            
        }
    }catch(Exception e){
        System.out.println(e);
    }
//          ArrayList<User> list =List();
//          DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
//          Object[] row=new Object[9];
//          for(int i=0;i<list.size();i++){
//              row[0]=list.get(i).getidFlight_Schedule();
//              row[1]=list.get(i).getCompany_name();
//              row[2]=list.get(i).getFrom();
//              row[3]=list.get(i).getTo();
//              row[4]=list.get(i).getDeparture_Time();
//              row[5]=list.get(i).getArrival_Time();
//              row[6]=list.get(i).getDeparture_Date();
//              row[7]=list.get(i).getArrival_Date();
//              row[8]=list.get(i).getPrice();
//              model.addRow(row);
//          }
     }
//     public void sifrla(){
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.setRowCount(0);
//    }
     public final void combobox(){
          String od;
         jTextField2.setEditable(false);
         jTextField3.setEditable(false);
         jTextField1.setEditable(false);
         jComboBox3.removeAllItems();
         jComboBox1.removeAllItems();
         jComboBox2.removeAllItems();
         //airports//
        try {
            conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            String query1="SELECT city_name FROM mydata22.airports";
            Statement st=conn.createStatement();
             rs=st.executeQuery(query1);
            while(rs.next()){
                 od=rs.getString("city_name");
                jComboBox3.addItem(od);
                jComboBox1.addItem(od);
            }
             jTextField2.setText("");
             jTextField3.setText("");
             //company//
             query1="SELECT name FROM mydata22.company_info";
             st=conn.createStatement();
             rs=st.executeQuery(query1);
            while(rs.next()){
                 od=rs.getString("name");
                jComboBox2.addItem(od);
            }
            jTextField1.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(f2.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabelid = new javax.swing.JLabel();
        jTextid = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Company name:");

        jLabel2.setText("From:");

        jLabel3.setText("To:");

        jLabel4.setText("Departure Time :");

        jLabel5.setText("Arrival Time:");

        jLabel7.setText("Departure Date :");

        jLabel8.setText("Price:");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("NEW");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idFlight_Schedule", "Company_name", "Price", "FROM", "TO", "Departure_Time", "Arrival_Time", "Departure_Date", "Arrival_Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Update");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setMaximumSize(new java.awt.Dimension(55, 33));
        jButton2.setMinimumSize(new java.awt.Dimension(55, 33));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Delete");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jLabelid.setText("Flight id:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1İtemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3İtemStateChanged(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelid))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 522, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel7))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextid, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(14, 14, 14)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelid)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(101, 101, 101))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(53, 53, 53)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Add//
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        df=new SimpleDateFormat("yyyy-MM-dd");
        try{
            Statement stm=(Statement) conn.createStatement();
            check_spaces();
            if(All_spaces_are_full){
            String Company_name=jTextField1.getText();
            String FROM=jTextField2.getText();
            String TO=jTextField3.getText();
            String Departure_Time=jTextField4.getText();
            String Arrival_Time=jTextField5.getText();
            String Departure_Date=df.format(jDateChooser1.getDate());
            String Price=jTextField8.getText();
            check();
            if(notsameairport){
            String insert="INSERT INTO `mydata22`.`flight_schedule` (`Company_name`, `Fromx`, `TOx`,`Departure_Time`, `Arrival_Time`, `Departure_Date`, `Price`,`idAirplain`) VALUES ('"+Company_name+"', '"+FROM+"', '"+TO+"','"+Departure_Time+"','"+Arrival_Time+"','"+Departure_Date+"','"+Price+"','20')";
            stm.executeUpdate(insert);
                jTextid.setText("");
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jDateChooser1.setDate(null);
                jTextField8.setText("");
                All_spaces_are_full=false;
                show_user();
            }
            }
            notsameairport=true;
        }catch(SQLException xe){
            System.err.println(xe);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    //update//
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        df=new SimpleDateFormat("yyyy-MM-dd");
        try {
           check_spaces();
           if(All_spaces_are_full){
                Statement stm=(Statement) conn.createStatement();
                String Flight_id=jTextid.getText();
                String Company_name=jTextField1.getText();
                String Fromx=jTextField2.getText();
                String TOx=jTextField3.getText();
                String Departure_Time=jTextField4.getText();
                String Arrival_Time=jTextField5.getText();
                String Departure_Date=df.format(jDateChooser1.getDate());
                String Price=jTextField8.getText();
                String insert="UPDATE `mydata22`.`flight_schedule` SET `Company_name`='"+Company_name+"',`Fromx`='"+Fromx+"',`TOx`='"+TOx+"',`Departure_Time`='"+Departure_Time+"',`Arrival_Time`='"+Arrival_Time+"',`Departure_Date`='"+Departure_Date+"',`Price`= '"+Price+"'WHERE (`idFlight_Schedule` = '"+Flight_id+"')";
                All_spaces_are_full=false;
                stm.executeUpdate(insert);
                show_user();
             }
        } catch (SQLException ex) {
            Logger.getLogger(f2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }//GEN-LAST:event_jButton2ActionPerformed
//Delete//
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if(jTextid.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Please specify Flight id");
                return;
            }
            Statement stm=(Statement) conn.createStatement();
            String Flight_id=jTextid.getText();
            String insert="DELETE FROM `mydata22`.`flight_schedule` WHERE (`idFlight_Schedule` = '"+Flight_id+"')";
            stm.executeUpdate(insert);
            show_user();
        } catch (SQLException ex) {
            Logger.getLogger(f2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1İtemStateChanged

    }//GEN-LAST:event_jComboBox1İtemStateChanged

    private void jComboBox3İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3İtemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3İtemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Object selectedValue= jComboBox1.getSelectedItem();
        String checkifadd=(String)selectedValue;
        jTextField2.setText(checkifadd);
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
         Object selectedValue= jComboBox3.getSelectedItem();
         String checkifadd=(String)selectedValue;
        jTextField3.setText(checkifadd);
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int column = 0;
        df=new SimpleDateFormat("yyyy-MM-dd");
        int row = jTable1.getSelectedRow();
        jTextid.setText(jTable1.getModel().getValueAt(row, 0).toString());
        jTextField1.setText(jTable1.getModel().getValueAt(row, 1).toString());
        jTextField8.setText(jTable1.getModel().getValueAt(row, 2).toString());
        jTextField2.setText(jTable1.getModel().getValueAt(row, 3).toString());
        jTextField3.setText(jTable1.getModel().getValueAt(row, 4).toString());
        jTextField4.setText(jTable1.getModel().getValueAt(row, 5).toString());
        jTextField5.setText(jTable1.getModel().getValueAt(row, 6).toString());
        String date=jTable1.getModel().getValueAt(row,7).toString();
        try {
            java.util.Date date1=df.parse(date);
            jDateChooser1.setDate(date1);
        } catch (ParseException ex) {
            Logger.getLogger(f2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
         Object selectedValue= jComboBox2.getSelectedItem();
         String checkifadd=(String)selectedValue;
         jTextField1.setText(checkifadd);
    }//GEN-LAST:event_jComboBox2ActionPerformed
    public void check(){
         if (jTextField2.getText().trim().equals(jTextField3.getText().trim())){
                notsameairport=false;
                JOptionPane.showMessageDialog(null, "you can't get on an airplane to go to the same airport");
            }
    }
    public void check_spaces(){
            if(jTextField1.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Please specify Company name");
                return;
            }
            else if (jTextField2.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Please Specify From Where The Flight is");
                return;
            }
            else if (jTextField3.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Please Specify To Where The Flight is");
                return;
            }
            else if (jTextField4.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Please Specify Departure Time");
                return;
            }
            else if (jTextField5.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Please Specify Arrival Time");
                return;
            }
            else if (jTextField8.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Please Specify Price");
                return;
            }
              else if(jDateChooser1.getDate() == null){
                JOptionPane.showMessageDialog(null, "Please specify Departure Date ");
                return;
            }
            All_spaces_are_full=true;
}
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new f2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelid;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextid;
    // End of variables declaration//GEN-END:variables
}
