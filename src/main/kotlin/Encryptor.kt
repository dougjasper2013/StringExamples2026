
package org.example

// This file defines a simple Caesar-style encryption
// Each letter in a string is shifted up or down
// by a specific number of letters
// Shifting can be either up or down

fun main() {
    val text = "Hello World!"
    val key = 2

    val encrypted = encryptString(text, key)

    println("Original: $text")
    println("Encrypted: $encrypted")
}

fun encryptString(input: String, move: Int): String {
    val shift = move % 26 // Normalize move to 0-25
    val result = StringBuilder()

    for (char in input) {
        when {
            char in 'a'..'z' -> {
                // Shift lowercase letters
                var shifted = char - shift

                // Wrap around if needed
                if (shifted < 'a') {
                    shifted = shifted + 26
                }

                result.append(shifted)
            }

            char in 'A'..'Z' -> {
                // Shift uppercase letters
                var shifted = char - shift

                // Wrap around if needed
                if (shifted < 'A') {
                    shifted = shifted + 26
                }

                result.append(shifted)
            }

            else -> {
                // Keep other characters unchanged
                result.append(char)
            }
        }
    }

    return result.toString()
}
