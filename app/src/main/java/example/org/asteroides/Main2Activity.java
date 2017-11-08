package example.org.asteroides;

import android.os.Bundle;
import android.app.Activity;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
