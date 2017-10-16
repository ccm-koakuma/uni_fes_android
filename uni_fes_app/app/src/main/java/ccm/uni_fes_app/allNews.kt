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
//Change image(imageView)
import android.graphics.Bitmap
import android.graphics.BitmapFactory

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

        //under menu bar
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
        var x = 0
        //Array that is set listView
        val array = ArrayList<listItem>() as ArrayList<listItem> // array
        //test bitmap data -> be used by imageView
        val thumbdata = BitmapFactory.decodeResource(getResources(), R.drawable.home_selected) as Bitmap
        val thumbdata2 = BitmapFactory.decodeResource(getResources(), R.drawable.schedule_selected) as Bitmap
        //set datas
        while(x<10){
            if(x != 2) {
                val items = listItem() as listItem
                items.setThumb(thumbdata)
                items.setText("sample")
                items.setText2("投稿時間:" + "sample")
                array.add(items)
            }
            else{
                val items = listItem() as listItem
                items.setThumb(thumbdata2)
                items.setText("hoge")
                items.setText2("投稿時間:" + "hoge")
                array.add(items)
            }
            x++
        }
        //set adapter
        val la = listAdapter(this, R.layout.list_with_image, array) as listAdapter
        lv.setAdapter(la)
    }
}