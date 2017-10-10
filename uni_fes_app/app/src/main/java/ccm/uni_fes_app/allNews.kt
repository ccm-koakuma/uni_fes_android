package ccm.uni_fes_app

import android.app.Activity
import android.os.Bundle

//widget
import android.widget.ImageButton
import android.widget.Button
import android.widget.TextView
import android.widget.ListView
import android.widget.ArrayAdapter
//ArrayList (be used by ListView)
import java.util.ArrayList
//Change Activity
import android.content.Intent

class allNews : Activity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.all_news)
        //widget initialize here
        val homebutton = findViewById(R.id.homebutton) as ImageButton
        val schedulebutton = findViewById(R.id.schedulebutton) as ImageButton
        val shopbutton = findViewById(R.id.shopbutton) as ImageButton
        val mapbutton = findViewById(R.id.mapbutton) as ImageButton
        val al = ArrayList<Int>() as ArrayList<Int>
        val lv = findViewById(R.id.newslist) as ListView

        homebutton.setOnClickListener{
            v->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
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
        var x = 0;
        while(x<21){
            al.add(x)
            x++
        }
        val aa = ArrayAdapter<Int>(this, R.layout.list_with_image,R.id.list_text, al)
        lv.setAdapter(aa)
    }
}