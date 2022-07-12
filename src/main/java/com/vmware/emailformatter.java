package com.vmware;

public class emailformatter {

    public static void main(String args[]){
        if(args[0].split(" ").length > 1){
//            int space = args[0].indexOf(" ");
            args[0] = args[0].substring(0,args[0].indexOf(" "));
        }

        System.out.println(String.format("%s@example.com", args[0]));
    }
}
