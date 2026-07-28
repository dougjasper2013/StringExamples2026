package org.example

fun main() {
    val str1 = "Hello World"
    val str2 = "Paper"
    val str3 = "Windy"

    val result1 = doesFirstLetterExist(str1, str2)

    if (result1) {
        println("The first letter of the second string" +
                " EXISTS in the first string.")
    }
    else {
        println("The first letter of the second string" +
                " DOES NOT EXIST in the first string.")
    }

    val result2 = doesFirstLetterExist(str1, str3)

    if (result2) {
        println("The first letter of the second string" +
                " EXISTS in the first string.")
    }
    else {
        println("The first letter of the second string" +
                " DOES NOT EXIST in the first string.")
    }
}

fun doesFirstLetterExist(first: String, second: String): Boolean {

    // Handle empty string edge cases
    if (second.isEmpty()) {
        return false
    }

    // Take the first character of the second string
    val firstCharOfSecond = second[0]

    // Check if it exists in the first string using the contains method
    return first.contains(firstCharOfSecond, ignoreCase = true)

}