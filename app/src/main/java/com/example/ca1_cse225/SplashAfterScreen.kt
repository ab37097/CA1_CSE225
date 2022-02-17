package com.example.ca1_cse225

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import kotlin.random.Random

class SplashAfterScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_after_screen)
        var tb = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(tb)

        var btn = findViewById<Button>(R.id.btnLike)

        btn.setOnClickListener {
            var rnd = Random
            var color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            tb.setBackgroundColor(color)
        }

        var toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.setTitle("CA1 Assignment")
        toolbar.setLogo(R.drawable.batman)
        setSupportActionBar(toolbar) //replace toolbar as an ActionBar
        toolbar.setNavigationOnClickListener {
            Toast.makeText(this, "Back Arrow", Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id:Int = item.itemId
        if(id==R.id.action_settings)
        {
            Toast.makeText(applicationContext, "Settings Menu", Toast.LENGTH_LONG).show()
            return true
        }
        else if(id == R.id.action_email)
        {
            Toast.makeText(applicationContext, "Email", Toast.LENGTH_LONG).show()
            return true
        }
        else if (id == R.id.action_add)
        {
            Toast.makeText(applicationContext, "Add", Toast.LENGTH_LONG).show()
            return true
        }
        else if(id == R.id.gotoFeedback)
        {
            val intent = Intent(this,feedback::class.java)
            startActivity(intent)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}