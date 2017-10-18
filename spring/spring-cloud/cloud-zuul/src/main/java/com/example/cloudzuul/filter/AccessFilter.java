package com.example.cloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

/**
 * @author Chris.zhai
 * @since Oct 18,2017
 */
@Component
public class AccessFilter extends ZuulFilter{
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        RequestContext ctx=RequestContext.getCurrentContext();
        ctx.setSendZuulResponse(false);
        ctx.setResponseBody("filter");
        return null;
    }
}
