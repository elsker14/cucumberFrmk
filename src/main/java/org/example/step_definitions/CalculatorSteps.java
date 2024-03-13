package org.example.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.services.Calculator;

public class CalculatorSteps {

    public Calculator myCalculator;
    public float actualResult;

    @Given("I have a calculator")
    public void iHaveACalculator() {
        this.myCalculator = new Calculator("stiintific");
    }

    @When("I sum up {float} and {float}")
    public void iSumUp(float a, float b) {
        this.actualResult = this.myCalculator.sum(a, b);
    }

    @When("I subtract {float} from {float}")
    public void iSubtract(float a, float b) {
        this.actualResult = this.myCalculator.subtract(a, b);
    }

    @When("I multiply {float} times by {float}")
    public void iMultiply(float a, float b) {
        this.actualResult = this.myCalculator.sum(a, b);
    }

    @When("I divide {float} to {float}")
    public void iDivide(float a, float b) {
        this.actualResult = this.myCalculator.sum(a, b);
    }

    @Then("I expect the result to be {float}")
    public void iExpectTheResultToBe(float expectedResult) {
        if (this.actualResult == expectedResult) {
            System.out.println("Test passed!");   // sout
        } else {
            System.out.println("Test failed!");
        }

        Calculator.suntFloricel();
    }

}
