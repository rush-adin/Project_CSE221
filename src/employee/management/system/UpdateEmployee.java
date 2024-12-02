package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener{

    JTextField tfeducation, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JLabel lblempId;
    JButton add, back;
    String empId;

    UpdateEmployee(String empId) {
        this.empId = empId;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Update Employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);

        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);

        JLabel lblname = new JLabel();
        lblname.setBounds(200, 150, 150, 30);
        add(lblname);

        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelfname);

        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);

        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);

        JLabel lbldob = new JLabel();
        lbldob.setBounds(200, 200, 150, 30);
        add(lbldob);

        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);

        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);
