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
package test.cases.fields;

import org.junit.Test;

import test.core.AbstractBoomerangTest;
import test.core.selfrunning.AllocatedObject;

public class CastAndSetTest extends AbstractBoomerangTest{
	@Test
	public void setAndGet(){
		Container container = new Container();
		Object o1 = new Object();
		container.set(o1);
		AllocatedObject o2 = new Alloc();
		container.set(o2);
		AllocatedObject alias = container.get();
		queryFor(alias);
	}
	private static class Container{
		AllocatedObject o;
		public void set(Object o1) {
			AllocatedObject var = (AllocatedObject) o1;
			this.o = var;
		}

		public AllocatedObject get() {
			return o;
		}
	}
}
