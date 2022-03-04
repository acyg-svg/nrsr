package cn.com.cyg.pojo;

public class Notice {
    private int onticeId;
    private String noticeInfo;

    public int getOnticeId() {
        return onticeId;
    }

    public void setOnticeId(int onticeId) {
        this.onticeId = onticeId;
    }

    public String getNoticeInfo() {
        return noticeInfo;
    }

    public void setNoticeInfo(String noticeInfo) {
        this.noticeInfo = noticeInfo;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "onticeId=" + onticeId +
                ", noticeInfo='" + noticeInfo + '\'' +
                '}';
    }
}
