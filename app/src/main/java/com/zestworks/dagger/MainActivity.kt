package com.zestworks.dagger

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var okhtttp:OkHttp
    @Inject
    lateinit var retrofit:Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appComponent = DaggerAppComponent.builder().build()
        val editorComponent = DaggerEditorComponent.builder().appComponent(appComponent).build()

        editorComponent.inject(this)
        Log.d("test", retrofit.toString())
    }
}
