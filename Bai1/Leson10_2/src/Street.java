import javax.xml.namespace.QName;
import java.net.IDN;
public class Street {
 private String streetName;

    public Street() {
    }

    public Street(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
