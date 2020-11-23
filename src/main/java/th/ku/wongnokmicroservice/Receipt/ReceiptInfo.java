package th.ku.wongnokmicroservice.Receipt;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "ReceiptInfo")
public class ReceiptInfo {

    private String id;

    private String name;
    private String phoneNum;
    private String datePayment;
    private String timePayment;
    private String dateCheckIn;
    private String dateCheckOut;
    private String price;
    private String url;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getDatePayment() {
        return datePayment;
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

    public void setDatePayment(String datePayment) {
        this.datePayment = datePayment;
    }

    public String getTimePayment() {
        return timePayment;
    }

    public void setTimePayment(String timePayment) {
        this.timePayment = timePayment;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
