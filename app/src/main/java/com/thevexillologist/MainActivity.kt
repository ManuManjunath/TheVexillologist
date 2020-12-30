package com.thevexillologist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val qstnNumOptions = arrayListOf("10 Questions", "25 Questions", "50 Questions", "75 Questions", "100 Questions")
    private var radioGroup: RadioGroup? = null
    lateinit var radioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.rg_questions)

        btn_start.setOnClickListener {
            // Take number of questions before proceeding
            radioButton = findViewById(radioGroup!!.checkedRadioButtonId)
            val selectedOption = radioButton.text.toString()
            // Toast.makeText(this, selectedOption, Toast.LENGTH_SHORT).show()
            if (selectedOption in qstnNumOptions) {
                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.TOTAL_QUESTIONS, selectedOption)
                startActivity(intent)
                // Close the current activity
                // finish()
            } else {
                Toast.makeText(this, "Select the number of questions to proceed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}