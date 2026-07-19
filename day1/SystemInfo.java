package day1;

public class SystemInfo {
	public static void main(String[] args) {

        String javaVersion = System.getProperty("java.version");
        String operatingSystem = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String architecture = System.getProperty("os.arch");
        String workingDirectory = System.getProperty("user.dir");

        System.out.println("SYSTEM INFORMATION");
        System.out.println("Java Version: " + javaVersion);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("User Name: " + userName);
        System.out.println("Architecture: " + architecture);
        System.out.println("Working Directory: " + workingDirectory);
    }
}
