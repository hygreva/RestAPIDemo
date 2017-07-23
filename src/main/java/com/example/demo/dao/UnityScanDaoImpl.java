/**
 * 
 */
package com.example.demo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UnityScan;

/**
 * @author hchavali
 *
 */
@Repository("unityScanDao")
public class UnityScanDaoImpl extends AbstractDao<Integer, UnityScan> implements UnityScanDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.demo.dao.UnityScanDao#findById(int)
	 */
	@Override
	public UnityScan findById(int id) {
		return getByKey(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.demo.dao.UnityScanDao#saveTagDetails(com.example.demo.model.
	 * UnityScan)
	 */
	@Override
	public void saveUnityTagDetails(UnityScan unityScan) {
		persist(unityScan);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.demo.dao.UnityScanDao#updateUnityTagScan(com.example.demo.model.
	 * UnityScan)
	 */
	@Override
	public void updateUnityTagScan(UnityScan unityScan) {
		// TODO to be implemented once we finalize the GeoEdge response

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.demo.dao.UnityScanDao#updateTagDetails(com.example.demo.model.
	 * UnityScan)
	 */
	@Override
	public void updateTagDetails(UnityScan uTagDetails) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.demo.dao.UnityScanDao#findAllTags()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<UnityScan> findAllTags() {
		Criteria criteria = createEntityCriteria();
		return (List<UnityScan>) criteria.list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.demo.dao.UnityScanDao#findTagByTagID(java.lang.String)
	 */
	@Override
	public UnityScan findTagByTagID(String tagId) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eqOrIsNull("TAG_ID", tagId));
		return null;
	}

}
