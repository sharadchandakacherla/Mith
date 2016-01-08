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
public class beautyfitness extends ListActivity {
        String subcat[]={"Massages","Threading","polishing","waxing","Bridal make-up","hair style combos","party make-up","reception make-up","nail|file|polish","regular|manicure|pedicure","hair coloring","hair styling","hair cuts","hair treatments","clean-ups","facial","bleach"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.beautyfitness);
        setListAdapter(new ArrayAdapter<String>(beautyfitness.this,android.R.layout.simple_list_item_1,subcat));


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String cheese=subcat[position];
        try {
            Class ourClass=Class.forName("file1.store.com.mith." + cheese);
            Intent ourIntent=new Intent(beautyfitness.this,ourClass);
            startActivity(ourIntent);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
