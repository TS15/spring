package spring.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import spring.project.domain.category;

@Mapper
public interface categoryMapper {

	@Select("select * from category where category_id = #{id}")
	category findById(@Param("id") String id);

}