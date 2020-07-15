package com.isoftstone.gdmt.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.isoftstone.gdmt.dao.RRoleOrganDao;
import com.isoftstone.gdmt.dao.RoleDao;
import com.isoftstone.gdmt.model.Role;
import com.isoftstone.gdmt.model.TbRRoleOrgan;
import com.isoftstone.gdmt.model.TbRRoleOrganExample;
import com.isoftstone.gdmt.service.RRoleOrganService;
import com.isoftstone.gdmt.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RRoleOrganServiceImpl implements RRoleOrganService {

    @Autowired
    private RRoleOrganDao rRoleOrganMapper;

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> findAllRole() {
        return roleDao.selectByExample(null);
    }

    @Autowired
//	private RoleDao roleDao;

    /**
     * 查询全部
     */
    @Override
//	public List<TbRRoleOrgan> findAll() {
//		return rRoleOrganMapper.selectByExample(null);
//	}
    public List<TbRRoleOrgan> findAll() {
        return rRoleOrganMapper.selectAll();
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbRRoleOrgan> page = (Page<TbRRoleOrgan>) rRoleOrganMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(TbRRoleOrgan rRoleOrgan) {
        rRoleOrganMapper.insert(rRoleOrgan);
    }


    /**
     * 修改
     */
    @Override
    public void update(TbRRoleOrgan rRoleOrgan) {
        rRoleOrganMapper.updateByPrimaryKey(rRoleOrgan);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public TbRRoleOrgan findOne(String id) {
        return rRoleOrganMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(String id) {
        rRoleOrganMapper.deleteByPrimaryKey(id);
    }


    @Override
    public PageResult findPage(TbRRoleOrgan rRoleOrgan, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbRRoleOrganExample example = new TbRRoleOrganExample();
        TbRRoleOrganExample.Criteria criteria = example.createCriteria();

        if (rRoleOrgan != null) {
            if (rRoleOrgan.getDutyid() != null && rRoleOrgan.getDutyid().length() > 0) {
                criteria.andDutyidLike("%" + rRoleOrgan.getDutyid() + "%");
            }
            if (rRoleOrgan.getName() != null && rRoleOrgan.getName().length() > 0) {
                criteria.andNameLike("%" + rRoleOrgan.getName() + "%");
            }
//			if(rRoleOrgan.getOrganUuid()!=null && rRoleOrgan.getOrganUuid().length()>0){
//				criteria.andOrganUuidLike("%"+rRoleOrgan.getOrganUuid()+"%");
//			}
//			if(rRoleOrgan.getRoleUuid()!=null && rRoleOrgan.getRoleUuid().length()>0){
//				criteria.andRoleUuidLike("%"+rRoleOrgan.getRoleUuid()+"%");
//			}

        }
//todo 转换报错
        Page<TbRRoleOrgan> page = (Page<TbRRoleOrgan>) rRoleOrganMapper.selectByExample(example);
//		List<RoleOrganResult> result=new ArrayList();
//		List<TbRRoleOrgan> p = page.getResult();
//		RoleOrganResult ror=null;
//		for(TbRRoleOrgan r:p){
//			ror=new RoleOrganResult();
//			ror.setDutyid(r.getDutyid());
//			ror.setOrganUuid(r.getOrganUuid());
//			ror.setRoleUuid(r.getRoleUuid());
//			ror.setName(r.getName());
////			ror.setOrgName();	//todo 改为查询对应中文
////			ror.setRoleName();
//			ror.setOrgName(r.getOrganUuid());
//			ror.setRoleName(r.getRoleUuid());
//			result.add(ror);
//		}
        return new PageResult(page.getTotal(), page.getResult());
    }

}
