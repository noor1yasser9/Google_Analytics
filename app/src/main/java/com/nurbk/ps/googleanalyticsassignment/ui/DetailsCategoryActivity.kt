package com.nurbk.ps.googleanalyticsassignment.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.nurbk.ps.googleanalyticsassignment.BR
import com.nurbk.ps.googleanalyticsassignment.R
import com.nurbk.ps.googleanalyticsassignment.adapter.GenericAdapter
import com.nurbk.ps.googleanalyticsassignment.databinding.ActvityDetailsCategoryBinding
import com.nurbk.ps.googleanalyticsassignment.model.Categories
import com.nurbk.ps.googleanalyticsassignment.model.Product
import com.nurbk.ps.googleanalyticsassignment.products


class DetailsCategoryActivity : AppCompatActivity(),
    GenericAdapter.OnListItemViewClickListener<Product> {


    private val adapterHome = GenericAdapter(R.layout.item_product, BR.product, this)

    private lateinit var mBinding: ActvityDetailsCategoryBinding

    private val data = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActvityDetailsCategoryBinding.inflate(layoutInflater)
        setContentView(mBinding.root)


        val category = intent.getParcelableExtra<Categories>("data")!!

        title = category.name

        products.forEach {
            if (it.idCategories == category.id) {
                data.add(it)
            }
        }
        adapterHome.data = data

        mBinding.rcData.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = adapterHome
        }
    }

    override fun onClickItem(itemViewModel: Product, type: Int) {
        val intent = Intent(this, DetailsProductActivity::class.java)
        intent.putExtra("data", itemViewModel)
        startActivity(intent)

    }
}