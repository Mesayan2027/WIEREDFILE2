package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class tserver {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(9080);
        System.out.println(InetAddress.getLocalHost().getHostAddress());



        while (true) {
            Socket s;
            s= ss.accept();
            DataOutputStream dou=new DataOutputStream(s.getOutputStream());
            DataInputStream din =new DataInputStream(s.getInputStream());
            System.out.println(s);
            Scanner sc =new Scanner(System.in);
            String c=din.readUTF();
            System.out.println(c);
            String a =sc.next();
            dou.writeUTF(a);
            break;
        }
    }
}
