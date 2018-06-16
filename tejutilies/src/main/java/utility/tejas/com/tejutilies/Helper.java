package utility.tejas.com.tejutilies;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Helper {

    public static  boolean isNetworkAvailable(Context context){

        final ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        } else {
            return false;
        }
    }

    public static void showDialogBox(Context context,String title,String message,Boolean cancelable){

        ProgressDialog pDialog = new ProgressDialog(context);
        pDialog.setTitle(title);
        pDialog.setMessage(message);
        pDialog.setCancelable(cancelable);
        pDialog.show();

    }

}
