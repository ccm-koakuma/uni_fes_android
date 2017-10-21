package ccm.uni_fes_app.Fragments;

import ccm.uni_fes_app.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//Log
import android.util.Log;

//List View
import java.util.ArrayList;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import ccm.uni_fes_app.listItem;
import ccm.uni_fes_app.listAdapter2;

//json
import org.json.JSONObject;
import org.json.JSONArray;

public class timeLine extends Fragment{
    private String json = "";
    public timeLine(String json){
        this.json = json;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.time_line, null);
    }
    @Override
    public void onViewCreated(View v, Bundle savedInstanceState){
        ArrayList<listItem> al = new ArrayList<listItem>();
        try{
            JSONArray ja = new JSONArray(this.json);
            int amount = ja.length();
            for(int i=0; i<amount; i++){
                if(ja.getJSONObject(i).getString("time").substring(0,2).equals("30")){
                    listItem li = new listItem();
                    li.setText(ja.getJSONObject(i).getString("title"));
                    li.setText2("time: " + ja.getJSONObject(i).getString("time").substring(2,2) + ":" + ja.getJSONObject(i).getString("time").substring(4,2));
                    al.add(li);
                }
            }
        }catch(Exception e){
            Log.e("error","error",e);
        }
        listAdapter2 aa = new listAdapter2(this.getContext(),R.layout.list_content,al);
        ListView lv = (ListView)v.findViewById(R.id.listView);
        lv.setAdapter(aa);
    }
}
