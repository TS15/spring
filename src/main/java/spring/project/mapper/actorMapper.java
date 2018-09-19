package spring.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import spring.project.domain.actor;

@Mapper
public interface actorMapper {

	@Select("select * from actor where actor_id = #{id}")
	actor findById(@Param("id") String id);

}