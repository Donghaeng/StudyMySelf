package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.convertTo
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstNum:Int = 0
        var secondNum:Int = 0
        var result:Int = 0
        var symbol:String = ""
        var v = 0

        button0.setOnClickListener {
            inputTV.text = "${inputTV.text}0"
            v = if(inputTV.text != null) {
                v*10+0
            } else {
                0
            }
        }
        button1.setOnClickListener {
            inputTV.text = "${inputTV.text}1"
            v = if(inputTV.text != null) {
                v*10+1
            } else {
                1
            }
        }
        button2.setOnClickListener {
            inputTV.text = "${inputTV.text}2"
            v = if(inputTV.text != null) {
                v*10+2
            } else {
                2
            }
        }
        button3.setOnClickListener {
            inputTV.text = "${inputTV.text}3"
            v = if(inputTV.text != null) {
                v*10+3
            } else {
                3
            }
        }
        button4.setOnClickListener {
            inputTV.text = "${inputTV.text}4"
            v = if(inputTV.text != null) {
                v*10+4
            } else {
                4
            }
        }
        button5.setOnClickListener {
            inputTV.text = "${inputTV.text}5"
            v = if(inputTV.text != null) {
                v*10+5
            } else {
                5
            }
        }
        button6.setOnClickListener {
            inputTV.text = "${inputTV.text}6"
            v = if(inputTV.text != null) {
                v*10+6
            } else {
                6
            }
        }
        button7.setOnClickListener {
            inputTV.text = "${inputTV.text}7"
            v = if(inputTV.text != null) {
                v*10+7
            } else {
                7
            }
        }
        button8.setOnClickListener {
            inputTV.text = "${inputTV.text}8"
            v = if(inputTV.text != null) {
                v*10+8
            } else {
                8
            }
        }
        button9.setOnClickListener {
            inputTV.text = "${inputTV.text}9"
            v = if(inputTV.text != null) {
                v*10+9
            } else {
                9
            }
        }
        buttonC.setOnClickListener {
            firstNum = 0
            secondNum = 0
            result = 0
            v = 0
            inputTV.text = ""
            resultTV.text = ""
        }
        buttonA.setOnClickListener {
            firstNum = inputTV.text.toString().toInt()
            symbol = "+"
            inputTV.text = "${inputTV.text}+"
            v = 0
        }
        buttonR.setOnClickListener {
            firstNum = inputTV.text.toString().toInt()
            symbol = "-"
            inputTV.text = "${inputTV.text}-"
            v = 0
        }
        buttonD.setOnClickListener {
            firstNum = inputTV.text.toString().toInt()
            symbol = "/"
            inputTV.text = "${inputTV.text}/"
            v = 0
        }
        buttonM.setOnClickListener {
            firstNum = inputTV.text.toString().toInt()
            symbol = "x"
            inputTV.text = "${inputTV.text}x"
            v = 0
        }
        buttonE.setOnClickListener {
            secondNum = v
            when(symbol) {
                "+" -> result = firstNum + secondNum
                "-" -> result = firstNum - secondNum
                "x" -> result = firstNum * secondNum
                "/" -> result = firstNum / secondNum
            }
            resultTV.text = result.toString()
        }
    }
}