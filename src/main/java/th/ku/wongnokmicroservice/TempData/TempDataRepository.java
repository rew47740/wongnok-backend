package th.ku.wongnokmicroservice.TempData;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TempDataRepository extends MongoRepository<TempData, String> {
}
