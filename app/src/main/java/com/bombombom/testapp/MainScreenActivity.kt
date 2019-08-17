package com.bombombom.testapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainScreenActivity : AppCompatActivity(), MainScreenView{
    private lateinit var presenter: MainScreenPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
    }
}