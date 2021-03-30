package com.nurbk.ps.googleanalyticsassignment.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.nurbk.ps.googleanalyticsassignment.R
import com.nurbk.ps.googleanalyticsassignment.databinding.ActivityDetailsProductBinding
import com.nurbk.ps.googleanalyticsassignment.model.Product

class DetailsProductActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityDetailsProductBinding

    private lateinit var firebaseAnalytics: FirebaseAnalytics
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityDetailsProductBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val product = intent.getParcelableExtra<Product>("data")!!
        mBinding.product = product

        firebaseAnalytics = FirebaseAnalytics.getInstance(this)


        mBinding.imageView3.setOnClickListener {
            logDataAnalytics("ClickImageProduct", product.pathImage.toString())
        }
        mBinding.textView5.setOnClickListener {
            logDataAnalytics("ClickNameProduct", product.name)
        }
        mBinding.textView6.setOnClickListener {
            logDataAnalytics("ClickPriceProduct", product.price.toString())
        }
        mBinding.textView7.setOnClickListener {
            logDataAnalytics("ClickDiscProduct", product.disc)
        }
        mBinding.ratingBar2.setOnClickListener {
            logDataAnalytics("ClickRatingProduct", product.rating.toString())
        }
        mBinding.button.setOnClickListener {
            logDataAnalytics("ClickButtonAddCart", "AddCard")
        }

    }


    private fun logDataAnalytics(key: String, data: String) {
        val bundle = Bundle()
        bundle.putString(key, data)
        firebaseAnalytics.logEvent("DetailsProductActivity", bundle)
    }

}