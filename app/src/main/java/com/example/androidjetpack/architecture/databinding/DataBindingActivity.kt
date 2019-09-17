package com.example.androidjetpack.architecture.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidjetpack.R
import com.example.androidjetpack.architecture.databinding.adapter.MyAdapter
import com.example.androidjetpack.databinding.ActivityDataBindingBinding
import kotlinx.android.synthetic.main.activity_data_binding.*

class DataBindingActivity : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(LikeViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_data_binding)
        val binding: ActivityDataBindingBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)

        setupDataBinding(binding)
        setupFragment()
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val array = arrayOf("nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1",
            "nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1",
            "nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1",
            "nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1", "nghia1")

        recyclerView.apply {
            hasFixedSize()
            layoutManager = LinearLayoutManager(this@DataBindingActivity)
            adapter = MyAdapter(array)
        }
    }

    private fun setupFragment() {
        supportFragmentManager.beginTransaction().add(R.id.layoutFragmentContainer, LikeFragment()).commit()
    }

    private fun setupDataBinding(binding: ActivityDataBindingBinding) {
        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments
        binding.viewmodel = viewModel
    }
}
