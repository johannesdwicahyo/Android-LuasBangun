package com.capcay.luasBangun;
 
	/**
	 * Class HitungSegitiga
	 * @version 1.0 July 05, 2011
	 * @author Johannes Dwi Cahyo K (johannesdwicahyo@gmail.com)
	 * @website http://cap-cay.blogspot.com
	 */
	 
	import android.app.Activity;
	import android.os.Bundle;
	import android.view.View;
	import android.widget.Button;
	import android.widget.EditText;
	 
	public class HitungSegitiga extends Activity {
	    private EditText txtPanjang;
	    private EditText txtTinggi;
	    private EditText txtLuas;
	    private Button btnHitung;
	 
	    /**
	     * Method yang dipanggil pada saat aplikasi dijalankan
	     * */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	 
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.segitiga);
	        txtPanjang = (EditText) findViewById(R.id.txtPanjang);
	        txtTinggi = (EditText) findViewById(R.id.txtTinggi);
	        txtLuas = (EditText) findViewById(R.id.txtLuas);
	        btnHitung = (Button) findViewById(R.id.btnHitung);
	 
	    }
	 
	    /**
	     * Method untuk Menghitung Luas Segitiga dipanggil pada saat button
	     * Hitung Luas diklik
	     *
	     * @param view
	     */
	    public void hitungLuas(View view) {
	        try {
	            double panjang = Double.valueOf(txtPanjang.getText().toString());
	            double tinggi = Double.valueOf(txtTinggi.getText().toString());
	            double luas = panjang * tinggi / 2;
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