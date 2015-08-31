package com.appnucleus.alertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_Main extends Activity implements View.OnClickListener
{
    Context context = Activity_Main.this;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_1_option = (Button) findViewById(R.id.btn_1_option);
        Button button_2_option = (Button) findViewById(R.id.btn_2_option);
        Button button_3_option = (Button) findViewById(R.id.btn_3_option);
        Button button_custom_layout = (Button) findViewById(R.id.btn_custom_layout);

        button_1_option.setOnClickListener(this);
        button_2_option.setOnClickListener(this);
        button_3_option.setOnClickListener(this);
        button_custom_layout.setOnClickListener(this);
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
                openDialog_2_Button();
            }
            break;
            case R.id.btn_3_option:
            {
                //3 option Alert
                openDialog_3_Button();
            }
            break;
            case R.id.btn_custom_layout:
            {
                //Custom Layout Alert
                openDialog_Custom_XML();
            }
            break;
            default:
                break;
        }
    }

    private void openDialog_1_Button()
    {
        new AlertDialog.Builder(context)
                .setTitle("1 Button Dialog")
                .setMessage("Are you sure you want to EXIT this program?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int which)
                    {
                        System.exit(0);
                    }
                })
                .setIcon(android.R.drawable.arrow_up_float)
                .setCancelable(false)
                .show();
    }

    private void openDialog_2_Button()
    {
        new AlertDialog.Builder(context)
                .setTitle("2 Button Dialog")
                .setMessage("Are you sure you want to check this program?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Toast.makeText(getApplicationContext(), "\"OK\" Clicked",
                                Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Toast.makeText(getApplicationContext(), "\"Cancel\" Clicked",
                                Toast.LENGTH_LONG).show();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setCancelable(false)
                .show();
    }

    private void openDialog_3_Button()
    {
        new AlertDialog.Builder(context)
                .setTitle("3 Button Dialog")
                .setMessage("Are you sure you want to check this program?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Toast.makeText(getApplicationContext(), "\"OK\" Clicked",
                                Toast.LENGTH_LONG).show();
                    }
                })
                .setNeutralButton(android.R.string.selectAll, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "\"Select All\" Clicked",
                                Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "\"Cancel\" Clicked",
                                Toast.LENGTH_LONG).show();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setCancelable(false)
                .show();
    }

    private void openDialog_Custom_XML()
    {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_main);

        Button btCancel = (Button) dialog.findViewById(R.id.dialog_cancel);
        Button btOk = (Button) dialog.findViewById(R.id.dialog_ok);
        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Cancel Click
                Toast.makeText(getApplicationContext(), "Canceled !!!!!",Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });
        btOk.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //OK CLICK
                Toast.makeText(getApplicationContext(), "\"OK\" Clicked !!!",Toast.LENGTH_LONG).show();
            }
        });

        dialog.show();
    }
}
