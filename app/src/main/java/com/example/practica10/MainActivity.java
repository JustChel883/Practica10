package com.example.practica10;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Создаем экземпляр нашей кастомной View
        Draw2D draw2D = new Draw2D(this);

        // Устанавливаем ее как контент активности
        setContentView(draw2D);

        // Удаляем весь код с WindowInsets, так как он не нужен
        // для кастомной View без системных баров
    }
}