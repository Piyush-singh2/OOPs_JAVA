public class OnlineCourses extends Courses{
    String platform;
    String duration;
    boolean isCertified;

    public OnlineCourses(String platform, String duration, boolean isCertified, String courseName, String instructor, int credits) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
        this.isCertified = isCertified;
    }

    
    void showDetails(){
        System.out.println("--------------------------");
        System.out.println("Course Name :" + courseName  );
        System.out.println("Platform :" + platform);
        System.out.println("Duration :" + duration);
        System.out.println("Credits :" + credits);
        System.out.println("Cretificate available :" + isCertified);

    }

}
