package com.nurbk.ps.googleanalyticsassignment.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nurbk.ps.googleanalyticsassignment.R
import com.nurbk.ps.googleanalyticsassignment.databinding.ActivityDetailsProductBinding
import com.nurbk.ps.googleanalyticsassignment.model.Product

class DetailsProductActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityDetailsProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityDetailsProductBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val product = intent.getParcelableExtra<Product>("data")!!
        mBinding.product = product

    }

}