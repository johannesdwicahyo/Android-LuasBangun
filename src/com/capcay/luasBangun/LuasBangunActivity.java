package com.capcay.luasBangun;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
	 
public class LuasBangunActivity extends ListActivity {
	 
	    /** Called when the activity is first created. */
	 
	    public void onCreate(Bundle icicle) {
	        super.onCreate(icicle);
	 
	        // Create an array of Strings, that will be put to our ListActivity
	        String[] bangundatar = new String[] { "Persegi Panjang", "Segitiga", "Lingkaran", "Exit"};
	        // Create an ArrayAdapter, that will actually make the Strings above
	        // appear in the ListView
	        //Menset nilai array ke dalam list adapater sehingga data pada array akan dimunculkan dalam list
	        this.setListAdapter(new ArrayAdapter<String>(this,
	                android.R.layout.simple_list_item_1, bangundatar));
	    }
	 
	    @Override
	    protected void onListItemClick(ListView l, View v, int position, long id) {
	        super.onListItemClick(l, v, position, id);
	        // Get the item that was clicked
	        //Menangkap nilai text yang dklik
	        Object o = this.getListAdapter().getItem(position);
	        String pilihan = o.toString();
	        tampilkanPilihan(pilihan);
	        }
	        	 
	         /**
	         * Tampilkan Activity sesuai dengan menu yang dipilih
	         *
	         */
	      protected void tampilkanPilihan(String pilihan) {
	      	        try {
	       	            //Intent digunakan untuk sebagai pengenal suatu activity
	       	            Intent i = null;
	       	            if (pilihan.equals("Persegi Panjang")) {
	       	                i = new Intent(this, HitungPersegiPanjang.class);
	       	            } else if (pilihan.equals("Segitiga")) {
	       	                i = new Intent(this, HitungSegitiga.class);
	       	            } else if (pilihan.equals("Lingkaran")) {
	       	                i = new Intent(this, HitungLingkaran.class);
	       	            } else if (pilihan.equals("Exit")) {
	       	                finish();
	       	            } else {
	       	                Toast.makeText(this,"Anda Memilih: " + pilihan + " , Actionnya belum dibuat", Toast.LENGTH_LONG).show();
	       	            }
	        	            startActivity(i);
	        	        } catch (Exception e) {
	        	            e.printStackTrace();
	        	        }
       	    }
}