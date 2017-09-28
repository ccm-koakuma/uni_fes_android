package ccm.uni_fes_app

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v4.view.ViewPager

//widget
import android.widget.Toast
import android.widget.Button
//change display
import android.content.Intent
//Pager Adapter
import ccm.uni_fes_app.uniFesPagerAdapter

class schedule: FragmentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.schedule)

        val pager = findViewById(R.id.pager) as ViewPager

        //set swipe action
        pager.setAdapter(uniFesPagerAdapter(getSupportFragmentManager()))


    }
    fun makeToast(str: String?){
        val toastString = Toast.makeText(this, str, Toast.LENGTH_SHORT)
        toastString.show()
    }
}