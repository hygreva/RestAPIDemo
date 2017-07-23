/**
 * 
 */
package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.UnityScan;

/**
 * @author hchavali
 *
 */
public interface UnityScanDao {

	UnityScan findById(int id);

	void saveUnityTagDetails(UnityScan unityScan);

	void updateUnityTagScan(UnityScan unityScan);

	void updateTagDetails(UnityScan uTagDetails);

	List<UnityScan> findAllTags();

	UnityScan findTagByTagID(String tagId);

}
