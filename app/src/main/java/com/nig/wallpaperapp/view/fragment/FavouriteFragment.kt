package com.nig.wallpaperapp.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nig.wallpaperapp.databinding.CategoryFragmentBinding
import com.nig.wallpaperapp.databinding.FavouriteFragmentBinding

class FavouriteFragment(): Fragment()
{
    private lateinit var favouriteFragmentBinding: FavouriteFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        favouriteFragmentBinding= FavouriteFragmentBinding.inflate(layoutInflater,container,false)
        return favouriteFragmentBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}