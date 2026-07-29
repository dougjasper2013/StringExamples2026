package org.example

fun main() {
    // Test the function using two sample words

    val word1 = "listen"
    val word2 = "silent"

    val word3 = "cats"
    val word4 = "dogs"

    val result1 = areNotAnagrams(word1, word2)

    if (result1) {
        println("\"$word1\" and \"$word2\" are NOT anagrams.")
    }
    else {
        println("\"$word1\" and \"$word2\" ARE anagrams.")
    }

    val result2 = areNotAnagrams(word3, word4)

    if (result2) {
        println("\"$word3\" and \"$word4\" are NOT anagrams.")
    }
    else {
        println("\"$word3\" and \"$word4\" ARE anagrams.")
    }

}

// This function accepts two strings and returns true
// if they are NOT anagrams
// Anagrams are different words that contain the same letters
fun areNotAnagrams(first: String, second: String): Boolean {
    // Step 1 - Convert both strings to all lowercase
    val cleanedFirst = first.lowercase()
    val cleanedSecond = second.lowercase()

    // Step 2 - Sort the letters in both Strings alphabetically
    val sortedFirst = cleanedFirst.toCharArray().sorted()
    val sortedSecond = cleanedSecond.toCharArray().sorted()

    // Step3 - Check if the sorted versions are different
    val result = sortedFirst != sortedSecond

    // Step 4 - Return result
    return result
}