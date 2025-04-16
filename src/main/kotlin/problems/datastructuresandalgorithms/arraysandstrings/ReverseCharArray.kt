package problems.datastructuresandalgorithms.arraysandstrings

/*
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * Example 2:
 *
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 *
 * Constraints:
 *
 *     1 <= s.length <= 105
 *     s[i] is a printable ascii character.
 */

fun reverseCharArray(s: CharArray) {
    var start = 0
    var end = s.size - 1

    while (start < end) {
        s.swap(start, end)
        start++
        end--
    }
}

private fun CharArray.swap(i: Int, j: Int) {
    this[i] = this[j].also { this[j] = this[i] }
}


fun main() {
    val input = charArrayOf('a', 'b', 'c', 'd', 'e')
    println("Initial string: ${input.joinToString()}")
    reverseCharArray(input)
    println("Reverted string: ${input.joinToString()}")
}