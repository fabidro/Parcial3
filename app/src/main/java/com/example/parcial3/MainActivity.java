package com.example.parcial3;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    SensorManager sm;
    TextView SensorLuz, SensorAcelerometro, SensorOrientacion, SensorTemperatura, SensorPosicion;
    List<Sensor> temperatura, Luz, Acelerometro, Orientacion, posicion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SensorLuz = (TextView) findViewById(R.id.SensorLuz);
        SensorAcelerometro = (TextView) findViewById(R.id.SensorAcelerometro);
        SensorOrientacion = (TextView) findViewById(R.id.SensorOrientacion);
        SensorTemperatura = (TextView) findViewById(R.id.SensorTemperatura);
        SensorPosicion = (TextView) findViewById(R.id.SensorPosicion);

        sm = (SensorManager) getSystemService(SENSOR_SERVICE);//declaramos el sensor manager
        temperatura = sm.getSensorList(Sensor.TYPE_AMBIENT_TEMPERATURE);
        if (temperatura.size() > 0) { // vamos a ver si hay algun sensor "por lo menos hay uno
            SensorTemperatura.setText("Si hay");
        } else {
            SensorTemperatura.setText("No hay");
        }



        Luz = sm.getSensorList(Sensor.TYPE_LIGHT);
        if (Luz.size() > 0) { // vamos a ver si hay algun sensor "por lo menos hay uno
            SensorLuz.setText("Si tiene");
        } else {
            SensorLuz.setText("No tiene");
        }


        Acelerometro = sm.getSensorList(Sensor.TYPE_ACCELEROMETER);
        if (Acelerometro.size() > 0) { // vamos a ver si hay algun sensor "por lo menos hay uno
            SensorAcelerometro.setText("Si tiene");
        } else {
            SensorAcelerometro.setText("No Tiene");
        }


        Orientacion = sm.getSensorList(Sensor.TYPE_ORIENTATION);
        if (Orientacion.size() > 0) { // vamos a ver si hay algun sensor "por lo menos hay uno
            SensorOrientacion.setText("Si hay");
        } else {
            SensorOrientacion.setText("No hay");
        }

        
        posicion = sm.getSensorList(Sensor.TYPE_ROTATION_VECTOR);
        if (posicion.size() > 0) { // vamos a ver si hay algun sensor "por lo menos hay uno
            SensorPosicion.setText("Si hay");
        } else {
            SensorPosicion.setText("No hay");
        }
    }
}
