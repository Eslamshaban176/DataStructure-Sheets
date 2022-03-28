/*

	Problem 4 Calculate the run-time efficiency of the following program
	
	1  i = 1
	2  loop (i <= n)
		1  j = 1
		2  loop (j <= n)
			1   k = 1
			2   loop ( k <= n)
				1  print(i, j, k)
				2  k = k + 1
			3    end loop
			4    j = j + 1
		3   end loop
		4   i = i + 1
	3   end loop
	

		==========================
			solution
		==========================


	Answer ==> O(n^3)
	As three nested loops

*/



