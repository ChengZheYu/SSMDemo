package org.lanqiao.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * Created by 1111 on 2017/9/6.
 */
public class LogAop {
     Logger logger=Logger.getLogger(LogAop.class);
     //要记录的日志内容
    String strLog=null;
    //前置通知
    public  void somethingBefore(JoinPoint joinPoint){
        System.out.println("进入前置方法");
        //joinPoint.getTarget().getClass().getName()获取执行方法的类名
        //joinPoint.getSignature().getName()获取执行方法
        strLog="log Begining method:"
                +joinPoint.getTarget().getClass().getName()+"."
                +joinPoint.getSignature().getName();
        logger.info(strLog);
    }
    //后置通知
    public  void somethingAfter(){

    }
    //环绕通知
    public  void somethingAround(){

    }
}
