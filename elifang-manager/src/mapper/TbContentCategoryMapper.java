package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import po.TbContentCategory;
import po.TbContentCategoryQuery;

public interface TbContentCategoryMapper {
    long countByExample(TbContentCategoryQuery example);

    int deleteByExample(TbContentCategoryQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbContentCategory record);

    int insertSelective(TbContentCategory record);

    List<TbContentCategory> selectByExample(TbContentCategoryQuery example);

    TbContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryQuery example);

    int updateByExample(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryQuery example);

    int updateByPrimaryKeySelective(TbContentCategory record);

    int updateByPrimaryKey(TbContentCategory record);
}