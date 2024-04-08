package com.nig.wallpaperapp.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nig.wallpaperapp.databinding.CategoryFragmentBinding
import com.nig.wallpaperapp.databinding.HomeFragmentBinding

class CategoryFragment(): Fragment()
{
    private lateinit var categoryFragmentBinding: CategoryFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        categoryFragmentBinding= CategoryFragmentBinding.inflate(layoutInflater,container,false)
        return categoryFragmentBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}