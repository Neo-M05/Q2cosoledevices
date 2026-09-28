/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q2cosoledevices;

/**
 *
 * @author Student
 */
public class ConsoleSales extends abstractconsole {
    
    public ConsoleSales (String deviceType, String storename , int totalOfSales){
        super(deviceType, storename, totalOfSales);
    }
    
    public void printBookingReport(){
        
        System.out.println("The room type:  " + deviceTyp());
        System.out.println("The hotel name: " + getStore());
        System.out.println("The nights booked: " + getTotalSales());
    }
}
    
    
    

