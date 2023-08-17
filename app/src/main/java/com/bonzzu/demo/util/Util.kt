package com.bonzzu.demo.util

object Util {

    //Exercise 1
    //Copy the following exercise in https://play.kotlinlang.org/
    //and find and fix the errors
    fun calculateAverage(numbers: List<Int>): Double {
        var sum = 0
        for (i in 1..numbers.size) {
            sum += numbers[i]
        }
        return sum / numbers.size
    }

    //Exercise 2
    //Given a list of numbers, filter out the even numbers and then
    //double each remaining number using the filter and map functions.

    //Exercise 3
    //Imagine you have a list of bank accounts, each represented by a data class BankAccount
    // with properties accountNumber and balance.
    // Write a Kotlin program that uses the reduce function to calculate the total balance
    // across all bank accounts.

    //Exercise 4
    //Implement a function that makes an HTTP request using Retrofit to get the name and game_index,
    //handling possible errors and success responses
    //You can use this API -> https://pokeapi.co/

}