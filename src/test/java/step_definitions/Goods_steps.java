package step_definitions;

import entity.Customer;
import entity.Item;
import entity.World;
import cucumber.api.java.en.Given;

public class Goods_steps {
    private World world;

    public Goods_steps(World world) {
        this.world = world;
    }

    @Given("^that (.*) bought a faulty (.*) for \\$(\\d+)$")
    public void that_bought_a_faulty_kettle(String name, String itemType, int price) throws Throwable {
        world.customer = new Customer(name);
        world.item = new Item(itemType, price);
    }
}
