package com.cqapp.bean;

/**
 * Created with IntelliJ IDEA.
 * User: WangYu
 * Date: 2020/2/24
 * Time: 21:01
 * Description: Result对象为了方便而编写的一个POJO
 */
public class Result {

    private int stateCode;
    private String message;

    public Result() {
        super();
    }

    public Result(int stateCode, String message) {
        super();
        this.stateCode = stateCode;
        this.message = message;
    }

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "stateCode=" + stateCode +
                ", message='" + message + '\'' +
                '}';
    }
}
