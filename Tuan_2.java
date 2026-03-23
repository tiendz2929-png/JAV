/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuan_2;


import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tuan_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    
        
        Scanner sc =new Scanner(System.in);
            
        int n=sc.nextInt();
        int[] a=new int[n];
        
        Nhapmang(a,n,sc);
        Xuatmang(a,n);
        tongmang(a,n);
        lonnhat_nhonhat(a,n);
        sapxep(a,n);
    }
    
    public static void Nhapmang(int[] a, int n,Scanner sc)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Nhap so nguyen bat ky vao:");
            a[i] =sc.nextInt();
        }
    }
    public static void Xuatmang(int[] a,int n)
    {
        int i;
        for(i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
    
    public static void tongmang(int[] a,int n)
    {
        int tong=0,i;
        for(i=0;i<n;i++)
        {
            tong=tong+a[i];
        }
            
    }
            
    public static void lonnhat_nhonhat(int[] a,int n)
    {
        int max=0;
        int min=0,i;
        for(i=1;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
            else
                min=a[i];
        }
       System.out.println("So lon nhat: "+max);
       System.out.println("So nho nhat: "+min);
    } 
    
    public static void sapxep(int[]a,int n)
    {
        int thu,i,j;
        for(i=0;i<n-1;i++)
        {
          for(j=i+1;j<n;j++)
          {
              if(a[i]>a[j])
              {
                thu=a[i];
                a[i]=a[j];
                a[j]=thu;
              }

          }
        }
    }       
}
