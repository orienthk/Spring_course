package com.ttc.ssm.po;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ttc.ssm.controller.validation.ValidGroup1;
import com.ttc.ssm.controller.validation.ValidGroup2;

public class Items {
	private Integer id;
    @Size(min=1,max=20,message="{items.name.length.error}",groups={ValidGroup1.class})
    private String name;

    private Float price;

    private String pic;
    @NotNull(message="{items.createtime.isNULL}",groups={ValidGroup2.class})
    private Date createtime;

    private String detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
    
    public Items(){}
    public Items(Integer id,String name,Float price,String pic,Date createTime,String detail){
    	this.id = id;
    	this.name = name;
    	this.price = price;
    	this.pic = pic;
    	this.createtime = createTime;
    	this.detail = detail;
    }
}