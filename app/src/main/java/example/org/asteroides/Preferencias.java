package example.org.asteroides;


import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Vespertino on 06/11/2017.
 */

public class Preferencias extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}
