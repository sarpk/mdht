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
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.VisibleImplantedMedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.VisibleImplantedMedicalDevicesSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Visible Implanted Medical Devices Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VisibleImplantedMedicalDevicesSection#validateVisibleImplantedMedicalDevicesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visible Implanted Medical Devices Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VisibleImplantedMedicalDevicesSection#validateVisibleImplantedMedicalDevicesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visible Implanted Medical Devices Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VisibleImplantedMedicalDevicesSection#validateVisibleImplantedMedicalDevicesSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visible Implanted Medical Devices Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VisibleImplantedMedicalDevicesSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VisibleImplantedMedicalDevicesSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVisibleImplantedMedicalDevicesSectionTemplateId() {
		OperationsTestCase<VisibleImplantedMedicalDevicesSection> validateVisibleImplantedMedicalDevicesSectionTemplateIdTestCase = new OperationsTestCase<VisibleImplantedMedicalDevicesSection>(
			"validateVisibleImplantedMedicalDevicesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VisibleImplantedMedicalDevicesSection target) {

			}

			@Override
			protected void updateToPass(VisibleImplantedMedicalDevicesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VisibleImplantedMedicalDevicesSectionOperations.validateVisibleImplantedMedicalDevicesSectionTemplateId(
					(VisibleImplantedMedicalDevicesSection) objectToTest, diagnostician, map);
			}

		};

		validateVisibleImplantedMedicalDevicesSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVisibleImplantedMedicalDevicesSectionCode() {
		OperationsTestCase<VisibleImplantedMedicalDevicesSection> validateVisibleImplantedMedicalDevicesSectionCodeTestCase = new OperationsTestCase<VisibleImplantedMedicalDevicesSection>(
			"validateVisibleImplantedMedicalDevicesSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VisibleImplantedMedicalDevicesSection target) {

			}

			@Override
			protected void updateToPass(VisibleImplantedMedicalDevicesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VisibleImplantedMedicalDevicesSectionOperations.validateVisibleImplantedMedicalDevicesSectionCode(
					(VisibleImplantedMedicalDevicesSection) objectToTest, diagnostician, map);
			}

		};

		validateVisibleImplantedMedicalDevicesSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVisibleImplantedMedicalDevicesSectionProblemEntry() {
		OperationsTestCase<VisibleImplantedMedicalDevicesSection> validateVisibleImplantedMedicalDevicesSectionProblemEntryTestCase = new OperationsTestCase<VisibleImplantedMedicalDevicesSection>(
			"validateVisibleImplantedMedicalDevicesSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VisibleImplantedMedicalDevicesSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(VisibleImplantedMedicalDevicesSection target) {
				target.addObservation(IHEFactory.eINSTANCE.createProblemEntry().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VisibleImplantedMedicalDevicesSectionOperations.validateVisibleImplantedMedicalDevicesSectionProblemEntry(
					(VisibleImplantedMedicalDevicesSection) objectToTest, diagnostician, map);
			}

		};

		validateVisibleImplantedMedicalDevicesSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		VisibleImplantedMedicalDevicesSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VisibleImplantedMedicalDevicesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VisibleImplantedMedicalDevicesSection> {
		public VisibleImplantedMedicalDevicesSection create() {
			return IHEFactory.eINSTANCE.createVisibleImplantedMedicalDevicesSection();
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
	* @generated
	*/
	private static class ConstructorTestClass extends VisibleImplantedMedicalDevicesSectionOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
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

} // VisibleImplantedMedicalDevicesSectionOperations
