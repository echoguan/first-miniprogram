package com.echo.minispring.service;

import com.echo.minispring.entity.Area;

import java.util.List;

public interface AreaService {
    /**
     * 查询所有区域列表
     * @return areaList
     */
    List<Area> getAreaList();

    /**
     * 根据Id查询具体区域
     * @param areaId
     * @return area
     */
    Area getAreaById(int areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
