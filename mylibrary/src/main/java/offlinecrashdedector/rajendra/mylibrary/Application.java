package offlinecrashdedector.rajendra.mylibrary;

import android.widget.Toast;

/**
 * Created by gwl on 12/10/16.
 */

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(getApplicationContext(),"WOW",Toast.LENGTH_LONG).show();
    }
}
