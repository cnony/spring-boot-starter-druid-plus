package com.alibaba.druid.spring.boot.ds;

public class DynamicDataSourceSetting {

	/** driverClassName: 连接数据库的驱动名称，如果没有设置Druid会自动根据数据库连接地址进行匹配 */
	protected String driverClassName;
	/**
	 * 配置这个属性的意义在于，如果存在多个数据源，监控的时候可以通过名字来区分开来。如果没有配置，将会生成一个名字，格式是：”DataSource-” +
	 * System.identityHashCode(this)
	 */
	protected String name;
	/** jdbcUrl: 连接数据库的url，不同数据库不一样 */
	protected String url;
	/** username: 连接数据库的用户名 */
	protected String username;
	/** password: 连接数据库的密码 */
	protected String password;

	public DynamicDataSourceSetting(String name, String url, String username, String password) {
		this.name = name;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public DynamicDataSourceSetting(String driverClassName, String name, String url, String username, String password) {
		this.driverClassName = driverClassName;
		this.name = name;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
