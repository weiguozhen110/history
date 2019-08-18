package server.cms.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import server.model.domain.cms.CmsConfig;

public interface CmsConfigRepository extends MongoRepository<CmsConfig,String> {
}
