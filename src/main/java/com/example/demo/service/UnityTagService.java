/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.model.UnityScan;

/**
 * @author hchavali
 *
 */
public interface UnityTagService {

	UnityScan findById(int id);

	void saveTagDetails(UnityScan uTagDetails);

	void updateTagDetails(UnityScan uTagDetails);

	List<UnityScan> findAllTags();

	UnityScan findTagByTagID(String tagId);

}
