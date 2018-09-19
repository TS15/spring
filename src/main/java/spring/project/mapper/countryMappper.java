package spring.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import spring.project.domain.country;

@Mapper
public interface countryMappper {

	@Select("select * from country where country_id = #{id}")
	country findById(@Param("id") String id);

}