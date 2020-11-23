package th.ku.wongnokmicroservice.BookingInfo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "BookingInfo")
public class BookingInfo {


    private String id;

    private String name;
    private String phoneNum;
    private String email;
    private String details;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;
}

