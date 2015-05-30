package uk.co.jemos.podam.test.unit.basicTypes;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.test.dto.AbstractTestPojo;
import uk.co.jemos.podam.test.dto.NoDefaultConstructorPojo;
import uk.co.jemos.podam.test.dto.OneDimensionalTestPojo;
import uk.co.jemos.podam.test.unit.steps.PodamFactorySteps;
import uk.co.jemos.podam.test.unit.steps.PodamInvocationSteps;
import uk.co.jemos.podam.test.unit.steps.PodamValidationSteps;
import uk.co.jemos.podam.test.unit.steps.OneDimentionalPojoValidationSteps;

/**
 * Created by tedonema on 27/05/2015.
 */
@RunWith(SerenityRunner.class)
public class PodamFactoryBasicTypesTest {

    @Steps
    PodamFactorySteps podamFactorySteps;

    @Steps
    PodamInvocationSteps podamInvocationSteps;

    @Steps
    PodamValidationSteps podamValidationSteps;

    @Steps
    OneDimentionalPojoValidationSteps oneDimentionalPojoValidationSteps;

    @Test
    @Title("Podam should fill in a POJO with basic jvm types")
    public void podamShouldGenerateBasicTypes() throws Exception {

        PodamFactory podamFactory = podamFactorySteps.givenAStandardPodamFactory();

        OneDimensionalTestPojo oneDimensionalTestPojo = podamInvocationSteps.whenIInvokeTheFactoryForClass(OneDimensionalTestPojo.class, podamFactory);

        podamValidationSteps.thePojoShouldNotBeNull(oneDimensionalTestPojo);

        podamValidationSteps.thePojoShouldContainSomeData(oneDimensionalTestPojo);

        oneDimentionalPojoValidationSteps.validateDimensionalTestPojo(oneDimensionalTestPojo, podamFactory.getStrategy());

    }

    @Test
    @Title("Podam should fill POJOs with non default constructors")
    public void podamShouldFillPojosWithNonDefaultConstructor() throws Exception {

        PodamFactory podamFactory = podamFactorySteps.givenAStandardPodamFactory();

        NoDefaultConstructorPojo pojo = podamInvocationSteps.whenIInvokeTheFactoryForClass(NoDefaultConstructorPojo.class, podamFactory);

        podamValidationSteps.thePojoShouldNotBeNull(pojo);

    }

    @Test
    @Title("Invoking Podam on an Abstract class should return a null pojo")
    public void invokingPodamOnAbstractClassShouldReturnANullPojo() throws Exception {

        PodamFactory podamFactory = podamFactorySteps.givenAStandardPodamFactory();
        AbstractTestPojo pojo = podamInvocationSteps.whenIInvokeTheFactoryForClass(AbstractTestPojo.class, podamFactory);
        podamValidationSteps.thePojoShouldBeNull(pojo);

    }

}