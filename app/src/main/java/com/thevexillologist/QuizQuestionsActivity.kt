package com.thevexillologist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity() {

    private var allQuestions: ArrayList<RightAnswer>? = null
    private var currentQuestion: Int = 1
    private var selectedOption: Int = 0
    private var correctAns: Int = 0

    private val questionsCount = intent.getStringExtra(Constants.TOTAL_QUESTIONS)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        // Get all Countries
        allQuestions = Constants.getQuestions()
        Log.i("QuizQuestionsActivity", allQuestions.toString())
        // Select required number of questions randomly
        allQuestions!!.shuffle()
        val selected = questionsCount?.let { getCountInt(it) }?.let { allQuestions!!.take(it) }
        Log.i("QuizQuestionsActivity", selected.toString())

        // Get 4 options fort each question

        // Disable Submit button until an answer is selected
        btn_submit.isFocusable = false
        btn_submit.isEnabled = false

        btn_submit.setOnClickListener {
            // Check if an option is selected.

        }


        nextQuestion(selected)


    }

    private fun getCountInt(questionCountString: String): Int {
        return if (questionCountString == "100 Questions") 100
            else if (questionCountString == "75 Questions") 75
            else if (questionCountString == "50 Questions") 50
            else if (questionCountString == "25 Questions") 25
            else return 10
    }

    private fun selectOption() {
        // Change the background of the selected option
        // Enable Submit button
        btn_submit.isFocusable = true
        btn_submit.isEnabled = true


    }

    private fun nextQuestion(selectedQuestions: List<RightAnswer>?) {
        // Retrieve next question from the Selected list
        val qst = selectedQuestions?.get(currentQuestion - 1)

        // Check if its the last question
        if (currentQuestion == selectedQuestions!!.size) {
            btn_submit.text = "FINISH"
        } else {
            btn_submit.text = "SUBMIT"
        }

        // Set progress
        tv_progress.text = "$currentQuestion / $questionsCount"

        // Get Image and answer options


    }

    private fun onSubmit() {
        // Disable reselection of options
        // Is the answer right or wrong?
        // Increment score by 1 if right

    }
}