package com.capcay.luasBangun;
 
	/**
	 * Class HitungPersegiPanjang
	 * @version 1.0 July 05, 2011
	 * @author Johannes Dwi Cahyo K (johannesdwicahyo@gmail.com)
	 * @website http://cap-cay.blogspot.com
	 */
	 
	import android.app.Activity;
	import android.os.Bundle;
	import android.view.View;
	import android.widget.Button;
	import android.widget.EditText;
	 
	public class HitungLingkaran extends Activity {
	    private EditText txtJariJari;
	    private EditText txtLuas;
	    private Button btnHitung;
	 
	    /**
	     * Method yang dipanggil pada saat aplikasi dijalankan
	     * */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	 
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.lingkaran);
	        txtJariJari = (EditText) findViewById(R.id.txtJariJari);
	        txtLuas = (EditText) findViewById(R.id.txtLuas);
	        btnHitung = (Button) findViewById(R.id.btnHitung);
	 
	    }
	 
	    /**
	     * Method untuk Menghitung Luas Persegi panjang dipanggil pada saat button
	     * Hitung Luas diklik
	     *
	     * @param view
	     */
	    public void hitungLuas(View view) {
	        try {
	            double jarijari = Double.valueOf(txtJariJari.getText().toString());
	            double phi=3.14;
	            double luas = phi * jarijari * jarijari;
	            txtLuas.setText(String.valueOf(luas));
	            //finish();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	 
	    /**
	     * Method untuk menutup activity dan kembali ke menu
	     * @param view
	     */
	    public void backtoMenu(View view){
	        finish();
	    }
}