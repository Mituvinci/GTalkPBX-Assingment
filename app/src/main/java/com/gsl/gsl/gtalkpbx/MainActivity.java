package com.gsl.gsl.gtalkpbx;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.gsl.gsl.gtalkpbx.fragments.CallLoggFragment;
import com.gsl.gsl.gtalkpbx.fragments.DashboardFragment;
import com.gsl.gsl.gtalkpbx.fragments.DialerFragment;
import com.gsl.gsl.gtalkpbx.fragments.NotificationFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private ImageButton mImageButtonItemList;
    private ImageButton mImageButtonDialer;
    private ImageButton mImageButtonCallLog;
    private ImageButton mImageButtonContactList;
    private ImageButton mImageButtonNotification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        mImageButtonItemList = (ImageButton) findViewById(R.id.imageButtonItemList);
        mImageButtonDialer = (ImageButton) findViewById(R.id.imageButtonDialer);
        mImageButtonCallLog =  (ImageButton)findViewById(R.id.imageButtonCallLog);
        mImageButtonContactList = (ImageButton) findViewById(R.id.imageButtonContactList);
        mImageButtonNotification = (ImageButton) findViewById(R.id.imageButtonNotification);

        bottomBarClickEvent();
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Fragment fragment = new DashboardFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.containerHome, fragment);
        fragmentTransaction.commit();
    }

    private void bottomBarClickEvent(){
            mImageButtonItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageButtonItemList.setBackgroundColor(Color.parseColor("#33B5E3"));
                mImageButtonDialer.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonCallLog.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonContactList.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonNotification.setBackgroundColor(Color.parseColor("#175469"));
                Fragment fragment = new DashboardFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerHome, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        mImageButtonDialer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageButtonDialer.setBackgroundColor(Color.parseColor("#33B5E3"));
                mImageButtonItemList.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonCallLog.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonContactList.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonNotification.setBackgroundColor(Color.parseColor("#175469"));
                Fragment fragment = new DialerFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerHome, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        mImageButtonCallLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageButtonCallLog.setBackgroundColor(Color.parseColor("#33B5E3"));
                mImageButtonDialer.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonItemList.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonContactList.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonNotification.setBackgroundColor(Color.parseColor("#175469"));
                Fragment fragment = new CallLoggFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerHome, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        mImageButtonContactList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageButtonContactList.setBackgroundColor(Color.parseColor("#33B5E3"));
                mImageButtonDialer.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonItemList.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonCallLog.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonNotification.setBackgroundColor(Color.parseColor("#175469"));
                Fragment fragment = new CallLoggFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerHome, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        mImageButtonNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageButtonNotification.setBackgroundColor(Color.parseColor("#33B5E3"));
                mImageButtonDialer.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonItemList.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonCallLog.setBackgroundColor(Color.parseColor("#175469"));
                mImageButtonContactList.setBackgroundColor(Color.parseColor("#175469"));
                Fragment fragment = new NotificationFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerHome, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();



                /*
                android.app.Fragment dealsfeed = new DealsfeedFragment();
                    dealsfeed.setArguments(mBundleFromHome);
                    FragmentManager fragmentManagerForDeatailDeal = getActivity().getFragmentManager();
                    FragmentTransaction fragmentTransactionForDetailsFeed = fragmentManagerForDeatailDeal.beginTransaction();
                    fragmentTransactionForDetailsFeed.replace(R.id.containerHome, dealsfeed);
                    fragmentTransactionForDetailsFeed.addToBackStack(null);
                    fragmentTransactionForDetailsFeed.commit();
                 */
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
