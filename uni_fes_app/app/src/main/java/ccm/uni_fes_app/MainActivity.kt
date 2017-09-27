package ccm.uni_fes_app

import android.os.Bundle

//add widget library
import android.widget.TextView
import android.widget.Button
import android.widget.Toast
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

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //widget initialize here
        val testbutton = findViewById(R.id.testbutton) as Button
        val homebutton = findViewById(R.id.homebutton) as Button
        val shopbutton = findViewById(R.id.shopbutton) as Button
        val schedulebutton = findViewById(R.id.schedulebutton) as Button

        //action below
        shopbutton.setOnClickListener{
            v->
            val intent = Intent(this, recommend_shops::class.java)
            startActivity(intent)
        }
        schedulebutton.setOnClickListener{
            v->
            val intent = Intent(this, schedule::class.java)
            startActivity(intent)
        }
    }
    fun makeToast(text: String){
        val toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
        toast.show()
    }
}
