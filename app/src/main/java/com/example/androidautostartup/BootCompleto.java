package com.example.androidautostartup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by choqu_000 on 13/11/2015.
 * Clase donde recibimos nuestras peticiones
 */
public class BootCompleto extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        //Se dispara por el sistema una vez que el sistema Android ha
        // completado el proceso de arranque
        if (intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)) {
            Intent serviceIntent = new Intent(context, AutoInicio.class);
            context.startService(serviceIntent);
        }
    }
}
