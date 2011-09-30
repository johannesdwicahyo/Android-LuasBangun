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
	 
	public class HitungPersegiPanjang extends Activity {
	    private EditText txtPanjang;
	    private EditText txtLebar;
	    private EditText txtLuas;
	    private Button btnReset;
	    private Button btnHitung;
	 
	    /**
	     * Method yang dipanggil pada saat aplikasi dijalankan
	     * */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	 
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.persegipanjang);
	        txtPanjang = (EditText) findViewById(R.id.txtPanjang);
	        txtLebar = (EditText) findViewById(R.id.txtLebar);
	        txtLuas = (EditText) findViewById(R.id.txtLuas);
	        btnReset = (Button) findViewById(R.id.btnReset);
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
	            double panjang = Double.valueOf(txtPanjang.getText().toString());
	            double lebar = Double.valueOf(txtLebar.getText().toString());
	            double luas = panjang * lebar;
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
	    public void resetForm(View view) {
	    	try {
	    		txtLuas.setText(String.valueOf(""));
	    		txtPanjang.setText(String.valueOf(""));
		    	txtLebar.setText(String.valueOf(""));
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    }
	    
	    public void backtoMenu(View view){
	        finish();
	    }
}