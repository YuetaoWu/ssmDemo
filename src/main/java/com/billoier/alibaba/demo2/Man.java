package com.billoier.alibaba.demo2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Man implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String name;

    public void setName(String name) {
        System.out.println("第二部 设置属性");
        this.name = name;
    }

    Man() {
        System.out.println("第一步，初始化");
    }

    private void setUp() {
        System.out.println("第七步，Init Method");
    }

    private void exitMethod() {
        System.out.println("第十一步，Destory Method");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("第三步，设置Bean的名称"+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步，了解工厂信息");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步，属性设置后");
    }
    public void myRun() {
        System.out.println("第九步，自己的业务方法，Blue is the color");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第十步，Spring销毁方法");
    }
}
