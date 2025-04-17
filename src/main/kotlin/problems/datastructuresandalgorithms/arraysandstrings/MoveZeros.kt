package problems.datastructuresandalgorithms.arraysandstrings

/*
 * Problem: Move Zeroes
 * Description:
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements. Do this in-place (no extra array) with minimal operations.
 *
 * Example:
 * Input:
 * nums = [0, 1, 0, 3, 12]
 * Output:
 * [1, 3, 12, 0, 0]
 */

fun moveZeros(nums: IntArray) {
    var insertPosition = 0

    for (i in nums.indices) {
        if (nums[i] != 0) {
            nums[insertPosition] = nums[i]
            if (i != insertPosition) {
                nums[i] = 0
            }
            insertPosition++
        }
    }
}

fun main() {
    val input = intArrayOf(0, 1, 0, 3, 12)
    println("Initial array: ${input.joinToString()}")
    moveZeros(input)
    println("Array with 0's moved at the end: ${input.joinToString()}")
}