package com.licerlee.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {

	private static final int BSIZE = 1024;

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {
			FileChannel fc = new FileOutputStream("data.txt").getChannel();
			fc.write(ByteBuffer.wrap("some text".getBytes()));
			fc.close();

			fc = new RandomAccessFile("data.txt", "rw").getChannel();
			fc.position(fc.size());
			fc.write(ByteBuffer.wrap("some more".getBytes()));
			fc.close();

			fc = new FileInputStream("data.txt").getChannel();
			ByteBuffer bf = ByteBuffer.allocate(BSIZE);
			fc.read(bf);
			bf.flip(); // 必须有
			while (bf.hasRemaining())
				System.out.print((char) bf.get());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
