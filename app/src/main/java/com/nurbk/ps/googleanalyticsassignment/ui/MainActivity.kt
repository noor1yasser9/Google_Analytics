package com.nurbk.ps.googleanalyticsassignment.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nurbk.ps.googleanalyticsassignment.BR
import com.nurbk.ps.googleanalyticsassignment.R
import com.nurbk.ps.googleanalyticsassignment.adapter.GenericAdapter
import com.nurbk.ps.googleanalyticsassignment.categories
import com.nurbk.ps.googleanalyticsassignment.databinding.ActivityMainBinding
import com.nurbk.ps.googleanalyticsassignment.model.Categories

class MainActivity : AppCompatActivity(), GenericAdapter.OnListItemViewClickListener<Categories> {

    private lateinit var mBinding: ActivityMainBinding

    private val adapterHome = GenericAdapter(R.layout.item_category, BR.category, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        adapterHome.data = categories
        mBinding.rcData.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = adapterHome
        }
    }

    override fun onClickItem(itemViewModel: Categories, type: Int) {
        val intent = Intent(this, DetailsCategoryActivity::class.java)
        intent.putExtra("data", itemViewModel)
        startActivity(intent)
    }
}