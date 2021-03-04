package cn.Test;

import cn.Test.inter.fly;

public class plane implements fly {
    @Override
    public void fly() {
        System.out.println("飞机能飞");
    }
}
