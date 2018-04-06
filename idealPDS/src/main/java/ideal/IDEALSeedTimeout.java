/*******************************************************************************
 * Copyright (c) 2018 Fraunhofer IEM, Paderborn, Germany.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Johannes Spaeth - initial API and implementation
 *******************************************************************************/
package ideal;

import boomerang.WeightedBoomerang;
import wpds.impl.Weight;

/**
 * Created by johannesspath on 01.12.17.
 */
public class IDEALSeedTimeout extends RuntimeException {
    private final IDEALSeedSolver<? extends Weight> solver;
    private WeightedBoomerang<? extends Weight> timedoutSolver;

    public <W extends Weight> IDEALSeedTimeout(IDEALSeedSolver<W> solver, WeightedBoomerang<W> timedoutSolver) {
        this.solver = solver;
        this.timedoutSolver = timedoutSolver;
    }

    public IDEALSeedSolver<? extends Weight> getSolver() {
        return solver;
    }

    public WeightedBoomerang<? extends Weight> getTimedoutSolver() {
        return timedoutSolver;
    }

    @Override
    public String toString() {
        return "IDEAL Seed TimeoutException \n";
    }
}
