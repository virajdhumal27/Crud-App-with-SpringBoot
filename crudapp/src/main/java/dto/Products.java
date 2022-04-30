package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Products {
    private int id;
    private String name;
    private int quantity;
    private int price;
    private String company;
    private int totalPrice;
}
