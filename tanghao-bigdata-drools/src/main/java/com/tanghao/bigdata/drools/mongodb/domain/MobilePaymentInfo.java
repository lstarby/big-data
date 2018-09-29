package com.tanghao.bigdata.drools.mongodb.domain;

import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author： Canthny
 * @Description： 手机缴费信息对象
 * @Date： Created in 2018/9/27 14:35
 */
public class MobilePaymentInfo implements Serializable{
    private static final long serialVersionUID = -4612172600889702761L;

    @Field("pay_order_no")
    private String payOrderNo;

    @Field("account_no")
    private String accountNo;

    @Field("bank_card_no")
    private String bankCardNo;

    @Field("mobile")
    private String mobile;

    @Field("amount")
    private Integer amount;

    @Field("time")
    private Date time;

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MobilePaymentInfo{" +
                "payOrderNo='" + payOrderNo + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", bankCardNo='" + bankCardNo + '\'' +
                ", mobile='" + mobile + '\'' +
                ", amount='" + amount + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
