package th.ku.wongnokmicroservice.TempData;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "TempData")
public class TempData {

    @Id
    private String id;

    private float cost;
    private String dateCheckIn;
    private String dateCheckOut;
    private int reserveA;
    private int reserveB;
    private int reserveC;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getDateCheckIn() {
        return dateCheckIn;
    }

    public void setDateCheckIn(String dateCheckIn) {
        this.dateCheckIn = dateCheckIn;
    }

    public String getDateCheckOut() {
        return dateCheckOut;
    }

    public void setDateCheckOut(String dateCheckOut) {
        this.dateCheckOut = dateCheckOut;
    }

    public int getReserveA() {
        return reserveA;
    }

    public void setReserveA(int reserveA) {
        this.reserveA = reserveA;
    }

    public int getReserveB() {
        return reserveB;
    }

    public void setReserveB(int reserveB) {
        this.reserveB = reserveB;
    }

    public int getReserveC() {
        return reserveC;
    }

    public void setReserveC(int reserveC) {
        this.reserveC = reserveC;
    }

    public int getDateCount() {
        return dateCount;
    }

    public void setDateCount(int dateCount) {
        this.dateCount = dateCount;
    }

    private int dateCount;
}
