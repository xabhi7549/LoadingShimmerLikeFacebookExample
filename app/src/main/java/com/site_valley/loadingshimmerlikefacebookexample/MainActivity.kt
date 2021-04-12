package com.site_valley.loadingshimmerlikefacebookexample

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.facebook.shimmer.ShimmerFrameLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(mainLooper).postDelayed({
            findViewById<ShimmerFrameLayout>(R.id.shimmer_view_container).stopShimmer()
            findViewById<ShimmerFrameLayout>(R.id.shimmer_view_container).visibility = View.GONE
            findViewById<TextView>(R.id.text).visibility = View.VISIBLE

        }, 5000)
    }
}

