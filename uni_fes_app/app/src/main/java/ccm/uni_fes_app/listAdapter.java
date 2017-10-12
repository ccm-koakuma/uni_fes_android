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

        //set imagefield
        listItem item = Items.get(position);
        ImageView thumb = (ImageView)view.findViewById(R.id.list_image);
        thumb.setImageBitmap(item.getThumb());
        //set textfield
        TextView listText = (TextView)view.findViewById(R.id.list_text);
        listText.setText(item.getText());

        return view;
    }
}
