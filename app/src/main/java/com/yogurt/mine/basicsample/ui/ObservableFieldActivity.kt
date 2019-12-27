package com.yogurt.mine.basicsample.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableInt
import com.yogurt.mine.basicsample.R
import com.yogurt.mine.basicsample.data.ObservableFieldProfile
import com.yogurt.mine.basicsample.databinding.ObserableFieldLayoutBinding

/**
 *Author: yogurtcai
 *Time: 2019-12-27 16:12
 *Description:
 */

class ObservableFieldActivity : AppCompatActivity() {

    val model : ObservableFieldProfile = ObservableFieldProfile("caihaozhong", ObservableInt(1));

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ObserableFieldLayoutBinding = DataBindingUtil.setContentView(this, R.layout.obserable_field_layout);

        binding.model = model;
    }

    fun onLike(view: View) {
        model.likes.set(model.likes.get() + 1)
    }
}