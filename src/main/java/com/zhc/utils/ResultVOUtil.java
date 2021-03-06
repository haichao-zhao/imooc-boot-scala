package com.zhc.utils;

/**
 * Boot返回工具类
 */
public class ResultVOUtil {

    public static ResultVO success(Object o) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(o);
        resultVO.setCode(200);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success() {

        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();

        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

}
