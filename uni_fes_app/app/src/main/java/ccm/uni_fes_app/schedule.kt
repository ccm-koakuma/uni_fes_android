package ccm.uni_fes_app

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v4.view.ViewPager

//widget
import android.widget.Toast
import android.widget.ImageButton
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

        //under menu below
        val homebutton = findViewById(R.id.homebutton) as ImageButton
        val schedulebutton = findViewById(R.id.schedulebutton) as ImageButton
        val shopbutton = findViewById(R.id.shopbutton) as ImageButton
        val mapbutton = findViewById(R.id.mapbutton) as ImageButton

        //under menu bar
        schedulebutton.setImageResource(R.drawable.schedule)
        homebutton.setOnClickListener{
            v->
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        shopbutton.setOnClickListener{
            v->
            val intent = Intent(this,recommend_shops::class.java)
            startActivity(intent)
        }
        mapbutton.setOnClickListener{
            v->
            val intent = Intent(this,mapPage::class.java)
            startActivity(intent)
        }

    }
    fun makeToast(str: String?){
        val toastString = Toast.makeText(this, str, Toast.LENGTH_SHORT)
        toastString.show()
    }
}