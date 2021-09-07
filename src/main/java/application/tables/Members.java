package application.tables;

import java.sql.Date;

public class Members {
    private int memberId;
    private String memberName;
    private MemberState state;
    private String emilMember;
    private byte[] profilPic;
    private Date regTime;

    public Members() {
    }

    public Members(int id, String name, String stateFromDB, String emil) {
        memberId = id;
        memberName = name;
        state = MemberState.valueOf(stateFromDB);
        emilMember = emil;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public MemberState getState() {
        return state;
    }

    public void setState(MemberState state) {
        this.state = state;
    }

    public String getEmilMember() {
        return emilMember;
    }

    public void setEmilMember(String emilMember) {
        this.emilMember = emilMember;
    }

    public byte[] getProfilPic() {
        return profilPic;
    }

    public void setProfilPic(byte[] profilPic) {
        this.profilPic = profilPic;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}
