package ccm.uni_fes_app

import android.support.v4.app.FragmentActivity
import android.os.Bundle
//ArrayList
import java.util.ArrayList
//Array Adapter be used when you use listView
import android.widget.ArrayAdapter
//widget
import android.widget.ListView
import android.widget.ImageButton
//change Activity
import android.content.Intent

class recommend_shops : FragmentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recommend_shops)

        val arrayList = ArrayList<listItem>() as ArrayList<listItem>
        var x = 0 as Int
        while(x < 10){
            val listitem = listItem() as listItem
            listitem.setText("title")
            listitem.setText2("mjd")
            arrayList.add(listitem)
            x++
        }
        val arrayAdapter = listAdapter2(this,R.layout.list_content,arrayList) as listAdapter2
        val listView = findViewById(R.id.listView) as ListView
        listView.setAdapter(arrayAdapter)

        //under menu below
        val homebutton = findViewById(R.id.homebutton) as ImageButton
        val schedulebutton = findViewById(R.id.schedulebutton) as ImageButton
        val mapbutton = findViewById(R.id.mapbutton) as ImageButton

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