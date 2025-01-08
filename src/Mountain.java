public class Mountain implements Formation{
    private int height;
    private String name;

    public Mountain(int height, String name){
        this.height = height;
        this.name = name;
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

    public String getInfo() {
        String details = "Type : Mountain, Name : "+this.name+", Height : "+this.height;
        return details;
    }
}

