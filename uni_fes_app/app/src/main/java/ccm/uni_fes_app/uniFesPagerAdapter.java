package ccm.uni_fes_app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ccm.uni_fes_app.Fragments.shopRecommend;
import ccm.uni_fes_app.Fragments.timeLine;
import ccm.uni_fes_app.Fragments.timeLine2;

public class uniFesPagerAdapter extends FragmentStatePagerAdapter{
    public uniFesPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int i){
        switch(i){
            case 0:
                return new timeLine();
            case 1:
                return new timeLine2();
            case 2:
                shopRecommend shp = new shopRecommend();
                return shp;
            default:
                return new timeLine();
        }
    }
    @Override
    public int getCount(){
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position){
        return "page" + position;
    }
}
