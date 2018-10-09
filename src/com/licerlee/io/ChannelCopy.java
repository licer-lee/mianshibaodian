package com.licerlee.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelCopy {

	private static final int BSIZE = 1024;

	public static void main(String[] args) throws IOException {

		// run with java ChannelCopy data.txt data1.txt
		if (args.length != 2) {
			System.out.println("arguments: sourcefile destfile");

			System.exit(1);

		}

		FileChannel in = new FileInputStream(args[0]).getChannel(), out = new FileOutputStream(args[1]).getChannel();
		ByteBuffer bf = ByteBuffer.allocate(BSIZE);
		while (in.read(bf) != -1) {

			bf.flip();
			out.write(bf);
			bf.clear();

		}

	}
}
