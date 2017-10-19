package ccm.uni_fes_app;

import android.os.AsyncTask;
import okhttp3.*;
import android.util.Log;

public class getJson extends AsyncTask<String,Void,String>{
    @Override
    protected String doInBackground(String... param){
        try {
            OkHttpClient client = new OkHttpClient();
            Request req = new Request.Builder().url(param[0]).get().build();
            Response res = client.newCall(req).execute();
            return res.body().string();
        }catch(Exception e) {
            Log.e("error","error",e);
            return null;
        }
    }
    @Override
    protected void onPostExecute(String json){

    }
}
