package com.unicon.api.serviceapicommons;

import com.unicon.api.serviceapicommons.dao.DaoApplication;
import com.unicon.api.serviceapicommons.dao.mapper.AppMapper;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceApiCommonsApplicationTests {

	private static Logger log = LoggerFactory.getLogger(ServiceApiCommonsApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("test -----------");
		String server = "", username = "", sessionId = "", enviroment = "";
		try (SqlSession session = DaoApplication.getSqlSessionFactory2().openSession(true)) {
			AppMapper mapper = session.getMapper(AppMapper.class);
			server = mapper.selectServer();
			username = mapper.selectUsername();
			sessionId = mapper.selectSessionId();
			enviroment = session.getConfiguration().getEnvironment().getId();
		} catch (PersistenceException | NullPointerException ex) {
			log.error(ex.getMessage(), ex);
		}
		log.info("server: " + server);
		log.info("username: " + username);
		log.info("sessionId: " + sessionId);
		log.info("enviroment: " + enviroment);
	}

	//@Test
	void contextLoads1() {
		log.info("test1 -----------");
		String server = "", username = "", sessionId = "", enviroment = "";
		try (SqlSession session = DaoApplication.getSqlSessionFactorySdc2("1").openSession(true)) {
			AppMapper mapper = session.getMapper(AppMapper.class);
			server = mapper.selectServer();
			username = mapper.selectUsername();
			sessionId = mapper.selectSessionId();
			enviroment = session.getConfiguration().getEnvironment().getId();
		} catch (PersistenceException | NullPointerException ex) {
			log.error(ex.getMessage(), ex);
		}
		log.info("server: " + server);
		log.info("username: " + username);
		log.info("sessionId: " + sessionId);
		log.info("enviroment: " + enviroment);

		try (SqlSession session = DaoApplication.getSqlSessionFactoryCmd2("1").openSession(true)) {
			AppMapper mapper = session.getMapper(AppMapper.class);
			server = mapper.selectServer();
			username = mapper.selectUsername();
			sessionId = mapper.selectSessionId();
			enviroment = session.getConfiguration().getEnvironment().getId();
		} catch (PersistenceException | NullPointerException ex) {
			log.error(ex.getMessage(), ex);
		}
		log.info("server: " + server);
		log.info("username: " + username);
		log.info("sessionId: " + sessionId);
		log.info("enviroment: " + enviroment);
	}

	//@Test
	void contextLoads2() {
		log.info("test2 -----------");
		String server = "", username = "", sessionId = "", enviroment = "";
		try (SqlSession session = DaoApplication.getSqlSessionFactorySdc2("2").openSession(true)) {
			AppMapper mapper = session.getMapper(AppMapper.class);
			server = mapper.selectServer();
			username = mapper.selectUsername();
			sessionId = mapper.selectSessionId();
			enviroment = session.getConfiguration().getEnvironment().getId();
		} catch (PersistenceException | NullPointerException ex) {
			log.error(ex.getMessage(), ex);
		}
		log.info("server: " + server);
		log.info("username: " + username);
		log.info("sessionId: " + sessionId);
		log.info("enviroment: " + enviroment);

		try (SqlSession session = DaoApplication.getSqlSessionFactoryCmd2("2").openSession(true)) {
			AppMapper mapper = session.getMapper(AppMapper.class);
			server = mapper.selectServer();
			username = mapper.selectUsername();
			sessionId = mapper.selectSessionId();
			enviroment = session.getConfiguration().getEnvironment().getId();
		} catch (PersistenceException | NullPointerException ex) {
			log.error(ex.getMessage(), ex);
		}
		log.info("server: " + server);
		log.info("username: " + username);
		log.info("sessionId: " + sessionId);
		log.info("enviroment: " + enviroment);
	}

}
