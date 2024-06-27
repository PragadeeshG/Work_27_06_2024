package com.test1;

public class QunitRunner {
	private Integer testCaseId;
	private String runnerQunit1;
	private String runnerValue1;
	private String runnerQunit2;
	private String runnerValue2;
	private String runnerQunit3;
	private String runnerValue3;
	private String runnerSystem;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public QunitRunner() {

	}

	public QunitRunner(Integer testCaseId, String runnerQunit1, String runnerValue1, String runnerQunit2,
			String runnerValue2, String runnerQunit3, String runnerValue3, String runnerSystem, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.testCaseId = testCaseId;
		this.runnerQunit1 = runnerQunit1;
		this.runnerValue1 = runnerValue1;
		this.runnerQunit2 = runnerQunit2;
		this.runnerValue2 = runnerValue2;
		this.runnerQunit3 = runnerQunit3;
		this.runnerValue3 = runnerValue3;
		this.runnerSystem = runnerSystem;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(Integer testCaseId) {
		this.testCaseId = testCaseId;
	}

	public String getRunnerQunit1() {
		return runnerQunit1;
	}

	public void setRunnerQunit1(String runnerQunit1) {
		this.runnerQunit1 = runnerQunit1;
	}

	public String getRunnerValue1() {
		return runnerValue1;
	}

	public void setRunnerValue1(String runnerValue1) {
		this.runnerValue1 = runnerValue1;
	}

	public String getRunnerQunit2() {
		return runnerQunit2;
	}

	public void setRunnerQunit2(String runnerQunit2) {
		this.runnerQunit2 = runnerQunit2;
	}

	public String getRunnerValue2() {
		return runnerValue2;
	}

	public void setRunnerValue2(String runnerValue2) {
		this.runnerValue2 = runnerValue2;
	}

	public String getRunnerQunit3() {
		return runnerQunit3;
	}

	public void setRunnerQunit3(String runnerQunit3) {
		this.runnerQunit3 = runnerQunit3;
	}

	public String getRunnerValue3() {
		return runnerValue3;
	}

	public void setRunnerValue3(String runnerValue3) {
		this.runnerValue3 = runnerValue3;
	}

	public String getRunnerSystem() {
		return runnerSystem;
	}

	public void setRunnerSystem(String runnerSystem) {
		this.runnerSystem = runnerSystem;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
