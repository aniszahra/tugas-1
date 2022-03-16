package com.company.program_travel;
import java.util.*;
import java.util.Scanner;

public class travel {
    public static void main(String[] args){
        System.out.println("PASSENGERS's TICKET");
        System.out.println("NGURAH RAI INTERNATIONAL AIRPORT BASE");
        System.out.println("PLEASE CHOOSE YOUR DESTINATION");

        System.out.println("DOMESTIC DESTINATIONS : ");
        Set<String> domestik = new LinkedHashSet<String>();
        domestik.add("Jakarta");
        domestik.add("Denpasar");
        domestik.add("Yogyakarta");
        domestik.add("Medan");
        domestik.add("Balikpapan");
        domestik.add("Surabaya");
        domestik.add("Jayapura");
        System.out.println(domestik);

        System.out.println("\nINTERNATIONAL DESTINATIONS : ");
        List<String> internasional = new LinkedList<String>();
        internasional.add("Singapura");
        internasional.add("Kuala Lumpur");
        internasional.add("Manila");
        internasional.add("Taiwan");
        internasional.add("Bangkok");
        internasional.add("Taipei");
        internasional.add("Paris");
        internasional.add("Bern");

        System.out.println(internasional);

        System.out.println("\nDESTINATIONS's CODE : ");
        Map<String, String> kode = new LinkedHashMap<String, String>();
        kode.put("\n, Jakarta", "25\n");
        kode.put("Denpasar", "20\n");
        kode.put("Yogyakarta", "27\n");
        kode.put("Medan", "23\n");
        kode.put("Balikpapan", "24\n");
        kode.put("Surabaya", "26\n");
        kode.put("Jayapura", "29\n");
        kode.put("Singapura", "20\n");
        kode.put("Kuala Lumpur", "13\n");
        kode.put("Manila", "65\n");
        kode.put("Taiwan", "41\n");
        kode.put("Bangkok", "75\n");
        kode.put("Taipei", "81\n");
        kode.put("Paris", "89\n");
        kode.put("Bern", "92\n");

        System.out.println(kode);

        System.out.println("\n_____________________________");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME : ");
        String nama = sc.nextLine();

        System.out.println("ENTER YOUR DESTINATION's CODE : ");
        int code = sc.nextInt();
        int price = 0;

        if (code == 25){
            price=2500000;
        }else if (code == 20){
            price=700000;
        }else if(code == 27){
            price=1400000;
        }else if(code == 23){
            price=3000000;
        }else if(code == 24){
            price=3200000;
        }else if(code == 26){
            price=590000;
        }else if(code == 29){
            price=750000;
        }else if(code == 20){
            price=4000000;
        }else if(code == 13){
            price=3600000;
        }else if(code == 65){
            price=3400000;
        }else if(code == 41){
            price=4400000;
        }else if(code == 75){
            price=4900000;
        }else if (code == 81){
            price=5500000;
        }else if (code == 89){
            price=6780000;
        }else if (code == 92){
            price=6700000;
        }else{
            System.out.println("THE CODE YOU ENTERED ISN'T AVAILABLE!");
        }

        System.out.println("ENTER THE NUMBERS OF TICKET : ");
        int jumlah = sc.nextInt();
        int total = price * jumlah ;
        System.out.println("_____________________________");

        System.out.println("\n=============================");
        System.out.println("TICKET BOOKING DETAILS");
        System.out.println("PASSENGER : "+nama);
        System.out.println("QUANTITY  : "+jumlah);
        System.out.println("TOTAL     : "+total);
        System.out.println("THANK YOU FOR TRUSTING US");
        System.out.println("===============================");
    }
}
