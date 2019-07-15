package com.blogspot.onodasakamichi.kalkulatorsuper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {
	EditText ang1, ang2;
	Button btnHps, btnHitung;
	TextView Hasil;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ang1 = (EditText)findViewById(R.id.input1);
		ang2 = (EditText)findViewById(R.id.input2);
		btnHps = (Button)findViewById(R.id.btnHps);
		btnHitung = (Button) findViewById(R.id.btnHitung);
		Hasil = (TextView)findViewById(R.id.Hasil);
		
		btnHps.setOnClickListener(this);
		btnHitung.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnHps:
			ang1.setText("");
			ang2.setText("");
			Hasil.setText("");
			
			break;
		case R.id.btnHitung:
			String a = ang1.getText().toString();
			String b = ang2.getText().toString();
			if(a.isEmpty() | b.isEmpty() ){
				Toast.makeText(MainActivity.this, "Input masih kosong", Toast.LENGTH_SHORT).show();
				
			}else{
				int i1 = Integer.parseInt(a);
				int i2 = Integer.parseInt(b);
				int total = i1+i2;
				Hasil.setText("Hasil "+ total);
			}
			
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		
	}

}
