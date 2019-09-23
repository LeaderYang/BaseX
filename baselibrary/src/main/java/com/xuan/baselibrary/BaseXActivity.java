package com.xuan.baselibrary;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BaseXActivity extends AppCompatActivity implements IDialogHolder {

    private AlertDialog dialog;

    public BaseXActivity() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.dismissDialog();
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }

    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    public boolean showDialog(AlertDialog alertDialog) {
        this.dismissDialog();
        if (!this.isFinishing()) {
            this.dialog = alertDialog;
            this.dialog.show();
            return true;
        } else {
            return false;
        }
    }

    public void dismissDialog() {
        if (this.dialog != null) {
            this.dialog.dismiss();
            this.dialog = null;
        }

    }


}
