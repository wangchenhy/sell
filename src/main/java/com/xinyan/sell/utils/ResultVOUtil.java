package com.xinyan.sell.utils;

import com.xinyan.sell.vo.ResultVO;
import lombok.Getter;

/**
 * 王宸
 * 2018/11/14 22:55
 *
 * 视图返回工具类
 */
@Getter
public class ResultVOUtil {

    /** 返成功时视图信息
     * @param data
     * @return
     */
    public static ResultVO success(Object data){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(data);

        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    /**返回错误时信息
     * @param code
     * @param msg
     * @return
     */
    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
