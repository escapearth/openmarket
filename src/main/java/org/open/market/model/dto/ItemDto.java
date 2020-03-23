package org.open.market.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.open.market.model.accounts.Account;
import org.open.market.model.items.Item;
import org.open.market.model.items.ItemCategory;

import java.util.List;

@Getter
@AllArgsConstructor
public class ItemDto {

    private String name;
    private int price;
    private int stockQuantity;
    private Account account;
    private List<ItemCategory> itemCategories;

    public Item from() {
        return Item.builder()
                .name(this.name)
                .price(this.price)
                .stockQuantity(this.stockQuantity)
                .account(this.account)
                .itemCategories(this.itemCategories)
                .build();
    }
}
