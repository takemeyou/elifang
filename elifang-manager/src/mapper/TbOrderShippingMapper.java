package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.TbOrderShipping;
import po.TbOrderShippingQuery;

public interface TbOrderShippingMapper {
    long countByExample(TbOrderShippingQuery example);

    int deleteByExample(TbOrderShippingQuery example);

    int deleteByPrimaryKey(String orderId);

    int insert(TbOrderShipping record);

    int insertSelective(TbOrderShipping record);

    List<TbOrderShipping> selectByExample(TbOrderShippingQuery example);

    TbOrderShipping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingQuery example);

    int updateByExample(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingQuery example);

    int updateByPrimaryKeySelective(TbOrderShipping record);

    int updateByPrimaryKey(TbOrderShipping record);
}