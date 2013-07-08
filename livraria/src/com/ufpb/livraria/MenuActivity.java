package com.ufpb.livraria;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
        
		final MenuActivity act = this;
		
		
		Button venda = (Button)findViewById(R.id.venda_button);
		venda.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(act,VendaActivity.class));
            }
        });
		
		Button estoque = (Button)findViewById(R.id.estoque_button);
		estoque.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {;
                startActivity(new Intent(act,EstoqueActivity.class));
            }
        });
		
		Button transacoes = (Button)findViewById(R.id.transacoes_button);
		transacoes.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {;
                startActivity(new Intent(act,TransacoesActivity.class));
            }
        });
		
		Button sair = (Button)findViewById(R.id.sair_button);
		sair.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {;
                startActivity(new Intent(act,MainActivity.class));
                act.finish();
            }
        });
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
