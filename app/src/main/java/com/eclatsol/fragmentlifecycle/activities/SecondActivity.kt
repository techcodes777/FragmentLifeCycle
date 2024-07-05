package com.eclatsol.fragmentlifecycle.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.eclatsol.fragmentlifecycle.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.e(">>>> onCreate () >> ",">> CREATE 2")
    }

    override fun onStart() {
        super.onStart()

        Log.e(">>>> onStart () >> ",">> START 2")
    }

    override fun onResume() {
        super.onResume()

        Log.e(">>>> onResume () >> ",">> RESUME 2")
    }

    override fun onPause() {
        super.onPause()

        Log.e(">>>> onPause () >> ",">> PAUSE 2")
    }

    override fun onStop() {
        super.onStop()

        Log.e(">>>> onStop () >> ",">> STOP 2")
    }

    override fun onRestart() {
        super.onRestart()

        Log.e(">>>> onRestart () >> ",">> RE-START 2")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e(">>>> onDestroy () >> ",">> DESTROY 2")
    }
}