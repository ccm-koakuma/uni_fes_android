package ccm.uni_fes_app;

import android.os.Bundle;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.List;

public class listAdapter3 extends ArrayAdapter<listItem> {
    private int layout;
    private List<listItem> Items;
    private LayoutInflater inflater;

    public listAdapter3(Context context, int layout, List<listItem> items){
        super(context, layout, items);

        Items = items;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View view;
        //set view
        if(convertView != null){
            view = convertView;
        }
        else{
            view = inflater.inflate(layout, null);
        }

        TextView tv1 = (TextView)view.findViewById(R.id.list_text);
        TextView tv2 = (TextView)view.findViewById(R.id.time);
        ImageView iv = (ImageView)view.findViewById(R.id.image);

        listItem li = Items.get(position);

        tv1.setText(li.getText());
        tv2.setText(li.getText2());

        if(li.getPIC() == true){
            iv.setImageResource(R.drawable.favorite);
        }

        return view;
    }
}
