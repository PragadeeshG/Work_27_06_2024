package com.test1;

public class QunitSetData {
	private Integer uniSetIndicator;
	private String config;
	private String appMode;
	private String progOptions;
	private String programAction;
	private boolean programDesc;
	private boolean options;
	private boolean protoEnv;
	private String commanders;
	private String requires;
	private Integer processId;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public QunitSetData() {

	}

	public QunitSetData(Integer uniSetIndicator, String config, String appMode, String progOptions,
			String programAction, boolean programDesc, boolean options, boolean protoEnv, String commanders,
			String requires, Integer processId, String creationDate, String modifiedDate, String entityState) {
		super();
		this.uniSetIndicator = uniSetIndicator;
		this.config = config;
		this.appMode = appMode;
		this.progOptions = progOptions;
		this.programAction = programAction;
		this.programDesc = programDesc;
		this.options = options;
		this.protoEnv = protoEnv;
		this.commanders = commanders;
		this.requires = requires;
		this.processId = processId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getUniSetIndicator() {
		return uniSetIndicator;
	}

	public void setUniSetIndicator(Integer uniSetIndicator) {
		this.uniSetIndicator = uniSetIndicator;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getAppMode() {
		return appMode;
	}

	public void setAppMode(String appMode) {
		this.appMode = appMode;
	}

	public String getProgOptions() {
		return progOptions;
	}

	public void setProgOptions(String progOptions) {
		this.progOptions = progOptions;
	}

	public String getProgramAction() {
		return programAction;
	}

	public void setProgramAction(String programAction) {
		this.programAction = programAction;
	}

	public boolean isProgramDesc() {
		return programDesc;
	}

	public void setProgramDesc(boolean programDesc) {
		this.programDesc = programDesc;
	}

	public boolean isOptions() {
		return options;
	}

	public void setOptions(boolean options) {
		this.options = options;
	}

	public boolean isProtoEnv() {
		return protoEnv;
	}

	public void setProtoEnv(boolean protoEnv) {
		this.protoEnv = protoEnv;
	}

	public String getCommanders() {
		return commanders;
	}

	public void setCommanders(String commanders) {
		this.commanders = commanders;
	}

	public String getRequires() {
		return requires;
	}

	public void setRequires(String requires) {
		this.requires = requires;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
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
