package spring.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import spring.project.domain.address;

@Mapper
public interface addressMapper {

	@Select("select * from address where address_id = #{id}")
	address findById(@Param("id") String id);

}