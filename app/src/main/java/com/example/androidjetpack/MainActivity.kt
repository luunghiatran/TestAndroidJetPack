package com.example.androidjetpack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.androidjetpack.architecture.databinding.DataBindingActivity
import com.example.androidjetpack.architecture.navigation.NavigationTestActivity
import com.example.androidjetpack.architecture.paging.PagingActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gotoNavigation(view: View) {
        startActivity(Intent(this, NavigationTestActivity::class.java))
    }

    fun gotoDataBinding(view: View) {
        startActivity(Intent(this, DataBindingActivity::class.java))
    }

    fun gotoPaging(view: View) {
        startActivity(Intent(this, PagingActivity::class.java))
    }
}
