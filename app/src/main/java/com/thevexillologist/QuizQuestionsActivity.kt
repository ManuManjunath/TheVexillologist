package com.thevexillologist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class QuizQuestionsActivity : AppCompatActivity() {

    private var mQuestionsList: ArrayList<QuestionAnswer>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAns: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionsCount = intent.getStringExtra(Constants.TOTAL_QUESTIONS)
        if (questionsCount != null) {
            Log.i("QuizQuestionsActivity", questionsCount)
        }


    }
}