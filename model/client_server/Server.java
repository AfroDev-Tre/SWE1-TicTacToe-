package model.Client_Server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket server;
    private Socket s;
    private DataInputStream input;


    public void open() {
        try {
        ServerSocket server = new ServerSocket(6666);
        Socket s = server.accept();
        
        DataInputStream input = new DataInputStream(s.getInputStream());
        
        DataOutputStream output = new DataOutputStream(s.getOutputStream());  
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String text="", text2="";  
        while(!text.equals("stop")){  
        text=input.readUTF();  
        System.out.println("From Client: "+ text);  
        text2=reader.readLine();  
        output.writeUTF(text2);  
        output.flush();  
        }
        }catch(Exception e){System.out.println(e);}
    }

    // im getting errors here.  would we need to make input, s and server variables 
    // outside of the open() to clear these errors? 
    // i commented them out so I can push
    public void close() {
       // input.close();  
        //s.close();  
        //server.close();
    }
}