package com.ufpb.livraria;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableRow;

public class VendaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_venda);
		
        TableRow row=(TableRow)findViewById(R.id.ex_row);
        row.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent itemInfo=new Intent(VendaActivity.this,VerItemActivity.class);
                startActivity(itemInfo);
            }
        });
        
		Button terminar=(Button)findViewById(R.id.terminar_button);
        terminar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent menu=new Intent(VendaActivity.this,MenuActivity.class);
                startActivity(menu);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.venda, menu);
		return true;

	}

}
