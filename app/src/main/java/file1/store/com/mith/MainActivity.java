package file1.store.com.mith;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Spinner;
import android.view.*;


public class MainActivity extends ActionBarActivity {


    public Spinner sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1=(Spinner)findViewById(R.id.static_spinner);
        Button btn1=(Button)findViewById(R.id.button);
        final Context context= this;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String str = sp1.getSelectedItem().toString();
                if (str.equals("beauty and fitness")) {

                    Intent intent = new Intent(context, beautyfitness.class);
                    startActivity(intent);

                } else if (str.equals("carpentry")) {

                    Intent intent = new Intent(context, carpentry.class);
                    startActivity(intent);

                } else if (str.equals("computer")) {

                    Intent intent = new Intent(context, computer.class);
                    startActivity(intent);

                } else if (str.equals("Electrical")) {

                    Intent intent = new Intent(context, electrical.class);
                    startActivity(intent);

                } else if (str.equals("HomePainting")) {

                    Intent intent = new Intent(context, HomePainting.class);
                    startActivity(intent);

                } else if (str.equals("House keeping")) {

                    Intent intent = new Intent(context, HouseKeeoing.class);
                    startActivity(intent);

                } else if (str.equals("Laundry")) {

                    Intent intent = new Intent(context, Laundry.class);
                    startActivity(intent);


                } else if (str.equals("Pest control")) {

                    Intent intent = new Intent(context, PestControl.class);
                    startActivity(intent);
                } else if (str.equals("Plumbing")) {

                    Intent intent = new Intent(context, Plumbing.class);
                    startActivity(intent);
                } else if (str.equals("Spiritual")) {

                    Intent intent = new Intent(context, Spiritual.class);
                    startActivity(intent);
                }


            }}
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
