package iam.db;

public class SPARK_SQL extends SPARK_SQLKey {
    private String DATA_NAME;

    private String TYPE;

    private String TABLE_KEY;

    private Long ROLE_ID;

    private Long MIN;

    private Long MAX;

    private Long NUM_PARTITION;

    private Long OUT_TYPE;

    private String OUT_DIR;

    private Long OUT_MODE;

    private Long ACTION1;

    private String ACTION2;

    private String ACTION3;

    private String OPTIONS;

    private Long MODULE_ID;

    private String MODULE_NAME;

    private String DESCRIPTION;

    private String DATA;

    public String getDATA_NAME() {
        return DATA_NAME;
    }

    public void setDATA_NAME(String DATA_NAME) {
        this.DATA_NAME = DATA_NAME == null ? null : DATA_NAME.trim();
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE == null ? null : TYPE.trim();
    }

    public String getTABLE_KEY() {
        return TABLE_KEY;
    }

    public void setTABLE_KEY(String TABLE_KEY) {
        this.TABLE_KEY = TABLE_KEY == null ? null : TABLE_KEY.trim();
    }

    public Long getROLE_ID() {
        return ROLE_ID;
    }

    public void setROLE_ID(Long ROLE_ID) {
        this.ROLE_ID = ROLE_ID;
    }

    public Long getMIN() {
        return MIN;
    }

    public void setMIN(Long MIN) {
        this.MIN = MIN;
    }

    public Long getMAX() {
        return MAX;
    }

    public void setMAX(Long MAX) {
        this.MAX = MAX;
    }

    public Long getNUM_PARTITION() {
        return NUM_PARTITION;
    }

    public void setNUM_PARTITION(Long NUM_PARTITION) {
        this.NUM_PARTITION = NUM_PARTITION;
    }

    public Long getOUT_TYPE() {
        return OUT_TYPE;
    }

    public void setOUT_TYPE(Long OUT_TYPE) {
        this.OUT_TYPE = OUT_TYPE;
    }

    public String getOUT_DIR() {
        return OUT_DIR;
    }

    public void setOUT_DIR(String OUT_DIR) {
        this.OUT_DIR = OUT_DIR == null ? null : OUT_DIR.trim();
    }

    public Long getOUT_MODE() {
        return OUT_MODE;
    }

    public void setOUT_MODE(Long OUT_MODE) {
        this.OUT_MODE = OUT_MODE;
    }

    public Long getACTION1() {
        return ACTION1;
    }

    public void setACTION1(Long ACTION1) {
        this.ACTION1 = ACTION1;
    }

    public String getACTION2() {
        return ACTION2;
    }

    public void setACTION2(String ACTION2) {
        this.ACTION2 = ACTION2 == null ? null : ACTION2.trim();
    }

    public String getACTION3() {
        return ACTION3;
    }

    public void setACTION3(String ACTION3) {
        this.ACTION3 = ACTION3 == null ? null : ACTION3.trim();
    }

    public String getOPTIONS() {
        return OPTIONS;
    }

    public void setOPTIONS(String OPTIONS) {
        this.OPTIONS = OPTIONS == null ? null : OPTIONS.trim();
    }

    public Long getMODULE_ID() {
        return MODULE_ID;
    }

    public void setMODULE_ID(Long MODULE_ID) {
        this.MODULE_ID = MODULE_ID;
    }

    public String getMODULE_NAME() {
        return MODULE_NAME;
    }

    public void setMODULE_NAME(String MODULE_NAME) {
        this.MODULE_NAME = MODULE_NAME == null ? null : MODULE_NAME.trim();
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION == null ? null : DESCRIPTION.trim();
    }

    public String getDATA() {
        return DATA;
    }

    public void setDATA(String DATA) {
        this.DATA = DATA == null ? null : DATA.trim();
    }

    @Override
    public String toString() {
        return "SPARK_SQL{" +
                "DATA_NAME='" + DATA_NAME + '\'' +
                ", TYPE='" + TYPE + '\'' +
                ", TABLE_KEY='" + TABLE_KEY + '\'' +
                ", ROLE_ID=" + ROLE_ID +
                ", MIN=" + MIN +
                ", MAX=" + MAX +
                ", NUM_PARTITION=" + NUM_PARTITION +
                ", OUT_TYPE=" + OUT_TYPE +
                ", OUT_DIR='" + OUT_DIR + '\'' +
                ", OUT_MODE=" + OUT_MODE +
                ", ACTION1=" + ACTION1 +
                ", ACTION2='" + ACTION2 + '\'' +
                ", ACTION3='" + ACTION3 + '\'' +
                ", OPTIONS='" + OPTIONS + '\'' +
                ", MODULE_ID=" + MODULE_ID +
                ", MODULE_NAME='" + MODULE_NAME + '\'' +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                ", DATA='" + DATA + '\'' +
                '}';
    }
}