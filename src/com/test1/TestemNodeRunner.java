package com.test1;

public class TestemNodeRunner {
	private Integer id;
	private String helperName;
	private String qunitFramework;
	private String mocha;
	private Integer mochaType;
	private boolean mochaCliVersion;
	private boolean nodeRunner;
	private String browserName;
	private String devMode;
	private String pipelineMode;
	private String launchers;
	private String srcFiles;
	private String srcFilesTolgnore;
	private String entityState;

	public TestemNodeRunner() {

	}

	public TestemNodeRunner(Integer id, String helperName, String qunitFramework, String mocha, Integer mochaType,
			boolean mochaCliVersion, boolean nodeRunner, String browserName, String devMode, String pipelineMode,
			String launchers, String srcFiles, String srcFilesTolgnore, String entityState) {
		super();
		this.id = id;
		this.helperName = helperName;
		this.qunitFramework = qunitFramework;
		this.mocha = mocha;
		this.mochaType = mochaType;
		this.mochaCliVersion = mochaCliVersion;
		this.nodeRunner = nodeRunner;
		this.browserName = browserName;
		this.devMode = devMode;
		this.pipelineMode = pipelineMode;
		this.launchers = launchers;
		this.srcFiles = srcFiles;
		this.srcFilesTolgnore = srcFilesTolgnore;
		this.entityState = entityState;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHelperName() {
		return helperName;
	}

	public void setHelperName(String helperName) {
		this.helperName = helperName;
	}

	public String getQunitFramework() {
		return qunitFramework;
	}

	public void setQunitFramework(String qunitFramework) {
		this.qunitFramework = qunitFramework;
	}

	public String getMocha() {
		return mocha;
	}

	public void setMocha(String mocha) {
		this.mocha = mocha;
	}

	public Integer getMochaType() {
		return mochaType;
	}

	public void setMochaType(Integer mochaType) {
		this.mochaType = mochaType;
	}

	public boolean isMochaCliVersion() {
		return mochaCliVersion;
	}

	public void setMochaCliVersion(boolean mochaCliVersion) {
		this.mochaCliVersion = mochaCliVersion;
	}

	public boolean isNodeRunner() {
		return nodeRunner;
	}

	public void setNodeRunner(boolean nodeRunner) {
		this.nodeRunner = nodeRunner;
	}

	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public String getDevMode() {
		return devMode;
	}

	public void setDevMode(String devMode) {
		this.devMode = devMode;
	}

	public String getPipelineMode() {
		return pipelineMode;
	}

	public void setPipelineMode(String pipelineMode) {
		this.pipelineMode = pipelineMode;
	}

	public String getLaunchers() {
		return launchers;
	}

	public void setLaunchers(String launchers) {
		this.launchers = launchers;
	}

	public String getSrcFiles() {
		return srcFiles;
	}

	public void setSrcFiles(String srcFiles) {
		this.srcFiles = srcFiles;
	}

	public String getSrcFilesTolgnore() {
		return srcFilesTolgnore;
	}

	public void setSrcFilesTolgnore(String srcFilesTolgnore) {
		this.srcFilesTolgnore = srcFilesTolgnore;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
