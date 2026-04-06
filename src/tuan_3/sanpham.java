/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan_3;

/**
 *
 * @author Lenovo
 */
public class sanpham {
        String ma, ten, dvt;
        int gia, nam;
        
        
        public sanpham(){
        }
        

        public sanpham(String ma, String ten, String dvt, int gia, int nam){
            this.ma = ma;
            this.ten = ten;
            this.dvt = dvt;
            this.gia = gia;
            this.nam = nam;
        }

        public void in() {
            System.out.println(ma + ";" + ten + ";" + dvt + ";" + gia + ";" + nam);
        }
    
}
