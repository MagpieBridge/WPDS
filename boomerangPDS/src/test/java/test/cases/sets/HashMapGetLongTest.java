/*******************************************************************************
 * Copyright (c) 2018 Fraunhofer IEM, Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Johannes Spaeth - initial API and implementation
 *******************************************************************************/
package test.cases.sets;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import test.cases.fields.Alloc;
import test.core.AbstractBoomerangTest;
import test.core.selfrunning.AllocatedObject;


public class HashMapGetLongTest extends AbstractBoomerangTest{
	@Test
	public void addAndRetrieve(){
		Map<Object,Object> map = new HashMap<>();
		Object key = new Object();
		AllocatedObject alias3 = new Alloc();
		map.put(key,alias3);
		Object query = map.get(key);
		queryFor(query);
	}
	@Test
	public void addAndLoadFromOther(){
		Map<Object,Object> map = new HashMap<>();
		Object key = new Object();
		Object loadKey = new Object();
		AllocatedObject alias3 = new Alloc();
		map.put(key,alias3);
		Object query = map.get(loadKey);
		queryFor(query);
	}
	
	@Override
	protected boolean includeJDK() {
		return true;
	}
}
