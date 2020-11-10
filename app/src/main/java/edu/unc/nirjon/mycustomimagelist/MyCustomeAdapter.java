package edu.unc.nirjon.mycustomimagelist;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyCustomeAdapter extends BaseAdapter {

    String[] s1, s2;
    Integer[] img;
    MainActivity mainActivity;

    public MyCustomeAdapter (MainActivity mainActivity1, String[] m1, String[] m2, Integer[] img1)
    {
        s1 = m1;
        s2 = m2;
        img = img1;
        mainActivity = mainActivity1;
    }

    @Override
    public int getCount() {
        return s1.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View row = view;
        if(row == null) {
            row = mainActivity.getLayoutInflater().inflate(R.layout.single_row, null, true);
        }

        TextView tv1 = (TextView) row.findViewById(R.id.theline1);
        TextView tv2 = (TextView) row.findViewById(R.id.theline2);
        ImageView imv = (ImageView) row.findViewById(R.id.theimage);

        tv1.setText(s1[i]);
        tv2.setText(s2[i]);
        imv.setBackgroundResource(img[i]);

        return row;
    }
}
