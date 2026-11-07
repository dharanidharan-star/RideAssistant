package com.rideassistant.core

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showSplashScreen()
    }

    private fun showSplashScreen() {

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.rgb(15, 23, 42))

        val logo = TextView(this)
        logo.text = "🚗"
        logo.textSize = 65f

        val title = TextView(this)
        title.text = "RideAssistant"
        title.textSize = 30f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        layout.addView(logo)
        layout.addView(title)

        setContentView(layout)

        Handler(Looper.getMainLooper()).postDelayed({
            showHomeScreen()
        }, 2000)
    }

    private fun showHomeScreen() {

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.WHITE)

        val title = TextView(this)
        title.text = "Welcome to RideAssistant"
        title.textSize = 25f
        title.setTextColor(Color.BLACK)
        title.gravity = Gravity.CENTER

        layout.addView(title)

        setContentView(layout)
    }
}
