package coursenest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import coursenest.daos.OrderDetailsDao;
import coursenest.entities.Order;
import coursenest.entities.OrderDetails;



@Service
public class OrderDetailsServiceImpl implements OrderdetailService {

	@Autowired 
	private OrderDetailsDao orderDetailsDao;
	
	@Override
	public void saveOrderDetails(OrderDetails od) {
		// TODO Auto-generated method stub
		orderDetailsDao.save(od);
	}

	@Override
	public OrderDetails findById(int id) {
		// TODO Auto-generated method stub
		return orderDetailsDao.getById(id);
	}

	@Override
	public List<OrderDetails> findByOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDetailsDao.findByOrder(order);
	}

}
