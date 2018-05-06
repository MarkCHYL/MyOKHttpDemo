package demo.mark.com.myokhttpdemo.bean;

import java.util.List;

/**
 * 项目名称：MyOKHttpDemo
 * 类描述：基础bean
 * Created by mark on 2018/5/6 21:10
 * 修改人：mark
 * 修改时间：2018/5/6 21:10
 * 修改备注：
 */
public class BaseBean {

    /**
     * response_head : {"sys_time":"2018-05-05 21:07:08","request_id":"36dd9cf3-092d-4e03-9099-4ca04db2afe5","response_code":"1","error_content":"success","consume":"1"}
     * response_body : {"sys_time":"2018-05-05 21:07:08","last_update_time":1525525628481,"ad_list":[{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180504/201805041644043730858000007693.jpg","ad_id":"276","edit_time":"2018-05-04 16:44:09.0","ad_abstract":"","ad_title":"四月运营报告","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/reportApirl.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180427/201804271647589248733000001064.png","ad_id":"273","edit_time":"2018-04-27 16:48:05.0","ad_abstract":"","ad_title":"5月活动","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/activityMay.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180404/201804041431242126096000001638.jpg","ad_id":"270","edit_time":"2018-04-04 14:31:30.0","ad_abstract":"","ad_title":"3月运营报告","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/reportMarch.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180330/201803301603029251805000000987.png","ad_id":"267","edit_time":"2018-03-30 16:03:07.0","ad_abstract":"","ad_title":"三级等保","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/threeLevelInsurance.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180329/201803291432540013635000006942.png","ad_id":"265","edit_time":"2018-03-29 14:32:59.0","ad_abstract":"","ad_title":"4月活动","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/activityApril.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180308/201803081452118670746000001249.png","ad_id":"263","edit_time":"2018-03-08 14:52:17.0","ad_abstract":"","ad_title":"电子签章","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/electronicSignature.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180210/201802101806015526287000003474.png","ad_id":"124","edit_time":"2016-08-17 12:15:05.0","ad_abstract":"","ad_title":"邀请好友","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event17/invite.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180210/201802101758515766287000003464.jpg","ad_id":"240","edit_time":"2018-01-24 11:18:57.0","ad_abstract":"","ad_title":"微信功能升级公告","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/wxNotice.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180210/201802101754437206287000003450.png","ad_id":"122","edit_time":"2016-08-13 13:09:47.0","ad_abstract":"","ad_title":"新手188元红包随便拿","ad_content":"","ad_type":"2","ad_param":"15"}]}
     */

    private ResponseHeadBean response_head;
    private ResponseBodyBean response_body;

    public ResponseHeadBean getResponse_head() {
        return response_head;
    }

    public void setResponse_head(ResponseHeadBean response_head) {
        this.response_head = response_head;
    }

    public ResponseBodyBean getResponse_body() {
        return response_body;
    }

    public void setResponse_body(ResponseBodyBean response_body) {
        this.response_body = response_body;
    }

    public static class ResponseHeadBean {
        /**
         * sys_time : 2018-05-05 21:07:08
         * request_id : 36dd9cf3-092d-4e03-9099-4ca04db2afe5
         * response_code : 1
         * error_content : success
         * consume : 1
         */

        private String sys_time;
        private String request_id;
        private String response_code;
        private String error_content;
        private String consume;

        public String getSys_time() {
            return sys_time;
        }

        public void setSys_time(String sys_time) {
            this.sys_time = sys_time;
        }

        public String getRequest_id() {
            return request_id;
        }

        public void setRequest_id(String request_id) {
            this.request_id = request_id;
        }

        public String getResponse_code() {
            return response_code;
        }

        public void setResponse_code(String response_code) {
            this.response_code = response_code;
        }

        public String getError_content() {
            return error_content;
        }

        public void setError_content(String error_content) {
            this.error_content = error_content;
        }

        public String getConsume() {
            return consume;
        }

        public void setConsume(String consume) {
            this.consume = consume;
        }
    }

    public static class ResponseBodyBean {
        /**
         * sys_time : 2018-05-05 21:07:08
         * last_update_time : 1525525628481
         * ad_list : [{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180504/201805041644043730858000007693.jpg","ad_id":"276","edit_time":"2018-05-04 16:44:09.0","ad_abstract":"","ad_title":"四月运营报告","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/reportApirl.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180427/201804271647589248733000001064.png","ad_id":"273","edit_time":"2018-04-27 16:48:05.0","ad_abstract":"","ad_title":"5月活动","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/activityMay.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180404/201804041431242126096000001638.jpg","ad_id":"270","edit_time":"2018-04-04 14:31:30.0","ad_abstract":"","ad_title":"3月运营报告","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/reportMarch.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180330/201803301603029251805000000987.png","ad_id":"267","edit_time":"2018-03-30 16:03:07.0","ad_abstract":"","ad_title":"三级等保","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/threeLevelInsurance.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180329/201803291432540013635000006942.png","ad_id":"265","edit_time":"2018-03-29 14:32:59.0","ad_abstract":"","ad_title":"4月活动","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/activityApril.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180308/201803081452118670746000001249.png","ad_id":"263","edit_time":"2018-03-08 14:52:17.0","ad_abstract":"","ad_title":"电子签章","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/electronicSignature.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180210/201802101806015526287000003474.png","ad_id":"124","edit_time":"2016-08-17 12:15:05.0","ad_abstract":"","ad_title":"邀请好友","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event17/invite.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180210/201802101758515766287000003464.jpg","ad_id":"240","edit_time":"2018-01-24 11:18:57.0","ad_abstract":"","ad_title":"微信功能升级公告","ad_content":"","ad_type":"4","ad_param":"https://www.592qqt.com/event18/wxNotice.php?1=1"},{"ad_position":"4","ad_pic_url":"http://image-file.chinahsds.com//qqt/advertises/20180210/201802101754437206287000003450.png","ad_id":"122","edit_time":"2016-08-13 13:09:47.0","ad_abstract":"","ad_title":"新手188元红包随便拿","ad_content":"","ad_type":"2","ad_param":"15"}]
         */

        private String sys_time;
        private long last_update_time;
        private List<AdListBean> ad_list;

        public String getSys_time() {
            return sys_time;
        }

        public void setSys_time(String sys_time) {
            this.sys_time = sys_time;
        }

        public long getLast_update_time() {
            return last_update_time;
        }

        public void setLast_update_time(long last_update_time) {
            this.last_update_time = last_update_time;
        }

        public List<AdListBean> getAd_list() {
            return ad_list;
        }

        public void setAd_list(List<AdListBean> ad_list) {
            this.ad_list = ad_list;
        }

        public static class AdListBean {
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

        @Override
        public String toString() {
            return "ResponseBodyBean{" +
                    "sys_time='" + sys_time + '\'' +
                    ", last_update_time=" + last_update_time +
                    ", ad_list=" + ad_list +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "response_head=" + response_head +
                ", response_body=" + response_body +
                '}';
    }
}
