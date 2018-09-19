package spring.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import spring.project.domain.city;

@Mapper
public interface cityMapper {

	@Select("select * from city where city_id = #{id}")
	city findById(@Param("id") String id);

}