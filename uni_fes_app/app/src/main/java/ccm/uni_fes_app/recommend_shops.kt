package ccm.uni_fes_app

import android.support.v4.app.FragmentActivity
import android.os.Bundle
import android.os.AsyncTask
//ArrayList
import java.util.ArrayList
//Array Adapter be used when you use listView
import android.widget.ArrayAdapter
//widget
import android.widget.ListView
import android.widget.ImageButton
import android.view.View
import android.widget.AdapterView
//change Activity
import android.content.Intent
//json parse
import org.json.JSONObject
import org.json.JSONArray
//Log
import android.util.Log
//image
import android.graphics.Bitmap
import android.graphics.BitmapFactory

class recommend_shops : FragmentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recommend_shops)

        //widget initialize
        val listView = findViewById(R.id.listView) as ListView

        //name of images
        val list = arrayOf("s1","s2","s3","s4","s5","s6","s7","s8","s9",
                "s10","s11","s12","s13","s14","s15","s16","s17","s18")

        //set images on listview
        val list_content = ArrayList<listItem>() as ArrayList<listItem>
        val adapter = listAdapter4(this,R.layout.shop_list,list_content) as listAdapter4
        for(item in list){
            val listitem = listItem() as listItem
            listitem.setText(item)
            list_content.add(listitem)
        }
        listView.setAdapter(adapter)

        //under menu below
        val homebutton = findViewById(R.id.homebutton) as ImageButton
        val schedulebutton = findViewById(R.id.schedulebutton) as ImageButton
        val shopbutton = findViewById(R.id.shopbutton) as ImageButton
        val mapbutton = findViewById(R.id.mapbutton) as ImageButton

        //under menu bar
        shopbutton.setImageResource(R.drawable.shop)
        homebutton.setOnClickListener{
            v->
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        schedulebutton.setOnClickListener{
            v->
            val intent = Intent(this,schedule::class.java)
            startActivity(intent)
        }
        mapbutton.setOnClickListener{
            v->
            val intent = Intent(this,mapPage::class.java)
            startActivity(intent)
        }
    }
}