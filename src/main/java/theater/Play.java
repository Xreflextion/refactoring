package theater;

/**
 * Class representing a play.
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        type = newType;
    }

}
