package th.ku.wongnokmicroservice.History;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HistoryController {

    @Autowired
    private HistoryRepository repository;

    @PostMapping("/AddHistory")
    public String saveHistory(@RequestBody History history) {
        repository.save(history);
        return "Added History : " + history.getName();
    }

    @GetMapping("/findAllHistory")
    public List<History> getAllHistory() {
        return repository.findAll();
    }

    @GetMapping("/findHistoryByStatus/{status}")
    public List<History> getHistoryByStatus(@PathVariable String status) {return  repository.findAllByStatus(status);}

    @GetMapping("/findHistoryByPhoneNum/{phoneNum}")
    public History getHistoryByPhoneNum(@PathVariable String phoneNum) {
        return repository.findByPhoneNum(phoneNum);
    }

    @GetMapping("/findOldCustomer/{phoneNum}/{status}")
    public  History getOldCustomer(@PathVariable String phoneNum, @PathVariable String status) {
        return repository.findByPhoneNumAndStatus(phoneNum, status);
    }

    @GetMapping("/findOldCustomer/{id}/{status}")
    public  History getOldCustomerByIdAndStatus(@PathVariable String id, @PathVariable String status) {
        return repository.findByPhoneNumAndStatus(id, status);
    }



    @DeleteMapping("/deleteHistoryInfoByPhone/{phoneNum}")
    public String deleteHistoryByPhone(@PathVariable String phoneNum) {
        repository.deleteByPhoneNum(phoneNum);
        return "delete : " + phoneNum;
    }

    @DeleteMapping("/deleteHistoryInfoById/{id}")
    public String deleteHistoryById(@PathVariable String id) {
        repository.deleteById(id);
        return "delete : " + id;
    }

    @DeleteMapping("/deleteAllHistory")
    public String deleteHistory() {
        repository.deleteAll();
        return "delete all history";
    }
}

