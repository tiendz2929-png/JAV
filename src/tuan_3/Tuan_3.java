/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuan_3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tuan_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //bai 1
            Scanner sc = new Scanner(System.in);

            Person n1 = new Person();
            Person n2 = new Person();

            System.out.println("Nguoi thu nhat: ");
            n1.input();

            System.out.println("Nguoi thu 2: ");
            n2.input();

            n1.sayHello();
            n2.sayHello();
      //bai2
              sinhvien s2 = new sinhvien();              
              sinhvien s1 = new sinhvien("22500845", "Dinh Manh Tien", 2007);

              s1.xuat();
              s2.xuat();
              
      //bai3    


        sanpham sp1 = new sanpham("HOP", "Socola", "", 420000, 2025);
        sanpham sp2 = new sanpham("DMT", "Matcha", "", 60000, 2026);
        sanpham sp3 = new sanpham("HPD", "Milk", "", 24000, 204);

        System.out.println("--DANH SACH SAN PHAM--");
        sp1.in();
        sp2.in();
        sp3.in();

        int a = 3, b = 7, c = 10;
        float tong = sp1.gia * a + sp2.gia * b + sp3.gia * c;
        System.out.println("Tong so tien cho hoa don:" + tong);
        
        
        //giangvien
       giangvien bc =new giangvien();
       
       System.out.println("Chỗ nhập thông tin giang vien ");
       bc.nhap();
       
       System.out.println("Đây là thông tin của bạn");
       bc.xuat();
       
       
       //toa do
       
       toado s=new toado();
       
       System.out.println("Nhap x1:");
        int x1 = s.x1;
       
       System.out.println("Nhap x2");
        int x2 = s.x2;
        
       System.out.println("Nhap y1:");
        int y1 = s.y1;
       
       System.out.println("Nhap y2");
        int y2 = s.y2;
        
       s.xuat();
       
       s.khoangcach(s);
    }
    
}
