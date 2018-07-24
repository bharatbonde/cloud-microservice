package bharat.rest.endpoints;

// TODO: Use lombok
public class Starter {
    private String line;
    private String line2;
    private String name;


    public Starter( String line,  String line2,  String name) {
        this.line = line;
        this.line2 = line2;
        this.name = name;
    }

    public Starter() {}


    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
