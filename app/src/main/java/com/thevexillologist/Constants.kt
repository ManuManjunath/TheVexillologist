package com.thevexillologist

object Constants {
    const val TOTAL_QUESTIONS: String = "totalQuestions"
    const val CORRECT_ANSWERS: String = "correctAnswers"

    fun getCountries(): ArrayList<String> {
        val countries = ArrayList<String>()

        countries.add("AFGHANISTAN")
        countries.add("ALBANIA")
        countries.add("ALGERIA")
        countries.add("AMERICAN SAMOA")
        countries.add("ANDORRA")
        countries.add("ANGOLA")
        countries.add("ANTARCTICA")
        countries.add("ANTIGUA AND BARBUDA")
        countries.add("ARGENTINA")
        countries.add("ARMENIA")
        countries.add("ARUBA")
        countries.add("AUSTRALIA")
        countries.add("AUSTRIA")
        countries.add("AZERBAIJAN")
        countries.add("THE BAHAMAS")
        countries.add("BAHRAIN")
        countries.add("BANGLADESH")
        countries.add("BARBADOS")
        countries.add("BELARUS")
        countries.add("BELGIUM")
        countries.add("BELIZE")

        return countries
    }

    fun getQuestions(): ArrayList<RightAnswer> {
        val questionsList = ArrayList<RightAnswer>()

        questionsList.add(RightAnswer(R.drawable.flag_afghanistan, "AFGHANISTAN"))
        questionsList.add(RightAnswer(R.drawable.flag_albania, "ALBANIA"))
        questionsList.add(RightAnswer(R.drawable.flag_algeria, "ALGERIA"))
        questionsList.add(RightAnswer(R.drawable.flag_american_samoa, "AMERICAN SAMOA"))
        questionsList.add(RightAnswer(R.drawable.flag_andorra, "ANDORRA"))
        questionsList.add(RightAnswer(R.drawable.flag_angola, "ANGOLA"))
        questionsList.add(RightAnswer(R.drawable.flag_antarctica, "ANTARCTICA"))
        questionsList.add(RightAnswer(R.drawable.flag_antigua_and_barbuda, "ANTIGUA AND BARBUDA"))
        questionsList.add(RightAnswer(R.drawable.flag_argentina, "ARGENTINA"))
        questionsList.add(RightAnswer(R.drawable.flag_armenia, "ARMENIA"))
        questionsList.add(RightAnswer(R.drawable.flag_aruba, "ARUBA"))
        questionsList.add(RightAnswer(R.drawable.flag_australia, "AUSTRALIA"))
        questionsList.add(RightAnswer(R.drawable.flag_austria, "AUSTRIA"))
        questionsList.add(RightAnswer(R.drawable.flag_azerbaijan, "AZERBAIJAN"))
        questionsList.add(RightAnswer(R.drawable.flag_bahamas, "THE BAHAMAS"))
        questionsList.add(RightAnswer(R.drawable.flag_bahrain, "BAHRAIN"))
        questionsList.add(RightAnswer(R.drawable.flag_bangladesh, "BANGLADESH"))
        questionsList.add(RightAnswer(R.drawable.flag_barbados, "BARBADOS"))
        questionsList.add(RightAnswer(R.drawable.flag_belarus, "BELARUS"))
        questionsList.add(RightAnswer(R.drawable.flag_belgium, "BELGIUM"))
        questionsList.add(RightAnswer(R.drawable.flag_belize, "BELIZE"))

        return questionsList
    }

}
