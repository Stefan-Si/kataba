package com.qfedu.core.type;


public enum RType {
    成功(1),失败(2),登录失败(3);

    private int val;

    public int getVal() {
        return val;
    }

    private RType(int v){
        val=v;
    }
}
