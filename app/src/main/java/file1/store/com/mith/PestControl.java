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
public class PestControl extends ListActivity {
    String str[]=
            {"Bed-Bugs Pest Control","Cockroach Pest Control","Rodents Pest Control","Spiders Pest Control",
                    "House Pest Control","Garden Pest Control"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.carpentry);
        setListAdapter(new ArrayAdapter<String>(PestControl.this, android.R.layout.simple_list_item_1, str));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String cheese=str[position];
        try {
            Class ourClass=Class.forName("file1.store.com.mith." + cheese);
            Intent ourIntent=new Intent(PestControl.this,ourClass);
            startActivity(ourIntent);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}