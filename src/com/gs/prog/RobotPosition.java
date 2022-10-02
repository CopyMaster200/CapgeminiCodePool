package com.gs.prog;

/* 
A robot moves on a grid. The grid has a X axis and Y axis. The robot can take the following commands:
L - The robot moves one position left on X axis.
R - The robot moves one position right on X axis.
U - The robot moves one position up on Y axis.
D - The robot moves one position down on Y axis.

Considering the robot is at position 0,0 When given a String like RRULDDDLR, what is the final location of the robot on the grid?
*/

class RobotPosition {
	public static void main(String[] args) {
		String input = "RRULDDDLR";
		robotPosition(input.toUpperCase());
	}

	private static void robotPosition(String input) {
		int x = 0, y = 0;
		char ch = input.charAt(0);
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			if (ch == 'L') {
				x--;
			} else if (ch == 'R') {
				x++;
			} else if (ch == 'U') {
				y++;
			} else if (ch == 'D') {
				y--;
			} else {
				throw new IllegalStateException(
						"The input sequence was not valid. It will allow only characters - L/R/U/D");
			}
		}
		System.out.println("{" + x + ":" + y + "}");
	}
}