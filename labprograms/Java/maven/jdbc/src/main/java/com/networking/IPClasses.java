package com.networking;

import java.util.Scanner ;

public class IPClasses {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        String ip ;
        System.out.println("Enter IP address aith dots");
        ip = sc.nextLine();
        String octet[] = ip.split("\\.");

        if(octet.length!=4)
            System.out.println("Invalid IP address!");
        
            int firstoctet = Integer.parseInt(octet[0]);

            if(firstoctet>=1 && firstoctet<=126){
                System.out.println("Class A ");
                System.out.println("Network ID: " +octet[0]+"."+octet[1]+"."+octet[2]);
                System.out.println("Host ID :" + octet[3]);
                System.out.println("Subnet Masking : 255.0.0.0");
            }
            else if(firstoctet>=127 && firstoctet<=191){
                System.out.println("Class B ");
                System.out.println("Network ID: " +octet[0]+"."+octet[1]);
                System.out.println("Host ID :" + octet[2]+"."+octet[3]);
                System.out.println("Subnet Masking : 255.255.0.0");
            }
            else if(firstoctet>=192 && firstoctet<=223){
                System.out.println("Class C ");
                System.out.println("Network ID: " +octet[0]+"."+octet[1]);
                System.out.println("Host ID :" + octet[2]+"."+octet[3]);
                System.out.println("Subnet Masking : 255.255.255.0");
            }
            else if(firstoctet>=224 && firstoctet<=239){
                System.out.println("Class D ");
                System.out.println("Network ID: Multicasting ");
                System.out.println("Subnet Masking : 255.255.255.0");
            }
            else if(firstoctet>=240 && firstoctet<=255){
                System.out.println("Class E ");
                System.out.println("Network ID: Reserved ");
                System.out.println("Subnet Masking : 255.255.255.0");
            }
            else
                System.out.println("Invalid IP address");
        
    }
}
