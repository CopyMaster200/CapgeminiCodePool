/*
 * Candidate: 
 * Click `Run` to execute the snippet below!
 */
package com.gs.prog;

import java.util.HashMap;
import java.util.Map;

/* 
* Problem Statement: 
Given a string array, each element containing a line of apache log file. Every line starts with an IP address.
Write a program that returns the IP address which appeared most of the times from the log file.

*/

class MaxIPInLogs {
	public static void main(String args[]) {
		String str = "123.123.123.123 - - [26/Apr/2000:00:23:48 -0400] \"GET /pics/wpaper.gif HTTP/1.0\" 200 6248 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
				+ "123.123.123.123 - - [26/Apr/2000:00:23:47 -0400] \"GET /asctortf/ HTTP/1.0\" 200 8130 \"http:// search.netscape.com/Computers/Data_Formats/Document/Text/RTF\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
				+ "123.123.123.124 - - [26/Apr/2000:00:23:48 -0400] \"GET /pics/5star2000.gif HTTP/1.0\" 200 4005 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
				+ "123.123.123.123 - - [26/Apr/2000:00:23:50 -0400] \"GET /pics/5star.gif HTTP/1.0\" 404 1031 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
				+ "123.123.123.126 - - [26/Apr/2000:00:23:51 -0400] \"GET /pics/a2hlogo.jpg HTTP/1.0\" 200 4282 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
				+ "123.123.123.123 - - [26/Apr/2000:00:23:51 -0400] \"GET /cgi-bin/newcount?jafsof3&width=4&font=digital&noshow HTTP/1.0\" 200 36 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n";

		String[] strArr = str.split("\n");
		HashMap<String, Integer> map = new HashMap<>();
		for (String s : strArr) {
			if (map.containsKey(s.split(" - - ")[0])) {
				map.put(s.split(" - - ")[0], map.get(s.split(" - - ")[0]) + 1);
			} else {
				map.put(s.split(" - - ")[0], 1);
			}
		}
		int max = 0;
		String maxIP = "";
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry);
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxIP = entry.getKey();
			}
		}

		System.out.println("IP address which appeared most of the times:" + maxIP);
	}
}