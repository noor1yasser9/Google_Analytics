package com.nurbk.ps.googleanalyticsassignment.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.firestore.FirebaseFirestore
import com.nurbk.ps.googleanalyticsassignment.BR
import com.nurbk.ps.googleanalyticsassignment.R
import com.nurbk.ps.googleanalyticsassignment.adapter.GenericAdapter
import com.nurbk.ps.googleanalyticsassignment.categories
import com.nurbk.ps.googleanalyticsassignment.databinding.ActivityMainBinding
import com.nurbk.ps.googleanalyticsassignment.model.Categories


class MainActivity : AppCompatActivity(), GenericAdapter.OnListItemViewClickListener<Categories> {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var firebaseAnalytics: FirebaseAnalytics
    private val adapterHome = GenericAdapter(R.layout.item_category, BR.category, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        firebaseAnalytics = FirebaseAnalytics.getInstance(this)




        adapterHome.data = categories
        mBinding.rcData.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = adapterHome
        }


        mBinding.root.setOnClickListener {
            logDataAnalytics("MainRootDesign", "Click Root Activity")
        }

    }

    override fun onClickItem(categories: Categories, type: Int) {
        val intent = Intent(this, DetailsCategoryActivity::class.java)
        intent.putExtra("data", categories)
        startActivity(intent)
        logDataAnalytics("NameCategories", categories.name)
    }


    private fun logDataAnalytics(key: String, data: String) {
        val bundle = Bundle()
        bundle.putString(key, data)
        firebaseAnalytics.logEvent("MainCategoriesActivity", bundle)
    }

}