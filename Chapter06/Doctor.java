package Chapter06;

public class Doctor {
  private String name;
  private int age;
  private String job;
  private String gender;
  private double salary;

  public Doctor(String name, int age, String job, String gender, double salary) {
    this.name = name;
    this.age = age;
    this.job = job;
    this.gender = gender;
    this.salary = salary; 
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getJob() {
    return job;
  } 

  public void setJob(String job) {
    this.job = job;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Doctor doctor = (Doctor) obj;
    return age == doctor.age &&
           Double.compare(doctor.salary, salary) == 0 &&
           name.equals(doctor.name) &&
           job.equals(doctor.job) && 
           gender.equals(doctor.gender);
  }
}
