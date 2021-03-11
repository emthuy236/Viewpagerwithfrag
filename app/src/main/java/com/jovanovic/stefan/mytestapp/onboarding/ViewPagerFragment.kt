package com.jovanovic.stefan.mytestapp.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jovanovic.stefan.mytestapp.R
import com.jovanovic.stefan.mytestapp.onboarding.screen.FirstFragment
import com.jovanovic.stefan.mytestapp.onboarding.screen.SecondFragment
import com.jovanovic.stefan.mytestapp.onboarding.screen.ThirdFragment
import kotlinx.android.synthetic.main.fragment_view_pager2.view.*

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_view_pager2, container, false)
        val fragmentlist = arrayListOf<Fragment>(
            FirstFragment(),SecondFragment(),ThirdFragment()
        )

        val adapter = ViewpagerAdapter(fragmentlist,requireActivity().supportFragmentManager,lifecycle)
        view.viewpager.adapter = adapter
        return view
    }



}