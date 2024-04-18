package org.example


fun main() {
    var s  = readlnOrNull().orEmpty().split(" ")

    if (s[1].toInt() + s[2].toInt() == s[0].toInt()){
        println("YES")
    }
    else if (s[0].toInt() + s[2].toInt() == s[1].toInt()){
        println("YES")
    }
    else if (s[0].toInt() + s[1].toInt() == s[2].toInt()){
        println("YES")
    }
    else{
        println("NO")
    }
}