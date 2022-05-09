package concombre;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentestfactory.exception.ParameterException;
import org.opentestfactory.exception.ParameterFormatException;
import org.opentestfactory.util.ParameterService;

public class StepDefinitions {

    @Given("blabla")
    public void blabla() {
    }

    @When("bloublou")
    public void bloublou() {

    }

    @Then("The subtraction is correct")
    public void i_ve_at_least_number_products_in_stock(int expected) throws ParameterException {
        int var1 = ParameterService.INSTANCE.getInt("CUF_VAR1");
        int var2 = ParameterService.INSTANCE.getTestInt("CUF_VAR2");
        int res = ParameterService.INSTANCE.getGlobalInt("CUF_RES");
        Assertions.assertEquals(res, var1 + var2, "Wrong calculation result");
    }

}
