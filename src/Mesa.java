public class Mesa implements Formation
{
    private int height;
    private String name;
    private int area;
    public Mesa(int height, String name, int area){
        this.height = height;
        this.name = name;
        this.area = area;

    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }

    public String getInfo() {
        String details = "Type : Mesa, Name : "+this.name+", Height : "+this.height+", Surface Area : "+this.area;
        return details;
    }
}
