package airline2;

class Aircraft {
    private int id; 
    private Position currentPos; 
    public Aircraft(int id, double lon, double lat) {
        this.id = id;
        this.currentPos = new Position(lon, lat); 
    }
    public Position getCurrentPos() {
        return currentPos;
    }
    public void display() {
        System.out.printf("飞机[%d]当前位置: 经度:%.1f, 纬度:%.1f\n",
                id, currentPos.getLongitude(), currentPos.getLatitude());
    }
}
