import java.io.*;
import java.net.Socket;

/**
 * Created by Joshua on 1/26/2016.
 */
public class ClientTest {
    private int port;
    private String serverName;

    public ClientTest(int gPort, String gServerName){
        port = gPort;
        serverName = gServerName;
    }

    public void setServerName(String givenServerName) {
        serverName = givenServerName;
    }

    public void setPort(int givenPort) {
        port = givenPort;
    }

    public void activateConnection()
    {
        try
        {
            System.out.println("Connecting to " + serverName + " on port " + port);
            Socket client = new Socket(serverName, port);
            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("Server says " + in.readUTF());
            client.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
