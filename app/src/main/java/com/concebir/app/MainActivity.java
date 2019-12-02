package com.concebir.app;

import android.os.Bundle;
import android.view.MenuItem;


import com.concebir.app.Fragments.Add.fragment_agregar;
import com.concebir.app.Fragments.Busqueda.fragment_busqueda;
import com.concebir.app.Fragments.Nosotros.frament_nosotros;
import com.concebir.app.Fragments.Notificacion.fragment_notificacion;
import com.concebir.app.Fragments.Principal.fragment_principal;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav = findViewById(R.id.botton_navigation);

        bottomNav.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new fragment_principal()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectFragment = null;
                    switch (menuItem.getItemId()){
                        case R.id.menu_principal:
                            selectFragment = new fragment_principal();
                            break;
                        case R.id.menu_lupa:
                            selectFragment = new fragment_busqueda();
                            break;
                        case R.id.menu_sum:
                            selectFragment = new fragment_agregar();
                            break;
                        case R.id.menu_notificacion:
                            selectFragment = new fragment_notificacion();
                            break;
                        case R.id.menu_nosotros:
                            selectFragment = new frament_nosotros();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectFragment).commit();

                    return true;
                }
            };

}