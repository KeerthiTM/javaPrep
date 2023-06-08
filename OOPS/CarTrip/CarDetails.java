package keeksFirst.Check;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.awt.event.*;

import java.util.*;
public class CarDetails extends JFrame {
	Label title,car_no_label,car_type_label,car_capacity_label,car_color_label,license_no_label;
    TextField car_no,car_type, car_capacity, car_color, license_no;
    Button b1;
    
    CarDetails(){
    	setLayout(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.getContentPane().setFont(new Font("Courier New", Font.BOLD, 13));
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\car.jpeg");
		setIconImage(icon);

        car_no_label=new Label("Car Number");
        car_type_label=new Label("Car Type");
        car_capacity_label=new Label("Number Of Seats");
        car_color_label=new Label("Car Colour");
        license_no_label=new Label("License Number");

        car_no=new TextField();
        car_type=new TextField();
        car_capacity=new TextField();
        car_color=new TextField();
        license_no=new TextField();

        b1=new Button("Save Details");

        car_no_label.setBounds(100,100,120,25);
        car_type_label.setBounds(100,150,120,25);
        car_capacity_label.setBounds(100,200,120,25);
        car_color_label.setBounds(100,250,120,25);
        license_no_label.setBounds(100,300,120,25);
        
        car_no.setBounds(230,100,120,25);
        car_type.setBounds(230,150,120,25);
        car_capacity.setBounds(230,200,120,25);
        car_color.setBounds(230,250,120,25);
        license_no.setBounds(230,300,120,25);
        b1.setBounds(180,350,100,25);
        
        add(car_no_label);
        add(car_type_label);
        add(car_capacity_label);
        add(car_color_label);
        add(license_no_label);
        
        add(car_no);
        add(car_type);
        add(car_capacity);
        add(car_color);
        add(license_no);
        add(b1);
        
        setSize(500,500);
        
		this.getContentPane().setBackground(new Color(255, 222, 173)); 
        setResizable(false);
        setVisible(true);
        
        b1.addActionListener(new ActionListener(){
        	@Override

        	public void actionPerformed(ActionEvent e){
        	
        	String carNo = car_no.getText().toString();
        	String carType = car_type.getText().toString();
        	int carCapacity = Integer.parseInt(car_capacity.getText());
        	String carColor = car_color.getText().toString();
        	int licenseNo = Integer.parseInt(license_no.getText());
        	
        	
      	  try{
      	    Connection co = DriverManager.getConnection("jdbc:mysql://localhost/bootathon", "root","aswathy0235");

      	   Statement st=co.createStatement();

      	   st.executeUpdate("insert into car (car_no,car_type,car_capacity,car_color,license_no) values('"+carNo+"','"+carType+"','"+carCapacity+"','"+carColor+"','"+licenseNo+"')");

      	   co.setAutoCommit(true);
      	   co.close();
      	   System.out.println("Success!");
      	  
      	  }
      	  catch(Exception arg){
      		  System.out.println("Error"+ arg);
      	  }
      	  dash(e);
        	}
        });	   
        
    }
    
    private void dash(java.awt.event.ActionEvent e) {
		new Dashboard();
	}
    
   public static void main(String args[]){
       new CarDetails();
   }
}
  