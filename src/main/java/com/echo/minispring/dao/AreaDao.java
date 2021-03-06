package com.echo.minispring.dao;

import com.echo.minispring.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * 查询所有区域列表
     * @return areaList
     */
    List<Area> queryArea();

    /**
     * 根据Id查询具体区域
     * @param areaId
     * @return area
     */
    Area queryAreaById(int areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
