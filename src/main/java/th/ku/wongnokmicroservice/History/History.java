package th.ku.wongnokmicroservice.History;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("History")
public class History {

    private String id;

    private String name;
    private String email;
    private String phoneNum;
    private String dateCheckIn;
    private String dateCheckOut;
    private String status;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignRoom() {
        return assignRoom;
    }

    public void setAssignRoom(String assignRoom) {
        this.assignRoom = assignRoom;
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
    private String assignRoom;
    private int reserveA;
    private int reserveB;
    private int reserveC;
}
