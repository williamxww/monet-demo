package com.bow.monet.dao;

import com.bow.monet.entity.MData1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author vv
 * @since 2017/9/10.
 */
public interface MachineDao {

    int insert(@Param("data") List<MData1> data);

    int count();
}
