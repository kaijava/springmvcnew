/**
 * 
 */
package com.mrv.cps.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.mrv.cps.dao.CustomerDAO;
import com.mrv.cps.service.CustomerService;
import com.mrv.cps.utils.Constants;
import com.mrv.cps.vo.CustomerVO;

/**
 * @author hungbang
 *
 */
@Service(Constants.CUSTOMER_SERVICE)
public class CustomerServiceImpl implements CustomerService {

	/* (non-Javadoc)
	 * @see com.mrv.cps.service.CustomerService#getLstCustomer()
	 */
	@Autowired
	@Qualifier(Constants.CUSTOMER_DAO)
	private CustomerDAO customerDao;
	
	@Override
	public List<CustomerVO> getLstCustomer() throws DataAccessException{
		
		return customerDao.getLstCustomer();
	}

	@Override
	public List<CustomerVO> getCustomerListForPaging(Integer pageNumber,
			Integer pageDisplayLength) throws DataAccessException{
		return customerDao.getCustomerListForPaging(pageNumber, pageDisplayLength);
	}

	@Override
	public Integer getTotalRecord() throws DataAccessException {
		
		return customerDao.getTotalRecord();
	}

}
