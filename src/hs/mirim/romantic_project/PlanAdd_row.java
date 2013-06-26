package hs.mirim.romantic_project;

import hs.mirim.R;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class PlanAdd_row extends ArrayAdapter<String> {

	public PlanAdd_row(PlanAdd mainActivity, 
			int listRow,
			ArrayList<String> items) {
		super(mainActivity, listRow, items);
	}

	@Override
	public View getView(int position, View convertView, 
			ViewGroup parent) {
		View view = convertView;
		if (view == null) {
			LayoutInflater inflater = 
					((Activity)getContext()).getLayoutInflater();
			view = inflater.inflate(R.layout.planadd_row, null);
		}
		
		TextView title 
				= (TextView)view.findViewById(R.id.textviewTitle);
		title.setText(getItem(position));
		
		return view;
	}
}