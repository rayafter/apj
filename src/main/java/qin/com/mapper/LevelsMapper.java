package qin.com.mapper;

import qin.com.entity.Levels;

public interface LevelsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Levels record);

    int insertSelective(Levels record);

    Levels selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Levels record);

    int updateByPrimaryKey(Levels record);
}