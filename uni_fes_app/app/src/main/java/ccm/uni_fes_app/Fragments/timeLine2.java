package ccm.uni_fes_app.Fragments;

import ccm.uni_fes_app.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//list view
import android.widget.ListView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import ccm.uni_fes_app.listItem;
import ccm.uni_fes_app.listAdapter2;

public class timeLine2 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.time_line2, null);
    }
    @Override
    public void onViewCreated(View v, Bundle savedInstanceState){
        ArrayList<listItem> al = new ArrayList<listItem>();
        for(int i=0;i<30;i++){
            listItem listitem = new listItem();
            listitem.setText("title ? ? ");
            listitem.setText2("hogehog hogehoge");
            al.add(listitem);
        }
        listAdapter2 aa = new listAdapter2(this.getContext(),R.layout.list_content,al);
        ListView lv = (ListView)v.findViewById(R.id.listView);
        lv.setAdapter(aa);
    }
}
