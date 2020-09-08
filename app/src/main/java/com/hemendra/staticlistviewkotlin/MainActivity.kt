package com.hemendra.staticlistviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txtarray = arrayOf("Dog1","Dog2","Dog3","Dog4","Dog5","Dog6","Dog7","Dog8","Dog9","Dog10")
        var imagearray = intArrayOf(R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10)

        lv.adapter = ListAdapter(this@MainActivity,txtarray,imagearray)
    }
}