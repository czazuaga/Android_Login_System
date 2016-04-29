package my_resources;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by Carlos on 29/04/2016.
 */
public class Alerts {

    private Toast toast;

    public static void showToast(Activity activity, String mensaje) {

        Context context = activity.getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, mensaje, duration);
        toast.show();

    }
}
