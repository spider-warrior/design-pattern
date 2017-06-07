/**
 *  建造者模式
 *  建造者模式能够将一个复杂的构建与其表示相分离,使得同样的构建过程可以创建不同的表示
 *  建造者模式是把复杂的内部创建封装在内部,对于调用者来说,只需要传人建造者和建造工具,无需关心建造过程
 *
 *  一般使用场景:
 *  1.需要生产的产品有复杂的内部结构
 *  2.需要生产的产品对象的属性互相依赖
 *  3.在创建的过程中会使用到七大对象
 *
 *  角色:
 *  1.Builder(抽象建造者)
 *      为创建一个产品Product对象的各个部件指定抽象接口,在接口中一般声明两类方法:
 *          buildPartX() 用于创建复杂对象的各个部件
 *          getResult() 用与返回复杂对象
 *      Builder既可以为抽象类也可以为接口
 *  2.ConcreteBuilder(具体建造者)
 *      实现了Builder接口,实现各个部件具体构造和装配方法
 *  3.Product(产品角色)
 *      被构建的复杂对象,包含多个组成部件,具体建造者创建该产品的内部表示并定义它的装配过程
 *  4.Director(指挥者)
 *      安排对象的建造次序,指挥者与抽象建造者存在关联关系.客户端一般只需要与指挥者进行交互,在客户端指定具体具体建造者的类型,并实例化具体建造者对象,
 *      然后通过指挥者的构造函数或Setter将对象传入指挥类中
 *
 *
 *
 * */
package com.jy.designpattern.demo.builderpattern;