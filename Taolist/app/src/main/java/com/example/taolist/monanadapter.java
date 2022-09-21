package com.example.taolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class monanadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<monan> monanList;

    public monanadapter(Context context, int layout, List<monan> monanList) {
        this.context = context;
        this.layout = layout;
        this.monanList = monanList;
    }

    @Override
    public int getCount() {
        return monanList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        // ánh xạ view
        TextView txtTen = (TextView) view.findViewById(R.id.textviewTen);
        TextView txtMoTa = (TextView) view.findViewById(R.id.textviewMoTa);

        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
        // gán giá trị
        monan mon_an = monanList.get(i);

        txtTen.setText(mon_an.getTen());
        txtMoTa.setText(mon_an.getMoTa());
        imgHinh.setImageResource(mon_an.getHinh());

        return view;
    }
}