import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.UUID;

public class FrFunction {
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String CHAR_NUMBER = "0123456789";
    private static final String CHARS_SPECIAL = "!#$%&*()_+-=[]|,.?><";
    private static final String CHAR_NORMAL = CHAR_LOWER + CHAR_UPPER + CHAR_NUMBER;

    private static final SecureRandom RANDOM = new SecureRandom();
    private static final Faker FAKER = new Faker(Locale.CHINA);

    /**
     * 随机一个数字
     */
    public int randomInt() {
        return RANDOM.nextInt(100);
    }

    /**
     * 随机一个布尔值
     */
    public boolean randomBoolean() {
        return RANDOM.nextBoolean();
    }

    /**
     * 随机一个浮点数
     */
    public float randomFloat() {
        return RANDOM.nextFloat();
    }

    /**
     * 随机一个字符
     */
    public char randomChar() {
        return CHAR_LOWER.charAt(RANDOM.nextInt(26));
    }

    /**
     * 随机一个中文字符
     */
    public char randomChineseChar() {
        return (char) (0x4E00 + RANDOM.nextInt(0x9FFF - 0x4E00 + 1));
    }

    /**
     * 随机一个uuid
     */
    public String uuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * 随机十位长度的字符串
     */
    public String randomString() {
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            int randomIndex = RANDOM.nextInt(CHAR_NORMAL.length());
            sb.append(CHAR_NORMAL.charAt(randomIndex));
        }
        return sb.toString();
    }

    /**
     * 当前时间yyyy-MM-dd HH:mm:ss
     */
    public String dateTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * 当前日期yyyy-MM-dd
     */
    public String date() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    /**
     * 当前时间HH:mm:ss
     */
    public String time() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    /**
     * 当前时间戳
     */
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    /**
     * 地址
     */
    public String address() {
        return FAKER.address().fullAddress();
    }


    /**
     * 姓名
     */
    public String name() {
        return FAKER.name().name();
    }

    /**
     * 邮箱
     */
    public String email() {
        return FAKER.internet().emailAddress();
    }

    /**
     * 手机号
     */
    public String phone() {
        return FAKER.phoneNumber().cellPhone();
    }

    /**
     * 密码
     */
    public String password() {
        return FAKER.internet().password();
    }

}
