package demo.mark.com.myokhttpdemo.bean;

import java.util.List;

/**
 * 项目名称：MyOKHttpDemo
 * 类描述：
 * Created by mark on 2018/5/6 23:42
 * 修改人：mark
 * 修改时间：2018/5/6 23:42
 * 修改备注：
 */
public class LoginBean {
    /**
     * data : {"id":"560f104f-5ee1-4406-95a2-8813f53b913f","number":888788,"mobile":"18670756684","nickname":"测试阿卡丽","email":"","type":0,"companyLogoUrl":null,"headPortraitUrl":"/avatar/560f104f-5ee1-4406-95a2-8813f53b913f/2674549183449358.jpg","introduction":null,"isMember":0,"easemobName":null,"easemobPass":null,"registrationId":null}
     * error : []
     * token : b7c180ab-de19-4e3c-b9bc-a50800f895e4
     */

    private DataBean data;
    private String token;
    private List<ErrorBean> error;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<ErrorBean> getError() {
        return error;
    }

    public void setError(List<ErrorBean> error) {
        this.error = error;
    }

    public static class DataBean {
        /**
         * id : 560f104f-5ee1-4406-95a2-8813f53b913f
         * number : 888788
         * mobile : 18670756684
         * nickname : 测试阿卡丽
         * email :
         * type : 0
         * companyLogoUrl : null
         * headPortraitUrl : /avatar/560f104f-5ee1-4406-95a2-8813f53b913f/2674549183449358.jpg
         * introduction : null
         * isMember : 0
         * easemobName : null
         * easemobPass : null
         * registrationId : null
         */

        private String id;
        private int number;
        private String mobile;
        private String nickname;
        private String email;
        private int type;
        private Object companyLogoUrl;
        private String headPortraitUrl;
        private Object introduction;
        private int isMember;
        private String easemobName;
        private String easemobPass;
        private Object registrationId;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public Object getCompanyLogoUrl() {
            return companyLogoUrl;
        }

        public void setCompanyLogoUrl(Object companyLogoUrl) {
            this.companyLogoUrl = companyLogoUrl;
        }

        public String getHeadPortraitUrl() {
            return headPortraitUrl;
        }

        public void setHeadPortraitUrl(String headPortraitUrl) {
            this.headPortraitUrl = headPortraitUrl;
        }

        public Object getIntroduction() {
            return introduction;
        }

        public void setIntroduction(Object introduction) {
            this.introduction = introduction;
        }

        public int getIsMember() {
            return isMember;
        }

        public void setIsMember(int isMember) {
            this.isMember = isMember;
        }

        public String getEasemobName() {
            return easemobName;
        }

        public void setEasemobName(String easemobName) {
            this.easemobName = easemobName;
        }

        public String getEasemobPass() {
            return easemobPass;
        }

        public void setEasemobPass(String easemobPass) {
            this.easemobPass = easemobPass;
        }

        public Object getRegistrationId() {
            return registrationId;
        }

        public void setRegistrationId(Object registrationId) {
            this.registrationId = registrationId;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "id='" + id + '\'' +
                    ", number=" + number +
                    ", mobile='" + mobile + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", email='" + email + '\'' +
                    ", type=" + type +
                    ", companyLogoUrl=" + companyLogoUrl +
                    ", headPortraitUrl='" + headPortraitUrl + '\'' +
                    ", introduction=" + introduction +
                    ", isMember=" + isMember +
                    ", easemobName='" + easemobName + '\'' +
                    ", easemobPass='" + easemobPass + '\'' +
                    ", registrationId=" + registrationId +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "data=" + data +
                ", token='" + token + '\'' +
                ", error=" + error +
                '}';
    }
}
