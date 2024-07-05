package com.eclatsol.fragmentlifecycle.activities

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.eclatsol.fragmentlifecycle.R
import com.eclatsol.fragmentlifecycle.fragments.FirstFragment
import com.eclatsol.fragmentlifecycle.fragments.SecondFragment

class FirstActivity : AppCompatActivity() {

    var firstFragment: Button? = null
    var secondFragment:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        firstFragment = findViewById(R.id.btnFirst)
        secondFragment =  findViewById(R.id.btnSecond)

        loadFragment(FirstFragment())

        firstFragment?.setOnClickListener {
            loadFragment(FirstFragment())
        }

        secondFragment?.setOnClickListener {
            loadFragment(SecondFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        // create a FragmentManager
        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()

        // replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit() // save the changes
    }
}