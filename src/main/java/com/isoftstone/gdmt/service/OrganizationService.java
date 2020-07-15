package com.isoftstone.gdmt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.isoftstone.gdmt.model.Node;
import com.isoftstone.gdmt.model.Organization;
import com.isoftstone.gdmt.model.Pagination;

@Service("organizationService")
public interface OrganizationService {

    List<Organization> findAll();

    void insert(Organization organ);

    void update(Organization organ);

    Organization findOne(String id);

    void remove(String id);

    Pagination<Organization> findPagination(int pageNumber, int pageSize);

    /* Node<Organization> getOrgsByParentId(String parent_uuid); */

    List<Node> getOrganizationsByParentUUID(String parentUUID);
}
