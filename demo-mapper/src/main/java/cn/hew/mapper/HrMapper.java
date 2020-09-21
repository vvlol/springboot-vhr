package cn.hew.mapper;


import cn.hzw.bean.Hr;
import cn.hzw.bean.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String username);

    /**
     * 根据id 获得用户权限
     * @param id hrid
     * @return
     */
    List<Role> getHrRolesById(Integer id);

    /**
     *  获得 hr 模糊查询
     * @param hrid hrid ！=
     * @param keywords 用户名
     * @return
     */
    List<Hr> getAllHrs(@Param("hrid") Integer hrid, @Param("keywords") String keywords);

    /**
     * 获得非当前id的hr
     * @param id
     * @return
     */
    List<Hr> getAllHrsExceptCurrentHr(Integer id);

    /**
     * 更新密码
     * @param hrid
     * @param encodePass
     * @return
     */
    Integer updatePasswd(@Param("hrid") Integer hrid, @Param("encodePass") String encodePass);

    /**
     * 更新 userface
     * @param url
     * @param id
     * @return
     */
    Integer updateUserface(@Param("url") String url, @Param("id") Integer id);
}