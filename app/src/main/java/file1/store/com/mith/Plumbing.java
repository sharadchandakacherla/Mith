package file1.store.com.mith;


import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.view.*;

/**
 * Created by sharad on 11/30/2015.
 */
public class Plumbing extends ListActivity {
    String str[]={"Bathroom Accessories","Bathtub","Basic Plumbing Work","Block Drain",
            "Change pipelines","Flush","Jet","Kitchen Fittings",
            "Leakage in Pipeline","Low Water Pressure","Pipe Fitting","Sanitaryware",
            "Shower","Showerhead","Tap","Tank Cleaning",
            "Tank Fittings","Valve Repair","Water Motor","Water Pump"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.carpentry);
        setListAdapter(new ArrayAdapter<String>(Plumbing.this, android.R.layout.simple_list_item_1, str));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String cheese=str[position];
        try {
            Class ourClass=Class.forName("file1.store.com.mith." + cheese);
            Intent ourIntent=new Intent(Plumbing.this,ourClass);
            startActivity(ourIntent);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}