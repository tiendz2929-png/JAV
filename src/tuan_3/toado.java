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
public class toado {
    int x1,x2,y1,y2;
    
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap x1: ");
        x1=Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhap y1:");
        y1=Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhap x2:");
        x2=Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhap y2:");
        y2=Integer.parseInt(sc.nextLine());
    }
    public void xuat(){
        System.out.println("("+x1+","+x2+";"+y1+","+y2);
    }
    
    public int khoangcach(toado kc){
        return (int) Math.sqrt(
        (kc.x2-kc.x1)*(kc.y2-kc.y1)+
        (kc.x2-kc.x1)*(kc.y2-kc.y1)
        );
    }
}