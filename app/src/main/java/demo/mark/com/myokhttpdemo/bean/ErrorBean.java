package demo.mark.com.myokhttpdemo.bean;

/**
 * 项目名称：MyOKHttpDemo
 * 类描述：
 * Created by mark on 2018/5/6 23:43
 * 修改人：mark
 * 修改时间：2018/5/6 23:43
 * 修改备注：
 */
public class ErrorBean {
    /**
     * field :
     * message : 账号或密码不匹配。
     */

    private String field;
    private String message;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorBean{" +
                "field='" + field + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
