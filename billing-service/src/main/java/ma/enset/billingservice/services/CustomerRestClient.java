package ma.enset.billingservice.services;

import ma.enset.billingservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="CUSTOMER-SERVICE")
public interface CustomerRestClient {
    @GetMapping(path="/customers/{id}")
    Customer findCustomerById(@PathVariable("id") Long id);
}
