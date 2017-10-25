package ccm.uni_fes_app;

import android.webkit.WebView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class customWebView extends WebView{
    public customWebView(Context context) {
        super(context);
    }

    public customWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public customWebView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(event);
    }
}
