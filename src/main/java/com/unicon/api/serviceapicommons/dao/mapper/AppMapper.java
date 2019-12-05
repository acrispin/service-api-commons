package com.unicon.api.serviceapicommons.dao.mapper;

import org.apache.ibatis.annotations.Select;

/**
 *
 * @author acrispin
 */
public interface AppMapper {
    @Select("SELECT @@SERVERNAME")
    String selectServer();

    @Select("SELECT @@SPID")
    String selectSessionId();

    @Select("SELECT SUSER_SNAME()")
    String selectUsername();
}