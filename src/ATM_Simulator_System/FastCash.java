/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM_Simulator_System;

/**
 *
 * @author anish
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.io.*;

public class FastCash extends JFrame implements ActionListener {
    JLabel l1, l2;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    JTextField t1;
    
    FastCash() {
        
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("FAST CASH");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (4 * x);
        int w = z / y;
        String pad = "";
        pad = String.format("%" + w + "s", pad);
        setTitle(pad + "FAST CASH");
        
        l1 = new JLabel("SELECT WITHDRAWAL AMOUNT");
        l1.setFont(new Font("System", Font.BOLD, 38));
        
        l2 = new JLabel("Enter PIN");
        l2.setFont(new Font("System", Font.BOLD, 13));
        
        t1 = new JTextField();
        t1.setFont(new Font("System", Font.BOLD, 13));
        
        b1 = new JButton("Rs 100");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setBackground(Color.WHITE);
        
        b2 = new JButton("Rs 500");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setBackground(Color.WHITE);
        
        b3 = new JButton("Rs 1000");
        b3.setFont(new Font("System", Font.BOLD, 18));
        b3.setBackground(Color.BLACK);
        b3.setBackground(Color.WHITE);
        
        b4 = new JButton("Rs 2000");
        b4.setFont(new Font("System", Font.BOLD, 18));
        b4.setBackground(Color.BLACK);
        b4.setBackground(Color.WHITE);
        
        b5 = new JButton("Rs 5000");
        b5.setFont(new Font("System", Font.BOLD, 18));
        b5.setBackground(Color.BLACK);
        b5.setBackground(Color.WHITE);
        
        b6 = new JButton("Rs 10000");
        b6.setFont(new Font("System", Font.BOLD, 18));
        b6.setBackground(Color.BLACK);
        b6.setBackground(Color.WHITE);
        
        b7 = new JButton("BACK");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.BLACK);
        b7.setBackground(Color.WHITE);
        
        b8 = new JButton("EXIT");
        b8.setFont(new Font("System", Font.BOLD, 18));
        b8.setBackground(Color.BLACK);
        b8.setBackground(Color.WHITE);
        
        setLayout(null);
        
        l2.setBounds(640, 10, 60, 40);
        add(l2);
        
        t1.setBounds(640, 10, 60, 40);
        add(t1);
        
        l1.setBounds(640, 10, 60, 40);
        add(l1);
        
        b1.setBounds(640, 10, 60, 40);
        add(b1);
        
        b2.setBounds(640, 10, 60, 40);
        add(b2);
        
        b3.setBounds(640, 10, 60, 40);
        add(b3);
        
        b4.setBounds(640, 10, 60, 40);
        add(b4);
        
        b5.setBounds(640, 10, 60, 40);
        add(b5);
        
        b6.setBounds(640, 10, 60, 40);
        add(b6);
        
        b7.setBounds(640, 10, 60, 40);
        add(b7);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800, 800);
        setLocation(500, 90);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        try {
            
            String a = t1.getText();
            double balance = 0;
            
            if(ae.getSource() == b1) {
                
                conn c1 = new conn();
                
                ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '" + a + "' ");
                
                if(rs.next()) {
                    String pin = rs.getString("pin");
                    
                    balance = rs.getDouble("balance");
                    
                    balance-= 100;
                    String q1 = "insert into bank values('" + pin + "', null, 100, '" + balance + "')";
                    
                    c1.s.executeUpdate(q1);
                }
                
                JOptionPane.showMessageDialog(null, "Rs. " + 100 + " Debited Successfully");
                
                new Transactions().setVisible(true);
                setVisible(false);
            }
            
            else if(ae.getSource() == b2) {
                
                conn c1 = new conn();
                
                ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '" + a + "' ");
                
                if(rs.next()) {
                    String pin = rs.getString("pin");
                    
                    balance = rs.getDouble("balance");
                    
                    balance-= 500;
                    String q1 = "insert into bank values('" + pin + "', null, 500, '" + balance + "')";
                    
                    c1.s.executeUpdate(q1);
                }
                
                JOptionPane.showMessageDialog(null, "Rs. " + 500 + " Debited Successfully");
                
                new Transactions().setVisible(true);
                setVisible(false);
            }
            
            else if(ae.getSource() == b3) {
                
                conn c1 = new conn();
                
                ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '" + a + "' ");
                
                if(rs.next()) {
                    String pin = rs.getString("pin");
                    
                    balance = rs.getDouble("balance");
                    
                    balance-= 1000;
                    String q1 = "insert into bank values('" + pin + "', null, 1000, '" + balance + "')";
                    
                    c1.s.executeUpdate(q1);
                }
                
                JOptionPane.showMessageDialog(null, "Rs. " + 1000 + " Debited Successfully");
                
                new Transactions().setVisible(true);
                setVisible(false);
            }
            
            else if(ae.getSource() == b4) {
                
                conn c1 = new conn();
                
                ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '" + a + "' ");
                
                if(rs.next()) {
                    String pin = rs.getString("pin");
                    
                    balance = rs.getDouble("balance");
                    
                    balance-= 2000;
                    String q1 = "insert into bank values('" + pin + "', null, 2000, '" + balance + "')";
                    
                    c1.s.executeUpdate(q1);
                }
                
                JOptionPane.showMessageDialog(null, "Rs. " + 2000 + " Debited Successfully");
                
                new Transactions().setVisible(true);
                setVisible(false);
            }
            
            if(ae.getSource() == b5) {
                
                conn c1 = new conn();
                
                ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '" + a + "' ");
                
                if(rs.next()) {
                    String pin = rs.getString("pin");
                    
                    balance = rs.getDouble("balance");
                    
                    balance-= 5000;
                    String q1 = "insert into bank values('" + pin + "', null, 5000, '" + balance + "')";
                    
                    c1.s.executeUpdate(q1);
                }
                
                JOptionPane.showMessageDialog(null, "Rs. " + 5000 + " Debited Successfully");
                
                new Transactions().setVisible(true);
                setVisible(false);
            }
            
            if(ae.getSource() == b6) {
                
                conn c1 = new conn();
                
                ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '" + a + "' ");
                
                if(rs.next()) {
                    String pin = rs.getString("pin");
                    
                    balance = rs.getDouble("balance");
                    
                    balance-= 10000;
                    String q1 = "insert into bank values('" + pin + "', null, 10000, '" + balance + "')";
                    
                    c1.s.executeUpdate(q1);
                }
                
                JOptionPane.showMessageDialog(null, "Rs. " + 10000 + " Debited Successfully");
                
                new Transactions().setVisible(true);
                setVisible(false);
            }
            
            else if(ae.getSource() == b7) {
                
                System.exit(0);
                
            }
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e);
        }
    }
    
    public static void main(String[] args) throws IOException {
        new FastCash().setVisible(true);
    }
}
