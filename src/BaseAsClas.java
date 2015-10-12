package com.cocal.logic;

import javax.annotation.Resource;

/**
 * Created by cocal on 2015/10/12.
 */
public abstract class BaseAsClas {
    public int i;

    public static String kk = "kk";
    @Resource
    protected UserDao userDao;

    {
        kk = "kk2";
        System.out.println("1 " + kk);
    }

    public BaseAsClas(){
        this(BaseAsClas.kk);
        System.out.println("2");
    }

    {
        System.out.println("3");
    }

    public BaseAsClas(String str){
        System.out.println(str);
    }
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public static void main(String[] args) {
        Sing sing = new Sing();
    }
}
