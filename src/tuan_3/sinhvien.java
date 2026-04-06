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
public class sinhvien {
        String ms, ten;
        int namsinh;

        public sinhvien() {
        }//0 co tham so

        public sinhvien(String ms, String ten, int namsinh) {
            this.ms = ms;
            this.namsinh = namsinh;
            this.ten = ten;
        }//co tham so

        public void nhap() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Nhap ma so sinh vien: ");
            ms = sc.nextLine();

            System.out.println("Nhap ten :");
            ten = sc.nextLine();

            System.out.println("Nhap nam sinh :");
            namsinh = Integer.parseInt(sc.nextLine());
        }

        public int tinhtuoi(sinhvien t) {
            return 2026 - t.namsinh;
        }

        public void xuat() {
            System.out.println("Ma so cua ban :" + ms + "\tTen cua ban la:" + ten + "Tuoi hien tai la:" + tinhtuoi(this));
        }
        
}
