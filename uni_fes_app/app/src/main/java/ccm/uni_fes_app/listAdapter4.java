package ccm.uni_fes_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.List;

public class listAdapter4 extends ArrayAdapter<listItem>{
    private int layout;
    private List<listItem> Items;
    private LayoutInflater inflater;
    private Context context;

    public listAdapter4(Context context, int layout, List<listItem> items){
        super(context, layout, items);
        this.layout = layout;
        this.context = context;
        // items have "lisetext" and "thumbneil"
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
        //get list items
        listItem li = Items.get(position);
        //widget initialize
        ImageView imgv = (ImageView)view.findViewById(R.id.shopimage);
        imgv.setImageResource(this.context.getResources().getIdentifier(li.getText(), "drawable","ccm.uni_fes_app"));

        return view;
    }
}
