package io.sharif.prj1.st92105876.st92105781;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.*;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String names[] = {"Melika Behjati  92105781", "Mina Rafiei      92105876"};
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View convertView = (View) inflater.inflate(R.layout.dialog, null);
        alertDialog.setView(convertView);
        alertDialog.setTitle("About Us");
        ListView lv = (ListView) convertView.findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        lv.setAdapter(adapter);
        alertDialog.show();
        return true;
    }

    public void showGameMenu (View v) {

        PopupMenu gameMenuPopup =  new PopupMenu(MyActivity.this, v);
        gameMenuPopup.getMenuInflater().inflate(R.menu.menu1, gameMenuPopup.getMenu());
//        gameMenuPopup.setOnMenuItemClickListener(this);
//        gameMenuPopup.inflate(R.menu.menu1);
        gameMenuPopup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Log.d("menu","clicked");
                Toast.makeText(MyActivity.this,"You Clicked : "+item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        gameMenuPopup.show();

    }


    public void goUp (View v){
        ImageView gopher = (ImageView) findViewById(R.id.imageView2);
        RelativeLayout.LayoutParams param = (RelativeLayout.LayoutParams) gopher.getLayoutParams();
        param.topMargin -= 10;
        gopher.setLayoutParams(param);

    }

    public void goDown (View v){
        ImageView gopher = (ImageView) findViewById(R.id.imageView2);
        RelativeLayout.LayoutParams param = (RelativeLayout.LayoutParams) gopher.getLayoutParams();
        param.topMargin += 10;
        gopher.setLayoutParams(param);

    }

    public void goRight (View v){
        ImageView gopher = (ImageView) findViewById(R.id.imageView2);
        RelativeLayout.LayoutParams param = (RelativeLayout.LayoutParams) gopher.getLayoutParams();
        param.leftMargin += 10;
        gopher.setLayoutParams(param);

    }

    public void goLeft (View v){
        ImageView gopher = (ImageView) findViewById(R.id.imageView2);
        RelativeLayout.LayoutParams param = (RelativeLayout.LayoutParams) gopher.getLayoutParams();
        param.leftMargin -= 10;
        gopher.setLayoutParams(param);

    }
}
