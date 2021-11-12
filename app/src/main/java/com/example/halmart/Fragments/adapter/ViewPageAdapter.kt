package com.example.halmart.Fragments.adapter

import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.halmart.Fragments.FavouriteFragment
import com.example.halmart.Fragments.HomeFragment
import com.example.halmart.Fragments.SettingsFragment

class ViewPageAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                FavouriteFragment()
            }
            2 -> {
                SettingsFragment()
            }
            else -> {
                Fragment()
            }
        }
    }

}