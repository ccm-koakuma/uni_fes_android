package ccm.uni_fes_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class listAdapter extends ArrayAdapter<listItem> {
    private int layout;
    private List<listItem> Items;
    private LayoutInflater inflater;

    public listAdapter(Context context, int layout, List<listItem> items){
        super(context, layout, items);
        this.layout = layout;
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
        listItem item = Items.get(position);
        //set imagefield
        ImageView thumb = (ImageView)view.findViewById(R.id.list_image);
        thumb.setImageBitmap(item.getThumb());
        //set titlefield
        TextView listText = (TextView)view.findViewById(R.id.list_text);
        listText.setText(item.getText());
        //set timefield
        TextView listTime = (TextView)view.findViewById(R.id.time);
        listTime.setText(item.getText2());
        return view;
    }
}
