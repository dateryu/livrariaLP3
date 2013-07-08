package com.ufpb.livraria;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableRow;

public class EstoqueActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_estoque);
        TableRow row=(TableRow)findViewById(R.id.ex_row);
        row.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent itemInfo=new Intent(EstoqueActivity.this,VerItemActivity.class);
                startActivity(itemInfo);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.estoque, menu);
		return true;
	}

}
