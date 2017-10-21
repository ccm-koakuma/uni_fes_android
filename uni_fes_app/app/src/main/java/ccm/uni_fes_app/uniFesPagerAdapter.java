package ccm.uni_fes_app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ccm.uni_fes_app.Fragments.shopRecommend;
import ccm.uni_fes_app.Fragments.timeLine;
import ccm.uni_fes_app.Fragments.timeLine2;

//json parse
import org.json.JSONObject;
import org.json.JSONArray;

public class uniFesPagerAdapter extends FragmentStatePagerAdapter{
    String json = "";
    public uniFesPagerAdapter(FragmentManager fm, String json){
        super(fm);
        this.json = json;
    }
    @Override
    public Fragment getItem(int i){
        switch(i){
            case 0:
                return new timeLine(json);
            case 1:
                return new timeLine2(json);
            case 2:
                shopRecommend shp = new shopRecommend();
                return shp;
            default:
                return new timeLine(json);
        }
    }
    @Override
    public int getCount(){
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position){
        switch(position){
            case 0:
                return "10/28";
            case 1:
                return "10/29";
            case 2:
                return "お気に入りイベント";
            default:
                return "page" + position;
        }
    }
}
