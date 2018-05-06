package demo.mark.com.myokhttpdemo.bean;

import java.io.Serializable;

/**
 * 项目名称：MyOKHttpDemo
 * 类描述：
 * Created by mark on 2018/5/6 21:17
 * 修改人：mark
 * 修改时间：2018/5/6 21:17
 * 修改备注：
 */
public class AdListBean extends BaseBean implements Serializable{
    /**
     * ad_position : 4
     * ad_pic_url : http://image-file.chinahsds.com//qqt/advertises/20180504/201805041644043730858000007693.jpg
     * ad_id : 276
     * edit_time : 2018-05-04 16:44:09.0
     * ad_abstract :
     * ad_title : 四月运营报告
     * ad_content :
     * ad_type : 4
     * ad_param : https://www.592qqt.com/event18/reportApirl.php?1=1
     */

    private String ad_position;
    private String ad_pic_url;
    private String ad_id;
    private String edit_time;
    private String ad_abstract;
    private String ad_title;
    private String ad_content;
    private String ad_type;
    private String ad_param;

    public String getAd_position() {
        return ad_position;
    }

    public void setAd_position(String ad_position) {
        this.ad_position = ad_position;
    }

    public String getAd_pic_url() {
        return ad_pic_url;
    }

    public void setAd_pic_url(String ad_pic_url) {
        this.ad_pic_url = ad_pic_url;
    }

    public String getAd_id() {
        return ad_id;
    }

    public void setAd_id(String ad_id) {
        this.ad_id = ad_id;
    }

    public String getEdit_time() {
        return edit_time;
    }

    public void setEdit_time(String edit_time) {
        this.edit_time = edit_time;
    }

    public String getAd_abstract() {
        return ad_abstract;
    }

    public void setAd_abstract(String ad_abstract) {
        this.ad_abstract = ad_abstract;
    }

    public String getAd_title() {
        return ad_title;
    }

    public void setAd_title(String ad_title) {
        this.ad_title = ad_title;
    }

    public String getAd_content() {
        return ad_content;
    }

    public void setAd_content(String ad_content) {
        this.ad_content = ad_content;
    }

    public String getAd_type() {
        return ad_type;
    }

    public void setAd_type(String ad_type) {
        this.ad_type = ad_type;
    }

    public String getAd_param() {
        return ad_param;
    }

    public void setAd_param(String ad_param) {
        this.ad_param = ad_param;
    }

    @Override
    public String toString() {
        return "AdListBean{" +
                "ad_position='" + ad_position + '\'' +
                ", ad_pic_url='" + ad_pic_url + '\'' +
                ", ad_id='" + ad_id + '\'' +
                ", edit_time='" + edit_time + '\'' +
                ", ad_abstract='" + ad_abstract + '\'' +
                ", ad_title='" + ad_title + '\'' +
                ", ad_content='" + ad_content + '\'' +
                ", ad_type='" + ad_type + '\'' +
                ", ad_param='" + ad_param + '\'' +
                '}';
    }
}
