package com.zr.greendaodemo.bean;

import android.text.TextUtils;
import com.zr.greendaodemo.dto.UserDto;
import com.zr.greendaodemo.util.ModelParser;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Unique;

/**
 * Created by zr on 2018/8/27.
 */

@Entity
public class User {
    @Id(autoincrement = true)
    private Long id;
    private String name;
    private String email;
    private String phone_number;
    @Unique
    private String sn;
    private int successful_trading_orders_count;
    private double avg_recieved_reviews_rating;
    private int trusted_count;
    private String image_url;
    private boolean alive;
    private boolean email_confirmed;
    private boolean identify_confirmed;
    private boolean advanced_identity_confirmed;
    private boolean is_certified_merchant;
    private String verification_method;
    private String real_name;
    private String human_id_type;
    private String locale;
    private String token;
    private long user_id;
    private String EXTRA;

    /**
     * 扩展字段存放类，避免频繁升级数据库
     */
    public static class Extra {
        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Extra{" +
                    "age=" + age +
                    '}';
        }
    }


    @Generated(hash = 1795458539)
    public User(Long id, String name, String email, String phone_number, String sn,
            int successful_trading_orders_count, double avg_recieved_reviews_rating,
            int trusted_count, String image_url, boolean alive,
            boolean email_confirmed, boolean identify_confirmed,
            boolean advanced_identity_confirmed, boolean is_certified_merchant,
            String verification_method, String real_name, String human_id_type,
            String locale, String token, long user_id, String EXTRA) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.sn = sn;
        this.successful_trading_orders_count = successful_trading_orders_count;
        this.avg_recieved_reviews_rating = avg_recieved_reviews_rating;
        this.trusted_count = trusted_count;
        this.image_url = image_url;
        this.alive = alive;
        this.email_confirmed = email_confirmed;
        this.identify_confirmed = identify_confirmed;
        this.advanced_identity_confirmed = advanced_identity_confirmed;
        this.is_certified_merchant = is_certified_merchant;
        this.verification_method = verification_method;
        this.real_name = real_name;
        this.human_id_type = human_id_type;
        this.locale = locale;
        this.token = token;
        this.user_id = user_id;
        this.EXTRA = EXTRA;
    }
    @Generated(hash = 586692638)
    public User() {
    }

    public User(UserDto userDto) {
        if (userDto == null) {
            return;
        }

        this.name = userDto.getName();
        this.email = userDto.getEmail();
        this.sn = userDto.getSn();

        this.EXTRA = generateExtraStr(userDto);
    }

    /**
     * 获取Extra的json字符串内容
     * @param userDto
     * @return
     */
    public String generateExtraStr(UserDto userDto) {
        if (userDto ==  null) {
            return null;
        }

        Extra extra = new Extra();

        // 给Extra中字段赋值
        extra.setAge(userDto.getAge());

        ModelParser parser = new ModelParser();
        return parser.toJson(extra);
    }

    /**
     * 获取extra对象
     * @return
     */
    public Extra getExtra() {
        if (TextUtils.isEmpty(EXTRA)) {
            return null;
        }

        ModelParser parser = new ModelParser();
        Extra extra = parser.fromJson(EXTRA, Extra.class);
        return extra;
    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone_number() {
        return this.phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public String getSn() {
        return this.sn;
    }
    public void setSn(String sn) {
        this.sn = sn;
    }
    public int getSuccessful_trading_orders_count() {
        return this.successful_trading_orders_count;
    }
    public void setSuccessful_trading_orders_count(
            int successful_trading_orders_count) {
        this.successful_trading_orders_count = successful_trading_orders_count;
    }
    public double getAvg_recieved_reviews_rating() {
        return this.avg_recieved_reviews_rating;
    }
    public void setAvg_recieved_reviews_rating(double avg_recieved_reviews_rating) {
        this.avg_recieved_reviews_rating = avg_recieved_reviews_rating;
    }
    public int getTrusted_count() {
        return this.trusted_count;
    }
    public void setTrusted_count(int trusted_count) {
        this.trusted_count = trusted_count;
    }
    public String getImage_url() {
        return this.image_url;
    }
    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
    public boolean getAlive() {
        return this.alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    public boolean getEmail_confirmed() {
        return this.email_confirmed;
    }
    public void setEmail_confirmed(boolean email_confirmed) {
        this.email_confirmed = email_confirmed;
    }
    public boolean getIdentify_confirmed() {
        return this.identify_confirmed;
    }
    public void setIdentify_confirmed(boolean identify_confirmed) {
        this.identify_confirmed = identify_confirmed;
    }
    public boolean getAdvanced_identity_confirmed() {
        return this.advanced_identity_confirmed;
    }
    public void setAdvanced_identity_confirmed(
            boolean advanced_identity_confirmed) {
        this.advanced_identity_confirmed = advanced_identity_confirmed;
    }
    public boolean getIs_certified_merchant() {
        return this.is_certified_merchant;
    }
    public void setIs_certified_merchant(boolean is_certified_merchant) {
        this.is_certified_merchant = is_certified_merchant;
    }
    public String getVerification_method() {
        return this.verification_method;
    }
    public void setVerification_method(String verification_method) {
        this.verification_method = verification_method;
    }
    public String getReal_name() {
        return this.real_name;
    }
    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }
    public String getHuman_id_type() {
        return this.human_id_type;
    }
    public void setHuman_id_type(String human_id_type) {
        this.human_id_type = human_id_type;
    }
    public String getLocale() {
        return this.locale;
    }
    public void setLocale(String locale) {
        this.locale = locale;
    }
    public String getToken() {
        return this.token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public long getUser_id() {
        return this.user_id;
    }
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
    public String getEXTRA() {
        return this.EXTRA;
    }
    public void setEXTRA(String EXTRA) {
        this.EXTRA = EXTRA;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", sn='" + sn + '\'' +
                ", successful_trading_orders_count=" + successful_trading_orders_count +
                ", avg_recieved_reviews_rating=" + avg_recieved_reviews_rating +
                ", trusted_count=" + trusted_count +
                ", image_url='" + image_url + '\'' +
                ", alive=" + alive +
                ", email_confirmed=" + email_confirmed +
                ", identify_confirmed=" + identify_confirmed +
                ", advanced_identity_confirmed=" + advanced_identity_confirmed +
                ", is_certified_merchant=" + is_certified_merchant +
                ", verification_method='" + verification_method + '\'' +
                ", real_name='" + real_name + '\'' +
                ", human_id_type='" + human_id_type + '\'' +
                ", locale='" + locale + '\'' +
                ", token='" + token + '\'' +
                ", user_id=" + user_id +
                ", EXTRA='" + EXTRA + '\'' +
                '}';
    }
}
