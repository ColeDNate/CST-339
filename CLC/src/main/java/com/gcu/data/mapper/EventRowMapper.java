package com.gcu.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gcu.data.EventEntity;

public class EventRowMapper implements RowMapper<EventEntity> {

	@Override
	public EventEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new EventEntity(rs.getLong("ID"),
								rs.getString("EVENT_NAME"), 
								rs.getInt("EVENT_YEAR"), 
								rs.getInt("EVENT_MONTH"), 
								rs.getInt("EVENT_DAY"));
	}

}
