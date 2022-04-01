package com.assisted.project;
import java.util.ArrayList;

public class Emailsearch {
 public static void main(String[] args) {
        
        ArrayList<String> emailid = new ArrayList<String>();
        
        emailid.add("summi.sinha@gmail.com");
        emailid.add("vinay.kumar@gmail.com");
        emailid.add("rummi.ambastha@gmail.com");
        emailid.add("shikha.verma@gmail.com");
        emailid.add("rajesh.ambastha@gmail.com");
        
        
   
        String searcElement = "summi.sinha@gmail.com";
        
                for(int i=0; i<emailid.size(); i++) {
                    
                    System.out.println(emailid.get(i));
                    
                    if(searcElement==emailid.get(i)) {
                        
                        System.out.println("\n");
                        
                        System.out.println("EMAIL ID...." + searcElement + "....FOUND");
                        
                        break;
                        
                    }
                }

    }

}

