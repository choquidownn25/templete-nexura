package org.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "invoices")
public class Invoice {
    @Id
    @Column(name = "id", nullable = false, length = 13)
    private String id;

    @Column(name = "employeeId", nullable = false)
    private Integer employeeId;

    @Column(name = "total", nullable = false)
    private Double total;

    @Column(name = "vat", nullable = false)
    private Double vat;

    @Column(name = "discount", nullable = false)
    private Double discount;

    @Column(name = "payable", nullable = false)
    private Double payable;

    @Column(name = "paid", nullable = false)
    private Double paid;

    @Column(name = "returned", nullable = false)
    private Double returned;

    @Column(name = "datetime", nullable = false)
    private Instant datetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getPayable() {
        return payable;
    }

    public void setPayable(Double payable) {
        this.payable = payable;
    }

    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public Double getReturned() {
        return returned;
    }

    public void setReturned(Double returned) {
        this.returned = returned;
    }

    public Instant getDatetime() {
        return datetime;
    }

    public void setDatetime(Instant datetime) {
        this.datetime = datetime;
    }

}