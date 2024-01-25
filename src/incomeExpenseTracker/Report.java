package core;

public class Report extends Base {

	private String fileLocation;
	
	public Report() {}

	public Report(String fileLocation) {
		super();
		this.fileLocation = fileLocation;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}
}
