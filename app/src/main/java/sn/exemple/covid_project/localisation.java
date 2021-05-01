package sn.exemple.covid_project;

/*
public class localisation extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localisation);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {


        mMap = googleMap;
        LatLng dakar= new LatLng(14.6919,-17.4474);
        mMap.addMarker(new MarkerOptions().position(dakar).title("marker in dakar"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(dakar));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dakar,10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dakar,10));

        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            final GoogleMap gmap=mMap;
            @Override
            public void onMapClick(LatLng latLng) {
                gmap.addMarker(new MarkerOptions().position(latLng));
                Toast.makeText(localisation.this,latLng.latitude+"-"+latLng.longitude,Toast.LENGTH_SHORT).show();
            }

        });
        CircleOptions circleOptions=new CircleOptions();
        circleOptions.center(dakar);
        circleOptions.radius(700);
        circleOptions.fillColor((android.R.color.transparent));
        circleOptions.strokeWidth(6);
        mMap.addCircle(circleOptions);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.map_options,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.normal:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybrid:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.satellite:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case R.id.terrain:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}*/
