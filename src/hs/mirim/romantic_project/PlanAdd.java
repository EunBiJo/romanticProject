package hs.mirim.romantic_project;

import hs.mirim.R;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class PlanAdd extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.planadd);
		
		final ArrayList<String> items = new ArrayList<String>();
		items.add("첫번째 항목");
		items.add("두번째 항목");

		ListView listChar = (ListView)findViewById(R.id.planadd_listview);
		PlanAdd_row adapter 
				= new PlanAdd_row(this, 
						R.layout.planadd_row, 
						items);
		listChar.setAdapter(adapter);
	}
}
