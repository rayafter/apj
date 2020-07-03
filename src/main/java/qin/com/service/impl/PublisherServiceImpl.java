package qin.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qin.com.entity.Publisher;
import qin.com.mapper.PublisherMapper;
import qin.com.service.PublisherService;


@Service("publisherServiceImpl")
public class PublisherServiceImpl implements PublisherService {
    @Autowired
    private PublisherMapper publisherMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return publisherMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Publisher record) {
        return publisherMapper.insert(record);
    }

    @Override
    public int insertSelective(Publisher record) {
        return publisherMapper.insertSelective(record);
    }

    @Override
    public Publisher selectByPrimaryKey(Integer id) {
        return publisherMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Publisher record) {
        return publisherMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Publisher record) {
        return publisherMapper.updateByPrimaryKey(record);
    }
}
