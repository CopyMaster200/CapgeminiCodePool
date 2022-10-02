package com.gs.prog;

/* 
2. Permutation combination :If a child is climbing a stair case with â€œnâ€� steps, 
find the maximum number of possibilities (how many different ways he can climb the stair case)

A guy uses elevator to reach his flat. But unfortunately elevator is not working today and he became sad. 
Suddenly God came and made the stairs magical, such that he can jump on it in a magical way.
 Initially he can take 1 or 2 steps. If he jumps “x” steps at a time then in the next step 
 he can climb either x or x+1or x+2…… steps depending on his choice and he must reach exactly on n'th step. 
 Print all possibilities to reach his flat by staircase.
*/

class StairCase {
	static int countWays(int n) {
		if (n <= 1)
			return n;
		return countWays(n - 1) + countWays(n - 2);
	}

	static int stairs(int s) {
		return countWays(s + 1);
	}

	public static void main(String args[]) {
		int s = 4;
		System.out.println("Number of ways = " + stairs(s));
	}
}
