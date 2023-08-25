package com.bonzzu.demo.util

object Util {

    //Exercise 1
    //Copy the following exercise in https://play.kotlinlang.org/
    //and find and fix the errors
    fun calculateAverage(numbers: List<Int>): Double {
        var sum: Double = 0.0
        for (i in 0..numbers.size -1) {
            sum += numbers[i]
        }
        return sum / numbers.size
    }

    //Exercise 2
    //Given a list of numbers, filter out the even (par) numbers and then
    //double each remaining number using the filter and map functions.
    fun filterEvenAndDouble(numbers: List<Int>): List<Int> =
        numbers.filter { o: Int -> o % 2 != 0 }.map { it * 2 }

    //Exercise 3
    //Imagine you have a list of bank accounts, each represented by a data class BankAccount
    // with properties accountNumber and balance.
    // Write a Kotlin program that uses the reduce function to calculate the total balance
    // across all bank accounts.
    fun calculateTotalBalance(accounts: List<BankAccount>) : Double =
        accounts.map{it.balance}.reduce { acc, n -> acc + n }


    data class BankAccount(val accountNumber : Int, val  balance : Double)


    //Exercise 4
    //Implement a function that makes an HTTP request using Retrofit to get the name and game_index,
    //handling possible errors and success responses
    //You can use this API -> https://pokeapi.co/

}