package ccm.uni_fes_app;

import android.graphics.Bitmap;

public class listItem {
    private String listText = null;
    private Bitmap thumb = null;

    public listItem(){};

    public listItem(Bitmap thumb, String listText){
        this.listText = listText;
        this.thumb = thumb;
    }
    public void setThumb(Bitmap thumb){
        this.thumb = thumb;
    }
    public void setText(String listText){
        this.listText = listText;
    }
    public Bitmap getThumb(){
        return this.thumb;
    }
    public String getText(){
        return this.listText;
    }
}
