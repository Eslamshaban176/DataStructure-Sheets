/*

	Problem 5 If the algorithm dolT has an efficiency factor of 5n,
	calculate the run-time efficiency of the following program

	1  i = 1
	2  loop (i <= n)
		1  j = 1
		2  loop( j < n )
			1  doIt(...)
			2  j = j + 1
		3   end loop
		4   i = i + 1
	3   end loop

		===========================
			solution
		===========================
	Answer ==>  O(5n^3)
	As nested loop 
	doIt(...) has   5n  and two loop have n^2

*/