package keeksFirst.Check;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

class AwtCheckNow extends Frame implements ActionListener{
 
	AwtCheckNow() {  
		//private static final long serialVersionUID = 1L;

   // creating a Frame  
   Frame f = new Frame();  

   // creating a Label  
   Label from_l = new Label("From :");   
   
   // creating a Label  
   Label to_l = new Label("To :"); 
   
   // creating a Label  
   Label pricePerKm_l = new Label("Price per km :"); 
   
   // creating a Label  
   Label startTime_l = new Label("Start Time :"); 
   
   // creating a Label  
   Label availableSeats_l = new Label("No. of seats available :"); 
   
   // creating a Label  
   Label distance_l = new Label("Distance of the trip :");

   // creating a Button  
   Button b = new Button("Submit");  

   // creating a TextField  
   TextField from_t = new TextField();  
   
   // creating a TextField  
   TextField to_t = new TextField();  
   
   // creating a TextField  
   TextField pricePerKm_t = new TextField(); 
   
   // creating a TextField  
   TextField startTime_t = new TextField();
   
   // creating a TextField  
   TextField availableSeats_t = new TextField();  
   
   // creating a TextField  
   TextField distance_t = new TextField();  
   
  

   // setting position of above components in the frame  
   from_l.setBounds(20, 80, 100, 40);  
   from_t.setBounds(280, 80, 280, 40);  
   
   to_l.setBounds(20, 140, 100, 40);  
   to_t.setBounds(280, 140, 280, 40); 
   
   pricePerKm_l.setBounds(20, 200, 180, 40);  
   pricePerKm_t.setBounds(280, 200, 280, 40); 
   
   startTime_l.setBounds(20, 260, 180, 40);  
   startTime_t.setBounds(280, 260, 280, 40); 
   
   availableSeats_l.setBounds(20, 320, 230, 40);  
   availableSeats_t.setBounds(280, 320, 280, 40); 
   
   distance_l.setBounds(20, 380, 230, 40);  
   distance_t.setBounds(280, 380, 280, 40);
   
   b.setBounds(100, 420, 180, 70);  
   
   
   from_l.setFont(new Font("Serif", Font.BOLD, 25));
   from_t.setFont(new Font("Serif", Font.BOLD, 25));
   
   to_l.setFont(new Font("Serif", Font.BOLD, 25)); 
   to_t.setFont(new Font("Serif", Font.BOLD, 25));
   
   pricePerKm_l.setFont(new Font("Serif", Font.BOLD, 25));
   pricePerKm_t.setFont(new Font("Serif", Font.BOLD, 25));
   
   startTime_l.setFont(new Font("Serif", Font.BOLD, 25));
   startTime_t.setFont(new Font("Serif", Font.BOLD, 25));
   
   availableSeats_l.setFont(new Font("Serif", Font.BOLD, 25)); 
   availableSeats_t.setFont(new Font("Serif", Font.BOLD, 25));
   
   distance_l.setFont(new Font("Serif", Font.BOLD, 25)); 
   distance_t.setFont(new Font("Serif", Font.BOLD, 25));
   
   b.setFont(new Font("Serif", Font.BOLD, 25));

   // adding components into frame    
   f.add(from_l);  
   f.add(from_t);
   f.add(to_l);  
   f.add(to_t);
   f.add(pricePerKm_l);  
   f.add(pricePerKm_t);
   f.add(startTime_l);  
   f.add(startTime_t);
   f.add(availableSeats_l);  
   f.add(availableSeats_t);
   f.add(distance_l);  
   f.add(distance_t);
   f.add(b);  
     

   // frame size 300 width and 300 height    
   f.setSize(400,300);  

   // setting the title of frame  
   f.setTitle("ADD TRIP");   
       
   // no layout  
   f.setLayout(null);   

   // setting visibility of frame  
   f.setVisible(true);
   
   b.addActionListener(new ActionListener(){
   	@Override

   	public void actionPerformed(ActionEvent e){
   		String from_loc = from_t.getText().toString();
    	String to_loc = to_t.getText().toString();
    	int distance = Integer.parseInt(distance_t.getText());
    	String startTime = startTime_t.getText().toString();
    	int pricePerKm = Integer.parseInt(pricePerKm_t.getText());
    	int availableSeats =Integer.parseInt(availableSeats_t.getText());
    	
    	
  	  try{
  	    Connection co = DriverManager.getConnection("jdbc:mysql://localhost/bootathon", "root","aswathy0235");

  	   Statement st=co.createStatement();

  	   st.executeUpdate("insert into trip (from_loc,to_loc,distance,start_time,seats_available,price_per_km) values('"+from_loc+"','"+to_loc+"','"+distance+"','"+startTime+"','"+pricePerKm+"','"+availableSeats+"')");

  	   co.setAutoCommit(true);
  	   co.close();
  	   System.out.println("Success!");
  	  
  	  }
  	  catch(Exception arg){
  		  System.out.println("Error"+ arg);
  	  }
    	}
    });
   	

}    

//main method  
public static void main(String args[]) {   

//creating instance of Frame class   
	AwtCheckNow awt_obj = new AwtCheckNow();    

}  

}    