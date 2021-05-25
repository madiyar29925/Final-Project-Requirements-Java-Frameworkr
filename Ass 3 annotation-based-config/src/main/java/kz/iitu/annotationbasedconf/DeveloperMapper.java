//package kz.iitu.annotationbasedconf;
//
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.lang.Nullable;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class DeveloperMapper implements RowMapper<Developer> {
//
//    @Nullable
//    @Override
//    public Developer mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//        Developer developer = new Developer();
//        developer.setName(rs.getString("name"));
//        return developer;
//    }
//}
