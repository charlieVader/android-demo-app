package com.bonzzu.demo.util


fun main(){
    val numbers = listOf(1,2,3,4,5)
    val numbersToAvg = listOf(1.5,1.5,2.5)
    println("Result Sum is ${Util.calculateSum(numbers)}")
    println("Result Avg is ${Util.calculateAverage(numbersToAvg)}")

}

object Util {
    //Exercise 1
    //Refactor the following function
    fun calculateSum(numbers: List<Int>): Int {
        return numbers.sum()
    }

    //Exercise 2
    //Find the errors

    //Errors found, conversion type and index of bounds
    fun calculateAverage(numbers: List<Double>): Double {
        var sum = 0.0
        for (element in numbers) {
            sum += element
        }
        return sum / numbers.size
    }


    //Exercise 3
    //Implement a function that makes an HTTP request using Retrofit
    //handling possible errors and success responses
    //You can use this API -> https://pokeapi.co/

}