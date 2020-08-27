package cn.vector.esdemo.response;


/**
 * @author xiyouyan
 */

public enum ResponseCodeEnum {
    SUCCESS(0, "SUCCESS"),
    ERROR(1, "ERROR");
    private final int CODE;
    private final String DESC;


    ResponseCodeEnum(int code, String desc) {
        this.CODE = code;
        this.DESC = desc;
    }

    public int getCode() {
        return CODE;
    }

    public String getDesc() {
        return DESC;
    }


}
