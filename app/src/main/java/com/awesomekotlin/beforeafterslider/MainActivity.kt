package com.awesomekotlin.beforeafterslider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgUrl1 = "https://cdn.hasselblad.com/samples/x1d-II-50c/x1d-II-sample-01.jpg"
        val imgUrl2 = "https://cdn.hasselblad.com/samples/x1d-II-50c/x1d-II-sample-02.jpg"
        before_after_slider_id.setBeforeImage(imgUrl1).setAfterImage(imgUrl2)
    }
}
