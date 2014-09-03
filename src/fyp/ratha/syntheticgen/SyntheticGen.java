package fyp.ratha.syntheticgen;

import java.io.OutputStream;
import fyp.ratha.communicator.WaitThread;



public class SyntheticGen {
	public static OutputStream out;
	
	
	public static void main(String[] args){
		new Thread(new WaitThread()).start();
	}

	
}

