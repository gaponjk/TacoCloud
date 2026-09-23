package com.example.secongstart.data;

import com.example.secongstart.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder tacoOrder);
}
