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
}