package ru.skillbranch.devintensive.utils

object Utils {

    fun parseFullName(fullName: String?) : Pair<String?, String?> {
        var parts: List<String>?
        when (fullName) {
            "" -> parts = null
            " " -> parts = null
            else -> parts = fullName?.split(" ")
        }
        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)

        return firstName to lastName
    }
    fun toInitials(firstName: String?, lastName: String?) : String? {
        var result: String? = ""

        if(firstName == null && lastName == null) {
            result = null
        } else {
            when (firstName) {
                " ", "" -> result = null
                null -> result += ""
                else -> result += firstName.substring(0, 1).toUpperCase()
            }
            when (lastName) {
                " ", "" -> result = null
                null -> result += ""
                else -> result += lastName.substring(0, 1).toUpperCase()
            }
        }

        return result
    }

    fun transliteration(payload: String, divider: String = " "): String {
        val fileContent = this::class.java.getResource("/vocabulary")?.readText()

        println(fileContent)

        return fileContent.toString()
    }
}