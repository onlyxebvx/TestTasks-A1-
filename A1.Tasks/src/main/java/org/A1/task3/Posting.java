package org.A1.task3;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;

@Entity
@Table(name = "postings")
public class Posting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Mat. Doc.")
    private Long id;

    @Column(name = "Item")
    private Integer item;

    @Column(name = "Doc. Date")
    private Date docDate;

    @Column(name = "Pstng Date")
    private Date pstngDate;

    @Column(name = "Material Description")
    private String materialDescription;

    @Column(name = "Quantity")
    private Integer quantity;

    @Column(name = "BUn")
    private String bun;

    @Column(name = "Amount LC")
    private BigDecimal amountLc;

    @Column(name = "Crcy")
    private String crcy;

    @Column(name = "User Name")
    private String userName;

    @Column(name = "authorized_supply")
    private Boolean authorizedSupply;

    // getters and setters
}

