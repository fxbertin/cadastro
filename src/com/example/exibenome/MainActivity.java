package com.example.exibenome;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final TextView txt = (TextView) findViewById(R.id.txt);
		final EditText edt = (EditText) findViewById(R.id.edt);
		Button btn = (Button) findViewById(R.id.btn);

		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String string = edt.getText().toString();

				string = "Ol� " + string;

				txt.setText(string);

			}
		});

	}

}
