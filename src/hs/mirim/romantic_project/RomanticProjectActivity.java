package hs.mirim.romantic_project;
import hs.mirim.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class RomanticProjectActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				Intent intent=new Intent(RomanticProjectActivity.this, PlanAdd.class);				
				startActivity(intent);
				finish();
			}
		}, 2000);
    }
}