import java.io.*;
import java.net.*;
import java.util.*;

public class MainClass {
	static DatagramSocket server;

	public static void listenForInput () {
		try {
			InetAddress address = InetAddress.getByName("172.16.0.50");
			DatagramSocket socket = new DatagramSocket();
			Scanner 
			byte[] buf = scan.nextLine().getBytes();
			DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 667);
			socket.send(packet);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SocketException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void listen () {
		while (true) {
			try
			{
				byte[] b = new byte[1024];
				DatagramPacket r = new DatagramPacket(b, b.length);
				server.receive(r);
				String str = new String(r.getData());
				System.out.println(str);
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main (String[] args) {
		try
		{
			server = new DatagramSocket(666);
			scan = new Scanner(System.in);
			listenForInput();
			listen();
		}
		catch (SocketException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
