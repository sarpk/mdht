/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergiesSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergies Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#validateAllergiesSectionAllergyDrugSensitivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Allergy Drug Sensitivity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection#getnullAllergyDrugSensitivities() <em>Getnull Allergy Drug Sensitivities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergiesSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionTemplateId() {
		OperationsTestCase<AllergiesSection> validateAllergiesSectionTemplateIdTestCase = new OperationsTestCase<AllergiesSection>(
			"validateAllergiesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection target) {

			}

			@Override
			protected void updateToPass(AllergiesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionOperations.validateAllergiesSectionTemplateId(
					(AllergiesSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionCode() {
		OperationsTestCase<AllergiesSection> validateAllergiesSectionCodeTestCase = new OperationsTestCase<AllergiesSection>(
			"validateAllergiesSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection target) {

			}

			@Override
			protected void updateToPass(AllergiesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionOperations.validateAllergiesSectionCode(
					(AllergiesSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionTitle() {
		OperationsTestCase<AllergiesSection> validateAllergiesSectionTitleTestCase = new OperationsTestCase<AllergiesSection>(
			"validateAllergiesSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection target) {

			}

			@Override
			protected void updateToPass(AllergiesSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionOperations.validateAllergiesSectionTitle(
					(AllergiesSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionText() {
		OperationsTestCase<AllergiesSection> validateAllergiesSectionTextTestCase = new OperationsTestCase<AllergiesSection>(
			"validateAllergiesSectionText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection target) {

			}

			@Override
			protected void updateToPass(AllergiesSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionOperations.validateAllergiesSectionText(
					(AllergiesSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionAllergyDrugSensitivity() {
		OperationsTestCase<AllergiesSection> validateAllergiesSectionAllergyDrugSensitivityTestCase = new OperationsTestCase<AllergiesSection>(
			"validateAllergiesSectionAllergyDrugSensitivity",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_ALLERGY_DRUG_SENSITIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection target) {

			}

			@Override
			protected void updateToPass(AllergiesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionOperations.validateAllergiesSectionAllergyDrugSensitivity(
					(AllergiesSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionAllergyDrugSensitivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetnullAllergyDrugSensitivities() {

		AllergiesSection target = objectFactory.create();
		target.getnullAllergyDrugSensitivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergiesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergiesSection> {
		public AllergiesSection create() {
			return ConsolFactory.eINSTANCE.createAllergiesSection();
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
	private static class ConstructorTestClass extends AllergiesSectionOperations {
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

} // AllergiesSectionOperations
