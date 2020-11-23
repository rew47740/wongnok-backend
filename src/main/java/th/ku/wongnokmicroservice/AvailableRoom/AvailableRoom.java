package th.ku.wongnokmicroservice.AvailableRoom;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "AvailableRoom")
public class AvailableRoom {

    @Id
    private String id;

    private String date;
    private int typeA;
    private int typeB;
    private int typeC;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTypeA() {
        return typeA;
    }

    public void setTypeA(int typeA) {
        this.typeA = typeA;
    }

    public int getTypeB() {
        return typeB;
    }

    public void setTypeB(int typeB) {
        this.typeB = typeB;
    }

    public int getTypeC() {
        return typeC;
    }

    public void setTypeC(int typeC) {
        this.typeC = typeC;
    }


}
