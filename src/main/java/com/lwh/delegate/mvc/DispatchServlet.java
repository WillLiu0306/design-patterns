package com.lwh.delegate.mvc;

import com.lwh.delegate.mvc.controllers.MemberController;
import com.lwh.delegate.mvc.controllers.OrderController;
import com.lwh.delegate.mvc.controllers.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DispatchServlet extends HttpServlet {
    private List<Handler> handlerMapping = new ArrayList<Handler>();

    public void init(){
        try {
            Class<?> clazz = MemberController.class;
            handlerMapping.add(new Handler().setController(clazz.newInstance())
                    .setMethod(clazz.getMethod("getMemberByMid", new Class[]{String.class}))
                    .setUrl("/design_patterns_Web_exploded/"));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doDispatch(req, resp);
    }

    /*private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uri = req.getRequestURI();
        String mid = req.getParameter("mid");
        if ("getMemberByMid".equals(uri)){
            new MemberController().getMemberByMid(mid);
        } else if ("getOrderByMid".equals(uri)){
            new OrderController().getOrderByMid(mid);
        } else if ("logOut".equals(uri)){
            new SystemController().logOut();
        } else {
            resp.getWriter().write("404");
        }
    }*/

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        //1、获取用户请求的url
        //   如果按照J2EE的标准、每个url对对应一个Serlvet，url由浏览器输入
        String uri = req.getRequestURI();

        //2、Servlet拿到url以后，要做权衡（要做判断，要做选择）
        //   根据用户请求的URL，去找到这个url对应的某一个java类的方法

        //3、通过拿到的URL去handlerMapping（我们把它认为是策略常量）
        Handler handler = null;
        for (Handler h:handlerMapping){
            if(uri.equals(h.getUrl())){
                handler = h;
                break;
            }
        }
        //4、将具体的任务分发给Method（通过反射去调用其对应的方法）
        Object object = null;
        try {
            object = handler.getMethod().invoke(handler.getController(),handler.getUrl());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        resp.getWriter().write("404");
    }

    class Handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;

        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
