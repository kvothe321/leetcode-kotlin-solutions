package problems.datastructuresandalgorithms.arraysandstrings

/*
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 *
 * Example 1:
 *
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 *
 * Example 2:
 *
 * Input: nums = [5], k = 1
 * Output: 5.00000
 *
 *
 * Constraints:
 *
 *     n == nums.length
 *     1 <= k <= n <= 10^5
 *     -10^4 <= nums[i] <= 10^4
 *
 */

fun findMaxAverage(nums: IntArray, k: Int): Double {
    var subArraySum = 0.0
    for (i in 0 until k) {
        subArraySum += nums[i]
    }

    var maxAverage = subArraySum

    for (i in k until nums.size) {
        subArraySum = subArraySum + nums[i] - nums[i - k]

        maxAverage = maxAverage.coerceAtLeast(subArraySum)
    }

    return maxAverage / k
}

fun main() {
    val input = intArrayOf(1,12,-5,-6,50,3)
    val k = 4
    println("Max average: ${findMaxAverage(input, k)}")
}