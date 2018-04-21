package coursework;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientTalker 
{
    Socket server;
    ObjectOutputStream outToServer;
    ObjectInputStream inFromServer;
    
    public ClientTalker()
    {
        try
        {
            server = new Socket("localhost",9090);
            outToServer = new ObjectOutputStream(server.getOutputStream());
            inFromServer = new ObjectInputStream(server.getInputStream());
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    public void sendSong(String filename, String path)
    {
        try
        {
            
            //Send file
            File myFile = new File(path);
            byte[] mybytearray = new byte[(int) myFile.length()];

            FileInputStream fis = new FileInputStream(myFile);
            BufferedInputStream bis = new BufferedInputStream(fis);
            //bis.read(mybytearray, 0, mybytearray.length);

            DataInputStream dis = new DataInputStream(bis);   
            dis.readFully(mybytearray, 0, mybytearray.length);

            

            //Sending file name and file size to the server
            outToServer.writeObject("SENDSONG");
            outToServer.writeObject(filename);
            
            OutputStream os = server.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);   
            dos.writeLong(mybytearray.length);
            dos.write(mybytearray, 0, mybytearray.length);   
            dos.flush();
            dos.close();
            //Sending file data to the server
            os.write(mybytearray, 0, mybytearray.length);
            fis.close();
            dis.close();
            bis.close();
            os.flush();
            os.close();
            
           
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    //Tell server client is logging out
    public void logOut()
    {
        String command = "LOGOUT";
        try
        {
            outToServer.writeObject(command);
            server.close();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    //Returns list of user data, 0 = all users, 1 = online, 2 = friends
    public ArrayList<String> clientGetUsers(int selection)
    {
        ArrayList<String> onlineUsers = null;
        String command = null;
        Object reply = null;
        if (selection == 0)
        {
            command = "GETALL";
        }
        if (selection == 1)
        {
            command = "GETONLINE";
        }
        try
        {
            outToServer.writeObject(command);
            reply = inFromServer.readObject();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        onlineUsers = (ArrayList<String>) reply;
        return onlineUsers;
    }
    
    //Sends user data to either log in or register to server, false = register, true = log in
    public Boolean clientRegister(UserData theirData, Boolean existing)
    {
        Object in = null;
        String reply = null;
        String command = null;
        if (existing == false)
        {
            command = "REGISTER";
        }
        if (existing == true)
        {
            command = "LOGIN";
        }
        try
        {
            outToServer.writeObject(command);
            outToServer.writeObject(theirData);
            in = inFromServer.readObject();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        reply = (String) in;
        if(reply.equals("SUCCESS"))
        {
            return true;
        }
        if (reply.equals("FAILURE"))
        {
            return false;
        }
        return false;
    }
    
    //Send username to server and recieve user data
    public UserData getUserdata(String username)
    {
        UserData desiredData = null;
        Object reply = null;
        try
        {
            outToServer.writeObject("GETDATA");
            outToServer.writeObject(username);
            reply = inFromServer.readObject();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        desiredData = (UserData) reply;
        return desiredData;
    }
    
    public void requestFriendship(String username)
    {
        try
        {
            outToServer.writeObject("REQUESTFRIEND");
            outToServer.writeObject(username);
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    public void replyRequest(String username, Boolean accepted)
    {
        try
        {
            String message = null;
            if (accepted)
            {
                message = "REPLYYES";
            }
            else
            {
                message = "REPLYNO";
            }
            outToServer.writeObject(message);
            outToServer.writeObject(username);
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    public void makePost(String post)
    {
        try
        {
            outToServer.writeObject("MAKEPOST");
            outToServer.writeObject(post);
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    public ArrayList<String> getPosts()
    {
        ArrayList<String> posts = null;
        Object in = null;
        try
        {
            outToServer.writeObject("GETPOSTS");
            in = inFromServer.readObject();
            posts = (ArrayList<String>) in;
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        return posts;
    }
    
    public ArrayList<String> getRequests()
    {
        ArrayList<String> requests = null;
        Object in = null;
        try
        {
            outToServer.writeObject("GETREQUESTS");
            in = inFromServer.readObject();
            requests = (ArrayList<String>) in;
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        return requests;
    }
}
