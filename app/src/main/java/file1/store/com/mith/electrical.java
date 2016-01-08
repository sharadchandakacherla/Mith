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
public class electrical extends ListActivity {
    String str[]={"Air Condition","Air Cooler","Blower/Heater","Changeover","Chimney&Hoods","Dishwashers","Door","Bell","Fans & Coolers","Gas Stove ","Geysers","Hobs","Home","Theatre","Iron","Inverters","Inverter Battery","Main Circuit Panel","Meter board","Microwave","Mixer grinder","Motor","Portable Generator","Projector and ScreenRefrigerator" ,"Stabilizer","Short","circuit Fixing",
            "Switches/MCB &Fuse","Television","Mounting","Tube","Light","CFL&Fancy","Light","Washing Machine","Water","Purifiers"} ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.carpentry);
        setListAdapter(new ArrayAdapter<String>(electrical.this, android.R.layout.simple_list_item_1, str));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String cheese=str[position];
        try {
            Class ourClass=Class.forName("file1.store.com.mith." + cheese);
            Intent ourIntent=new Intent(electrical.this,ourClass);
            startActivity(ourIntent);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}