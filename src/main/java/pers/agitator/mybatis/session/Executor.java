package pers.agitator.mybatis.session;

import pers.agitator.mybatis.config.MapperBean;

import java.util.List;

/**
 * 执行器
 */
public interface Executor {
    <E> List<E> query(MapperBean mapper, Object... params);
}