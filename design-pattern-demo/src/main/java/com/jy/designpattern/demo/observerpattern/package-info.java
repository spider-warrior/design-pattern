/**
 * 观察者模式
 *
 * 观察者模式是对象的行为模式, 又叫发布-订阅模式, 模型-视图模式, 源-收听者模式或者从属者模式
 *
 * 观察者模式中存在如下几种角色:
 * 1. 抽象主题角色(Subject)
 *    把所有个观察者对象的引用保存在一个列表里.每个主题都可以有任何数量的观察者.主题提供一个接口可以删除或者添加观察者对象.
 *    主题角色又称为抽象被观察者角色
 *    抽象主题角色(抽象被观察者角色)可以用一个抽象类或者一个接口来实现
 *
 * 2.抽象观察者角色(Observer)
 *    为所有的具体观察者定义一个接口, 在的到通知时更新自己.
 *    抽象观察者角色可以用一个抽象类或接口来实现
 *
 * 3.具体主题角色(ConcreteSubject)
 *    具体主题保存对具体观察者对象有用的内部状态.在这种内部状态改变时,给其观者这发送一个通知.
 *    具体主题角色有被称为被观察者角色
 *
 * 4.具体观察者角色(ConcreteObserver)
 *    具体观察者角色保存一个指向具体主题对象的引用,和一个与主题状态相符的状态.
 *    具体观察者角色实现抽象观察者角色所要求的更新自己的接口,以便使自身的状态与主题状态自恰.
 *
 * java 对观察者模式的支持
 * 1. Observer
 *    Observer只定义了一个update()方法. 当被观察者的状态发生变化时这个方法就会被调用, 具体实现是在notifyObservers()方法, 从而通知所有的观察者对象.
 *
 * 2. Observable
 *    被观察者都是java.util.Observable的子类
 *    Observable中有两个重要的方法: setChanged(), notifyObservers()
 *    setChanged(): 被调用后会设置一个内部标记变量,代表被观察者对象的状态发生了变化.
 *    notifyObservers(): 会调用所有登记过的观察者对象的update()方法, 使观察者对象可以更新自己
 *
 * */
package com.jy.designpattern.demo.observerpattern;