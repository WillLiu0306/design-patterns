package com.lwh.template.jdbc;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

public class MemberDao extends JdbcTemplate{
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql = "select * from t_test";
        return this.executeQuery(sql, new RowMapper() {
            public Object mapRow(ResultSet re, int rowNum) throws Exception {
                Member m = new Member();
                m.setAge(re.getInt("age"));
                m.setName(re.getString("name"));
                return m;
            }
        }, null);
    }
}
