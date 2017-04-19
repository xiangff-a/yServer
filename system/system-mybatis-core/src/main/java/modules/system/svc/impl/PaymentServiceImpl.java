package modules.system.svc.impl;

import modules.system.dao.PaymentDao;
import modules.system.model.Payment;
import modules.system.svc.PaymentService;
import modules.system.svc.base.SysBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yserver.core.datasource.DataSource;

@Service
@DataSource("default")
@Transactional
public class PaymentServiceImpl
        extends SysBaseServiceImpl<Payment, PaymentDao> implements PaymentService {
    @Autowired
    private PaymentDao dao;

    @Override
    public PaymentDao getDao() {
        return dao;
    }

    @Override
    public Payment find(String id) {
        return getDao().findOne(new Payment(id));
    }
}
