package edu.unc.nirjon.mycustomimagelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] s1 = {"Bee", "Soccer", "Green"};
    String[] s2 = {"Animal insects", "Sports goods", "Basic colors"};
    Integer[] img = {R.drawable.bee, R.drawable.soccer, R.drawable.green};
    ListView lv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lstview);
        lv.setAdapter(new MyCustomeAdapter(this, s1, s2, img));
    }
}
