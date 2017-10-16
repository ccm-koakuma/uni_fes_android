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
//Lunch other app
import android.net.Uri
//Use Bitmap -> grahics -> picture
import android.graphics.Bitmap
import android.graphics.BitmapFactory

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //widget initialize
        val homebutton = findViewById(R.id.homebutton) as ImageButton
        val schedulebutton = findViewById(R.id.schedulebutton) as ImageButton
        val shopbutton = findViewById(R.id.shopbutton) as ImageButton
        val mapbutton = findViewById(R.id.mapbutton) as ImageButton
        val seeAll = findViewById(R.id.allnewsbutton) as ImageButton
        val newsimage1 = findViewById(R.id.newsimage1) as ImageButton
        val newsimage2 = findViewById(R.id.newsimage2) as ImageButton
        val newsimage3 = findViewById(R.id.newsimage3) as ImageButton
        val twitterbutton = findViewById(R.id.sendcomment) as Button

        //twitter list
        val strList = ArrayList<listItem>() as ArrayList<listItem>
        val pic = BitmapFactory.decodeResource(getResources(), R.drawable.damy) as Bitmap
        var i = 0
        while(i<10){
            val listitem = listItem() as listItem
            listitem.setText("学祭まじまじ")
            listitem.setThumb(pic)
            listitem.setText2("投稿時間は未定なのです")
            strList.add(listitem)
            i++
        }
        val arrayadapter = listAdapter(this,R.layout.list_with_image,strList) as listAdapter
        val twitterlist = findViewById(R.id.twitterlist) as ListView
        twitterlist.setAdapter(arrayadapter)

        //under menu
        homebutton.setImageResource(R.drawable.home)
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
        //under menu above

        seeAll.setOnClickListener{
            v->
            val intent = Intent(this, allNews::class.java)
            startActivity(intent)
        }
        newsimage1.setOnClickListener{
            v->
            val uri = Uri.parse("http://tpumarker.net") as Uri
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
        newsimage2.setOnClickListener{
            v->
            val uri = Uri.parse("http://tpumarker.net") as Uri
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
        newsimage3.setOnClickListener{
            v->
            val uri = Uri.parse("http://tpumarker.net") as Uri
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
        twitterbutton.setOnClickListener{
            v->
            val uri = Uri.parse("https://twitter.com") as Uri
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
    }
    fun makeToast(text: String){
        val toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
        toast.show()
    }
}
