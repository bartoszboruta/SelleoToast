package com.selleotoast;

import androidx.annotation.NonNull;
import android.content.Context;
import android.widget.Toast;
import android.util.Log;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = SelleoToastModule.NAME)
public class SelleoToastModule extends ReactContextBaseJavaModule {
    public static final String NAME = "SelleoToast";
    private Context mContext;

    public SelleoToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.mContext = reactContext;
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void showToast(String message, int duration) {
        Toast toast = Toast.makeText(this.mContext, message, duration);
        toast.show();
        Log.d("SelleoToast", "Create toast" + message);
    }
}
