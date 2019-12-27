package com.yogurt.mine.basicsample.ui

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yogurt.mine.basicsample.R
import com.yogurt.mine.basicsample.databinding.ActivityMainBinding

/**
 *Author: yogurtcai
 *Time: 2019-12-27 13:04
 *Description:
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.btn01.setOnClickListener {
            startActivity(Intent(this, ObservableFieldActivity::class.java))
        }

        binding.btn02.setOnClickListener {

        }
    }
}