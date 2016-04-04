package io.sharif.prj1.st92105876.st92105781;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
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

    public void showAboutusMenu (View v) {

        PopupMenu aboutusMenuPopup =  new PopupMenu(MyActivity.this, v);
        aboutusMenuPopup.getMenuInflater().inflate(R.menu.menu2, aboutusMenuPopup.getMenu());
//        aboutusMenuPopup.setOnMenuItemClickListener(new OnMenuItemClickListener() {
//
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//
//
//                return true;
//            }
//        });

        aboutusMenuPopup.show();

    }
}
