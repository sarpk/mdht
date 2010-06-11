/**
 * Copyright (c) 2010 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class SeverityObservationOperationsTest extends CCDValidationTest {

	protected static final String SEVERITY_OBSERVATION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.55";

	protected static final String STATUS_CODE = "completed";
	protected static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	protected static final String CODE = "SEV";
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.5.4";

	// Likely incorrect value, not specified in OCL.
	private static final String OBSERVATION_VALUE_CODE_SYSTEM = "2.16.840.1.113883.1.11.20.3";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
			// -------------------------------------------------------------
			new TemplateIDCCDValidationTest(SEVERITY_OBSERVATION_TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return SeverityObservationOperations
							.validateSeverityObservationTemplateId(
									(SeverityObservation) eObjectToTest,
									diagnostician, map);
				}

			},

			// Status Code
			// -------------------------------------------------------------
			new StatusCodeCCDValidationTest(STATUS_CODE,
					STATUS_CODE_CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return SeverityObservationOperations
							.validateSeverityObservationStatusCode(
									(SeverityObservation) eObjectToTest,
									diagnostician, map);
				}
			},

			// Code
			// -------------------------------------------------------------
			new CodeCCDValidationTest(CODE, CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return SeverityObservationOperations
							.validateSeverityObservationCode(
									(SeverityObservation) eObjectToTest,
									diagnostician, map);
				}
			},

			// ObservationValue
			// -------------------------------------------------------------
			new ObservationValueCCDValidationTest(OBSERVATION_VALUE_CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return SeverityObservationOperations
							.validateSeverityObservationValue(
									(SeverityObservation) eObjectToTest,
									diagnostician, map);
				}
			}

	}; // TEST_CASE_ARRAY

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		return new ArrayList<CDATestCase>(Arrays.asList(TEST_CASE_ARRAY));
	}

	@Override
	protected EObject getEObjectToValidate() {
		return CCDFactory.eINSTANCE.createSeverityObservation();
	}

	@Override
	protected EObject getEObjectInitToValidate() {
		return CCDFactory.eINSTANCE.createSeverityObservation().init();
	}

} // SeverityObservationOperationsTest