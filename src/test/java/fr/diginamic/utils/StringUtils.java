package fr.diginamic.utils;

public class StringUtils {

	public static int levenshteinDistance(String s1, String s2) {
		if (s1 == null || s2 == null) {
			throw new IllegalArgumentException("Input strings must not be null");
		}

		int len0 = s1.length() + 1;
		int len1 = s2.length() + 1;

		// the array of distances
		int[] cost = new int[len0];
		int[] newcost = new int[len0];

		// initial cost of skipping prefix in String s1
		for (int i = 0; i < len0; i++)
			cost[i] = i;

		// dynamically computing the array of distances

		// transformation cost for each letter in s2
		for (int j = 1; j < len1; j++) {
			// initial cost of skipping prefix in String s2
			newcost[0] = j;

			// transformation cost for each letter in s1
			for (int i = 1; i < len0; i++) {
				// matching current letters in both strings
				int match = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;

				// computing cost for each transformation
				int cost_replace = cost[i - 1] + match;
				int cost_insert = cost[i] + 1;
				int cost_delete = newcost[i - 1] + 1;

				// keep minimum cost
				newcost[i] = Math.min(Math.min(cost_insert, cost_delete), cost_replace);
			}

			// swap cost/newcost arrays
			int[] swap = cost;
			cost = newcost;
			newcost = swap;
		}

		// the distance is the cost for transforming all letters in both strings
		return cost[len0 - 1];
	}
}