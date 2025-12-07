package com.swarupSawant;

import com.swarupSawant.exceptions.ExceptionsDemo;
import com.swarupSawant.generics.GenericList;
import com.swarupSawant.generics.List;
import com.swarupSawant.generics.User;

public class Main {
    public static void main(String[] args) {

        //integer generics..
       GenericList<Integer> list = new GenericList<>();
       list.add(5);
       int num = list.get(0);

       //String generics..
       GenericList<String> names = new GenericList<>();
       names.add("swarup");

       String name = names.get(0);


    }
}