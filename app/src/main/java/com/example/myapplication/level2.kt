package com.example.myapplication

fun main() {
    var num1 = readLine()!!.toInt()
    var myOperator = readLine()!!.toString()
    var num2 = readLine()!!.toInt()
    var operator = "더하기"
    var operator1 = "빼기"
    var operator2 = "곱하기"
    var operator3 = "나누기"
    var operator4 = "나머지"

    if(myOperator == operator) { var plusResult = num1 + num2
        println("결과는 ${plusResult}입니다.")
    } else if(myOperator == operator1) { var minusResult = num1 - num2
        println("결과는 ${minusResult}입니다.")
    } else if(myOperator == operator2) { var multipleResult = num1 * num2
        println("결과는 ${multipleResult}입니다.")
    } else if(myOperator == operator3) { var divideResult = num1 / num2
        println("결과는 ${divideResult}입니다.")
    } else if(myOperator == operator4) { var modResult = num1 % num2
        println("결과는 ${modResult}입니다")
    } else {

    }

}