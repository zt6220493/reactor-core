/*
 * Copyright (c) 2011-2016 Pivotal Software Inc, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package reactor.util;

import org.junit.Assert;
import org.junit.Test;
import reactor.core.Exceptions;

/**
 * @author Stephane Maldini
 */
public class ExceptionTests {

	@Test
	public void testWrapping() throws Exception {

		Throwable t = new Exception("test");

		Throwable w = Exceptions.bubble(Exceptions.propagate(t));

		Assert.assertTrue(Exceptions.unwrap(w) == t);
	}
}