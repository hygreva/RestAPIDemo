/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UnityScanDao;
import com.example.demo.model.UnityScan;

/**
 * @author hchavali
 *
 */

@Service("unityScanService")
@Transactional
public class UnityTagScanServiceImpl implements UnityTagService {

	@Autowired
	private UnityScanDao unityDao;

	public UnityScan findById(int id) {
		return unityDao.findById(id);
	}

	public void saveTagDetails(UnityScan unityScan) {
		System.out.println(unityScan.toString());
		unityDao.saveUnityTagDetails(unityScan);
	}

	/*
	 * Update the scan response from GeoEdge to the relevant tag ID as this would be
	 * after the read from DB just update the object with the relevant data and the
	 * db gets updated once the transaction ends.
	 */
	public void updateUnityTagScan(UnityScan unityScan) {
		UnityScan unityEntity = unityDao.findTagByTagID(unityScan.getTag_id());
		if (unityEntity != null) {
			// TODO to update the UnityScan table with the response from GeoEdge.
		}
	}

	@Override
	public void updateTagDetails(UnityScan uTagDetails) {
		// TODO need to check with unity if there would be any update to the existing
		// tag or just will that be an additional row to be added to the table
	}

	@Override
	public List<UnityScan> findAllTags() {
		//  this method will be used for situation where the user will make an bulk
		// scan upload to GeoEdge
		return unityDao.findAllTags();
	}

	@Override
	public UnityScan findTagByTagID(String tagId) {
		return unityDao.findTagByTagID(tagId);
	}

}
