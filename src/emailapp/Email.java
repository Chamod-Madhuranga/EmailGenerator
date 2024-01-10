/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity=500;
    private int defaultPasswordLength =10;
    private String alternateEmail;
    private String companySuffix = "company.com";
    
    //Constructor to receive first name and lastname
    public Email(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName =lastName;
        
    
        //call the method asking for the department
        this.department= setDepartment();
        
        
        //call the method  asking for the random password
        this.password= randomPassword(defaultPasswordLength);
        System.out.println("Your Password is :" + this.password);
        
        //combine the email
        email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        
        
    }
    //Ask for the department
    private String setDepartment(){
        System.out.print("Department Codes\n1 for sales\n2 for Development\n3 for Acccounting\n4 for None \nEnter department :");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1)
        {
            return "Sales";
        }
        else if(depChoice == 2)
        {
            return "Development";
        }
        else if(depChoice == 3)
        {
            return "Accounting";
        }
        else {return"";
        }
    }
   
    //Generate a random password
    private String randomPassword(int length){
       String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%55^&*;+-";
       char[] password= new char[length];
       for(int i=0; i<length; i++){
           int rand= (int) ( Math.random()* passwordSet.length());
           password[i]=passwordSet.charAt(rand);
       }
       return new String (password);
    } 
    
    
    //Set the mail box capacity
    public void setmailBoxCapacity(int capacity){
     this.mailBoxCapacity= capacity;
    }
    
    //Set alternate email
    public void setalternateEmail(String altemail){
     this.alternateEmail=altemail;
    }
    //Change the password
    public void changePassword(String password){
     this.password= password;
    }
    
    public int getmailBoxCapacity(){return mailBoxCapacity;}
    public String getalternateEmail(){return alternateEmail;}
    public String getpassword(){return password;}
    
    public String getinfo(){
        return "DISPLAY NAME " + firstName +" "+ lastName +
           "\nCOMPANY EMAIL :" + email  +
            "\nMAILBOX CAPACITY :" +  mailBoxCapacity + "mb"     ;
    }
}
