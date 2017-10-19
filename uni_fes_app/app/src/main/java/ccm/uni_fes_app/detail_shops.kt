package ccm.uni_fes_app

import android.app.Activity
import android.os.Bundle
//widget
import android.widget.ImageButton
import android.widget.TextView
//change activity
import android.content.Intent
//json library
import org.json.JSONObject
import org.json.JSONArray

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
        val json_str = intent.getStringExtra("json")

        try{
            val jsonarray = JSONArray(json_str) as JSONArray
            var i = 0
            val amount = jsonarray.length()
            while(i < amount){
                val id_str = jsonarray.getJSONObject(i).getString("id")
                if(id_str == intent.getStringExtra("id")){
                    titletext.setText(jsonarray.getJSONObject(i).getString("stname"))
                    contenttext.setText(
                            jsonarray.getJSONObject(i).getString("slname") + "\n" +
                            jsonarray.getJSONObject(i).getString("location") + "\n" +
                            jsonarray.getJSONObject(i).getString("detail")
                    )
                }
                i++
            }
        }catch(e: Exception){

        }
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