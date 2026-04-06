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
public class Person {
    
        String id, name, addr;

        public void input() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Nhap id cua ban vao: ");
            id = sc.nextLine();

            System.out.println("Nhap ten cua ban: ");
            name = sc.nextLine();

            System.out.println("Nhap dia chi vao: ");
            addr = sc.nextLine();
        }

        public void sayHello() {
            System.out.println("Toi la: " + name + ".Hello");
        }
}
