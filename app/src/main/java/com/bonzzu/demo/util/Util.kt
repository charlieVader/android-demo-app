package com.bonzzu.demo.util

object Util {

    //Exercise 1
    //Refactor the following function
    fun calculateSum(numbers: List<Int>): Int {
        var result = 0
        for (i in 0 until numbers.size) {
            result += numbers[i]
        }
        return result
    }

    //Exercise 2
    //Find the errors
    fun calculateAverage(numbers: List<Int>): Double {
        var sum = 0
        for (i in 1..numbers.size) {
            sum += numbers[i]
        }
        return sum / numbers.size
    }

    //Exercise 3
    //Implement a function that makes an HTTP request using Retrofit
    //handling possible errors and success responses
    //You can use this API -> https://pokeapi.co/

}