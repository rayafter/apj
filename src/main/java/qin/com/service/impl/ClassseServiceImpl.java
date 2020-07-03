package qin.com.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qin.com.entity.Classse;
import qin.com.mapper.ClassseMapper;
import qin.com.service.ClassseService;

@Service("classseServiceImpl")
public class ClassseServiceImpl implements ClassseService {
    @Autowired
    private ClassseMapper cassseMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cassseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Classse record) {
        return cassseMapper.insert(record);
    }

    @Override
    public int insertSelective(Classse record) {
        return cassseMapper.insertSelective(record);
    }

    @Override
    public Classse selectByPrimaryKey(Integer id) {
        return cassseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Classse record) {
        return cassseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Classse record) {
        return cassseMapper.updateByPrimaryKey(record);
    }
}