package com.appnucleus.alertdialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener
{
    Context context = MainActivity.this;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_1_option = (Button) findViewById(R.id.btn_1_option);
        Button button_2_option = (Button) findViewById(R.id.btn_2_option);
        Button button_3_option = (Button) findViewById(R.id.btn_3_option);

        button_1_option.setOnClickListener(this);
        button_2_option.setOnClickListener(this);
        button_3_option.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.btn_1_option:
            {
                //1 option Alert
                openDialog_1_Button();
            }
            break;
            case R.id.btn_2_option:
            {
                //2 option Alert
            }
            break;
            case R.id.btn_3_option:
            {
                //3 option Alert
            }
            break;
            default:
                break;
        }
    }

    private void openDialog_1_Button()
    {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_main);
        dialog.setTitle(R.string.dialog_title);
        dialog.show();
    }
}
