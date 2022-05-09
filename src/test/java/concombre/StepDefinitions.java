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
        int i = 1;
    }

    @When("bloublou")
    public void bloublou() {
        int i = 1;
    }

    @Then("The subtraction is correct")
    public void the_subtraction_is_correct() throws ParameterException {
        String var1 = ParameterService.INSTANCE.getInt("TC_CUF_VAR1");
        String var2 = ParameterService.INSTANCE.getTestInt("TC_CUF_VAR2");
        String res =  ParameterService.INSTANCE.getGlobalInt("TC_CUF_RES");
        System.out.printl("Calculation result: var1 + var2 = res: " + var1 + " + " + var2 + " = " + res);
        Assertions.assertEquals(res, var1 + var2, "Wrong calculation result");
    }

}
