package com.rogama.appvistasincluyebotonconanimacion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	static EditText entrada;
	static TextView salida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        
        
//        entrada = (EditText)findViewById(R.id.editText1);
//        salida = (TextView)findViewById(R.id.textView1);
        /**************LEER PARA USO DE FRAGMENT******************/
        /*
        Todo esto esta mas abajo en la clase PlaceholderFragment
        autocreada por Eclipse, en la que hay que asignar el id
        mediante el findById de cada elemento que corresponda al fragment
        AQUI SOLO los que correspondan con la activity
        */
    }


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            entrada = (EditText)rootView.findViewById(R.id.numEntrada);
            salida = (TextView)rootView.findViewById(R.id.numSalida);
            return rootView;
        }
    }

    public void sePulsa(View view){
        Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT).show();
        salida.setText(String.valueOf(Float.parseFloat(entrada.getText().toString())*2.0));
    }
    public void sePulsa0(View view){
        //entrada.setText(entrada.getText()+"0");
        
    	//Se hace lo mismo que en la linea Superior, pero cogiendo el valor del Tag
    	entrada.setText(entrada.getText()+(String)view.getTag());
    }
    /**
     * A placeholder fragment containing a simple view.
     */

}


