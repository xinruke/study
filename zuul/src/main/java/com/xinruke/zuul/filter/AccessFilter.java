package com.xinruke.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 访问过滤器
 */
@Component
public class AccessFilter extends ZuulFilter {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    //用户模块的ZUUL名称
    private static String USER_ZUUL = "/userZuul/";

    /**
     * 过滤器类型选择：
     * pre 为路由前
     * route 为路由过程中
     * post 为路由过程后
     * error 为出现错误的时候
     * 同时也支持static ，返回静态的响应，详情见StaticResponseFilter的实现
     * 以上类型在会创建或添加或运行在FilterProcessor.runFilters(type)
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器顺序，越小越先执行
     *
     * @return 排序的序号
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 过滤器是否生效
     * 返回true代表需要权限校验，false代表不需要用户校验即可访问
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 业务逻辑
     * 只有上面返回true的时候，才会进入到该方法
     */
    @Override
    public Object run() throws ZuulException {
        String response = "{\"code\": 999,\"message\": \"success\"}";

        //是否拥有权限
        boolean hasRights = false;

        //获取当前请求上下文
        RequestContext requestContext = RequestContext.getCurrentContext();
        //取出当前请求
        HttpServletRequest request = requestContext.getRequest();

        String token = request.getHeader("token");
        String requestURI = request.getRequestURI();
        logger.info("进入访问过滤器，访问的url:{}，访问的方法：{}", requestURI, request.getMethod());

        if (requestURI.startsWith(USER_ZUUL)) {//用户模块
            String userURI = requestURI.substring(USER_ZUUL.length());
            if (userURI.equals("user/finance/balance")) {
                hasRights = true;
            }
        }

        if (!hasRights) {
            response = "{\"code\": 999,\"message\": \"have no rights\"}";
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            requestContext.setResponseBody(response);
            return null;
        }

        //如果有token，则进行路由转发

        //这里return的值没有意义，zuul框架没有使用该返回值
        return null;
    }
}
