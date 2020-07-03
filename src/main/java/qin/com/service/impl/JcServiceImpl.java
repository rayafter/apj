package qin.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qin.com.entity.Jc;
import qin.com.entity.JcWithBLOBs;
import qin.com.mapper.JcMapper;
import qin.com.service.JcService;

@Service("JcServiceImpl")
public class JcServiceImpl implements JcService {
    @Autowired
    private JcMapper jcMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return jcMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(JcWithBLOBs record) {
        return jcMapper.insert(record);
    }

    @Override
    public int insertSelective(JcWithBLOBs record) {
        return jcMapper.insertSelective(record);
    }

    @Override
    public JcWithBLOBs selectByPrimaryKey(Integer id) {
        return jcMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(JcWithBLOBs record) {
        return jcMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(JcWithBLOBs record) {
        return jcMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(Jc record) {
        return jcMapper.updateByPrimaryKey(record);
    }
}
