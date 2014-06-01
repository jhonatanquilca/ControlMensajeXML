package com.example.controlmensajexml;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import android.widget.Toast;

public class CMXML_MainActivity extends Activity implements OnTouchListener {

	TextView tvWeb;
	TextView tvTutor;
	TextView tvApp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cmxml__main);

		tvWeb = (TextView) findViewById(R.id.textViewWeb);
		tvTutor = (TextView) findViewById(R.id.textViewTutor);
		tvApp = (TextView) findViewById(R.id.textViewApp);

		tvWeb.setOnTouchListener(this);
		tvTutor.setOnTouchListener(this);
		tvApp.setOnTouchListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cmxml__main, menu);
		return true;
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.textViewWeb:
			// Toast peuqeño mensaje de emergencia autogestionado por si mismo
			// que de acuerdo altimepo se desvanece
			Toast t = Toast.makeText(this, "Para sugerencias y reclamos buscame enn facebook:\n jhonydavis@facebook.com", Toast.LENGTH_LONG);
			//metodo que muestra el mensaje toast
			t.show();
			break;
		case R.id.textViewTutor:
			//otraforma de mostrar un mensaje
			Dialog d=new Dialog(this);
			//edita el titulo del mensaje
			d.setTitle("Valoranos");
			//edita el contenido del mensaje
			d.setContentView(R.layout.mensaje);
			//mostrar el dialog
			d.show();
			break;
		case R.id.textViewApp:
			//madar mensaje
			tvApp.setText("Ahora te gusta nuestra app");
			tvApp.setTextColor(Color.BLUE);
			break;
		default:
			break;
		}
		return true;
	}

}
