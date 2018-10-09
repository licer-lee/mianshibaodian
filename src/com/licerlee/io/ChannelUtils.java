package com.licerlee.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.Channel;

public abstract class ChannelUtils {

	public static void main(String[] args) {
		
	}

	@SuppressWarnings("resource")
	public static synchronized Channel getChannel(String file) throws FileNotFoundException{
		return new FileInputStream(file).getChannel();
		
	}

}


