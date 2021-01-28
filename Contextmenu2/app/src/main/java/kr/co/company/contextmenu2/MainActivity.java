package kr.co.company.contextmenu2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener, ActionMode.Callback {

    ActionMode mActionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text =(TextView) findViewById(R.id.TextView01);
        text.setOnLongClickListener(this);
    }

    @Override
    public boolean onCreateActionMode(ActionMode mode, Menu menu){
        MenuInflater inflater = mode.getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
        return true;
    }

    @Override
    public boolean onPrepareActionMode(ActionMode mode, Menu menu){
        return false;
    }

    @Override
    public boolean onActionItemClicked(ActionMode mode , MenuItem item){
        switch (item.getItemId()){
            case R.id.share:
                mode.finish();
                return true;
            default:
                return false;
        }
    }

    @Override
    public void onDestroyActionMode(ActionMode mode){
        mActionMode = null;
    }

    public boolean onLongClick(View view){
        if(mActionMode != null)
            return false;

        mActionMode = this.startActionMode(this);
        view.setSelected(true);
        return true;
    }



}