package com.cydeo.service;

import com.cydeo.model.License;

import java.util.List;

public interface LicenseService {

    License getLicense(Long licenseId, Long organizationId) throws Exception;

    License createLicense(License license);

    License updateLicense(License license);

    String deleteLicense(Long licenseId) throws Exception;

    List<License> getLicensesByOrganization(Long organizationId);

}
