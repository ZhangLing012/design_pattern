/**
 * <html>
 * <body>
 *  <P> Copyright 1994 JsonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 19941115</p>
 *  <p> Created by Jason</p>
 *  </body>
 * </html>
 */
package com.geely.design.pattern.behavioral.visitor;

import com.geely.design.pattern.behavioral.visitor.visitorAbs.Element;
import com.geely.design.pattern.behavioral.visitor.visitorIml.ObjectStruture;
import com.geely.design.pattern.behavioral.visitor.visitorIml.Visitor;

/**
* @Package：cn.ucaner.pattern.action.visitor
* @ClassName：VisitorMain
* @Description：   <p> 访问者模式 </p>
* @Author： -
* @CreatTime：2017年10月26日 下午4:49:10
* @Modify By：
* @ModifyTime：
* @Modify marker：
* @version    V1.0
 */
public class VisitorMain {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
        	/**
        	 * 访问者模式 结构对象,获取一个Element
        	 */
            Element el= ObjectStruture.createElement();
            /**
             * iVisitor.visit(this);
             * this : this - element
             */
            el.accept(new Visitor());
        }
    }
}
