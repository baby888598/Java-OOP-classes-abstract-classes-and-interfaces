package schoolmanagement;

public abstract class AcademicStaff {
    private String staffName;
    private String qualification;

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public abstract void performAcademicDuty();

}