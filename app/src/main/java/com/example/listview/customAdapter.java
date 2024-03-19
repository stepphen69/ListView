package com.example.listview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter extends BaseAdapter {
    private String Contactlist[];
    private int avatar[];

    Context context;

    public customAdapter(String[] Contactlist, int[] avatar, Context context){
        this.Contactlist=Contactlist;
        this.avatar=avatar;
        this.context=context;
    }
    @Override
    public int getCount(){
        return Contactlist.length;
    }
    @Override
    public Object getItem(int position){
        return null;
    }
    @Override
    public long getItemId(int position){return 0;}
@Override
    public View getView(int position, View convertView, ViewGroup parent){
    LayoutInflater layoutInflater= (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View view= layoutInflater.inflate(R.layout.activity_listview,null);

    ImageView image= (ImageView) view.findViewById(R.id.icon_flag);
    TextView text_flag= (TextView)view.findViewById(R.id.text_data);

    image.setImageResource(avatar[position]);
    text_flag.setText(Contactlist[position]);
    return view;
}
}
