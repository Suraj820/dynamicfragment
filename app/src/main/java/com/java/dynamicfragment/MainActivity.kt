package com.java.dynamicfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* if (savedInstanceState == null){
            findViewById<FragmentContainerView>(R.id.fragment_container).let{ frameLayout ->
                val listFragment = ListFragment()
                supportFragmentManager.beginTransaction()
                    .add(frameLayout.id, listFragment).commit()
            }
        }*/
    }

    /*override fun onSelected(starSignId: Int) {

        findViewById<FragmentContainerView>(R.id.fragment_container).let { frameLayout->
            val detail =  DetailFragment.newInstance(starSignId)
            supportFragmentManager.beginTransaction()
                .replace(frameLayout.id,detail)
                .addToBackStack(null)
                .commit()
        }
    }*/


}