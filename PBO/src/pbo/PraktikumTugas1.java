package pbo;
class PraktikumTugas1 {
    private String name;
    private String grade;
    private String major;
    private String faculty;
    private String nim;
    
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public void setNIM(String nim){
        this.nim = nim;
    }
    
    public String getName(){
        return this.name;
    }
    public String getGrade(){
        return this.grade;
    }
    public String getMajor(){
        return this.major;
    }
    public String getFaculty(){
        return this.faculty;
    }
    public String getNIM(){
        return this.nim;
    }
    public static void main(String[] args) {
        PraktikumTugas1 myObj= new PraktikumTugas1();
        myObj.setName("Hamdani Zulva");
        myObj.setGrade("E");
        myObj.setMajor("Informtika");  
        myObj.setFaculty("Teknik");
        myObj.setNIM("202010370311211");
        System.out.println("Nama:"+myObj.getName()+"\nKelas:"+myObj.getGrade()+"\nJurusan:"
                +myObj.getMajor()+"\nFakultas:"+myObj.getFaculty()+"\nNIM:"+myObj.getNIM());
    }
}
