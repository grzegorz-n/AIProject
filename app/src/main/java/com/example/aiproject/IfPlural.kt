package com.example.aiproject

class IfPlural {
    private var number: Int = 0

    public fun setNumber(number: Int): Unit {
        this.number = number
    }

    public fun getResult(): Boolean {
        return number%2 == 0
    }


}