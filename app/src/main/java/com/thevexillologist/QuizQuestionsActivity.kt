package com.thevexillologist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        var questionsCount = intent.getStringExtra(Constants.TOTAL_QUESTIONS)
    }
}