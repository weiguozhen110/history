package server.cms.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import server.model.domain.cms.CmsTemplate;

public interface CmsTemplateRepository extends MongoRepository<CmsTemplate,String> {
}
