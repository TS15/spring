package spring.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import spring.project.domain.addres;

@Mapper
public interface addresMapper {

	@Select("select * from addres where addres_id = #{id}")
	addres findById(@Param("id") String id);

}