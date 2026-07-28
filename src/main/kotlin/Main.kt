package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("String Examples 2026")
    println()

    val sentence = "kotlin makes coding fun and efficient"
    val shortest = findShortestWord(sentence)

    println("Shortest word: $shortest")
}

fun findShortestWord(input: String): String? {
    // Split on any non-letter character (spaces, punctuation, etc.)
    val words = input
        .split(Regex("[^A-Za-z]+"))
        .filter { it.isNotEmpty() }

    if (words.isEmpty()) {
        return null
    }

    return words.minByOrNull { it.length }
}