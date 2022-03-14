package Datastructure;

public class searchword {
	// Java program to implement Binary Search for strings
	
		// Returns index of x if it is present in arr[],
		// else return -1
		static int binarysearchword(String[] arr, String x)
		{
			int l = 0, r = arr.length - 1;
			while (l <= r) {
				int m = l + (r - l) / 2;

				int res = x.compareTo(arr[m]);

				// Check if x is present at mid
				if (res == 0)
					return m;

				// If x greater, ignore left half
				if (res > 0)
					l = m + 1;

				// If x is smaller, ignore right half
				else
					r = m - 1;
			}

			return -1;
		}

		// Driver method to test above
		public static void main(String []args)
		{
			String[] arr = { "passion", "power", "respect", "practice"};
			String x = "respect";
			int result =binarysearchword(arr, x);

			if (result == -1)
				System.out.println("word not present");
			else
				System.out.println("word found at "
								+ "index " + result);
		}
	}


