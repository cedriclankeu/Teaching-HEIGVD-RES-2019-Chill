package ch.heigvd.res.chill.protocol;

import lombok.Data;

@Data
public class OrderRequest implements IMessage {

  private final int quantity;
  private final String productName;

  public String getProductName(){
    return this.productName;
  }
  public int getQuantity(){
    return this.quantity;
  }

}
