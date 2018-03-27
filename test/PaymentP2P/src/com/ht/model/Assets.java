package com.ht.model;

import java.math.BigDecimal;

public class Assets {
    private Integer id;

    private String custid;

    private BigDecimal totalassets;

    private BigDecimal useassets;

    private BigDecimal frozenassets;

    private String stay1;

    private String stay2;

    private String stay3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid == null ? null : custid.trim();
    }

    public BigDecimal getTotalassets() {
        return totalassets;
    }

    public void setTotalassets(BigDecimal totalassets) {
        this.totalassets = totalassets;
    }

    public BigDecimal getUseassets() {
        return useassets;
    }

    public void setUseassets(BigDecimal useassets) {
        this.useassets = useassets;
    }

    public BigDecimal getFrozenassets() {
        return frozenassets;
    }

    public void setFrozenassets(BigDecimal frozenassets) {
        this.frozenassets = frozenassets;
    }

    public String getStay1() {
        return stay1;
    }

    public void setStay1(String stay1) {
        this.stay1 = stay1 == null ? null : stay1.trim();
    }

    public String getStay2() {
        return stay2;
    }

    public void setStay2(String stay2) {
        this.stay2 = stay2 == null ? null : stay2.trim();
    }

    public String getStay3() {
        return stay3;
    }

    public void setStay3(String stay3) {
        this.stay3 = stay3 == null ? null : stay3.trim();
    }
    
    
}