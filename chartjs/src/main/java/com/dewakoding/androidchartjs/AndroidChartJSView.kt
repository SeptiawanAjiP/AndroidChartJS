package com.dewakoding.androidchartjs

import android.content.Context
import android.util.AttributeSet
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.LinearLayout
import com.google.gson.Gson


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
website : dewakoding.com

 **/
class AndroidChartJSView  @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : LinearLayout(context, attrs, defStyle) {
    private val webView: WebView
    internal var jsi: JavascriptInterface? = null

    init {
        orientation = VERTICAL
        webView = WebView(context)
    }

    fun setChart(type: String,label: Array<String>, data: Array<Int>, labelTitle: String) {
        jsi = JavascriptInterface(getContext(), type, Gson().toJson(label) , Gson().toJson(data), labelTitle)
        val webSettings: WebSettings = webView.getSettings()
        webSettings.javaScriptEnabled = true
        webView.addJavascriptInterface(jsi!!, JavascriptInterface.TAG_HANDLER)
        webView.setWebChromeClient(WebChromeClient())
        webView.loadUrl("file:///android_asset/chart2023.html")
        addView(webView)
    }
}
