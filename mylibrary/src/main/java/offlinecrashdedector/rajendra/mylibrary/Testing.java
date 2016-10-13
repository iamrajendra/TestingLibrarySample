package offlinecrashdedector.rajendra.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by gwl on 12/10/16.
 */

public class Testing  {
    private Context context ;

    public Testing(Context context) {
        this.context = context;
    }

    public void showMessage()
    {
        Toast.makeText(context,"Wow we are in Lib",Toast.LENGTH_LONG).show();
    }
}
