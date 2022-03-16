package com.company.map;
import java.util.*;

public class deklarasi_map {
    public static void main(String[] args) {
        Map<String, String> kode = new LinkedHashMap<String, String>();

        kode.put("China", "1C");
        kode.put("Indonesia", "1I");
        kode.put("Perancis", "1P");
        kode.put("Perancis", "1P");                        //data yang duplicate tidak akan ditampikan 2 kali
        kode.put("Swiss", "1S");
        kode.put("Korea Selatan", "1KS");
        kode.put("Malaysia", "1M");

        System.out.println(kode);                         //menampilkan isi dari variabel 'ekspor'
    }
}

