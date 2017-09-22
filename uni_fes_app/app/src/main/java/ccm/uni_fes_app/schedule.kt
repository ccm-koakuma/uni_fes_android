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
        val homebutton = findViewById(R.id.homebutton) as Button
        val schedulebutton = findViewById(R.id.schedulebutton) as Button
        val shopbutton = findViewById(R.id.shopbutton) as Button

        //set swipe action
        pager.setAdapter(uniFesPagerAdapter(getSupportFragmentManager()))

        //Under menu buttons.
        homebutton.setOnClickListener{
            v->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        shopbutton.setOnClickListener{
            v->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        schedulebutton.setOnClickListener{
            v->
            val intent = Intent(this, schedule::class.java)
            startActivity(intent)
        }
    }
    fun makeToast(str: String?){
        val toastString = Toast.makeText(this, str, Toast.LENGTH_SHORT)
        toastString.show()
    }
}