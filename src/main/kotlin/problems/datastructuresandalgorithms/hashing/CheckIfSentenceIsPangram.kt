package problems.datastructuresandalgorithms.hashing

/*
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 *
 *
 * Example 1:
 *
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 *
 * Example 2:
 *
 * Input: sentence = "leetcode"
 * Output: false
 *
 *
 * Constraints:
 *
 *     1 <= sentence.length <= 1000
 *     sentence consists of lowercase English letters.
 */

const val TOTAL_CHARACTERS_IN_THE_ENGLISH_ALPHABET = 26

fun checkIfPangram(sentence: String): Boolean {
    if (sentence.length < TOTAL_CHARACTERS_IN_THE_ENGLISH_ALPHABET) {
        return false
    }

    val foundCharacters = hashSetOf<Char>()

    for (i in 0 until sentence.length) {
        foundCharacters.add(sentence[i])

        if (foundCharacters.size == TOTAL_CHARACTERS_IN_THE_ENGLISH_ALPHABET) {
            return true
        }
    }

    return false
}

// This is a just a better solution, but slightly less readable
fun checkIfPangram2(sentence: String): Boolean {
    val booleanArray = BooleanArray(TOTAL_CHARACTERS_IN_THE_ENGLISH_ALPHABET)
    var uniqueCharsFoundCounter = 0

    for (i in 0 until sentence.length) {
        if (booleanArray[sentence[i] - 'a'].not()) {
            booleanArray[sentence[i] - 'a'] = true
            uniqueCharsFoundCounter++
        }
    }

    return uniqueCharsFoundCounter == TOTAL_CHARACTERS_IN_THE_ENGLISH_ALPHABET
}

fun main() {
    val input = "thequickbrownfoxjumpsoverthelazydog"
    println("Pangram status: ${checkIfPangram(input)}")
}