package com.example.flias.appcarnaval;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsFragment extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_fragment);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(1.203226, -77.279129);
        mMap.addMarker(new MarkerOptions().position(sydney).title(getResources().getString(R.string.Comienzo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));



        LatLng plazaCarnaval = new LatLng(1.210905, -77.276783);
        mMap.addMarker(new MarkerOptions().position(plazaCarnaval).title(getResources().getString(R.string.Plaza)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(plazaCarnaval));

        LatLng plazaNariño = new LatLng(1.214523, -77.278181);
        mMap.addMarker(new MarkerOptions().position(plazaNariño).title(getResources().getString(R.string.PlazaN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(plazaNariño));

        LatLng estadio = new LatLng(1.198101, -77.278147);
        mMap.addMarker(new MarkerOptions().position(estadio).title(getResources().getString(R.string.Estadio)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(estadio));







        // Add a marker in Sydney and move the camera
        LatLng sydney2 = new LatLng(1.228395, -77.285647);
        mMap.addMarker(new MarkerOptions().position(sydney2).title(getResources().getString(R.string.Fin)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney2, 15));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
        mMap.addPolyline(new PolylineOptions().add(

                sydney,
                new LatLng(1.203015, -77.278894),
                new LatLng(1.204098, -77.275560),
                new LatLng(1.204149, -77.275348),
                new LatLng( 1.205480, -77.274951),
                new LatLng(1.209650, -77.276743),
                new LatLng(1.211420, -77.276465),
                new LatLng(1.213560, -77.277337),
                new LatLng(1.217793, -77.279176),
                new LatLng(1.221901, -77.281011),
                new LatLng(1.222509, -77.280305),
                new LatLng(1.222701, -77.280276),
                new LatLng(1.223188, -77.280627),
                new LatLng(1.223541, -77.280854),
                new LatLng(1.224297, -77.281189),
                new LatLng(1.227753, -77.282921),
                new LatLng(1.231695, -77.284902),
                new LatLng(1.231880, -77.284838),
                new LatLng(1.232157, -77.285007),
                new LatLng(1.231979, -77.285371),
                new LatLng(1.231689, -77.285374),
                new LatLng(1.228395,-77.285647)
                )
                .width(10)
                .color(Color.RED)
        );
    }
}
