package com.qfedu.vo;

import com.qfedu.core.type.RType;
import lombok.Data;

/**
 * projectName: kataba
 *
 * @author: stefan si
 * time: 2020/10/19 17:22
 * description:
 */
@Data
public class R<T> {
    private int code;
    private String msg;
    private T data;

    public static <T> R setR(int code,String msg,T obj){
        R r = new R();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(obj);
        return r;
    }
    public static R Ok(){
        return  setR(RType.成功.getVal(),"OK",null);
    }
    public static <T>R ok(T t){
        return  setR(RType.成功.getVal(),"OK",t);
    }
    public static R Fail(){
        return  setR(RType.失败.getVal(),"fail",null);
    }



}
