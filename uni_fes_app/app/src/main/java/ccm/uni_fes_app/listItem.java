package ccm.uni_fes_app;

import android.graphics.Bitmap;

public class listItem {
    private String listText = null;
    private Bitmap thumb = null;
    private String listText2 = null;

    public listItem(){};

    public listItem(Bitmap thumb, String listText, String time){
        this.listText = listText;
        this.thumb = thumb;
        this.listText2 = time;
    }

    public listItem(String string, String string2){
        this.listText = string;
        this.listText2 = string2;
    }
    public void setThumb(Bitmap thumb){
        this.thumb = thumb;
    }
    public void setText(String listText){
        this.listText = listText;
    }
    public void setText2(String listText2){this.listText2 = listText2;}
    public Bitmap getThumb(){
        return this.thumb;
    }
    public String getText(){
        return this.listText;
    }
    public String getText2(){return this.listText2;}
}
