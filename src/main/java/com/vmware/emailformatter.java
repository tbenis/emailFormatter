package com.vmware;

public class emailformatter {

    public static void main(String args[]){

/* Test with these Outputs:
* "Jon Snow" jon@thewall.com prints Jon Snow <jon@thewall.com>

    Cersei cersei@redkeep.com prints Cersei <cersei@redkeep.com>

    No input prints Please specify a name and email

    Robert prints Please specify an email for Robert

    Renly renly@example.com extraArg prints Renly <renly@example.com>
* */

//        if(args[0].split(" ").length > 1){
//            args[0] = args[0].substring(0,args[0].indexOf(" "));
//        }
        if(args.length < 1) System.out.println("Please specify a name and email");
        System.out.println(args[0]);
        System.out.println(String.format("<%s>", args[1]));
    }
}
