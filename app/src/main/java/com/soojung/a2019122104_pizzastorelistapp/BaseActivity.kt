package com.soojung.a2019122104_pizzastorelistapp

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()

}