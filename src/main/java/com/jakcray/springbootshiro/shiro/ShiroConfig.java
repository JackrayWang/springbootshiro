package com.jakcray.springbootshiro.shiro;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.Cookie;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //默认跳转到登录页面
        shiroFilterFactoryBean.setLoginUrl("/login");
        //登录成功后的页面
        shiroFilterFactoryBean.setSuccessUrl("/index");
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");


        //自定义过滤器
        Map<String, Filter> filterMap = new LinkedHashMap<>();
        shiroFilterFactoryBean.setFilters(filterMap);

        //设置控制map
        Map<String,String> filterChainDefinitionMap = new LinkedHashMap<>();
        //配置不会被拦截的链接  顺序判断
        filterChainDefinitionMap.put("/static/**","anon");
        //配置退出，过滤器，其中的具体的退出代码Shiro已经以我们实现了
        filterChainDefinitionMap.put("/logout","logout");



        //特别注意，过滤链定义，从上向下顺序执行，一般讲/**放在最边，这是一个坑呢，一不小心代码就不好使了
        //所有的url都必须认证通过后才可以访问，anon所有url都可以匿名访问
//        filterChainDefinitionMap.put("/**","annon")

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }


    /**
     * 核心的事物管理
     * 设置realm、cacheManage等
     * （好像所有的shiro功能都需要设置在这个里面）
     * @return
     */
    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        //设置realm
        defaultWebSecurityManager.setRealm(myShiroRealm());
        //设置rememberMe
//        defaultWebSecurityManager.setRememberMeManager(rememberMeManager());
        //设置缓存
//        defaultWebSecurityManager.setCacheManager(ehCacheManager());
        return defaultWebSecurityManager;
    }

    /**
     * 身份认证Realm，此处的注入不可缺少。否则会在UserRealm中注入对象报空指针
     * @return
     */
    @Bean
    public UserRealm myShiroRealm(){
        UserRealm myShiroRealm = new UserRealm();
        //使用的hash密码比较器，，也可以使用自己的密码比较器
//        myShiroRealm.setCredentialsMatcher(hashedCredentialsMatcher());

        return myShiroRealm;
    }

//    /**
//     * 配置自定义的密码比较器
//     * @return
//     */
//    @Bean
//    public CredentialsMatcher credentialsMatcher(){
//        return new CredentialsMatcher();
//    }
//
//    /**
//     * 哈希密码比较器。在myShiroReal,中作为参数使用
//     * 登录时会比较用户输入的密码，跟数据库密码结合盐值salt解密后时候一致
//     * @return
//     */
//    @Bean
//    public HashedCredentialsMatcher hashedCredentialsMatcher(){
//        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
//        hashedCredentialsMatcher.setHashAlgorithmName("md5");//散列散发：这里使用MD5算法
//        hashedCredentialsMatcher.setHashIterations(2);//散列的次数，比如散列两次，相当于md5（md5（""））
//        return hashedCredentialsMatcher;
//    }
//
//    /**
//     * shiro缓存管理器
//     * 需要注入对应的其它实体类中：安全管理器securityManager
//     * 可见securiityManager是整个shiro的核心
//     * @return
//     */
//    @Bean
//    public EhCacheManager ehCacheManager(){
//        EhCacheManager ehCacheManager = new EhCacheManager();
//        //需要配置配置文件才可以
//        ehCacheManager.setCacheManagerConfigFile("");
//        return ehCacheManager;
//    }
//
//    /**
//     * 记住我管理器
//     * @return
//     */
//    @Bean
//    public CookieRememberMeManager rememberMeManager(){
//        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
//        cookieRememberMeManager.setCookie(rememberMeCookie());
//
//        return cookieRememberMeManager;
//    }
//
//
//    /**
//     * Cookie对象
//     * @return
//     */
//    @Bean
//    public Cookie rememberMeCookie(){
//        SimpleCookie simpleCookie = new SimpleCookie("rememberMe");
//        //技术我cookie生效时间，单位秒
//        simpleCookie.setMaxAge(3600);
//        return simpleCookie;
//    }
//
//
//    /**
//     * 开启shiro aop注解支持
//     * 使用代理方式：所以需要开启代码支持：否则@RequiresRoles等注解无法生效
//     * @param securityManager
//     * @return
//     */
//    @Bean
//    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
//        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
//        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
//        return authorizationAttributeSourceAdvisor;
//    }
//
//    /**
//     * Shiro 声明周期处理器
//     * @return
//     */
//    @Bean
//    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor(){
//        return new LifecycleBeanPostProcessor();
//    }
//
//
//    /**
//     * 自动创建代理
//     * @return
//     */
//    @Bean
//    @DependsOn({"lifecycleBeanPostProcessor"})
//    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
//        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
//        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
//        return defaultAdvisorAutoProxyCreator;
//    }


}
