package com.dewakoding.androidchartjs

import android.content.Context
import android.webkit.JavascriptInterface


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
website : dewakoding.com

 **/
class JavascriptInterface(
    context: Context,
    type: String,
    label: String?,
    data: String,
    labelTitle: String
) {
    companion object {
        const val TAG_HANDLER = "Android"
    }
    private val mType = type
    private val mLabel = label
    private val mData = data
    private val mLabelTitle = labelTitle


    @JavascriptInterface
    fun getType(): String {
        return mType
    }

    @JavascriptInterface
    fun getLabel(): String {
        return mLabel.toString()
    }

    @JavascriptInterface
    fun getData(): String {
        return mData
    }

    @JavascriptInterface
    fun getLabelTitle(): String {
        return mLabelTitle
    }


}