package airline2;

class Position {
    private double longitude;
    private double latitude;
    public static final double MIN_COORD=0.0;
    public static final double MAX_COORD=180.0;
    public static int count=0;
    public Position(){
	    longitude=0.0;
	    latitude=0.0;
	    count++;
    }
    public Position(double longitude,double latitude) {
	    this.longitude=longitude;
	    this.latitude=latitude;
	    count++;
    }
    public double getLongitude() {
	    return longitude;
    }
    public void setLongitude(double longitude) {
    	this.longitude=longitude;
    }
    public double getLatitude() {
    	return latitude;
    }
    public void setLatitude(double latitude) {
    	this.latitude=latitude;
    }
    public void display() {
    	System.out.printf(String.format("经度:%.1f, 纬度:%.1f",longitude, latitude));
    }
}
