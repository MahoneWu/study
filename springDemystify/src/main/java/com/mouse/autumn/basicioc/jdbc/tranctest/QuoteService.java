package com.mouse.autumn.basicioc.jdbc.tranctest;

import org.joda.time.DateTime;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Mahone Wu on 2018/8/2.
 */
public class QuoteService implements IQuoteService {

    private JdbcTemplate jdbcTemplate;

    @Override
    public Quote getQuote() {
        return getJdbcTemplate().queryForObject("", new RowMapper<Quote>() {
            @Override
            public Quote mapRow(ResultSet resultSet, int i) throws SQLException {
                Quote quote = new Quote();
                return quote;
            }
        });
    }

    @Override
    public Quote getQuoteByDataTime(DateTime dateTime) {
        throw new NotImplementedException();
    }

    @Override
    public void saveQuote(Quote quote) {
        throw new NotImplementedException();
    }

    @Override
    public void updateQuote(Quote quote) {
        throw new NotImplementedException();
    }

    @Override
    public void deleteQuote(Quote quote) {
        throw new NotImplementedException();
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
