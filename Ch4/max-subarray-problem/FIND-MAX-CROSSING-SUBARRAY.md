# Pseudocode


        FIND-MAX-CROSSING-SUBARRAY(A, low, mid, high)
        left-sum = -INF
        sum = 0
            for i = mid downto low
	          sum = sum + A[i]
	          if sum > left-sum
		            left-sum = sum
		            max-left = i
        right-sum = -INF
        sum = 0
        for j = mid + 1 to high
	        sum = sum + A[j]
	        if sum > right-sum
		        right-sum = sum
		        max-right = j
        return(max-left, max-right, left-sum + right-sum)
