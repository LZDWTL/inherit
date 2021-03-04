package cn.Test;

/**
 * 抽象类
 */

public abstract class Animal {
    /**
     * bark叫不能具体化
     * 不同动物有不同叫声，所以这种行为必须是抽象的，因为不确定是哪种动物
     */

    abstract void bark();
}
