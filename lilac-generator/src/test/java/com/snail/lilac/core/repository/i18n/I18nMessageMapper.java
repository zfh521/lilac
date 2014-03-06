package com.snail.lilac.core.repository.i18n;

import com.snail.lilac.core.repository.i18n.I18nMessage;
import com.snail.lilac.core.repository.i18n.I18nMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface I18nMessageMapper {
    int countByExample(I18nMessageExample example);

    int deleteByExample(I18nMessageExample example);

    int deleteByPrimaryKey(String id);

    int insert(I18nMessage record);

    int insertSelective(I18nMessage record);

    List<I18nMessage> selectByExampleWithBLOBs(I18nMessageExample example);

    List<I18nMessage> selectByExample(I18nMessageExample example);

    I18nMessage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") I18nMessage record, @Param("example") I18nMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") I18nMessage record, @Param("example") I18nMessageExample example);

    int updateByExample(@Param("record") I18nMessage record, @Param("example") I18nMessageExample example);

    int updateByPrimaryKeySelective(I18nMessage record);

    int updateByPrimaryKeyWithBLOBs(I18nMessage record);

    int updateByPrimaryKey(I18nMessage record);
}