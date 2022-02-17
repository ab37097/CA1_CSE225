package com.example.ca1_cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.widget.addTextChangedListener

class feedback : AppCompatActivity() {
    private var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        var editText = findViewById<EditText>(R.id.feedback)
        var pgsBar = findViewById<ProgressBar>(R.id.progressBar)
        var rateBar = findViewById<RatingBar>(R.id.ratingBar)
        var subButton = findViewById<Button>(R.id.button)
        var txtView = findViewById<TextView>(R.id.textView2)
        var actionBar = supportActionBar

        actionBar!!.title = "Feedback"
        actionBar.setDisplayHomeAsUpEnabled(true)

        editText.addTextChangedListener {
            i = editText.length()
            pgsBar.progress = i
            txtView.text = i.toString() + "/" +pgsBar.max
        }

        subButton.setOnClickListener {
            val rating = "Rating: " + rateBar.rating
            val totalStars = " / " + rateBar.numStars
            Toast.makeText(this, """$rating $totalStars""".trimIndent(),
                Toast.LENGTH_SHORT).show()
        }
    }
}