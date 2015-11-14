package com.example.androidautostartup;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by choqu_000 on 13/11/2015.
 * Esta interfaz describe el protocolo abstracto para interactuar con un objeto utilizable de forma remota
 */
public class AutoInicio extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Servicio Iniciado", Toast.LENGTH_LONG).show();
        // do something when the service is created
    }
}
