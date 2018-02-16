package com.example.basicservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Un servicio inicialmente es infinito, por lo que la actividad
 * debe pararlo. Rara vez necesitaremos un servicio infinito.
 * Nunca un service puede interactuar con la vista, es decir,
 * no puede lanzar toast ni nada. Para ello se comunica con la activity.
 */

public class BasicService extends Service {


    //Metodo para unir el service con la activity
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //Toast.makeText(this, "Servicio iniciado", Toast.LENGTH_LONG).show();
        //Dependiendo de que devolvamos aqui será un tipo de service u otro.
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this, "Servicio destruido", Toast.LENGTH_LONG).show();
    }
}
