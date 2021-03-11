package com.jovanovic.stefan.mytestapp.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.util.ArrayList

class ViewpagerAdapter(
    list:ArrayList<Fragment>,
    fm: FragmentManager,
    lifecycle: Lifecycle):FragmentStateAdapter(fm,lifecycle) {

    val fragmentlist = list
    override fun getItemCount(): Int {
        return fragmentlist.size
    }

    override fun createFragment(position: Int): Fragment {
       return fragmentlist[position]
    }
}