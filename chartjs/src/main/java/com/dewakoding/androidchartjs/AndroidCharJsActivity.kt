package com.dewakoding.androidchartjs

import android.os.Bundle
import android.os.PersistableBundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import androidx.appcompat.app.AppCompatActivity
import com.dewakoding.androidchartjs.databinding.ActivityChartBinding


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
website : dewakoding.com

 **/
open class AndroidCharJsActivity: AppCompatActivity() {
    private val binding by lazy { ActivityChartBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val webSettings: WebSettings = binding.webview.getSettings()
        webSettings.javaScriptEnabled = true

        binding.webview.setWebChromeClient(WebChromeClient())
        binding.webview.loadUrl("file:///android_asset/index.html")

    }
}