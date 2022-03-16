package com.company.set;
import java.util.*;

public class deklarasi_set {
    public static void main(String[] args){
        Set<String> kota = new LinkedHashSet<String>(); //isi variabel set ditampilkan berdasarkan perintah user

        //memasukkan data
        kota.add("Jakarta");
        kota.add("Beijing");
        kota.add("Singapura");
        kota.add("Bangkok");
        kota.add("Manila");
        kota.add("Kuala Lumpur");
        kota.add("Jakarta");                            //set hanya menampilkan sekali data yang duplikat
        kota.add("Bern");

        kota.remove("Beijing");                    //menghapus/tidak menampilkan nilai variabel "Beijing"

        System.out.println(kota);                       //mencetak isi variabel 'kota'
    }
}
