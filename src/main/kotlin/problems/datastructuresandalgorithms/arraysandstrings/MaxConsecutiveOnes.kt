package problems.datastructuresandalgorithms.arraysandstrings

/*
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * Output: 6
 * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 *
 * Example 2:
 *
 * Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
 * Output: 10
 * Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 *
 *
 * Constraints:
 *
 *     1 <= nums.length <= 10^5
 *     nums[i] is either 0 or 1.
 *     0 <= k <= nums.length
 */

fun longestOnes(nums: IntArray, k: Int): Int {
    var startPosition = 0
    var remainingFlips = k

    for (endPosition in nums.indices) {
        if (nums[endPosition] == 0) {
            remainingFlips--
        }

        if (remainingFlips < 0) {
            remainingFlips += 1 - nums[startPosition++]
        }
    }

    return nums.size - startPosition
}

fun main() {
    val input = intArrayOf(0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1)
    val k = 3
    println("Maximum numbers of consecutive 1's when flipping k 0's is: ${longestOnes(input, k)}")
}