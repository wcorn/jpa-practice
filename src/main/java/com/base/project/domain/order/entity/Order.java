package com.base.project.domain.order.entity;

import com.base.project.domain.orderItem.entity.OrderItem;
import com.base.project.domain.delivery.entity.Delivery;
import com.base.project.domain.user.entity.UserAccount;
import com.base.project.global.common.entity.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor(access = PROTECTED)
@ToString
@Table(name="orders")
public class Order extends BaseEntity  {
    @ManyToOne
    @JoinColumn(name="member_id")
    private UserAccount userAccount;
    @OneToMany(mappedBy = "order")
    @Builder.Default
    private List<OrderItem> orderItems = new ArrayList<>();
    @OneToOne
    @JoinColumn(name="delivery_id")
    private Delivery delivery;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}