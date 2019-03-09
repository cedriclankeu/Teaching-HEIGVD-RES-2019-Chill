package ch.heigvd.res.chill.domain.cedriclankeu;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class kingBeerTest {

  @Test
  void thePriceAndNameForkingBeerShouldBeCorrect() {
    kingBeer beer = new kingBeer();
    assertEquals(beer.getName(), kingBeer.NAME);
    assertEquals(beer.getPrice(), kingBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForkingBeer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.cedriclankeu.kingBeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = kingBeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}