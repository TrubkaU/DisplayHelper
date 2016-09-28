package by.fingers.displayutils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created 27.09.2016.
 */
public class DisplayUtils {


    public static int getWidht(Context context) {
        return getDisplaySize(context).x;
    }

    public static int getHeight(Context context) {
        return getDisplaySize(context).y;
    }


    private static Point getDisplaySize(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(
                Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size;
    }

    public static int dpToPx(int dp)   {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int pxToDp(int px)    {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }
}
