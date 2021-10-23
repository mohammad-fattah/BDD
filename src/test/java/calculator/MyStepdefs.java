package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    private Calculator calculator;
    private int value1;
    private String value2;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("input {int} and operator rvs")
    public void twoInputAndOperatorRvs(int arg0) {
        value1 = arg0;
    }

    @Given("input {int} and operator sqr")
    public void twoInputAndOperatorSqr(int arg0) {
        value1 = arg0;
    }

    @Then("I expect the result {double}")
    public void iExpectTheResult(double arg0) {
        //this function return true if |result - arg0| < 0.01
        Assert.assertEquals(arg0, result, 0.01);
    }

    @When("I calculate rvs")
    public void iCalculateRvs() {
        result = calculator.rvs(value1);
        System.out.print(result);
    }

    @When("I calculate sqr")
    public void iCalculateSqrt() {
        result = calculator.sqr(value1);
        System.out.print(result);
    }

    @Then("I expect the result NaN")
    public void iExpectTheResultNaN() {
        Assert.assertEquals(String.valueOf(result), "NaN");
    }

    @Then("I expect the result Infinity")
    public void iExpectTheResultInfinity() {
        Assert.assertEquals(String.valueOf(result), "Infinity");
    }
}
