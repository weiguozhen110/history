package server.cms.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import server.model.domain.cms.CmsPage;

public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
    //根据页面名称查询
    CmsPage findByPageName(String pageName);
}


