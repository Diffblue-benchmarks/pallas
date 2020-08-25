package com.vip.pallas.search.shutdown;

import static org.mockito.Mockito.mock;

import com.vip.pallas.search.netty.http.server.PallasNettyServer;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.shutdown.ShutdownHandler
 *
 * @author Diffblue Cover
 */

public class ShutdownHandlerTest {

	@Test
	public void factory() {
		ShutdownHandler shutdownHandler =
			 new ShutdownHandler(new PallasNettyServer());
		shutdownHandler.setContextClassLoader(ClassLoader.getSystemClassLoader());
		shutdownHandler.setDaemon(false);
		shutdownHandler.setName("Acme");
		shutdownHandler.setPriority(1);
		Thread.UncaughtExceptionHandler x14 =
			 mock(Thread.UncaughtExceptionHandler.class);
		shutdownHandler.setUncaughtExceptionHandler(x14);
		// pojo ShutdownHandler
	}
}
