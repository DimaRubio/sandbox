package step_definitions;

import entity.Customer;
import entity.Item;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RefundedGoods_teps {
    //Здесь для шаринга общих данных между степами используются переменные класса (1 вариант, без использования контейнеров)
        private Customer customer;
        private Item item;

//        @Given("^that (.*) bought a faulty (.*) for \\$(\\d+)$")
//        public void that_bought_a_faulty_kettle(String name, String itemType, int price) throws Throwable {
//            customer = new Customer(name);
//            item = new Item(itemType, price);
//        }
//
//        @When("^she return the (.*) to the store$")
//        public void return_the_an_item_to_the_store(String itemType) throws Throwable {
//            Item returnedItem = new Item(itemType);
//            System.out.println("testtesttetst");
////        assertThat(item, is(returnedItem));
//        }
//
//        @When("^she show her receipt$")
//        public void she_can_show_a_receipt() throws Throwable {
//            customer.refund(item.getPrice());
//        }
//
//        @Then("^she will get \\$(\\d+) refunded$")
//        public void she_will_get_$_back(int expected) throws Throwable {
//            assertThat(customer.getRefunded(), is(expected));
//        }
}
