package com.example.superproject;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new festivalFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_reg);
        }
    }
    @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) { switch (item.getItemId()) {
                        case R.id.nav_reg:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                    new festivalFragment()).commit();
                            break;
                        case R.id.nav_program:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                    new ProgramFragment()).commit();
                            break;
                        case R.id.nav_zone:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                    new ZoneFragment()).commit();
                            break;
                        case R.id.nav_chat:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                    new fragment_chat()).commit();
                            break;
                        case R.id.nav_kontact:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                    new fragment_kontack()).commit();
                            break;
                        case R.id.nav_meiker:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                    new fragment_meiker()).commit();
                            break;

                        case R.id.nav_meropr:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                    new fragment_meropr()).commit();
                            break;
                        case R.id.nav_org:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                    new fragment_org()).commit();
                            break;
                        case R.id.nav_partner:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                    new fragment_partner()).commit();
                            break;
                        case R.id.nav_spiker:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                    new fragment_spiker()).commit();
                            break;
                    }
                    drawer.closeDrawer(GravityCompat.START);
                    return true;
                }

    }


