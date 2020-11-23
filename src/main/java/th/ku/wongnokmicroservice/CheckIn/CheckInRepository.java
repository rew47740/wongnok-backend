package th.ku.wongnokmicroservice.CheckIn;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface CheckInRepository extends MongoRepository<CheckInInfo, String> {

    CheckInInfo findByPhoneNum(String phoneNum);
    String deleteByPhoneNum(String phoneNum);

}
