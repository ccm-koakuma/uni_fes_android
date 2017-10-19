package ccm.uni_fes_app.Fragments;

import ccm.uni_fes_app.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//widget
//list view
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import ccm.uni_fes_app.listItem;
import ccm.uni_fes_app.listAdapter2;
//http get json
import ccm.uni_fes_app.getJson;

public class shopRecommend extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.favoriteshops, null);
    }
    @Override
    public void onViewCreated(View v, Bundle savedInstanceState){
        ArrayList<listItem> al = new ArrayList<listItem>();
        for(int i=0;i<10;i++){
            listItem li = new listItem();
            li.setText("title title");
            li.setText2("content");
            al.add(li);
        }
        listAdapter2 aa = new listAdapter2(this.getContext(),R.layout.list_content,al);
        ListView lv = (ListView)v.findViewById(R.id.favoriteList);
        lv.setAdapter(aa);
    }
}
