package com.thevexillologist

object Constants {
    const val TOTAL_QUESTIONS: String = "totalQuestions"
    const val CORRECT_ANSWERS: String = "correctAnswers"

    fun getQuestions(): ArrayList<QuestionAnswer> {
        val questionsList = ArrayList<QuestionAnswer>()

        questionsList.add(QuestionAnswer(R.drawable.flag_afghanistan, "AFGHANISTAN"))
        questionsList.add(QuestionAnswer(R.drawable.flag_albania, "ALBANIA"))
        questionsList.add(QuestionAnswer(R.drawable.flag_algeria, "ALGERIA"))
        questionsList.add(QuestionAnswer(R.drawable.flag_american_samoa, "AMERICAN SAMOA"))
        questionsList.add(QuestionAnswer(R.drawable.flag_andorra, "ANDORRA"))
        questionsList.add(QuestionAnswer(R.drawable.flag_angola, "ANGOLA"))
        questionsList.add(QuestionAnswer(R.drawable.flag_antarctica, "ANTARTICA"))
        questionsList.add(QuestionAnswer(R.drawable.flag_antigua_and_barbuda, "ANTIGUA AND BARBUDA"))
        questionsList.add(QuestionAnswer(R.drawable.flag_argentina, "ARGENTINA"))
        questionsList.add(QuestionAnswer(R.drawable.flag_armenia, "ARMENIA"))
        questionsList.add(QuestionAnswer(R.drawable.flag_aruba, "ARUBA"))
        questionsList.add(QuestionAnswer(R.drawable.flag_australia, "AUSTRALIA"))
        questionsList.add(QuestionAnswer(R.drawable.flag_austria, "AUSTRIA"))
        questionsList.add(QuestionAnswer(R.drawable.flag_azerbaijan, "AZERBAIJAN"))
        questionsList.add(QuestionAnswer(R.drawable.flag_bahamas, "THE BAHAMAS"))
        questionsList.add(QuestionAnswer(R.drawable.flag_bahrain, "BAHRAIN"))
        questionsList.add(QuestionAnswer(R.drawable.flag_bangladesh, "BANGLADESH"))
        questionsList.add(QuestionAnswer(R.drawable.flag_barbados, "BARBADOS"))
        questionsList.add(QuestionAnswer(R.drawable.flag_belarus, "BELARUS"))
        questionsList.add(QuestionAnswer(R.drawable.flag_belgium, "BELGIUM"))
        questionsList.add(QuestionAnswer(R.drawable.flag_belize, "BELIZE"))

        return questionsList
    }

}
