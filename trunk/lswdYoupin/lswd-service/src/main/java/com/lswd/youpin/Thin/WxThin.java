package com.lswd.youpin.Thin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liruilong on 2017/8/10.
 */
public interface WxThin {
    void wxNotify(HttpServletRequest request, HttpServletResponse response);
}
