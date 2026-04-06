/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan_3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class giangvien {
    String ten,ms;
    int nam;
    float luong;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten= sc.nextLine();
        
        System.out.println("Nhap ma so: ");
        ms= sc.nextLine();
        
        System.out.println("Nhap nam day so: ");
        nam=Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhap luong day so: ");
        luong=Float.parseFloat(sc.nextLine());   
    }
    
    public void xuat(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ban ten la:"+ten +"Ma so"+ms+"Nam than day:"+nam+"Luong:"+luong);
    }
            
}
