/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProblemEntryOperationsTest;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ConditionEntryOperationsTest extends ProblemEntryOperationsTest {

	protected static final String CODE = "whatever";

	protected static final String CODE_SYSTEM = "2.16.840.1.113883.3.88.12.3221.7.2";

	// private static final String VALUE_CODE_SYSTEM = "2.16.840.1.113883.3.88.12.3221.7.4";

	private static final CDATestCase TEST_CASE_ARRAY[] = {

	// // EffectiveTime
	// // -------------------------------------------------------------
	// new EffectiveTimeCCDValidationTest() {
	// @Override
	// protected boolean validate(final EObject objectToTest,
	// final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return ConditionEntryOperations
	// .validateConditionEntryEffectiveTime(
	// (ConditionEntry) objectToTest,
	// diagnostician, map);
	// }
	// },
	//
	// // Condition Entry Text
	// //-------------------------------------------------------------
	// new CCDValidationTestCase("text") {
	// @Override
	// protected boolean validate(final EObject objectToTest,
	// final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return ConditionEntryOperations.
	// validateConditionEntryText(
	// (ConditionEntry) objectToTest,
	// diagnostician, map);
	// }
	//
	// @Override
	// protected Object getValueToSet() {
	// return DatatypesFactory.eINSTANCE.createED("some text");
	// }
	// }

	}; // TEST_CASE_ARRAY

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}

	@Override
	protected EObject getObjectToTest() {
		final ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		final Section section = CDAFactory.eINSTANCE.createSection();
		clinicalDocument.addSection(section);
		final ConditionEntry conditionEntry = HITSPFactory.eINSTANCE.createConditionEntry();
		section.addObservation(conditionEntry);
		return conditionEntry;
		// return HITSPFactory.eINSTANCE.createConditionEntry();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return HITSPFactory.eINSTANCE.createConditionEntry().init();
	}

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		ConditionEntryOperations obj = new ConditionEntryOperations();
		assertTrue(true);
	} // testConstructor
} // ConditionEntryOperationsTest
