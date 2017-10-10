package ccm.uni_fes_app

import android.os.Bundle

//add widget library
import android.widget.TextView
import android.widget.ImageButton
import android.widget.Button
import android.widget.Toast
import android.widget.ListView
//Use http connection
import okhttp3.*
//use show log
import android.util.Log
//Fragment manager
import ccm.uni_fes_app.uniFesPagerAdapter
//Use Pager Adapter
import android.support.v4.app.FragmentActivity
import android.support.v4.view.ViewPager
//change activity
import android.content.Intent
//Array list
import java.util.ArrayList
//Array adapter, be used listView
import android.widget.ArrayAdapter

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //widget initialize
        val schedulebutton = findViewById(R.id.schedulebutton) as ImageButton
        val shopbutton = findViewById(R.id.shopbutton) as ImageButton
        val mapbutton = findViewById(R.id.mapbutton) as ImageButton
        val seeAll = findViewById(R.id.allnewsbutton) as Button

        //set number 0 to 9 on list view
        val strList = ArrayList<Int>() as ArrayList<Int>
        var i = 0
        while(i<10){
            strList.add(i)
            i++
        }
        val arrayadapter = ArrayAdapter<Int>(this,R.layout.list_content,strList)
        val twitterlist = findViewById(R.id.twitterlist) as ListView
        twitterlist.setAdapter(arrayadapter)

        //under menu
        schedulebutton.setOnClickListener{
            v->
            val intent = Intent(this, schedule::class.java)
            startActivity(intent)
        }
        shopbutton.setOnClickListener{
            v->
            val intent = Intent(this, recommend_shops::class.java)
            startActivity(intent)
        }
        mapbutton.setOnClickListener{
            v->
            val intent = Intent(this, mapPage::class.java)
            startActivity(intent)
        }
        seeAll.setOnClickListener{
            v->
            val intent = Intent(this, allNews::class.java)
            startActivity(intent)
        }
    }
    fun makeToast(text: String){
        val toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
        toast.show()
    }
}
