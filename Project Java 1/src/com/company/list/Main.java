package com.company.list;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> password = new ArrayList<String>();

        password.add("11029");                           //memasukkan data
        password.add("87221");
        password.add("89221");
        password.add(1,"45894");

        System.out.println(password.get(1));            //mencetak indeks ke-1
    }
}
