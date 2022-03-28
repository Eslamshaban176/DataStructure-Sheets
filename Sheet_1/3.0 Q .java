/*

	Problem 3 Decide whether these statements are True or False.
	a. If O(f(n)) = O(g(n)) then f(n) = g(n)
	b. If f(n) = O(g(n)) and g(n) = O(f(n)) then f(n) = g(n)

		==========================
			solution
		==========================

	a ==> false 
		example : let f(n) = 2n  and g(n) = 3n
		hence f(n) != g(n)

	b ==> false 
		exmple : let f(n) = n    and  g(n) = n+1
		hence f(n) != g(n)

*/