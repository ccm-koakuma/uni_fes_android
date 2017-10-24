package ccm.uni_fes_app

import android.app.Activity
import android.os.Bundle
//widget
import android.widget.ImageButton
//content intent
import android.content.Intent

class mapPage:Activity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map_page)
        //widget initialize here
        val homebutton = findViewById(R.id.homebutton)
        val schedulebutton = findViewById(R.id.schedulebutton)
        val shopbutton = findViewById(R.id.shopbutton)
        val mapbutton = findViewById(R.id.mapbutton) as ImageButton

        //under menu
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
        mapbutton.setImageResource(R.drawable.map)
    }
}