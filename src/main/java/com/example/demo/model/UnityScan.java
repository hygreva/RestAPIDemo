/**
 * 
 */
package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author hchavali
 *
 */
@Entity
@Table(name = "UNITY_TAG_SCAN")
public class UnityScan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SEQ_ID")
	private int id;

	private String tag_id;
	private String tag_details;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the tag_id
	 */
	public String getTag_id() {
		return tag_id;
	}

	/**
	 * @param tag_id the tag_id to set
	 */
	public void setTag_id(String tag_id) {
		this.tag_id = tag_id;
	}

	/**
	 * @return the tag_details
	 */
	public String getTag_details() {
		return tag_details;
	}

	/**
	 * @param tag_details the tag_details to set
	 */
	public void setTag_details(String tag_details) {
		this.tag_details = tag_details;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UnityScan [id=" + id + ", tag_id=" + tag_id + ", tag_details=" + tag_details + "]";
	}

	

}
