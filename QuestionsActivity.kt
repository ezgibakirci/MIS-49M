package com.example.bakirciezgi_celebquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.bakirciezgi_celebquiz.set.getAnswer
import kotlin.math.log10
import android.content.Intent
import android.graphics.Color
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_questions.*



class QuestionsActivity : AppCompatActivity() {
    private var score:Int=0

    private var answerList:ArrayList<Data> ? = null
    private var selecedOption:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)
        val intent = intent

        set.getAnswer()
        answerList=set.getAnswer()
        /*
        o_one.setOnClickListener{

            selectedOptionStyle(o_one,1)
        }
        o_two.setOnClickListener{

            selectedOptionStyle(o_two,2)
        }
        o_three.setOnClickListener{

            selectedOptionStyle(o_three,3)
        }

        fun setQuestion(){

            o_one.text=question.o_one
            o_two.text=question.o_two
            o_three.text=question.o_three

        }*/
    }
}