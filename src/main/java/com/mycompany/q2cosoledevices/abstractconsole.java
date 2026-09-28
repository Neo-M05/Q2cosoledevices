/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q2cosoledevices;

/**
 *
 * @author Student
 */
public class abstractconsole {
    
    private String deviceType;
    private String storeName;
    private double totalOfsales;
    
    public abstractconsole (String deviceType, String storeName, double totalOfsales){
        this.deviceType = deviceType;
        this.storeName = storeName;
        this.totalOfsales = totalOfsales;
    }
    
    public String getCosoles(){
        return deviceType;
    }
    
    public String getStor(){
        return storeName;
    } 
    
    public double getTotalSales(){
        return totalOfsales;
    }
}
    
    

