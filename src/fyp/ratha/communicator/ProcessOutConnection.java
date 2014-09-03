package fyp.ratha.communicator;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.microedition.io.StreamConnection;

public class ProcessOutConnection {
	
	private OutputStream outstream;
	
	public ProcessOutConnection(StreamConnection con) {
		
		String sendst="Sample\n";
		String sendst2="Sample2\n";
		System.out.println("sending sampple data.. look at logcat.");
		try {
			outstream=con.openOutputStream();
			outstream.write(sendst.getBytes());
			outstream.write(sendst2.getBytes());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
