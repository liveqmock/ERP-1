package com.zh.web.model.bean;

import com.zh.core.model.IDataObject;

/**
* @Title: StorageDetail.java 
* @Package com.zh.web.model.bean 
* @Description: 入库信息明细表
* @date 2015年4月9日 下午5:26:55 
* @author taozhaoping 26078
* @author mail taozhaoping@gmail.com
* @version V1.0
 */
public class StorageDetail extends IDataObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1764450071409870780L;

	private Integer id;
	
	/**
	 * 头表id
	 */
	private Integer storagePrimaryID;
	
	/**
	 * 入库产品
	 */
	private Integer productsID;
	
	/**
	 * 库位
	 */
	private Integer position;
	
	/**
	 * 入库数量
	 */
	private Integer storageNumber;
	
	/**
	 * 用途
	 */
	private String use;
	
	/**
	 * 描述
	 */
	private String remarks;
	
	/**
	 * 产品名称
	 */
	private String productsName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStoragePrimaryID() {
		return storagePrimaryID;
	}

	public void setStoragePrimaryID(Integer storagePrimaryID) {
		this.storagePrimaryID = storagePrimaryID;
	}

	public Integer getProductsID() {
		return productsID;
	}

	public void setProductsID(Integer productsID) {
		this.productsID = productsID;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Integer getStorageNumber() {
		return storageNumber;
	}

	public void setStorageNumber(Integer storageNumber) {
		this.storageNumber = storageNumber;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getProductsName() {
		return productsName;
	}

	public void setProductsName(String productsName) {
		this.productsName = productsName;
	}


}
