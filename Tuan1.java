/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuan_1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tuan_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       bai1();
       bai2();
       bai3();
       bai4();
    }
        public static void bai1()
    {
        System.out.println("Hello Word");    
    }
    
    public static void bai2()
    {
       String hoten;
       int namsinh;
       
       Scanner sc =new Scanner (System.in);
       System.out.println("Nhap ten ban");
       hoten = sc.nextLine();
       
       System.out.println("Nhap nam sinh: ");
       namsinh = Integer.parseInt(sc.nextLine());
       System.out.print("Ho te cua ban: " + hoten +"Tuoi cua ban la:" + (2026-namsinh));
    }        
    
        public static void bai3()
    {
       String hoten;
       float toan,ly,anh,dtb;
       
       Scanner sc =new Scanner(System.in);
       System.out.print("Nhap ten ban");
       hoten = sc.nextLine();
       
       System.out.print("Nhap diem toan: ");
       toan = Float.parseFloat(sc.nextLine());
       
       System.out.print("Nhap diem ly: ");
       ly = Float.parseFloat(sc.nextLine());
       
       System.out.println("Nhap diem anh: ");
       anh = Float.parseFloat(sc.nextLine());
      
       dtb=((toan*0.2f+ly*0.2f+anh*0.2f)/3);
       dtb = (float)Math.round(dtb * 100) / 100;
    }
    
        
       public static void bai4()
    {
       String hoten;
       float toan,ly,anh,dtb;
       int gia,sl,qua,nl;
       float gg,tt;       
       
       Scanner sc =new Scanner (System.in);
       System.out.print("Nhap ten khach hang ban");
       hoten =sc.nextLine();
       
       
       System.out.println("Nhap so luong vao: ");
       sl = Integer.parseInt(sc.nextLine());
       
       System.out.println("Nhap so luong qua vao: ");
       qua = Integer.parseInt(sc.nextLine());
       
       System.out.println("Nhap so luong vao: ");
       sl = Integer.parseInt(sc.nextLine());
       nl=sl / 5;
       System.out.println("So luong qua ban nhan duoc la:" + nl);
       
       gg=sl % 5;
       System.out.println("So luong qua ban nhan duoc la:" +gg);
       
       tt= sl*2035 - gg % 5;
       System.out.print("So tien ban ban phai tra la:"  + tt);
    }
}
