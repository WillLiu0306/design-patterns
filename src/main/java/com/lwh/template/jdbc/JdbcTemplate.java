package com.lwh.template.jdbc;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql,RowMapper rowMapper,Object[] values){
        List<?> results = null;
        Connection connection = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            connection = this.getConnection();
            pstm = this.getStatement(connection,sql);
            rs = this.executeQuery(pstm,values);
            results = this.preHandleResult(rs,rowMapper);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                this.closeResultSet(rs);
                this.closePreparedStatement(pstm);
                this.closeConnection(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return results;
    }

    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    private PreparedStatement getStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    private ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws SQLException {
        for (int i=0;i<values.length;i++){
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }

    private List<?> preHandleResult(ResultSet resultSet,RowMapper rowMapper) throws Exception {
        List<Object> results = new ArrayList<Object>();
        int num = 1;
        while (resultSet.next()){
            results.add(rowMapper.mapRow(resultSet, num++));
        }
        return results;
    }

    private void closeConnection(Connection connection) throws SQLException {
        if (null != connection){
            connection.close();
        }
    }

    private void closePreparedStatement(PreparedStatement pstm) throws SQLException {
        if (null != pstm){
            pstm.close();
        }
    }

    private void closeResultSet(ResultSet rs) throws SQLException {
        if (null != rs){
            rs.close();
        }
    }

}
