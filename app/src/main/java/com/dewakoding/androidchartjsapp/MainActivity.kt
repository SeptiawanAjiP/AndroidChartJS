package com.dewakoding.androidchartjsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dewakoding.androidchartjs.util.CommonConst
import com.dewakoding.androidchartjsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.androidChart.setChart(CommonConst.CHART_JS_BAR, arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"), arrayOf(10, 3, 5, 8, 9))
    }

}