/**
 * Copyright (c) 2015 Digi International Inc.,
 * All rights not expressly granted are reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * Digi International Inc. 11001 Bren Road East, Minnetonka, MN 55343
 * =======================================================================
 */
package com.digi.xbee.api.exceptions;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperationNotSupportedExceptionTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.OperationNotSupportedException#OperationNotSupportedException()}.
	 */
	@Test
	public final void testCreateOperationNotSupportedExceptionDefault() {
		// Setup the resources for the test.
		String expectedMessage = "The requested operation is not supported by either the connection interface or the XBee device.";
		
		// Call the method under test.
		OperationNotSupportedException e = new OperationNotSupportedException();
		
		// Verify the result.
		assertThat("Created 'OperationNotSupportedException' does not have the expected message", 
				e.getMessage(), is(equalTo(expectedMessage)));
		assertThat("Created 'OperationNotSupportedException' does not have the expected cause", 
				e.getCause(), is(nullValue(Throwable.class)));
	}
	
	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.OperationNotSupportedException#OperationNotSupportedException(String)}.
	 */
	@Test
	public final void testCreateOperationNotSupportedExceptionMessage() {
		// Setup the resources for the test.
		String message = "This is the message";
		
		// Call the method under test.
		OperationNotSupportedException e = new OperationNotSupportedException(message);
		
		// Verify the result.
		assertThat("Created 'OperationNotSupportedException' does not have the expected message", 
				e.getMessage(), is(equalTo(message)));
		assertThat("Created 'OperationNotSupportedException' does not have the expected cause", 
				e.getCause(), is(nullValue(Throwable.class)));
	}
	
	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.OperationNotSupportedException#OperationNotSupportedException(String)}.
	 */
	@Test
	public final void testCreateOperationNotSupportedExceptionMessageNull() {
		// Setup the resources for the test.
		String message = null;
		
		// Call the method under test.
		OperationNotSupportedException e = new OperationNotSupportedException(message);
		
		// Verify the result.
		assertThat("Created 'OperationNotSupportedException' does not have the expected message", 
				e.getMessage(), is(equalTo(message)));
		assertThat("Created 'OperationNotSupportedException' does not have the expected cause", 
				e.getCause(), is(nullValue(Throwable.class)));
	}
	
	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.OperationNotSupportedException#OperationNotSupportedException(String, Throwable)}.
	 */
	@Test
	public final void testCreateOperationNotSupportedExceptionMessageAndCause() {
		// Setup the resources for the test.
		String message = "This is the message";
		Throwable cause = new Exception();
		
		// Call the method under test.
		OperationNotSupportedException e = new OperationNotSupportedException(message, cause);
		
		// Verify the result.
		assertThat("Created 'OperationNotSupportedException' does not have the expected message", 
				e.getMessage(), is(equalTo(message)));
		assertThat("Created 'OperationNotSupportedException' does not have the expected cause", 
				e.getCause(), is(equalTo(cause)));
	}
	
	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.OperationNotSupportedException#OperationNotSupportedException(String, Throwable)}.
	 */
	@Test
	public final void testOperationNotSupportedExceptionMessageNullAndCause() {
		// Setup the resources for the test.
		String message = null;
		Throwable cause = new Exception();
		
		// Call the method under test.
		OperationNotSupportedException e = new OperationNotSupportedException(message, cause);
		
		// Verify the result.
		assertThat("Created 'OperationNotSupportedException' does not have the expected message", 
				e.getMessage(), is(equalTo(message)));
		assertThat("Created 'OperationNotSupportedException' does not have the expected cause", 
				e.getCause(), is(equalTo(cause)));
	}
	
	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.OperationNotSupportedException#OperationNotSupportedException(String, Throwable)}.
	 */
	@Test
	public final void testCreateOperationNotSupportedExceptionMessageAndCauseNull() {
		// Setup the resources for the test.
		String message = "This is the message";
		Throwable cause = null;
		
		// Call the method under test.
		OperationNotSupportedException e = new OperationNotSupportedException(message, cause);
		
		// Verify the result.
		assertThat("Created 'OperationNotSupportedException' does not have the expected message", 
				e.getMessage(), is(equalTo(message)));
		assertThat("Created 'OperationNotSupportedException' does not have the expected cause", 
				e.getCause(), is(equalTo(cause)));
	}
	
	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.OperationNotSupportedException#OperationNotSupportedException(String, Throwable)}.
	 */
	@Test
	public final void testCreateOperationNotSupportedExceptionMessageAndCauseBothNull() {
		// Setup the resources for the test.
		String message = null;
		Throwable cause = null;
		
		// Call the method under test.
		OperationNotSupportedException e = new OperationNotSupportedException(message, cause);
		
		// Verify the result.
		assertThat("Created 'OperationNotSupportedException' does not have the expected message", 
				e.getMessage(), is(equalTo(message)));
		assertThat("Created 'OperationNotSupportedException' does not have the expected cause", 
				e.getCause(), is(equalTo(cause)));
	}
}
