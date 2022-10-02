package com.gs.inbuilt;

import java.util.Base64;

public class Base64EncodeDecodeDemo {
	public static void main(String[] args) {

		basicStringEncodingDecoding();
		urlEncoding();
	}

	private static void basicStringEncodingDecoding() {
		/*
		 * The encoder maps the input to a set of characters in the A-Za-z0-9+/
		 * character set. So, the decoder rejects any characters outside of this set.
		 */

		String originalInput = "test input";
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
		System.out.println("After encoded: " + encodedString);

		byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
		String decodedString = new String(decodedBytes);
		System.out.println("After decoded: " + decodedString);
	}

	private static void urlEncoding() {
		String originalURL = "https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java";
		String encodedUrl = Base64.getUrlEncoder().encodeToString(originalURL.getBytes());
		System.out.println(encodedUrl);

		byte[] decodedBytes = Base64.getUrlDecoder().decode(encodedUrl);
		String decodedUrl = new String(decodedBytes);
		System.out.println(decodedUrl);
	}

}
