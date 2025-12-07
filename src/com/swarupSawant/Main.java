package com.swarupSawant;

import com.swarupSawant.exceptions.ExceptionsDemo;
import com.swarupSawant.generics.GenericList;
import com.swarupSawant.generics.List;
import com.swarupSawant.generics.User;

public class Main {
    public static void main(String[] args) {
       var list = new List();
       list.add(1);
       list.add("1");
       list.add(new User());

       int number = (int)list.get(0);
    }
}