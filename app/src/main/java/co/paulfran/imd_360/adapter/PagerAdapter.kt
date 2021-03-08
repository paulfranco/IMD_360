package co.paulfran.imd_360.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import co.paulfran.imd_360.fragments.*

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                InvoiceFragment()
            }
            2 -> {
                AddFragment()
            }
            3 -> {
                RoutesFragment()
            }
            4 -> {
                ProfileFragment()
            }
            else -> HomeFragment()
        }
    }

    override fun getCount(): Int {

        return 5
    }
}