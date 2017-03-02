package anhbn46555.fpt.edu.vn.hello5;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saySomething(View view) {

        Toast.makeText(getApplicationContext(), "Today is a good day.", Toast.LENGTH_SHORT).show();
        double sum = 0.0;
        for (int i=0; i<1000; i++) {
            sum += i;
        }

        Toast.makeText(getApplicationContext(), "Sum from 0 to 999 is: " + sum, Toast.LENGTH_LONG).show();
        Log.v("Hello5", "Sum is: " + sum);

    }
}
