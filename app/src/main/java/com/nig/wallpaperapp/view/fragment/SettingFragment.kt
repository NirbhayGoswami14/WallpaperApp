package com.nig.wallpaperapp.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nig.wallpaperapp.databinding.CategoryFragmentBinding
import com.nig.wallpaperapp.databinding.SettingFragmentBinding

class SettingFragment(): Fragment()
{
    private lateinit var settingFragmentBinding: SettingFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        settingFragmentBinding= SettingFragmentBinding.inflate(layoutInflater,container,false)
        return settingFragmentBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}