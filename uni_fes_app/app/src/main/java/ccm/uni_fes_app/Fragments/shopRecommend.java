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

public class shopRecommend extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.favoriteshops, null);
    }
    @Override
    public void onViewCreated(View v, Bundle savedInstanceState){
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            al.add(i);
        }
        ArrayAdapter<Integer> aa = new ArrayAdapter<Integer>(this.getContext(),android.R.layout.simple_list_item_1,al);
        ListView lv = (ListView)v.findViewById(R.id.favoriteList);
        lv.setAdapter(aa);
    }
}
