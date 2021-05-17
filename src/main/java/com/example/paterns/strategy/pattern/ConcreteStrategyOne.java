package com.example.paterns.strategy.pattern;


public class ConcreteStrategyOne implements Strategy {
    @Override
    public String doSomething() {
        return "ConcreteStrategyOne";
    }
}
