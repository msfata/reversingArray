package com.networking;

import java.util.Arrays;

public class UniqueValueArray {
	static void unique_array(int[] originalArr) {
		/* reading original array */
		System.out.println("Original Array : ");
		for (int i = 0; i < originalArr.length; i++) {
			System.out.print(originalArr[i] + "\t");
		}

		// Assuming all elements in input array are unique

		int arrSize = originalArr.length;

		// Comparing each element with all other elements

		for (int i = 0; i < arrSize; i++) {
			for (int j = i + 1; j < arrSize; j++) {
				// If any two elements are found equal

				if (originalArr[i] == originalArr[j]) {
					// Replace duplicate element with last unique element

					originalArr[j] = originalArr[arrSize - 1];

					arrSize--;

					j--;
				}
			}
		}

		// Copying only unique elements of my_array into array1

		int[] uniqueArray = Arrays.copyOf(originalArr, arrSize);

		// Printing array Without Duplicates
		System.out.println();

		System.out.println("Array with unique values : ");

		for (int i = 0; i < uniqueArray.length; i++) {
			System.out.print(uniqueArray[i] + "\t");
		}

		System.out.println();

		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		unique_array(new int[] { 0, 1, 2, 3, 4, 5, 0, 5, 5, 4, 2, 3, 1, 0 });

	}
}
