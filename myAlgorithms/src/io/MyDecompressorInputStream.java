package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class MyDecompressorInputStream extends InputStream {
	
	

	InputStream in;
	int size ;
	
	public void close()throws IOException{
		in.close();
	}
	
	public MyDecompressorInputStream(InputStream input){
		this.in = input;
	}
	
	public MyDecompressorInputStream() throws FileNotFoundException, IOException {
	in = new ObjectInputStream(new FileInputStream("out.txt"));
	}
	
	
	

	@Override
	public int read(byte[] b) throws IOException {
		in.read(b);
		return -1;
	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}
	



	
	
	

}
