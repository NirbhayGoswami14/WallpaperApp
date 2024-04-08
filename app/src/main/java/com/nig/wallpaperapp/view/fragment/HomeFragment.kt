package com.nig.wallpaperapp.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nig.wallpaperapp.databinding.HomeFragmentBinding

class HomeFragment(): Fragment()
{
    private lateinit var homeFragmentBinding: HomeFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        homeFragmentBinding=HomeFragmentBinding.inflate(layoutInflater,container,false)
        return homeFragmentBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}