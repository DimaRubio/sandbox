package step_definitions;

import entity.Item;
import entity.World;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Customer_steps {

    private World world;
    public Customer_steps(World world) {
        this.world = world;
    }

    //// picocontainer Не умеет внедрять зависимости через сеттер
    public void setWorld(World world) {
        this.world = world;
    }

//    public Customer_steps() {
//        World world = new World();
//        this.world = world;
//    }

    @When("^she return the (.*) to the store$")
    public void return_the_an_item_to_the_store(String itemType) throws Throwable {
        Item returnedItem = new Item(itemType);
//        assertThat(world.item, is(returnedItem));
    }

    @When("^she show her receipt$")
    public void she_can_show_a_receipt() throws Throwable {
        world.customer.refund(world.item.getPrice());
    }

    @Then("^she will get \\$(\\d+) refunded$")
    public void she_will_get_$_back(int expected) throws Throwable {
        assertThat(world.customer.getRefunded(), is(expected));
    }

    @And("^get apple$")
    public void getApple() {
        System.out.println(world.apple.color);
    }
}
