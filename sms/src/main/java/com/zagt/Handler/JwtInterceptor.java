package com.zagt.Handler;

import cn.hutool.core.util.StrUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.zagt.entity.Admin;
import com.zagt.service.AdminService;
import com.zagt.utils.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.zagt.utils.ErrorCode.NO_AUTH;

/**
 * @ClassName Application
 * @Description JWT拦截器
 * @Author dong
 * @Date 2024/4/9
 * @Version 1.0
 */
@Component
@Slf4j
public class JwtInterceptor implements HandlerInterceptor {


    @Autowired
    private AdminService adminService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String token = request.getHeader("token");
        if (StrUtil.isBlank(token)) {
            token = request.getParameter("token");
        }

        // 执行认证
        if (StrUtil.isBlank(token)) {
            throw new BusinessException(NO_AUTH, "无token，请重新登录");
        }
        // 获取 token 中的adminId
        String adminId;
        Admin admin;
        try {
            adminId = JWT.decode(token).getAudience().get(0);
            // 根据token中的userid查询数据库
            admin = adminService.getById(Integer.parseInt(adminId));
        } catch (Exception e) {
            String errMsg = "token验证失败，请重新登录";
            log.error(errMsg + ", token=" + token, e);
            throw new BusinessException(NO_AUTH, errMsg);
        }
        if (admin == null) {
            throw new BusinessException(NO_AUTH, "用户不存在，请重新登录");
        }

        try {
            // 用户密码加签验证 token
            JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(admin.getPassword())).build();
            jwtVerifier.verify(token); // 验证token
        } catch (JWTVerificationException e) {
            throw new BusinessException(NO_AUTH, "token验证失败，请重新登录");
        }
        return true;
    }
}