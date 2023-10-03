package com.cydeo.client;

import com.cydeo.model.Organization;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8082/v1/organization", name = "ORGANIZATION-CLIENT")
public interface OrganizationFeignClient {

    @GetMapping("/{organizationId}")
    Organization getOrganization(@PathVariable("organizationId") Long organizationId);

}
