package uk.co.jemos.podam.test.unit.features.typeManufacturing;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.jemos.podam.api.AttributeMetadata;
import uk.co.jemos.podam.api.DataProviderStrategy;
import uk.co.jemos.podam.common.PodamConstants;
import uk.co.jemos.podam.test.dto.ClassGenericConstructorPojo;
import uk.co.jemos.podam.test.dto.SimplePojoToTestSetters;
import uk.co.jemos.podam.test.enums.ExternalRatePodamEnum;
import uk.co.jemos.podam.test.unit.AbstractPodamSteps;
import uk.co.jemos.podam.test.unit.steps.PodamFactorySteps;
import uk.co.jemos.podam.typeManufacturers.TypeManufacturerParamsWrapper;
import uk.co.jemos.podam.typeManufacturers.TypeManufacturerParamsWrapperForGenericTypes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tedonema on 28/06/2015.
 */
@RunWith(SerenityRunner.class)
public class TypeManufacturingTest extends AbstractPodamSteps {

    @BeforeClass
    public static void init() {
        PodamFactorySteps.initPodamFactoryContext();
    }

    @AfterClass
    public static void deinit() {
        PodamFactorySteps.disposePodamFactoryContext();
    }

    @Test
    @Title("Podam Messaging System should return an int primitive value")
    public void podamMessagingSystemShouldReturnAnIntValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                 new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, int.class);
        podamValidationSteps.theIntFieldShouldNotBeZero((Integer) payload);
    }

    @Test
    @Title("Podam Messaging System should return an integer value")
    public void podamMessagingSystemShouldReturnAnIntegerValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, Integer.class);
        podamValidationSteps.theIntFieldShouldNotBeZero((Integer) payload);
    }

    @Test
    @Title("Podam Messaging System should return a boolean primitive value")
    public void podamMessagingSystemShouldReturnABooleanPrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, boolean.class);
        podamValidationSteps.theBooleanValueIsTrue((Boolean) payload);
    }

    @Test
    @Title("Podam Messaging System should return a boolean wrapped value")
    public void podamMessagingSystemShouldReturnABooleanWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, Boolean.class);
        podamValidationSteps.theBooleanValueIsTrue((Boolean) payload);
    }

    @Test
    @Title("Podam Messaging System should return a char primitive value")
    public void podamMessagingSystemShouldReturnACharacterPrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, char.class);
        podamValidationSteps.theObjectShouldNotBeNull((Character) payload);

    }

    @Test
    @Title("Podam Messaging System should return a Character wrapped value")
    public void podamMessagingSystemShouldReturnACharacterWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, Character.class);
        podamValidationSteps.theObjectShouldNotBeNull((Character) payload);
    }

    @Test
    @Title("Podam Messaging System should return a short primitive value")
    public void podamMessagingSystemShouldReturnAShortPrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, short.class);
        podamValidationSteps.theObjectShouldNotBeNull((Short) payload);
    }

    @Test
    @Title("Podam Messaging System should return a Short wrapped value")
    public void podamMessagingSystemShouldReturnAShortWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, Short.class);
        podamValidationSteps.theObjectShouldNotBeNull((Short) payload);
    }

    @Test
    @Title("Podam Messaging System should return a byte primitive value")
    public void podamMessagingSystemShouldReturnABytePrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, byte.class);
        podamValidationSteps.theObjectShouldNotBeNull((Byte) payload);
    }

    @Test
    @Title("Podam Messaging System should return a Byte wrapped value")
    public void podamMessagingSystemShouldReturnAByteWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, Byte.class);
        podamValidationSteps.theObjectShouldNotBeNull((Byte) payload);
    }

    @Test
    @Title("Podam Messaging System should return a long primitive value")
    public void podamMessagingSystemShouldReturnALongPrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, long.class);
        podamValidationSteps.theObjectShouldNotBeNull((Long) payload);
    }

    @Test
    @Title("Podam Messaging System should return a Long wrapped value")
    public void podamMessagingSystemShouldReturnALongWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, Long.class);
        podamValidationSteps.theObjectShouldNotBeNull((Long) payload);
    }

    @Test
    @Title("Podam Messaging System should return a float primitive value")
    public void podamMessagingSystemShouldReturnAFloatPrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, float.class);
        podamValidationSteps.theObjectShouldNotBeNull((Float) payload);
    }

    @Test
    @Title("Podam Messaging System should return a Float wrapped value")
    public void podamMessagingSystemShouldReturnAFloatWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, Float.class);
        podamValidationSteps.theObjectShouldNotBeNull(payload);
    }

    @Test
    @Title("Podam Messaging System should return a double primitive value")
    public void podamMessagingSystemShouldReturnADoublePrimitiveValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, double.class);
        podamValidationSteps.theObjectShouldNotBeNull((Double) payload);
    }

    @Test
    @Title("Podam Messaging System should return a Double wrapped value")
    public void podamMessagingSystemShouldReturnADoubleWrappedValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, Double.class);
        podamValidationSteps.theObjectShouldNotBeNull((Double) payload);
    }


    @Test
    @Title("Podam Messaging System should return a String value")
    public void podamMessagingSystemShouldReturnAStringValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnEmptyAttributeMetadata
                (SimplePojoToTestSetters.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, String.class);
        podamValidationSteps.theObjectShouldNotBeNull((String) payload);
    }

    @Test
    @Title("Podam Messaging System should return an Enum value")
    public void podamMessagingSystemShouldReturnAnEnumValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnAttributeMetadataForEnums
                (ExternalRatePodamEnum.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        TypeManufacturerParamsWrapper paramsWrapper =
                new TypeManufacturerParamsWrapper(dataProviderStrategy, attributeMetadata);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, PodamConstants.ENUMERATION_QUALIFIER);
        podamValidationSteps.theObjectShouldNotBeNull(payload);
    }

    @Test
    @Title("Podam Messaging System should return a Generic Type value")
    public void podamMessagingSystemShouldReturnAGenericTypeValue() throws Exception {

        DataProviderStrategy dataProviderStrategy = podamFactorySteps.givenARandomDataProviderStrategy();

        AttributeMetadata attributeMetadata = podamFactorySteps.givenAnAttributeMetadataForGenericTypes
                (ClassGenericConstructorPojo.class);
        podamValidationSteps.theObjectShouldNotBeNull(attributeMetadata);

        Map<String, Type> genericTypeArgumentsMap = new HashMap<String, Type>();

        genericTypeArgumentsMap.put("T", String.class);

        TypeManufacturerParamsWrapperForGenericTypes paramsWrapper =
                new TypeManufacturerParamsWrapperForGenericTypes(dataProviderStrategy, attributeMetadata,
                        genericTypeArgumentsMap, String.class);

        Object payload = podamInvocationSteps.whenISendAMessageToTheChannel(
                paramsWrapper, PodamConstants.GENERIC_TYPE_QUALIFIER);
        podamValidationSteps.theTwoObjectsShouldBeEqual(String.class, payload);
    }



}