package ccm.uni_fes_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

//add library
import android.widget.TextView
import android.widget.Button
import android.widget.Toast
import okhttp3.*
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // widget initialize
        val textView1 = findViewById(R.id.textView1) as TextView
        val button1 = findViewById(R.id.button1) as Button

        button1.setOnClickListener{
            v->
            object: getHtml(){
                override fun doInBackground(vararg params: Void): String?{
                    return runGetHtml("https://raw.githubusercontent.com/square/okhttp/master/samples/guide/src/main/java/okhttp3/guide/GetExample.java")
                }
                override fun onPostExecute(text: String){
                    textView1.text = text
                }
            }.execute()
        }
    }

    fun makeToast(text: String){
        val toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
        toast.show()
    }

    fun runGetHtml(url: String): String?{
        try {
            val client = OkHttpClient() as OkHttpClient
            val req = Request.Builder().url(url).get().build()
            val res = client.newCall(req).execute()
            return res.body()?.string()
        }catch(e: Exception){
            Log.v("error","e",e)
            return "error"
        }
    }
}
