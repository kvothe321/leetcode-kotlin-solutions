package problems.datastructuresandalgorithms.arraysandstrings

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test
import kotlin.test.assertContentEquals

class ReverseCharArrayTest {

    @Test
    fun `reverseCharArray correctly revers the array of chars`() {
        val input = charArrayOf('a', 'b', 'c', 'd', 'e')
        val exceptedOutput = charArrayOf('e', 'd', 'c', 'b', 'a')

        reverseCharArray(input)
        assertArrayEquals(input, exceptedOutput)
    }

    @Test
    fun `reverses an array of odd length`() {
        val input = charArrayOf('x', 'y', 'z')
        reverseCharArray(input)
        assertArrayEquals(charArrayOf('z', 'y', 'x'), input)
    }

    @Test
    fun `reverses a single character array`() {
        val input = charArrayOf('k')
        reverseCharArray(input)
        assertArrayEquals(charArrayOf('k'), input)
    }

    @Test
    fun `reverses an empty array`() {
        val input = charArrayOf()
        reverseCharArray(input)
        assertArrayEquals(charArrayOf(), input)
    }
}