package co.paulfran.imd_360

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.viewpager.widget.ViewPager
import co.paulfran.imd_360.adapter.PagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var homeBtn: ImageButton
    private lateinit var addBtn: ImageButton
    private lateinit var invoiceBtn: ImageButton
    private lateinit var routesBtn: ImageButton
    private lateinit var profileBtn: ImageButton

    private lateinit var mViewPager: ViewPager
    private lateinit var mPagerViewAdapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPager = findViewById(R.id.mViewPager)
        homeBtn = findViewById(R.id.homeBtn)
        addBtn = findViewById(R.id.addBtn)
        profileBtn = findViewById(R.id.profileBtn)
        invoiceBtn = findViewById(R.id.searchBtn)
        routesBtn = findViewById(R.id.notiBtn)


        homeBtn.setOnClickListener {
            mViewPager.currentItem = 0

        }

        invoiceBtn.setOnClickListener {

            mViewPager.currentItem = 1

        }

        addBtn.setOnClickListener {
            mViewPager.currentItem = 2

        }

        routesBtn.setOnClickListener {
            mViewPager.currentItem = 3

        }

        profileBtn.setOnClickListener {
            mViewPager.currentItem = 4

        }

        mPagerViewAdapter = PagerAdapter(supportFragmentManager)
        mViewPager.adapter = mPagerViewAdapter
        mViewPager.offscreenPageLimit = 5

        mViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                changeTabs(position)
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })

        mViewPager.currentItem = 0
        homeBtn.setImageResource(R.drawable.ic_home_pink)


    }

    private fun changeTabs(position: Int) {
        if (position == 0) {
            homeBtn.setImageResource(R.drawable.ic_home_pink)
            invoiceBtn.setImageResource(R.drawable.ic_receipt)
            addBtn.setImageResource(R.drawable.ic_add)
            routesBtn.setImageResource(R.drawable.ic_route)
            profileBtn.setImageResource(R.drawable.ic_person)
        }
        if (position == 1) {
            homeBtn.setImageResource(R.drawable.ic_home)
            invoiceBtn.setImageResource(R.drawable.ic_receipt_pink)
            addBtn.setImageResource(R.drawable.ic_add)
            routesBtn.setImageResource(R.drawable.ic_route)
            profileBtn.setImageResource(R.drawable.ic_person)
        }
        if (position == 2) {
            homeBtn.setImageResource(R.drawable.ic_home)
            invoiceBtn.setImageResource(R.drawable.ic_receipt)
            addBtn.setImageResource(R.drawable.ic_add_pink)
            routesBtn.setImageResource(R.drawable.ic_route)
            profileBtn.setImageResource(R.drawable.ic_person)
        }
        if (position == 3) {
            homeBtn.setImageResource(R.drawable.ic_home)
            invoiceBtn.setImageResource(R.drawable.ic_receipt)
            addBtn.setImageResource(R.drawable.ic_add)
            routesBtn.setImageResource(R.drawable.ic_route_pink)
            profileBtn.setImageResource(R.drawable.ic_person)
        }
        if (position == 4) {
            homeBtn.setImageResource(R.drawable.ic_home)
            invoiceBtn.setImageResource(R.drawable.ic_receipt)
            addBtn.setImageResource(R.drawable.ic_add)
            routesBtn.setImageResource(R.drawable.ic_route)
            profileBtn.setImageResource(R.drawable.ic_person_pink)

        }
    }
}