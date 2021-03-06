/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.LanguageSpokenOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Language Spoken</b></em>' model objects. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken#validateLanguageSpokenNoProficiencyLevelCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Language Spoken No Proficiency Level Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken#validateLanguageSpokenTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Language Spoken Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken#validateLanguageSpokenModeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Language Spoken Mode Code</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class LanguageSpokenTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateLanguageSpokenNoProficiencyLevelCode() {
		OperationsTestCase<LanguageSpoken> validateLanguageSpokenNoProficiencyLevelCodeTestCase = new OperationsTestCase<LanguageSpoken>(
			"validateLanguageSpokenNoProficiencyLevelCode",
			operationsForOCL.getOCLValue("VALIDATE_LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LanguageSpoken target) {
				target.init();
				target.setProficiencyLevelCode(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected void updateToPass(LanguageSpoken target) {
				target.setProficiencyLevelCode(null);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LanguageSpokenOperations.validateLanguageSpokenNoProficiencyLevelCode(
					(LanguageSpoken) objectToTest, diagnostician, map);
			}

		};

		validateLanguageSpokenNoProficiencyLevelCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateLanguageSpokenTemplateId() {
		OperationsTestCase<LanguageSpoken> validateLanguageSpokenTemplateIdTestCase = new OperationsTestCase<LanguageSpoken>(
			"validateLanguageSpokenTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_LANGUAGE_SPOKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LanguageSpoken target) {

			}

			@Override
			protected void updateToPass(LanguageSpoken target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LanguageSpokenOperations.validateLanguageSpokenTemplateId(
					(LanguageSpoken) objectToTest, diagnostician, map);
			}

		};

		validateLanguageSpokenTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLanguageSpokenModeCode() {
		OperationsTestCase<LanguageSpoken> validateLanguageSpokenModeCodeTestCase = new OperationsTestCase<LanguageSpoken>(
			"validateLanguageSpokenModeCode",
			operationsForOCL.getOCLValue("VALIDATE_LANGUAGE_SPOKEN_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LanguageSpoken target) {

			}

			@Override
			protected void updateToPass(LanguageSpoken target) {
				target.init();
				// 2.16.840.1.113883.5.60' and (value.code = 'ESGN' or
				CE ce = DatatypesFactory.eINSTANCE.createCE("ESGN", "2.16.840.1.113883.5.60");

				target.setModeCode(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LanguageSpokenOperations.validateLanguageSpokenModeCode(
					(LanguageSpoken) objectToTest, diagnostician, map);
			}

		};

		validateLanguageSpokenModeCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends LanguageSpokenOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static class ObjectFactory implements TestObjectFactory<LanguageSpoken> {

		public LanguageSpoken create() {
			return HITSPFactory.eINSTANCE.createLanguageSpoken();
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	 * 
	 * @generated
	 */
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends LanguageSpokenOperations {
	}

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	 * 
	 * @generated
	 */

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // LanguageSpokenOperations
