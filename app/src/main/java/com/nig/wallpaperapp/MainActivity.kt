package com.nig.wallpaperapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.nig.wallpaperapp.databinding.ActivityMainBinding
import com.nig.wallpaperapp.view.fragment.CategoryFragment
import com.nig.wallpaperapp.view.fragment.FavouriteFragment
import com.nig.wallpaperapp.view.fragment.HomeFragment
import com.nig.wallpaperapp.view.fragment.SettingFragment

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        loadFragment(HomeFragment())
        setupBottomNav()


    }


    private fun setupBottomNav()
    {

        mainBinding.bottomNav.setOnItemSelectedListener {
            when(it.itemId)
            {
                  R.id.home->{
                      loadFragment(HomeFragment())
                  }
                R.id.category->{
                    loadFragment(CategoryFragment())
                }

                R.id.favourite->{
                    loadFragment(FavouriteFragment())
                }
                R.id.setting->{
                    loadFragment(SettingFragment())
                }
            }
            true
        }
    }

    private fun loadFragment(fragment: Fragment)
    {
        supportFragmentManager.beginTransaction().replace(R.id.frame,fragment).commit()
    }
}