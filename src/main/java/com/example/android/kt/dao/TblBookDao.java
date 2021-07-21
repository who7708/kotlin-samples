package com.example.android.kt.dao;

import com.example.android.kt.model.TblBook;
import com.example.android.kt.model.TblBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblBookDao {
    long countByExample(TblBookExample example);

    int deleteByExample(TblBookExample example);

    int deleteByPrimaryKey(String bookId);

    int insert(TblBook record);

    int insertSelective(TblBook record);

    List<TblBook> selectByExample(TblBookExample example);

    TblBook selectByPrimaryKey(String bookId);

    int updateByExampleSelective(@Param("record") TblBook record, @Param("example") TblBookExample example);

    int updateByExample(@Param("record") TblBook record, @Param("example") TblBookExample example);

    int updateByPrimaryKeySelective(TblBook record);

    int updateByPrimaryKey(TblBook record);
}