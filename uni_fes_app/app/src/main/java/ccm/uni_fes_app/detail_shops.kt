package ccm.uni_fes_app

import android.app.Activity
import android.os.Bundle
//widget
import android.widget.ImageButton
import android.widget.TextView
//change activity
import android.content.Intent

class detail_shops: Activity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shop_detail)

        val homebutton = findViewById(R.id.homebutton) as ImageButton
        val schedulebutton = findViewById(R.id.schedulebutton) as ImageButton
        val shopbutton = findViewById(R.id.shopbutton) as ImageButton
        val mapbutton = findViewById(R.id.mapbutton) as ImageButton
        val titletext = findViewById(R.id.detail_title) as TextView
        val contenttext = findViewById(R.id.detail_text) as TextView

        val intent = getIntent()
        val title = intent.getStringExtra("title")
        val text = intent.getStringExtra("content")

        titletext.setText(title)
        contenttext.setText(text)

        //under menu bar
        shopbutton.setImageResource(R.drawable.shop)
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
    }
}