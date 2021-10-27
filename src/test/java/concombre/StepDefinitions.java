package concombre;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {
    int lot1;
    int lot2;
    int total;
    String item;
    int itemValue;
    final int minExpected = 5;

    @Given("I've {int} products")
    public void i_ve_number_products(int qty) {
        lot1 = qty;
    }

    @Given("I add {int} additional products")
    public void i_had_number_additional_products(int qty) {
        lot2 = qty;
    }

    @When("I count everything I have in stock")
    public void i_count_everything_i_have_in_stock() {
        total = lot1 + lot2;
    }

    @Then("I've at least {int} products in stock")
    public void i_ve_at_least_number_products_in_stock(int expected) {
        Assertions.assertTrue(total >= expected, "There is not enough stock");
    }

    @Given("I need to add some {string}")
    public void i_need_to_add_some_product(String newItem) {
        item = newItem;
    }

    @Given("I know how much I have")
    public void i_knom_how_much_i_have() {
        switch (item) {
            case "Ladder":
                itemValue = 3;
                break;
            case "Chest":
                itemValue = 2;
                break;
            case "Table":
                itemValue = -2;
                break;
            default:
                itemValue = 0;
                break;
        }
    }

    @When("I add it to the stock")
    public void i_add_it_to_the_stock() {
        total = lot1 + lot2 + itemValue;
    }

    @Then("I should have more than the minimum needed")
    public void i_should_have_more_than_the_minimum_needed() {
        Assertions.assertTrue(total >= minExpected, "Error detected, we need at least "+ minExpected +" products, right now we have only "+ total + " products");
    }
}
